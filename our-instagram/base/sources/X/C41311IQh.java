package X;

import java.io.IOException;
import java.util.ArrayList;

/* renamed from: X.IQh, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C41311IQh {
    public static C39033HGj parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            C39033HGj c39033HGj = new C39033HGj();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                ArrayList arrayList = null;
                if ("__typename".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        c16l.A0z();
                    }
                    c16l.A1P();
                    c16l.A0z();
                } else if ("country_code".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        c16l.A0z();
                    }
                    c16l.A1P();
                    c16l.A0z();
                } else {
                    if ("error_message_brief".equals(A0s)) {
                        c39033HGj.A06 = AbstractC167017dG.A0m(c16l);
                    } else if ("error_message_detail".equals(A0s)) {
                        c39033HGj.A07 = AbstractC167017dG.A0m(c16l);
                    } else if (AbstractC31171DnF.A1Y(A0s)) {
                        c39033HGj.A09 = AbstractC167017dG.A0m(c16l);
                    } else if (AbstractC111324zv.A00(121).equals(A0s)) {
                        c39033HGj.A0A = AbstractC167017dG.A0m(c16l);
                    } else if ("next_button_text".equals(A0s)) {
                        c39033HGj.A0C = AbstractC167017dG.A0m(c16l);
                    } else if ("primary_button_text".equals(A0s)) {
                        c39033HGj.A0D = AbstractC167017dG.A0m(c16l);
                    } else if (AbstractC111324zv.A00(257).equals(A0s)) {
                        c39033HGj.A0E = AbstractC167017dG.A0m(c16l);
                    } else if ("secure_sharing_text_instagram".equals(A0s)) {
                        c39033HGj.A0F = AbstractC167017dG.A0m(c16l);
                    } else if ("select_text_hint".equals(A0s)) {
                        if (c16l.A11() == C16R.A0G) {
                        }
                        c16l.A1P();
                    } else if ("send_description".equals(A0s)) {
                        c39033HGj.A0G = AbstractC167017dG.A0m(c16l);
                    } else if ("short_secure_sharing_text_instagram".equals(A0s)) {
                        if (c16l.A11() == C16R.A0G) {
                        }
                        c16l.A1P();
                    } else if ("follow_up_action_url".equals(A0s)) {
                        c39033HGj.A08 = AbstractC167017dG.A0m(c16l);
                    } else if ("instagram_data_policy_url".equals(A0s)) {
                        c39033HGj.A0B = AbstractC167017dG.A0m(c16l);
                    } else if ("lead_gen_data".equals(A0s)) {
                        c39033HGj.A00 = AbstractC68526VUf.parseFromJson(c16l);
                    } else if ("multi_submit_info".equals(A0s)) {
                        c39033HGj.A01 = AbstractC40666I0y.parseFromJson(c16l);
                    } else if ("page".equals(A0s)) {
                        c39033HGj.A02 = I10.parseFromJson(c16l);
                    } else if ("quality_ad_unit".equals(A0s)) {
                        c39033HGj.A03 = I11.parseFromJson(c16l);
                    } else if ("trust_signal_payload".equals(A0s)) {
                        c39033HGj.A04 = AbstractC54013NuP.parseFromJson(c16l);
                    } else if ("lead_gen_deep_link_user_status".equals(A0s)) {
                        c39033HGj.A05 = I12.parseFromJson(c16l);
                    } else if ("error_codes".equals(A0s)) {
                        if (c16l.A11() == C16R.A0C) {
                            arrayList = AbstractC166987dD.A1E();
                            while (c16l.A1J() != C16R.A08) {
                                C41010IEf parseFromJson = AbstractC40665I0x.parseFromJson(c16l);
                                if (parseFromJson != null) {
                                    arrayList.add(parseFromJson);
                                }
                            }
                        }
                        c39033HGj.A0H = arrayList;
                    }
                    c16l.A0z();
                }
            }
            return c39033HGj;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
