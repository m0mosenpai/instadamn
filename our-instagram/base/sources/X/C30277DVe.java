package X;

/* renamed from: X.DVe, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C30277DVe extends C0YY implements InterfaceC16620sF {
    public final /* synthetic */ int A00;
    public final /* synthetic */ EnumC27395C6y A01;
    public final /* synthetic */ EnumC27383C6m A02;
    public final /* synthetic */ String A03;
    public final /* synthetic */ String A04;
    public final /* synthetic */ InterfaceC16820sZ A05;
    public final /* synthetic */ InterfaceC16820sZ A06;
    public final /* synthetic */ InterfaceC16660sJ A07;
    public final /* synthetic */ boolean A08;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C30277DVe(EnumC27395C6y enumC27395C6y, EnumC27383C6m enumC27383C6m, String str, String str2, InterfaceC16820sZ interfaceC16820sZ, InterfaceC16820sZ interfaceC16820sZ2, InterfaceC16660sJ interfaceC16660sJ, int i, boolean z) {
        super(2);
        this.A06 = interfaceC16820sZ;
        this.A05 = interfaceC16820sZ2;
        this.A07 = interfaceC16660sJ;
        this.A04 = str;
        this.A03 = str2;
        this.A08 = z;
        this.A01 = enumC27395C6y;
        this.A02 = enumC27383C6m;
        this.A00 = i;
    }

    @Override // X.InterfaceC16620sF
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        C5Tl A0S = AbstractC25226BEj.A0S(obj, obj2);
        InterfaceC16820sZ interfaceC16820sZ = this.A06;
        InterfaceC16820sZ interfaceC16820sZ2 = this.A05;
        InterfaceC16660sJ interfaceC16660sJ = this.A07;
        CYy.A01(A0S, this.A01, this.A02, this.A04, this.A03, interfaceC16820sZ, interfaceC16820sZ2, interfaceC16660sJ, AbstractC25225BEi.A04(this.A00), this.A08);
        return C0eB.A00;
    }
}
