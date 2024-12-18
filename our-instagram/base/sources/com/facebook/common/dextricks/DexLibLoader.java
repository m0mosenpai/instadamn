package com.facebook.common.dextricks;

import X.AnonymousClass001;
import X.C0GS;
import X.C0GU;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.os.Build;
import com.facebook.common.dextricks.DexStore;
import com.facebook.endtoend.EndToEnd;
import com.facebook.quicklog.LightweightQuickPerformanceLogger;
import dalvik.system.DexFile;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;

/* loaded from: classes.dex */
public final class DexLibLoader {
    public static final int LOAD_ALL_ASYNC_OPTIMIZATION = 4;
    public static final int LOAD_ALL_BETA_BUILD = 1;
    public static final int LOAD_ALL_INSTRUMENTATION_TEST = 16;
    public static final int LOAD_ALL_OPEN_ONLY = 2;
    public static final int LOAD_SECONDARY = 8;
    public static DexStore sMainDexStore;

    /* loaded from: classes.dex */
    public final class ApkResProvider extends ResProvider {
        public static final String SECONDARY_PROGRAM_DEX_JARS = "secondary-program-dex-jars";
        public ZipFile mApkZip;
        public final Context mContext;

        @Override // com.facebook.common.dextricks.ResProvider, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            Fs.safeClose(this.mApkZip);
        }

        @Override // com.facebook.common.dextricks.ResProvider
        public void markRootRelative() {
            if (this.mApkZip == null) {
                Context context = this.mContext;
                try {
                    context = context.createPackageContext(context.getPackageName(), 0);
                } catch (PackageManager.NameNotFoundException unused) {
                }
                this.mApkZip = new ZipFile(context.getApplicationInfo().sourceDir);
            }
        }

        @Override // com.facebook.common.dextricks.ResProvider
        public InputStream open(String str) {
            ZipFile zipFile = this.mApkZip;
            if (zipFile != null && !DexStoreUtils.SECONDARY_DEX_MANIFEST.equals(str)) {
                ZipEntry entry = zipFile.getEntry(str);
                if (entry != null) {
                    return this.mApkZip.getInputStream(entry);
                }
                throw new FileNotFoundException(AnonymousClass001.A0R("cannot find root-relative resource: ", str));
            }
            return this.mContext.getAssets().open(AnonymousClass001.A0R("secondary-program-dex-jars/", str));
        }

