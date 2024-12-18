package com.facebook.common.dextricks;

import X.AnonymousClass001;
import X.C0H1;
import com.facebook.common.dextricks.DexManifest;
import com.facebook.common.dextricks.DexStore;
import com.facebook.common.dextricks.OdexScheme;
import com.facebook.forker.ProcessBuilder;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.PrintStream;
import java.io.RandomAccessFile;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

/* loaded from: classes.dex */
public class OdexSchemeTurbo extends OdexScheme {

    /* loaded from: classes.dex */
    public final class TurboCompiler extends OdexScheme.Compiler {
        public final TurboDexOptRunner mDexOptRunner;
        public final DexStore mDexStore;
        public final File mDummyZip;
        public final int mFlags;
        public final DexStore.TmpDir mTmpDir;

        @Override // com.facebook.common.dextricks.OdexScheme.Compiler, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            this.mDexOptRunner.cleanup();
            this.mTmpDir.close();
        }

        @Override // com.facebook.common.dextricks.OdexScheme.Compiler
        public void compile(InputDex inputDex) {
            String makeDexName = OdexSchemeTurbo.makeDexName(inputDex.dex);
            String makeOdexName = OdexSchemeTurbo.makeOdexName(makeDexName);
            File file = new File(this.mDexStore.root, makeDexName);
            File file2 = new File(this.mDexStore.root, makeOdexName);
            if ((this.mFlags & 1) != 0 && file.exists() && file2.exists()) {
                return;
            }
            File file3 = new File(this.mTmpDir.directory, makeOdexName);
            InputStream dexContents = inputDex.getDexContents();
            try {
                int sizeHint = inputDex.getSizeHint(dexContents);
                Mlog.safeFmt("size hint for %s: %s", inputDex, Integer.valueOf(sizeHint));
                RandomAccessFile randomAccessFile = new RandomAccessFile(file3, "rw");
                try {
                    try {
                        this.mDexOptRunner.run(dexContents, sizeHint, makeDexName, randomAccessFile, "quick", null);
                        randomAccessFile.close();
                        if (dexContents != null) {
                            dexContents.close();
                        }
                        Fs.linkAtomic(this.mDummyZip, new File(this.mDexStore.root, makeDexName));
                        Fs.renameOrThrow(file3, new File(this.mDexStore.root, makeOdexName));
                    } catch (InterruptedException unused) {
                        throw new AssertionError();
                    }
                } finally {
                }
            } catch (Throwable th) {
                if (dexContents != null) {
                    try {
                        dexContents.close();
                        throw th;
                    } catch (Throwable th2) {
                        Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th, th2);
                        throw th;
                    }
                }
                throw th;
            }
        }

        public TurboCompiler(DexStore dexStore, int i) {
            this.mDexOptRunner = new TurboDexOptRunner(dexStore.root);
            this.mDexStore = dexStore;
            this.mFlags = i;
            DexStore.TmpDir makeTemporaryDirectory = dexStore.makeTemporaryDirectory("turbo-compiler");
            this.mTmpDir = makeTemporaryDirectory;
            try {
                File file = new File(makeTemporaryDirectory.directory, "dummy.zip");
                this.mDummyZip = file;
                OdexSchemeTurbo.makeDummyZip(file);
            } catch (Throwable th) {
                Fs.safeClose(this.mTmpDir);
                throw th;
            }
        }
    }

    /* loaded from: classes.dex */
    public final class TurboDexOptRunner extends DexOptRunner {
        public final byte[] mBuffer;
        public final DexStore.Config mDsConfig;

        @Override // com.facebook.common.dextricks.DexOptRunner
        public void addDexOptOptions(ProcessBuilder processBuilder) {
            DexStore.Config config = this.mDsConfig;
            if (config != null) {
                OdexSchemeTurbo.addConfiguredDexOptOptions(config, processBuilder);
            }
        }

        @Override // com.facebook.common.dextricks.DexOptRunner
        public int copyDexToOdex(InputStream inputStream, int i, RandomAccessFile randomAccessFile) {
            byte[] bArr = this.mBuffer;
            int i2 = 0;
            do {
                int A02 = C0H1.A02(inputStream, bArr, Integer.MAX_VALUE - i2);
                if (A02 == -1) {
                    break;
                }
                randomAccessFile.write(bArr, 0, A02);
                i2 += A02;
            } while (i2 < Integer.MAX_VALUE);
            return i2;
        }

        public TurboDexOptRunner(File file) {
            super(file);
            this.mBuffer = new byte[Constants.LOAD_RESULT_PGO_ATTEMPTED];
            this.mDsConfig = null;
        }

        public TurboDexOptRunner(DexStore.Config config, File file) {
            super(file);
            this.mBuffer = new byte[Constants.LOAD_RESULT_PGO_ATTEMPTED];
            this.mDsConfig = config;
        }
    }

    public static String[] makeExpectedFileList(DexManifest.Dex[] dexArr) {
        int length = dexArr.length;
        String[] strArr = new String[length * 2];
        for (int i = 0; i < length; i++) {
            String makeDexName = makeDexName(dexArr[i]);
            int i2 = i * 2;
            strArr[i2] = makeDexName;
            strArr[i2 + 1] = makeOdexName(makeDexName);
        }
        return strArr;
    }

    @Override // com.facebook.common.dextricks.OdexScheme
    public final void configureClassLoader(File file, ClassLoaderConfiguration classLoaderConfiguration) {
        int i = 0;
        while (true) {
            String[] strArr = this.expectedFiles;
            if (i < strArr.length) {
                classLoaderConfiguration.addDex(new File(file, strArr[i]), new File(file, this.expectedFiles[i + 1]));
                i += 2;
            } else {
                return;
            }
        }
    }

    @Override // com.facebook.common.dextricks.OdexScheme
    public String getSchemeName() {
        return "OdexSchemeTurbo";
    }

    public OdexSchemeTurbo(DexManifest.Dex[] dexArr) {
        this(8, dexArr);
    }

    public static void addConfiguredDexOptOptions(DexStore.Config config, ProcessBuilder processBuilder) {
        String str;
        String str2;
        String str3;
        byte b = config.dalvikVerify;
        if (b != 0) {
            if (b != 1) {
                if (b != 2) {
                    if (b != 3) {
                        Mlog.w("ignoring unknown Dalvik verify value %s in config file", Byte.valueOf(b));
                    } else {
                        Mlog.safeFmt("using DALVIK_VERIFY_ALL as requested in config file", new Object[0]);
                        str3 = "-Va";
                    }
                } else {
                    Mlog.safeFmt("using DALVIK_VERIFY_REMOTE as requested in config file", new Object[0]);
                    str3 = "-Vr";
                }
            } else {
                Mlog.safeFmt("using DALVIK_VERIFY_NONE as requested in config file", new Object[0]);
                str3 = "-Vn";
            }
            processBuilder.addArgument(str3);
        }
        byte b2 = config.dalvikOptimize;
        if (b2 != 0) {
            if (b2 != 1) {
                if (b2 != 2) {
                    if (b2 != 3) {
                        if (b2 != 4) {
                            Mlog.w("ignoring unknown Dalvik optimize value %s in config file", Byte.valueOf(b2));
                        } else {
                            Mlog.safeFmt("using DALVIK_OPT_FULL as requested in config file", new Object[0]);
                            str2 = "-Of";
                        }
                    } else {
                        Mlog.safeFmt("using DALVIK_OPT_ALL as requested in config file", new Object[0]);
                        str2 = "-Oa";
                    }
                } else {
                    Mlog.safeFmt("using DALVIK_OPT_VERIFIED as requested in config file", new Object[0]);
                    str2 = "-Ov";
                }
            } else {
                Mlog.safeFmt("using DALVIK_OPT_NONE as requested in config file", new Object[0]);
                str2 = "-On";
            }
            processBuilder.addArgument(str2);
        }
        byte b3 = config.dalvikRegisterMaps;
        if (b3 != 0) {
            if (b3 != 1) {
                if (b3 != 2) {
                    Mlog.w("ignoring unknown Dalvik register map value %s in config file", Byte.valueOf(b3));
                    return;
                }
                str = "-Ry";
            } else {
                str = "-Rn";
            }
            processBuilder.addArgument(str);
        }
    }

    public static void makeDummyZip(File file) {
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        try {
            ZipOutputStream zipOutputStream = new ZipOutputStream(fileOutputStream);
            try {
                zipOutputStream.putNextEntry(new ZipEntry("META-INF/MANIFEST.MF"));
                PrintStream printStream = new PrintStream(zipOutputStream);
                try {
                    printStream.println("Manifest-Version: 1.0");
                    printStream.println("Created-By: OdexSchemeTurbo");
                    printStream.flush();
                    printStream.close();
                    printStream.close();
                    zipOutputStream.close();
                    fileOutputStream.close();
                } finally {
                }
            } finally {
            }
        } catch (Throwable th) {
            try {
                fileOutputStream.close();
                throw th;
            } finally {
                Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th, th);
            }
        }
    }

    @Override // com.facebook.common.dextricks.OdexScheme
    public final OdexScheme.Compiler makeCompiler(DexStore dexStore, int i) {
        return new TurboCompiler(dexStore, i);
    }

    public static String makeDexName(DexManifest.Dex dex) {
        return AnonymousClass001.A0g("prog-", dex.hash, ".dex.jar");
    }

    public static String makeOdexName(String str) {
        return AnonymousClass001.A0R(Fs.stripLastExtension(str), DexManifest.ODEX_EXT);
    }

    public OdexSchemeTurbo(int i, DexManifest.Dex[] dexArr) {
        super(i, makeExpectedFileList(dexArr));
    }
}
