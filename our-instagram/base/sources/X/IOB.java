package X;

import com.instagram.api.schemas.GatingResponseType;
import com.instagram.debug.devoptions.sandboxselector.DevServerEntity;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes7.dex */
public abstract class IOB {
    public static C109934xN parseFromJson(C16L c16l) {
        String A1P;
        C14360o3.A0B(c16l, 0);
        try {
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            ArrayList arrayList = null;
            String str = null;
            String str2 = null;
            String str3 = null;
            ArrayList arrayList2 = null;
            String str4 = null;
            String str5 = null;
            String str6 = null;
            GatingResponseType gatingResponseType = null;
            Long l = null;
            Integer num = null;
            String str7 = null;
            String str8 = null;
            String str9 = null;
            Boolean bool = null;
            String str10 = null;
            String str11 = null;
            String str12 = null;
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("alert_buttons".equals(A0s)) {
                    if (c16l.A11() == C16R.A0C) {
                        arrayList = AbstractC166987dD.A1E();
                        while (c16l.A1J() != C16R.A08) {
                            AbstractC167027dH.A0w(c16l, arrayList);
                        }
                    } else {
                        arrayList = null;
                    }
                } else if ("alert_description".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str = null;
                    } else {
                        str = c16l.A1P();
                    }
                } else if ("alert_title".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str2 = null;
                    } else {
                        str2 = c16l.A1P();
                    }
                } else if (AbstractC58317Pt9.A00(19).equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str3 = null;
                    } else {
                        str3 = c16l.A1P();
                    }
                } else if ("buttons".equals(A0s)) {
                    if (c16l.A11() == C16R.A0C) {
                        arrayList2 = AbstractC166987dD.A1E();
                        while (c16l.A1J() != C16R.A08) {
                            AbstractC167027dH.A0w(c16l, arrayList2);
                        }
                    } else {
                        arrayList2 = null;
                    }
                } else if ("center_button".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str4 = null;
                    } else {
                        str4 = c16l.A1P();
                    }
                } else if ("date_gated_formatted".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str5 = null;
                    } else {
                        str5 = c16l.A1P();
                    }
                } else if (AbstractC37300Gc1.A1Q(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str6 = null;
                    } else {
                        str6 = c16l.A1P();
                    }
                } else if ("gating_type".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        A1P = null;
                    } else {
                        A1P = c16l.A1P();
                    }
                    gatingResponseType = (GatingResponseType) GatingResponseType.A01.get(A1P);
                    if (gatingResponseType == null) {
                        gatingResponseType = GatingResponseType.A07;
                    }
                } else if ("media_igid".equals(A0s)) {
                    l = AbstractC31173DnH.A0h(c16l);
                } else if ("misinformation_type".equals(A0s)) {
                    num = AbstractC166997dE.A0h(c16l);
                } else if ("over_text".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str7 = null;
                    } else {
                        str7 = c16l.A1P();
                    }
                } else if ("post_reveal_cta".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str8 = null;
                    } else {
                        str8 = c16l.A1P();
                    }
                } else if (AbstractC37310GcC.A01(0, 10, 123).equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str9 = null;
                    } else {
                        str9 = c16l.A1P();
                    }
                } else if ("show_notice".equals(A0s)) {
                    bool = AbstractC166997dE.A0d(c16l);
                } else if ("time_gated".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str10 = null;
                    } else {
                        str10 = c16l.A1P();
                    }
                } else if (AbstractC31171DnF.A1a(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str11 = null;
                    } else {
                        str11 = c16l.A1P();
                    }
                } else if ("under_text".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str12 = null;
                    } else {
                        str12 = c16l.A1P();
                    }
                }
                c16l.A0z();
            }
            return new C109934xN(gatingResponseType, bool, num, l, str, str2, str3, str4, str5, str6, str7, str8, str9, str10, str11, str12, arrayList, arrayList2);
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }

    public static void A00(AnonymousClass182 anonymousClass182, C109934xN c109934xN) {
        anonymousClass182.A0d();
        List list = c109934xN.A0G;
        if (list != null) {
            Iterator A0q = AbstractC37301Gc2.A0q(anonymousClass182, "alert_buttons", list);
            while (A0q.hasNext()) {
                AbstractC167017dG.A1F(anonymousClass182, A0q);
            }
            anonymousClass182.A0Z();
        }
        String str = c109934xN.A04;
        if (str != null) {
            anonymousClass182.A0S("alert_description", str);
        }
        String str2 = c109934xN.A05;
        if (str2 != null) {
            anonymousClass182.A0S("alert_title", str2);
        }
        String str3 = c109934xN.A06;
        if (str3 != null) {
            anonymousClass182.A0S(AbstractC58317Pt9.A00(19), str3);
        }
        List list2 = c109934xN.A0H;
        if (list2 != null) {
            Iterator A0q2 = AbstractC37301Gc2.A0q(anonymousClass182, "buttons", list2);
            while (A0q2.hasNext()) {
                AbstractC167017dG.A1F(anonymousClass182, A0q2);
            }
            anonymousClass182.A0Z();
        }
        String str4 = c109934xN.A07;
        if (str4 != null) {
            anonymousClass182.A0S("center_button", str4);
        }
        String str5 = c109934xN.A08;
        if (str5 != null) {
            anonymousClass182.A0S("date_gated_formatted", str5);
        }
        String str6 = c109934xN.A09;
        if (str6 != null) {
            anonymousClass182.A0S(DevServerEntity.COLUMN_DESCRIPTION, str6);
        }
        GatingResponseType gatingResponseType = c109934xN.A00;
        if (gatingResponseType != null) {
            anonymousClass182.A0S("gating_type", gatingResponseType.A00);
        }
        Long l = c109934xN.A03;
        if (l != null) {
            anonymousClass182.A0R("media_igid", l.longValue());
        }
        Integer num = c109934xN.A02;
        if (num != null) {
            anonymousClass182.A0Q("misinformation_type", num.intValue());
        }
        String str7 = c109934xN.A0A;
        if (str7 != null) {
            anonymousClass182.A0S("over_text", str7);
        }
        String str8 = c109934xN.A0B;
        if (str8 != null) {
            anonymousClass182.A0S("post_reveal_cta", str8);
        }
        String str9 = c109934xN.A0C;
        if (str9 != null) {
            anonymousClass182.A0S(AbstractC37310GcC.A01(0, 10, 123), str9);
        }
        Boolean bool = c109934xN.A01;
        if (bool != null) {
            anonymousClass182.A0T("show_notice", bool.booleanValue());
        }
        String str10 = c109934xN.A0D;
        if (str10 != null) {
            anonymousClass182.A0S("time_gated", str10);
        }
        AbstractC37301Gc2.A1F(anonymousClass182, c109934xN.A0E);
        String str11 = c109934xN.A0F;
        if (str11 != null) {
            anonymousClass182.A0S("under_text", str11);
        }
        anonymousClass182.A0a();
    }
}
