package X;

import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;

/* loaded from: classes7.dex */
public abstract class ITD {
    /* JADX WARN: Type inference failed for: r0v48, types: [java.lang.Object, X.46k] */
    public static C41743IeH parseFromJson(C16L c16l) {
        C114665Fw c114665Fw;
        C14360o3.A0B(c16l, 0);
        try {
            C41743IeH c41743IeH = new C41743IeH();
            C16R A11 = c16l.A11();
            C16R c16r = C16R.A0D;
            if (A11 != c16r) {
                c16l.A0z();
                return null;
            }
            while (true) {
                C16R A1J = c16l.A1J();
                C16R c16r2 = C16R.A09;
                if (A1J == c16r2) {
                    break;
                }
                String A0s = AbstractC166997dE.A0s(c16l);
                HashMap hashMap = null;
                if ("bloks_app".equals(A0s)) {
                    c41743IeH.A06 = AbstractC167017dG.A0m(c16l);
                } else if ("show_tooltip_count".equals(A0s)) {
                    c41743IeH.A00 = c16l.A1D();
                } else if (AbstractC31171DnF.A1Y(A0s)) {
                    c41743IeH.A09 = AbstractC167017dG.A0m(c16l);
                } else if ("bloks_data".equals(A0s)) {
                    if (C11T.A08()) {
                        C0w9.A01(EnumC12410kj.A0A, "BloksRenderResponse", "BloksRenderResponse is being parsed on the UI thread, move this to a background thread");
                    }
                    C45127Jxw parseFromJson = AbstractC40568Hyo.parseFromJson(c16l);
                    C58590PyH c58590PyH = (C58590PyH) parseFromJson.A00;
                    String str = parseFromJson.A01;
                    ?? obj = new Object();
                    obj.A00 = c58590PyH;
                    obj.A01 = str;
                    c41743IeH.A03 = obj;
                } else if ("bloks_parameters".equals(A0s)) {
                    if (c16l.A11() == c16r) {
                        hashMap = AbstractC166987dD.A1G();
                        while (c16l.A1J() != c16r2) {
                            AbstractC31179DnN.A1F(c16l, hashMap);
                        }
                    }
                    C14360o3.A0B(hashMap, 0);
                    c41743IeH.A0A = hashMap;
                } else if ("bloks_sticker_type".equals(A0s)) {
                    c41743IeH.A07 = AbstractC167017dG.A0m(c16l);
                } else if ("nux_tooltip_text".equals(A0s)) {
                    c41743IeH.A08 = AbstractC167017dG.A0m(c16l);
                } else if ("action_tooltip_text".equals(A0s)) {
                    c41743IeH.A05 = AbstractC167017dG.A0m(c16l);
                } else if ("ring_spec".equals(A0s)) {
                    c41743IeH.A01 = AbstractC41276IOr.parseFromJson(c16l);
                } else if ("ring_glyph".equals(A0s)) {
                    c41743IeH.A04 = AbstractC41346IRr.parseFromJson(c16l);
                } else if ("sticker_specific_sharing_info".equals(A0s)) {
                    if (c16l.A11() == c16r) {
                        hashMap = AbstractC166987dD.A1G();
                        while (c16l.A1J() != c16r2) {
                            AbstractC31179DnN.A1F(c16l, hashMap);
                        }
                    }
                    C14360o3.A0B(hashMap, 0);
                    c41743IeH.A0B = hashMap;
                } else if ("sticker_specific_sharing_json_objects".equals(A0s)) {
                    if (c16l.A11() == c16r) {
                        hashMap = AbstractC166987dD.A1G();
                        while (c16l.A1J() != c16r2) {
                            AbstractC31179DnN.A1F(c16l, hashMap);
                        }
                    }
                    C14360o3.A0B(hashMap, 0);
                    c41743IeH.A0C = hashMap;
                } else if ("should_preload".equals(A0s)) {
                    c41743IeH.A0D = c16l.A0d();
                }
                c16l.A0z();
            }
            C914346k c914346k = c41743IeH.A03;
            if (c914346k != null) {
                c114665Fw = AbstractC40567Hyn.A00(c914346k);
            } else {
                c114665Fw = null;
            }
            c41743IeH.A02 = c114665Fw;
            return c41743IeH;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }

    public static void A00(AnonymousClass182 anonymousClass182, C41743IeH c41743IeH) {
        anonymousClass182.A0d();
        String str = c41743IeH.A06;
        if (str != null) {
            anonymousClass182.A0S("bloks_app", str);
        }
        anonymousClass182.A0Q("show_tooltip_count", c41743IeH.A00);
        AbstractC37301Gc2.A1D(anonymousClass182, c41743IeH.A09);
        if (c41743IeH.A03 != null) {
            anonymousClass182.A0r("bloks_data");
            IQ3.A00(anonymousClass182, c41743IeH.A03);
        }
        if (c41743IeH.A0A != null) {
            anonymousClass182.A0r("bloks_parameters");
            anonymousClass182.A0d();
            Iterator A14 = AbstractC166997dE.A14(c41743IeH.A0A);
            while (A14.hasNext()) {
                AbstractC37303Gc4.A14(anonymousClass182, A14);
            }
            anonymousClass182.A0a();
        }
        String str2 = c41743IeH.A07;
        if (str2 != null) {
            anonymousClass182.A0S("bloks_sticker_type", str2);
        }
        String str3 = c41743IeH.A08;
        if (str3 != null) {
            anonymousClass182.A0S("nux_tooltip_text", str3);
        }
        String str4 = c41743IeH.A05;
        if (str4 != null) {
            anonymousClass182.A0S("action_tooltip_text", str4);
        }
        if (c41743IeH.A01 != null) {
            anonymousClass182.A0r("ring_spec");
            AbstractC41276IOr.A00(anonymousClass182, c41743IeH.A01);
        }
        if (c41743IeH.A04 != null) {
            anonymousClass182.A0r("ring_glyph");
            AbstractC41346IRr.A00(anonymousClass182, c41743IeH.A04, true);
        }
        if (c41743IeH.A0B != null) {
            anonymousClass182.A0r("sticker_specific_sharing_info");
            anonymousClass182.A0d();
            Iterator A142 = AbstractC166997dE.A14(c41743IeH.A0B);
            while (A142.hasNext()) {
                AbstractC37303Gc4.A14(anonymousClass182, A142);
            }
            anonymousClass182.A0a();
        }
        if (c41743IeH.A0C != null) {
            anonymousClass182.A0r("sticker_specific_sharing_json_objects");
            anonymousClass182.A0d();
            Iterator A143 = AbstractC166997dE.A14(c41743IeH.A0C);
            while (A143.hasNext()) {
                AbstractC37303Gc4.A14(anonymousClass182, A143);
            }
            anonymousClass182.A0a();
        }
        anonymousClass182.A0T("should_preload", c41743IeH.A0D);
        anonymousClass182.A0a();
    }
}
