package X;

import com.instagram.user.model.User;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes6.dex */
public final class FSO {
    /* JADX WARN: Type inference failed for: r5v0, types: [X.EAt, X.1um, X.1ul] */
    public static C32146EAt parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            ?? c40791um = new C40791um();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("creator".equals(A0s)) {
                    c40791um.A01 = AbstractC31171DnF.A0S(c16l, false);
                } else {
                    ArrayList arrayList = null;
                    if (AbstractC31171DnF.A1Y(A0s)) {
                        c40791um.A02 = AbstractC167017dG.A0m(c16l);
                    } else if (AbstractC111324zv.A00(235).equals(A0s)) {
                        if (c16l.A11() == C16R.A0C) {
                            arrayList = AbstractC166987dD.A1E();
                            while (c16l.A1J() != C16R.A08) {
                                E7l parseFromJson = AbstractC33693Euh.parseFromJson(c16l);
                                if (parseFromJson != null) {
                                    arrayList.add(parseFromJson);
                                }
                            }
                        }
                        c40791um.A04 = arrayList;
                    } else if ("text".equals(A0s)) {
                        c40791um.A03 = AbstractC167017dG.A0m(c16l);
                    } else {
                        C55702hA.A01(c16l, c40791um, A0s);
                    }
                }
                c16l.A0z();
            }
            User user = c40791um.A01;
            String str = c40791um.A02;
            C14360o3.A0A(str);
            List list = c40791um.A04;
            C14360o3.A0A(list);
            String str2 = c40791um.A03;
            C14360o3.A0A(str2);
            c40791um.A00 = new E7k(user, str, str2, list);
            return c40791um;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
