package X;

import androidx.compose.ui.Modifier;

/* loaded from: classes5.dex */
public final class DVZ extends C0YY implements InterfaceC16620sF {
    public final /* synthetic */ long A00;
    public final /* synthetic */ C136606Go A01;
    public final /* synthetic */ Modifier A02;
    public final /* synthetic */ C72 A03;
    public final /* synthetic */ C28874Coi A04;
    public final /* synthetic */ C6O A05;
    public final /* synthetic */ String A06;
    public final /* synthetic */ InterfaceC16820sZ A07;
    public final /* synthetic */ boolean A08;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DVZ(C136606Go c136606Go, Modifier modifier, C72 c72, C28874Coi c28874Coi, C6O c6o, String str, InterfaceC16820sZ interfaceC16820sZ, long j, boolean z) {
        super(2);
        this.A06 = str;
        this.A03 = c72;
        this.A05 = c6o;
        this.A02 = modifier;
        this.A04 = c28874Coi;
        this.A01 = c136606Go;
        this.A08 = z;
        this.A00 = j;
        this.A07 = interfaceC16820sZ;
    }

    @Override // X.InterfaceC16620sF
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        C5Tl c5Tl = (C5Tl) obj;
        if (AbstractC25228BEl.A0B(obj2) == 2 && c5Tl.Bxj()) {
            c5Tl.Em9();
        } else {
            if (C0fH.A02()) {
                C0fH.A01(6759525, "com.instagram.compose.igds.components.tooltip.IgdsTooltip.<anonymous> (IgdsTooltip.kt:89)");
            }
            String str = this.A06;
            C72 c72 = this.A03;
            C6O c6o = this.A05;
            AbstractC28388Cfr.A00(this.A01, c5Tl, this.A02, c72, this.A04, c6o, str, 0, 0);
            if (this.A08) {
                C0eB c0eB = C0eB.A00;
                c5Tl.Eno(-1678942869);
                long j = this.A00;
                boolean AH3 = c5Tl.AH3(j);
                InterfaceC16820sZ interfaceC16820sZ = this.A07;
                boolean A1X = AbstractC25225BEi.A1X(c5Tl, interfaceC16820sZ, AH3);
                Object EEc = c5Tl.EEc();
                if (A1X || EEc == C5UI.A00) {
                    EEc = new MBs(interfaceC16820sZ, (InterfaceC23621Ds) null, 13, j);
                    c5Tl.FBy(EEc);
                }
                AbstractC25231BEo.A10(c5Tl, EEc, c0eB);
            }
            if (C0fH.A02()) {
                C0fH.A00(1990968275);
            }
        }
        return C0eB.A00;
    }
}
