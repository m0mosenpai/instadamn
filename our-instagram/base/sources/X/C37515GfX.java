package X;

import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.avatars.ImmersiveAvatarViewerDebugFragment;
import com.instagram.user.model.User;
import java.util.AbstractMap;
import java.util.HashMap;

/* renamed from: X.GfX, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C37515GfX implements JH3 {
    public final InterfaceC11380iw A00;
    public final UserSession A01;
    public final Fragment A02;

    public C37515GfX(Fragment fragment, InterfaceC11380iw interfaceC11380iw, UserSession userSession) {
        C14360o3.A0B(interfaceC11380iw, 3);
        this.A01 = userSession;
        this.A02 = fragment;
        this.A00 = interfaceC11380iw;
    }

    public static void A00(C38321qM c38321qM, Object obj, AbstractMap abstractMap) {
        abstractMap.put("post_igid", obj);
        if (c38321qM.A0C.BGH() != null) {
            InterfaceC84473pq BGH = c38321qM.A0C.BGH();
            C14360o3.A0A(BGH);
            abstractMap.put("product_id", String.valueOf(BGH.BF4()));
        }
    }

    @Override // X.JH3
    public final void DL8(C81373k7 c81373k7, C38321qM c38321qM, C75113Zb c75113Zb) {
        if (c38321qM.A0C.BGH() != null) {
            HashMap A1G = AbstractC166987dD.A1G();
            String id = c38321qM.getId();
            if (id != null) {
                A1G.put("ig_post_id", id);
                FragmentActivity requireActivity = this.A02.requireActivity();
                UserSession userSession = this.A01;
                C140966Yy A0r = AbstractC25225BEi.A0r(requireActivity, userSession);
                A0r.A0D(AbstractC31180DnO.A0G(userSession, AbstractC111324zv.A00(100), A1G));
                A0r.A04();
                HashMap A1G2 = AbstractC166987dD.A1G();
                String id2 = c38321qM.getId();
                if (id2 != null) {
                    A00(c38321qM, id2, A1G2);
                    User A2E = c38321qM.A2E(userSession);
                    InterfaceC02590Ai A0f = AbstractC166987dD.A0f(AbstractC12220kQ.A01(this.A00, userSession), "ig_ads_conversion_funnel");
                    A0f.A8R(EnumC53368NjJ.BIO_IG_POST, ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY);
                    A0f.AAP("consumer_igid", userSession.userId);
                    A0f.AAP("seller_igid", AbstractC25231BEo.A0t(A2E));
                    AbstractC37300Gc1.A0u(A0f, A1G2);
                    A0f.AAP("event", "buyer_click_inquiry_cta");
                    A0f.Cht();
                    return;
                }
                throw AbstractC166997dE.A0g();
            }
            throw AbstractC166997dE.A0g();
        }
    }

    @Override // X.JH3
    public final void EDK(View view, C38321qM c38321qM) {
        if (c38321qM.A0C.BGH() != null) {
            HashMap A1G = AbstractC166987dD.A1G();
            String id = c38321qM.getId();
            if (id != null) {
                A00(c38321qM, id, A1G);
                UserSession userSession = this.A01;
                User A2E = c38321qM.A2E(userSession);
                InterfaceC02590Ai A0f = AbstractC166987dD.A0f(AbstractC12220kQ.A01(this.A00, userSession), "ig_ads_conversion_funnel");
                A0f.A8R(EnumC53368NjJ.BIO_IG_POST, ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY);
                A0f.AAP("consumer_igid", userSession.userId);
                A0f.AAP("seller_igid", AbstractC25231BEo.A0t(A2E));
                AbstractC37300Gc1.A0u(A0f, A1G);
                A0f.AAP("event", AbstractC111324zv.A00(4048));
                A0f.Cht();
                return;
            }
            throw AbstractC166997dE.A0g();
        }
    }
}
