package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import java.io.IOException;
import java.util.ArrayList;

/* renamed from: X.HvN, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC40375HvN {
    public static H6X parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            Boolean bool = null;
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            Integer num = null;
            Boolean bool2 = null;
            String str = null;
            String str2 = null;
            String str3 = null;
            String str4 = null;
            Integer num2 = null;
            Integer num3 = null;
            String str5 = null;
            H3O h3o = null;
            String str6 = null;
            Integer num4 = null;
            String str7 = null;
            Integer num5 = null;
            String str8 = null;
            H6Y h6y = null;
            ArrayList arrayList = null;
            String str9 = null;
            ArrayList arrayList2 = null;
            String str10 = null;
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("allow_following".equals(A0s)) {
                    num = AbstractC166997dE.A0h(c16l);
                } else if ("allow_muting_story".equals(A0s)) {
                    bool2 = AbstractC166997dE.A0d(c16l);
                } else if ("challenge_id".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str = null;
                    } else {
                        str = c16l.A1P();
                    }
                } else if ("debug_info".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str2 = null;
                    } else {
                        str2 = c16l.A1P();
                    }
                } else if (AbstractC37300Gc1.A1Q(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str3 = null;
                    } else {
                        str3 = c16l.A1P();
                    }
                } else if ("follow_button_text".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str4 = null;
                    } else {
                        str4 = c16l.A1P();
                    }
                } else if ("follow_status".equals(A0s)) {
                    num2 = AbstractC166997dE.A0h(c16l);
                } else if ("following".equals(A0s)) {
                    num3 = AbstractC166997dE.A0h(c16l);
                } else if ("formatted_media_count".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str5 = null;
                    } else {
                        str5 = c16l.A1P();
                    }
                } else if ("fresh_topic_metadata".equals(A0s)) {
                    h3o = AbstractC39931HnM.parseFromJson(c16l);
                } else if (PublicKeyCredentialControllerUtility.JSON_KEY_ID.equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str6 = null;
                    } else {
                        str6 = c16l.A1P();
                    }
                } else if ("media_count".equals(A0s)) {
                    num4 = AbstractC166997dE.A0h(c16l);
                } else if (PublicKeyCredentialControllerUtility.JSON_KEY_NAME.equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str7 = null;
                    } else {
                        str7 = c16l.A1P();
                    }
                } else if ("non_violating".equals(A0s)) {
                    num5 = AbstractC166997dE.A0h(c16l);
                } else if ("profile_pic_url".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str8 = null;
                    } else {
                        str8 = c16l.A1P();
                    }
                } else if ("promo_banner".equals(A0s)) {
                    h6y = AbstractC40376HvO.parseFromJson(c16l);
                } else if (AbstractC111324zv.A00(3003).equals(A0s)) {
                    if (c16l.A11() == C16R.A0C) {
                        arrayList = AbstractC166987dD.A1E();
                        while (c16l.A1J() != C16R.A08) {
                            AbstractC167027dH.A0w(c16l, arrayList);
                        }
                    } else {
                        arrayList = null;
                    }
                } else if ("show_follow_drop_down".equals(A0s)) {
                    bool = AbstractC166997dE.A0d(c16l);
                } else if ("social_context".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str9 = null;
                    } else {
                        str9 = c16l.A1P();
                    }
                } else if ("social_context_profile_links".equals(A0s)) {
                    if (c16l.A11() == C16R.A0C) {
                        arrayList2 = AbstractC166987dD.A1E();
                        while (c16l.A1J() != C16R.A08) {
                            C82263ln parseFromJson = AbstractC82233lk.parseFromJson(c16l);
                            if (parseFromJson != null) {
                                arrayList2.add(parseFromJson);
                            }
                        }
                    } else {
                        arrayList2 = null;
                    }
                } else if (AbstractC37300Gc1.A1L(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str10 = null;
                    } else {
                        str10 = c16l.A1P();
                    }
                }
                c16l.A0z();
            }
            if (str6 == null && (c16l instanceof C07950bF)) {
                AbstractC166997dE.A1V(PublicKeyCredentialControllerUtility.JSON_KEY_ID, c16l, "TagInfo");
            } else if (str7 != null || !(c16l instanceof C07950bF)) {
                if (bool == null && (c16l instanceof C07950bF)) {
                    AbstractC166997dE.A1V("show_follow_drop_down", c16l, "TagInfo");
                } else {
                    return new H6X(h3o, h6y, bool2, num, num2, num3, num4, num5, str, str2, str3, str4, str5, str6, str7, str8, str9, str10, arrayList, arrayList2, bool.booleanValue());
                }
            } else {
                AbstractC166997dE.A1V(PublicKeyCredentialControllerUtility.JSON_KEY_NAME, c16l, "TagInfo");
            }
            throw C00O.createAndThrow();
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
