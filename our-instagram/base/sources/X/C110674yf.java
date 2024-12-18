package X;

import android.content.res.ColorStateList;
import android.view.View;
import android.widget.TextView;

/* renamed from: X.4yf, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C110674yf extends AbstractC99734dr {
    public ColorStateList A00;
    public final C1QL A01;

    public C110674yf(EnumC99714dp enumC99714dp, C1QL c1ql) {
        C14360o3.A0B(c1ql, 1);
        C14360o3.A0B(enumC99714dp, 2);
        this.A01 = c1ql;
    }

    @Override // X.AbstractC99734dr
    public final void A09(View view, TextView textView, boolean z) {
        C14360o3.A0B(textView, 1);
        C14360o3.A0B(view, 2);
        if (!this.A01.A00) {
            super.A09(view, textView, z);
        }
    }

    @Override // X.AbstractC99734dr
    public final void A0A(View view, TextView textView, boolean z) {
        C14360o3.A0B(textView, 1);
        C14360o3.A0B(view, 2);
        if (!this.A01.A00) {
            super.A0A(view, textView, z);
        }
    }
}
