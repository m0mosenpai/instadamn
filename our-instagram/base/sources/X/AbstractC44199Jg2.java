package X;

import com.instagram.api.schemas.NotePogImageDict;
import com.instagram.api.schemas.NotePogVideoDict;
import com.instagram.user.model.User;

/* renamed from: X.Jg2, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public abstract class AbstractC44199Jg2 {
    public static final C44200Jg3 A00(C45128JyU c45128JyU) {
        String A19;
        String str;
        NotePogImageDict notePogImageDict;
        C14360o3.A0B(c45128JyU, 0);
        C4F5 c4f5 = c45128JyU.A05;
        if (c4f5 == null || (notePogImageDict = c4f5.A07) == null || (A19 = notePogImageDict.A01) == null) {
            A19 = AbstractC25228BEl.A19(c45128JyU.A06);
            C14360o3.A07(A19);
        }
        String str2 = c45128JyU.A0B;
        C75363a3 A03 = c45128JyU.A03();
        if (c4f5 != null) {
            NotePogVideoDict notePogVideoDict = c4f5.A08;
            if (notePogVideoDict == null || (str = notePogVideoDict.A01) == null) {
                NotePogImageDict notePogImageDict2 = c4f5.A07;
                if (notePogImageDict2 != null) {
                    str = notePogImageDict2.A00;
                }
            }
            return new C44200Jg3(A03, A19, str2, str, c45128JyU.A0H, AbstractC167007dF.A1X(c45128JyU.A07, C05F.A00));
        }
        str = null;
        return new C44200Jg3(A03, A19, str2, str, c45128JyU.A0H, AbstractC167007dF.A1X(c45128JyU.A07, C05F.A00));
    }

    public static final C44200Jg3 A01(User user) {
        C14360o3.A0B(user, 0);
        String A19 = AbstractC25228BEl.A19(user);
        C14360o3.A07(A19);
        return new C44200Jg3(null, A19, user.getId(), null, false, false);
    }
}
