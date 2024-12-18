package X;

import java.util.Map;

/* renamed from: X.6GH, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C6GH extends C0YY implements InterfaceC16620sF {
    public final /* synthetic */ C6GG A00;
    public final /* synthetic */ C6GC A01;
    public final /* synthetic */ String A02;
    public final /* synthetic */ boolean A03;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6GH(C6GG c6gg, C6GC c6gc, String str, boolean z) {
        super(2);
        this.A00 = c6gg;
        this.A01 = c6gc;
        this.A03 = z;
        this.A02 = str;
    }

    @Override // X.InterfaceC16620sF
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        C5Tl c5Tl = (C5Tl) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && c5Tl.Bxj()) {
            c5Tl.Em9();
        } else {
            if (C0fH.A02()) {
                C0fH.A01(-948156448, "com.instagram.compose.igds.components.button.IgdsButton.<anonymous> (IgdsButton.kt:95)");
            }
            C6GG c6gg = this.A00;
            if (c6gg instanceof C6GF) {
                c5Tl.Eno(-584942203);
                C5WR.A03(c5Tl, null, C5XL.A01(c5Tl).A01, null, null, null, this.A02, null, 0, 0, 1, 2, 0, 390, 11258, this.A01.AJo(this.A03), 0L, 0L, false);
            } else if (c6gg instanceof C29179Ctk) {
                c5Tl.Eno(-584632978);
                String str = this.A02;
                if (C0fH.A02()) {
                    C0fH.A01(-2135119812, "com.instagram.compose.igds.components.button.IgdsButtonIcon.Chevron.annotatedString (IgdsButton.kt:356)");
                }
                C6C7 c6c7 = new C6C7(16);
                c6c7.A09(str);
                BIT.A00(c6c7, "placeholder-id", "[chevron]");
                C5C8 A02 = c6c7.A02();
                if (C0fH.A02()) {
                    C0fH.A00(71018230);
                }
                C6GC c6gc = this.A01;
                boolean z = this.A03;
                long AJo = c6gc.AJo(z);
                C118125Vw c118125Vw = C5XL.A01(c5Tl).A01;
                if (C0fH.A02()) {
                    C0fH.A01(539825804, "com.instagram.compose.igds.components.button.IgdsButtonIcon.Chevron.inlineContent (IgdsButton.kt:363)");
                }
                long j = C5XL.A01(c5Tl).A00.A02.A01;
                Map A0M = AbstractC16850sd.A0M(new C09530e4("placeholder-id", new BGB(new BGA(j, j, 7), C5UA.A01(c5Tl, new C30523Dc6(c6gc, ((C57y) C5UT.A01(C5V2.A01, C117505Tk.A04((C117505Tk) c5Tl))).EqG(C5XL.A01(c5Tl).A00.A02.A01), z), -929232071))));
                if (C0fH.A02()) {
                    C0fH.A00(877601536);
                }
                C5WR.A02(c5Tl, null, A02, c118125Vw, null, null, null, A0M, null, 0, 0, 1, 2, 0, 54, 5114, AJo, 0L, false);
            } else {
                c5Tl.Eno(396771315);
                C117505Tk.A0I((C117505Tk) c5Tl);
                throw new RuntimeException();
            }
            C117505Tk.A0L((C117505Tk) c5Tl, false);
            if (C0fH.A02()) {
                C0fH.A00(-658635946);
            }
        }
        return C0eB.A00;
    }
}
