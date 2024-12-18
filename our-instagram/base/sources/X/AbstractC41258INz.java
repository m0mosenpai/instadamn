package X;

import com.instagram.model.androidlink.AndroidLink;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.INz, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC41258INz {
    public static H39 parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            ArrayList arrayList = null;
            String str = null;
            ArrayList arrayList2 = null;
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("android_links".equals(A0s)) {
                    if (c16l.A11() == C16R.A0C) {
                        arrayList = AbstractC166987dD.A1E();
                        while (c16l.A1J() != C16R.A08) {
                            AbstractC37302Gc3.A1I(c16l, arrayList);
                        }
                    } else {
                        arrayList = null;
                    }
                } else if ("dynamic_item_id".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str = null;
                    } else {
                        str = c16l.A1P();
                    }
                } else if ("ios_links".equals(A0s)) {
                    if (c16l.A11() == C16R.A0C) {
                        arrayList2 = AbstractC166987dD.A1E();
                        while (c16l.A1J() != C16R.A08) {
                            AbstractC37302Gc3.A1I(c16l, arrayList2);
                        }
                    } else {
                        arrayList2 = null;
                    }
                }
                c16l.A0z();
            }
            return new H39(arrayList, arrayList2, str);
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }

    public static void A00(AnonymousClass182 anonymousClass182, H39 h39) {
        anonymousClass182.A0d();
        List list = h39.A01;
        if (list != null) {
            Iterator A0q = AbstractC37301Gc2.A0q(anonymousClass182, "android_links", list);
            while (A0q.hasNext()) {
                AndroidLink androidLink = (AndroidLink) A0q.next();
                if (androidLink != null) {
                    AbstractC87683va.A00(anonymousClass182, androidLink.F53());
                }
            }
            anonymousClass182.A0Z();
        }
        String str = h39.A00;
        if (str != null) {
            anonymousClass182.A0S("dynamic_item_id", str);
        }
        List list2 = h39.A02;
        if (list2 != null) {
            Iterator A0q2 = AbstractC37301Gc2.A0q(anonymousClass182, "ios_links", list2);
            while (A0q2.hasNext()) {
                AndroidLink androidLink2 = (AndroidLink) A0q2.next();
                if (androidLink2 != null) {
                    AbstractC87683va.A00(anonymousClass182, androidLink2.F53());
                }
            }
            anonymousClass182.A0Z();
        }
        anonymousClass182.A0a();
    }
}
