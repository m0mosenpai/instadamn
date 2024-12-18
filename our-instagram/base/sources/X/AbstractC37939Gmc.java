package X;

import com.instagram.api.schemas.NoteEmojiReactionInfo;
import java.io.IOException;
import java.util.ArrayList;

/* renamed from: X.Gmc, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC37939Gmc {
    public static AnonymousClass688 parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            C111074zO c111074zO = null;
            ArrayList arrayList = null;
            while (c16l.A1J() != C16R.A09) {
                String A0q = c16l.A0q();
                c16l.A1J();
                if ("paging_info".equals(A0q)) {
                    c111074zO = AbstractC111064zN.parseFromJson(c16l);
                } else if ("reactions".equals(A0q)) {
                    if (c16l.A11() == C16R.A0C) {
                        arrayList = new ArrayList();
                        while (c16l.A1J() != C16R.A08) {
                            NoteEmojiReactionInfo parseFromJson = AbstractC41262IOd.parseFromJson(c16l);
                            if (parseFromJson != null) {
                                arrayList.add(parseFromJson);
                            }
                        }
                    } else {
                        arrayList = null;
                    }
                }
                c16l.A0z();
            }
            if (c111074zO == null && (c16l instanceof C07950bF)) {
                AbstractC166997dE.A1V("paging_info", c16l, "NoteEmojiReactionsResponse");
            } else if (arrayList == null && (c16l instanceof C07950bF)) {
                AbstractC166997dE.A1V("reactions", c16l, "NoteEmojiReactionsResponse");
            } else {
                return new AnonymousClass688(c111074zO, arrayList);
            }
            throw C00O.createAndThrow();
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
