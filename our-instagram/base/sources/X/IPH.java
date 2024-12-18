package X;

import com.instagram.api.schemas.StoryTrendingTemplateSectionType;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes7.dex */
public final class IPH {
    /* JADX WARN: Type inference failed for: r2v0, types: [X.H9Y, X.1um, X.1ul] */
    public static H9Y parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            ?? c40791um = new C40791um();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                ArrayList arrayList = null;
                if ("cursor".equals(A0s)) {
                    c40791um.A04 = AbstractC167017dG.A0m(c16l);
                } else if ("disclaimer".equals(A0s)) {
                    c40791um.A05 = AbstractC167017dG.A0m(c16l);
                } else if ("featured_injected_prompts_response".equals(A0s)) {
                    c40791um.A00 = AbstractC40350Huu.parseFromJson(c16l);
                } else if ("has_next_page".equals(A0s)) {
                    c40791um.A03 = AbstractC166997dE.A0d(c16l);
                } else if (MSV.A00(252).equals(A0s)) {
                    if (c16l.A11() == C16R.A0C) {
                        arrayList = AbstractC166987dD.A1E();
                        while (c16l.A1J() != C16R.A08) {
                            H6F parseFromJson = AbstractC40345Hup.parseFromJson(c16l);
                            if (parseFromJson != null) {
                                arrayList.add(parseFromJson);
                            }
                        }
                    }
                    c40791um.A07 = arrayList;
                } else if (AbstractC31171DnF.A1a(A0s)) {
                    c40791um.A06 = AbstractC167017dG.A0m(c16l);
                } else if (MSV.A00(1665).equals(A0s)) {
                    StoryTrendingTemplateSectionType storyTrendingTemplateSectionType = (StoryTrendingTemplateSectionType) StoryTrendingTemplateSectionType.A01.get(AbstractC167017dG.A0m(c16l));
                    if (storyTrendingTemplateSectionType == null) {
                        storyTrendingTemplateSectionType = StoryTrendingTemplateSectionType.A08;
                    }
                    c40791um.A02 = storyTrendingTemplateSectionType;
                } else {
                    C55702hA.A01(c16l, c40791um, A0s);
                }
                c16l.A0z();
            }
            String str = c40791um.A04;
            C14360o3.A0A(str);
            String str2 = c40791um.A05;
            C51756Mtf c51756Mtf = c40791um.A00;
            boolean A1b = AbstractC31172DnG.A1b(c40791um.A03);
            List list = c40791um.A07;
            C14360o3.A0A(list);
            c40791um.A01 = new C38629GyW(c51756Mtf, c40791um.A02, str, str2, c40791um.A06, list, A1b);
            return c40791um;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
