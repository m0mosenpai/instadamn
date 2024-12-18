package X;

import android.content.Context;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.react.modules.product.IgReactPurchaseExperienceBridgeModule;
import com.instagram.user.model.FollowStatus;
import com.instagram.user.model.User;
import org.json.JSONObject;

/* loaded from: classes9.dex */
public abstract class OQF {
    public static final void A00(Context context, UserSession userSession, EnumC154216wW enumC154216wW, User user) {
        AbstractC167007dF.A1E(userSession, 0, enumC154216wW);
        JSONObject A0q = AbstractC31171DnF.A0q();
        A0q.put(IgReactPurchaseExperienceBridgeModule.RN_SHOP_PAY_STATUS, "ok");
        int i = enumC154216wW.A00;
        A0q.put("notification_setting_type", i);
        user.A03.EQY(new C44A(AbstractC166987dD.A19(A0q)));
        user.A0c(userSession);
        long parseLong = Long.parseLong(userSession.userId);
        long parseLong2 = Long.parseLong(user.getId());
        C25621Ms A0c = AbstractC167017dG.A0c(userSession);
        A0c.A03();
        A0c.A0B("api/v1/direct_v2/update_notification_setting/");
        A0c.A0E("user_igid", parseLong);
        A0c.A0E("creator_igid", parseLong2);
        A0c.A0D(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, i);
        C1ON A0e = AbstractC25227BEk.A0e(A0c, N2L.class, C54852ONd.class);
        MWM.A00(A0e, context, user, 19);
        C1GJ.A01().schedule(A0e);
    }

    public static final void A01(Context context, User user) {
        String A0f;
        String str;
        FollowStatus B7L = user.B7L();
        FollowStatus followStatus = FollowStatus.A06;
        if (B7L == followStatus) {
            A0f = context.getString(2131968847);
        } else {
            A0f = AbstractC167007dF.A0f(context, context.getString(R.string.res_0x7f130072_name_removed), 2131977131);
        }
        C14360o3.A0A(A0f);
        if (user.B7L() == followStatus) {
            str = "notification_turn_on_error_for_unfollowed_account";
        } else {
            str = "favoriteForBroadcastChat failure";
        }
        C9GR.A03(context, A0f, str, 0);
    }
}
