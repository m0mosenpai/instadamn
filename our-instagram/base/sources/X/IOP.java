package X;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes7.dex */
public abstract class IOP {
    public static H41 parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            String str = null;
            String str2 = null;
            String str3 = null;
            String str4 = null;
            String str5 = null;
            String str6 = null;
            ArrayList arrayList = null;
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("background_color".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str = null;
                    } else {
                        str = c16l.A1P();
                    }
                } else if ("emphasis_style".equals(A0s)) {
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
                } else if (AbstractC111324zv.A00(248).equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str4 = null;
                    } else {
                        str4 = c16l.A1P();
                    }
                } else if ("sticker_style".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str5 = null;
                    } else {
                        str5 = c16l.A1P();
                    }
                } else if ("text_color".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str6 = null;
                    } else {
                        str6 = c16l.A1P();
                    }
                } else if (AbstractC111324zv.A00(275).equals(A0s)) {
                    if (c16l.A11() == C16R.A0C) {
                        arrayList = AbstractC166987dD.A1E();
                        while (c16l.A1J() != C16R.A08) {
                            H43 parseFromJson = AbstractC40040HpS.parseFromJson(c16l);
                            if (parseFromJson != null) {
                                arrayList.add(parseFromJson);
                            }
                        }
                    } else {
                        arrayList = null;
                    }
                }
                c16l.A0z();
            }
            return new H41(str, str2, str3, str4, str5, str6, arrayList);
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }

    public static void A00(AnonymousClass182 anonymousClass182, H41 h41) {
        anonymousClass182.A0d();
        String str = h41.A00;
        if (str != null) {
            anonymousClass182.A0S("background_color", str);
        }
        String str2 = h41.A01;
        if (str2 != null) {
            anonymousClass182.A0S("emphasis_style", str2);
        }
        AbstractC37301Gc2.A1D(anonymousClass182, h41.A02);
        String str3 = h41.A03;
        if (str3 != null) {
            anonymousClass182.A0S(AbstractC111324zv.A00(248), str3);
        }
        String str4 = h41.A04;
        if (str4 != null) {
            anonymousClass182.A0S("sticker_style", str4);
        }
        String str5 = h41.A05;
        if (str5 != null) {
            anonymousClass182.A0S("text_color", str5);
        }
        List list = h41.A06;
        if (list != null) {
            Iterator A0q = AbstractC37301Gc2.A0q(anonymousClass182, AbstractC111324zv.A00(275), list);
            while (A0q.hasNext()) {
                JKN jkn = (JKN) A0q.next();
                if (jkn != null) {
                    H43 Evq = jkn.Evq();
                    anonymousClass182.A0d();
                    String str6 = Evq.A00;
                    if (str6 != null) {
                        anonymousClass182.A0S("language", str6);
                    }
                    String str7 = Evq.A01;
                    if (str7 != null) {
                        anonymousClass182.A0S("uri", str7);
                    }
                    anonymousClass182.A0a();
                }
            }
            anonymousClass182.A0Z();
        }
        anonymousClass182.A0a();
    }
}
