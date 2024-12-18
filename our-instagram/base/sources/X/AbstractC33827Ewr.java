package X;

import androidx.fragment.app.Fragment;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;

/* renamed from: X.Ewr, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC33827Ewr {
    public static Object A00(C6FQ c6fq, C6FW c6fw) {
        UserSession A0W = AbstractC31172DnG.A0W(c6fq);
        Fragment A01 = C6BQ.A01(c6fq);
        C35907FtR c35907FtR = new C35907FtR(A01, c6fq, c6fw, A0W);
        User A0Y = AbstractC166997dE.A0Y(A0W);
        AbstractC10360h2 A05 = C6BQ.A05(c6fq);
        AbstractC25233BEq.A0w(1, A0W, A01, A05);
        C32529EUf c32529EUf = new C32529EUf(A01, A05, c35907FtR, A0W, A0Y, null);
        C3CZ.A0C = AbstractC111324zv.A00(3010);
        EnumC69993Ci enumC69993Ci = C3CZ.A0B;
        String str = A0W.userId;
        C14360o3.A0B(str, 0);
        AbstractC003100w.A0k(10, str);
        AbstractC31719DwO.A00(enumC69993Ci, A0W, AbstractC43591JPw.A00(91), "photo_editing", C3CZ.A0C, null, null);
        C1ON A00 = AbstractC34756FSv.A00(A0W);
        A00.A00 = c32529EUf;
        AbstractC31177DnL.A19(A01, A00);
        return null;
    }
}
