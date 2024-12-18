package com.facebook.common.dextricks;

import X.AbstractC63123SdR;
import X.AnonymousClass001;
import X.C03600Hy;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import com.facebook.react.views.webview.ReactWebViewManager;
import dalvik.system.VMRuntime;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.List;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;

/* loaded from: classes.dex */
public final class DexStoreUtils {
    public static Long ART_VERSION_CODE = null;
    public static final String BASELINE_PROFILE_NAME = "primary.prof";
    public static int CANARY_IDX = 2;
    public static Long DM_BASELINE_PROFILE_SIZE = null;
    public static Long DM_VDEX_FILE_SIZE = null;
    public static int HASH_IDX = 1;
    public static final String IGNORE_DIRTY_CHECK_PREFIX = "IGNORE_DIRTY_";
    public static String INSTALLER_NAME = null;
    public static Long LAST_APP_INSTALL_OR_UPDATE_TIME = null;
    public static final String MAIN_DEX_STORE_ID = "dex";
    public static final boolean OREO_OR_NEWER = true;
    public static final String SECONDARY_DEX_MANIFEST = "metadata.txt";
    public static final int STORAGE_KIND_ASEC = 3;
    public static final int STORAGE_KIND_EXPAND = 2;
    public static final int STORAGE_KIND_INTERNAL = 1;
    public static final int STORAGE_KIND_OTHER = 0;
    public static final String VDEX_FILE_NAME_IN_BASE_DM = "primary.vdex";

    public static String getMainDexStoreId() {
        return MAIN_DEX_STORE_ID;
    }

    public static synchronized long getARTVersion(Context context) {
        long j;
        String str;
        Object[] objArr;
        synchronized (DexStoreUtils.class) {
            Long l = ART_VERSION_CODE;
            if (l != null) {
                j = l.longValue();
            } else {
                PackageManager packageManager = context.getPackageManager();
                j = -1;
                if (packageManager == null) {
                    str = "Could not get package manager";
                    objArr = new Object[0];
                } else {
                    try {
                        int i = 0;
                        if (Build.VERSION.SDK_INT >= 29) {
                            i = AbstractC63123SdR.MAX_SIGNED_POWER_OF_TWO;
                        }
                        PackageInfo packageInfo = packageManager.getPackageInfo("com.google.android.art", i);
                        if (packageInfo != null) {
                            long longVersionCode = packageInfo.getLongVersionCode();
                            Long valueOf = Long.valueOf(longVersionCode);
                            ART_VERSION_CODE = valueOf;
                            if (valueOf != null) {
                                j = longVersionCode;
                            }
                        } else {
                            Mlog.e("Could not get pacakge info for com.google.android.art", new Object[0]);
                        }
                    } catch (PackageManager.NameNotFoundException e) {
                        str = "could not find package com.google.android.art %s";
                        objArr = new Object[]{e};
                    }
                }
                Mlog.e(str, objArr);
            }
        }
        return j;
    }

    public static synchronized Long getBaselineProfileInDMSize(Context context) {
        Long l;
        synchronized (DexStoreUtils.class) {
            l = DM_BASELINE_PROFILE_SIZE;
            if (l == null) {
                File baseDM = getBaseDM(context);
                if (baseDM.length() > 0) {
                    obtainInfoFromDMFile(baseDM);
                }
                l = DM_BASELINE_PROFILE_SIZE;
            }
        }
        return l;
    }

