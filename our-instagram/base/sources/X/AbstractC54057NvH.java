package X;

import com.instagram.model.keyword.Keyword;
import com.instagram.model.keyword.KeywordRecommendations;
import java.io.IOException;
import java.util.ArrayList;

/* renamed from: X.NvH, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public abstract class AbstractC54057NvH {
    public static KeywordRecommendations parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            KeywordRecommendations keywordRecommendations = new KeywordRecommendations();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0q = c16l.A0q();
                ArrayList arrayList = null;
                if (AbstractC37301Gc2.A1V(c16l, A0q)) {
                    String A0m = AbstractC167017dG.A0m(c16l);
                    C14360o3.A0B(A0m, 0);
                    keywordRecommendations.A00 = A0m;
                } else if (AbstractC31171DnF.A1a(A0q)) {
                    String A0m2 = AbstractC167017dG.A0m(c16l);
                    C14360o3.A0B(A0m2, 0);
                    keywordRecommendations.A01 = A0m2;
                } else if ("keywords".equals(A0q)) {
                    if (c16l.A11() == C16R.A0C) {
                        arrayList = AbstractC166987dD.A1E();
                        while (c16l.A1J() != C16R.A08) {
                            Keyword parseFromJson = MZ7.parseFromJson(c16l);
                            if (parseFromJson != null) {
                                arrayList.add(parseFromJson);
                            }
                        }
                    }
                    C14360o3.A0B(arrayList, 0);
                    keywordRecommendations.A02 = arrayList;
                }
                c16l.A0z();
            }
            return keywordRecommendations;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
