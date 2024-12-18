package X;

import com.instagram.common.session.UserSession;
import com.instagram.creation.fragment.ShareLaterFragment;
import com.instagram.model.sharelater.ShareLaterMedia;

/* loaded from: classes9.dex */
public final class PIF implements InterfaceC58086PpB {
    public final /* synthetic */ ShareLaterFragment A00;

    @Override // X.InterfaceC58086PpB
    public final void Cio(String str) {
        C14360o3.A0B(str, 0);
        ShareLaterFragment shareLaterFragment = this.A00;
        UserSession userSession = shareLaterFragment.A00;
        if (userSession == null) {
            AbstractC31171DnF.A0y();
            throw C00O.createAndThrow();
        }
        ShareLaterMedia shareLaterMedia = shareLaterFragment.A04;
        C14360o3.A0A(shareLaterMedia);
        AbstractC73317Y7a.A09(shareLaterFragment, userSession, null, shareLaterMedia.A05, "share_later_view", str);
    }

    @Override // X.InterfaceC58086PpB
    public final void Ck9(String str) {
        C14360o3.A0B(str, 0);
        ShareLaterFragment shareLaterFragment = this.A00;
        UserSession userSession = shareLaterFragment.A00;
        if (userSession == null) {
            AbstractC31171DnF.A0y();
            throw C00O.createAndThrow();
        }
        ShareLaterMedia shareLaterMedia = shareLaterFragment.A04;
        C14360o3.A0A(shareLaterMedia);
        AbstractC73317Y7a.A0E(shareLaterFragment, userSession, shareLaterMedia.A05, "share_later_view", str);
    }

    public PIF(ShareLaterFragment shareLaterFragment) {
        this.A00 = shareLaterFragment;
    }
}
