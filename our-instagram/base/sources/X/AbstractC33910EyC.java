package X;

import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.user.model.User;

/* renamed from: X.EyC, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC33910EyC {
    public static final Object A00(C6FQ c6fq, C6FW c6fw) {
        Object A03 = c6fw.A03(0);
        AbstractC25225BEi.A1S(A03);
        String str = (String) A03;
        UserSession A0W = AbstractC31172DnG.A0W(c6fq);
        User A0k = AbstractC31174DnI.A0k(A0W, str);
        if (A0k != null) {
            ImageUrl Bhu = A0k.Bhu();
            String B8y = A0k.B8y();
            if (31 < B8y.length()) {
                B8y = AnonymousClass001.A0C(C00Q.A03(B8y, 30), (char) 8230);
            }
            C14360o3.A0B(A0W, 0);
            AbstractC167007dF.A1E(str, 1, B8y);
            Bundle A0b = AbstractC166987dD.A0b();
            C32254EIo c32254EIo = new C32254EIo();
            AbstractC31173DnH.A1C(A0b, A0W);
            A0b.putString("USER_ID_ARGUMENT", str);
            A0b.putParcelable(AbstractC111324zv.A00(1711), Bhu);
            A0b.putString("DISPLAY_NAME_ARGUMENT", B8y);
            A0b.putString("ENTRY_POINT", "story");
            C189448aO A0W2 = AbstractC31174DnI.A0W(A0b, c32254EIo, A0W);
            A0W2.A0U = new C36720GGp(0);
            C189478aR A00 = A0W2.A00();
            FragmentActivity A04 = C6BQ.A04(c6fq);
            AbstractC31171DnF.A1O(A04);
            A00.A02(A04, c32254EIo);
            return null;
        }
        return null;
    }
}
