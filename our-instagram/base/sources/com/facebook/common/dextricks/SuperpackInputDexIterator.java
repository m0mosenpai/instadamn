package com.facebook.common.dextricks;

import X.AnonymousClass001;
import X.C0eW;
import com.facebook.common.dextricks.DexManifest;
import com.facebook.quicklog.LightweightQuickPerformanceLogger;
import com.facebook.superpack.SuperpackArchive;
import com.facebook.superpack.SuperpackFile;
import com.facebook.superpack.SuperpackFileInputStream;
import com.facebook.xzdecoder.XzInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.concurrent.SynchronousQueue;

/* loaded from: classes.dex */
public final class SuperpackInputDexIterator extends InputDexIterator {
    public final C0eW mArchiveExtension;
    public final int[] mDexToArchiveMap;
    public final SynchronousQueue[] mFileQueues;
    public int mNextDexIndex;
    public boolean mShuttingDownFlag;
    public final SuperpackArchive mSuperpackArchive;
    public SuperpackFile mSuperpackFileToClose;
    public final Thread[] mThreads;

    /* loaded from: classes.dex */
    public final class Builder {
        public C0eW archiveExtension;
        public int[] dexToArchive;
        public DexManifest manifest;
        public LightweightQuickPerformanceLogger qplCollector;
        public ArrayList rawArchives;

        public Builder assignDexToArchive(int i, int i2) {
            if (i2 >= 0 && i2 < this.rawArchives.size()) {
                this.dexToArchive[i] = i2;
                return this;
            }
            throw new IndexOutOfBoundsException();
        }

        public SuperpackInputDexIterator build() {
            if (this.rawArchives.size() >= 1) {
                return new SuperpackInputDexIterator(this);
            }
            throw new IllegalStateException();
        }

        public Builder(DexManifest dexManifest, LightweightQuickPerformanceLogger lightweightQuickPerformanceLogger) {
            this.archiveExtension = C0eW.NONE;
            dexManifest.getClass();
            this.manifest = dexManifest;
            this.dexToArchive = new int[dexManifest.dexes.length];
            this.qplCollector = lightweightQuickPerformanceLogger;
            this.rawArchives = new ArrayList();
            this.archiveExtension = dexManifest.superpackExtension;
        }

        public Builder addRawArchive(InputStream inputStream) {
            inputStream.getClass();
            this.rawArchives.add(inputStream);
            return this;
        }
    }

    /* loaded from: classes.dex */
    public class UnpackingRunnable implements Runnable {
        public InputStream mInput;
        public SynchronousQueue mOutput;

