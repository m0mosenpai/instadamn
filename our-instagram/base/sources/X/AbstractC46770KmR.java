package X;

import java.io.IOException;

/* renamed from: X.KmR, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public abstract class AbstractC46770KmR {
    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, X.L4q] */
    public static C47709L4q parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            ?? obj = new Object();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("note_igid".equals(A0s)) {
                    obj.A00 = c16l.A0y();
                } else if ("sticker_id".equals(A0s)) {
                    obj.A05 = AbstractC167017dG.A0m(c16l);
                } else if ("is_random".equals(A0s)) {
                    obj.A06 = c16l.A0d();
                } else if ("is_sticker".equals(A0s)) {
                    obj.A07 = c16l.A0d();
                } else if ("note_author_username".equals(A0s)) {
                    obj.A03 = AbstractC167017dG.A0m(c16l);
                } else if ("note_text".equals(A0s)) {
                    obj.A04 = AbstractC167017dG.A0m(c16l);
                } else if ("profile_pic_url".equals(A0s)) {
                    obj.A01 = C17Y.parseFromJson(c16l);
                } else if ("gif_url".equals(A0s)) {
                    obj.A02 = C54X.parseFromJson(c16l);
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
