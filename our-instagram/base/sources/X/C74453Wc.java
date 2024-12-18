package X;

import android.graphics.Rect;
import android.text.method.TransformationMethod;
import android.view.View;

/* renamed from: X.3Wc, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C74453Wc implements TransformationMethod {
    public final TransformationMethod A00;

    @Override // android.text.method.TransformationMethod
    public final void onFocusChanged(View view, CharSequence charSequence, boolean z, int i, Rect rect) {
        TransformationMethod transformationMethod = this.A00;
        if (transformationMethod != null) {
            transformationMethod.onFocusChanged(view, charSequence, z, i, rect);
        }
    }

    public C74453Wc(TransformationMethod transformationMethod) {
        this.A00 = transformationMethod;
    }

    @Override // android.text.method.TransformationMethod
    public final CharSequence getTransformation(CharSequence charSequence, View view) {
        if (!view.isInEditMode()) {
            TransformationMethod transformationMethod = this.A00;
            if (transformationMethod != null) {
                charSequence = transformationMethod.getTransformation(charSequence, view);
            }
            if (charSequence != null && C58341Ptc.A00().A01() == 1) {
                return C58341Ptc.A00().A02(charSequence, 0, charSequence.length());
            }
            return charSequence;
        }
        return charSequence;
    }
}
