package X;

/* renamed from: X.Dci, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C30561Dci extends C0YY implements InterfaceC16610sE {
    public final /* synthetic */ float A00;
    public final /* synthetic */ InterfaceC74953Yl A01;
    public final /* synthetic */ C31230DoD A02;
    public final /* synthetic */ InterfaceC16660sJ A03;
    public final /* synthetic */ InterfaceC16660sJ A04;
    public final /* synthetic */ InterfaceC16620sF A05;
    public final /* synthetic */ boolean A06;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C30561Dci(InterfaceC74953Yl interfaceC74953Yl, C31230DoD c31230DoD, InterfaceC16660sJ interfaceC16660sJ, InterfaceC16660sJ interfaceC16660sJ2, InterfaceC16620sF interfaceC16620sF, float f, boolean z) {
        super(3);
        this.A02 = c31230DoD;
        this.A00 = f;
        this.A06 = z;
        this.A04 = interfaceC16660sJ;
        this.A05 = interfaceC16620sF;
        this.A03 = interfaceC16660sJ2;
        this.A01 = interfaceC74953Yl;
    }

    @Override // X.InterfaceC16610sE
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        C5Tl c5Tl = (C5Tl) obj2;
        if (AbstractC25228BEl.A0E(obj3) == 16 && c5Tl.Bxj()) {
            c5Tl.Em9();
        } else {
            if (C0fH.A02()) {
                C0fH.A01(192273583, "com.instagram.archive.ui.ArchiveStoryGrid.<anonymous>.<anonymous>.<anonymous> (ArchiveReelComposeFragment.kt:667)");
            }
            C31230DoD c31230DoD = this.A02;
            if (c31230DoD != null) {
                float f = this.A00;
                float f2 = ((C119145aW) this.A01.getValue()).A00;
                boolean z = this.A06;
                AbstractC28499Chs.A08(c5Tl, c31230DoD, this.A04, this.A03, this.A05, f, f2, 48, z);
                if (C0fH.A02()) {
                    C0fH.A00(1444775601);
                }
            } else {
                throw AbstractC166997dE.A0g();
            }
        }
        return C0eB.A00;
    }
}
