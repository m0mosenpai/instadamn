package X;

import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.avatars.ImmersiveAvatarViewerDebugFragment;
import com.instagram.user.model.User;
import java.util.HashMap;

/* renamed from: X.BxP, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C27100BxP extends AbstractC64162vb {
    public final C19270xB A00;
    public final UserSession A01;

    private final void A00(C120985dq c120985dq, InterfaceC11380iw interfaceC11380iw, UserSession userSession) {
        Long l;
        C38321qM c38321qM = c120985dq.A02;
        if (c38321qM != null && c38321qM.A0C.BGH() != null) {
            HashMap A1G = AbstractC166987dD.A1G();
            String id = c38321qM.getId();
            if (id != null) {
                A1G.put("post_igid", id);
            }
            String str = null;
            if (c38321qM.A0C.BGH() != null) {
                InterfaceC84473pq BGH = c38321qM.A0C.BGH();
                if (BGH != null) {
                    l = Long.valueOf(BGH.BF4());
                } else {
                    l = null;
                }
                A1G.put("product_id", String.valueOf(l));
            }
            User A2E = c38321qM.A2E(userSession);
            InterfaceC02590Ai A0f = AbstractC166987dD.A0f(AbstractC12220kQ.A01(interfaceC11380iw, userSession), "ig_ads_conversion_funnel");
            A0f.A8R(EnumC53368NjJ.BIO_IG_REELS, ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY);
            A0f.AAP("consumer_igid", userSession.userId);
            if (A2E != null) {
                str = A2E.getId();
            }
            A0f.AAP("seller_igid", str);
            A0f.A9M("extra_data", A1G);
            A0f.AAP("event", "buyer_view_inquiry_cta");
            A0f.Cht();
        }
    }

    @Override // X.AbstractC64162vb
    public final /* bridge */ /* synthetic */ void A03(Object obj, Object obj2) {
        C120985dq c120985dq = (C120985dq) obj;
        C14360o3.A0B(c120985dq, 0);
        A00(c120985dq, this.A00, this.A01);
    }

    @Override // X.AbstractC64162vb
    public final /* bridge */ /* synthetic */ void A04(Object obj, Object obj2) {
        C120985dq c120985dq = (C120985dq) obj;
        C14360o3.A0B(c120985dq, 0);
        A00(c120985dq, this.A00, this.A01);
    }

    public C27100BxP(UserSession userSession, String str) {
        super(AbstractC62712tA.A00(userSession).A00());
        this.A01 = userSession;
        this.A00 = new C19270xB(str);
    }
}
