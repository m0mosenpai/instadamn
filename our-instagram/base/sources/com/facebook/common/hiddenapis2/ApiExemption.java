package com.facebook.common.hiddenapis2;

import X.C09170dP;
import X.C0H8;
import X.C0K8;
import android.os.Build;
import com.facebook.common.hiddenapis2.ApiExemption;
import com.facebook.common.hiddenapis2.Structs;
import dalvik.system.VMRuntime;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.reflect.Method;
import sun.misc.Unsafe;

/* loaded from: classes.dex */
public class ApiExemption {
    public static final String[] EXEMPTIONS;
    public static volatile boolean sCalled;
    public static volatile boolean sResult;
    public static volatile boolean sUseUnsafeExemption;

    public static native int nativeSetHiddenApiExemptions(int i, String[] strArr);

    static {
        String[] strArr = new String[36];
        System.arraycopy(new String[]{"Landroid/app/ActivityThread", "Landroid/app/ActivityTaskManager", "Landroid/net/ConnectivityManager", "Landroid/location/LocationManager", "Landroid/os/storage/StorageManager", "Landroid/app/usage/StorageStatsManager", "Landroid/accounts/AccountManager", "Landroid/content/ClipboardManager", "Landroid/media/AudioManager", "Landroid/os/BatteryManager", "Landroid/app/JobSchedulerImpl", "Landroid/media/session/MediaSessionManager", "Landroid/app/ActivityClient", "Landroid/app/IActivityClientController", "Landroid/util/BoostFramework", "Lcom/mediatek/perfservice/", "Lcom/mediatek/powerhalmgr/", "Lcom/samsung/android/os/SemPerfManager", "Landroid/os/InputConstants", "Landroid/os/perfdebug/", "Landroid/os/Looper", "Landroid/os/Message", "Landroid/os/ILooper", "Landroid/app/QueuedWork", "Landroid/os/Binder", "Landroid/webkit/WebViewFactory", "Lcom/android/webview/chromium/WebViewChromiumFactoryProvider"}, 0, strArr, 0, 27);
        System.arraycopy(new String[]{"Landroid/view/WindowManagerImpl", "Ldalvik/system/VMDebug", "Landroid/app/Activity", "Landroid/view/contentcapture/ContentCaptureManager", "Landroid/view/contentcapture/MainContentCaptureSession", "Landroid/app/OplusActivityManager", "Landroid/app/IOplusActivityManager", "Ldalvik/system/BaseDexClassLoader", "Landroid/app/Dialog"}, 0, strArr, 27, 9);
        EXEMPTIONS = strArr;
    }

    public static synchronized void enableUnsafeExemption() {
        synchronized (ApiExemption.class) {
            if (!sUseUnsafeExemption && !sResult) {
                sUseUnsafeExemption = true;
                if (sCalled) {
                    sCalled = false;
                }
            }
        }
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [X.0H6] */
    public static synchronized boolean removeRestriction_DO_NOT_USE() {
        boolean z;
        boolean z2;
        synchronized (ApiExemption.class) {
            if (sCalled) {
                z2 = sResult;
            } else {
                int i = Build.VERSION.SDK_INT;
                if (i <= 29) {
                    String[] strArr = EXEMPTIONS;
                    try {
                        Method method = (Method) Class.class.getDeclaredMethod("getDeclaredMethod", String.class, Class[].class).invoke(VMRuntime.class, "setHiddenApiExemptions", new Class[]{String[].class});
                        if (method != null) {
                            method.invoke(VMRuntime.getRuntime(), strArr);
                            z = true;
                        }
                    } catch (Throwable th) {
                        C0K8.A0F("ApiExemption", "Enable api exemption failed:", th);
                    }
                    z = false;
                } else {
                    if (i <= 35) {
                        String[] strArr2 = EXEMPTIONS;
                        z = false;
                        try {
                            C09170dP.A0C("hiddenapis2");
                            if (nativeSetHiddenApiExemptions(i, strArr2) == 1) {
                                z = true;
                            }
                        } catch (Throwable unused) {
                        }
                        if (!z && sUseUnsafeExemption) {
                            z = new Object() { // from class: X.0H6
                                public long A00;
                                public long A01;
                                public long A02;
                                public long A03;
                                public Unsafe A04;
                                public long A05;
                                public boolean A06;

                                public static void invoke(Object... objArr) {
                                    throw new IllegalStateException("This is a stub, can not call invoke");
                                }

                                public final boolean A00() {
                                    Unsafe unsafe;
                                    int i2;
                                    if (this.A06 && (unsafe = this.A04) != null) {
                                        try {
                                            Method declaredMethod = C0H6.class.getDeclaredMethod("invoke", Object[].class);
                                            declaredMethod.setAccessible(true);
                                            long j = unsafe.getLong(VMRuntime.class, this.A03);
                                            if (j == 0 || (i2 = unsafe.getInt(j)) == 0) {
                                                return false;
                                            }
                                            for (int i3 = 0; i3 < i2; i3++) {
                                                unsafe.putLong(declaredMethod, this.A05, (i3 * this.A01) + j + this.A00);
                                                if (declaredMethod.getName().equals("setHiddenApiExemptions")) {
                                                    declaredMethod.invoke(VMRuntime.getRuntime(), ApiExemption.EXEMPTIONS);
                                                    return true;
                                                }
                                            }
                                        } catch (Throwable unused2) {
                                        }
                                    }
                                    return false;
                                }

                                {
                                    boolean z3;
                                    this.A06 = false;
                                    try {
                                        Unsafe unsafe = (Unsafe) Unsafe.class.getDeclaredMethod("getUnsafe", new Class[0]).invoke(null, new Object[0]);
                                        this.A04 = unsafe;
                                        if (unsafe == null) {
                                            return;
                                        }
                                        this.A03 = unsafe.objectFieldOffset(Structs.Class.class.getDeclaredField("methods"));
                                        this.A05 = this.A04.objectFieldOffset(Structs.Executable.class.getDeclaredField("artMethod"));
                                        this.A02 = this.A04.objectFieldOffset(Structs.MethodHandle.class.getDeclaredField("artFieldOrMethod"));
                                        Unsafe unsafe2 = this.A04;
                                        if (unsafe2 == null) {
                                            z3 = false;
                                        } else {
                                            try {
                                                Method declaredMethod = Structs.Stub.class.getDeclaredMethod("f1", new Class[0]);
                                                declaredMethod.setAccessible(true);
                                                Method declaredMethod2 = Structs.Stub.class.getDeclaredMethod("f2", new Class[0]);
                                                declaredMethod2.setAccessible(true);
                                                MethodHandle unreflect = MethodHandles.lookup().unreflect(declaredMethod);
                                                MethodHandle unreflect2 = MethodHandles.lookup().unreflect(declaredMethod2);
                                                long j = this.A02;
                                                long j2 = unsafe2.getLong(unreflect, j);
                                                long j3 = unsafe2.getLong(unreflect2, j);
                                                long j4 = unsafe2.getLong(Structs.Stub.class, this.A03);
                                                long j5 = j3 - j2;
                                                this.A01 = j5;
                                                this.A00 = (j2 - j4) - j5;
                                                z3 = true;
                                            } catch (Throwable unused2) {
                                                z3 = false;
                                            }
                                        }
                                        this.A06 = z3;
                                    } catch (Throwable unused3) {
                                    }
                                }
                            }.A00();
                        }
                    }
                    z = false;
                }
                sResult = z;
                sCalled = true;
                C0H8.A00 = sResult;
                z2 = sResult;
            }
        }
        return z2;
    }
}
