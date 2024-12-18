package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes11.dex */
public abstract class VXG {
    public static final void A00(AnonymousClass182 anonymousClass182, C66617UPe c66617UPe) {
        C14360o3.A0B(c66617UPe, 1);
        anonymousClass182.A0d();
        anonymousClass182.A0S(PublicKeyCredentialControllerUtility.JSON_KEY_ID, c66617UPe.A0L);
        String str = c66617UPe.A0P;
        if (str != null) {
            anonymousClass182.A0S(PublicKeyCredentialControllerUtility.JSON_KEY_NAME, str);
        }
        String str2 = c66617UPe.A0M;
        if (str2 != null) {
            anonymousClass182.A0S("image_url", str2);
        }
        anonymousClass182.A0P("image_width_ratio", c66617UPe.A02);
        anonymousClass182.A0P("image_width", c66617UPe.A01);
        anonymousClass182.A0P("image_height", c66617UPe.A00);
        anonymousClass182.A0P(AbstractC58317Pt9.A00(380), c66617UPe.A06);
        AbstractC37301Gc2.A1E(anonymousClass182, c66617UPe.A0W);
        anonymousClass182.A0Q("font_size", c66617UPe.A07);
        anonymousClass182.A0P("text_x", c66617UPe.A04);
        anonymousClass182.A0P("text_y", c66617UPe.A05);
        String str3 = c66617UPe.A0a;
        if (str3 != null) {
            anonymousClass182.A0S(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, str3);
        }
        anonymousClass182.A0S("text_color", c66617UPe.A0Y);
        anonymousClass182.A0S(AbstractC111324zv.A00(3225), c66617UPe.A0X);
        anonymousClass182.A0P(AbstractC111324zv.A00(3224), c66617UPe.A03);
        C66613UPa c66613UPa = c66617UPe.A0D;
        if (c66613UPa != null) {
            anonymousClass182.A0r("location");
            VXE.A00(anonymousClass182, c66613UPa);
        }
        UPW upw = c66617UPe.A0C;
        if (upw != null) {
            anonymousClass182.A0r("hashtag");
            anonymousClass182.A0d();
            Boolean bool = upw.A00;
            if (bool != null) {
                anonymousClass182.A0T("allow_following", bool.booleanValue());
            }
            Boolean bool2 = upw.A01;
            if (bool2 != null) {
                anonymousClass182.A0T("allow_muting_story", bool2.booleanValue());
            }
            Integer num = upw.A07;
            if (num != null) {
                anonymousClass182.A0Q("follow_status", num.intValue());
            }
            Integer num2 = upw.A08;
            if (num2 != null) {
                anonymousClass182.A0Q("following", num2.intValue());
            }
            String str4 = upw.A0A;
            if (str4 != null) {
                anonymousClass182.A0S("formatted_media_count", str4);
            }
            Boolean bool3 = upw.A02;
            if (bool3 != null) {
                anonymousClass182.A0T("hide_use_hashtag_button", bool3.booleanValue());
            }
            String str5 = upw.A0B;
            if (str5 != null) {
                anonymousClass182.A0S(PublicKeyCredentialControllerUtility.JSON_KEY_ID, str5);
            }
            Boolean bool4 = upw.A03;
            if (bool4 != null) {
                anonymousClass182.A0T("is_eligible_for_survey", bool4.booleanValue());
            }
            Boolean bool5 = upw.A04;
            if (bool5 != null) {
                anonymousClass182.A0T("is_local", bool5.booleanValue());
            }
            Integer num3 = upw.A09;
            if (num3 != null) {
                anonymousClass182.A0Q("media_count", num3.intValue());
            }
            String str6 = upw.A0C;
            if (str6 != null) {
                anonymousClass182.A0S(PublicKeyCredentialControllerUtility.JSON_KEY_NAME, str6);
            }
            Boolean bool6 = upw.A05;
            if (bool6 != null) {
                anonymousClass182.A0T("non_violating", bool6.booleanValue());
            }
            String str7 = upw.A0D;
            if (str7 != null) {
                anonymousClass182.A0S("profile_pic_url", str7);
            }
            String str8 = upw.A0E;
            if (str8 != null) {
                anonymousClass182.A0S("search_result_subtitle", str8);
            }
            String str9 = upw.A0F;
            if (str9 != null) {
                anonymousClass182.A0S("search_subtitle", str9);
            }
            Boolean bool7 = upw.A06;
            if (bool7 != null) {
                anonymousClass182.A0T("use_default_avatar", bool7.booleanValue());
            }
            anonymousClass182.A0a();
        }
        String str10 = c66617UPe.A0H;
        if (str10 != null) {
            anonymousClass182.A0S("attribution", str10);
        }
        String str11 = c66617UPe.A0S;
        if (str11 != null) {
            anonymousClass182.A0S("question", str11);
        }
        List list = c66617UPe.A0c;
        if (list != null) {
            Iterator A0q = AbstractC37301Gc2.A0q(anonymousClass182, "question_types", list);
            while (A0q.hasNext()) {
                EnumC68152VDw enumC68152VDw = (EnumC68152VDw) A0q.next();
                C14360o3.A0B(enumC68152VDw, 0);
                anonymousClass182.A0u(enumC68152VDw.A00);
            }
            anonymousClass182.A0Z();
        }
        List list2 = c66617UPe.A0d;
        if (list2 != null) {
            Iterator A0q2 = AbstractC37301Gc2.A0q(anonymousClass182, "response_types", list2);
            while (A0q2.hasNext()) {
                EnumC68151VDv enumC68151VDv = (EnumC68151VDv) A0q2.next();
                C14360o3.A0B(enumC68151VDv, 0);
                anonymousClass182.A0u(enumC68151VDv.A00);
            }
            anonymousClass182.A0Z();
        }
        String str12 = c66617UPe.A0I;
        if (str12 != null) {
            anonymousClass182.A0S("emoji", str12);
        }
        Boolean bool8 = c66617UPe.A0F;
        if (bool8 != null) {
            anonymousClass182.A0T("has_countdowns", bool8.booleanValue());
        }
        anonymousClass182.A0Q("num_active_collabs", c66617UPe.A09);
        String str13 = c66617UPe.A0N;
        if (str13 != null) {
            anonymousClass182.A0S(AbstractC111324zv.A00(2677), str13);
        }
        C66617UPe c66617UPe2 = c66617UPe.A0E;
        if (c66617UPe2 != null) {
            anonymousClass182.A0r(AbstractC111324zv.A00(2451));
            A00(anonymousClass182, c66617UPe2);
        }
        anonymousClass182.A0S("prompt", c66617UPe.A0R);
        anonymousClass182.A0S("hint", c66617UPe.A0K);
        List list3 = c66617UPe.A0b;
        if (list3 != null) {
            Iterator A0q3 = AbstractC37301Gc2.A0q(anonymousClass182, "keywords", list3);
            while (A0q3.hasNext()) {
                anonymousClass182.A0u((String) A0q3.next());
            }
            anonymousClass182.A0Z();
        }
        anonymousClass182.A0S(AbstractC43591JPw.A00(209), c66617UPe.A0T);
        anonymousClass182.A0S(AbstractC111324zv.A00(270), c66617UPe.A0U);
        String str14 = c66617UPe.A0J;
        if (str14 != null) {
            anonymousClass182.A0S(AbstractC111324zv.A00(404), str14);
        }
        String str15 = c66617UPe.A0Q;
        if (str15 != null) {
            anonymousClass182.A0S("profile_pic_url", str15);
        }
        String str16 = c66617UPe.A0O;
        if (str16 != null) {
            anonymousClass182.A0S("media_insights_id", str16);
        }
        anonymousClass182.A0Q("num_supporters", c66617UPe.A0A);
        AbstractC37301Gc2.A1F(anonymousClass182, c66617UPe.A0Z);
        anonymousClass182.A0R("creation_date", c66617UPe.A0B);
        String str17 = c66617UPe.A0V;
        if (str17 != null) {
            anonymousClass182.A0S("surface", str17);
        }
        String str18 = c66617UPe.A0G;
        if (str18 != null) {
            anonymousClass182.A0S("accessibility_label", str18);
        }
        anonymousClass182.A0Q("fps", c66617UPe.A08);
        anonymousClass182.A0a();
    }
}
