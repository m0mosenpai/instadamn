package X;

import com.instagram.model.shopping.clips.ClipsShoppingCTABar;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes7.dex */
public abstract class IRA {
    public static ClipsShoppingCTABar parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            Float f = null;
            String str = null;
            String str2 = null;
            String str3 = null;
            Integer num = null;
            ArrayList arrayList = null;
            String str4 = null;
            String str5 = null;
            String str6 = null;
            String str7 = null;
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("animation_time_sec".equals(A0s)) {
                    f = AbstractC167007dF.A0a(c16l);
                } else if ("cta_bar_type".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str = null;
                    } else {
                        str = c16l.A1P();
                    }
                } else if ("destination".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str2 = null;
                    } else {
                        str2 = c16l.A1P();
                    }
                } else if ("dominant_color".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str3 = null;
                    } else {
                        str3 = c16l.A1P();
                    }
                } else if ("dwell_time_sec".equals(A0s)) {
                    num = AbstractC166997dE.A0h(c16l);
                } else if ("product_names".equals(A0s)) {
                    if (c16l.A11() == C16R.A0C) {
                        arrayList = AbstractC166987dD.A1E();
                        while (c16l.A1J() != C16R.A08) {
                            AbstractC167027dH.A0w(c16l, arrayList);
                        }
                    } else {
                        arrayList = null;
                    }
                } else if (AbstractC37300Gc1.A1L(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str4 = null;
                    } else {
                        str4 = c16l.A1P();
                    }
                } else if (AbstractC31171DnF.A1a(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str5 = null;
                    } else {
                        str5 = c16l.A1P();
                    }
                } else if ("toggled_destination".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str6 = null;
                    } else {
                        str6 = c16l.A1P();
                    }
                } else if ("toggled_title".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str7 = null;
                    } else {
                        str7 = c16l.A1P();
                    }
                }
                c16l.A0z();
            }
            return new ClipsShoppingCTABar(f, num, str, str2, str3, str4, str5, str6, str7, arrayList);
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }

    public static void A00(AnonymousClass182 anonymousClass182, ClipsShoppingCTABar clipsShoppingCTABar) {
        anonymousClass182.A0d();
        Float f = clipsShoppingCTABar.A00;
        if (f != null) {
            anonymousClass182.A0P("animation_time_sec", f.floatValue());
        }
        String str = clipsShoppingCTABar.A02;
        if (str != null) {
            anonymousClass182.A0S("cta_bar_type", str);
        }
        String str2 = clipsShoppingCTABar.A03;
        if (str2 != null) {
            anonymousClass182.A0S("destination", str2);
        }
        String str3 = clipsShoppingCTABar.A04;
        if (str3 != null) {
            anonymousClass182.A0S("dominant_color", str3);
        }
        Integer num = clipsShoppingCTABar.A01;
        if (num != null) {
            anonymousClass182.A0Q("dwell_time_sec", num.intValue());
        }
        List list = clipsShoppingCTABar.A09;
        if (list != null) {
            Iterator A0q = AbstractC37301Gc2.A0q(anonymousClass182, "product_names", list);
            while (A0q.hasNext()) {
                AbstractC167017dG.A1F(anonymousClass182, A0q);
            }
            anonymousClass182.A0Z();
        }
        String str4 = clipsShoppingCTABar.A05;
        if (str4 != null) {
            anonymousClass182.A0S("subtitle", str4);
        }
        AbstractC37301Gc2.A1F(anonymousClass182, clipsShoppingCTABar.A06);
        String str5 = clipsShoppingCTABar.A07;
        if (str5 != null) {
            anonymousClass182.A0S("toggled_destination", str5);
        }
        String str6 = clipsShoppingCTABar.A08;
        if (str6 != null) {
            anonymousClass182.A0S("toggled_title", str6);
        }
        anonymousClass182.A0a();
    }
}
