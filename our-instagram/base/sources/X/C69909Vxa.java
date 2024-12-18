package X;

import com.instagram.business.promote.model.InstagramMediaProductType;
import com.instagram.business.promote.model.PromoteButtonAction;
import java.io.IOException;

/* renamed from: X.Vxa, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C69909Vxa {
    /* JADX WARN: Type inference failed for: r1v2, types: [X.UzB, X.1um, X.1ul] */
    public static C67838UzB parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            ?? c40791um = new C40791um();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("ad_account_id".equals(A0s)) {
                    C14360o3.A0B(AbstractC167017dG.A0m(c16l), 0);
                } else if ("thumbnail_url".equals(A0s)) {
                    String A0m = AbstractC167017dG.A0m(c16l);
                    C14360o3.A0B(A0m, 0);
                    c40791um.A06 = A0m;
                } else if ("media_product_type".equals(A0s)) {
                    InstagramMediaProductType valueOf = InstagramMediaProductType.valueOf(c16l.A1Q());
                    C14360o3.A0B(valueOf, 0);
                    c40791um.A00 = valueOf;
                } else if (AbstractC111324zv.A00(1250).equals(A0s)) {
                    String A0m2 = AbstractC167017dG.A0m(c16l);
                    C14360o3.A0B(A0m2, 0);
                    c40791um.A05 = A0m2;
                } else if ("display_title".equals(A0s)) {
                    String A0m3 = AbstractC167017dG.A0m(c16l);
                    C14360o3.A0B(A0m3, 0);
                    c40791um.A04 = A0m3;
                } else if ("display_body".equals(A0s)) {
                    String A0m4 = AbstractC167017dG.A0m(c16l);
                    C14360o3.A0B(A0m4, 0);
                    c40791um.A03 = A0m4;
                } else if ("primary_action".equals(A0s)) {
                    PromoteButtonAction parseFromJson = AbstractC68448VRe.parseFromJson(c16l);
                    C14360o3.A0B(parseFromJson, 0);
                    c40791um.A01 = parseFromJson;
                } else if ("secondary_action".equals(A0s)) {
                    c40791um.A02 = AbstractC68448VRe.parseFromJson(c16l);
                } else {
                    C55702hA.A01(c16l, c40791um, A0s);
                }
                c16l.A0z();
            }
            return c40791um;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
