package X;

import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;

/* renamed from: X.BxN, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C27098BxN extends AbstractC64162vb {
    public final UserSession A00;

    @Override // X.AbstractC64162vb
    public final /* bridge */ /* synthetic */ void A03(Object obj, Object obj2) {
        C38321qM c38321qM = (C38321qM) obj;
        C14360o3.A0B(c38321qM, 0);
        User A14 = AbstractC25226BEj.A14(c38321qM);
        if (A14 != null) {
            BP5.A00(new BP5(this.A00, "story-reply"), AbstractC166997dE.A0j(A14.getId()), AbstractC111324zv.A00(1305));
        }
    }

    @Override // X.AbstractC64162vb
    public final /* bridge */ /* synthetic */ void A04(Object obj, Object obj2) {
        C38321qM c38321qM = (C38321qM) obj;
        C14360o3.A0B(c38321qM, 0);
        User A14 = AbstractC25226BEj.A14(c38321qM);
        if (A14 != null) {
            BP5.A00(new BP5(this.A00, "story-reply"), AbstractC166997dE.A0j(A14.getId()), AbstractC111324zv.A00(1305));
        }
    }

    public C27098BxN(UserSession userSession) {
        super(AbstractC62712tA.A00(userSession).A00());
        this.A00 = userSession;
    }
}