        public ApkResProvider(Context context) {
            this.mContext = context;
        }
    }

    /* loaded from: classes.dex */
    public final class ExoPackageResProvider extends ResProvider {
        public static final String EXOPACKAGE_DIR = "/data/local/tmp/exopackage";
        public final File mDirectory;

        @Override // com.facebook.common.dextricks.ResProvider
        public InputStream open(String str) {
            return new FileInputStream(new File(this.mDirectory, str));
        }

        public ExoPackageResProvider(Context context) {
            this.mDirectory = new File(AnonymousClass001.A0g("/data/local/tmp/exopackage/", context.getPackageName(), "/secondary-dex"));
        }
    }

    /* loaded from: classes.dex */
    public interface ResProviderShim {
        ResProvider install(ResProvider resProvider);
    }

    public static int loadAll(Context context) {
        return loadAll(context, 1, (LightweightQuickPerformanceLogger) null);
    }

    public static ResProvider obtainResProvider(Context context, boolean z) {
        return obtainResProvider(context, null, z);
    }

    public static ResProvider obtainResProviderInternal(Context context, boolean z) {
        ApkResProvider apkResProvider = new ApkResProvider(context);
        try {
            apkResProvider.open(DexStoreUtils.SECONDARY_DEX_MANIFEST).close();
            return apkResProvider;
        } catch (Resources.NotFoundException | FileNotFoundException unused) {
            if (z) {
                ExoPackageResProvider exoPackageResProvider = new ExoPackageResProvider(context);
                try {
                    exoPackageResProvider.open(DexStoreUtils.SECONDARY_DEX_MANIFEST).close();
                    Mlog.safeFmt("using exopackage", new Object[0]);
                    return exoPackageResProvider;
                } catch (FileNotFoundException unused2) {
                    Mlog.safeFmt("using exo res provider failed", new Object[0]);
                    return null;
                }
            }
            return null;
        }
    }

    /* loaded from: classes.dex */
    public class CanaryLoaderImpl implements Runnable {
        @Override // java.lang.Runnable
        public void run() {
            try {
                for (DexStore dexStoreListHead = DexStore.dexStoreListHead(); dexStoreListHead != null; dexStoreListHead = dexStoreListHead.next) {
                    DexManifest dexManifest = dexStoreListHead.mLoadedManifest;
                    if (dexManifest != null) {
                        for (int i = 0; i < dexManifest.dexes.length; i++) {
                            Class.forName(dexManifest.dexes[i].canaryClass);
                        }
                    }
                }
            } catch (Throwable th) {
                throw Fs.runtimeExFrom(th);
            }
        }
    }

    public static synchronized DexStore getMainDexStore() {
        DexStore dexStore;
        synchronized (DexLibLoader.class) {
            dexStore = sMainDexStore;
        }
        return dexStore;
    }

    /* JADX WARN: Type inference failed for: r0v25, types: [java.lang.Object, com.facebook.common.dextricks.DexErrorRecoveryInfo] */
    public static int loadAllImpl(Context context, int i, LightweightQuickPerformanceLogger lightweightQuickPerformanceLogger, ResProviderShim resProviderShim, DexStore.Config config) {
        DexErrorRecoveryInfo dexErrorRecoveryInfo;
        int i2 = i & 1;
        boolean z = false;
        if (i2 != 0) {
            z = true;
        }
        Mlog.safeFmt("DLL.loadAll betaBuild:%s flags:0x%08x", Boolean.valueOf(z), Integer.valueOf(i));
        if ((i & 16) != 0) {
            Mlog.safeFmt("DLL.loadAll instrumentation test mode", new Object[0]);
            setupMainDexStoreConfigForInstrumentationTests(context, config);
        } else if (config != null) {
            throw new IllegalArgumentException("Do not specify a config outside of test mode.");
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        Context context2 = context;
        try {
            context2 = context.createPackageContext(context.getPackageName(), 0);
        } catch (PackageManager.NameNotFoundException unused) {
        }
        try {
            C0GU.A00(context2.getApplicationInfo(), DexLibLoader.class.getClassLoader(), arrayList, arrayList2);
        } catch (C0GS e) {
            Mlog.w(e, "failure to locate primary/auxiliary dexes: perf loss", new Object[0]);
            arrayList.clear();
            arrayList2.clear();
        }
        File mainDexStoreLocation = DexStoreUtils.getMainDexStoreLocation(context);
        File file = new File(context2.getApplicationInfo().sourceDir);
        if (!file.exists()) {
            if (!arrayList.isEmpty()) {
                file = new File(((DexFile) arrayList.get(0)).getName());
                Mlog.w("Main store will use %s as apk file.", file.getPath());
            } else {
                throw new RuntimeException("Cannot determine base.apk");
            }
        }
        ResProvider obtainResProvider = obtainResProvider(context, resProviderShim, z);
        try {
            if (obtainResProvider == null) {
                Mlog.safeFmt("Nothing to do in DexLibLoader.loadAll: no resProvider", new Object[0]);
                DexErrorRecoveryInfo.setMainDexStoreLoadInformation(new Object());
                return 0;
            }
            Mlog.safeFmt("opening dex store %s", mainDexStoreLocation);
            DexStore open = DexStore.open(mainDexStoreLocation, file, obtainResProvider, arrayList, arrayList2);
            sMainDexStore = open;
            if (Build.VERSION.SDK_INT >= 30) {
                open.markArtMainStore(context);
            }
            if ((i & 2) == 0) {
                int i3 = 0;
                if (i2 != 0) {
                    i3 = 1;
                }
                if ((i & 8) != 0) {
                    i3 |= 16;
                }
                if ((i & 4) != 0) {
                    i3 |= 4;
                }
                EndToEnd.A04();
                Mlog.w("disabling background optimization", new Object[0]);
                dexErrorRecoveryInfo = open.loadAll((i3 & (-5)) | 1 | 8, lightweightQuickPerformanceLogger, context);
                if ((dexErrorRecoveryInfo.loadResult & 8) != 0) {
                    Mlog.safeFmt("running deoptimized code", new Object[0]);
                    DexErrorRecoveryInfo.sDeoptTaint = true;
                }
                dexErrorRecoveryInfo.storeRegenFilename = open.getRegenFile().getAbsolutePath();
            } else {
                Mlog.safeFmt("skipping actual loadAll as requested", new Object[0]);
                dexErrorRecoveryInfo = null;
            }
            DexErrorRecoveryInfo.setMainDexStoreLoadInformation(dexErrorRecoveryInfo);
            obtainResProvider.close();
            return 0;
        } catch (Throwable th) {
            if (obtainResProvider == null) {
                throw th;
            }
            try {
                obtainResProvider.close();
                throw th;
            } catch (Throwable th2) {
                Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th, th2);
                throw th;
            }
        }
    }

    public static void ensureConfig(Context context, DexStore.Config config, boolean z) {
        File mainDexStoreLocation = DexStoreUtils.getMainDexStoreLocation(context);
        Fs.mkdirOrThrow(mainDexStoreLocation);
        if (config != null) {
            File file = new File(mainDexStoreLocation, DexStore.CONFIG_FILENAME);
            if (!file.exists() || z) {
                config.writeAndSync(file);
            }
        }
    }

    public static DexErrorRecoveryInfo getMainDexStoreLoadInformation() {
        return DexErrorRecoveryInfo.getMainDexStoreLoadInformation();
    }

    public static void handleUnoptimizedCodeForPerftest(Context context) {
        if (EndToEnd.A04()) {
            throw new IllegalStateException(AnonymousClass001.A0R("In ct-scan mode, but not running optimized code. Out of disk space? Bad config? Load result: 0x", Integer.toHexString(DexErrorRecoveryInfo.getMainDexStoreLoadInformation().loadResult)));
        }
    }

    public static void setupMainDexStoreConfigForInstrumentationTests(Context context, DexStore.Config config) {
        File mainDexStoreLocation = DexStoreUtils.getMainDexStoreLocation(context);
        Fs.deleteRecursive(mainDexStoreLocation);
        Fs.mkdirOrThrow(mainDexStoreLocation);
        if (config != null) {
            config.writeAndSync(new File(mainDexStoreLocation, DexStore.CONFIG_FILENAME));
        }
    }

    public static boolean shouldSynchronouslyGenerateOatFiles() {
        EndToEnd.A04();
        return true;
    }

    public static boolean wasMainDexStoreRegenerated() {
        if ((DexErrorRecoveryInfo.getMainDexStoreLoadInformation().loadResult & 1) != 0) {
            return true;
        }
        return false;
    }

    public static int loadAll(Context context, boolean z, LightweightQuickPerformanceLogger lightweightQuickPerformanceLogger) {
        return loadAll(context, 1, lightweightQuickPerformanceLogger);
    }

    public static ResProvider obtainResProvider(Context context, ResProviderShim resProviderShim, boolean z) {
        try {
            ResProvider obtainResProviderInternal = obtainResProviderInternal(context, z);
            if (resProviderShim != null) {
                return resProviderShim.install(obtainResProviderInternal);
            }
            return obtainResProviderInternal;
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static synchronized int loadAll(Context context, int i, LightweightQuickPerformanceLogger lightweightQuickPerformanceLogger) {
        int loadAll;
        synchronized (DexLibLoader.class) {
            loadAll = loadAll(context, i, lightweightQuickPerformanceLogger, null, null);
        }
        return loadAll;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, java.lang.Runnable] */
    public static synchronized int loadAll(Context context, int i, LightweightQuickPerformanceLogger lightweightQuickPerformanceLogger, ResProviderShim resProviderShim, DexStore.Config config) {
        int loadAllImpl;
        synchronized (DexLibLoader.class) {
            if (DexErrorRecoveryInfo.getMainDexStoreLoadInformationNoThrow() == null) {
                try {
                    loadAllImpl = loadAllImpl(context, i, lightweightQuickPerformanceLogger, resProviderShim, config);
                    CanaryLoader.setInstance(new Object());
                    if (DexErrorRecoveryInfo.sDeoptTaint) {
                        handleUnoptimizedCodeForPerftest(context);
                    }
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            } else {
                throw new AssertionError("loadAll already loaded dex files");
            }
        }
        return loadAllImpl;
    }

    public static int loadAll(Context context, boolean z) {
        return loadAll(context, 1, (LightweightQuickPerformanceLogger) null);
    }
}
