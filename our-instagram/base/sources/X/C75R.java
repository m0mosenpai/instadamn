package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.common.dextricks.OptSvcAnalyticsStore;
import com.instagram.common.session.UserSession;
import com.instagram.react.modules.base.IgReactQEModule;
import com.instagram.realtimeclient.GraphQLSubscriptionID;
import com.instagram.realtimeclient.RealtimeConstants;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;

/* renamed from: X.75R, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C75R {
    public static final C75R A00 = new Object();

    public static final void A02(InterfaceC02550Ad interfaceC02550Ad, EnumC1579076z enumC1579076z, EnumC33464Eqz enumC33464Eqz, EnumC33371Ep4 enumC33371Ep4, String str, String str2, String str3) {
        C14360o3.A0B(enumC33371Ep4, 1);
        HashMap hashMap = new HashMap();
        hashMap.put("nav_chain", C1QM.A00.A02.A00);
        C18920wW c18920wW = (C18920wW) interfaceC02550Ad;
        InterfaceC02590Ai A002 = c18920wW.A00(c18920wW.A00, "ig_wellbeing_restrict_upsell_action");
        A002.AAP("action", str);
        A002.AAP(OptSvcAnalyticsStore.LOGGING_KEY_STEP, str2);
        A002.AAP("entrypoint", A01(enumC33371Ep4));
        A002.A9M("extra_values", hashMap);
        Long A003 = A00(str3);
        if (A003 != null) {
            A002.A9K("actor_ig_userid", A003);
        }
        if (enumC1579076z != null) {
            A002.A8R(enumC1579076z, "source_of_action");
        }
        if (enumC33464Eqz != null) {
            A002.A8R(enumC33464Eqz, PublicKeyCredentialControllerUtility.JSON_KEY_TYPE);
        }
        A002.Cht();
    }

    public static final void A03(InterfaceC02550Ad interfaceC02550Ad, EnumC1579076z enumC1579076z, EnumC33464Eqz enumC33464Eqz, String str, String str2) {
        C14360o3.A0B(interfaceC02550Ad, 0);
        A04(interfaceC02550Ad, enumC1579076z, enumC33464Eqz, "click", str, str2);
    }

    public static final void A07(InterfaceC02550Ad interfaceC02550Ad, UserSession userSession, C2ED c2ed, List list) {
        String str;
        C14360o3.A0B(userSession, 0);
        C14360o3.A0B(list, 1);
        C14360o3.A0B(interfaceC02550Ad, 2);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (((AnonymousClass172) it.next()).isRestricted()) {
                if (C28151Xt.A02 != null) {
                    if (list.size() == 1) {
                        str = "open_restricted_thread";
                    } else {
                        str = "open_restricted_group_thread";
                    }
                    A08(interfaceC02550Ad, c2ed, str);
                    return;
                }
                return;
            }
        }
    }

    public static final void A08(InterfaceC02550Ad interfaceC02550Ad, C2ED c2ed, String str) {
        String str2;
        List arrayList;
        C14360o3.A0B(interfaceC02550Ad, 0);
        if (c2ed != null) {
            str2 = c2ed.C7q();
            arrayList = c2ed.BSD();
        } else {
            str2 = null;
            arrayList = new ArrayList();
        }
        A06(interfaceC02550Ad, null, null, "click", str, str2, arrayList);
    }

    public static final Long A00(String str) {
        if (str != null) {
            return AbstractC003100w.A0k(10, str);
        }
        return null;
    }

    public static final void A04(InterfaceC02550Ad interfaceC02550Ad, EnumC1579076z enumC1579076z, EnumC33464Eqz enumC33464Eqz, String str, String str2, String str3) {
        HashMap hashMap = new HashMap();
        hashMap.put("nav_chain", C1QM.A00.A02.A00);
        C18920wW c18920wW = (C18920wW) interfaceC02550Ad;
        InterfaceC02590Ai A002 = c18920wW.A00(c18920wW.A00, "ig_wellbeing_restrict_group_chat_warning");
        A002.AAP("action", str);
        A002.AAP(OptSvcAnalyticsStore.LOGGING_KEY_STEP, str2);
        A002.AAP("entrypoint", RealtimeConstants.GRAPHQL_SUBSCRIPTION_MESSAGE_TOPIC_FOR_DIRECT_TYPING);
        A002.A9M("extra_values", hashMap);
        Long A003 = A00(str3);
        if (A003 != null) {
            A002.A9K("direct_thread_id", A003);
        }
        A002.A8R(enumC1579076z, "source_of_action");
        A002.A8R(enumC33464Eqz, PublicKeyCredentialControllerUtility.JSON_KEY_TYPE);
        A002.Cht();
    }

    public static final void A05(InterfaceC02550Ad interfaceC02550Ad, EnumC1579076z enumC1579076z, EnumC33464Eqz enumC33464Eqz, String str, String str2, String str3, List list) {
        Long A0k;
        HashMap hashMap = new HashMap();
        hashMap.put("nav_chain", C1QM.A00.A02.A00);
        C18920wW c18920wW = (C18920wW) interfaceC02550Ad;
        InterfaceC02590Ai A002 = c18920wW.A00(c18920wW.A00, "ig_wellbeing_restrict_direct_flow_action");
        A002.AAP("action", "click");
        A002.AAP(OptSvcAnalyticsStore.LOGGING_KEY_STEP, str);
        A002.AAP("entrypoint", RealtimeConstants.GRAPHQL_SUBSCRIPTION_MESSAGE_TOPIC_FOR_DIRECT_TYPING);
        A002.A9M("extra_values", hashMap);
        if (str2 != null && (A0k = AbstractC003100w.A0k(10, str2)) != null) {
            A002.A9K("direct_thread_id", A0k);
        }
        Long A003 = A00(str3);
        if (A003 != null || ((!list.isEmpty()) && list.size() == 1 && (A003 = A00((String) AbstractC001800i.A0O(list, 0))) != null)) {
            A002.A9K("actor_ig_userid", A003);
        }
        if (enumC1579076z != null) {
            A002.A8R(enumC1579076z, "source_of_action");
        }
        if (enumC33464Eqz != null) {
            A002.A8R(enumC33464Eqz, PublicKeyCredentialControllerUtility.JSON_KEY_TYPE);
        }
        A002.Cht();
    }

    public static final void A06(InterfaceC02550Ad interfaceC02550Ad, EnumC1579076z enumC1579076z, EnumC33464Eqz enumC33464Eqz, String str, String str2, String str3, List list) {
        Long A002;
        HashMap hashMap = new HashMap();
        hashMap.put("nav_chain", C1QM.A00.A02.A00);
        C18920wW c18920wW = (C18920wW) interfaceC02550Ad;
        InterfaceC02590Ai A003 = c18920wW.A00(c18920wW.A00, "ig_wellbeing_restrict_manage_direct_thread");
        A003.AAP("action", str);
        A003.AAP(OptSvcAnalyticsStore.LOGGING_KEY_STEP, str2);
        A003.AAP("entrypoint", RealtimeConstants.GRAPHQL_SUBSCRIPTION_MESSAGE_TOPIC_FOR_DIRECT_TYPING);
        A003.A9M("extra_values", hashMap);
        if (str3 != null) {
            Long A0k = AbstractC003100w.A0k(10, str3);
            if (A0k != null) {
                A003.A9K("direct_thread_id", A0k);
            }
            if (list.size() == 1 && (A002 = A00((String) AbstractC001800i.A0O(list, 0))) != null) {
                A003.A9K("actor_ig_userid", A002);
            }
        }
        if (enumC1579076z != null) {
            A003.A8R(enumC1579076z, "source_of_action");
        }
        if (enumC33464Eqz != null) {
            A003.A8R(enumC33464Eqz, PublicKeyCredentialControllerUtility.JSON_KEY_TYPE);
        }
        A003.Cht();
    }

    public static final void A09(InterfaceC02550Ad interfaceC02550Ad, User user, String str, String str2) {
        String str3;
        HashMap hashMap = new HashMap();
        hashMap.put("nav_chain", C1QM.A00.A02.A00);
        C18920wW c18920wW = (C18920wW) interfaceC02550Ad;
        InterfaceC02590Ai A002 = c18920wW.A00(c18920wW.A00, "ig_wellbeing_restrict_list_action");
        A002.AAP("action", str);
        A002.AAP(OptSvcAnalyticsStore.LOGGING_KEY_STEP, str2);
        A002.A9M("extra_values", hashMap);
        if (user != null) {
            str3 = user.getId();
        } else {
            str3 = null;
        }
        Long A003 = A00(str3);
        if (A003 != null) {
            A002.A9K("actor_ig_userid", A003);
        }
        A002.Cht();
    }

    public static final void A0A(InterfaceC02550Ad interfaceC02550Ad, User user, String str, String str2, String str3, String str4) {
        HashMap hashMap = new HashMap();
        hashMap.put("nav_chain", C1QM.A00.A02.A00);
        C18920wW c18920wW = (C18920wW) interfaceC02550Ad;
        InterfaceC02590Ai A002 = c18920wW.A00(c18920wW.A00, "ig_wellbeing_restrict_manage_comment");
        A002.AAP("action", "click");
        A002.AAP(OptSvcAnalyticsStore.LOGGING_KEY_STEP, str);
        A002.AAP("entrypoint", GraphQLSubscriptionID.INAPP_NOTIFICATION_TYPE_COMMENT);
        A002.A9M("extra_values", hashMap);
        Long A003 = A00(user.getId());
        if (A003 != null) {
            A002.A9K("actor_ig_userid", A003);
        }
        Long A0k = AbstractC003100w.A0k(10, str2);
        if (A0k != null) {
            A002.A9K("comment_id", A0k);
        }
        Long A004 = A00(str3);
        if (A004 != null) {
            A002.A9K("parent_comment_id", A004);
        }
        C38801rC c38801rC = C38321qM.A0h;
        String A06 = C38801rC.A06(str4);
        C14360o3.A0B(A06, 0);
        Long A0k2 = AbstractC003100w.A0k(10, A06);
        if (A0k2 != null) {
            A002.A9K("parent_media_id", A0k2);
        }
        A002.Cht();
    }

    public static final void A0B(InterfaceC02550Ad interfaceC02550Ad, EnumC33371Ep4 enumC33371Ep4, String str, String str2, String str3, String str4) {
        C18920wW c18920wW = (C18920wW) interfaceC02550Ad;
        InterfaceC02590Ai A002 = c18920wW.A00(c18920wW.A00, "instagram_wellbeing_upsells_action");
        if (A002.isSampled()) {
            LinkedHashMap A06 = AbstractC06930Yk.A06(new C09530e4("nav_chain", C1QM.A00.A02.A00), new C09530e4("actor_ig_user_id", str2));
            A002.AAP(OptSvcAnalyticsStore.LOGGING_KEY_STEP, str);
            A002.AAP("entrypoint", A01(enumC33371Ep4));
            A002.A9M("extra_values", A06);
            A002.AAP("action", str3);
            A002.AAP("surface", str4);
            A002.Cht();
        }
    }

    public static final void A0C(InterfaceC02550Ad interfaceC02550Ad, String str, String str2) {
        C18920wW c18920wW = (C18920wW) interfaceC02550Ad;
        InterfaceC02590Ai A002 = c18920wW.A00(c18920wW.A00, "ig_wellbeing_restrict_profile_flow_action");
        A002.AAP("action", "click");
        A002.AAP(OptSvcAnalyticsStore.LOGGING_KEY_STEP, str);
        A002.AAP("entrypoint", "profile_following_sheet");
        Long A003 = A00(str2);
        if (A003 != null) {
            A002.A9K("actor_ig_userid", A003);
        }
        A002.Cht();
    }

    public static final void A0D(InterfaceC02550Ad interfaceC02550Ad, String str, String str2, String str3) {
        HashMap hashMap = new HashMap();
        hashMap.put("nav_chain", C1QM.A00.A02.A00);
        C18920wW c18920wW = (C18920wW) interfaceC02550Ad;
        InterfaceC02590Ai A002 = c18920wW.A00(c18920wW.A00, "ig_wellbeing_restrict_activity_feed_flow_action");
        A002.AAP("action", str);
        A002.AAP(OptSvcAnalyticsStore.LOGGING_KEY_STEP, str2);
        A002.AAP("entrypoint", "newsfeed_you");
        A002.A9M("extra_values", hashMap);
        Long A003 = A00(str3);
        if (A003 != null) {
            A002.A9K("actor_ig_userid", A003);
        }
        A002.Cht();
    }

    public static final void A0E(InterfaceC02550Ad interfaceC02550Ad, String str, String str2, String str3) {
        HashMap hashMap = new HashMap();
        hashMap.put("nav_chain", C1QM.A00.A02.A00);
        C18920wW c18920wW = (C18920wW) interfaceC02550Ad;
        InterfaceC02590Ai A002 = c18920wW.A00(c18920wW.A00, "ig_wellbeing_restrict_profile_flow_action");
        A002.AAP("action", str);
        A002.AAP(OptSvcAnalyticsStore.LOGGING_KEY_STEP, str2);
        A002.AAP("entrypoint", "profile");
        A002.A9M("extra_values", hashMap);
        Long A003 = A00(str3);
        if (A003 != null) {
            A002.A9K("actor_ig_userid", A003);
        }
        A002.Cht();
    }

    public static final void A0F(InterfaceC02550Ad interfaceC02550Ad, String str, String str2, String str3) {
        HashMap hashMap = new HashMap();
        hashMap.put("nav_chain", C1QM.A00.A02.A00);
        C18920wW c18920wW = (C18920wW) interfaceC02550Ad;
        InterfaceC02590Ai A002 = c18920wW.A00(c18920wW.A00, "ig_wellbeing_restrict_upsell_action");
        A002.AAP("action", str);
        A002.AAP(OptSvcAnalyticsStore.LOGGING_KEY_STEP, str2);
        A002.AAP("entrypoint", "profile");
        A002.A9M("extra_values", hashMap);
        Long A003 = A00(str3);
        if (A003 != null) {
            A002.A9K("actor_ig_userid", A003);
        }
        A002.Cht();
    }

    public final void A0G(InterfaceC02550Ad interfaceC02550Ad, User user, String str, String str2, String str3, String str4, String str5) {
        HashMap hashMap = new HashMap();
        hashMap.put("nav_chain", C1QM.A00.A02.A00);
        C18920wW c18920wW = (C18920wW) interfaceC02550Ad;
        InterfaceC02590Ai A002 = c18920wW.A00(c18920wW.A00, "ig_wellbeing_restrict_upsell_action");
        A002.AAP("action", "click");
        A002.AAP(OptSvcAnalyticsStore.LOGGING_KEY_STEP, str);
        A002.AAP("entrypoint", GraphQLSubscriptionID.INAPP_NOTIFICATION_TYPE_COMMENT);
        A002.A9M("extra_values", hashMap);
        if (str2 != null) {
            Long A0k = AbstractC003100w.A0k(10, str2);
            if (A0k != null) {
                A002.A9K("comment_id", A0k);
            }
            Long A003 = A00(str3);
            if (A003 != null) {
                A002.A9K("parent_comment_id", A003);
            }
            Long A004 = A00(str4);
            if (A004 != null) {
                A002.A9K("parent_media_id", A004);
            }
        }
        Long A005 = A00(str5);
        if (A005 != null || (user != null && (A005 = A00(user.getId())) != null)) {
            A002.A9K("actor_ig_userid", A005);
        }
        A002.Cht();
    }

    public final void A0H(InterfaceC02550Ad interfaceC02550Ad, User user, String str, String str2, String str3, String str4, String str5, String str6) {
        HashMap hashMap = new HashMap();
        hashMap.put("nav_chain", C1QM.A00.A02.A00);
        C18920wW c18920wW = (C18920wW) interfaceC02550Ad;
        InterfaceC02590Ai A002 = c18920wW.A00(c18920wW.A00, "ig_wellbeing_restrict_comment_flow_action");
        A002.AAP("action", str);
        A002.AAP(OptSvcAnalyticsStore.LOGGING_KEY_STEP, str2);
        A002.AAP("entrypoint", GraphQLSubscriptionID.INAPP_NOTIFICATION_TYPE_COMMENT);
        A002.A9M("extra_values", hashMap);
        if (str3 != null) {
            Long A0k = AbstractC003100w.A0k(10, str3);
            if (A0k != null) {
                A002.A9K("comment_id", A0k);
            }
            Long A003 = A00(str4);
            if (A003 != null) {
                A002.A9K("parent_comment_id", A003);
            }
            Long A004 = A00(str5);
            if (A004 != null) {
                A002.A9K("parent_media_id", A004);
            }
        }
        Long A005 = A00(str6);
        if (A005 != null || (user != null && (A005 = A00(user.getId())) != null)) {
            A002.A9K("actor_ig_userid", A005);
        }
        A002.Cht();
    }

    public static final String A01(EnumC33371Ep4 enumC33371Ep4) {
        switch (enumC33371Ep4.ordinal()) {
            case 1:
                return RealtimeConstants.GRAPHQL_SUBSCRIPTION_MESSAGE_TOPIC_FOR_DIRECT_TYPING;
            case 2:
            case 3:
            case 4:
                return GraphQLSubscriptionID.INAPP_NOTIFICATION_TYPE_COMMENT;
            case 5:
            case 6:
            case 8:
                return "profile";
            case 7:
                return "profile_following_sheet";
            case 9:
                return "newsfeed_you";
            case 10:
            case 11:
            default:
                C0w9.A03("restrict_error", "unknown analytics entry point");
                return "unknown";
            case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
                return "hide_story_from";
        }
    }
}
