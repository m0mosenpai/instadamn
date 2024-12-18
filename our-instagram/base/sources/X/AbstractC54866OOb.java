package X;

import com.instagram.pendingmedia.model.BrandedContentTag;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: X.OOb, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public abstract class AbstractC54866OOb {
    public static C54632OBh parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            C54632OBh c54632OBh = new C54632OBh();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("branded_content_tags".equals(A0s)) {
                    ArrayList arrayList = null;
                    if (c16l.A11() == C16R.A0C) {
                        arrayList = AbstractC166987dD.A1E();
                        while (c16l.A1J() != C16R.A08) {
                            BrandedContentTag parseFromJson = AbstractC54880OPb.parseFromJson(c16l);
                            if (parseFromJson != null) {
                                arrayList.add(parseFromJson);
                            }
                        }
                    }
                    C14360o3.A0B(arrayList, 0);
                    c54632OBh.A02 = arrayList;
                } else if ("media_gating_info".equals(A0s)) {
                    c54632OBh.A00 = AbstractC41243INj.parseFromJson(c16l);
                } else if ("is_paid_partnership".equals(A0s)) {
                    c54632OBh.A03 = c16l.A0d();
                } else if ("branded_content_project_metadata".equals(A0s)) {
                    c54632OBh.A01 = ONL.parseFromJson(c16l);
                }
                c16l.A0z();
            }
            return c54632OBh;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }

    public static void A00(AnonymousClass182 anonymousClass182, C54632OBh c54632OBh) {
        anonymousClass182.A0d();
        C16V.A03(anonymousClass182, "branded_content_tags");
        Iterator it = c54632OBh.A02.iterator();
        while (it.hasNext()) {
            BrandedContentTag A0n = MSW.A0n(it);
            if (A0n != null) {
                AbstractC54880OPb.A00(anonymousClass182, A0n);
            }
        }
        anonymousClass182.A0Z();
        if (c54632OBh.A00 != null) {
            anonymousClass182.A0r("media_gating_info");
            AbstractC41243INj.A00(anonymousClass182, c54632OBh.A00);
        }
        anonymousClass182.A0T("is_paid_partnership", c54632OBh.A03);
        if (c54632OBh.A01 != null) {
            anonymousClass182.A0r("branded_content_project_metadata");
            ONL.A00(anonymousClass182, c54632OBh.A01);
        }
        anonymousClass182.A0a();
    }
}
