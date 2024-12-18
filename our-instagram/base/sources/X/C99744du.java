package X;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.View;
import android.widget.TextView;

/* renamed from: X.4du, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C99744du extends AbstractC99734dr {
    public float A00;
    public int A01;
    public ColorStateList A02;
    public ColorStateList A03;
    public ColorStateList A04;
    public Resources A05;
    public EnumC99714dp A06;
    public boolean A07;
    public final Paint A08;
    public final Paint A09;
    public final RectF A0A;
    public final RectF A0B;
    public final C1QL A0C;

    public C99744du(EnumC99714dp enumC99714dp, C1QL c1ql) {
        C14360o3.A0B(c1ql, 1);
        C14360o3.A0B(enumC99714dp, 2);
        this.A0C = c1ql;
        this.A06 = enumC99714dp;
        this.A09 = new Paint(1);
        this.A08 = new Paint(1);
        this.A0B = new RectF();
        this.A0A = new RectF();
    }

    @Override // X.AbstractC99734dr
    public final void A09(View view, TextView textView, boolean z) {
        C14360o3.A0B(textView, 1);
        A00(textView, this, false, z);
    }

    @Override // X.AbstractC99734dr
    public final void A0A(View view, TextView textView, boolean z) {
        C14360o3.A0B(textView, 1);
        C14360o3.A0B(view, 2);
        A00(textView, this, z, view.isEnabled());
        view.postInvalidate();
    }

    public static final void A00(TextView textView, C99744du c99744du, boolean z, boolean z2) {
        int i;
        float f;
        if (!c99744du.A0C.A00) {
            if (z2) {
                i = 255;
                f = 1.0f;
                if (z) {
                    i = 179;
                    f = 0.7f;
                }
            } else {
                i = 77;
                f = 0.3f;
            }
            c99744du.A09.setAlpha(i);
            textView.setAlpha(f);
        }
    }
}
