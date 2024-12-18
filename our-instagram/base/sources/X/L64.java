package X;

import com.instagram.common.session.UserSession;

/* loaded from: classes8.dex */
public final class L64 {
    public final InterfaceC11360iu A00;

    public final void A00(String str, boolean z) {
        Integer num;
        if (z) {
            num = C05F.A0P;
        } else {
            num = C05F.A0a;
        }
        C19280xC A00 = AbstractC31718DwN.A00(num);
        A00.A0C(AbstractC111324zv.A00(941), str);
        A00.A0C("selection_method", "touch");
        this.A00.EHW(A00);
    }

    public L64(UserSession userSession) {
        this.A00 = AbstractC11060iN.A00(userSession);
    }
}