    public static List getDexInfoFromManifest(Context context) {
        ArrayList arrayList = new ArrayList();
        InputStream open = context.getAssets().open("secondary-program-dex-jars/metadata.txt");
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(open, ReactWebViewManager.HTML_ENCODING));
            while (true) {
                try {
                    String readLine = bufferedReader.readLine();
                    if (readLine != null) {
                        if (!readLine.startsWith(".")) {
                            String[] split = readLine.split(" ");
                            if (split.length == 3) {
                                arrayList.add(split);
                            }
                        }
                    } else {
                        bufferedReader.close();
                        return arrayList;
                    }
                } finally {
                }
            }
        } finally {
            open.close();
        }
    }

    public static synchronized String getInstallerName(Context context) {
        String str;
        Object[] objArr;
        String installerPackageName;
        synchronized (DexStoreUtils.class) {
            String str2 = INSTALLER_NAME;
            if (str2 == null) {
                PackageManager packageManager = context.getPackageManager();
                str2 = null;
                if (packageManager == null) {
                    str = "Could not get package manager";
                    objArr = new Object[0];
                } else {
                    try {
                        if (Build.VERSION.SDK_INT >= 30) {
                            installerPackageName = packageManager.getInstallSourceInfo(context.getPackageName()).getInstallingPackageName();
                            INSTALLER_NAME = installerPackageName;
                        } else {
                            installerPackageName = packageManager.getInstallerPackageName(context.getPackageName());
                            INSTALLER_NAME = installerPackageName;
                        }
                        return installerPackageName;
                    } catch (PackageManager.NameNotFoundException e) {
                        str = "Could not find package name %s";
                        objArr = new Object[]{e};
                    }
                }
                Mlog.e(str, objArr);
            }
            return str2;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0035, code lost:
    
        if (r0 == null) goto L15;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static synchronized long getLastAppInstallOrUpdateTime(android.content.Context r6) {
        /*
            java.lang.Class<com.facebook.common.dextricks.DexStoreUtils> r5 = com.facebook.common.dextricks.DexStoreUtils.class
            monitor-enter(r5)
            java.lang.Long r0 = com.facebook.common.dextricks.DexStoreUtils.LAST_APP_INSTALL_OR_UPDATE_TIME     // Catch: java.lang.Throwable -> L39
            r3 = -1
            if (r0 != 0) goto L30
            android.content.pm.PackageManager r1 = r6.getPackageManager()     // Catch: java.lang.Throwable -> L39
            r0 = 0
            if (r1 != 0) goto L18
            java.lang.String r1 = "Could not get package manager"
            java.lang.Object[] r0 = new java.lang.Object[r0]     // Catch: java.lang.Throwable -> L39
        L14:
            com.facebook.common.dextricks.Mlog.e(r1, r0)     // Catch: java.lang.Throwable -> L39
            goto L37
        L18:
            java.lang.String r2 = r6.getPackageName()     // Catch: java.lang.Throwable -> L39
            android.content.pm.PackageInfo r0 = r1.getPackageInfo(r2, r0)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L29 java.lang.Throwable -> L39
            long r0 = r0.lastUpdateTime     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L29 java.lang.Throwable -> L39
            java.lang.Long r0 = java.lang.Long.valueOf(r0)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L29 java.lang.Throwable -> L39
            com.facebook.common.dextricks.DexStoreUtils.LAST_APP_INSTALL_OR_UPDATE_TIME = r0     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L29 java.lang.Throwable -> L39
            goto L35
        L29:
            java.lang.String r1 = "Could not get package info for %s"
            java.lang.Object[] r0 = new java.lang.Object[]{r2}     // Catch: java.lang.Throwable -> L39
            goto L14
        L30:
            long r3 = r0.longValue()     // Catch: java.lang.Throwable -> L39
            goto L37
        L35:
            if (r0 != 0) goto L30
        L37:
            monitor-exit(r5)
            return r3
        L39:
            r0 = move-exception
            monitor-exit(r5)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.common.dextricks.DexStoreUtils.getLastAppInstallOrUpdateTime(android.content.Context):long");
    }

    public static int getStorageKind(String str) {
        if (str.startsWith("/data/app/")) {
            return 1;
        }
        if (str.startsWith("/mnt/expand/")) {
            return 2;
        }
        if (!str.startsWith("/mnt/asec/")) {
            return 0;
        }
        return 3;
    }

    public static synchronized Long getVDexFileInDMSize(Context context) {
        Long l;
        synchronized (DexStoreUtils.class) {
            l = DM_VDEX_FILE_SIZE;
            if (l == null) {
                File baseDM = getBaseDM(context);
                if (baseDM.length() > 0) {
                    obtainInfoFromDMFile(baseDM);
                }
                l = DM_VDEX_FILE_SIZE;
            }
        }
        return l;
    }

    public static boolean isIgnoreDirtyFile(File file) {
        if (file == null) {
            return false;
        }
        return isIgnoreDirtyFileName(file.getName());
    }

    public static boolean isIgnoreDirtyFileName(String str) {
        if (str != null && str.startsWith(IGNORE_DIRTY_CHECK_PREFIX)) {
            return true;
        }
        return false;
    }

    public static File makeIgnoreDirtyCheckFile(File file, String str) {
        return new File(file, AnonymousClass001.A0R(IGNORE_DIRTY_CHECK_PREFIX, str));
    }

    public static synchronized void obtainInfoFromDMFile(File file) {
        synchronized (DexStoreUtils.class) {
            try {
                ZipFile zipFile = new ZipFile(file);
                ZipEntry entry = zipFile.getEntry(VDEX_FILE_NAME_IN_BASE_DM);
                if (entry != null) {
                    DM_VDEX_FILE_SIZE = Long.valueOf(entry.getSize());
                }
                ZipEntry entry2 = zipFile.getEntry(BASELINE_PROFILE_NAME);
                if (entry2 != null) {
                    DM_BASELINE_PROFILE_SIZE = Long.valueOf(entry2.getSize());
                }
            } catch (IOException e) {
                Mlog.w("error reading DM file as zip %s", e);
            }
        }
    }

    public static String sha1ForFile(String str) {
        MessageDigest messageDigest = MessageDigest.getInstance("SHA-1");
        FileInputStream fileInputStream = new FileInputStream(str);
        try {
            byte[] bArr = new byte[8192];
            while (true) {
                int read = fileInputStream.read(bArr);
                if (read != -1) {
                    messageDigest.update(bArr, 0, read);
                } else {
                    fileInputStream.close();
                    return toHex(messageDigest.digest());
                }
            }
        } catch (Throwable th) {
            try {
                fileInputStream.close();
                throw th;
            } catch (Throwable th2) {
                Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th, th2);
                throw th;
            }
        }
    }

    public static String toHex(byte[] bArr) {
        StringBuilder sb = new StringBuilder();
        char[] charArray = "0123456789abcdef".toCharArray();
        for (byte b : bArr) {
            sb.append(charArray[(b >> 4) & 15]);
            sb.append(charArray[b & 15]);
        }
        return sb.toString();
    }

    public static File createNewMainDexStoreReferencePgoProfile(Context context) {
        return C03600Hy.A00(context).A07(getMainDexStoreLocation(context));
    }

    public static File getApkDir(Context context) {
        return new File(context.getApplicationInfo().publicSourceDir).getParentFile();
    }

    public static int getBaseApkStorageKind(Context context) {
        return getStorageKind(context.getApplicationInfo().publicSourceDir);
    }

    public static File getBaseAppImage(Context context) {
        return new File(getBaseIsaDir(context), "base.art");
    }

    public static long getBaseAppImageLastModifield(Context context) {
        return getBaseAppImage(context).lastModified();
    }

    public static long getBaseAppImageSize(Context context) {
        return getBaseAppImage(context).length();
    }

    public static File getBaseDM(Context context) {
        return new File(getApkDir(context), "base.dm");
    }

    public static Long getBaseDMSize(Context context) {
        return Long.valueOf(getBaseDM(context).length());
    }

    public static File getBaseIsaDir(Context context) {
        File apkDir = getApkDir(context);
        if (apkDir == null) {
            return null;
        }
        return new File(apkDir, "oat/".concat(VMRuntime.getRuntime().vmInstructionSet()));
    }

    public static File getBaseOdex(Context context) {
        return new File(getBaseIsaDir(context), "base.odex");
    }

    public static long getBaseOdexLastModifield(Context context) {
        return getBaseOdex(context).lastModified();
    }

    public static long getBaseOdexSize(Context context) {
        return getBaseOdex(context).length();
    }

    public static File getBaseVdex(Context context) {
        return new File(getBaseIsaDir(context), "base.vdex");
    }

    public static long getBaseVdexLastModifield(Context context) {
        return getBaseVdex(context).lastModified();
    }

    public static long getBaseVdexSize(Context context) {
        return getBaseVdex(context).length();
    }

    public static File getCurrentMainDexStorePgoProfile(Context context) {
        File mainDexStoreReferencePgoProfile = getMainDexStoreReferencePgoProfile(context);
        if (!mainDexStoreReferencePgoProfile.exists()) {
            return C03600Hy.A00(context).A06();
        }
        return mainDexStoreReferencePgoProfile;
    }

    public static File getMainDexStoreLocation(Context context) {
        String realpath;
        String str = context.getApplicationInfo().dataDir;
        if (OREO_OR_NEWER) {
            realpath = str;
        } else {
            realpath = DalvikInternals.realpath(str);
        }
        if (!str.equals(realpath)) {
            Mlog.safeFmt("resolved non-canonical data directory %s to %s", str, realpath);
        }
        return new File(realpath, MAIN_DEX_STORE_ID);
    }

    public static File getMainDexStoreReferencePgoProfile(Context context) {
        File mainDexStoreLocation = getMainDexStoreLocation(context);
        C03600Hy.A00(context);
        return new File(mainDexStoreLocation, "art_pgo_ref_profile.prof");
    }

    public static DexManifest getSecondaryDexManifest(ResProvider resProvider, boolean z) {
        return DexManifest.loadManifestFrom(resProvider, SECONDARY_DEX_MANIFEST, z);
    }

    public static boolean isMainDexStoreId(String str) {
        return MAIN_DEX_STORE_ID.equals(str);
    }

    public static boolean isSecondaryDexManifest(String str) {
        return SECONDARY_DEX_MANIFEST.equals(str);
    }

    public static InputStream openSecondaryDexManifest(ResProvider resProvider) {
        return resProvider.open(SECONDARY_DEX_MANIFEST);
    }
}
