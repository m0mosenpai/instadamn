package X;

import android.content.Context;
import android.util.DisplayMetrics;
import android.view.WindowManager;
import com.facebook.react.bridge.WritableNativeMap;
import com.instagram.react.modules.product.IgReactMediaPickerNativeModule;

/* renamed from: X.SiD, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C63356SiD {
    public static DisplayMetrics A00;
    public static DisplayMetrics A01;

    public static final void A03(Context context) {
        C14360o3.A0B(context, 0);
        DisplayMetrics A0K = AbstractC167007dF.A0K(context);
        A01 = A0K;
        DisplayMetrics displayMetrics = new DisplayMetrics();
        displayMetrics.setTo(A0K);
        Object systemService = context.getSystemService("window");
        C14360o3.A0C(systemService, "null cannot be cast to non-null type android.view.WindowManager");
        ((WindowManager) systemService).getDefaultDisplay().getRealMetrics(displayMetrics);
        A00 = displayMetrics;
    }

    public static final void A04(Context context) {
        C14360o3.A0B(context, 0);
        if (A00 == null) {
            A03(context);
        }
    }

    public static final DisplayMetrics A00() {
        DisplayMetrics displayMetrics = A01;
        if (displayMetrics != null) {
            return displayMetrics;
        }
        throw AbstractC166987dD.A14("DisplayMetricsHolder must be initialized with initDisplayMetricsIfNotInitialized or initDisplayMetrics");
    }

    public static final WritableNativeMap A01(double d) {
        if (A01 != null) {
            if (A00 != null) {
                WritableNativeMap A0c = AbstractC58321PtD.A0c();
                DisplayMetrics displayMetrics = A01;
                C14360o3.A0C(displayMetrics, "null cannot be cast to non-null type android.util.DisplayMetrics");
                A0c.putMap("windowPhysicalPixels", A02(displayMetrics, d));
                DisplayMetrics displayMetrics2 = A00;
                C14360o3.A0C(displayMetrics2, "null cannot be cast to non-null type android.util.DisplayMetrics");
                A0c.putMap("screenPhysicalPixels", A02(displayMetrics2, d));
                return A0c;
            }
            throw AbstractC166987dD.A14("DisplayMetricsHolder must be initialized with initDisplayMetricsIfNotInitialized or initDisplayMetrics");
        }
        throw AbstractC166987dD.A14("DisplayMetricsHolder must be initialized with initDisplayMetricsIfNotInitialized or initDisplayMetrics");
    }

    public static final WritableNativeMap A02(DisplayMetrics displayMetrics, double d) {
        WritableNativeMap A0c = AbstractC58321PtD.A0c();
        A0c.putInt(IgReactMediaPickerNativeModule.WIDTH, displayMetrics.widthPixels);
        A0c.putInt(IgReactMediaPickerNativeModule.HEIGHT, displayMetrics.heightPixels);
        A0c.putDouble("scale", displayMetrics.density);
        A0c.putDouble("fontScale", d);
        A0c.putDouble("densityDpi", displayMetrics.densityDpi);
        return A0c;
    }
}
