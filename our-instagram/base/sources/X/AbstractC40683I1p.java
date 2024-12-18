package X;

import java.io.IOException;
import java.util.ArrayList;

/* renamed from: X.I1p, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC40683I1p {
    public static C51650Mrh parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            String str = null;
            ArrayList arrayList = null;
            String str2 = null;
            String str3 = null;
            String str4 = null;
            String str5 = null;
            Boolean bool = null;
            MWT mwt = null;
            H7V h7v = null;
            String str6 = null;
            H7T h7t = null;
            String str7 = null;
            String str8 = null;
            H7U h7u = null;
            String str9 = null;
            String str10 = null;
            String str11 = null;
            String str12 = null;
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("country_code".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str = null;
                    } else {
                        str = c16l.A1P();
                    }
                } else if ("error_codes".equals(A0s)) {
                    if (c16l.A11() == C16R.A0C) {
                        arrayList = AbstractC166987dD.A1E();
                        while (c16l.A1J() != C16R.A08) {
                            UQE parseFromJson = AbstractC40681I1n.parseFromJson(c16l);
                            if (parseFromJson != null) {
                                arrayList.add(parseFromJson);
                            }
                        }
                    } else {
                        arrayList = null;
                    }
                } else if ("follow_up_action_url".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str2 = null;
                    } else {
                        str2 = c16l.A1P();
                    }
                } else if (AbstractC31171DnF.A1Y(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str3 = null;
                    } else {
                        str3 = c16l.A1P();
                    }
                } else if (AbstractC111324zv.A00(121).equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str4 = null;
                    } else {
                        str4 = c16l.A1P();
                    }
                } else if ("instagram_data_policy_url".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str5 = null;
                    } else {
                        str5 = c16l.A1P();
                    }
                } else if ("is_organic_generic_form".equals(A0s)) {
                    bool = AbstractC166997dE.A0d(c16l);
                } else if ("lead_gen_data".equals(A0s)) {
                    mwt = AbstractC40682I1o.parseFromJson(c16l);
                } else if ("lead_gen_deep_link_user_status".equals(A0s)) {
                    h7v = AbstractC40687I1t.parseFromJson(c16l);
                } else if ("next_button_text".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str6 = null;
                    } else {
                        str6 = c16l.A1P();
                    }
                } else if ("page".equals(A0s)) {
                    h7t = AbstractC40684I1q.parseFromJson(c16l);
                } else if ("primary_button_text".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str7 = null;
                    } else {
                        str7 = c16l.A1P();
                    }
                } else if (AbstractC111324zv.A00(257).equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str8 = null;
                    } else {
                        str8 = c16l.A1P();
                    }
                } else if ("quality_ad_unit".equals(A0s)) {
                    h7u = AbstractC40685I1r.parseFromJson(c16l);
                } else if ("secure_sharing_text_instagram".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str9 = null;
                    } else {
                        str9 = c16l.A1P();
                    }
                } else if ("select_text_hint".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str10 = null;
                    } else {
                        str10 = c16l.A1P();
                    }
                } else if ("send_description".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str11 = null;
                    } else {
                        str11 = c16l.A1P();
                    }
                } else if ("short_secure_sharing_text_instagram".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str12 = null;
                    } else {
                        str12 = c16l.A1P();
                    }
                }
                c16l.A0z();
            }
            return new C51650Mrh(mwt, h7t, h7u, h7v, bool, str, str2, str3, str4, str5, str6, str7, str8, str9, str10, str11, str12, arrayList);
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
