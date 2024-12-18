package X;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes7.dex */
public abstract class IPQ {
    public static C38798H6n parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            String str = null;
            Float f = null;
            String str2 = null;
            Boolean bool = null;
            Boolean bool2 = null;
            String str3 = null;
            String str4 = null;
            String str5 = null;
            String str6 = null;
            ArrayList arrayList = null;
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("emphasis_style".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str = null;
                    } else {
                        str = c16l.A1P();
                    }
                } else if ("font_size".equals(A0s)) {
                    f = AbstractC167007dF.A0a(c16l);
                } else if (AbstractC31171DnF.A1Y(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str2 = null;
                    } else {
                        str2 = c16l.A1P();
                    }
                } else if ("is_animated".equals(A0s)) {
                    bool = AbstractC166997dE.A0d(c16l);
                } else if ("is_flig_enabled".equals(A0s)) {
                    bool2 = AbstractC166997dE.A0d(c16l);
                } else if (AbstractC37300Gc1.A1D(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str3 = null;
                    } else {
                        str3 = c16l.A1P();
                    }
                } else if ("text_alignment".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str4 = null;
                    } else {
                        str4 = c16l.A1P();
                    }
                } else if ("text_color".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str5 = null;
                    } else {
                        str5 = c16l.A1P();
                    }
                } else if ("text_format".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str6 = null;
                    } else {
                        str6 = c16l.A1P();
                    }
                } else if ("translated_text".equals(A0s)) {
                    if (c16l.A11() == C16R.A0C) {
                        arrayList = AbstractC166987dD.A1E();
                        while (c16l.A1J() != C16R.A08) {
                            C38800H6p parseFromJson = AbstractC40415Hw2.parseFromJson(c16l);
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
            return new C38798H6n(bool, bool2, f, str, str2, str3, str4, str5, str6, arrayList);
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }

    public static void A00(AnonymousClass182 anonymousClass182, C38798H6n c38798H6n) {
        anonymousClass182.A0d();
        String str = c38798H6n.A03;
        if (str != null) {
            anonymousClass182.A0S("emphasis_style", str);
        }
        Float f = c38798H6n.A02;
        if (f != null) {
            anonymousClass182.A0P("font_size", f.floatValue());
        }
        AbstractC37301Gc2.A1D(anonymousClass182, c38798H6n.A04);
        Boolean bool = c38798H6n.A00;
        if (bool != null) {
            anonymousClass182.A0T("is_animated", bool.booleanValue());
        }
        Boolean bool2 = c38798H6n.A01;
        if (bool2 != null) {
            anonymousClass182.A0T("is_flig_enabled", bool2.booleanValue());
        }
        AbstractC37301Gc2.A1E(anonymousClass182, c38798H6n.A05);
        String str2 = c38798H6n.A06;
        if (str2 != null) {
            anonymousClass182.A0S("text_alignment", str2);
        }
        String str3 = c38798H6n.A07;
        if (str3 != null) {
            anonymousClass182.A0S("text_color", str3);
        }
        String str4 = c38798H6n.A08;
        if (str4 != null) {
            anonymousClass182.A0S("text_format", str4);
        }
        List list = c38798H6n.A09;
        if (list != null) {
            Iterator A0q = AbstractC37301Gc2.A0q(anonymousClass182, "translated_text", list);
            while (A0q.hasNext()) {
                InterfaceC43519JKf interfaceC43519JKf = (InterfaceC43519JKf) A0q.next();
                if (interfaceC43519JKf != null) {
                    C38800H6p F3I = interfaceC43519JKf.F3I();
                    anonymousClass182.A0d();
                    String str5 = F3I.A00;
                    if (str5 != null) {
                        anonymousClass182.A0S("language", str5);
                    }
                    String str6 = F3I.A01;
                    if (str6 != null) {
                        anonymousClass182.A0S("translation", str6);
                    }
                    anonymousClass182.A0a();
                }
            }
            anonymousClass182.A0Z();
        }
        anonymousClass182.A0a();
    }
}
