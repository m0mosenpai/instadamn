package X;

import android.animation.ValueAnimator;
import android.view.animation.OvershootInterpolator;

/* renamed from: X.D8r, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C29721D8r extends C0YY implements InterfaceC16820sZ {
    public final /* synthetic */ float A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ C76223bS A02;
    public final /* synthetic */ C2XI A03;
    public final /* synthetic */ C77123cy A04;
    public final /* synthetic */ C77123cy A05;
    public final /* synthetic */ C26590Bon A06;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C29721D8r(C76223bS c76223bS, C2XI c2xi, C77123cy c77123cy, C77123cy c77123cy2, C26590Bon c26590Bon, float f, int i) {
        super(0);
        this.A06 = c26590Bon;
        this.A05 = c77123cy;
        this.A03 = c2xi;
        this.A01 = i;
        this.A00 = f;
        this.A04 = c77123cy2;
        this.A02 = c76223bS;
    }

    @Override // X.InterfaceC16820sZ
    public final /* bridge */ /* synthetic */ Object invoke() {
        long j;
        C26590Bon c26590Bon = this.A06;
        OvershootInterpolator overshootInterpolator = C26590Bon.A0h;
        if (c26590Bon.A09 && c26590Bon.A0C) {
            C77123cy c77123cy = this.A05;
            if (AbstractC166987dD.A1a(AbstractC25225BEi.A12(c77123cy))) {
                this.A03.A00(C26590Bon.A03(this.A00, this.A01, 0, 0, false, false));
            } else {
                C77123cy c77123cy2 = this.A04;
                AbstractC25233BEq.A1C(c77123cy2);
                ValueAnimator ofFloat = ValueAnimator.ofFloat(1.0f, 0.0f);
                int i = this.A01;
                C76223bS c76223bS = this.A02;
                C2XI c2xi = this.A03;
                float f = this.A00;
                if (c26590Bon.A0D) {
                    j = 300;
                } else {
                    j = 0;
                }
                ofFloat.setDuration(j);
                ofFloat.addUpdateListener(new C28520CiE(c76223bS, c2xi, c26590Bon, f, i));
                ofFloat.addListener(new BQM(c77123cy, 6));
                ofFloat.start();
                C2XV.A00();
                c77123cy2.A00 = ofFloat;
            }
        }
        return AbstractC25225BEi.A0f(new C29903DGr(this.A04, 26));
    }
}
