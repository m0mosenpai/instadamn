package X;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes5.dex */
public final class D90 extends C0YY implements InterfaceC16820sZ {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ int A02;
    public final /* synthetic */ C50525MSe A03;
    public final /* synthetic */ C0f6 A04;
    public final /* synthetic */ C27086BxB A05;
    public final /* synthetic */ C5H0 A06;
    public final /* synthetic */ C3ZQ A07;
    public final /* synthetic */ C3ZQ A08;
    public final /* synthetic */ Iterable A09;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public D90(C50525MSe c50525MSe, C0f6 c0f6, C27086BxB c27086BxB, C5H0 c5h0, C3ZQ c3zq, C3ZQ c3zq2, Iterable iterable, int i, int i2, int i3) {
        super(0);
        this.A09 = iterable;
        this.A05 = c27086BxB;
        this.A06 = c5h0;
        this.A03 = c50525MSe;
        this.A04 = c0f6;
        this.A08 = c3zq;
        this.A02 = i;
        this.A01 = i2;
        this.A07 = c3zq2;
        this.A00 = i3;
    }

    @Override // X.InterfaceC16820sZ
    public final /* bridge */ /* synthetic */ Object invoke() {
        Iterable iterable = this.A09;
        C27086BxB c27086BxB = this.A05;
        ArrayList A0i = AbstractC167007dF.A0i(iterable);
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            A0i.add(((C09530e4) c27086BxB.A02.get(AbstractC167007dF.A0B(it))).A01);
        }
        C5H0 c5h0 = this.A06;
        ArrayList A0i2 = AbstractC167007dF.A0i(A0i);
        Iterator it2 = A0i.iterator();
        while (it2.hasNext()) {
            A0i2.add(c5h0.A03.invoke(it2.next(), AbstractC25227BEk.A0p(), "DynamicAdsNodeInjector"));
        }
        List A0a = AbstractC001800i.A0a(A0i2);
        C50525MSe c50525MSe = this.A03;
        C0f6 c0f6 = this.A04;
        C3ZQ c3zq = this.A08;
        int i = this.A02;
        int i2 = this.A01;
        return new C29173Cte(c50525MSe, c0f6, c27086BxB, c5h0, c3zq, this.A07, A0a, c5h0.A02, 0, AbstractC166987dD.A0H(AbstractC001800i.A09(iterable)), i, i2, this.A00);
    }
}
