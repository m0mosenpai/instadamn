package X;

import android.app.Activity;
import android.os.Bundle;
import com.instagram.common.session.UserSession;
import com.instagram.modal.ModalActivity;

/* loaded from: classes5.dex */
public abstract class CXN {
    public static final String A00(C26069Bfx c26069Bfx, UserSession userSession) {
        if (AbstractC72723Nt.A00(AbstractC25225BEi.A0F(userSession))) {
            if (c26069Bfx == null) {
                return null;
            }
            return c26069Bfx.A01;
        }
        if (c26069Bfx == null) {
            return null;
        }
        return c26069Bfx.A03;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [android.os.Parcelable, java.lang.Object] */
    public static final void A01(Activity activity, UserSession userSession, String str, boolean z) {
        boolean A1Y = AbstractC25229BEm.A1Y(userSession);
        Bundle A0b = AbstractC166987dD.A0b();
        A0b.putParcelable(AbstractC43591JPw.A00(16), new Object());
        A0b.putString(AbstractC43591JPw.A00(110), "ugc");
        A0b.putInt(AbstractC43591JPw.A00(62), A1Y ? 1 : 0);
        A0b.putBoolean("is_ai_theme_set", z);
        A0b.putString("arg_entry_point", str);
        if (z) {
            C189448aO A0y = AbstractC25225BEi.A0y(userSession);
            AbstractC25226BEj.A1M(activity, A0y, 2131952731);
            C189478aR A00 = A0y.A00();
            C26849BtB c26849BtB = new C26849BtB();
            c26849BtB.setArguments(A0b);
            A00.A02(activity, c26849BtB);
            return;
        }
        C6XJ A03 = C6XJ.A03(activity, A0b, userSession, ModalActivity.class, "ai_themes");
        A03.A07();
        A03.A0A(activity, 100);
    }
}
