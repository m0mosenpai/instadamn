package X;

import android.content.Context;
import android.content.res.Resources;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import com.facebook.R;

/* renamed from: X.2c7, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC53242c7 {
    public static int A0G(Context context, int i) {
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(i, typedValue, true);
        return (int) typedValue.getDimension(context.getResources().getDisplayMetrics());
    }

    public static int A0H(Context context, int i) {
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(i, typedValue, true);
        return typedValue.resourceId;
    }

    public static ContextThemeWrapper A0I(Context context, int i) {
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(i, typedValue, true);
        return new ContextThemeWrapper(context, typedValue.resourceId);
    }

    public static Integer A0J(Context context, int i) {
        TypedValue typedValue = new TypedValue();
        if (context.getTheme().resolveAttribute(i, typedValue, true) && typedValue.type == 5) {
            return Integer.valueOf((int) typedValue.getDimension(context.getResources().getDisplayMetrics()));
        }
        return null;
    }

    public static boolean A0L(Context context, int i, boolean z) {
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(i, typedValue, true);
        if (typedValue.type == 18) {
            if (typedValue.data == 0) {
                return false;
            }
            return true;
        }
        return z;
    }

    public static int A00(Context context) {
        return A0F(context, R.attr.igds_color_primary_background);
    }

    public static int A01(Context context) {
        return A0F(context, R.attr.glyphColorPrimary);
    }

    public static int A02(Context context) {
        return A0H(context, R.attr.igds_color_elevated_background);
    }

    public static int A03(Context context) {
        return A0H(context, R.attr.igds_color_error_or_destructive);
    }

    public static int A04(Context context) {
        return A0H(context, R.attr.igds_color_highlight_background);
    }

    public static int A05(Context context) {
        return A0H(context, R.attr.igds_color_icon_on_color);
    }

    public static int A06(Context context) {
        return A0H(context, R.attr.igds_color_link);
    }

    public static int A07(Context context) {
        return A0H(context, R.attr.igds_color_primary_text);
    }

    public static int A08(Context context) {
        return A0H(context, R.attr.igds_color_primary_icon);
    }

    public static int A09(Context context) {
        return A0H(context, R.attr.igds_color_secondary_text);
    }

    public static int A0A(Context context) {
        return A0H(context, R.attr.igds_color_primary_text_on_media);
    }

    public static int A0B(Context context) {
        return A0H(context, R.attr.igds_color_secondary_icon);
    }

    public static int A0C(Context context) {
        return A0H(context, R.attr.igds_color_primary_button);
    }

    public static int A0D(Context context) {
        return A0H(context, R.attr.igds_color_primary_background);
    }

    public static int A0E(Context context) {
        return A0H(context, R.attr.igds_color_text_on_color);
    }

    public static int A0F(Context context, int i) {
        Resources.Theme theme = context.getTheme();
        TypedValue typedValue = new TypedValue();
        theme.resolveAttribute(i, typedValue, true);
        return typedValue.data;
    }

    public static String A0K(Context context) {
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(R.attr.appName, typedValue, true);
        return typedValue.string.toString();
    }
}
