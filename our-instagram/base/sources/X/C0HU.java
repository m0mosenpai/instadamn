package X;

import android.app.ActivityClient;
import android.app.ActivityManager;
import android.app.ActivityThread;
import android.app.Application;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.catalyst.modules.netinfo.NetInfoModule;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import org.webrtc.MediaStreamTrack;

/* renamed from: X.0HU, reason: invalid class name */
/* loaded from: classes.dex */
public abstract class C0HU {
    public static final List A00 = new CopyOnWriteArrayList();
    public static final java.util.Set A01 = new HashSet();
    public static final Map A02 = new HashMap();

    public static void A00() {
        if (A02.isEmpty()) {
            A04(new C0HY() { // from class: X.0Lj
                @Override // X.C0HY
                public final void A00(Context context, C0HC c0hc) {
                    Class A012;
                    Field A03;
                    Class A013;
                    Field A032 = c0hc.A03(ActivityManager.class, "IActivityManagerSingleton");
                    Object obj = null;
                    if (A032 != null) {
                        try {
                            obj = A032.get(null);
                        } catch (Exception unused) {
                        }
                        if (obj != null && (A012 = c0hc.A01("android.util.Singleton")) != null && (A03 = c0hc.A03(A012, "mInstance")) != null) {
                            try {
                                Object obj2 = A03.get(obj);
                                if (obj2 != null && (A013 = c0hc.A01("android.app.IActivityManager")) != null) {
                                    A03.set(obj, new C0HX(A013, obj2, this.A02, true).A00);
                                }
                            } catch (Exception unused2) {
                            }
                        }
                    }
                }
            });
            int i = Build.VERSION.SDK_INT;
            if (i >= 29) {
                A04(new C0HY() { // from class: X.0Li
                    @Override // X.C0HY
                    public final void A00(Context context, C0HC c0hc) {
                        Field A03;
                        Class A012;
                        Field A032;
                        Object obj;
                        Class A013;
                        Class A014 = c0hc.A01("android.app.ActivityTaskManager");
                        if (A014 != null && (A03 = c0hc.A03(A014, "IActivityTaskManagerSingleton")) != null) {
                            try {
                                Object obj2 = A03.get(null);
                                if (obj2 != null && (A012 = c0hc.A01("android.util.Singleton")) != null && (A032 = c0hc.A03(A012, "mInstance")) != null && (obj = A032.get(obj2)) != null && (A013 = c0hc.A01("android.app.IActivityTaskManager")) != null) {
                                    A032.set(obj2, new C0HX(A013, obj, this.A02, true).A00);
                                }
                            } catch (Exception unused) {
                            }
                        }
                    }
                });
                if (i >= 31) {
                    A04(new C0HY() { // from class: X.0Ll
                        @Override // X.C0HY
                        public final void A00(Context context, C0HC c0hc) {
                            Class A012;
                            Field A03;
                            Object obj;
                            Class A013;
                            Method A04 = c0hc.A04(ActivityClient.class, "getActivityClientController", null);
                            if (A04 != null) {
                                try {
                                    A04.invoke(null, null);
                                } catch (Exception unused) {
                                }
                                Field A032 = c0hc.A03(ActivityClient.class, "INTERFACE_SINGLETON");
                                if (A032 != null) {
                                    try {
                                        Object obj2 = A032.get(null);
                                        if (obj2 != null && (A012 = c0hc.A01("android.util.Singleton")) != null && (A03 = c0hc.A03(A012, "mInstance")) != null && (obj = A03.get(obj2)) != null && (A013 = c0hc.A01("android.app.IActivityClientController")) != null) {
                                            A03.set(obj2, new C0HX(A013, obj, this.A02, true).A00);
                                        }
                                    } catch (Exception unused2) {
                                    }
                                }
                            }
                        }
                    });
                }
            }
            A04(new C0HY() { // from class: X.0Lc
                @Override // X.C0HY
                public final void A00(Context context, C0HC c0hc) {
                    Field A03;
                    Class A012;
                    Object obj;
                    Class A013 = c0hc.A01("android.view.WindowManagerGlobal");
                    if (A013 != null && (A03 = c0hc.A03(A013, "sWindowManagerService")) != null) {
                        try {
                            Object obj2 = A03.get(null);
                            if (obj2 != null && (A012 = c0hc.A01("android.view.IWindowManager")) != null && (obj = new C0HX(A012, obj2, this.A02, true).A00) != null) {
                                A03.set(null, obj);
                            }
                        } catch (Exception unused) {
                        }
                    }
                }
            });
            A04(new C0HY() { // from class: X.0Lg
                @Override // X.C0HY
                public final void A00(Context context, C0HC c0hc) {
                    Field A03;
                    Field A032;
                    Object obj;
                    Class A012;
                    Class A013 = c0hc.A01("android.hardware.display.DisplayManagerGlobal");
                    if (A013 != null && (A03 = c0hc.A03(A013, "sInstance")) != null) {
                        try {
                            Object obj2 = A03.get(null);
                            if (obj2 != null && (A032 = c0hc.A03(A013, "mDm")) != null && (obj = A032.get(obj2)) != null && (A012 = c0hc.A01("android.hardware.display.IDisplayManager")) != null) {
                                A032.set(obj2, new C0HX(A012, obj, this.A02, true).A00);
                            }
                        } catch (Exception unused) {
                        }
                    }
                }
            });
            A04(new C0HY() { // from class: X.0Lf
                @Override // X.C0HY
                public final void A00(Context context, C0HC c0hc) {
                    ActivityThread currentActivityThread;
                    Field A03;
                    Field A032;
                    Class A012;
                    PackageManager packageManager = context.getPackageManager();
                    if (packageManager != null && (currentActivityThread = ActivityThread.currentActivityThread()) != null && (A03 = c0hc.A03(currentActivityThread.getClass(), "sPackageManager")) != null && (A032 = c0hc.A03(packageManager.getClass(), "mPM")) != null) {
                        try {
                            Object obj = A032.get(packageManager);
                            if (obj != null && (A012 = c0hc.A01("android.content.pm.IPackageManager")) != null) {
                                Object obj2 = new C0HX(A012, obj, this.A02, true).A00;
                                if (obj2 != null) {
                                    try {
                                        A03.set(null, obj2);
                                    } catch (Exception unused) {
                                    }
                                }
                                A032.set(packageManager, obj2);
                            }
                        } catch (Exception unused2) {
                        }
                    }
                }
            });
            A04(new C0HY("connectivity", "mService", "android.net.IConnectivityManager"));
            A04(new C0HY("alarm", "mService", "android.app.IAlarmManager"));
            A04(new C0HY("power", "mService", "android.os.IPowerManager"));
            A04(new C0HY("location", "mService", "android.location.ILocationManager"));
            A04(new C0HY(NetInfoModule.CONNECTION_TYPE_WIFI, "mService", "android.net.wifi.IWifiManager"));
            A04(new C0HY("accessibility", "mService", "android.view.accessibility.IAccessibilityManager"));
            A04(new C0HY("storage", "mStorageManager", "android.os.storage.IStorageManager"));
            A04(new C0HY("storagestats", "mService", "android.app.usage.IStorageStatsManager"));
            A04(new C0HY("account", "mService", "android.accounts.IAccountManager"));
            A04(new C0HY("clipboard", "mService", "android.content.IClipboard"));
            A04(new C0HY("notification", "sService", "android.app.INotificationManager", "getService"));
            A04(new C0HY(MediaStreamTrack.AUDIO_TRACK_KIND, "sService", "android.media.IAudioService", "getService"));
            A04(new C0HY("appops", "mService", "com.android.internal.app.IAppOpsService"));
            A04(new C0HY("batterymanager", "mBatteryStats", "com.android.internal.app.IBatteryStats"));
            A04(new C0HY("jobscheduler", "mBinder", "android.app.job.IJobScheduler"));
            A04(new C0HY(PublicKeyCredentialControllerUtility.JSON_KEY_USER, "mService", "android.os.IUserManager"));
        }
    }

    public static void A03(C0HV c0hv) {
        List list = A00;
        if (!list.contains(c0hv)) {
            list.add(c0hv);
        }
    }

    public static void A04(C0HY c0hy) {
        A02.put(c0hy.A02, c0hy);
    }

    public static void A01(Context context) {
        A00();
        try {
            for (C0HY c0hy : A02.values()) {
                if (!A01.contains(c0hy.A02)) {
                    c0hy.A00(context, C0HC.A00());
                }
            }
        } catch (Error | Exception unused) {
        }
    }

    public static void A02(Context context, String str) {
        A00();
        try {
            Map map = A02;
            if (map.containsKey(str)) {
                C0HY c0hy = (C0HY) map.get(str);
                if (!A01.contains(c0hy.A02)) {
                    c0hy.A00(context, C0HC.A00());
                }
            }
        } catch (Error | Exception unused) {
        }
    }

    public static void A05(String str) {
        Application application = ActivityThread.currentActivityThread().getApplication();
        if (application != null) {
            A02(application, str);
        }
    }
}
