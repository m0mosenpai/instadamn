package X;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes7.dex */
public abstract class IPM {
    public static H6W parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            Boolean bool = null;
            Boolean bool2 = null;
            H6V h6v = null;
            Boolean bool3 = null;
            String str = null;
            Boolean bool4 = null;
            String str2 = null;
            ArrayList arrayList = null;
            Integer num = null;
            Integer num2 = null;
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("enable_indexing".equals(A0s)) {
                    bool = AbstractC166997dE.A0d(c16l);
                } else if ("enable_navigation".equals(A0s)) {
                    bool2 = AbstractC166997dE.A0d(c16l);
                } else if ("extra_question".equals(A0s)) {
                    h6v = IPL.parseFromJson(c16l);
                } else if ("has_submit".equals(A0s)) {
                    bool3 = AbstractC166997dE.A0d(c16l);
                } else if (AbstractC31171DnF.A1Y(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str = null;
                    } else {
                        str = c16l.A1P();
                    }
                } else if ("log_on_each_answer".equals(A0s)) {
                    bool4 = AbstractC166997dE.A0d(c16l);
                } else if ("module_type".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str2 = null;
                    } else {
                        str2 = c16l.A1P();
                    }
                } else if ("questions".equals(A0s)) {
                    if (c16l.A11() == C16R.A0C) {
                        arrayList = AbstractC166987dD.A1E();
                        while (c16l.A1J() != C16R.A08) {
                            H6V parseFromJson = IPL.parseFromJson(c16l);
                            if (parseFromJson != null) {
                                arrayList.add(parseFromJson);
                            }
                        }
                    } else {
                        arrayList = null;
                    }
                } else if ("unlock_question".equals(A0s)) {
                    num = AbstractC166997dE.A0h(c16l);
                } else {
                    num2 = AbstractC31178DnM.A0V(c16l, num2, A0s, "vertical_padding");
                }
                c16l.A0z();
            }
            return new H6W(h6v, bool, bool2, bool3, bool4, num, num2, str, str2, arrayList);
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }

    public static void A00(AnonymousClass182 anonymousClass182, H6W h6w) {
        anonymousClass182.A0d();
        Boolean bool = h6w.A01;
        if (bool != null) {
            anonymousClass182.A0T("enable_indexing", bool.booleanValue());
        }
        Boolean bool2 = h6w.A02;
        if (bool2 != null) {
            anonymousClass182.A0T("enable_navigation", bool2.booleanValue());
        }
        H6V h6v = h6w.A00;
        if (h6v != null) {
            anonymousClass182.A0r("extra_question");
            IPL.A00(anonymousClass182, h6v);
        }
        Boolean bool3 = h6w.A03;
        if (bool3 != null) {
            anonymousClass182.A0T("has_submit", bool3.booleanValue());
        }
        AbstractC37301Gc2.A1D(anonymousClass182, h6w.A07);
        Boolean bool4 = h6w.A04;
        if (bool4 != null) {
            anonymousClass182.A0T("log_on_each_answer", bool4.booleanValue());
        }
        String str = h6w.A08;
        if (str != null) {
            anonymousClass182.A0S("module_type", str);
        }
        List list = h6w.A09;
        if (list != null) {
            Iterator A0q = AbstractC37301Gc2.A0q(anonymousClass182, "questions", list);
            while (A0q.hasNext()) {
                H6V h6v2 = (H6V) A0q.next();
                if (h6v2 != null) {
                    IPL.A00(anonymousClass182, h6v2);
                }
            }
            anonymousClass182.A0Z();
        }
        Integer num = h6w.A05;
        if (num != null) {
            anonymousClass182.A0Q("unlock_question", num.intValue());
        }
        Integer num2 = h6w.A06;
        if (num2 != null) {
            anonymousClass182.A0Q("vertical_padding", num2.intValue());
        }
        anonymousClass182.A0a();
    }
}
