package X;

import android.animation.ValueAnimator;
import android.view.animation.OvershootInterpolator;

/* renamed from: X.BWk, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C25674BWk extends C0YY implements InterfaceC16820sZ {
    public final /* synthetic */ float A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ C76223bS A02;
    public final /* synthetic */ C2XI A03;
    public final /* synthetic */ C77123cy A04;
    public final /* synthetic */ C77123cy A05;
    public final /* synthetic */ BVJ A06;
    public final /* synthetic */ boolean A07;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C25674BWk(C76223bS c76223bS, C2XI c2xi, C77123cy c77123cy, C77123cy c77123cy2, BVJ bvj, float f, int i, boolean z) {
        super(0);
        this.A06 = bvj;
        this.A05 = c77123cy;
        this.A03 = c2xi;
        this.A01 = i;
        this.A00 = f;
        this.A07 = z;
        this.A04 = c77123cy2;
        this.A02 = c76223bS;
    }

    @Override // X.InterfaceC16820sZ
    public final /* bridge */ /* synthetic */ Object invoke() {
        long j;
        BVJ bvj = this.A06;
        OvershootInterpolator overshootInterpolator = BVJ.A0w;
        if (bvj.A0A && bvj.A0D) {
            C77123cy c77123cy = this.A05;
            if (AbstractC166987dD.A1a(AbstractC25225BEi.A12(c77123cy))) {
                this.A03.A00(BVJ.A03(this.A00, this.A01, 0, 0, false, this.A07));
            } else {
                C77123cy c77123cy2 = this.A04;
                AbstractC25233BEq.A1C(c77123cy2);
                ValueAnimator ofFloat = ValueAnimator.ofFloat(1.0f, 0.0f);
                int i = this.A01;
                C76223bS c76223bS = this.A02;
                C2XI c2xi = this.A03;
                float f = this.A00;
                boolean z = this.A07;
                if (bvj.A0E) {
                    j = 300;
                } else {
                    j = 0;
                }
                ofFloat.setDuration(j);
                ofFloat.addUpdateListener(new C28522CiG(c76223bS, c2xi, bvj, f, i, z));
                ofFloat.addListener(new BQM(c77123cy, 2));
                ofFloat.start();
                C2XV.A00();
                c77123cy2.A00 = ofFloat;
            }
        }
        return AbstractC25225BEi.A0f(new J8V(this.A04, 34));
    }
}
