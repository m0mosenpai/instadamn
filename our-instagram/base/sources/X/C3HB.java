package X;

import android.content.Context;
import android.util.TypedValue;
import com.facebook.R;

/* renamed from: X.3HB, reason: invalid class name */
/* loaded from: classes2.dex */
public abstract class C3HB {
    public static final int A00(Context context) {
        C14360o3.A0B(context, 0);
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(R.attr.actionBarHeight, typedValue, true);
        if (typedValue.type != 5) {
            C0w9.A03("ActionBarDimensions", "Could't find action bar height attr.");
            return context.getResources().getDimensionPixelSize(R.dimen.action_button_settings_height);
        }
        return (int) typedValue.getDimension(context.getResources().getDisplayMetrics());
    }
}
