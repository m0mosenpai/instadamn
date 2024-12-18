package X;

import com.instagram.common.session.UserSession;
import com.instagram.model.reels.Reel;
import com.instagram.model.reels.ReelViewerConfig;
import com.instagram.model.reels.ReelViewerContextButtonType;
import java.util.List;

/* loaded from: classes9.dex */
public final class OI5 {
    public final AbstractC59962oe A00;
    public final UserSession A01;

    public OI5(AbstractC59962oe abstractC59962oe, UserSession userSession) {
        C14360o3.A0B(userSession, 2);
        this.A00 = abstractC59962oe;
        this.A01 = userSession;
    }

    public final Object A00(C114205Dh c114205Dh, Reel reel, C3G2 c3g2, AbstractC140596Xn abstractC140596Xn, List list, InterfaceC23621Ds interfaceC23621Ds, InterfaceC16820sZ interfaceC16820sZ, int i, boolean z, boolean z2) {
        List list2;
        List list3 = list;
        AbstractC140596Xn abstractC140596Xn2 = abstractC140596Xn;
        C56553P8z c56553P8z = new C56553P8z(c114205Dh, 4);
        C24891Jo A0s = JQ0.A0s(interfaceC23621Ds);
        UserSession userSession = this.A01;
        AbstractC59962oe abstractC59962oe = this.A00;
        C38E c38e = new C38E(abstractC59962oe, userSession, new C38C(abstractC59962oe));
        c38e.A0C = AbstractC166997dE.A0n();
        c38e.A06 = new C56536P8i(A0s, 3);
        if (abstractC140596Xn == null) {
            abstractC140596Xn2 = new C31559Dtj(abstractC59962oe.requireActivity(), AbstractC28289Cdb.A01(c114205Dh), new C56531P8d(interfaceC16820sZ, 2), C05F.A01);
        }
        c38e.A05 = abstractC140596Xn2;
        c38e.A0D = userSession.userId;
        c38e.A0F = z;
        C38H c38h = new C38H();
        c38h.A00 = ReelViewerContextButtonType.A03;
        c38h.A06 = false;
        c38h.A07 = z2;
        c38e.A03 = new ReelViewerConfig(c38h);
        if (list == null) {
            list3 = AbstractC166987dD.A1J(reel);
            list2 = AbstractC166987dD.A1J(reel);
        } else {
            list2 = list3;
        }
        c38e.A07(reel, c3g2, c56553P8z, list3, list2, i);
        return MSX.A0b(A0s.A0E());
    }
}
