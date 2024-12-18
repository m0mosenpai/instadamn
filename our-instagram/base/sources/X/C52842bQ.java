package X;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.Configuration;
import android.graphics.Point;
import android.graphics.Rect;
import android.inputmethodservice.InputMethodService;
import android.os.Build;
import android.view.Display;
import android.view.WindowManager;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;

/* renamed from: X.2bQ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C52842bQ implements InterfaceC52852bR {
    public static final C52842bQ A00 = new Object();
    public static final ArrayList A01 = AbstractC16960so.A1M(1, 2, 4, 8, 16, 32, 64, 128);

    /* JADX WARN: Removed duplicated region for block: B:36:0x0121  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.graphics.Rect A01(android.app.Activity r11) {
        /*
            Method dump skipped, instructions count: 350
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C52842bQ.A01(android.app.Activity):android.graphics.Rect");
    }

    public final Rect A02(Activity activity) {
        Configuration configuration = activity.getResources().getConfiguration();
        try {
            Field declaredField = Configuration.class.getDeclaredField("windowConfiguration");
            declaredField.setAccessible(true);
            Object obj = declaredField.get(configuration);
            Object invoke = obj.getClass().getDeclaredMethod("getBounds", new Class[0]).invoke(obj, new Object[0]);
            C14360o3.A0C(invoke, "null cannot be cast to non-null type android.graphics.Rect");
            return new Rect((Rect) invoke);
        } catch (IllegalAccessException | NoSuchFieldException | NoSuchMethodException | InvocationTargetException e) {
            android.util.Log.w("WindowMetricsCalculatorCompat", e);
            return A01(activity);
        }
    }

    @Override // X.InterfaceC52852bR
    public final C52882bU AIr(Activity activity) {
        Rect A012;
        C011504d A002;
        C14360o3.A0B(activity, 0);
        int i = Build.VERSION.SDK_INT;
        if (i >= 30) {
            A012 = AbstractC52862bS.A00(activity);
            A002 = A00(activity);
        } else {
            if (i >= 29) {
                A012 = A02(activity);
            } else {
                A012 = A01(activity);
            }
            A002 = new C04Z().A00.A00();
            C14360o3.A07(A002);
        }
        return new C52882bU(A002, new C52872bT(A012));
    }

    @Override // X.InterfaceC52852bR
    public final C52882bU AIs(Context context) {
        C14360o3.A0B(context, 0);
        if (Build.VERSION.SDK_INT >= 30) {
            return AbstractC52862bS.A03(context);
        }
        Context context2 = context;
        while (context2 instanceof ContextWrapper) {
            if (!(context2 instanceof Activity) && !(context2 instanceof InputMethodService)) {
                ContextWrapper contextWrapper = (ContextWrapper) context2;
                if (contextWrapper.getBaseContext() != null) {
                    context2 = contextWrapper.getBaseContext();
                    C14360o3.A07(context2);
                }
            }
            if (context2 instanceof Activity) {
                return AIr((Activity) context2);
            }
            if (context2 instanceof InputMethodService) {
                Object systemService = context.getSystemService("window");
                C14360o3.A0C(systemService, "null cannot be cast to non-null type android.view.WindowManager");
                Display defaultDisplay = ((WindowManager) systemService).getDefaultDisplay();
                C14360o3.A07(defaultDisplay);
                Point point = new Point();
                defaultDisplay.getRealSize(point);
                Rect rect = new Rect(0, 0, point.x, point.y);
                C011504d A002 = new C04Z().A00.A00();
                C14360o3.A07(A002);
                return new C52882bU(A002, new C52872bT(rect));
            }
            StringBuilder sb = new StringBuilder();
            sb.append(context);
            sb.append(" is not a UiContext");
            throw new IllegalArgumentException(sb.toString());
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Context ");
        sb2.append(context);
        sb2.append(" is not a UiContext");
        throw new IllegalArgumentException(sb2.toString());
    }

    @Override // X.InterfaceC52852bR
    public final C52882bU AIw(Context context) {
        Rect rect;
        C011504d A002;
        if (Build.VERSION.SDK_INT >= 30) {
            rect = AbstractC52862bS.A01(context);
            A002 = A00(context);
        } else {
            Object systemService = context.getSystemService("window");
            C14360o3.A0C(systemService, "null cannot be cast to non-null type android.view.WindowManager");
            Display defaultDisplay = ((WindowManager) systemService).getDefaultDisplay();
            C14360o3.A07(defaultDisplay);
            Point point = new Point();
            defaultDisplay.getRealSize(point);
            rect = new Rect(0, 0, point.x, point.y);
            A002 = new C04Z().A00.A00();
            C14360o3.A07(A002);
        }
        return new C52882bU(A002, new C52872bT(rect));
    }

    public static final C011504d A00(Context context) {
        if (Build.VERSION.SDK_INT >= 30) {
            return AbstractC52862bS.A02(context);
        }
        throw new Exception("Incompatible SDK version");
    }
}
