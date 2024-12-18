package X;

import com.instagram.api.schemas.TextAppMentionType;
import com.instagram.user.model.User;
import java.io.IOException;

/* renamed from: X.Hvg, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC40393Hvg {
    public static C38789H6e parseFromJson(C16L c16l) {
        String A1P;
        C14360o3.A0B(c16l, 0);
        try {
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            TextAppMentionType textAppMentionType = null;
            User user = null;
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if (AbstractC111324zv.A00(234).equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        A1P = null;
                    } else {
                        A1P = c16l.A1P();
                    }
                    textAppMentionType = (TextAppMentionType) TextAppMentionType.A01.get(A1P);
                    if (textAppMentionType == null) {
                        textAppMentionType = TextAppMentionType.A05;
                    }
                } else {
                    user = AbstractC31180DnO.A0W(c16l, user, A0s, AbstractC43591JPw.A00(173));
                }
                c16l.A0z();
            }
            return new C38789H6e(textAppMentionType, user);
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
