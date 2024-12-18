package X;

import androidx.compose.animation.core.SuspendAnimationKt;

/* renamed from: X.62Q, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C62Q extends C0YY implements InterfaceC16660sJ {
    public final /* synthetic */ float A00;
    public final /* synthetic */ C62D A01;
    public final /* synthetic */ C5Y2 A02;
    public final /* synthetic */ AbstractC118405Xc A03;
    public final /* synthetic */ Object A04;
    public final /* synthetic */ InterfaceC16660sJ A05;
    public final /* synthetic */ C15370ps A06;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C62Q(C62D c62d, C5Y2 c5y2, AbstractC118405Xc abstractC118405Xc, Object obj, InterfaceC16660sJ interfaceC16660sJ, C15370ps c15370ps, float f) {
        super(1);
        this.A06 = c15370ps;
        this.A04 = obj;
        this.A01 = c62d;
        this.A03 = abstractC118405Xc;
        this.A02 = c5y2;
        this.A00 = f;
        this.A05 = interfaceC16660sJ;
    }

    @Override // X.InterfaceC16660sJ
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        long longValue = ((Number) obj).longValue();
        C15370ps c15370ps = this.A06;
        Object obj2 = this.A04;
        C62D c62d = this.A01;
        InterfaceC118485Xk CBw = c62d.CBw();
        AbstractC118405Xc abstractC118405Xc = this.A03;
        Object C5Z = c62d.C5Z();
        C5Y2 c5y2 = this.A02;
        C62T c62t = new C62T(abstractC118405Xc, CBw, obj2, C5Z, new C9EV(c5y2, 0), longValue, longValue);
        SuspendAnimationKt.A05(c62d, c62t, c5y2, this.A05, this.A00, longValue);
        c15370ps.A00 = c62t;
        return C0eB.A00;
    }
}
