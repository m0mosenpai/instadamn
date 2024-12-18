package X;

import com.instagram.api.schemas.PromptFirstMediaType;
import java.io.IOException;

/* renamed from: X.IQl, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C41315IQl {
    /* JADX WARN: Type inference failed for: r2v0, types: [X.5jh, X.HDj] */
    public static C38957HDj parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            ?? c124275jh = new C124275jh();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("original_prompt_author".equals(A0s)) {
                    c124275jh.A03 = AbstractC31171DnF.A0S(c16l, false);
                } else if ("formatted_media_count".equals(A0s)) {
                    String A0m = AbstractC167017dG.A0m(c16l);
                    C14360o3.A0B(A0m, 0);
                    c124275jh.A04 = A0m;
                } else if ("prompt_sticker_text".equals(A0s)) {
                    String A0m2 = AbstractC167017dG.A0m(c16l);
                    C14360o3.A0B(A0m2, 0);
                    c124275jh.A05 = A0m2;
                } else if (AbstractC111324zv.A00(743).equals(A0s)) {
                    c124275jh.A00 = AbstractC40068Hpu.A00(AbstractC167017dG.A0m(c16l));
                } else if (AbstractC111324zv.A00(1132).equals(A0s)) {
                    c124275jh.A01 = AbstractC40068Hpu.A00(AbstractC167017dG.A0m(c16l));
                } else if ("first_media_pill_state".equals(A0s)) {
                    PromptFirstMediaType promptFirstMediaType = (PromptFirstMediaType) PromptFirstMediaType.A01.get(AbstractC167017dG.A0m(c16l));
                    if (promptFirstMediaType == null) {
                        promptFirstMediaType = PromptFirstMediaType.A06;
                    }
                    c124275jh.A02 = promptFirstMediaType;
                } else {
                    C37410Gdq.A00(c16l, c124275jh, A0s);
                }
                c16l.A0z();
            }
            c124275jh.A01();
            return c124275jh;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
