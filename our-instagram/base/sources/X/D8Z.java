package X;

import android.animation.ValueAnimator;

/* loaded from: classes5.dex */
public final class D8Z extends C0YY implements InterfaceC16820sZ {
    public final /* synthetic */ int A00;
    public final /* synthetic */ C77123cy A01;
    public final /* synthetic */ C51762Yz A02;
    public final /* synthetic */ C51762Yz A03;
    public final /* synthetic */ boolean A04;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public D8Z(C77123cy c77123cy, C51762Yz c51762Yz, C51762Yz c51762Yz2, int i, boolean z) {
        super(0);
        this.A01 = c77123cy;
        this.A04 = z;
        this.A03 = c51762Yz;
        this.A00 = i;
        this.A02 = c51762Yz2;
    }

    @Override // X.InterfaceC16820sZ
    public final /* bridge */ /* synthetic */ Object invoke() {
        C77123cy c77123cy = this.A01;
        AbstractC25233BEq.A1C(c77123cy);
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        boolean z = this.A04;
        C51762Yz c51762Yz = this.A03;
        int i = this.A00;
        C51762Yz c51762Yz2 = this.A02;
        ofFloat.setDuration(400L);
        ofFloat.setStartDelay(1000L);
        ofFloat.addListener(new C28516CiA(c51762Yz, c51762Yz2, i, z));
        C2XV.A00();
        c77123cy.A00 = ofFloat;
        return AbstractC25225BEi.A0f(C29902DGq.A01(c77123cy, 45));
    }
}
