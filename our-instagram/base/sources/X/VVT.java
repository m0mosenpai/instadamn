package X;

import java.io.IOException;

/* loaded from: classes11.dex */
public abstract class VVT {
    /* JADX WARN: Type inference failed for: r1v1, types: [X.Vmd, java.lang.Object] */
    public static C69393Vmd parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            ?? obj = new Object();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("text".equals(A0s)) {
                    obj.A05 = AbstractC167017dG.A0m(c16l);
                } else if ("url".equals(A0s)) {
                    obj.A04 = AbstractC167017dG.A0m(c16l);
                } else if ("action".equals(A0s)) {
                    obj.A01 = AbstractC167017dG.A0m(c16l);
                } else if ("background_color".equals(A0s)) {
                    obj.A02 = AbstractC167017dG.A0m(c16l);
                } else if ("border_color".equals(A0s)) {
                    obj.A03 = AbstractC167017dG.A0m(c16l);
                } else if ("text_color".equals(A0s)) {
                    obj.A06 = AbstractC167017dG.A0m(c16l);
                } else if ("action_info".equals(A0s)) {
                    obj.A00 = AbstractC34244F8q.parseFromJson(c16l);
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
