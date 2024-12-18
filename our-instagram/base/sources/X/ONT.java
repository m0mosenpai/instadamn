package X;

import com.instagram.api.schemas.AchievementButtonInfoImpl;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes9.dex */
public final class ONT {
    /* JADX WARN: Type inference failed for: r1v0, types: [X.N2W, X.1um, X.1ul] */
    public static N2W parseFromJson(C16L c16l) {
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
                if ("about_achievements_components".equals(A0s)) {
                    if (c16l.A11() == C16R.A0C) {
                        arrayList = AbstractC166987dD.A1E();
                        while (c16l.A1J() != C16R.A08) {
                            C26117Bh1 parseFromJson = AbstractC53767NqJ.parseFromJson(c16l);
                            if (parseFromJson != null) {
                                arrayList.add(parseFromJson);
                            }
                        }
                    }
                    c40791um.A07 = arrayList;
                } else if ("achievements_image_url".equals(A0s)) {
                    c40791um.A03 = AbstractC167017dG.A0m(c16l);
                } else if ("footer_text".equals(A0s)) {
                    c40791um.A04 = AbstractC167017dG.A0m(c16l);
                } else if ("primary_button".equals(A0s)) {
                    c40791um.A00 = AbstractC53768NqK.parseFromJson(c16l);
                } else if ("secondary_button".equals(A0s)) {
                    c40791um.A01 = AbstractC53768NqK.parseFromJson(c16l);
                } else if ("subtitle".equals(A0s)) {
                    c40791um.A05 = AbstractC167017dG.A0m(c16l);
                } else if (AbstractC31171DnF.A1a(A0s)) {
                    c40791um.A06 = AbstractC167017dG.A0m(c16l);
                } else {
                    C55702hA.A01(c16l, c40791um, A0s);
                }
                c16l.A0z();
            }
            List list = c40791um.A07;
            C14360o3.A0A(list);
            String str = c40791um.A03;
            C14360o3.A0A(str);
            String str2 = c40791um.A04;
            AchievementButtonInfoImpl achievementButtonInfoImpl = c40791um.A00;
            AchievementButtonInfoImpl achievementButtonInfoImpl2 = c40791um.A01;
            String str3 = c40791um.A05;
            C14360o3.A0A(str3);
            String str4 = c40791um.A06;
            C14360o3.A0A(str4);
            c40791um.A02 = new C26129BhG(achievementButtonInfoImpl, achievementButtonInfoImpl2, str, str2, str3, str4, list);
            return c40791um;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
