package X;

import android.view.animation.LinearInterpolator;
import org.webrtc.ScreenCapturerAndroid;

/* renamed from: X.BnD, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26492BnD extends AbstractC51572Yf {
    public final C51722Yv A00;
    public final CSI A01;
    public final InterfaceC16660sJ A02;
    public final InterfaceC16660sJ A03;
    public final InterfaceC16620sF A04;
    public final InterfaceC16620sF A05;
    public final boolean A06;
    public final boolean A07;

    @Override // X.AbstractC51572Yf
    public final AbstractC50812Vc A0Y(C76223bS c76223bS) {
        InterfaceC59172nI interfaceC59172nI;
        C2WH A0M;
        Integer num;
        InterfaceC30846DhL interfaceC30846DhL;
        C14360o3.A0B(c76223bS, 0);
        EnumC76913cd enumC76913cd = AbstractC51432Xq.A04;
        C89813zN A00 = AbstractC51432Xq.A00(enumC76913cd, "overlay-appear-transition-key");
        InterfaceC79483gv interfaceC79483gv = AbstractC79463gt.A00;
        float A02 = AbstractC25230BEn.A02(A00, interfaceC79483gv);
        A00.A02(A02);
        A00.A02 = new C89803zM(new LinearInterpolator(), 200);
        AbstractC89903zW.A00(c76223bS, A00);
        C89813zN A002 = AbstractC51432Xq.A00(enumC76913cd, "scrim-disappear-transition-key");
        AbstractC25229BEm.A1D(A002, interfaceC79483gv, A02);
        A002.A02 = new C89803zM(new LinearInterpolator(), 200);
        AbstractC89903zW.A00(c76223bS, A002);
        C51762Yz A003 = AbstractC77073ct.A00(c76223bS, DEP.A00);
        CSI csi = this.A01;
        String str = csi.A02;
        if (str != null) {
            interfaceC59172nI = C6BY.A01(str);
        } else {
            interfaceC59172nI = null;
        }
        long A022 = AbstractC28406CgC.A02(c76223bS, C05F.A0X);
        if (!this.A07) {
            AbstractC50812Vc abstractC50812Vc = csi.A01;
            if (abstractC50812Vc != null) {
                C75933ay c75933ay = C51722Yv.A02;
                C51722Yv A004 = C9CU.A00(AbstractC25232BEp.A15(null, C05F.A0Y, EnumC77933eL.ABSOLUTE), C05F.A01, 1, AbstractC25229BEm.A0D());
                C2XE c2xe = c76223bS.A05;
                A0M = AbstractC76963ci.A0I(AbstractC25232BEp.A11(abstractC50812Vc, c2xe), c76223bS, AbstractC25231BEo.A0W(c2xe, A004, EnumC76913cd.LOCAL, "overlay-appear-transition-key"));
            } else {
                A0M = null;
            }
        } else {
            C75933ay c75933ay2 = C51722Yv.A02;
            C51722Yv A005 = C9CU.A00(AbstractC25232BEp.A15(null, C05F.A0Y, EnumC77933eL.ABSOLUTE), C05F.A01, 1, AbstractC25229BEm.A0D());
            int i = 4;
            if (AbstractC25229BEm.A1W(A003)) {
                i = 0;
            }
            A0M = AbstractC76963ci.A0M(c76223bS, C9CV.A00(AbstractC25233BEq.A0c(AbstractC25231BEo.A0W(c76223bS.A05, C9CV.A00(AbstractC25230BEn.A0e(A005, C05F.A0u, new CV2(i), null), C05F.A15, AbstractC25225BEi.A0i(AbstractC28406CgC.A00(c76223bS, C88.A0k)), 4), EnumC76913cd.LOCAL, "scrim-disappear-transition-key"), C05F.A0N, true), C05F.A05, new BZ2(AbstractC25228BEl.A07(c76223bS, A022)), 4));
        }
        C28903CpB c28903CpB = new C28903CpB(new C57751Pje(49, A003, this));
        CVV cvv = (CVV) AbstractC77183d4.A00(c76223bS, C29890DGe.A00(this, 34), new Object[]{csi});
        C51322Xf c51322Xf = cvv.A00;
        if (this.A06) {
            num = Integer.valueOf(ScreenCapturerAndroid.VIRTUAL_DISPLAY_DPI);
        } else {
            num = null;
        }
        C75933ay c75933ay3 = C51722Yv.A02;
        C51722Yv A006 = AbstractC25232BEp.A16(null, C05F.A0D, cvv.A01).A00(this.A00);
        C29890DGe A007 = C29890DGe.A00(this, 32);
        C29896DGk A008 = C29896DGk.A00(cvv, this, 17);
        C29890DGe A009 = C29890DGe.A00(this, 33);
        C30182DRn A01 = C30182DRn.A01(this, 9);
        if (interfaceC59172nI != null) {
            interfaceC30846DhL = C29516CzU.A00;
        } else {
            interfaceC30846DhL = C29515CzT.A00;
        }
        C129495tE c129495tE = new C129495tE(interfaceC59172nI, A0M, A006, interfaceC30846DhL, c28903CpB, num, A007, A008, A009, A01, A022);
        AbstractC107374si.A00(c129495tE, c51322Xf);
        return c129495tE;
    }

    public C26492BnD(C51722Yv c51722Yv, CSI csi, InterfaceC16660sJ interfaceC16660sJ, InterfaceC16660sJ interfaceC16660sJ2, InterfaceC16620sF interfaceC16620sF, InterfaceC16620sF interfaceC16620sF2, boolean z, boolean z2) {
        this.A01 = csi;
        this.A02 = interfaceC16660sJ;
        this.A05 = interfaceC16620sF;
        this.A03 = interfaceC16660sJ2;
        this.A04 = interfaceC16620sF2;
        this.A00 = c51722Yv;
        this.A07 = z;
        this.A06 = z2;
    }
}
