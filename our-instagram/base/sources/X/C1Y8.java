package X;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.avatars.ImmersiveAvatarViewerDebugFragment;
import com.instagram.modal.ModalActivity;
import java.util.UUID;

/* renamed from: X.1Y8, reason: invalid class name */
/* loaded from: classes.dex */
public final class C1Y8 {
    public static C1Y8 A00;

    /* JADX WARN: Multi-variable type inference failed */
    public final void A00(Bundle bundle, FragmentActivity fragmentActivity, UserSession userSession, String str) {
        C14360o3.A0B(userSession, 2);
        C14360o3.A0B(bundle, 3);
        VRC.A00(userSession).A05(str, null, null);
        bundle.putString(ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY, str);
        String string = bundle.getString("coupon_offer_id");
        String string2 = bundle.getString("dummy_param_random_uuid");
        String string3 = bundle.getString(ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY);
        if (string3 == null || string3.length() == 0) {
            string3 = "DEEP_LINK_UNKNOWN";
        }
        if (fragmentActivity instanceof InterfaceC53722dB) {
            ((InterfaceC53722dB) fragmentActivity).EfI(C1QO.A0E);
            A02(fragmentActivity, userSession, string3, string, false);
            return;
        }
        if (string2 == null) {
            Uri.Builder authority = new Uri.Builder().scheme("instagram").authority("active_promotions");
            authority.appendQueryParameter(ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY, string3);
            if (string != null) {
                authority.appendQueryParameter("coupon_offer_id", string);
            }
            authority.appendQueryParameter("dummy_param_random_uuid", UUID.randomUUID().toString());
            Intent data = C14H.A03.A00().A01(fragmentActivity).setData(authority.build());
            C14360o3.A07(data);
            C12260kU.A0C(fragmentActivity, data);
        }
        fragmentActivity.finish();
    }

    public final void A01(FragmentActivity fragmentActivity, UserSession userSession, String str) {
        C14360o3.A0B(userSession, 2);
        VRC.A00(userSession).A05(str, null, null);
        Bundle bundle = new Bundle();
        bundle.putString(ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY, str);
        C6XJ.A06(fragmentActivity, bundle, ModalActivity.class, "promote_ads_manager");
    }

    public final void A02(FragmentActivity fragmentActivity, UserSession userSession, String str, String str2, boolean z) {
        C14360o3.A0B(str, 0);
        C14360o3.A0B(fragmentActivity, 1);
        C14360o3.A0B(userSession, 2);
        VRC.A00(userSession).A05(str, null, null);
        V16 A01 = AbstractC155756z4.A00().A02().A01(userSession, str, str2);
        C140966Yy c140966Yy = new C140966Yy(fragmentActivity, userSession);
        c140966Yy.A0B(null, A01);
        c140966Yy.A08();
        if (z) {
            c140966Yy.A0D = false;
        }
        c140966Yy.A04();
    }
}
