package X;

import android.content.Context;
import androidx.fragment.app.FragmentActivity;
import com.instagram.bloks.hosting.IgBloksScreenConfig;
import com.instagram.common.session.UserSession;
import com.instagram.modal.ModalActivity;
import java.util.HashMap;
import java.util.List;

/* renamed from: X.Oeq, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public abstract class AbstractC55224Oeq {
    public static final void A06(FragmentActivity fragmentActivity, UserSession userSession, Integer num, String str) {
        HashMap A1G = AbstractC166987dD.A1G();
        A1G.put("source_name", str);
        if (num != null) {
            A1G.put("promoted_section", "CLIMATE");
        }
        C66277U6x A01 = C66277U6x.A01("com.instagram.giving.story_sticker_creation.screen", A1G);
        IgBloksScreenConfig A0C = AbstractC31171DnF.A0C(userSession);
        A0C.A0l = false;
        A0C.A0k = false;
        A0C.A0i = true;
        AbstractC31177DnL.A0n(fragmentActivity, W6d.A00(A0C, A01), userSession, ModalActivity.class, "bloks");
    }

    public static final void A07(FragmentActivity fragmentActivity, UserSession userSession, Integer num, String str, String str2, String str3, String str4, String str5, String str6, List list) {
        C14360o3.A0B(userSession, 0);
        boolean A1V = AbstractC167007dF.A1V(str);
        C66277U6x A01 = C66277U6x.A01("com.instagram.social_impact.fundraiser.nonprofit_creation_details_for_feed.component.view", A00(num, str, str2, str3, str4, str5, str6, list));
        IgBloksScreenConfig A0C = AbstractC31171DnF.A0C(userSession);
        A0C.A0l = false;
        A0C.A0k = false;
        A0C.A0i = A1V;
        AbstractC31177DnL.A0n(fragmentActivity, W6d.A00(A0C, A01), userSession, ModalActivity.class, "bloks");
    }

    public static final void A09(FragmentActivity fragmentActivity, UserSession userSession, String str, String str2, String str3, String str4) {
        A0A(fragmentActivity, userSession, str, str2, str3, str4, true);
        A03(AbstractC166987dD.A0O(fragmentActivity), userSession, str, str2, str3, str4);
    }

    public static final void A0A(FragmentActivity fragmentActivity, UserSession userSession, String str, String str2, String str3, String str4, boolean z) {
        AbstractC167017dG.A1P(fragmentActivity, str);
        C66277U6x A01 = C66277U6x.A01("com.instagram.social_impact.fundraiser.personal.component.view", A01(str, str2, str3, str4, z));
        IgBloksScreenConfig A0C = AbstractC31171DnF.A0C(userSession);
        A0C.A0l = false;
        A0C.A0k = false;
        A0C.A0P = C05F.A01;
        A01.A04(fragmentActivity, A0C);
    }

    public static final void A0B(FragmentActivity fragmentActivity, UserSession userSession, String str, boolean z) {
        String str2;
        C14360o3.A0B(userSession, 0);
        HashMap A1G = AbstractC166987dD.A1G();
        A1G.put("source_name", str);
        if (z) {
            str2 = "True";
        } else {
            str2 = "False";
        }
        A1G.put("has_raise_money_options", str2);
        C66277U6x A01 = C66277U6x.A01("com.instagram.social_impact.fundraiser.nonprofit_creation_for_feed.component.view", A1G);
        IgBloksScreenConfig A0C = AbstractC31171DnF.A0C(userSession);
        A0C.A0l = false;
        A0C.A0k = false;
        A0C.A0i = true;
        A0C.A0R = "instagram_fundraiser";
        AbstractC31177DnL.A0n(fragmentActivity, W6d.A00(A0C, A01), userSession, ModalActivity.class, "bloks");
    }

    public static final void A02(Context context, UserSession userSession, String str, String str2, String str3) {
        HashMap A11 = AbstractC31174DnI.A11(str, 2);
        A11.put("fundraiser_id", str);
        A11.put("source_name", "FEED_POST");
        if (str2 != null) {
            A11.put("source_owner_igid", str2);
        }
        if (str3 != null) {
            A11.put("source_media_igid", str3);
        }
        C66277U6x.A01(AbstractC111324zv.A00(811), A11).A05(context, AbstractC31171DnF.A0C(userSession));
    }

    public static final void A05(FragmentActivity fragmentActivity, UserSession userSession) {
        HashMap A1G = AbstractC166987dD.A1G();
        A1G.put("source_name", "PRE_LIVE");
        C66277U6x A01 = C66277U6x.A01("com.instagram.giving.live_creation.screen", A1G);
        IgBloksScreenConfig A0C = AbstractC31171DnF.A0C(userSession);
        A0C.A0l = false;
        A0C.A0k = false;
        A0C.A0i = true;
        A0C.A0R = "instagram_fundraiser";
        AbstractC31177DnL.A0n(fragmentActivity, W6d.A00(A0C, A01), userSession, ModalActivity.class, "bloks");
    }

    public static final void A08(FragmentActivity fragmentActivity, UserSession userSession, Integer num, String str, String str2, String str3, String str4, List list) {
        HashMap A1G = AbstractC166987dD.A1G();
        A1G.put("charity_id", str);
        A1G.put("source_name", "STANDALONE_FUNDRAISER_STICKER");
        if (str2 != null) {
            A1G.put("initial_title", str2);
        }
        if (num != null) {
            A1G.put("initial_goal_amount", num.toString());
        }
        if (str3 != null) {
            A1G.put("initial_currency_abbreviation", str3);
        }
        if (list != null) {
            A1G.put("initial_selected_users_to_be_invited", list.toString());
        }
        A1G.put("is_standalone_modal", "True");
        if (str4 != null) {
            A1G.put(AbstractC58317Pt9.A00(6), str4);
        }
        AbstractC54282Nz2.A00(AbstractC166987dD.A0O(fragmentActivity), userSession, "com.instagram.giving.nonprofit_fundraiser_creation_details_for_story_sticker.screen", A1G, 60L);
    }

    public static final HashMap A00(Integer num, String str, String str2, String str3, String str4, String str5, String str6, List list) {
        HashMap A1G = AbstractC166987dD.A1G();
        A1G.put("charity_id", str);
        A1G.put("source_name", str2);
        if (str3 != null) {
            A1G.put("initial_title", str3);
        }
        if (num != null) {
            A1G.put("initial_goal_amount", num.toString());
        }
        if (str4 != null) {
            A1G.put("initial_currency_abbreviation", str4);
        }
        if (list != null) {
            A1G.put("initial_selected_users_to_be_invited", list.toString());
        }
        if (str5 != null) {
            A1G.put("initial_description", str5);
        }
        A1G.put("is_standalone_modal", "True");
        if (str6 != null) {
            A1G.put(AbstractC58317Pt9.A00(6), str6);
        }
        return A1G;
    }

    public static final HashMap A01(String str, String str2, String str3, String str4, boolean z) {
        String str5;
        HashMap A1G = AbstractC166987dD.A1G();
        A1G.put("fundraiser_id", str);
        A1G.put("source_name", str2);
        if (z) {
            str5 = "True";
        } else {
            str5 = "False";
        }
        A1G.put("is_prefetch", str5);
        A1G.put("source_owner_igid", str3);
        A1G.put("source_media_igid", str4);
        return A1G;
    }

    public static final void A03(Context context, UserSession userSession, String str, String str2, String str3, String str4) {
        AbstractC191798eb.A01(context, new C191778eZ(userSession), "com.instagram.social_impact.fundraiser.personal.component.view", null, A01(str, str2, str3, str4, AbstractC167007dF.A1V(str)));
    }

    public static final void A04(Context context, UserSession userSession, String str, String str2, String str3, String str4) {
        AbstractC191798eb.A04(context, new C191778eZ(userSession), "com.instagram.social_impact.fundraiser.personal.component.view", A01(str, str2, str3, str4, AbstractC167007dF.A1V(str)), 60L);
    }
}
