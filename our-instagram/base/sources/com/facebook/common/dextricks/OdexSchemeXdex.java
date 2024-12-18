package com.facebook.common.dextricks;

import X.C0H1;
import android.content.Context;
import android.text.TextUtils;
import com.facebook.common.dextricks.DexManifest;
import com.facebook.common.dextricks.DexOptRunner;
import com.facebook.common.dextricks.DexStore;
import com.facebook.common.dextricks.OdexScheme;
import com.facebook.common.dextricks.OdexSchemeTurbo;
import com.facebook.common.dextricks.Prio;
import com.facebook.common.dextricks.ReentrantLockFile;
import com.facebook.forker.Fd;
import com.facebook.forker.Process;
import com.facebook.forker.ProcessBuilder;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.channels.FileChannel;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class OdexSchemeXdex extends OdexSchemeTurbo {
    public final DexManifest.Dex[] mDexes;

    /* loaded from: classes.dex */
    public final class DexToOptimize implements Closeable {
        public final int dexNr;
        public final ReentrantLockFile.Lock signalLock;

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            this.signalLock.close();
        }

        public String toString() {
            return String.format("DexToOptimize(dexNr=%d)", Integer.valueOf(this.dexNr));
        }

        public DexToOptimize(int i, ReentrantLockFile.Lock lock) {
            this.dexNr = i;
            this.signalLock = lock;
        }
    }

    /* loaded from: classes.dex */
    public final class PoliteDexOptRunner extends DexOptRunner {
        public final byte[] mBuffer;
        public final DexStore.OptimizationSession mOptimizationSession;

        @Override // com.facebook.common.dextricks.DexOptRunner
        public void addDexOptOptions(ProcessBuilder processBuilder) {
            processBuilder.addArgument("-n");
            OdexSchemeTurbo.addConfiguredDexOptOptions(this.mOptimizationSession.dexStoreConfig, processBuilder);
        }

        @Override // com.facebook.common.dextricks.DexOptRunner
        public Process startSubprocess(ProcessBuilder processBuilder) {
            Prio.With with = new Prio.With();
            try {
                Process create = processBuilder.create();
                with.close();
                return create;
            } catch (Throwable th) {
                try {
                    with.close();
                    throw th;
                } catch (Throwable th2) {
                    Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th, th2);
                    throw th;
                }
            }
        }

        @Override // com.facebook.common.dextricks.DexOptRunner
        public void waitForDexOpt(Process process, int i) {
            this.mOptimizationSession.waitForAndManageProcess(process, null);
        }

        public PoliteDexOptRunner(DexStore.OptimizationSession optimizationSession, File file) {
            super(file);
            this.mBuffer = new byte[Constants.LOAD_RESULT_DEX2OAT_TRY_PERIODIC_PGO_COMP_ATTEMPTED];
            this.mOptimizationSession = optimizationSession;
        }

        @Override // com.facebook.common.dextricks.DexOptRunner
        public int copyDexToOdex(InputStream inputStream, int i, RandomAccessFile randomAccessFile) {
            int fileno = Fd.fileno(randomAccessFile.getFD());
            Prio.With with = new Prio.With();
            int i2 = 0;
            while (true) {
                try {
                    byte[] bArr = this.mBuffer;
                    int A02 = C0H1.A02(inputStream, bArr, bArr.length);
                    if (A02 != -1) {
                        randomAccessFile.write(this.mBuffer, 0, A02);
                        i2 += A02;
                        this.mOptimizationSession.checkShouldStop();
                        DalvikInternals.fdatasync(fileno, -1);
                        Fs.tryDiscardPageCache(fileno);
                    } else {
                        with.close();
                        return i2;
                    }
                } catch (Throwable th) {
                    try {
                        with.close();
                        throw th;
                    } catch (Throwable th2) {
                        Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th, th2);
                        throw th;
                    }
                }
            }
        }
    }

    public OdexSchemeXdex(DexManifest.Dex[] dexArr) {
        super(1, dexArr);
        this.mDexes = dexArr;
    }

    private DexToOptimize findDexToOptimize(DexStore dexStore, long j) {
        for (int i = 0; i < this.mDexes.length; i++) {
            if (((16 << i) & j) == 0) {
                ReentrantLockFile open = ReentrantLockFile.open(new File(dexStore.root, this.expectedFiles[i * 2]));
                try {
                    ReentrantLockFile.Lock tryAcquire = open.tryAcquire(0);
                    open.close();
                    if (tryAcquire != null) {
                        try {
                            return new DexToOptimize(i, tryAcquire);
                        } catch (Throwable th) {
                            tryAcquire.close();
                            throw th;
                        }
                    }
                } catch (Throwable th2) {
                    try {
                        open.close();
                        throw th2;
                    } catch (Throwable th3) {
                        Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th2, th3);
                        throw th2;
                    }
                }
            }
        }
        return null;
    }

    @Override // com.facebook.common.dextricks.OdexSchemeTurbo, com.facebook.common.dextricks.OdexScheme
    public String getSchemeName() {
        return "OdexSchemeXdex";
    }

    private boolean isFileCorruptionException(DexOptRunner.DexOptException dexOptException) {
        String str;
        if (dexOptException.status != 1 || (str = dexOptException.errout) == null) {
            return false;
        }
        int indexOf = str.indexOf("E/dalvikvm: ERROR: bad checksum");
        if (indexOf != 0 && (indexOf <= 0 || str.charAt(indexOf - 1) != '\n')) {
            return false;
        }
        return true;
    }

    private PartialInputStream openDexInsideOdex(FileInputStream fileInputStream) {
        ByteBuffer allocate = ByteBuffer.allocate(8);
        FileChannel channel = fileInputStream.getChannel();
        channel.position(8L);
        allocate.order(ByteOrder.nativeOrder());
        if (channel.read(allocate) == 8) {
            boolean z = false;
            allocate.position(0);
            int i = allocate.getInt();
            int i2 = allocate.getInt();
            Mlog.safeFmt("dexOffset:%s dexLength:%s", Integer.valueOf(i), Integer.valueOf(i2));
            boolean z2 = false;
            if (i <= 0) {
                z2 = true;
            }
            if (i2 <= 0) {
                z = true;
            }
            if (!(z | z2)) {
                channel.position(i);
                return new PartialInputStream(fileInputStream, i2);
            }
            throw new IllegalArgumentException("invalid odex file");
        }
        throw new IllegalArgumentException("invalid odex file");
    }

    private void optimize1(DexStore dexStore, File file, DexStore.OptimizationSession optimizationSession, DexStore.OptimizationSession.Job job, DexOptRunner dexOptRunner, DexToOptimize dexToOptimize, File[] fileArr, byte[] bArr) {
        job.startOptimizing();
        String[] strArr = this.expectedFiles;
        int i = dexToOptimize.dexNr * 2;
        String str = strArr[i];
        String str2 = strArr[i + 1];
        File file2 = new File(file, str2);
        File file3 = new File(dexStore.root, str);
        File file4 = new File(dexStore.root, str2);
        Mlog.safeFmt("[opt] started optimizing %s -> %s", file3, file4);
        int length = fileArr.length;
        int length2 = ((length / 2) + (this.expectedFiles.length / 2)) - 1;
        String[] strArr2 = new String[length2];
        int i2 = 0;
        int i3 = 0;
        while (i2 < length) {
            strArr2[i3] = fileArr[i2].getPath();
            i2 += 2;
            i3++;
        }
        int i4 = 0;
        while (true) {
            String[] strArr3 = this.expectedFiles;
            if (i4 >= strArr3.length) {
                break;
            }
            if (i4 / 2 != dexToOptimize.dexNr) {
                strArr2[i3] = new File(dexStore.root, strArr3[i4]).getPath();
                i3++;
            }
            i4 += 2;
        }
        boolean z = false;
        if (i3 == length2) {
            z = true;
        }
        Mlog.assertThat(z, "accounted for all dex files", new Object[0]);
        FileInputStream fileInputStream = new FileInputStream(file4);
        try {
            PartialInputStream openDexInsideOdex = openDexInsideOdex(fileInputStream);
            try {
                int i5 = openDexInsideOdex.mBytesToRead - openDexInsideOdex.mBytesRead;
                if (i5 <= 1) {
                    i5 = -1;
                }
                Mlog.safeFmt("[opt] size hint for %s: %s", file4, Integer.valueOf(i5));
                RandomAccessFile randomAccessFile = new RandomAccessFile(file2, "rw");
                try {
                    try {
                        dexOptRunner.run(openDexInsideOdex, i5, str, randomAccessFile, "xdex", strArr2);
                        int fileno = Fd.fileno(randomAccessFile.getFD());
                        DalvikInternals.replaceOdexDepBlock(fileno, bArr);
                        DalvikInternals.fsync(fileno, optimizationSession.config.prio.ioPriority);
                        Fs.tryDiscardPageCache(fileno);
                        randomAccessFile.close();
                        openDexInsideOdex.close();
                        fileInputStream.close();
                        long startCommitting = job.startCommitting(0L) | (16 << dexToOptimize.dexNr);
                        Mlog.safeFmt("[opt] started commit", new Object[0]);
                        Fs.renameOrThrow(file2, file4);
                        job.finishCommit(startCommitting);
                        Mlog.safeFmt("[opt] finished commit", new Object[0]);
                    } finally {
                    }
                } catch (Throwable th) {
                    Fs.deleteRecursive(file2);
                    throw th;
                }
            } finally {
            }
        } catch (Throwable th2) {
            try {
                fileInputStream.close();
                throw th2;
            } finally {
                Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th2, th);
            }
        }
    }

    @Override // com.facebook.common.dextricks.OdexScheme
    public OdexScheme.NeedOptimizationState needOptimization(long j, DexStore.Config config, DexStore.OptimizationHistoryLog optimizationHistoryLog) {
        boolean z = true;
        long length = (1 << this.mDexes.length) - 1;
        long j2 = j >> 4;
        Mlog.safeFmt("expectedDexBits:0x%08x actualDexBits:0x%08x", Long.valueOf(length), Long.valueOf(j2));
        if (length == j2) {
            z = false;
        }
        return OdexScheme.NeedOptimizationState.shouldOptimize(z);
    }

    @Override // com.facebook.common.dextricks.OdexScheme
    public void optimize(Context context, DexStore dexStore, DexStore.OptimizationSession optimizationSession) {
        DexOptRunner turboDexOptRunner;
        File[] dependencyOdexFiles = dexStore.getDependencyOdexFiles();
        byte[] readOdexDepBlock = DalvikInternals.readOdexDepBlock(dexStore.getOdexCachePath());
        DexStore.TmpDir makeTemporaryDirectory = dexStore.makeTemporaryDirectory("dexopt");
        try {
            Mlog.safeFmt("[opt] opened tmpDir %s", makeTemporaryDirectory.directory);
            if ((optimizationSession.config.flags & 1) != 0) {
                turboDexOptRunner = new PoliteDexOptRunner(optimizationSession, makeTemporaryDirectory.directory);
            } else {
                turboDexOptRunner = new OdexSchemeTurbo.TurboDexOptRunner(optimizationSession.dexStoreConfig, makeTemporaryDirectory.directory);
            }
            boolean z = false;
            while (true) {
                Mlog.safeFmt("[opt] starting optimization pass; creating job", new Object[0]);
                DexStore.OptimizationSession.Job job = new DexStore.OptimizationSession.Job();
                try {
                    Mlog.safeFmt("[opt] opened job", new Object[0]);
                    if (!z) {
                        prepareTmpDirForXdex(dependencyOdexFiles, dexStore, makeTemporaryDirectory.directory);
                    }
                    DexToOptimize findDexToOptimize = findDexToOptimize(dexStore, job.initialStatus);
                    Mlog.safeFmt("[opt] dto %s", findDexToOptimize);
                    if (findDexToOptimize != null) {
                        try {
                            try {
                                optimize1(dexStore, makeTemporaryDirectory.directory, optimizationSession, job, turboDexOptRunner, findDexToOptimize, dependencyOdexFiles, readOdexDepBlock);
                            } finally {
                            }
                        } catch (DexOptRunner.DexOptException e) {
                            if (!Fs.isKernelPageCacheFlushIsBroken && isFileCorruptionException(e)) {
                                Mlog.w("detected odex file corruption: trying again with kernel workaround", new Object[0]);
                                Fs.isKernelPageCacheFlushIsBroken = true;
                            } else {
                                throw e;
                            }
                        }
                    }
                    job.close();
                    if (findDexToOptimize != null) {
                        z = true;
                    } else {
                        turboDexOptRunner.cleanup();
                        Mlog.safeFmt("[opt] optimization complete", new Object[0]);
                        makeTemporaryDirectory.close();
                        return;
                    }
                } finally {
                }
            }
            throw e;
        } catch (Throwable th) {
            try {
                makeTemporaryDirectory.close();
                throw th;
            } finally {
                Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th, th);
            }
        }
    }

    private void makeFakeCacheSymlink(File file, File file2, File file3) {
        String str;
        if (file2.exists()) {
            if (file3.exists()) {
                if (file2.getPath().endsWith(".jar")) {
                    str = "classes.dex";
                } else {
                    str = null;
                }
                File dexOptGenerateCacheFileName = Fs.dexOptGenerateCacheFileName(file, file2, str);
                Mlog.safeFmt("[opt] symlink %s -> %s", dexOptGenerateCacheFileName, file3);
                Fs.symlink(file3, dexOptGenerateCacheFileName);
                return;
            }
            StringBuilder sb = new StringBuilder();
            sb.append("expected file to exist: ");
            sb.append(file3);
            throw new IllegalStateException(sb.toString());
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("expected file to exist: ");
        sb2.append(file2);
        throw new IllegalStateException(sb2.toString());
    }

    private void prepareTmpDirForXdex(File[] fileArr, DexStore dexStore, File file) {
        int i;
        String str;
        File findSystemDalvikCache = Fs.findSystemDalvikCache();
        File file2 = new File(file, "dalvik-cache");
        Fs.mkdirOrThrow(file2);
        TextUtils.SimpleStringSplitter simpleStringSplitter = new TextUtils.SimpleStringSplitter(':');
        simpleStringSplitter.setString(System.getenv("BOOTCLASSPATH"));
        Iterator<String> it = simpleStringSplitter.iterator();
        while (true) {
            i = 0;
            if (!it.hasNext()) {
                break;
            }
            String next = it.next();
            if (next.length() != 0) {
                if (next.endsWith(".jar")) {
                    str = "classes.dex";
                } else {
                    str = null;
                }
                File file3 = new File(next);
                File dexOptGenerateCacheFileName = Fs.dexOptGenerateCacheFileName(file2, file3, str);
                File dexOptGenerateCacheFileName2 = Fs.dexOptGenerateCacheFileName(findSystemDalvikCache, file3, str);
                Mlog.safeFmt("[opt] symlink %s -> %s", dexOptGenerateCacheFileName, dexOptGenerateCacheFileName2);
                Fs.symlink(dexOptGenerateCacheFileName2, dexOptGenerateCacheFileName);
            }
        }
        for (int i2 = 0; i2 < fileArr.length; i2 += 2) {
            makeFakeCacheSymlink(file2, fileArr[i2], fileArr[i2 + 1]);
        }
        while (true) {
            String[] strArr = this.expectedFiles;
            if (i < strArr.length) {
                makeFakeCacheSymlink(file2, new File(dexStore.root, strArr[i]), new File(dexStore.root, this.expectedFiles[i + 1]));
                i += 2;
            } else {
                return;
            }
        }
    }
}
