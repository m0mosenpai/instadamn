package X;

import java.io.IOException;

/* renamed from: X.KmT, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public abstract class AbstractC46772KmT {
    /* JADX WARN: Type inference failed for: r0v3, types: [X.CSD, java.lang.Object] */
    public static CSD parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            ?? obj = new Object();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("note_id".equals(A0s)) {
                    obj.A00 = c16l.A0y();
                } else if ("note_author_username".equals(A0s)) {
                    String A0m = AbstractC167017dG.A0m(c16l);
                    C14360o3.A0B(A0m, 0);
                    obj.A02 = A0m;
                } else if ("note_text".equals(A0s)) {
                    obj.A03 = AbstractC167017dG.A0m(c16l);
                } else if ("profile_pic_url".equals(A0s)) {
                    obj.A01 = C17Y.parseFromJson(c16l);
                }
                c16l.A0z();
            }
            return obj;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
