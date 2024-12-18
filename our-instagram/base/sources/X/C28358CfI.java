package X;

import android.content.Context;
import androidx.fragment.app.FragmentActivity;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;
import java.lang.ref.WeakReference;

/* renamed from: X.CfI, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C28358CfI {
    public static final C28358CfI A00 = new Object();

    public static final void A00(EnumC25577BSp enumC25577BSp, UserSession userSession, ImageUrl imageUrl, C38321qM c38321qM, Integer num, Integer num2, String str, String str2, String str3, String str4, String str5, String str6, WeakReference weakReference) {
        FragmentActivity fragmentActivity;
        FragmentActivity fragmentActivity2;
        if (AbstractC84973ql.A00(userSession).A06()) {
            LJe.A00.A02(userSession, new C45000Jvq(enumC25577BSp, imageUrl, null, num, num2, str, str2, str3, str4, str5, str6, null, false), weakReference);
            return;
        }
        CTS cts = C26867BtT.A08;
        Object obj = weakReference.get();
        if (!(obj instanceof FragmentActivity) || (fragmentActivity = (FragmentActivity) obj) == null) {
            return;
        }
        Object obj2 = weakReference.get();
        if (!(obj2 instanceof FragmentActivity) || (fragmentActivity2 = (FragmentActivity) obj2) == null) {
            return;
        }
        C29215CuK c29215CuK = new C29215CuK(fragmentActivity2, new D95(enumC25577BSp, userSession, imageUrl, num, num2, str, str2, str3, str4, str5, str6, weakReference));
        String id = c38321qM.getId();
        if (id == null) {
            return;
        }
        cts.A00(fragmentActivity, EnumC25577BSp.UFI_RESHARE_SHEET, userSession, c29215CuK, id, str3, null, true, true);
    }

    public final void A01(UserSession userSession, ImageUrl imageUrl, C38321qM c38321qM, Integer num, Integer num2, Integer num3, String str, String str2, String str3, String str4, String str5, String str6, WeakReference weakReference) {
        String id;
        AbstractC167017dG.A1P(userSession, weakReference);
        C14360o3.A0B(str3, 5);
        if (num == C05F.A01) {
            EnumC25577BSp enumC25577BSp = EnumC25577BSp.UFI;
            if (c38321qM != null) {
                A00(enumC25577BSp, userSession, imageUrl, c38321qM, num2, num3, str, str2, str3, str4, str5, str6, weakReference);
                return;
            }
            return;
        }
        if (num != C05F.A0C || c38321qM == null || (id = c38321qM.getId()) == null) {
            return;
        }
        InterfaceC02590Ai A0f = AbstractC166987dD.A0f(AbstractC12220kQ.A02(userSession), "instagram_media_ufi_recycle_button_click_client");
        if (A0f.isSampled()) {
            A0f.AAP("media_id", id);
            A0f.A9K("carousel_index", AbstractC25234BEr.A0X(A0f, num3, "container_module", str3));
            AbstractC25233BEq.A17(A0f, "carousel_media_id", str6);
            A0f.AAP("inventory_source", str4);
            AbstractC25229BEm.A1B(A0f, str5);
        }
        C54842OMn c54842OMn = new C54842OMn(userSession);
        Context context = (Context) weakReference.get();
        if (context == null) {
            return;
        }
        if (c38321qM.A4c()) {
            c54842OMn.A03(AbstractC166987dD.A0O(context), new ViewOnClickListenerC28656Cl4(userSession, imageUrl, c38321qM, num2, num3, str, str2, str3, str4, str5, str6, weakReference), AbstractC166997dE.A0p(context, 2131968750), str3, R.drawable.instagram_icons_exceptions_content_notes_1_pano_outline_24, false);
        }
        if (F15.A00(userSession, c38321qM)) {
            c54842OMn.A03(AbstractC166987dD.A0O(context), new ViewOnClickListenerC28655Cl3(weakReference, num3, userSession, c38321qM, str3, 1), AbstractC166997dE.A0p(context, 2131952398), str3, R.drawable.instagram_new_story_pano_outline_24, false);
        }
        if (c54842OMn.A05.size() <= 0) {
            return;
        }
        OJT ojt = new OJT(c54842OMn);
        Context context2 = (Context) weakReference.get();
        if (context2 == null) {
            return;
        }
        ojt.A00(context2);
    }
}
