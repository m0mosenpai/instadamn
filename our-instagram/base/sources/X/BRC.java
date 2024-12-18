package X;

import android.animation.Animator;

/* loaded from: classes5.dex */
public final class BRC extends C0YY implements InterfaceC16660sJ {
    public final /* synthetic */ Animator A00;
    public final /* synthetic */ Animator A01;
    public final /* synthetic */ Animator A02;
    public final /* synthetic */ C206209Bd A03;
    public final /* synthetic */ C2XI A04;
    public final /* synthetic */ String A05;
    public final /* synthetic */ InterfaceC16820sZ A06;
    public final /* synthetic */ boolean A07;
    public final /* synthetic */ boolean A08;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BRC(Animator animator, Animator animator2, Animator animator3, C206209Bd c206209Bd, C2XI c2xi, String str, InterfaceC16820sZ interfaceC16820sZ, boolean z, boolean z2) {
        super(1);
        this.A07 = z;
        this.A03 = c206209Bd;
        this.A05 = str;
        this.A04 = c2xi;
        this.A00 = animator;
        this.A08 = z2;
        this.A01 = animator2;
        this.A02 = animator3;
        this.A06 = interfaceC16820sZ;
    }

    @Override // X.InterfaceC16660sJ
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        if (this.A07) {
            C206209Bd c206209Bd = this.A03;
            InterfaceC16660sJ interfaceC16660sJ = (InterfaceC16660sJ) c206209Bd.A00;
            String str = this.A05;
            if (AbstractC25231BEo.A1a(str, interfaceC16660sJ)) {
                AbstractC25227BEk.A1D(this.A04, 1.0f);
            } else {
                this.A00.start();
                AbstractC25225BEi.A1U(c206209Bd.A01, str);
            }
        }
        if (this.A08) {
            this.A01.start();
            this.A02.start();
        }
        this.A06.invoke();
        return C0eB.A00;
    }
}
