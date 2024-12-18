package X;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.DrawWithCacheElement;
import com.instagram.common.typedurl.ImageUrl;

/* renamed from: X.DcA, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C30527DcA extends C0YY implements InterfaceC16610sE {
    public final int A00;
    public final Object A01;
    public final boolean A02;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C30527DcA(int i, Object obj, boolean z) {
        super(3);
        this.A00 = i;
        this.A01 = obj;
        this.A02 = z;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x000a. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v3, types: [X.5YL] */
    /* JADX WARN: Type inference failed for: r12v3, types: [java.lang.String] */
    @Override // X.InterfaceC16610sE
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        C5Tl c5Tl;
        int i;
        Modifier modifier;
        long j;
        int i2;
        int i3;
        switch (this.A00) {
            case 0:
                Modifier modifier2 = (Modifier) obj;
                C5Tl A0S = AbstractC25226BEj.A0S(obj2, obj3);
                if (AbstractC25227BEk.A1U(A0S, -196777734)) {
                    C0fH.A01(-406191331, "androidx.compose.foundation.text.selection.drawSelectionHandle.<anonymous> (AndroidSelectionHandles.android.kt:134)");
                }
                long j2 = ((CVE) A0S.AJX(CNJ.A01)).A01;
                boolean AH3 = A0S.AH3(j2);
                InterfaceC16820sZ interfaceC16820sZ = (InterfaceC16820sZ) this.A01;
                boolean A1X = AbstractC25225BEi.A1X(A0S, interfaceC16820sZ, AH3);
                boolean z = this.A02;
                boolean A1Y = AbstractC25226BEj.A1Y(A0S, z, A1X);
                Object EEc = A0S.EEc();
                if (A1Y || EEc == C5UI.A00) {
                    EEc = new DHJ(interfaceC16820sZ, j2, z);
                    A0S.FBy(EEc);
                }
                Modifier Eq3 = modifier2.Eq3(new DrawWithCacheElement((InterfaceC16660sJ) EEc));
                if (C0fH.A02()) {
                    C0fH.A00(1103133088);
                }
                AbstractC25225BEi.A1T(A0S);
                return Eq3;
            case 1:
                c5Tl = (C5Tl) obj2;
                int A0H = AbstractC166987dD.A0H(obj3);
                C14360o3.A0B(obj, 0);
                if ((A0H & 17) != 16 || !c5Tl.Bxj()) {
                    if (C0fH.A02()) {
                        C0fH.A01(-807947492, "com.instagram.aistudio.editor.AiCreationTopicPickerScreen.<anonymous>.<anonymous>.<anonymous> (AiCreationTopicPickerScreen.kt:63)");
                    }
                    if (this.A02) {
                        ImageUrl A0U = AbstractC25234BEr.A0U(c5Tl);
                        String A00 = C5YD.A00(c5Tl, 2131952710);
                        String A002 = C5YD.A00(c5Tl, 2131952709);
                        EnumC27374C6d enumC27374C6d = EnumC27374C6d.A02;
                        c5Tl.Eno(374251335);
                        Object obj4 = this.A01;
                        boolean AH4 = c5Tl.AH4(obj4);
                        Object EEc2 = c5Tl.EEc();
                        if (AH4 || EEc2 == C5UI.A00) {
                            EEc2 = C30505Dbo.A02(c5Tl, obj4, 40);
                        }
                        AbstractC25225BEi.A1V(c5Tl, false);
                        AbstractC28451Ch0.A01(c5Tl, enumC27374C6d, A0U, "", A00, A002, (InterfaceC16620sF) EEc2, 24582);
                        C5WR.A0X(c5Tl, AbstractC118175Wb.A0E(AbstractC25228BEl.A0W(), 0.0f, 36.0f, 0.0f, 4.0f), AbstractC25226BEj.A0d(c5Tl), C5YD.A00(c5Tl, 2131952757), AbstractC25226BEj.A0G(c5Tl));
                    }
                    if (C0fH.A02()) {
                        i = -1944557580;
                        C0fH.A00(i);
                    }
                    return C0eB.A00;
                }
                c5Tl.Em9();
                return C0eB.A00;
            case 2:
                c5Tl = (C5Tl) obj2;
                if (AbstractC25228BEl.A0D(obj3) != 16 || !c5Tl.Bxj()) {
                    if (C0fH.A02()) {
                        C0fH.A01(1030565998, "com.instagram.aistudio.home.view.section.AiHomeCarouselSection.<anonymous>.<anonymous>.<anonymous> (AiHomeCarouselSection.kt:129)");
                    }
                    if (this.A02) {
                        c5Tl.Eno(1301121448);
                        C5UP c5up = AbstractC117935Vd.A00;
                        AbstractC12990ll A0v = AbstractC25226BEj.A0v(c5Tl, c5up);
                        C06090Tz c06090Tz = C06090Tz.A05;
                        boolean A06 = C18U.A06(c06090Tz, A0v, 36325081046463194L);
                        C117505Tk c117505Tk = (C117505Tk) c5Tl;
                        C117505Tk.A0L(c117505Tk, false);
                        if (A06) {
                            c5Tl.Eno(1680116886);
                            AbstractC28496Chp.A08((InterfaceC16820sZ) this.A01, c5Tl, 0);
                        } else {
                            c5Tl.Eno(1301128168);
                            boolean A062 = C18U.A06(c06090Tz, AbstractC25226BEj.A0v(c5Tl, c5up), 36325081045480144L);
                            C117505Tk.A0L(c117505Tk, false);
                            if (A062) {
                                c5Tl.Eno(1680325206);
                                AbstractC28496Chp.A07((InterfaceC16820sZ) this.A01, c5Tl, 0);
                            } else {
                                c5Tl.Eno(1301134952);
                                boolean A063 = C18U.A06(c06090Tz, AbstractC25226BEj.A0v(c5Tl, c5up), 36325081044693706L);
                                C117505Tk.A0L(c117505Tk, false);
                                if (A063) {
                                    c5Tl.Eno(1680535448);
                                    AbstractC28496Chp.A01(c5Tl, null, (InterfaceC16820sZ) this.A01, 0, 2);
                                } else {
                                    Modifier A0D = AbstractC118185Wd.A0D(AbstractC25225BEi.A0N(c5Tl, 1680632261), 318.0f);
                                    InterfaceC16820sZ interfaceC16820sZ2 = (InterfaceC16820sZ) this.A01;
                                    InterfaceC1127857k A0b = AbstractC25226BEj.A0b(false);
                                    int A003 = C5X2.A00(c5Tl);
                                    C59P A04 = C117505Tk.A04(c117505Tk);
                                    Modifier A01 = C5X3.A01(c5Tl, A0D);
                                    AbstractC25233BEq.A11(c5Tl, c117505Tk);
                                    AbstractC25231BEo.A12(c5Tl, A0b, A04);
                                    InterfaceC16620sF interfaceC16620sF = C5X8.A02;
                                    if (c117505Tk.A0K || !AbstractC25231BEo.A1O(c5Tl, A003)) {
                                        AbstractC25231BEo.A15(c5Tl, interfaceC16620sF, A003);
                                    }
                                    AbstractC25225BEi.A1K(c5Tl, A01);
                                    CD4.A00(c5Tl, null, interfaceC16820sZ2, 0, 6, false);
                                    c5Tl.ASW();
                                }
                            }
                        }
                        if (AbstractC25227BEk.A1b(c117505Tk, false)) {
                            i = -305326441;
                            C0fH.A00(i);
                        }
                        return C0eB.A00;
                    }
                    if (C0fH.A02()) {
                        i = -393395655;
                        C0fH.A00(i);
                    }
                    return C0eB.A00;
                }
                c5Tl.Em9();
                return C0eB.A00;
            default:
                C5Tl c5Tl2 = (C5Tl) obj2;
                if (AbstractC25229BEm.A1X(obj3)) {
                    C0fH.A01(1034888207, "com.instagram.archive.updateshub.UpdatesHubLatelyPog.<anonymous>.<anonymous>.<anonymous> (UpdatesHubLatelyPog.kt:135)");
                }
                C2DC c2dc = (C2DC) this.A01;
                if (c2dc != null) {
                    if (this.A02) {
                        c5Tl2.Eno(1690541799);
                        modifier = null;
                        j = C1132359l.A09;
                        i2 = 3120;
                        i3 = 20;
                    } else {
                        c5Tl2.Eno(1690644347);
                        modifier = null;
                        j = 0;
                        i2 = 48;
                        i3 = 28;
                    }
                    C5YS.A07(c5Tl2, modifier, c2dc, modifier, modifier, i2, i3, j);
                    AbstractC25225BEi.A1T(c5Tl2);
                }
                if (C0fH.A02()) {
                    i = -1169394211;
                    C0fH.A00(i);
                }
                return C0eB.A00;
        }
    }
}
