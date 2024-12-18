package X;

import com.instagram.api.schemas.BrandedContentGatingCountryMinimumAge;
import com.instagram.api.schemas.BrandedContentGatingCountryMinimumAgeImpl;
import com.instagram.api.schemas.BrandedContentGatingInfo;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: X.INj, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC41243INj {
    public static BrandedContentGatingInfo parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            C16R A11 = c16l.A11();
            C16R c16r = C16R.A0D;
            if (A11 != c16r) {
                c16l.A0z();
                return null;
            }
            HashMap hashMap = null;
            ArrayList arrayList = null;
            ArrayList arrayList2 = null;
            Integer num = null;
            String str = null;
            while (true) {
                C16R A1J = c16l.A1J();
                C16R c16r2 = C16R.A09;
                if (A1J != c16r2) {
                    String A0s = AbstractC166997dE.A0s(c16l);
                    if ("country_age_data".equals(A0s)) {
                        if (c16l.A11() == c16r) {
                            hashMap = AbstractC166987dD.A1G();
                            while (c16l.A1J() != c16r2) {
                                String A1P = c16l.A1P();
                                if (AbstractC37301Gc2.A05(c16l) == C16R.A0G) {
                                    hashMap.put(A1P, null);
                                } else {
                                    Integer A0h = AbstractC166997dE.A0h(c16l);
                                    if (A0h != null) {
                                        hashMap.put(A1P, A0h);
                                    }
                                }
                            }
                        } else {
                            hashMap = null;
                        }
                    } else if ("country_age_list".equals(A0s)) {
                        if (c16l.A11() == C16R.A0C) {
                            arrayList = AbstractC166987dD.A1E();
                            while (c16l.A1J() != C16R.A08) {
                                BrandedContentGatingCountryMinimumAgeImpl parseFromJson = AbstractC39779Hkp.parseFromJson(c16l);
                                if (parseFromJson != null) {
                                    arrayList.add(parseFromJson);
                                }
                            }
                        } else {
                            arrayList = null;
                        }
                    } else if ("country_block_data".equals(A0s)) {
                        if (c16l.A11() == C16R.A0C) {
                            arrayList2 = AbstractC166987dD.A1E();
                            while (c16l.A1J() != C16R.A08) {
                                AbstractC167027dH.A0w(c16l, arrayList2);
                            }
                        } else {
                            arrayList2 = null;
                        }
                    } else if ("default_age".equals(A0s)) {
                        num = AbstractC166997dE.A0h(c16l);
                    } else if ("selected_category".equals(A0s)) {
                        if (c16l.A11() == C16R.A0G) {
                            str = null;
                        } else {
                            str = c16l.A1P();
                        }
                    }
                    c16l.A0z();
                } else {
                    return new BrandedContentGatingInfo(num, str, hashMap, arrayList, arrayList2);
                }
            }
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }

    public static void A00(AnonymousClass182 anonymousClass182, BrandedContentGatingInfo brandedContentGatingInfo) {
        anonymousClass182.A0d();
        HashMap hashMap = brandedContentGatingInfo.A02;
        if (hashMap != null) {
            anonymousClass182.A0r("country_age_data");
            anonymousClass182.A0d();
            Iterator A14 = AbstractC166997dE.A14(hashMap);
            while (A14.hasNext()) {
                Map.Entry A1K = AbstractC166987dD.A1K(A14);
                if (!C16V.A04(anonymousClass182, A1K)) {
                    anonymousClass182.A0h(AbstractC166987dD.A0H(A1K.getValue()));
                }
            }
            anonymousClass182.A0a();
        }
        List list = brandedContentGatingInfo.A03;
        if (list != null) {
            Iterator A0q = AbstractC37301Gc2.A0q(anonymousClass182, "country_age_list", list);
            while (A0q.hasNext()) {
                BrandedContentGatingCountryMinimumAge brandedContentGatingCountryMinimumAge = (BrandedContentGatingCountryMinimumAge) A0q.next();
                if (brandedContentGatingCountryMinimumAge != null) {
                    BrandedContentGatingCountryMinimumAgeImpl ErM = brandedContentGatingCountryMinimumAge.ErM();
                    anonymousClass182.A0d();
                    String str = ErM.A01;
                    if (str != null) {
                        anonymousClass182.A0S("country_code", str);
                    }
                    Integer num = ErM.A00;
                    if (num != null) {
                        anonymousClass182.A0Q("minimum_age", num.intValue());
                    }
                    anonymousClass182.A0a();
                }
            }
            anonymousClass182.A0Z();
        }
        List list2 = brandedContentGatingInfo.A04;
        if (list2 != null) {
            Iterator A0q2 = AbstractC37301Gc2.A0q(anonymousClass182, "country_block_data", list2);
            while (A0q2.hasNext()) {
                AbstractC167017dG.A1F(anonymousClass182, A0q2);
            }
            anonymousClass182.A0Z();
        }
        Integer num2 = brandedContentGatingInfo.A00;
        if (num2 != null) {
            anonymousClass182.A0Q("default_age", num2.intValue());
        }
        String str2 = brandedContentGatingInfo.A01;
        if (str2 != null) {
            anonymousClass182.A0S("selected_category", str2);
        }
        anonymousClass182.A0a();
    }
}
