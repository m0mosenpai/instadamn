package X;

import com.facebook.common.callercontext.CallerContext;
import com.instagram.common.session.UserSession;
import com.instagram.creation.fragment.ShareLaterFragment;

/* renamed from: X.PFt, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C56725PFt implements GZR {
    public final int A00;
    public final Object A01;

    public C56725PFt(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    @Override // X.GZR
    public final void onAuthorizeFail() {
    }

    @Override // X.GZR
    public final void onAuthorizeSuccess(String str) {
        switch (this.A00) {
            case 0:
                ShareLaterFragment shareLaterFragment = (ShareLaterFragment) this.A01;
                UserSession userSession = shareLaterFragment.A00;
                if (userSession == null) {
                    AbstractC31171DnF.A0y();
                    throw C00O.createAndThrow();
                }
                C196068lw.A00(userSession).A01(ShareLaterFragment.A0I, shareLaterFragment.A02, "feed_share_later");
                return;
            case 1:
                C14360o3.A0B(str, 0);
                InterfaceC58310Pt2 A03 = ((OX2) this.A01).A03();
                C14360o3.A0C(A03, "null cannot be cast to non-null type com.instagram.creation.publishscreen.fragment.feed.FeedPublishScreenDelegate");
                ((P0G) A03).A04(str);
                return;
            case 2:
                C50990Mfx c50990Mfx = (C50990Mfx) this.A01;
                c50990Mfx.A01();
                C131975xX c131975xX = C131965xW.A05;
                C131975xX.A00(c50990Mfx.A04).A09(null, "video_feed_relink");
                return;
            default:
                C33227ElJ c33227ElJ = (C33227ElJ) this.A01;
                InterfaceC09390do interfaceC09390do = c33227ElJ.A06;
                C196058lv A00 = C196068lw.A00(AbstractC166987dD.A0r(interfaceC09390do));
                CallerContext callerContext = c33227ElJ.A05;
                C14360o3.A06(callerContext);
                C131995xZ A002 = A00.A00(callerContext);
                if (A002.A01 == C05F.A01) {
                    C33227ElJ.A01(c33227ElJ, true);
                } else {
                    c33227ElJ.setItems(C33227ElJ.A00(c33227ElJ));
                }
                if (C196068lw.A03(A002)) {
                    C196188m9 c196188m9 = c33227ElJ.A03;
                    if (c196188m9 == null) {
                        c196188m9 = new C196188m9(AbstractC166987dD.A0r(interfaceC09390do));
                        c33227ElJ.A03 = c196188m9;
                    }
                    c196188m9.A06("account_linking_setting", false);
                    return;
                }
                return;
        }
    }
}
