package X;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.ISu, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC41367ISu {
    public static C5Fk parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            ArrayList arrayList = null;
            String str = null;
            Integer num = null;
            String str2 = null;
            Integer num2 = null;
            String str3 = null;
            ArrayList arrayList2 = null;
            Integer num3 = null;
            Integer num4 = null;
            String str4 = null;
            ArrayList arrayList3 = null;
            ArrayList arrayList4 = null;
            String str5 = null;
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("body_list".equals(A0s)) {
                    if (c16l.A11() == C16R.A0C) {
                        arrayList = AbstractC166987dD.A1E();
                        while (c16l.A1J() != C16R.A08) {
                            AbstractC167027dH.A0w(c16l, arrayList);
                        }
                    } else {
                        arrayList = null;
                    }
                } else if (AbstractC111324zv.A00(788).equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str = null;
                    } else {
                        str = c16l.A1P();
                    }
                } else if (AbstractC111324zv.A00(868).equals(A0s)) {
                    num = AbstractC166997dE.A0h(c16l);
                } else if ("format".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str2 = null;
                    } else {
                        str2 = c16l.A1P();
                    }
                } else if ("image_height".equals(A0s)) {
                    num2 = AbstractC166997dE.A0h(c16l);
                } else if ("image_url".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str3 = null;
                    } else {
                        str3 = c16l.A1P();
                    }
                } else if (AbstractC111324zv.A00(1003).equals(A0s)) {
                    if (c16l.A11() == C16R.A0C) {
                        arrayList2 = AbstractC166987dD.A1E();
                        while (c16l.A1J() != C16R.A08) {
                            AbstractC167027dH.A0w(c16l, arrayList2);
                        }
                    } else {
                        arrayList2 = null;
                    }
                } else if ("image_width".equals(A0s)) {
                    num3 = AbstractC166997dE.A0h(c16l);
                } else if (AbstractC111324zv.A00(1113).equals(A0s)) {
                    num4 = AbstractC166997dE.A0h(c16l);
                } else if ("style".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str4 = null;
                    } else {
                        str4 = c16l.A1P();
                    }
                } else if (AbstractC111324zv.A00(1316).equals(A0s)) {
                    if (c16l.A11() == C16R.A0C) {
                        arrayList3 = AbstractC166987dD.A1E();
                        while (c16l.A1J() != C16R.A08) {
                            AbstractC167027dH.A0w(c16l, arrayList3);
                        }
                    } else {
                        arrayList3 = null;
                    }
                } else if ("title_list".equals(A0s)) {
                    if (c16l.A11() == C16R.A0C) {
                        arrayList4 = AbstractC166987dD.A1E();
                        while (c16l.A1J() != C16R.A08) {
                            AbstractC167027dH.A0w(c16l, arrayList4);
                        }
                    } else {
                        arrayList4 = null;
                    }
                } else if ("title_option".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str5 = null;
                    } else {
                        str5 = c16l.A1P();
                    }
                }
                c16l.A0z();
            }
            if (str2 == null && (c16l instanceof C07950bF)) {
                AbstractC166997dE.A1V("format", c16l, "ClipsAdMidSceneInfo");
                throw C00O.createAndThrow();
            }
            return new C5Fk(num, num2, num3, num4, str, str2, str3, str4, str5, arrayList, arrayList2, arrayList3, arrayList4);
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }

    public static void A00(AnonymousClass182 anonymousClass182, C5Fk c5Fk) {
        anonymousClass182.A0d();
        List list = c5Fk.A09;
        if (list != null) {
            Iterator A0q = AbstractC37301Gc2.A0q(anonymousClass182, "body_list", list);
            while (A0q.hasNext()) {
                AbstractC167017dG.A1F(anonymousClass182, A0q);
            }
            anonymousClass182.A0Z();
        }
        String str = c5Fk.A04;
        if (str != null) {
            anonymousClass182.A0S(AbstractC111324zv.A00(788), str);
        }
        Integer num = c5Fk.A00;
        if (num != null) {
            anonymousClass182.A0Q(AbstractC111324zv.A00(868), num.intValue());
        }
        String str2 = c5Fk.A05;
        if (str2 != null) {
            anonymousClass182.A0S("format", str2);
        }
        Integer num2 = c5Fk.A01;
        if (num2 != null) {
            anonymousClass182.A0Q("image_height", num2.intValue());
        }
        String str3 = c5Fk.A06;
        if (str3 != null) {
            anonymousClass182.A0S("image_url", str3);
        }
        List list2 = c5Fk.A0A;
        if (list2 != null) {
            Iterator A0q2 = AbstractC37301Gc2.A0q(anonymousClass182, AbstractC111324zv.A00(1003), list2);
            while (A0q2.hasNext()) {
                AbstractC167017dG.A1F(anonymousClass182, A0q2);
            }
            anonymousClass182.A0Z();
        }
        Integer num3 = c5Fk.A02;
        if (num3 != null) {
            anonymousClass182.A0Q("image_width", num3.intValue());
        }
        Integer num4 = c5Fk.A03;
        if (num4 != null) {
            anonymousClass182.A0Q(AbstractC111324zv.A00(1113), num4.intValue());
        }
        String str4 = c5Fk.A07;
        if (str4 != null) {
            anonymousClass182.A0S("style", str4);
        }
        List list3 = c5Fk.A0B;
        if (list3 != null) {
            Iterator A0q3 = AbstractC37301Gc2.A0q(anonymousClass182, AbstractC111324zv.A00(1316), list3);
            while (A0q3.hasNext()) {
                AbstractC167017dG.A1F(anonymousClass182, A0q3);
            }
            anonymousClass182.A0Z();
        }
        List list4 = c5Fk.A0C;
        if (list4 != null) {
            Iterator A0q4 = AbstractC37301Gc2.A0q(anonymousClass182, "title_list", list4);
            while (A0q4.hasNext()) {
                AbstractC167017dG.A1F(anonymousClass182, A0q4);
            }
            anonymousClass182.A0Z();
        }
        String str5 = c5Fk.A08;
        if (str5 != null) {
            anonymousClass182.A0S("title_option", str5);
        }
        anonymousClass182.A0a();
    }
}
