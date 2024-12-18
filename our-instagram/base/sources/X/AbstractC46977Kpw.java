package X;

import com.instagram.model.direct.stickerstore.DirectStoreSticker;
import java.io.IOException;

/* renamed from: X.Kpw, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public abstract class AbstractC46977Kpw {
    public static C33271hp parseFromJson(C16L c16l) {
        String A1P;
        C14360o3.A0B(c16l, 0);
        try {
            C33271hp c33271hp = new C33271hp();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0q = c16l.A0q();
                if (AbstractC31175DnJ.A1W(c16l, A0q)) {
                    c33271hp.A02 = AbstractC31172DnG.A0o(c16l);
                } else if ("sticker_id".equals(A0q)) {
                    if (c16l.A11() == C16R.A0G) {
                        A1P = null;
                    } else {
                        A1P = c16l.A1P();
                    }
                    C14360o3.A0B(A1P, 0);
                    c33271hp.A04 = A1P;
                } else if ("store_sticker".equals(A0q)) {
                    DirectStoreSticker parseFromJson = AbstractC47870LCq.parseFromJson(c16l);
                    C14360o3.A0B(parseFromJson, 0);
                    c33271hp.A03 = parseFromJson;
                } else if ("replied_to_message".equals(A0q)) {
                    c33271hp.A01 = AnonymousClass442.A00(c16l);
                } else {
                    AbstractC47856LCb.A01(c16l, c33271hp, A0q);
                }
                c16l.A0z();
            }
            return c33271hp;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
