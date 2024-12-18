package X;

import android.app.Activity;
import com.instagram.bloks.hosting.IgBloksScreenConfig;
import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.avatars.ImmersiveAvatarViewerDebugFragment;
import com.instagram.modal.ModalActivity;

/* loaded from: classes7.dex */
public abstract class IQb {
    public static final void A00(Activity activity, UserSession userSession, C38321qM c38321qM, String str, String str2) {
        InterfaceC02590Ai A0f = AbstractC166987dD.A0f(AbstractC12220kQ.A02(userSession), "ig_scc_upsell_event");
        A0f.AAP("event_name", "adjust_scc_clicked");
        A0f.AAP("tab", str2);
        A0f.AAP("style", str);
        String A2u = c38321qM.A2u();
        if (A2u != null) {
            A0f.A9K("ig_media_id", AbstractC166997dE.A0j(A2u));
            A0f.Cht();
            C66277U6x A00 = C66277U6x.A00(AbstractC111324zv.A00(372));
            IgBloksScreenConfig A0C = AbstractC31171DnF.A0C(userSession);
            AbstractC31171DnF.A10(activity, A0C, 2131973313);
            C14360o3.A0A(A00);
            AbstractC25228BEl.A1G(activity, W6d.A00(A0C, A00), userSession, ModalActivity.class, "bloks");
            return;
        }
        throw AbstractC166997dE.A0g();
    }

    public static final void A01(Activity activity, UserSession userSession, Integer num) {
        String str;
        if (num.intValue() != 0) {
            str = "not_interested";
        } else {
            str = "overflow_menu";
        }
        C66277U6x A01 = C66277U6x.A01(AbstractC111324zv.A00(2149), AbstractC167017dG.A0r(ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY, str));
        IgBloksScreenConfig A0C = AbstractC31171DnF.A0C(userSession);
        AbstractC31171DnF.A10(activity, A0C, 2131974881);
        C14360o3.A0A(A01);
        AbstractC25228BEl.A1G(activity, W6d.A00(A0C, A01), userSession, ModalActivity.class, "bloks");
    }
}
