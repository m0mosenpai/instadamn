package com.facebook.common.dextricks;

import X.AnonymousClass001;
import X.C0H1;
import android.os.Build;
import com.facebook.common.dextricks.DexManifest;
import com.facebook.common.dextricks.DexStore;
import com.facebook.common.dextricks.OdexScheme;
import java.io.File;
import java.io.InputStream;
import java.io.RandomAccessFile;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public class OdexSchemeArtTurbo extends OdexScheme {
    public static final String OREO_ODEX_DIR = "oat";
    public static boolean sAttemptedArtHackInstallation;

    /* loaded from: classes.dex */
    public final class TurboArtCompiler extends OdexScheme.Compiler {
        public final DexStore mDexStore;
        public final int mFlags;
        public final DexStore.TmpDir mTmpDir;

        @Override // com.facebook.common.dextricks.OdexScheme.Compiler, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            this.mTmpDir.close();
        }

        @Override // com.facebook.common.dextricks.OdexScheme.Compiler
        public void compile(InputDex inputDex) {
            String makeDexName = inputDex.dex.makeDexName();
            File file = new File(this.mDexStore.root, makeDexName);
            if ((this.mFlags & 1) != 0 && file.exists()) {
                return;
            }
            File file2 = new File(this.mTmpDir.directory, makeDexName);
            InputStream dexContents = inputDex.getDexContents();
            try {
                Mlog.safeFmt("size hint for %s: %s", inputDex, Integer.valueOf(inputDex.getSizeHint(dexContents)));
                RandomAccessFile randomAccessFile = new RandomAccessFile(file2, "rw");
                try {
                    byte[] bArr = new byte[Constants.LOAD_RESULT_PGO];
                    int i = 0;
                    do {
                        int A02 = C0H1.A02(dexContents, bArr, Integer.MAX_VALUE - i);
                        if (A02 == -1) {
                            break;
                        }
                        randomAccessFile.write(bArr, 0, A02);
                        i += A02;
                    } while (i < Integer.MAX_VALUE);
                    randomAccessFile.close();
                    if (dexContents != null) {
                        dexContents.close();
                    }
                    Fs.renameOrThrow(file2, new File(this.mDexStore.root, makeDexName));
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

        public TurboArtCompiler(DexStore dexStore, int i) {
            this.mDexStore = dexStore;
            this.mFlags = i;
            this.mTmpDir = dexStore.makeTemporaryDirectory("turbo-art-compiler");
        }
    }

    public OdexSchemeArtTurbo(DexManifest.Dex[] dexArr) {
        super(8, makeExpectedFileListFrom(makeExpectedFileInfoList(dexArr, null)));
    }

    public static List makeExpectedFileInfoList(DexManifest.Dex[] dexArr, String str) {
        int length = dexArr.length;
        if (str != null) {
            length++;
        }
        ArrayList arrayList = new ArrayList(length);
        for (DexManifest.Dex dex : dexArr) {
            arrayList.add(new ExpectedFileInfo(dex));
        }
        if (str != null) {
            arrayList.add(new ExpectedFileInfo(str));
        }
        return arrayList;
    }

    @Override // com.facebook.common.dextricks.OdexScheme
    public String getSchemeName() {
        return "OdexSchemeArtTurbo";
    }

    public static String getArch() {
        String str = Build.SUPPORTED_32_BIT_ABIS[0];
        if (str.equals("x86")) {
            return "x86";
        }
        if (str.equals("armeabi-v7a")) {
            return "arm";
        }
        throw new RuntimeException(AnonymousClass001.A0R("Unknown ABI ", str));
    }

    public static String[] makeExpectedFileListFrom(List list) {
        if (list == null) {
            return null;
        }
        int size = list.size();
        String[] strArr = new String[size];
        for (int i = 0; i < size; i++) {
            strArr[i] = ((ExpectedFileInfo) list.get(i)).toExpectedFileString();
        }
        return strArr;
    }

    @Override // com.facebook.common.dextricks.OdexScheme
    public final OdexScheme.Compiler makeCompiler(DexStore dexStore, int i) {
        return new TurboArtCompiler(dexStore, i);
    }

    public static String getOreoOdexOutputDirectory(File file, boolean z) {
        File file2 = new File(file, AnonymousClass001.A0R("oat/", getArch()));
        if (z) {
            Fs.mkdirOrThrow(file2);
        }
        return AnonymousClass001.A0R(file2.getPath(), "/");
    }

    public static String[] makeExpectedFileList(DexManifest.Dex[] dexArr, String str) {
        return makeExpectedFileListFrom(makeExpectedFileInfoList(dexArr, str));
    }

    @Override // com.facebook.common.dextricks.OdexScheme
    public void configureClassLoader(File file, ClassLoaderConfiguration classLoaderConfiguration) {
        int i = Build.VERSION.SDK_INT;
        int i2 = 0;
        if (i < 29) {
            i2 = 6;
        }
        if (!sAttemptedArtHackInstallation) {
            sAttemptedArtHackInstallation = true;
            try {
                int installArtHacks = DalvikInternals.installArtHacks(i2, i);
                if ((i2 & 2) != 0 && (installArtHacks & 2) == 0) {
                    DexTricksErrorReporter.reportSampledSoftError("OdexSchemeArtTurbo", AnonymousClass001.A0R("Could not install 0x", Integer.toHexString(2)), 100, null);
                }
            } catch (Exception e) {
                Mlog.w(e, "failed to install verifier-disabling ART hacks; continuing slowly", new Object[0]);
            }
        }
        int enabledThreadArtHacks = DalvikInternals.getEnabledThreadArtHacks();
        DalvikInternals.setEnabledThreadArtHacks(i2 | enabledThreadArtHacks);
        try {
            Mlog.safeFmt("enabled ART verifier hack (warning-level logs following are expected)", new Object[0]);
            int i3 = 0;
            while (true) {
                String[] strArr = this.expectedFiles;
                if (i3 < strArr.length) {
                    if (!strArr[i3].equals(OREO_ODEX_DIR)) {
                        classLoaderConfiguration.addDex(new File(file, strArr[i3]), true);
                    }
                    i3++;
                } else {
                    DalvikInternals.setEnabledThreadArtHacks(enabledThreadArtHacks);
                    Mlog.safeFmt("restored old ART hack mask", new Object[0]);
                    return;
                }
            }
        } catch (Throwable th) {
            DalvikInternals.setEnabledThreadArtHacks(enabledThreadArtHacks);
            Mlog.safeFmt("restored old ART hack mask", new Object[0]);
            throw th;
        }
    }

    public OdexSchemeArtTurbo(int i, String[] strArr) {
        super(i, strArr);
    }
}
