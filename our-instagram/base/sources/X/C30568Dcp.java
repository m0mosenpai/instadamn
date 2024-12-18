package X;

import androidx.compose.ui.Modifier;
import com.instagram.common.typedurl.ImageUrl;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.Dcp, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C30568Dcp extends C0YY implements InterfaceC16610sE {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;
    public final Object A04;
    public final Object A05;
    public final boolean A06;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C30568Dcp(int i, Object obj, Object obj2, Object obj3, Object obj4, Object obj5, boolean z) {
        super(3);
        this.A00 = i;
        this.A06 = z;
        this.A02 = obj;
        this.A04 = obj2;
        this.A01 = obj3;
        this.A05 = obj4;
        this.A03 = obj5;
    }

    @Override // X.InterfaceC16610sE
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        EnumC27374C6d enumC27374C6d;
        EnumC27374C6d enumC27374C6d2;
        int i;
        C5Tl c5Tl = (C5Tl) obj2;
        if (this.A00 != 0) {
            if (AbstractC25229BEm.A1X(obj3)) {
                C0fH.A01(1228253660, "com.instagram.barcelona.feed.mediaviewer.ui.MediaViewerScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous> (MediaViewerScreen.kt:442)");
            }
            boolean z = this.A06;
            c5Tl.Eno(-420234987);
            Object obj4 = this.A02;
            boolean AH4 = c5Tl.AH4(obj4);
            Object obj5 = this.A04;
            boolean A1X = AbstractC25226BEj.A1X(c5Tl, obj5, AH4);
            Object obj6 = this.A01;
            boolean A1X2 = AbstractC25226BEj.A1X(c5Tl, obj6, A1X);
            Object obj7 = this.A05;
            boolean A1X3 = AbstractC25225BEi.A1X(c5Tl, obj7, A1X2);
            Object obj8 = this.A03;
            boolean A1X4 = AbstractC25225BEi.A1X(c5Tl, obj8, A1X3);
            Object EEc = c5Tl.EEc();
            if (A1X4 || EEc == C5UI.A00) {
                EEc = new MEB(4, obj6, obj4, obj7, obj5, obj8);
                c5Tl.FBy(EEc);
            }
            CE2.A00(c5Tl, null, (InterfaceC16820sZ) EEc, AbstractC25228BEl.A1W(c5Tl) ? 1 : 0, 4, z);
            if (C0fH.A02()) {
                i = 49477531;
                C0fH.A00(i);
            }
        } else {
            int A0H = AbstractC166987dD.A0H(obj3);
            C14360o3.A0B(obj, 0);
            if ((A0H & 17) == 16 && c5Tl.Bxj()) {
                c5Tl.Em9();
            } else {
                if (C0fH.A02()) {
                    C0fH.A01(-70947157, "com.instagram.aistudio.editor.AiCreationTopicPickerScreen.<anonymous>.<anonymous>.<anonymous> (AiCreationTopicPickerScreen.kt:100)");
                }
                C1130158n c1130158n = Modifier.A00;
                Modifier A0E = AbstractC118175Wb.A0E(c1130158n, 0.0f, 0.0f, 0.0f, 10.0f);
                C6ID A01 = AbstractC118255Wn.A01(11.0f);
                boolean z2 = this.A06;
                C51748MtX c51748MtX = (C51748MtX) this.A05;
                InterfaceC16620sF interfaceC16620sF = (InterfaceC16620sF) this.A02;
                List list = (List) this.A01;
                InterfaceC16820sZ interfaceC16820sZ = (InterfaceC16820sZ) this.A03;
                List list2 = (List) this.A04;
                InterfaceC1127857k A0L = AbstractC25235BEs.A0L(A01, c5Tl);
                int A00 = C5X2.A00(c5Tl);
                C117505Tk c117505Tk = (C117505Tk) c5Tl;
                C59P A04 = C117505Tk.A04(c117505Tk);
                Modifier A012 = C5X3.A01(c5Tl, A0E);
                InterfaceC16820sZ interfaceC16820sZ2 = C5X8.A00;
                AbstractC25233BEq.A12(c5Tl, c117505Tk, interfaceC16820sZ2);
                InterfaceC16620sF interfaceC16620sF2 = C5X8.A03;
                InterfaceC16620sF A0q = AbstractC25229BEm.A0q(c5Tl, A0L, A04, interfaceC16620sF2);
                InterfaceC16620sF interfaceC16620sF3 = C5X8.A02;
                if (c117505Tk.A0K || !AbstractC25231BEo.A1O(c5Tl, A00)) {
                    AbstractC25231BEo.A15(c5Tl, interfaceC16620sF3, A00);
                }
                InterfaceC16620sF A1K = AbstractC25226BEj.A1K(c5Tl, A012);
                C6L0 c6l0 = C6L0.A00;
                Modifier A002 = c6l0.A00(c1130158n);
                InterfaceC118305Ws interfaceC118305Ws = AbstractC118255Wn.A07;
                InterfaceC118245Wl interfaceC118245Wl = C118195Wf.A02;
                InterfaceC1127857k A02 = AbstractC119595bH.A02(interfaceC118305Ws, c5Tl, interfaceC118245Wl, 0);
                int A003 = C5X2.A00(c5Tl);
                C59P A042 = C117505Tk.A04(c117505Tk);
                Modifier A013 = C5X3.A01(c5Tl, A002);
                AbstractC25233BEq.A12(c5Tl, c117505Tk, interfaceC16820sZ2);
                C5XJ.A00(c5Tl, A02, interfaceC16620sF2);
                if (AbstractC25225BEi.A1W(c5Tl, c117505Tk, A042, A0q) || !AbstractC25231BEo.A1O(c5Tl, A003)) {
                    AbstractC25231BEo.A15(c5Tl, interfaceC16620sF3, A003);
                }
                C5XJ.A00(c5Tl, A013, A1K);
                boolean z3 = c51748MtX.A03;
                if (z3) {
                    c5Tl.Eno(-70848615);
                    AbstractC28381Cfk.A02(c5Tl, 0);
                } else {
                    c5Tl.Eno(-70734225);
                    AbstractC28451Ch0.A01(c5Tl, EnumC27374C6d.A04, AbstractC25225BEi.A0t(""), "", "", "", interfaceC16620sF, 28086);
                    if (c51748MtX.A02) {
                        c5Tl.Eno(-70347407);
                        AbstractC28381Cfk.A01(c5Tl, 0);
                    } else {
                        Iterator A0x = AbstractC25227BEk.A0x(c5Tl, list, -70241852);
                        while (A0x.hasNext()) {
                            C26087BgG c26087BgG = (C26087BgG) A0x.next();
                            String str = c26087BgG.A03;
                            ImageUrl imageUrl = (ImageUrl) c26087BgG.A01;
                            String A014 = BHY.A01(c5Tl, (C5QE) c26087BgG.A02);
                            String A015 = BHY.A01(c5Tl, (C5QE) c26087BgG.A00);
                            if (C14360o3.A0K(str, "creator_ai_coming_soon")) {
                                enumC27374C6d = EnumC27374C6d.A03;
                            } else {
                                enumC27374C6d = EnumC27374C6d.A05;
                            }
                            AbstractC28451Ch0.A01(c5Tl, enumC27374C6d, imageUrl, str, A014, A015, interfaceC16620sF, 0);
                        }
                        interfaceC16820sZ.invoke();
                    }
                    C117505Tk.A0L(c117505Tk, false);
                }
                C117505Tk.A0L(c117505Tk, false);
                c5Tl.ASW();
                Modifier A004 = c6l0.A00(c1130158n);
                float f = 66.0f;
                if (z2) {
                    f = 0.0f;
                }
                Modifier A0E2 = AbstractC118175Wb.A0E(A004, 0.0f, f, 0.0f, 0.0f);
                InterfaceC1127857k A022 = AbstractC119595bH.A02(interfaceC118305Ws, c5Tl, interfaceC118245Wl, 0);
                int A005 = C5X2.A00(c5Tl);
                C59P A043 = C117505Tk.A04(c117505Tk);
                Modifier A016 = C5X3.A01(c5Tl, A0E2);
                AbstractC25233BEq.A12(c5Tl, c117505Tk, interfaceC16820sZ2);
                C5XJ.A00(c5Tl, A022, interfaceC16620sF2);
                if (AbstractC25225BEi.A1W(c5Tl, c117505Tk, A043, A0q) || !AbstractC25231BEo.A1O(c5Tl, A005)) {
                    AbstractC25231BEo.A15(c5Tl, interfaceC16620sF3, A005);
                }
                C5XJ.A00(c5Tl, A016, A1K);
                if (z3) {
                    c5Tl.Eno(-69086575);
                    AbstractC28381Cfk.A02(c5Tl, 0);
                } else {
                    c5Tl.Eno(-68975533);
                    if (c51748MtX.A02) {
                        c5Tl.Eno(-68956375);
                        AbstractC28381Cfk.A01(c5Tl, 0);
                    } else {
                        Iterator A0x2 = AbstractC25227BEk.A0x(c5Tl, list2, -68842698);
                        while (A0x2.hasNext()) {
                            C26087BgG c26087BgG2 = (C26087BgG) A0x2.next();
                            String str2 = c26087BgG2.A03;
                            ImageUrl imageUrl2 = (ImageUrl) c26087BgG2.A01;
                            String A017 = BHY.A01(c5Tl, (C5QE) c26087BgG2.A02);
                            String A018 = BHY.A01(c5Tl, (C5QE) c26087BgG2.A00);
                            if (C14360o3.A0K(str2, "creator_ai_coming_soon")) {
                                enumC27374C6d2 = EnumC27374C6d.A03;
                            } else {
                                enumC27374C6d2 = EnumC27374C6d.A05;
                            }
                            AbstractC28451Ch0.A01(c5Tl, enumC27374C6d2, imageUrl2, str2, A017, A018, interfaceC16620sF, 0);
                        }
                    }
                    C117505Tk.A0L(c117505Tk, false);
                }
                if (AbstractC25233BEq.A1S(c5Tl, c117505Tk)) {
                    i = 2032430297;
                    C0fH.A00(i);
                }
            }
        }
        return C0eB.A00;
    }
}