        public UnpackingRunnable(InputStream inputStream, SynchronousQueue synchronousQueue) {
            this.mInput = inputStream;
            this.mOutput = synchronousQueue;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                SuperpackArchive superpackArchive = SuperpackInputDexIterator.this.getSuperpackArchive(this.mInput);
                try {
                    this.mInput.close();
                    while (superpackArchive.hasNext()) {
                        try {
                            this.mOutput.put(SuperpackInputDexIterator.this.getNextFileFromSpk(superpackArchive));
                        } finally {
                        }
                    }
                    superpackArchive.close();
                } finally {
                }
            } catch (IOException e) {
                throw new RuntimeException(e);
            } catch (InterruptedException e2) {
                if (!SuperpackInputDexIterator.this.mShuttingDownFlag) {
                    throw new RuntimeException(e2);
                }
            }
        }
    }

    public SuperpackInputDexIterator(Builder builder) {
        super(builder.manifest, builder.qplCollector);
        LightweightQuickPerformanceLogger lightweightQuickPerformanceLogger = this.mQplCollector;
        if (lightweightQuickPerformanceLogger != null) {
            lightweightQuickPerformanceLogger.markerStart(34603017);
        }
        this.mArchiveExtension = builder.archiveExtension;
        try {
            this.mShuttingDownFlag = false;
            this.mNextDexIndex = 0;
            this.mDexToArchiveMap = builder.dexToArchive;
            int size = builder.rawArchives.size() - 1;
            this.mThreads = new Thread[size];
            this.mFileQueues = new SynchronousQueue[size];
            int i = 0;
            while (i < size) {
                this.mFileQueues[i] = new SynchronousQueue();
                int i2 = i + 1;
                this.mThreads[i] = new Thread(new UnpackingRunnable((InputStream) builder.rawArchives.get(i2), this.mFileQueues[i]));
                this.mThreads[i].start();
                i = i2;
            }
            this.mSuperpackArchive = getSuperpackArchive((InputStream) builder.rawArchives.get(0));
        } catch (Throwable th) {
            LightweightQuickPerformanceLogger lightweightQuickPerformanceLogger2 = this.mQplCollector;
            if (lightweightQuickPerformanceLogger2 != null) {
                lightweightQuickPerformanceLogger2.markerEnd(34603017, (short) 2);
            }
            throw th;
        }
    }

    public static Builder builder(DexManifest dexManifest, LightweightQuickPerformanceLogger lightweightQuickPerformanceLogger) {
        return new Builder(dexManifest, lightweightQuickPerformanceLogger);
    }

    public static String getArchiveExtension(Builder builder) {
        C0eW c0eW = builder.manifest.superpackExtension;
        String str = SuperpackArchive.TAG;
        if (c0eW == C0eW.NONE) {
            return ".dex.spk.xz";
        }
        if (c0eW == C0eW.OB) {
            return ".dex.spo";
        }
        if (c0eW == C0eW.XZ) {
            return ".dex.spk.xz";
        }
        if (c0eW == C0eW.ZST) {
            return ".dex.spk.zst";
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Unknown Superpack Archive Extension ");
        sb.append(c0eW);
        throw new RuntimeException(sb.toString());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public SuperpackFile getNextFileFromSpk(SuperpackArchive superpackArchive) {
        LightweightQuickPerformanceLogger lightweightQuickPerformanceLogger = this.mQplCollector;
        if (lightweightQuickPerformanceLogger != null) {
            lightweightQuickPerformanceLogger.markerStart(34603016);
        }
        try {
            return superpackArchive.next();
        } finally {
            LightweightQuickPerformanceLogger lightweightQuickPerformanceLogger2 = this.mQplCollector;
            if (lightweightQuickPerformanceLogger2 != null) {
                lightweightQuickPerformanceLogger2.markerEnd(34603016, (short) 2);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public SuperpackArchive getSuperpackArchive(InputStream inputStream) {
        SuperpackArchive superpackArchive;
        LightweightQuickPerformanceLogger lightweightQuickPerformanceLogger = this.mQplCollector;
        if (lightweightQuickPerformanceLogger != null) {
            lightweightQuickPerformanceLogger.markerStart(34603015);
        }
        try {
            C0eW c0eW = this.mArchiveExtension;
            if (c0eW == C0eW.NONE) {
                XzInputStream xzInputStream = new XzInputStream(inputStream);
                try {
                    String str = SuperpackArchive.TAG;
                    xzInputStream.getClass();
                    superpackArchive = new SuperpackArchive(SuperpackArchive.readNative(xzInputStream, "spk", 0L), null);
                    xzInputStream.close();
                } catch (Throwable th) {
                    try {
                        xzInputStream.close();
                        throw th;
                    } catch (Throwable th2) {
                        Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th, th2);
                        throw th;
                    }
                }
            } else if (c0eW == C0eW.OB) {
                String str2 = SuperpackArchive.TAG;
                inputStream.getClass();
                superpackArchive = new SuperpackArchive(SuperpackArchive.readNative(inputStream, "spo", 0L), null);
            } else if (c0eW == C0eW.XZ) {
                String str3 = SuperpackArchive.TAG;
                inputStream.getClass();
                superpackArchive = new SuperpackArchive(SuperpackArchive.readNative(inputStream, "xz", 0L), null);
            } else if (c0eW == C0eW.ZST) {
                String str4 = SuperpackArchive.TAG;
                inputStream.getClass();
                superpackArchive = new SuperpackArchive(SuperpackArchive.readNative(inputStream, "zst", 0L), null);
            } else {
                StringBuilder sb = new StringBuilder();
                sb.append("Unknown Superpack Archive Extension ");
                sb.append(c0eW);
                throw new RuntimeException(sb.toString());
            }
            return superpackArchive;
        } finally {
            LightweightQuickPerformanceLogger lightweightQuickPerformanceLogger2 = this.mQplCollector;
            if (lightweightQuickPerformanceLogger2 != null) {
                lightweightQuickPerformanceLogger2.markerEnd(34603015, (short) 2);
            }
        }
    }

    private void maybeCloseLastSuperpackFile() {
        SuperpackFile superpackFile = this.mSuperpackFileToClose;
        if (superpackFile != null) {
            superpackFile.close();
            this.mSuperpackFileToClose = null;
        }
    }

    private SuperpackFile nextSuperpackFile() {
        int[] iArr = this.mDexToArchiveMap;
        int i = this.mNextDexIndex;
        this.mNextDexIndex = i + 1;
        int i2 = iArr[i];
        if (i2 == 0) {
            return getNextFileFromSpk(this.mSuperpackArchive);
        }
        try {
            return (SuperpackFile) this.mFileQueues[i2 - 1].take();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    private void setLastSuperpackFileToClose(SuperpackFile superpackFile) {
        if (this.mSuperpackFileToClose == null) {
            this.mSuperpackFileToClose = superpackFile;
            return;
        }
        throw new IllegalStateException();
    }

    @Override // com.facebook.common.dextricks.InputDexIterator, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        if (!this.mShuttingDownFlag) {
            this.mShuttingDownFlag = true;
            maybeCloseLastSuperpackFile();
            try {
                try {
                    this.mSuperpackArchive.close();
                    for (Thread thread : this.mThreads) {
                        thread.interrupt();
                        thread.join();
                    }
                    LightweightQuickPerformanceLogger lightweightQuickPerformanceLogger = this.mQplCollector;
                    if (lightweightQuickPerformanceLogger != null) {
                        lightweightQuickPerformanceLogger.markerEnd(34603017, (short) 2);
                    }
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            } finally {
            }
        } else {
            throw new IllegalStateException("Iterator already closed");
        }
    }

    @Override // com.facebook.common.dextricks.InputDexIterator
    public InputDex nextImpl(DexManifest.Dex dex) {
        String nameNative;
        String nameNative2;
        SuperpackFileInputStream superpackFileInputStream;
        maybeCloseLastSuperpackFile();
        SuperpackFile nextSuperpackFile = nextSuperpackFile();
        String str = dex.assetName;
        synchronized (nextSuperpackFile) {
            long j = nextSuperpackFile.mPtr;
            if (j != 0) {
                nameNative = SuperpackFile.getNameNative(j);
            } else {
                throw new IllegalStateException();
            }
        }
        if (str.equals(nameNative)) {
            setLastSuperpackFileToClose(nextSuperpackFile);
            synchronized (nextSuperpackFile) {
                if (nextSuperpackFile.mPtr != 0) {
                    superpackFileInputStream = new SuperpackFileInputStream(nextSuperpackFile);
                } else {
                    throw new IllegalStateException();
                }
            }
            return new InputDex(dex, superpackFileInputStream);
        }
        String str2 = dex.assetName;
        synchronized (nextSuperpackFile) {
            long j2 = nextSuperpackFile.mPtr;
            if (j2 != 0) {
                nameNative2 = SuperpackFile.getNameNative(j2);
            } else {
                throw new IllegalStateException();
            }
        }
        throw new RuntimeException(AnonymousClass001.A0u("Wrong dex, expected ", str2, ", got ", nameNative2));
    }
}
