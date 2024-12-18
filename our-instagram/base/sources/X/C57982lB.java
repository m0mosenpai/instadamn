package X;

import X.AbstractC008903d;
import X.AnonymousClass001;
import X.C0w9;
import X.C14360o3;
import X.C57982lB;
import android.app.Activity;
import android.app.Application;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.IBinder;
import android.view.View;
import android.view.Window;
import com.facebook.common.stringformat.StringFormatUtil;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.WeakHashMap;

/* renamed from: X.2lB, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C57982lB {
    public static int A03 = -1;
    public static int A04 = -1;
    public static int A05 = -1;
    public static int A06 = -1;
    public static Boolean A07;
    public static boolean A08;
    public static boolean A09;
    public boolean A00;
    public final List A01 = Collections.synchronizedList(new ArrayList());
    public final List A02 = Collections.synchronizedList(new ArrayList());
    public static final C57992lC A0B = new Object();
    public static final WeakHashMap A0C = new WeakHashMap();
    public static final Application.ActivityLifecycleCallbacks A0A = new Application.ActivityLifecycleCallbacks() { // from class: com.instagram.ui.windowinsets.WindowInsetsManager$Companion$REMOVE_ENTRY_LISTENER$1
        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityCreated(Activity activity, Bundle bundle) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityDestroyed(Activity activity) {
            C14360o3.A0B(activity, 0);
            C57982lB c57982lB = (C57982lB) C57982lB.A0C.remove(activity);
            if (c57982lB != null) {
                c57982lB.A01.clear();
                if (true == C57982lB.A09) {
                    c57982lB.A02.clear();
                    Window window = activity.getWindow();
                    if (window != null) {
                        AbstractC008903d.A00(window.getDecorView(), null);
                    } else {
                        C0w9.A03(AnonymousClass001.A0R("WindowInsetsManager", "_null_activity_window"), "onActivityDestroyed: The activity's window is null and unable to remove the window insets listener, potential memory leak");
                    }
                }
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityPaused(Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityResumed(Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityStarted(Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityStopped(Activity activity) {
        }
    };

    public static final void A00(Activity activity, InterfaceC59892oW interfaceC59892oW, boolean z) {
        A0B.A04(activity, interfaceC59892oW, z);
    }

    public C57982lB(final Activity activity) {
        final Window window = activity.getWindow();
        window.getClass();
        AbstractC008903d.A00(window.getDecorView(), new C03L() { // from class: X.2oX
            public int A00;

            @Override // X.C03L
            public final C011504d Cx7(View view, C011504d c011504d) {
                int i;
                C02I A01;
                int A082;
                Class<?> cls;
                Method method;
                int dimensionPixelSize;
                C14360o3.A0B(view, 0);
                C14360o3.A0B(c011504d, 1);
                C011304b c011304b = c011504d.A00;
                if (c011304b.A01().A03 == 0) {
                    int i2 = this.A00;
                    this.A00 = i2 + 1;
                    if (i2 < 4) {
                        view.requestApplyInsets();
                        return AbstractC010103p.A05(view, c011504d);
                    }
                }
                C57982lB c57982lB = this;
                c57982lB.A00 = true;
                C57982lB.A04 = c011504d.A03();
                C57982lB.A03 = c011504d.A02();
                boolean z = true;
                if (true != C57982lB.A09) {
                    z = false;
                }
                if (z) {
                    i = c011304b.A05(7).A03;
                    A01 = c011304b.A05(7);
                } else {
                    i = c011304b.A01().A03;
                    A01 = c011304b.A01();
                }
                int i3 = A01.A00;
                Window window2 = window;
                int i4 = window2.getAttributes().flags;
                boolean z2 = false;
                if ((window2.getAttributes().flags & 1024) != 0) {
                    z2 = true;
                }
                boolean z3 = false;
                if (C57982lB.A05 != -1) {
                    z3 = true;
                }
                int i5 = C57982lB.A06;
                boolean z4 = false;
                if (i5 != i) {
                    z4 = true;
                }
                if (z3 && z4) {
                    String formatStrLocaleSafe = StringFormatUtil.formatStrLocaleSafe("Status bar height: old=%d new=%d, Activity=%s RetryCount=%d isFullScreenFlagSet=%b windowFlags=0x%X", Integer.valueOf(i5), Integer.valueOf(i), activity.getClass().getSimpleName(), Integer.valueOf(this.A00), Boolean.valueOf(z2), Integer.valueOf(i4));
                    String A0R = AnonymousClass001.A0R("WindowInsetsManager", "_status_bar_height_changed");
                    C14360o3.A0A(formatStrLocaleSafe);
                    C0w9.A03(A0R, formatStrLocaleSafe);
                }
                boolean z5 = false;
                if (C57982lB.A06 != -1) {
                    z5 = true;
                }
                int i6 = C57982lB.A05;
                boolean z6 = false;
                if (i6 != i3) {
                    z6 = true;
                }
                if (z5 && z6) {
                    String formatStrLocaleSafe2 = StringFormatUtil.formatStrLocaleSafe("Nab bar height: old=%d new=%d, Activity=%s RetryCount=%d isFullScreenFlagSet=%b windowFlags=0x%X", Integer.valueOf(i6), Integer.valueOf(i3), activity.getClass().getSimpleName(), Integer.valueOf(this.A00), Boolean.valueOf(z2), Integer.valueOf(i4));
                    String A0R2 = AnonymousClass001.A0R("WindowInsetsManager", "_nab_bar_height_changed");
                    C14360o3.A0A(formatStrLocaleSafe2);
                    C0w9.A03(A0R2, formatStrLocaleSafe2);
                }
                if (i <= 0) {
                    Resources resources = activity.getResources();
                    C14360o3.A07(resources);
                    int i7 = this.A00;
                    int identifier = resources.getIdentifier("status_bar_height", "dimen", "android");
                    if (identifier <= 0) {
                        dimensionPixelSize = 0;
                    } else {
                        dimensionPixelSize = resources.getDimensionPixelSize(identifier);
                        if (dimensionPixelSize > 0) {
                            String formatStrLocaleSafe3 = StringFormatUtil.formatStrLocaleSafe("Status bar %d, status bar from res %d, nav bar %d, retry count %d", Integer.valueOf(i), Integer.valueOf(dimensionPixelSize), Integer.valueOf(i3), Integer.valueOf(i7));
                            String A0R3 = AnonymousClass001.A0R("WindowInsetsManager", "_status_bar_is_zero_v2");
                            C14360o3.A0A(formatStrLocaleSafe3);
                            C0w9.A03(A0R3, formatStrLocaleSafe3);
                        }
                    }
                    i = dimensionPixelSize;
                }
                if (i3 <= 0) {
                    boolean z7 = true;
                    if (true != C57982lB.A09) {
                        z7 = false;
                    }
                    if (!z7) {
                        Activity activity2 = activity;
                        int i8 = this.A00;
                        Resources resources2 = activity2.getResources();
                        C14360o3.A07(resources2);
                        Boolean bool = C57982lB.A07;
                        if (bool == null) {
                            boolean z8 = true;
                            try {
                                Class<?> cls2 = Class.forName("android.os.ServiceManager");
                                Object invoke = cls2.getMethod("getService", String.class).invoke(cls2, "window");
                                C14360o3.A0C(invoke, "null cannot be cast to non-null type android.os.IBinder");
                                Class<?> cls3 = Class.forName("android.view.IWindowManager$Stub");
                                Object invoke2 = cls3.getMethod("asInterface", IBinder.class).invoke(cls3, (IBinder) invoke);
                                Object obj = null;
                                if (invoke2 != null && (cls = invoke2.getClass()) != null && (method = cls.getMethod("hasNavigationBar", new Class[0])) != null) {
                                    obj = method.invoke(invoke2, new Object[0]);
                                }
                                C14360o3.A0C(obj, "null cannot be cast to non-null type kotlin.Boolean");
                                bool = (Boolean) obj;
                                C57982lB.A07 = bool;
                            } catch (ClassCastException | ClassNotFoundException | IllegalAccessException | IllegalArgumentException | NoSuchMethodException | SecurityException | InvocationTargetException e) {
                                C0w9.A07(AnonymousClass001.A0R("WindowInsetsManager", "_hasNavigationBar_notFound"), e);
                                int identifier2 = resources2.getIdentifier("config_showNavigationBar", "bool", "android");
                                if (identifier2 <= 0 || !resources2.getBoolean(identifier2)) {
                                    z8 = false;
                                }
                                bool = Boolean.valueOf(z8);
                                C57982lB.A07 = bool;
                            }
                        }
                        C14360o3.A0A(bool);
                        if (!bool.booleanValue()) {
                            A082 = 0;
                        } else {
                            A082 = AbstractC13880nE.A08(activity2);
                            String formatStrLocaleSafe4 = StringFormatUtil.formatStrLocaleSafe("Nav bar %d, Nav bar from res %d, status bar %s, retry count %d", Integer.valueOf(i3), Integer.valueOf(A082), Integer.valueOf(i), Integer.valueOf(i8));
                            String A0R4 = AnonymousClass001.A0R("WindowInsetsManager", "_stable_nav_bar_is_zero_v2");
                            C14360o3.A0A(formatStrLocaleSafe4);
                            C0w9.A03(A0R4, formatStrLocaleSafe4);
                        }
                        i3 = A082;
                    }
                }
                C57982lB.A06 = i;
                C57982lB.A05 = i3;
                C02R.A05(c57982lB.A00);
                List list = c57982lB.A01;
                Iterator it = new ArrayList(list).iterator();
                C14360o3.A07(it);
                while (it.hasNext()) {
                    ((InterfaceC59892oW) it.next()).Dnp(C57982lB.A06, C57982lB.A05);
                }
                List list2 = c57982lB.A02;
                Iterator it2 = new ArrayList(list2).iterator();
                C14360o3.A07(it2);
                while (it2.hasNext()) {
                    ((InterfaceC59892oW) it2.next()).Dnp(C57982lB.A06, C57982lB.A05);
                }
                if (true != C57982lB.A09) {
                    list.clear();
                }
                list2.clear();
                return AbstractC010103p.A05(view, c011504d);
            }
        });
        window.getDecorView().requestApplyInsets();
    }
}
