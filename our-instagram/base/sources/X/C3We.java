package X;

import android.graphics.Rect;
import android.text.method.TransformationMethod;
import android.view.View;
import java.util.Locale;

/* renamed from: X.3We, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C3We implements TransformationMethod {
    public static C3We A01;
    public final Locale A00;

    @Override // android.text.method.TransformationMethod
    public final void onFocusChanged(View view, CharSequence charSequence, boolean z, int i, Rect rect) {
    }

    @Override // android.text.method.TransformationMethod
    public final CharSequence getTransformation(CharSequence charSequence, View view) {
        if (charSequence != null) {
            return charSequence.toString().toUpperCase(this.A00);
        }
        return null;
    }

    public C3We(Locale locale) {
        this.A00 = locale;
    }
}
