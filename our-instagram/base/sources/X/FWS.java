package X;

import com.instagram.common.api.base.CacheBehaviorLogger;
import java.io.IOException;
import java.util.ArrayList;

/* loaded from: classes6.dex */
public abstract class FWS {
    public static C188538Ws parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            C188538Ws c188538Ws = new C188538Ws();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                ArrayList arrayList = null;
                if ("existing_to_reel_id".equals(A0s)) {
                    String A0m = AbstractC167017dG.A0m(c16l);
                    C14360o3.A0B(A0m, 0);
                    c188538Ws.A00 = A0m;
                } else if (CacheBehaviorLogger.SOURCE.equals(A0s)) {
                    String A0m2 = AbstractC167017dG.A0m(c16l);
                    C14360o3.A0B(A0m2, 0);
                    c188538Ws.A02 = A0m2;
                } else if ("new_reel_title".equals(A0s)) {
                    c188538Ws.A01 = AbstractC167017dG.A0m(c16l);
                } else if ("cover_crop_rect".equals(A0s)) {
                    if (c16l.A11() == C16R.A0C) {
                        arrayList = AbstractC166987dD.A1E();
                        while (c16l.A1J() != C16R.A08) {
                            arrayList.add(AbstractC167007dF.A0a(c16l));
                        }
                    }
                    C14360o3.A0B(arrayList, 0);
                    c188538Ws.A03 = arrayList;
                } else if ("is_adding_to_highlight".equals(A0s)) {
                    c188538Ws.A04 = c16l.A0d();
                }
                c16l.A0z();
            }
            return c188538Ws;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }

    public static void A00(AnonymousClass182 anonymousClass182, C188538Ws c188538Ws) {
        anonymousClass182.A0d();
        String str = c188538Ws.A00;
        if (str != null) {
            anonymousClass182.A0S("existing_to_reel_id", str);
        }
        String str2 = c188538Ws.A02;
        if (str2 != null) {
            anonymousClass182.A0S(CacheBehaviorLogger.SOURCE, str2);
        }
        String str3 = c188538Ws.A01;
        if (str3 != null) {
            anonymousClass182.A0S("new_reel_title", str3);
        }
        if (c188538Ws.A03 != null) {
            C16V.A03(anonymousClass182, "cover_crop_rect");
            for (Number number : c188538Ws.A03) {
                if (number != null) {
                    anonymousClass182.A0g(number.floatValue());
                }
            }
            anonymousClass182.A0Z();
        }
        anonymousClass182.A0T("is_adding_to_highlight", c188538Ws.A04);
        anonymousClass182.A0a();
    }
}
