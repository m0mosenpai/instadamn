package X;

import android.content.Context;
import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;
import com.instagram.bloks.hosting.IgBloksScreenConfig;
import com.instagram.common.session.UserSession;
import com.instagram.modal.ModalActivity;
import com.instagram.modal.TransparentModalActivity;
import java.util.ArrayList;
import java.util.Map;

/* renamed from: X.1YY, reason: invalid class name */
/* loaded from: classes.dex */
public final class C1YY {
    public static C1YY A01;
    public final InterfaceC09390do A00 = C1XM.A00(C28211Ya.A00);

    public final void A01(Context context, UserSession userSession, Integer num, InterfaceC16660sJ interfaceC16660sJ) {
        String str;
        C14360o3.A0B(context, 0);
        C14360o3.A0B(userSession, 1);
        IgBloksScreenConfig igBloksScreenConfig = new IgBloksScreenConfig(userSession);
        igBloksScreenConfig.A0R = "com.bloks.www.ig_subscriptions.creator_experience.subscribe_cta_settings";
        CSV csv = new CSV(context);
        switch (num.intValue()) {
            case 0:
                str = "edit_highlight";
                break;
            case 1:
                str = "settings";
                break;
            case 2:
                str = "auto_add_alert";
                break;
            case 3:
                str = "qp";
                break;
            default:
                str = "notification";
                break;
        }
        Map map = csv.A02;
        map.put("origin", str);
        map.put("callback", new C66237U5h(new D34(csv, new C50268MHx(17, interfaceC16660sJ, userSession))));
        C66277U6x A02 = C66277U6x.A02("com.bloks.www.ig_subscriptions.creator_experience.subscribe_cta_settings", AbstractC191768eY.A01(csv.A03), map);
        A02.A00 = 719983200;
        A02.A05 = null;
        A02.A01 = 0L;
        A02.A06 = null;
        A02.A03 = null;
        A02.A02 = null;
        A02.A04 = null;
        A02.A08(csv.A01);
        A02.A04(csv.A00, igBloksScreenConfig);
    }

    public final void A02(FragmentActivity fragmentActivity, UserSession userSession) {
        C14360o3.A0B(fragmentActivity, 0);
        C14360o3.A0B(userSession, 1);
        C6XJ.A02(fragmentActivity, new Bundle(), userSession, TransparentModalActivity.class, "REEL_USER_PAY_SUBSCRIBE_STORY_STICKER").A0C(fragmentActivity);
    }

    public final void A03(FragmentActivity fragmentActivity, UserSession userSession, InterfaceC1119153d interfaceC1119153d, String str, String str2) {
        C14360o3.A0B(str, 2);
        C189448aO c189448aO = new C189448aO(userSession);
        c189448aO.A1G = true;
        c189448aO.A03 = 0.9f;
        c189448aO.A0U = interfaceC1119153d;
        C189478aR A00 = c189448aO.A00();
        A00();
        Bundle bundle = new Bundle();
        AbstractC60492pY.A04(bundle, userSession);
        bundle.putString("creator_user_id", str);
        bundle.putString("origin", str2);
        bundle.putBoolean("is_bottom_sheet", true);
        EL5 el5 = new EL5();
        el5.setArguments(bundle);
        A00.A02(fragmentActivity, el5);
    }

    public final void A04(FragmentActivity fragmentActivity, UserSession userSession, Boolean bool, Boolean bool2, String str, String str2) {
        C14360o3.A0B(fragmentActivity, 0);
        C14360o3.A0B(userSession, 1);
        C14360o3.A0B(str, 2);
        C14360o3.A0B(str2, 3);
        Bundle bundle = new Bundle();
        AbstractC60492pY.A04(bundle, userSession);
        bundle.putString("creator_user_id", str);
        bundle.putString("origin", str2);
        bundle.putBoolean("is_bottom_sheet", false);
        if (bool != null) {
            bundle.putBoolean("arg_is_subscribed", bool.booleanValue());
        }
        if (bool2 != null) {
            bundle.putBoolean("arg_is_eligible_to_subscribe", bool2.booleanValue());
        }
        C6XJ c6xj = new C6XJ(fragmentActivity, bundle, userSession, ModalActivity.class, "fan_club_consideration");
        c6xj.A08();
        c6xj.A0C(fragmentActivity);
    }

    public final void A05(FragmentActivity fragmentActivity, UserSession userSession, String str, String str2) {
        A04(fragmentActivity, userSession, null, null, str, str2);
    }

    public final void A06(FragmentActivity fragmentActivity, UserSession userSession, String str, ArrayList arrayList) {
        C14360o3.A0B(userSession, 1);
        C6XJ c6xj = new C6XJ(fragmentActivity, AbstractC61636Rr0.A00(new C09530e4("ARG_CUSTOMIZED_BENEFITS_EDIT_SCREEN_ORIGIN", str), new C09530e4("ARG_SELECTED_CUSTOMIZED_BENEFITS", arrayList)), userSession, ModalActivity.class, "fan_club_edit_benefits");
        c6xj.A08();
        c6xj.A0C(fragmentActivity);
    }

    public final void A07(UserSession userSession, C189478aR c189478aR, C189448aO c189448aO, String str, String str2) {
        C14360o3.A0B(userSession, 0);
        C14360o3.A0B(str, 1);
        C14360o3.A0B(str2, 2);
        C14360o3.A0B(c189448aO, 3);
        C14360o3.A0B(c189478aR, 4);
        A00();
        Bundle bundle = new Bundle();
        AbstractC60492pY.A04(bundle, userSession);
        bundle.putString("creator_user_id", str);
        bundle.putString("origin", str2);
        bundle.putBoolean("is_bottom_sheet", true);
        EL5 el5 = new EL5();
        el5.setArguments(bundle);
        c189478aR.A0G(el5, c189448aO, false, true);
    }

    public final FRP A00() {
        return (FRP) this.A00.getValue();
    }
}
