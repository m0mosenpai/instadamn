package X;

import android.animation.ValueAnimator;

/* loaded from: classes8.dex */
public final class ME6 extends C0YY implements InterfaceC16820sZ {
    public final int A00;
    public final long A01;
    public final Object A02;
    public final Object A03;
    public final Object A04;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ME6(int i, long j, Object obj, Object obj2, Object obj3) {
        super(0);
        this.A00 = i;
        this.A04 = obj;
        this.A01 = j;
        this.A02 = obj2;
        this.A03 = obj3;
    }

    @Override // X.InterfaceC16820sZ
    public final /* bridge */ /* synthetic */ Object invoke() {
        C135276Ac c135276Ac;
        C78473fD c78473fD;
        C102884kP c102884kP;
        Object obj;
        switch (this.A00) {
            case 0:
                c135276Ac = C135266Ab.A04;
                c78473fD = (C78473fD) this.A03;
                c102884kP = ((WXf) this.A04).A00;
                obj = this.A02;
                break;
            case 1:
                c135276Ac = C135266Ab.A04;
                c78473fD = (C78473fD) this.A04;
                c102884kP = (C102884kP) this.A02;
                obj = this.A03;
                break;
            case 2:
                LJ8 lj8 = (LJ8) this.A04;
                lj8.A06 = false;
                lj8.A09.A00(C36J.A06(C36G.A06, C84303pN.A01.A00(this.A01)), ((C44997Jvn) this.A02).A06, true);
                AbstractC166987dD.A1Y(this.A03);
                return C0eB.A00;
            default:
                C77123cy c77123cy = (C77123cy) this.A02;
                AbstractC25233BEq.A1C(c77123cy);
                float[] A1b = AbstractC43592JPx.A1b();
                // fill-array-data instruction
                A1b[0] = 0.0f;
                A1b[1] = 1.0f;
                ValueAnimator ofFloat = ValueAnimator.ofFloat(A1b);
                C51762Yz c51762Yz = (C51762Yz) this.A04;
                long j = this.A01;
                Object obj2 = this.A03;
                ofFloat.setDuration(300L);
                ofFloat.addListener(new C47997LLn(c51762Yz, j));
                LLs.A00(ofFloat, obj2, 18);
                ofFloat.start();
                C2XV.A00();
                c77123cy.A00 = ofFloat;
                return new C79353gg(new C29904DGs(c77123cy, 6));
        }
        return c135276Ac.A03(c78473fD, c102884kP, ((C103054kg) obj).A03, this.A01);
    }
}
