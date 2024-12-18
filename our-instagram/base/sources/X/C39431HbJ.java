package X;

import com.instagram.user.model.FollowStatus;
import com.instagram.user.model.User;

/* renamed from: X.HbJ, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C39431HbJ extends AbstractC77473dX {
    public final /* synthetic */ int A00;

    public C39431HbJ(int i) {
        this.A00 = i;
    }

    @Override // X.AbstractC77473dX, X.InterfaceC77483dY
    public final void D3u(FollowStatus followStatus, User user) {
        AbstractC167017dG.A1N(user, followStatus);
        IHZ ihz = C37548Gg4.A04;
        if (ihz != null) {
            String id = user.getId();
            int i = this.A00;
            String A06 = AbstractC38851rI.A06(user.B7L());
            InterfaceC02590Ai A0f = AbstractC166987dD.A0f(ihz.A01, "suggested_creator_follow_button_tapped");
            A0f.AAP("target_id", id);
            A0f.A8p("position", Integer.valueOf(i));
            A0f.AAP("follow_status", A06);
            A0f.Cht();
        }
    }
}
