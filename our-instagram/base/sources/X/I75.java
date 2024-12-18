package X;

import java.io.IOException;

/* loaded from: classes7.dex */
public abstract class I75 {
    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, X.IFX] */
    public static IFX parseFromJson(C16L c16l) {
        String A0m;
        String str;
        C14360o3.A0B(c16l, 0);
        try {
            ?? obj = new Object();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("layout_type".equals(A0s)) {
                    I89.A00(AbstractC167017dG.A0m(c16l));
                } else if (AbstractC31171DnF.A1a(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                    }
                    c16l.A1P();
                } else if (AbstractC37300Gc1.A1L(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                    }
                    c16l.A1P();
                } else {
                    if ("subtitle_destination".equals(A0s)) {
                        A0m = AbstractC167017dG.A0m(c16l);
                    } else if ("product_items_feed".equals(A0s)) {
                        obj.A01 = IRD.parseFromJson(c16l);
                    } else if ("is_multi_merchant".equals(A0s)) {
                        c16l.A0d();
                    } else if ("cta_text".equals(A0s)) {
                        if (c16l.A11() == C16R.A0G) {
                        }
                        c16l.A1P();
                    } else if ("cta_destination".equals(A0s)) {
                        A0m = AbstractC167017dG.A0m(c16l);
                    } else if ("ig_funded_incentive".equals(A0s)) {
                        obj.A00 = AbstractC40723I3d.parseFromJson(c16l);
                    }
                    for (Integer num : C05F.A00(4)) {
                        switch (num.intValue()) {
                            case 1:
                                str = "continue_shopping";
                                break;
                            case 2:
                                str = "ig_funded_incentive";
                                break;
                            case 3:
                                str = "buy_on_instagram";
                                break;
                            default:
                                str = "storefront_relevance_sorted";
                                break;
                        }
                        if (!str.equals(A0m)) {
                        }
                    }
                }
                c16l.A0z();
            }
            return obj;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
