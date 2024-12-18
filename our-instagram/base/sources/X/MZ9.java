package X;

import com.instagram.model.keyword.Keyword;
import java.io.IOException;

/* loaded from: classes9.dex */
public abstract class MZ9 {
    public static C66130U0o parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            C66130U0o c66130U0o = new C66130U0o();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0q = c16l.A0q();
                c16l.A1J();
                if ("keyword".equals(A0q)) {
                    Keyword parseFromJson = MZ7.parseFromJson(c16l);
                    C14360o3.A0B(parseFromJson, 0);
                    c66130U0o.A01 = parseFromJson;
                } else if ("position".equals(A0q)) {
                    c66130U0o.A00 = c16l.A1D();
                } else {
                    AbstractC37930GmS.A01(c16l, c66130U0o, A0q);
                }
                c16l.A0z();
            }
            return c66130U0o;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }

    public static void A00(AnonymousClass182 anonymousClass182, C66130U0o c66130U0o) {
        anonymousClass182.A0d();
        if (c66130U0o.A01 != null) {
            anonymousClass182.A0r("keyword");
            MZ7.A00(anonymousClass182, c66130U0o.A01);
        }
        anonymousClass182.A0Q("position", c66130U0o.A00);
        AbstractC37930GmS.A00(anonymousClass182, c66130U0o);
        anonymousClass182.A0a();
    }
}
