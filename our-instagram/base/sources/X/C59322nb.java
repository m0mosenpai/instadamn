package X;

import android.animation.ValueAnimator;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;

/* renamed from: X.2nb, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C59322nb {
    public ValueAnimator A00;
    public ColorFilter A01;
    public Rect A02;
    public C59182nJ A03;
    public AbstractC59442nn A04;
    public InterfaceC16660sJ A05;
    public InterfaceC16820sZ A06;
    public InterfaceC16820sZ A07;
    public final ValueAnimator.AnimatorUpdateListener A08;
    public final Paint A09;
    public final C59332nc A0A;

    public final void A00(int i) {
        this.A09.setAlpha(i);
        InterfaceC16820sZ interfaceC16820sZ = this.A07;
        if (interfaceC16820sZ != null) {
            interfaceC16820sZ.invoke();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0132  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A01(android.graphics.ColorFilter r22, android.graphics.Rect r23, X.C3QJ r24, X.C59182nJ r25, X.AbstractC59442nn r26) {
        /*
            Method dump skipped, instructions count: 488
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C59322nb.A01(android.graphics.ColorFilter, android.graphics.Rect, X.3QJ, X.2nJ, X.2nn):void");
    }

    public final void A02(boolean z) {
        ValueAnimator valueAnimator;
        this.A0A.A01 = null;
        AbstractC59442nn abstractC59442nn = this.A04;
        if (abstractC59442nn != null) {
            abstractC59442nn.A04();
            abstractC59442nn.A05(null);
        }
        this.A04 = null;
        this.A03 = null;
        this.A05 = null;
        this.A02 = null;
        this.A09.reset();
        this.A01 = null;
        if (z && (valueAnimator = this.A00) != null) {
            valueAnimator.end();
        }
        this.A00 = null;
    }

    public C59322nb(InterfaceC16820sZ interfaceC16820sZ, InterfaceC16820sZ interfaceC16820sZ2) {
        this.A06 = interfaceC16820sZ;
        this.A07 = interfaceC16820sZ2;
        this.A0A = new C59332nc(null);
        this.A09 = new Paint();
        this.A08 = new ValueAnimator.AnimatorUpdateListener() { // from class: X.2nd
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                C14360o3.A0B(valueAnimator, 0);
                C59322nb c59322nb = C59322nb.this;
                Object animatedValue = valueAnimator.getAnimatedValue();
                C14360o3.A0C(animatedValue, "null cannot be cast to non-null type kotlin.Int");
                c59322nb.A00(((Number) animatedValue).intValue());
            }
        };
    }

    public C59322nb() {
        this(null, null);
    }
}
