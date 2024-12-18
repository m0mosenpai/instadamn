package X;

import java.io.IOException;

/* renamed from: X.Knv, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public abstract class AbstractC46862Knv {
    public static L4Z parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            L4Z l4z = new L4Z();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("item_id".equals(A0s)) {
                    l4z.A02 = AbstractC167017dG.A0m(c16l);
                } else if ("message_id".equals(A0s)) {
                    l4z.A03 = AbstractC167017dG.A0m(c16l);
                } else if (AbstractC111324zv.A00(1342).equals(A0s)) {
                    l4z.A06 = AbstractC167017dG.A0m(c16l);
                } else if ("subtitle_text".equals(A0s)) {
                    l4z.A05 = AbstractC167017dG.A0m(c16l);
                } else if ("pinned_timestamp_ms".equals(A0s)) {
                    l4z.A01 = AbstractC31173DnH.A0h(c16l);
                } else if ("preview_thumbnail_url".equals(A0s)) {
                    l4z.A04 = AbstractC167017dG.A0m(c16l);
                } else if ("is_deleted_for_self".equals(A0s)) {
                    l4z.A00 = AbstractC166997dE.A0d(c16l);
                }
                c16l.A0z();
            }
            return l4z;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
