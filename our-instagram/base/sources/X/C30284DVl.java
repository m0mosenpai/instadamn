package X;

import androidx.compose.ui.Modifier;
import com.instagram.api.schemas.LineType;
import com.instagram.common.session.UserSession;
import com.instagram.creator.achievements.modules.models.Badge;

/* renamed from: X.DVl, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C30284DVl extends C0YY implements InterfaceC16620sF {
    public final int A00;
    public final int A01;
    public final int A02;
    public final Object A03;
    public final Object A04;
    public final Object A05;
    public final Object A06;
    public final boolean A07;
    public final boolean A08;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C30284DVl(Object obj, Object obj2, Object obj3, Object obj4, int i, int i2, int i3, boolean z, boolean z2) {
        super(2);
        this.A00 = i3;
        this.A02 = i;
        this.A01 = i2;
        this.A06 = obj;
        this.A03 = obj2;
        this.A04 = obj3;
        this.A05 = obj4;
        this.A08 = z;
        this.A07 = z2;
    }

    @Override // X.InterfaceC16620sF
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        Integer num;
        switch (this.A00) {
            case 0:
                C5Tl A0S = AbstractC25226BEj.A0S(obj, obj2);
                C7T c7t = (C7T) this.A03;
                boolean z = this.A08;
                InterfaceC16820sZ interfaceC16820sZ = (InterfaceC16820sZ) this.A04;
                AbstractC28414CgK.A02(A0S, c7t, (C09530e4) this.A06, interfaceC16820sZ, (InterfaceC16820sZ) this.A05, AbstractC25225BEi.A04(this.A01), this.A02, z, this.A07);
                break;
            case 1:
                C5Tl A0S2 = AbstractC25226BEj.A0S(obj, obj2);
                C44461JlT c44461JlT = (C44461JlT) this.A06;
                InterfaceC156146zi interfaceC156146zi = (InterfaceC156146zi) this.A03;
                InterfaceC16660sJ interfaceC16660sJ = (InterfaceC16660sJ) this.A05;
                AbstractC27532CDc.A00(A0S2, interfaceC156146zi, c44461JlT, (InterfaceC16820sZ) this.A04, interfaceC16660sJ, AbstractC25225BEi.A04(this.A01), this.A02, this.A08, this.A07);
                break;
            case 2:
                C5Tl A0S3 = AbstractC25226BEj.A0S(obj, obj2);
                C25999Ben c25999Ben = (C25999Ben) this.A05;
                LineType lineType = (LineType) this.A06;
                boolean z2 = this.A08;
                InterfaceC16660sJ interfaceC16660sJ2 = (InterfaceC16660sJ) this.A04;
                AbstractC28031CXf.A00(A0S3, (Modifier) this.A03, lineType, c25999Ben, interfaceC16660sJ2, AbstractC25225BEi.A04(this.A01), this.A02, z2, this.A07);
                break;
            case 3:
                C5Tl c5Tl = (C5Tl) obj;
                if (AbstractC25228BEl.A0C(obj2) == 2 && c5Tl.Bxj()) {
                    c5Tl.Em9();
                    break;
                } else {
                    if (C0fH.A02()) {
                        C0fH.A01(714458387, "com.instagram.creation.genai.magicmod.common.ui.MagicModBackdropSegmentedImage.<anonymous>.<anonymous>.<anonymous> (MagicModBackdropSegmentedImage.kt:68)");
                    }
                    C1130158n c1130158n = Modifier.A00;
                    int i = this.A02;
                    int i2 = this.A01;
                    Object obj3 = this.A06;
                    if (AbstractC25227BEk.A1U(c5Tl, 1138802584)) {
                        C0fH.A01(1036332804, "com.instagram.creation.genai.magicmod.common.ui.detectMagicModImageTaps (MagicModBackdropSegmentedImage.kt:88)");
                    }
                    Modifier A02 = C5X3.A02(c1130158n, C5XU.A00, new C30533DcG(obj3, i, i2, 1));
                    if (C0fH.A02()) {
                        C0fH.A00(2029343885);
                    }
                    C117505Tk c117505Tk = (C117505Tk) c5Tl;
                    C117505Tk.A0L(c117505Tk, false);
                    InterfaceC137546La interfaceC137546La = (InterfaceC137546La) this.A03;
                    InterfaceC137546La interfaceC137546La2 = (InterfaceC137546La) this.A04;
                    C27866CQd c27866CQd = (C27866CQd) this.A05;
                    boolean z3 = this.A08;
                    boolean z4 = this.A07;
                    InterfaceC1127857k A0b = AbstractC25226BEj.A0b(false);
                    int A00 = C5X2.A00(c5Tl);
                    C59P A04 = C117505Tk.A04(c117505Tk);
                    Modifier A01 = C5X3.A01(c5Tl, A02);
                    AbstractC25233BEq.A11(c5Tl, c117505Tk);
                    AbstractC25231BEo.A12(c5Tl, A0b, A04);
                    InterfaceC16620sF interfaceC16620sF = C5X8.A02;
                    if (c117505Tk.A0K || !AbstractC25231BEo.A1O(c5Tl, A00)) {
                        AbstractC25231BEo.A15(c5Tl, interfaceC16620sF, A00);
                    }
                    AbstractC25225BEi.A1K(c5Tl, A01);
                    C119645bN c119645bN = C119645bN.A00;
                    if (z4) {
                        num = C05F.A01;
                    } else {
                        num = C05F.A0C;
                    }
                    CYF.A00(c119645bN, c5Tl, null, interfaceC137546La, interfaceC137546La2, c27866CQd, num, null, 4678, 224, z3, false);
                    if (AbstractC25227BEk.A1R(c5Tl)) {
                        C0fH.A00(-1490150729);
                        break;
                    }
                }
                break;
            default:
                C5Tl A0S4 = AbstractC25226BEj.A0S(obj, obj2);
                Badge badge = (Badge) this.A03;
                UserSession userSession = (UserSession) this.A06;
                InterfaceC16660sJ interfaceC16660sJ3 = (InterfaceC16660sJ) this.A05;
                AbstractC27649CHu.A00(A0S4, (Modifier) this.A04, userSession, badge, interfaceC16660sJ3, AbstractC25225BEi.A04(this.A01), this.A02, this.A07, this.A08);
                break;
        }
        return C0eB.A00;
    }
}
