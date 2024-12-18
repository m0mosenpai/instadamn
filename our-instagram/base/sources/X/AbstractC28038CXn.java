package X;

import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.View;
import android.widget.EditText;

/* renamed from: X.CXn, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC28038CXn {
    public static void A00(View view, C6FG c6fg, C102884kP c102884kP) {
        if (Build.VERSION.SDK_INT >= 29) {
            EditText editText = (EditText) view;
            Object A06 = AnonymousClass634.A06(c6fg, c102884kP);
            A06.getClass();
            ((COZ) A06).A00 = editText.getTextCursorDrawable();
            editText.setTextCursorDrawable((Drawable) null);
        }
    }

    public static void A01(View view, C6FG c6fg, C102884kP c102884kP) {
        if (Build.VERSION.SDK_INT >= 29) {
            Object A06 = AnonymousClass634.A06(c6fg, c102884kP);
            A06.getClass();
            COZ coz = (COZ) A06;
            ((EditText) view).setTextCursorDrawable(coz.A00);
            coz.A00 = null;
        }
    }
}
