package X;

import com.facebook.R;
import com.instagram.common.session.UserSession;
import java.util.List;

/* renamed from: X.BpM, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26625BpM extends AbstractC77583di {
    public static final C51532Yb A02 = AbstractC25232BEp.A1B(C29017Cr6.A00);
    public final C57 A00;
    public final UserSession A01;

    @Override // X.AbstractC77583di
    public final C78053eX A0Y(C77993eR c77993eR) {
        C14360o3.A0B(c77993eR, 0);
        int A0I = AbstractC25231BEo.A0I((List) BNI.A00(c77993eR, this.A00.A03));
        C29035CrO c29035CrO = new C29035CrO(A0I);
        C2YP A0c = AbstractC25229BEm.A0c(c77993eR, A02, C29878DFs.A00, new C30171DRb(A0I, 16, c77993eR, this));
        int A0A = AbstractC25228BEl.A0A(c77993eR, AbstractC77623dm.A0D(c77993eR, R.dimen.add_to_story_dual_destination_share_sheet_avatar_icon_size)) + AbstractC25228BEl.A0A(c77993eR, AbstractC77623dm.A0B(c77993eR));
        C75933ay c75933ay = C51722Yv.A02;
        long A0B = AbstractC25229BEm.A0B();
        return AbstractC25225BEi.A0g(AbstractC25232BEp.A14(AbstractC25233BEq.A0R(null, AbstractC25225BEi.A0n(C05F.A04, 0, A0B), 0, A0B), 0, AbstractC25229BEm.A0K(A0A)), c29035CrO, A0c);
    }

    public C26625BpM(UserSession userSession, C57 c57) {
        this.A00 = c57;
        this.A01 = userSession;
    }
}
