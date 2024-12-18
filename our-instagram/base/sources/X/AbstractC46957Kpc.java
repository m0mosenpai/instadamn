package X;

import java.io.IOException;

/* renamed from: X.Kpc, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public abstract class AbstractC46957Kpc {
    public static C33311ht parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            C33311ht c33311ht = new C33311ht();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0q = c16l.A0q();
                if (AbstractC31175DnJ.A1W(c16l, A0q)) {
                    c33311ht.A05 = AbstractC31172DnG.A0o(c16l);
                } else if ("sticker_template".equals(A0q)) {
                    String A0m = AbstractC167017dG.A0m(c16l);
                    C14360o3.A0B(A0m, 0);
                    c33311ht.A08 = A0m;
                } else if ("sticker_id".equals(A0q)) {
                    String A0m2 = AbstractC167017dG.A0m(c16l);
                    C14360o3.A0B(A0m2, 0);
                    c33311ht.A07 = A0m2;
                } else if ("sticker_image_url".equals(A0q)) {
                    c33311ht.A01 = AbstractC222616c.A00(c16l);
                } else if ("should_send_silently".equals(A0q)) {
                    c33311ht.A0A = c16l.A0d();
                } else if ("is_animated".equals(A0q)) {
                    c33311ht.A09 = c16l.A0d();
                } else if ("pending_media".equals(A0q)) {
                    c33311ht.A04 = AbstractC47865LCl.parseFromJson(c16l);
                } else if ("static_sticker_item".equals(A0q)) {
                    c33311ht.A02 = AbstractC201088uq.parseFromJson(c16l);
                } else if ("nux_type".equals(A0q)) {
                    c33311ht.A06 = AbstractC166997dE.A0h(c16l);
                } else if ("replied_to_message".equals(A0q)) {
                    c33311ht.A03 = AnonymousClass442.A00(c16l);
                } else {
                    AbstractC47856LCb.A01(c16l, c33311ht, A0q);
                }
                c16l.A0z();
            }
            return c33311ht;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
