package X;

import com.facebook.proxygen.TraceFieldType;
import java.io.IOException;

/* renamed from: X.ADm, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC23030ADm {
    public static C51743MtS parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            C51743MtS c51743MtS = new C51743MtS();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if (TraceFieldType.ContentType.equals(A0s)) {
                    String A0m = AbstractC167017dG.A0m(c16l);
                    C14360o3.A0B(A0m, 0);
                    c51743MtS.A03 = A0m;
                } else if ("content_id".equals(A0s)) {
                    String A0m2 = AbstractC167017dG.A0m(c16l);
                    C14360o3.A0B(A0m2, 0);
                    c51743MtS.A01 = A0m2;
                } else if (AbstractC50637MWy.A00(10, 8, 106).equals(A0s)) {
                    c51743MtS.A05 = AbstractC167017dG.A0m(c16l);
                } else if (AbstractC111324zv.A00(844).equals(A0s)) {
                    c51743MtS.A02 = AbstractC167017dG.A0m(c16l);
                } else if ("segment_index".equals(A0s)) {
                    c51743MtS.A00 = AbstractC166997dE.A0h(c16l);
                } else if ("thumbnail_url".equals(A0s)) {
                    c51743MtS.A04 = AbstractC167017dG.A0m(c16l);
                }
                c16l.A0z();
            }
            return c51743MtS;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }

    public static void A00(C51743MtS c51743MtS, AnonymousClass182 anonymousClass182) {
        anonymousClass182.A0d();
        String str = c51743MtS.A03;
        if (str != null) {
            anonymousClass182.A0S(TraceFieldType.ContentType, str);
        }
        String str2 = c51743MtS.A01;
        if (str2 != null) {
            anonymousClass182.A0S("content_id", str2);
        }
        String str3 = c51743MtS.A05;
        if (str3 != null) {
            anonymousClass182.A0S(AbstractC50637MWy.A00(10, 8, 106), str3);
        }
        String str4 = c51743MtS.A02;
        if (str4 != null) {
            anonymousClass182.A0S(AbstractC111324zv.A00(844), str4);
        }
        Number number = (Number) c51743MtS.A00;
        if (number != null) {
            anonymousClass182.A0Q("segment_index", number.intValue());
        }
        String str5 = c51743MtS.A04;
        if (str5 != null) {
            anonymousClass182.A0S("thumbnail_url", str5);
        }
        anonymousClass182.A0a();
    }
}
