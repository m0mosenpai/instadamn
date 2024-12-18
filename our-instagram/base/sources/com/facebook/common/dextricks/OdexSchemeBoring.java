package com.facebook.common.dextricks;

import X.AnonymousClass001;
import android.os.Build;
import com.facebook.common.dextricks.DexManifest;
import com.facebook.common.dextricks.DexStore;
import com.facebook.common.dextricks.OdexScheme;
import dalvik.system.DexFile;
import java.io.File;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public final class OdexSchemeBoring extends OdexScheme {

    /* loaded from: classes.dex */
    public final class BoringCompiler extends OdexScheme.Compiler {
        public final DexStore mDexStore;
        public final int mFlags;
        public boolean mLowDiskSpace;
        public final Map mRenameTempToFinalOdexMap = new HashMap();
        public final DexStore.TmpDir mTmpDir;

        private void onLowDiskSpaceLikelyDetected() {
            this.mLowDiskSpace = true;
            for (File file : this.mRenameTempToFinalOdexMap.keySet()) {
                Mlog.safeFmt("Deleting odex file [success: %s]: %s", Boolean.valueOf(file.delete()), file.getAbsolutePath());
            }
            this.mRenameTempToFinalOdexMap.clear();
        }

        @Override // com.facebook.common.dextricks.OdexScheme.Compiler, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            this.mTmpDir.close();
        }

        @Override // com.facebook.common.dextricks.OdexScheme.Compiler
        public void compile(InputDex inputDex) {
            File file;
            String makeDexName = OdexSchemeBoring.makeDexName(inputDex.dex);
            String makeOdexName = OdexSchemeBoring.makeOdexName(makeDexName);
            File file2 = new File(this.mDexStore.root, makeDexName);
            File file3 = new File(this.mDexStore.root, makeOdexName);
            if ((this.mFlags & 1) != 0 && file2.exists() && file3.exists()) {
                return;
            }
            File file4 = new File(this.mTmpDir.directory, makeDexName);
            String str = null;
            if (!this.mLowDiskSpace) {
                file = new File(this.mTmpDir.directory, makeOdexName);
            } else {
                file = null;
            }
            inputDex.extract(file4);
            if (Build.VERSION.SDK_INT > 33) {
                file4.setWritable(false);
            }
            String absolutePath = file4.getAbsolutePath();
            if (file != null) {
                str = file.getAbsolutePath();
            }
            DexFile.loadDex(absolutePath, str, 0);
            Fs.renameOrThrow(file4, file2);
            if (file == null) {
                return;
            }
            if (file.exists()) {
                this.mRenameTempToFinalOdexMap.put(file, file3);
            } else {
                Mlog.w("Odex file does not exist (likely because dex2oat failed due to low disk space).\n Failing back to using dex file: %s\n Odex file: %s", file2, file.getAbsolutePath());
                onLowDiskSpaceLikelyDetected();
            }
        }

        @Override // com.facebook.common.dextricks.OdexScheme.Compiler
        public void performFinishActions() {
            for (Map.Entry entry : this.mRenameTempToFinalOdexMap.entrySet()) {
                Mlog.safeFmt("Copying odex file %s to %s", ((File) entry.getKey()).getAbsolutePath(), ((File) entry.getValue()).getAbsolutePath());
                Fs.renameOrThrow((File) entry.getKey(), (File) entry.getValue());
            }
        }

        public BoringCompiler(DexStore dexStore, int i) {
            this.mDexStore = dexStore;
            this.mFlags = i;
            this.mTmpDir = dexStore.makeTemporaryDirectory("boring-compiler");
            this.mLowDiskSpace = (i & 32) != 0;
        }
    }

    public static ExpectedFileInfo[] makeExpectedFileList(DexManifest.Dex[] dexArr) {
        int length = dexArr.length;
        ExpectedFileInfo[] expectedFileInfoArr = new ExpectedFileInfo[length * 2];
        for (int i = 0; i < length; i++) {
            DexManifest.Dex dex = dexArr[i];
            String makeDexName = makeDexName(dex);
            int i2 = i * 2;
            expectedFileInfoArr[i2] = new ExpectedFileInfo(dex, makeDexName);
            int i3 = i2 + 1;
            ExpectedFileInfo expectedFileInfo = new ExpectedFileInfo(makeOdexName(makeDexName));
            expectedFileInfo.mIsOptional = true;
            expectedFileInfoArr[i3] = expectedFileInfo;
        }
        return expectedFileInfoArr;
    }

    @Override // com.facebook.common.dextricks.OdexScheme
    public void configureClassLoader(File file, ClassLoaderConfiguration classLoaderConfiguration) {
        int i = 0;
        while (true) {
            String[] strArr = this.expectedFiles;
            if (i < strArr.length) {
                File file2 = new File(file, strArr[i + 1]);
                File file3 = file2;
                if (!file2.exists()) {
                    file3 = null;
                    Mlog.safeFmt("Odex %s does not exist. Skipping...", file2);
                }
                classLoaderConfiguration.addDex(new File(file, this.expectedFiles[i]), file3);
                i += 2;
            } else {
                return;
            }
        }
    }

    @Override // com.facebook.common.dextricks.OdexScheme
    public String getSchemeName() {
        return "OdexSchemeBoring";
    }

    public static String makeDexName(DexManifest.Dex dex) {
        String str = dex.assetName;
        boolean endsWith = str.endsWith(".dex.xz");
        String str2 = DexManifest.DEX_EXT;
        if (!endsWith && !str.endsWith(DexManifest.DEX_EXT)) {
            str2 = ".dex.jar";
        }
        return AnonymousClass001.A0g("prog-", dex.hash, str2);
    }

    @Override // com.facebook.common.dextricks.OdexScheme
    public OdexScheme.Compiler makeCompiler(DexStore dexStore, int i) {
        return new BoringCompiler(dexStore, i);
    }

    public OdexSchemeBoring(DexManifest.Dex[] dexArr) {
        super(8, makeExpectedFileList(dexArr));
    }

    public static String makeOdexName(String str) {
        return AnonymousClass001.A0R(Fs.stripLastExtension(str), DexManifest.ODEX_EXT);
    }
}
