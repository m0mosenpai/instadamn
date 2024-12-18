package X;

import com.instagram.common.session.UserSession;

/* loaded from: classes7.dex */
public final class HDX extends AbstractC193068gm {
    public final /* synthetic */ C145896hm A00;

    @Override // X.AbstractC192848gQ
    public final void A03(AbstractC115105If abstractC115105If) {
        C14360o3.A0B(abstractC115105If, 0);
        String A00 = AbstractC111324zv.A00(57);
        Throwable A01 = abstractC115105If.A01();
        if (A01 != null) {
            C0w9.A06("NetegoReelCTAOpener", A00, A01);
        } else {
            C0w9.A03("NetegoReelCTAOpener", A00);
        }
    }

    public HDX(C145896hm c145896hm) {
        this.A00 = c145896hm;
    }

    @Override // X.AbstractC192848gQ
    public final /* bridge */ /* synthetic */ void A04(Object obj) {
        C66246U5q c66246U5q = (C66246U5q) obj;
        C14360o3.A0B(c66246U5q, 0);
        C145896hm c145896hm = this.A00;
        c145896hm.A08.A01();
        UserSession userSession = c145896hm.A04;
        AbstractC59962oe abstractC59962oe = c145896hm.A01;
        AbstractC33787EwD.A00(C62862tP.A04(abstractC59962oe.requireActivity(), abstractC59962oe, userSession), c66246U5q);
    }
}
