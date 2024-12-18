package X;

import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;

/* renamed from: X.Fb9, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C34982Fb9 {
    public static final C34982Fb9 A00 = new Object();

    public final Object A00(C6FQ c6fq, C6FW c6fw) {
        String str;
        String str2;
        Object A01 = c6fw.A01();
        C14360o3.A0C(A01, "null cannot be cast to non-null type kotlin.Number");
        String obj = A01.toString();
        InterfaceC103384lE A0G = AbstractC31175DnJ.A0G(c6fw);
        InterfaceC103384lE A0H = AbstractC31175DnJ.A0H(c6fw);
        C102884kP A0F = AbstractC31175DnJ.A0F(c6fw, 3);
        UserSession A0W = AbstractC31172DnG.A0W(c6fq);
        FragmentActivity A04 = C6BQ.A04(c6fq);
        if (A0F == null || (str = A0F.A0I()) == null) {
            str = "SINGLE_BLOCK";
        }
        if (str.equals("SINGLE_BLOCK")) {
            Integer num = C05F.A00;
            if (A0F == null || (str2 = A0F.A0E()) == null) {
                str2 = "";
            }
            C36762GIl c36762GIl = new C36762GIl(0, c6fq, A0G, A0H);
            User A0k = AbstractC31174DnI.A0k(A0W, obj);
            if (A0k != null) {
                String A002 = AbstractC34332FCa.A00(str2);
                A0k.getUsername();
                AbstractC167007dF.A1K(A04, A0W);
                AbstractC34336FCe.A00(A04, A0W, A0k, c36762GIl, str2, A002, null, 0, false);
                return null;
            }
            C4LM.A02.A02(A0W, new GIO(A04, c36762GIl, num, c6fq, A0H, A0W, str2, 1), obj);
            return null;
        }
        throw AbstractC166987dD.A12(str);
    }
}
