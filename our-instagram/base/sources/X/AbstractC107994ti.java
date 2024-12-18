package X;

import com.instagram.api.schemas.IGLeadGenSubheaderTrustSignalDataDict;
import com.instagram.api.schemas.IGLeadGenSubheaderTrustSignalDataDictImpl;
import java.io.IOException;
import java.util.List;

/* renamed from: X.4ti, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC107994ti {
    public static C108034tm parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            C108014tk c108014tk = null;
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            C31208Dnr c31208Dnr = null;
            C38719H3h c38719H3h = null;
            IGLeadGenSubheaderTrustSignalDataDictImpl iGLeadGenSubheaderTrustSignalDataDictImpl = null;
            while (c16l.A1J() != C16R.A09) {
                String A0q = c16l.A0q();
                c16l.A1J();
                if ("first_question_data".equals(A0q)) {
                    c108014tk = AbstractC108004tj.parseFromJson(c16l);
                } else if ("lead_gen_incentive_data".equals(A0q)) {
                    c31208Dnr = AbstractC31207Dnq.parseFromJson(c16l);
                } else if ("policy_privacy_data".equals(A0q)) {
                    c38719H3h = AbstractC39983HoO.parseFromJson(c16l);
                } else if ("trust_signal_data".equals(A0q)) {
                    iGLeadGenSubheaderTrustSignalDataDictImpl = HoR.parseFromJson(c16l);
                }
                c16l.A0z();
            }
            return new C108034tm(c31208Dnr, c38719H3h, c108014tk, iGLeadGenSubheaderTrustSignalDataDictImpl);
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }

    public static void A00(AnonymousClass182 anonymousClass182, C108034tm c108034tm) {
        anonymousClass182.A0d();
        InterfaceC108024tl interfaceC108024tl = c108034tm.A02;
        if (interfaceC108024tl != null) {
            anonymousClass182.A0r("first_question_data");
            C108014tk Eup = interfaceC108024tl.Eup();
            anonymousClass182.A0d();
            List<JLQ> list = Eup.A04;
            if (list != null) {
                C16V.A03(anonymousClass182, "contact_info_questions");
                for (JLQ jlq : list) {
                    if (jlq != null) {
                        C38718H3g Euk = jlq.Euk();
                        anonymousClass182.A0d();
                        String str = Euk.A00;
                        if (str != null) {
                            anonymousClass182.A0S(MSV.A00(444), str);
                        }
                        String str2 = Euk.A01;
                        if (str2 != null) {
                            anonymousClass182.A0S(AbstractC111324zv.A00(939), str2);
                        }
                        String str3 = Euk.A02;
                        if (str3 != null) {
                            anonymousClass182.A0S(AbstractC111324zv.A00(940), str3);
                        }
                        String str4 = Euk.A03;
                        if (str4 != null) {
                            anonymousClass182.A0S("field_type", str4);
                        }
                        anonymousClass182.A0a();
                    }
                }
                anonymousClass182.A0Z();
            }
            String str5 = Eup.A02;
            if (str5 != null) {
                anonymousClass182.A0S("cta_text", str5);
            }
            Boolean bool = Eup.A00;
            if (bool != null) {
                anonymousClass182.A0T("early_form_submission_eligible", bool.booleanValue());
            }
            String str6 = Eup.A03;
            if (str6 != null) {
                anonymousClass182.A0S("label", str6);
            }
            List<String> list2 = Eup.A05;
            if (list2 != null) {
                C16V.A03(anonymousClass182, "options");
                for (String str7 : list2) {
                    if (str7 != null) {
                        anonymousClass182.A0u(str7);
                    }
                }
                anonymousClass182.A0Z();
            }
            Integer num = Eup.A01;
            if (num != null) {
                anonymousClass182.A0Q("question_type", num.intValue());
            }
            anonymousClass182.A0a();
        }
        InterfaceC115285Iz interfaceC115285Iz = c108034tm.A00;
        if (interfaceC115285Iz != null) {
            anonymousClass182.A0r("lead_gen_incentive_data");
            C31208Dnr Eul = interfaceC115285Iz.Eul();
            anonymousClass182.A0d();
            String str8 = Eul.A00;
            if (str8 != null) {
                anonymousClass182.A0S("headline", str8);
            }
            anonymousClass182.A0a();
        }
        C5L5 c5l5 = c108034tm.A01;
        if (c5l5 != null) {
            anonymousClass182.A0r("policy_privacy_data");
            C38719H3h Eun = c5l5.Eun();
            anonymousClass182.A0d();
            String str9 = Eun.A00;
            if (str9 != null) {
                anonymousClass182.A0S(AbstractC111324zv.A00(121), str9);
            }
            String str10 = Eun.A01;
            if (str10 != null) {
                anonymousClass182.A0S(AbstractC111324zv.A00(4684), str10);
            }
            String str11 = Eun.A02;
            if (str11 != null) {
                anonymousClass182.A0S(AbstractC111324zv.A00(2879), str11);
            }
            String str12 = Eun.A03;
            if (str12 != null) {
                anonymousClass182.A0S(AbstractC111324zv.A00(257), str12);
            }
            String str13 = Eun.A04;
            if (str13 != null) {
                anonymousClass182.A0S(AbstractC111324zv.A00(5263), str13);
            }
            anonymousClass182.A0a();
        }
        IGLeadGenSubheaderTrustSignalDataDict iGLeadGenSubheaderTrustSignalDataDict = c108034tm.A03;
        if (iGLeadGenSubheaderTrustSignalDataDict != null) {
            anonymousClass182.A0r("trust_signal_data");
            IGLeadGenSubheaderTrustSignalDataDictImpl Euq = iGLeadGenSubheaderTrustSignalDataDict.Euq();
            anonymousClass182.A0d();
            String str14 = Euq.A00;
            if (str14 != null) {
                anonymousClass182.A0S("trust_signal_text", str14);
            }
            anonymousClass182.A0a();
        }
        anonymousClass182.A0a();
    }
}
