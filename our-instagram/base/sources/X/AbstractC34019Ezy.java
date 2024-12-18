package X;

import android.content.Context;
import androidx.fragment.app.Fragment;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;

/* renamed from: X.Ezy, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC34019Ezy {
    public static Object A00(C6FQ c6fq, C6FW c6fw) {
        InterfaceC103384lE interfaceC103384lE;
        C35906FtQ c35906FtQ;
        Object obj = c6fw.A00.get(0);
        if (obj instanceof C1344465q) {
            interfaceC103384lE = ((C1344465q) obj).A00;
        } else {
            interfaceC103384lE = null;
        }
        UserSession A0K = AbstractC31179DnN.A0K(c6fq);
        if (interfaceC103384lE != null) {
            c35906FtQ = new C35906FtQ(c6fq, interfaceC103384lE, A0K);
        } else {
            c35906FtQ = null;
        }
        boolean z = C3CZ.A0G;
        Fragment A01 = C6BQ.A01(c6fq);
        AbstractC10360h2 A05 = C6BQ.A05(c6fq);
        User A10 = AbstractC166987dD.A10(A0K);
        Integer num = C05F.A0w;
        AbstractC167027dH.A13(A0K, A01, A05);
        C3CZ c3cz = new C3CZ(A01, A05, c35906FtQ, A0K, A10, num, null);
        C6BQ.A0K(c6fq, new EVL(2, c3cz, c6fq));
        Context context = C6BQ.A01(c6fq).getContext();
        if (context != null) {
            C3CZ.A00(context, c3cz, false);
        }
        return null;
    }
}
