package com.facebook.common.dextricks;

import X.AnonymousClass001;
import X.C09170dP;
import android.content.Context;
import dalvik.system.VMRuntime;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public class OreoFileUtils {
    public static final OreoFileUtils $redex_init_class = null;

    public static native String getOdexKeyValueNative(String str, String str2);

    public static List areFilesMapped(List list) {
        return areFilesMapped(list, "/proc/self/maps");
    }

    public static DexErrorRecoveryInfoAsync collectAsyncInfoWithSecondary(Context context, File file) {
        Long l;
        Long l2;
        Long l3;
        Long l4;
        String str;
        Long l5;
        Long l6;
        List usingOptimizedBaseAndMegazipFiles = usingOptimizedBaseAndMegazipFiles(context, file);
        Boolean bool = (Boolean) usingOptimizedBaseAndMegazipFiles.get(0);
        Boolean bool2 = (Boolean) usingOptimizedBaseAndMegazipFiles.get(1);
        Boolean bool3 = (Boolean) usingOptimizedBaseAndMegazipFiles.get(2);
        Boolean bool4 = (Boolean) usingOptimizedBaseAndMegazipFiles.get(3);
        Boolean bool5 = (Boolean) usingOptimizedBaseAndMegazipFiles.get(4);
        DexErrorRecoveryInfoAsync.setAppMetaInfo(DexStoreUtils.getARTVersion(context), DexStoreUtils.getLastAppInstallOrUpdateTime(context), DexStoreUtils.getInstallerName(context));
        Boolean bool6 = Boolean.TRUE;
        Long l7 = null;
        if (bool6.equals(bool)) {
            l = Long.valueOf(DexStoreUtils.getBaseOdex(context).length());
        } else {
            l = null;
        }
        if (bool6.equals(bool2)) {
            l2 = Long.valueOf(DexStoreUtils.getBaseVdex(context).length());
        } else {
            l2 = null;
        }
        if (bool6.equals(bool)) {
            l3 = Long.valueOf(DexStoreUtils.getBaseOdex(context).lastModified());
        } else {
            l3 = null;
        }
        if (bool6.equals(bool2)) {
            l4 = Long.valueOf(DexStoreUtils.getBaseVdex(context).lastModified());
        } else {
            l4 = null;
        }
        if (bool6.equals(bool)) {
            str = getBaseOdexKeyValue(context, "dex2oat-cmdline");
        } else {
            str = null;
        }
        if (bool6.equals(bool3)) {
            l5 = Long.valueOf(DexStoreUtils.getBaseAppImage(context).length());
        } else {
            l5 = null;
        }
        if (bool6.equals(bool3)) {
            l6 = Long.valueOf(DexStoreUtils.getBaseAppImage(context).lastModified());
        } else {
            l6 = null;
        }
        Long baseDMSize = DexStoreUtils.getBaseDMSize(context);
        Long baselineProfileInDMSize = DexStoreUtils.getBaselineProfileInDMSize(context);
        Long vDexFileInDMSize = DexStoreUtils.getVDexFileInDMSize(context);
        String apkDirStr = getApkDirStr(context);
        if (bool6.equals(bool5)) {
            l7 = Long.valueOf(getImageSize(file));
        }
        return new DexErrorRecoveryInfoAsync(bool, bool2, bool3, bool4, bool5, l, l2, l3, l4, str, l5, l6, baseDMSize, baselineProfileInDMSize, vDexFileInDMSize, apkDirStr, l7);
    }

    public static DexErrorRecoveryInfoAsync collectBaseAsyncInfo(Context context) {
        Long l;
        Long l2;
        Long l3;
        Long l4;
        String str;
        Long l5;
        List usingOptimizedBaseFiles = usingOptimizedBaseFiles(context);
        Boolean bool = (Boolean) usingOptimizedBaseFiles.get(0);
        Boolean bool2 = (Boolean) usingOptimizedBaseFiles.get(1);
        Boolean bool3 = (Boolean) usingOptimizedBaseFiles.get(2);
        DexErrorRecoveryInfoAsync.setAppMetaInfo(DexStoreUtils.getARTVersion(context), DexStoreUtils.getLastAppInstallOrUpdateTime(context), DexStoreUtils.getInstallerName(context));
        Boolean bool4 = Boolean.TRUE;
        Long l6 = null;
        if (bool4.equals(bool)) {
            l = Long.valueOf(DexStoreUtils.getBaseOdex(context).length());
        } else {
            l = null;
        }
        if (bool4.equals(bool2)) {
            l2 = Long.valueOf(DexStoreUtils.getBaseVdex(context).length());
        } else {
            l2 = null;
        }
        if (bool4.equals(bool)) {
            l3 = Long.valueOf(DexStoreUtils.getBaseOdex(context).lastModified());
        } else {
            l3 = null;
        }
        if (bool4.equals(bool2)) {
            l4 = Long.valueOf(DexStoreUtils.getBaseVdex(context).lastModified());
        } else {
            l4 = null;
        }
        if (bool4.equals(bool)) {
            str = getBaseOdexKeyValue(context, "dex2oat-cmdline");
        } else {
            str = null;
        }
        if (bool4.equals(bool3)) {
            l5 = Long.valueOf(DexStoreUtils.getBaseAppImage(context).length());
        } else {
            l5 = null;
        }
        if (bool4.equals(bool3)) {
            l6 = Long.valueOf(DexStoreUtils.getBaseAppImage(context).lastModified());
        }
        return new DexErrorRecoveryInfoAsync(bool, bool2, bool3, l, l2, l3, l4, str, l5, l6, DexStoreUtils.getBaseDMSize(context), DexStoreUtils.getBaselineProfileInDMSize(context), DexStoreUtils.getVDexFileInDMSize(context), getApkDirStr(context));
    }

    public static String getBaseOdexKeyValue(Context context, String str) {
        String str2 = "";
        File baseOdex = DexStoreUtils.getBaseOdex(context);
        if (!baseOdex.exists()) {
            return "";
        }
        try {
            str2 = getOdexKeyValueNative(baseOdex.getCanonicalPath(), str);
            return str2;
        } catch (IOException | RuntimeException unused) {
            return str2;
        }
    }

    public static String getFileContents(File file) {
        if (file != null && file.exists()) {
            StringBuilder sb = new StringBuilder();
            try {
                BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
                while (true) {
                    try {
                        String readLine = bufferedReader.readLine();
                        if (readLine == null) {
                            break;
                        }
                        sb.append(readLine);
                        sb.append('\n');
                    } finally {
                    }
                }
                bufferedReader.close();
            } catch (IOException unused) {
            }
            return sb.toString();
        }
        return "";
    }

    static {
        C09170dP.A0C("oreofileutils-jni");
    }

    public static boolean alreadyExtractedForCloudPgo(File file) {
        return new File(file.getParentFile(), "oat/cloud_pgo_extracted").exists();
    }

    public static boolean alreadyPostColdStartSpeedProfile(File file) {
        return new File(file.getParentFile(), "oat/speed_profile").exists();
    }

    public static boolean alreadyUnpackedForCloudPgo(File file) {
        return new File(file.getParentFile(), "oat/cloud_pgo_unpacked").exists();
    }

    public static long currentProfileSize(File file) {
        return new File(file.getParentFile(), AnonymousClass001.A0g("oat/", file.getName(), ".cur.prof")).length();
    }

    public static String getApkDirStr(Context context) {
        File apkDir = DexStoreUtils.getApkDir(context);
        String str = "";
        if (apkDir == null) {
            return "";
        }
        try {
            str = apkDir.getCanonicalPath();
            return str;
        } catch (IOException unused) {
            return str;
        }
    }

    public static String getBaseAppImageName(Context context) {
        File apkDir = DexStoreUtils.getApkDir(context);
        if (apkDir == null) {
            return "";
        }
        return apkDir.getName().concat("/oat/").concat(VMRuntime.getRuntime().vmInstructionSet()).concat("/base.art");
    }

    public static String getBaseOdexDex2OatCmdLine(Context context) {
        return getBaseOdexKeyValue(context, "dex2oat-cmdline");
    }

    public static String getBaseOdexName(Context context) {
        File apkDir = DexStoreUtils.getApkDir(context);
        if (apkDir == null) {
            return "";
        }
        return apkDir.getName().concat("/oat/").concat(VMRuntime.getRuntime().vmInstructionSet()).concat("/base.odex");
    }

    public static String getBaseVdexName(Context context) {
        File apkDir = DexStoreUtils.getApkDir(context);
        if (apkDir == null) {
            return "";
        }
        return apkDir.getName().concat("/oat/").concat(VMRuntime.getRuntime().vmInstructionSet()).concat("/base.vdex");
    }

    public static long getImageSize(File file) {
        return new File(getIsaDir(file), getZipNameNoSuffix(file).concat(".art")).length();
    }

    public static File getIsaDir(File file) {
        return new File(file.getParentFile(), "oat/".concat(VMRuntime.getRuntime().vmInstructionSet()));
    }

    public static String getMegazipAppImageName(File file) {
        return getZipNameNoSuffix(file).concat(".art");
    }

    public static String getMegazipOdexDex2OatCmdLine(File file) {
        return getMegazipOdexKeyValue(file, "dex2oat-cmdline");
    }

    public static String getMegazipOdexKeyValue(File file, String str) {
        File odex = getOdex(file);
        String str2 = "";
        if (!odex.exists()) {
            return "";
        }
        try {
            str2 = getOdexKeyValueNative(odex.getCanonicalPath(), str);
            return str2;
        } catch (IOException | RuntimeException unused) {
            return str2;
        }
    }

    public static File getOdex(File file) {
        return new File(getIsaDir(file), getOdexName(file));
    }

    public static long getOdexLastModified(File file) {
        return getOdex(file).lastModified();
    }

    public static String getOdexName(File file) {
        return getZipNameNoSuffix(file).concat(DexManifest.ODEX_EXT);
    }

    public static long getOdexSize(File file) {
        return getOdex(file).length();
    }

    public static File getOptLogFile(File file) {
        File file2 = new File(file.getParent(), "oat/opt_log.txt");
        try {
            Files.deleteIfExists(file2.toPath());
            file2.createNewFile();
            return file2;
        } catch (IOException unused) {
            return null;
        }
    }

    public static File getReferenceProfile(File file) {
        return new File(file.getParentFile(), "oat/".concat(file.getName()).concat(".prof"));
    }

    public static File getVdex(File file) {
        return new File(getIsaDir(file), getVdexName(file));
    }

    public static long getVdexLastModified(File file) {
        return getVdex(file).lastModified();
    }

    public static String getVdexName(File file) {
        return getZipNameNoSuffix(file).concat(".vdex");
    }

    public static long getVdexSize(File file) {
        return getVdex(file).length();
    }

    public static String getZipNameNoSuffix(File file) {
        String name = file.getName();
        return name.substring(0, name.lastIndexOf(46));
    }

    public static boolean hasOdex(File file) {
        if (getOdex(file).length() <= 0) {
            return false;
        }
        return true;
    }

    public static boolean hasVdexOdex(File file) {
        if (getVdex(file).length() > 0 && getOdex(file).length() > 0) {
            return true;
        }
        return false;
    }

    public static boolean isTruncated(File file) {
        if (!file.exists() || file.length() < 102400) {
            return true;
        }
        return false;
    }

    public static void markExtractedForCloudPgo(File file) {
        try {
            new File(file.getParentFile(), "oat/cloud_pgo_extracted").createNewFile();
        } catch (IOException unused) {
        }
    }

    public static void markPostColdStartSpeedProfile(File file) {
        try {
            new File(file.getParentFile(), "oat/speed_profile").createNewFile();
        } catch (IOException unused) {
        }
    }

    public static void markUnpackedForCloudPgo(File file) {
        try {
            new File(file.getParentFile(), "oat/cloud_pgo_unpacked").createNewFile();
        } catch (IOException unused) {
        }
    }

    public static long referenceProfileSize(File file) {
        return getReferenceProfile(file).length();
    }

    public static List usingOptimizedBaseAndMegazipFiles(Context context, File file) {
        String baseOdexName = getBaseOdexName(context);
        String baseVdexName = getBaseVdexName(context);
        String baseAppImageName = getBaseAppImageName(context);
        if (baseOdexName.isEmpty()) {
            return Collections.nCopies(5, false);
        }
        return areFilesMapped(new ArrayList(Arrays.asList(baseOdexName, baseVdexName, baseAppImageName, getOdexName(file), getMegazipAppImageName(file))), "/proc/self/maps");
    }

    public static List usingOptimizedBaseFiles(Context context) {
        String baseOdexName = getBaseOdexName(context);
        String baseVdexName = getBaseVdexName(context);
        String baseAppImageName = getBaseAppImageName(context);
        if (baseOdexName.isEmpty()) {
            return Collections.nCopies(3, false);
        }
        return areFilesMapped(new ArrayList(Arrays.asList(baseOdexName, baseVdexName, baseAppImageName)), "/proc/self/maps");
    }

    public static List areFilesMapped(List list, String str) {
        ArrayList arrayList = new ArrayList(Collections.nCopies(list.size(), false));
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(str), 128);
            int i = 0;
            while (true) {
                try {
                    String readLine = bufferedReader.readLine();
                    if (readLine == null || i == list.size()) {
                        break;
                    }
                    for (int i2 = 0; i2 < list.size(); i2++) {
                        if (!((Boolean) arrayList.get(i2)).booleanValue() && readLine.contains((CharSequence) list.get(i2))) {
                            arrayList.set(i2, true);
                            i++;
                        }
                    }
                } finally {
                }
            }
            bufferedReader.close();
            return arrayList;
        } catch (IOException unused) {
            return arrayList;
        }
    }
}
