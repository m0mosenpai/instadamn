package X;

import java.io.IOException;

/* loaded from: classes11.dex */
public abstract class VRM {
    /* JADX WARN: Type inference failed for: r0v3, types: [X.Vkr, java.lang.Object] */
    public static C69283Vkr parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            ?? obj = new Object();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("tip_id".equals(A0s)) {
                    obj.A04 = AbstractC167017dG.A0m(c16l);
                } else if ("display_title".equals(A0s)) {
                    obj.A03 = AbstractC167017dG.A0m(c16l);
                } else if ("display_body".equals(A0s)) {
                    obj.A02 = AbstractC167017dG.A0m(c16l);
                } else if ("image_url".equals(A0s)) {
                    obj.A01 = AbstractC222616c.A00(c16l);
                } else if ("primary_action".equals(A0s)) {
                    obj.A00 = VRL.parseFromJson(c16l);
                }
                c16l.A0z();
            }
            return obj;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
