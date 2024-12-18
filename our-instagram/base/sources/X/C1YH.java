package X;

import com.facebook.common.dextricks.OptSvcAnalyticsStore;
import java.util.LinkedHashMap;

/* renamed from: X.1YH, reason: invalid class name */
/* loaded from: classes.dex */
public final class C1YH {
    public static final C1YH A00 = new Object();

    public static final void A00(C18920wW c18920wW, C38321qM c38321qM, Integer num, String str, String str2) {
        Long l;
        C14360o3.A0B(c38321qM, 0);
        C14360o3.A0B(c18920wW, 3);
        InterfaceC02590Ai A002 = c18920wW.A00(c18920wW.A00, "instagram_wellbeing_nudging");
        A002.AAP("source_of_action", "comment_reply");
        A002.A9M("extra_values", AbstractC06930Yk.A07(new C09530e4("view_variant", A32.A00(num))));
        Long l2 = null;
        if (str2 != null) {
            l = AbstractC003100w.A0k(10, str2);
        } else {
            l = null;
        }
        A002.A9K("parent_comment_id", l);
        if (str != null) {
            l2 = AbstractC003100w.A0k(10, str);
        }
        A002.A9K("replied_to_comment_id", l2);
        A002.AAP("media_id", c38321qM.getId());
        A002.AAP(OptSvcAnalyticsStore.LOGGING_KEY_STEP, "nudge_eligible");
        A002.Cht();
    }

    public static final void A01(C18920wW c18920wW, C38321qM c38321qM, Integer num, String str, String str2, boolean z) {
        Long l;
        C14360o3.A0B(c38321qM, 0);
        C14360o3.A0B(c18920wW, 5);
        LinkedHashMap A07 = AbstractC06930Yk.A07(new C09530e4("is_launched_from_bottomsheet", String.valueOf(z)), new C09530e4("view_variant", A32.A00(num)));
        InterfaceC02590Ai A002 = c18920wW.A00(c18920wW.A00, "instagram_wellbeing_nudging");
        A002.AAP("source_of_action", "comment_reply");
        A002.A9M("extra_values", A07);
        Long l2 = null;
        if (str2 != null) {
            l = AbstractC003100w.A0k(10, str2);
        } else {
            l = null;
        }
        A002.A9K("parent_comment_id", l);
        if (str != null) {
            l2 = AbstractC003100w.A0k(10, str);
        }
        A002.A9K("replied_to_comment_id", l2);
        A002.AAP("media_id", c38321qM.getId());
        A002.AAP(OptSvcAnalyticsStore.LOGGING_KEY_STEP, "impression");
        A002.Cht();
    }

    public static final void A02(C18920wW c18920wW, Integer num) {
        String str;
        InterfaceC02590Ai A002 = c18920wW.A00(c18920wW.A00, "instagram_wellbeing_nudging");
        A002.AAP("source_of_action", "pending_review_story_reply");
        switch (num.intValue()) {
            case 0:
                str = "nudge_eligible";
                break;
            case 1:
                str = "impression";
                break;
            case 2:
                str = "learn_more_click";
                break;
            case 3:
                str = "close_click";
                break;
            default:
                str = "continue_click";
                break;
        }
        A002.AAP(OptSvcAnalyticsStore.LOGGING_KEY_STEP, str);
        A002.Cht();
    }

    public static final void A03(C18920wW c18920wW, Integer num, boolean z) {
        String str;
        LinkedHashMap A07 = AbstractC06930Yk.A07(new C09530e4("is_story_creation", String.valueOf(z)));
        InterfaceC02590Ai A002 = c18920wW.A00(c18920wW.A00, "instagram_wellbeing_nudging");
        A002.AAP("source_of_action", "media_creation");
        A002.A9M("extra_values", A07);
        switch (num.intValue()) {
            case 1:
                str = "impression";
                break;
            case 2:
                str = "learn_more_click";
                break;
            case 3:
                str = "close_click";
                break;
            case 4:
                str = "continue_click";
                break;
            default:
                str = "skip";
                break;
        }
        A002.AAP(OptSvcAnalyticsStore.LOGGING_KEY_STEP, str);
        A002.Cht();
    }

    public static final void A04(C18920wW c18920wW, Integer num, boolean z) {
        String str;
        LinkedHashMap A07 = AbstractC06930Yk.A07(new C09530e4("is_bottom_sheet", String.valueOf(z)));
        InterfaceC02590Ai A002 = c18920wW.A00(c18920wW.A00, "instagram_wellbeing_nudging");
        A002.AAP("source_of_action", "story_reply");
        A002.A9M("extra_values", A07);
        switch (num.intValue()) {
            case 0:
                str = "nudge_eligible";
                break;
            case 1:
                str = "impression";
                break;
            case 2:
                str = "learn_more_click";
                break;
            default:
                str = "close_click";
                break;
        }
        A002.AAP(OptSvcAnalyticsStore.LOGGING_KEY_STEP, str);
        A002.Cht();
    }
}
