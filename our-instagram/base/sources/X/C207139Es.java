package X;

import androidx.compose.ui.Modifier;

/* renamed from: X.9Es, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C207139Es extends C0YY implements InterfaceC16620sF {
    public final int A00;
    public final Object A01;
    public final boolean A02;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C207139Es(InterfaceC16620sF interfaceC16620sF, int i, boolean z) {
        super(2);
        this.A00 = i;
        this.A02 = z;
        this.A01 = interfaceC16620sF;
    }

    @Override // X.InterfaceC16620sF
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        Object obj3;
        int i;
        int i2 = this.A00;
        C5Tl c5Tl = (C5Tl) obj;
        int intValue = ((Number) obj2).intValue() & 11;
        if (i2 != 0) {
            if (intValue != 2 || !c5Tl.Bxj()) {
                if (C0fH.A02()) {
                    C0fH.A01(-298264162, "com.instagram.compose.root.IgRoot.<anonymous> (IgRoot.kt:47)");
                }
                AbstractC117955Vf.A00(c5Tl, C5UA.A01(c5Tl, new DS9(5, this.A01, this.A02), 489644228), 6);
                if (C0fH.A02()) {
                    i = 1328016645;
                    C0fH.A00(i);
                }
            }
            c5Tl.Em9();
        } else {
            if (intValue != 2 || !c5Tl.Bxj()) {
                if (C0fH.A02()) {
                    C0fH.A01(825485313, "com.facebook.compose.view.MetaComposeView.getReusableContent.<anonymous> (MetaComposeView.kt:530)");
                }
                boolean z = this.A02;
                InterfaceC16620sF interfaceC16620sF = (InterfaceC16620sF) this.A01;
                if (z) {
                    obj3 = C113425Ae.A00;
                } else {
                    obj3 = C57h.A03;
                }
                C1130158n c1130158n = Modifier.A00;
                int A00 = C5X2.A00(c5Tl);
                C117505Tk c117505Tk = (C117505Tk) c5Tl;
                C59P A04 = C117505Tk.A04(c117505Tk);
                Modifier A01 = C5X3.A01(c5Tl, c1130158n);
                InterfaceC16820sZ interfaceC16820sZ = C5X8.A00;
                c5Tl.Ent();
                if (c117505Tk.A0K) {
                    c5Tl.AMd(interfaceC16820sZ);
                } else {
                    c5Tl.FDO();
                }
                C5XJ.A00(c5Tl, obj3, C5X8.A03);
                C5XJ.A00(c5Tl, A04, C5X8.A05);
                InterfaceC16620sF interfaceC16620sF2 = C5X8.A02;
                if (c117505Tk.A0K || !C14360o3.A0K(c5Tl.EEc(), Integer.valueOf(A00))) {
                    Integer valueOf = Integer.valueOf(A00);
                    c5Tl.FBy(valueOf);
                    c5Tl.ABx(valueOf, interfaceC16620sF2);
                }
                C5XJ.A00(c5Tl, A01, C5X8.A04);
                c5Tl.Ens(207, Boolean.valueOf(z));
                boolean AH5 = c5Tl.AH5(z);
                c5Tl.Eno(-869707859);
                if (z) {
                    c5Tl.Eno(1123124439);
                    interfaceC16620sF.invoke(c5Tl, 0);
                    C117505Tk.A0L(c117505Tk, false);
                } else {
                    c5Tl.ANi(AH5);
                }
                C117505Tk.A0L(c117505Tk, false);
                c5Tl.ASa();
                c5Tl.ASW();
                if (C0fH.A02()) {
                    i = 1386894704;
                    C0fH.A00(i);
                }
            }
            c5Tl.Em9();
        }
        return C0eB.A00;
    }
}
