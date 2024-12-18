package com.facebook.breakpad;

import X.C09170dP;
import X.C0K8;
import X.C0eS;
import android.content.Context;
import android.os.Build;
import com.facebook.common.build.BuildConstants;
import com.facebook.common.dextricks.OdexSchemeArtXdex;
import java.io.File;
import java.util.Formatter;
import java.util.TreeMap;

/* loaded from: classes.dex */
public class BreakpadManager {
    public static volatile boolean initialized;
    public static volatile File mCrashDirectory;

    public static native void addMappingInfo(String str, byte[] bArr, int i, long j, long j2, long j3);

    public static native void crashProcessByAssert(String str);

    public static native void crashThisProcess();

    public static native void crashThisProcessAsan();

    public static native void crashThisProcessGWPAsan();

    public static native boolean disableCoreDumpingImpl();

    public static native boolean enableCoreDumpingImpl(String str);

    public static native void install(String str, String str2, String str3, int i, int i2, boolean z);

    public static native boolean isCoreResourceHardUnlimited();

    public static native boolean isPrivacyModeEnabled();

    public static native boolean nativeContainsKey(String str);

    public static native String nativeGetCustomData(String str);

    public static native void nativeGetCustomDataSnapshot(TreeMap treeMap);

    public static native long nativeGetMinidumpFlags();

    public static native void nativeRemoveCustomData(String str);

    public static native void nativeSetCustomData(String str, String str2);

    public static native boolean nativeSetJvmStreamEnabled(boolean z, boolean z2);

    public static native void nativeSetMinidumpFlags(long j);

    public static native void setVersionInfo(int i, String str, String str2);

    public static native boolean simulateSignalDelivery(int i, String str);

    public static native void uninstall();

    public static synchronized void ensureLoadLibrary() {
        synchronized (BreakpadManager.class) {
            if (!initialized) {
                C09170dP.A0C("breakpad");
                initialized = true;
            }
        }
    }

    public static File getCrashDirectory() {
        if (mCrashDirectory != null) {
            return mCrashDirectory;
        }
        throw new RuntimeException("Breakpad not installed");
    }

    public static boolean isActive() {
        if (initialized && mCrashDirectory != null) {
            return true;
        }
        return false;
    }

    public static synchronized void setJvmStreamEnabled(boolean z) {
        boolean z2;
        synchronized (BreakpadManager.class) {
            String property = System.getProperty("java.vm.version");
            if (property != null && !property.startsWith("1.") && !property.startsWith("0.")) {
                z2 = true;
                if (z) {
                    C09170dP.A0C("breakpad_cpp_helper");
                }
            } else {
                z2 = false;
            }
            nativeSetJvmStreamEnabled(z2, z);
        }
    }

    public static void start(Context context) {
        start(context, 0L, 1536000, null, null, false);
    }

    public static boolean containsKey(String str) {
        boolean nativeContainsKey;
        if (!isActive()) {
            C0K8.A0D("BreakpadManager", "Breakpad is not active (containsKey).");
        } else {
            ensureLoadLibrary();
            if ((nativeGetMinidumpFlags() & OdexSchemeArtXdex.STATE_DO_PERIODIC_PGO_COMP_ATTEMPTED) != OdexSchemeArtXdex.STATE_DO_PERIODIC_PGO_COMP_ATTEMPTED) {
                synchronized (BreakpadManager.class) {
                    nativeContainsKey = nativeContainsKey(str);
                }
                return nativeContainsKey;
            }
        }
        return false;
    }

    public static boolean enableCoreDumping(Context context) {
        ensureLoadLibrary();
        if (!isCoreResourceHardUnlimited()) {
            return false;
        }
        return enableCoreDumpingImpl(context.getApplicationInfo().dataDir);
    }

    public static String getCustomData(String str) {
        String nativeGetCustomData;
        if (!isActive()) {
            C0K8.A0D("BreakpadManager", "Breakpad is not active (getCustomData).");
            return "";
        }
        ensureLoadLibrary();
        boolean z = false;
        if ((nativeGetMinidumpFlags() & OdexSchemeArtXdex.STATE_DO_PERIODIC_PGO_COMP_ATTEMPTED) != OdexSchemeArtXdex.STATE_DO_PERIODIC_PGO_COMP_ATTEMPTED) {
            z = true;
        }
        if (!z) {
            return "";
        }
        synchronized (BreakpadManager.class) {
            nativeGetCustomData = nativeGetCustomData(str);
        }
        return nativeGetCustomData;
    }

    public static void removeCustomData(String str) {
        if (!isActive()) {
            C0K8.A0D("BreakpadManager", "Breakpad is not active (removeCustomData).");
            return;
        }
        ensureLoadLibrary();
        if ((nativeGetMinidumpFlags() & OdexSchemeArtXdex.STATE_DO_PERIODIC_PGO_COMP_ATTEMPTED) == OdexSchemeArtXdex.STATE_DO_PERIODIC_PGO_COMP_ATTEMPTED) {
            return;
        }
        synchronized (BreakpadManager.class) {
            nativeRemoveCustomData(str);
        }
    }

    public static void setCustomData(String str, String str2, Object... objArr) {
        if (!isActive()) {
            C0K8.A0D("BreakpadManager", "Breakpad is not active (setCustomData).");
            return;
        }
        ensureLoadLibrary();
        if ((nativeGetMinidumpFlags() & OdexSchemeArtXdex.STATE_DO_PERIODIC_PGO_COMP_ATTEMPTED) == OdexSchemeArtXdex.STATE_DO_PERIODIC_PGO_COMP_ATTEMPTED) {
            return;
        }
        synchronized (BreakpadManager.class) {
            if (objArr.length > 0 && str2 != null) {
                StringBuilder sb = new StringBuilder();
                Formatter formatter = new Formatter(sb);
                formatter.format(str2, objArr);
                formatter.close();
                str2 = sb.toString();
            }
            nativeSetCustomData(str, str2);
        }
    }

    public static synchronized void start(Context context, long j, int i, String str, String str2, boolean z) {
        String str3 = str;
        synchronized (BreakpadManager.class) {
            ensureLoadLibrary();
            if (mCrashDirectory == null) {
                File A00 = C0eS.A00(context, 1874789883);
                A00.mkdirs();
                String absolutePath = A00.getAbsolutePath();
                if (str == null) {
                    str3 = "";
                }
                install(absolutePath, str3, str2, 1536000, Build.VERSION.SDK_INT, z);
                mCrashDirectory = A00;
                ensureLoadLibrary();
                long nativeGetMinidumpFlags = j | nativeGetMinidumpFlags() | 2 | 4;
                ensureLoadLibrary();
                nativeSetMinidumpFlags(nativeGetMinidumpFlags);
                int A01 = BuildConstants.A01();
                String str4 = Build.FINGERPRINT;
                setVersionInfo(A01, "353.2.0.49.90", str4);
                setCustomData("Fingerprint", str4, new Object[0]);
            }
        }
    }
}
