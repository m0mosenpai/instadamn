package X;

import com.instagram.user.model.ProductCollectionImpl;
import com.instagram.user.model.ProductDetailsProductItemDict;
import java.io.IOException;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.Ibj, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC41651Ibj {
    public static C38686GzR parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            C38686GzR c38686GzR = new C38686GzR();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                ArrayList arrayList = null;
                if ("products".equals(A0s)) {
                    if (c16l.A11() == C16R.A0C) {
                        arrayList = AbstractC166987dD.A1E();
                        while (c16l.A1J() != C16R.A08) {
                            C38682GzN parseFromJson = AbstractC40560Hyg.parseFromJson(c16l);
                            if (parseFromJson != null) {
                                arrayList.add(parseFromJson);
                            }
                        }
                    }
                    c38686GzR.A01 = arrayList;
                } else if ("product_collection_id".equals(A0s)) {
                    c38686GzR.A03 = AbstractC167017dG.A0m(c16l);
                } else if ("product_collection".equals(A0s)) {
                    c38686GzR.A00 = IT1.parseFromJson(c16l);
                } else if ("shopping_tagging_session_id".equals(A0s)) {
                    c38686GzR.A04 = AbstractC167017dG.A0m(c16l);
                } else if ("merchant_id".equals(A0s)) {
                    c38686GzR.A02 = AbstractC167017dG.A0m(c16l);
                }
                c16l.A0z();
            }
            return c38686GzR;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }

    public static String A00(C38686GzR c38686GzR) {
        StringWriter A0O = AbstractC37300Gc1.A0O();
        C17z A0A = AbstractC221915u.A00.A0A(A0O);
        A01(c38686GzR, A0A);
        A0A.close();
        return A0O.toString();
    }

    public static void A01(C38686GzR c38686GzR, AnonymousClass182 anonymousClass182) {
        anonymousClass182.A0d();
        if (c38686GzR.A01 != null) {
            C16V.A03(anonymousClass182, "products");
            for (C38682GzN c38682GzN : (List) c38686GzR.A01) {
                if (c38682GzN != null) {
                    anonymousClass182.A0d();
                    String str = c38682GzN.A04;
                    if (str != null) {
                        anonymousClass182.A0S("product_id", str);
                    }
                    AbstractC37301Gc2.A1I(anonymousClass182, c38682GzN.A03);
                    String str2 = c38682GzN.A05;
                    if (str2 != null) {
                        anonymousClass182.A0S("product_name", str2);
                    }
                    ProductDetailsProductItemDict productDetailsProductItemDict = (ProductDetailsProductItemDict) c38682GzN.A00;
                    if (productDetailsProductItemDict != null) {
                        anonymousClass182.A0r(AbstractC43591JPw.A00(189));
                        AbstractC111134zU.A00(anonymousClass182, productDetailsProductItemDict);
                    }
                    String str3 = c38682GzN.A02;
                    if (str3 != null) {
                        anonymousClass182.A0S("affiliate_campaign_id", str3);
                    }
                    String str4 = c38682GzN.A07;
                    if (str4 != null) {
                        anonymousClass182.A0S("waterfall_id", str4);
                    }
                    String str5 = c38682GzN.A06;
                    if (str5 != null) {
                        anonymousClass182.A0S("session_instance_id", str5);
                    }
                    EnumC53230NgS enumC53230NgS = (EnumC53230NgS) c38682GzN.A01;
                    if (enumC53230NgS != null) {
                        anonymousClass182.A0S("tag_mode", enumC53230NgS.A00);
                    }
                    anonymousClass182.A0a();
                }
            }
            anonymousClass182.A0Z();
        }
        String str6 = c38686GzR.A03;
        if (str6 != null) {
            anonymousClass182.A0S("product_collection_id", str6);
        }
        if (c38686GzR.A00 != null) {
            anonymousClass182.A0r("product_collection");
            IT1.A00(anonymousClass182, (ProductCollectionImpl) c38686GzR.A00);
        }
        String str7 = c38686GzR.A04;
        if (str7 != null) {
            anonymousClass182.A0S("shopping_tagging_session_id", str7);
        }
        AbstractC37301Gc2.A1I(anonymousClass182, c38686GzR.A02);
        anonymousClass182.A0a();
    }
}
