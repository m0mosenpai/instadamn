package X;

import java.util.List;

/* renamed from: X.DUv, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C30268DUv extends C0YY implements InterfaceC16620sF {
    public final /* synthetic */ int A00;
    public final /* synthetic */ C27062Bwl A01;
    public final /* synthetic */ List A02;
    public final /* synthetic */ InterfaceC16660sJ A03;
    public final /* synthetic */ InterfaceC16660sJ A04;
    public final /* synthetic */ InterfaceC16660sJ A05;
    public final /* synthetic */ boolean A06;
    public final /* synthetic */ boolean A07;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C30268DUv(C27062Bwl c27062Bwl, List list, InterfaceC16660sJ interfaceC16660sJ, InterfaceC16660sJ interfaceC16660sJ2, InterfaceC16660sJ interfaceC16660sJ3, int i, boolean z, boolean z2) {
        super(2);
        this.A02 = list;
        this.A01 = c27062Bwl;
        this.A04 = interfaceC16660sJ;
        this.A05 = interfaceC16660sJ2;
        this.A03 = interfaceC16660sJ3;
        this.A07 = z;
        this.A06 = z2;
        this.A00 = i;
    }

    @Override // X.InterfaceC16620sF
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        C5Tl A0S = AbstractC25226BEj.A0S(obj, obj2);
        List list = this.A02;
        AbstractC27693CJm.A00(A0S, this.A01, list, this.A04, this.A05, this.A03, AbstractC25225BEi.A04(this.A00), this.A07, this.A06);
        return C0eB.A00;
    }
}
