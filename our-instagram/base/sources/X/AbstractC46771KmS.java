package X;

import java.io.IOException;

/* renamed from: X.KmS, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public abstract class AbstractC46771KmS {
    /* JADX WARN: Type inference failed for: r1v0, types: [X.L4V, java.lang.Object] */
    public static L4V parseFromJson(C16L c16l) {
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
                } else if (AbstractC111324zv.A00(98).equals(A0s)) {
                    obj.A02 = AbstractC167017dG.A0m(c16l);
                } else if ("avatar_sticker_template".equals(A0s)) {
                    obj.A04 = AbstractC167017dG.A0m(c16l);
                } else if (MSV.A00(391).equals(A0s)) {
                    obj.A03 = AbstractC167017dG.A0m(c16l);
                } else if ("note_author_username".equals(A0s)) {
                    obj.A05 = AbstractC167017dG.A0m(c16l);
                } else if ("note_text".equals(A0s)) {
                    obj.A06 = AbstractC167017dG.A0m(c16l);
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
