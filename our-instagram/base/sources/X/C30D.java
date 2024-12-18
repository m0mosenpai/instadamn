package X;

import android.app.Activity;
import android.view.Window;
import com.facebook.R;

/* renamed from: X.30D, reason: invalid class name */
/* loaded from: classes2.dex */
public abstract class C30D {
    public static int A00;
    public static int A01;
    public static Integer A02;
    public static Integer A03;

    public static void A02(Activity activity) {
        Integer num = A02;
        if (num == null) {
            num = Integer.valueOf(activity.getColor(R.color.igds_transparent_navigation_bar));
            A02 = num;
        }
        A04(activity, num.intValue());
        A06(activity, false);
    }

    public static int A00(Activity activity) {
        activity.getClass();
        Window window = activity.getWindow();
        window.getClass();
        return window.getNavigationBarColor();
    }

    public static void A01(Activity activity) {
        int color;
        if (!C1H6.A03()) {
            Integer num = A03;
            if (num == null) {
                if (activity.getClass().getName().equals("com.instagram.mainactivity.InstagramMainActivity")) {
                    color = AbstractC53242c7.A0F(activity, android.R.attr.navigationBarColor);
                } else {
                    color = activity.getColor(AbstractC53242c7.A0H(activity, R.attr.igds_color_primary_background));
                }
                num = Integer.valueOf(color);
                A03 = num;
            }
            A04(activity, num.intValue());
            A06(activity, true);
            return;
        }
        A02(activity);
    }

    public static void A03(Activity activity) {
        Window window = activity.getWindow();
        window.getClass();
        window.addFlags(134217728);
        window.addFlags(Integer.MIN_VALUE);
    }

    public static void A04(Activity activity, int i) {
        if (AbstractC13180m4.A02(activity)) {
            A05(activity, i);
        }
        while (activity.getParent() != null) {
            activity = activity.getParent();
        }
        Window window = activity.getWindow();
        window.getClass();
        window.addFlags(Integer.MIN_VALUE);
        window.setNavigationBarColor(i);
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0023, code lost:
    
        if (r5 == r3) goto L10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void A05(android.app.Activity r4, int r5) {
        /*
            r0 = 2131100481(0x7f060341, float:1.7813345E38)
            int r3 = r4.getColor(r0)
            r0 = 2131100175(0x7f06020f, float:1.7812724E38)
            int r2 = r4.getColor(r0)
        Le:
            android.app.Activity r0 = r4.getParent()
            if (r0 == 0) goto L19
            android.app.Activity r4 = r4.getParent()
            goto Le
        L19:
            android.view.Window r1 = r4.getWindow()
            r1.getClass()
            if (r5 == r2) goto L25
            r0 = 1
            if (r5 != r3) goto L26
        L25:
            r0 = 0
        L26:
            r1.setNavigationBarContrastEnforced(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C30D.A05(android.app.Activity, int):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0017, code lost:
    
        if (X.C1H6.A03() != false) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void A06(android.app.Activity r2, boolean r3) {
        /*
            android.view.Window r1 = r2.getWindow()
            r1.getClass()
            android.view.View r0 = r1.getDecorView()
            X.04h r2 = new X.04h
            r2.<init>(r0, r1)
            if (r3 == 0) goto L19
            boolean r0 = X.C1H6.A03()
            r1 = 1
            if (r0 == 0) goto L1a
        L19:
            r1 = 0
        L1a:
            X.04f r0 = r2.A00
            r0.A04(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C30D.A06(android.app.Activity, boolean):void");
    }
}
