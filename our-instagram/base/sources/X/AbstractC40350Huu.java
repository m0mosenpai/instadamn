package X;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.Huu, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC40350Huu {
    public static C51756Mtf parseFromJson(C16L c16l) {
        String A00;
        C14360o3.A0B(c16l, 0);
        try {
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            ArrayList arrayList = null;
            while (true) {
                C16R A1J = c16l.A1J();
                C16R c16r = C16R.A09;
                A00 = MSV.A00(252);
                if (A1J == c16r) {
                    break;
                }
                if (AbstractC31177DnL.A1V(c16l, A00)) {
                    if (c16l.A11() == C16R.A0C) {
                        arrayList = AbstractC166987dD.A1E();
                        while (c16l.A1J() != C16R.A08) {
                            H6F parseFromJson = AbstractC40345Hup.parseFromJson(c16l);
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
            if (arrayList == null && (c16l instanceof C07950bF)) {
                AbstractC166997dE.A1V(A00, c16l, "StoryTrendingPromptsFeaturedInjectedPromptsResponse");
                throw C00O.createAndThrow();
            }
            return new C51756Mtf((List) arrayList, 22);
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
