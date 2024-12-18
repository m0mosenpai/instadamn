package X;

import android.app.Activity;
import androidx.compose.ui.Modifier;
import com.instagram.common.session.UserSession;

/* renamed from: X.DSx, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C30218DSx extends C0YY implements InterfaceC16620sF {
    public final int A00;
    public final long A01;
    public final Object A02;
    public final Object A03;
    public final Object A04;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C30218DSx(long j, Object obj, Object obj2, Object obj3, int i) {
        super(2);
        this.A00 = i;
        this.A01 = j;
        this.A02 = obj;
        this.A04 = obj2;
        this.A03 = obj3;
    }

    @Override // X.InterfaceC16620sF
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        C5Tl c5Tl;
        int i;
        C193328hC c193328hC;
        boolean z;
        EnumC46208Kck enumC46208Kck;
        Integer num;
        EnumC46149Kbn enumC46149Kbn;
        switch (this.A00) {
            case 0:
                c5Tl = (C5Tl) obj;
                if (AbstractC25228BEl.A0B(obj2) != 2 || !c5Tl.Bxj()) {
                    if (C0fH.A02()) {
                        C0fH.A01(-845851967, "com.instagram.compose.igds.components.segmentedpills.BasePill.<anonymous>.<anonymous> (Pills.kt:200)");
                    }
                    C1130158n c1130158n = Modifier.A00;
                    long j = this.A01;
                    C5WJ c5wj = (C5WJ) this.A02;
                    Modifier Eq3 = C6L2.A01(C6L3.A01(c1130158n, c5wj, j), c5wj).Eq3((Modifier) this.A04);
                    InterfaceC118335Wv interfaceC118335Wv = AbstractC118255Wn.A02;
                    InterfaceC118225Wj interfaceC118225Wj = C118195Wf.A04;
                    InterfaceC16610sE interfaceC16610sE = (InterfaceC16610sE) this.A03;
                    InterfaceC1127857k A00 = AbstractC118375Wz.A00(interfaceC118335Wv, c5Tl, interfaceC118225Wj);
                    int A002 = C5X2.A00(c5Tl);
                    C117505Tk c117505Tk = (C117505Tk) c5Tl;
                    C59P A04 = C117505Tk.A04(c117505Tk);
                    Modifier A01 = C5X3.A01(c5Tl, Eq3);
                    AbstractC25233BEq.A11(c5Tl, c117505Tk);
                    AbstractC25231BEo.A12(c5Tl, A00, A04);
                    InterfaceC16620sF interfaceC16620sF = C5X8.A02;
                    if (c117505Tk.A0K || !AbstractC25231BEo.A1O(c5Tl, A002)) {
                        AbstractC25231BEo.A15(c5Tl, interfaceC16620sF, A002);
                    }
                    AbstractC25225BEi.A1K(c5Tl, A01);
                    AbstractC25231BEo.A13(c5Tl, C6L0.A00, interfaceC16610sE, 6);
                    if (C0fH.A02()) {
                        i = -727595908;
                        C0fH.A00(i);
                        break;
                    }
                }
                c5Tl.Em9();
                break;
            case 1:
                c5Tl = (C5Tl) obj;
                if (AbstractC25228BEl.A0B(obj2) != 2 || !c5Tl.Bxj()) {
                    if (C0fH.A02()) {
                        C0fH.A01(-679845016, "com.instagram.compose.igds.components.segmentedpills.BasePill.<anonymous> (Pills.kt:199)");
                    }
                    C5WR.A0z(c5Tl, AbstractC25226BEj.A0h(c5Tl), C5UA.A01(c5Tl, new C30218DSx(this.A01, this.A02, this.A04, this.A03, 0), 760906423), 48);
                    if (C0fH.A02()) {
                        i = -1648354041;
                        C0fH.A00(i);
                        break;
                    }
                }
                c5Tl.Em9();
                break;
            default:
                C14360o3.A0B(obj, 0);
                if (obj == EnumC46172KcA.A03) {
                    Activity activity = (Activity) this.A02;
                    long j2 = this.A01;
                    UserSession userSession = (UserSession) this.A04;
                    AbstractC2056898s abstractC2056898s = (AbstractC2056898s) this.A03;
                    if (j2 > -1) {
                        C14360o3.A0B(userSession, 0);
                        C6CE.A00(userSession);
                        if (AbstractC166987dD.A0L(System.currentTimeMillis()) - j2 > 300) {
                            abstractC2056898s.A05("OTC_NOTIFICATION_EXPIRED");
                            abstractC2056898s.A04(C05F.A01);
                            C14360o3.A0B(activity, 0);
                            z = true;
                            c193328hC = new C193328hC(activity);
                            c193328hC.A0A(2131961814);
                            c193328hC.A09(2131961812);
                            c193328hC.A0J(DialogInterfaceOnClickListenerC28552Cik.A00, 2131961813);
                            c193328hC.A0H(new DialogInterfaceOnClickListenerC28539CiX(3, activity, userSession), 2131961811);
                        }
                    }
                    Integer num2 = C05F.A00;
                    abstractC2056898s.A04(num2);
                    boolean A02 = C6CB.A02(C6CE.A00(userSession).A00, 36315928476258105L);
                    LGY A003 = AbstractC46741Kly.A00(userSession);
                    if (A02) {
                        enumC46208Kck = EnumC46208Kck.A0H;
                        num = C05F.A0j;
                        enumC46149Kbn = EnumC46149Kbn.A03;
                    } else {
                        enumC46208Kck = EnumC46208Kck.A0G;
                        num = C05F.A0j;
                        enumC46149Kbn = EnumC46149Kbn.A02;
                    }
                    A003.A01(activity, AbstractC166987dD.A0b(), enumC46208Kck, enumC46149Kbn, num, num2, null);
                    break;
                } else {
                    AbstractC2056898s abstractC2056898s2 = (AbstractC2056898s) this.A03;
                    abstractC2056898s2.A05("OTC_NOTIFICATION_INVALID_DEVICE");
                    abstractC2056898s2.A04(C05F.A01);
                    Activity activity2 = (Activity) this.A02;
                    Object obj3 = this.A04;
                    c193328hC = new C193328hC(activity2);
                    c193328hC.A0A(2131961818);
                    c193328hC.A09(2131961835);
                    c193328hC.A0J(DialogInterfaceOnClickListenerC28553Cil.A00, 2131961813);
                    c193328hC.A0H(new DialogInterfaceOnClickListenerC28539CiX(4, activity2, obj3), 2131961811);
                    z = true;
                }
                c193328hC.A0s(z);
                AbstractC166987dD.A1W(c193328hC);
                break;
        }
        return C0eB.A00;
    }
}
