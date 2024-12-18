package X;

/* renamed from: X.Dfe, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C30742Dfe extends C0YY implements InterfaceC16600sD {
    public final /* synthetic */ InterfaceC11380iw A00;
    public final /* synthetic */ C26073Bg2 A01;
    public final /* synthetic */ String A02;
    public final /* synthetic */ InterfaceC16820sZ A03;
    public final /* synthetic */ InterfaceC16820sZ A04;
    public final /* synthetic */ InterfaceC16820sZ A05;
    public final /* synthetic */ InterfaceC16820sZ A06;
    public final /* synthetic */ InterfaceC16660sJ A07;
    public final /* synthetic */ InterfaceC16660sJ A08;
    public final /* synthetic */ InterfaceC16610sE A09;
    public final /* synthetic */ InterfaceC16610sE A0A;
    public final /* synthetic */ boolean A0B;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C30742Dfe(InterfaceC11380iw interfaceC11380iw, C26073Bg2 c26073Bg2, String str, InterfaceC16820sZ interfaceC16820sZ, InterfaceC16820sZ interfaceC16820sZ2, InterfaceC16820sZ interfaceC16820sZ3, InterfaceC16820sZ interfaceC16820sZ4, InterfaceC16660sJ interfaceC16660sJ, InterfaceC16660sJ interfaceC16660sJ2, InterfaceC16610sE interfaceC16610sE, InterfaceC16610sE interfaceC16610sE2, boolean z) {
        super(4);
        this.A01 = c26073Bg2;
        this.A08 = interfaceC16660sJ;
        this.A09 = interfaceC16610sE;
        this.A0A = interfaceC16610sE2;
        this.A07 = interfaceC16660sJ2;
        this.A06 = interfaceC16820sZ;
        this.A05 = interfaceC16820sZ2;
        this.A04 = interfaceC16820sZ3;
        this.A03 = interfaceC16820sZ4;
        this.A0B = z;
        this.A02 = str;
        this.A00 = interfaceC11380iw;
    }

    @Override // X.InterfaceC16600sD
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        int i;
        C51751Mta c51751Mta;
        int A0H = AbstractC166987dD.A0H(obj);
        C69 c69 = (C69) obj2;
        C5Tl c5Tl = (C5Tl) obj3;
        int A0H2 = AbstractC166987dD.A0H(obj4);
        C14360o3.A0B(c69, 1);
        if ((A0H2 & 6) == 0) {
            i = A0H2 | AbstractC25232BEp.A08(c5Tl, A0H);
        } else {
            i = A0H2;
        }
        if ((A0H2 & 48) == 0) {
            i |= AbstractC25232BEp.A0S(c5Tl, c69);
        }
        if ((i & 147) == 146 && c5Tl.Bxj()) {
            c5Tl.Em9();
        } else {
            if (C0fH.A02()) {
                C0fH.A01(-164475262, "com.instagram.opal.impl.ui.OpalTabContent.<anonymous> (OpalTabContent.kt:102)");
            }
            C26073Bg2 c26073Bg2 = this.A01;
            int ordinal = ((C69) c26073Bg2.A08.get(A0H)).ordinal();
            if (ordinal != 0) {
                if (ordinal == 1) {
                    c51751Mta = c26073Bg2.A02;
                } else {
                    throw B4Z.A00();
                }
            } else {
                c51751Mta = c26073Bg2.A03;
            }
            InterfaceC16660sJ interfaceC16660sJ = this.A08;
            InterfaceC16610sE interfaceC16610sE = this.A09;
            InterfaceC16610sE interfaceC16610sE2 = this.A0A;
            InterfaceC16660sJ interfaceC16660sJ2 = this.A07;
            InterfaceC16820sZ interfaceC16820sZ = this.A06;
            InterfaceC16820sZ interfaceC16820sZ2 = this.A05;
            InterfaceC16820sZ interfaceC16820sZ3 = this.A04;
            InterfaceC16820sZ interfaceC16820sZ4 = this.A03;
            boolean z = this.A0B;
            String str = this.A02;
            C51751Mta c51751Mta2 = c51751Mta;
            AbstractC28322CeA.A00(c5Tl, AbstractC25228BEl.A0V(), c51751Mta2, this.A00, c69, str, interfaceC16820sZ, interfaceC16820sZ2, interfaceC16820sZ3, interfaceC16820sZ4, interfaceC16660sJ, interfaceC16660sJ2, interfaceC16610sE, interfaceC16610sE2, (i << 24) & 1879048192, 3072, z);
            if (C0fH.A02()) {
                C0fH.A00(-1266220931);
            }
        }
        return C0eB.A00;
    }
}
