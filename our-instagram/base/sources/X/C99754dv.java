package X;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.View;
import android.widget.TextView;

/* renamed from: X.4dv, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C99754dv extends AbstractC99734dr {
    public int A00;
    public ColorStateList A01;
    public ColorStateList A02;
    public Resources A03;
    public EnumC99714dp A04;
    public C1QL A05;
    public final Paint A06;
    public final RectF A07;
    public final C1QL A08;

    public C99754dv(EnumC99714dp enumC99714dp, C1QL c1ql) {
        C14360o3.A0B(c1ql, 1);
        C14360o3.A0B(enumC99714dp, 2);
        this.A08 = c1ql;
        this.A04 = enumC99714dp;
        this.A06 = new Paint(1);
        this.A07 = new RectF();
    }

    @Override // X.AbstractC99734dr
    public final void A09(View view, TextView textView, boolean z) {
        C14360o3.A0B(view, 2);
        A00(this, z, view.isPressed());
    }

    @Override // X.AbstractC99734dr
    public final void A0A(View view, TextView textView, boolean z) {
        C14360o3.A0B(view, 2);
        A00(this, view.isEnabled(), z);
        view.postInvalidate();
    }

    public static final void A00(C99754dv c99754dv, boolean z, boolean z2) {
        int i;
        C1QL c1ql = c99754dv.A05;
        if (c1ql == null) {
            c1ql = c99754dv.A08;
        }
        if (!c1ql.A00) {
            Paint paint = c99754dv.A06;
            if (z) {
                i = 255;
                if (z2) {
                    i = 179;
                }
            } else {
                i = 77;
            }
            paint.setAlpha(i);
        }
    }
}
