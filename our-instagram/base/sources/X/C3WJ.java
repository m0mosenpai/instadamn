package X;

import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.widget.TextView;

/* renamed from: X.3WJ, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C3WJ {
    public final C3WK A00;
    public final TextView A01;

    public final void A00(AttributeSet attributeSet, int i) {
        TypedArray obtainStyledAttributes = this.A01.getContext().obtainStyledAttributes(attributeSet, AbstractC53402cO.A08, i, 0);
        try {
            boolean z = true;
            if (obtainStyledAttributes.hasValue(14)) {
                z = obtainStyledAttributes.getBoolean(14, true);
            }
            obtainStyledAttributes.recycle();
            A02(z);
        } catch (Throwable th) {
            obtainStyledAttributes.recycle();
            throw th;
        }
    }

    public final void A01(boolean z) {
        this.A00.A00.A01(z);
    }

    public final void A02(boolean z) {
        this.A00.A00.A02(z);
    }

    public C3WJ(TextView textView) {
        this.A01 = textView;
        this.A00 = new C3WK(textView);
    }
}
