package X;

import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;

/* loaded from: classes6.dex */
public final class GDB implements GYB {
    public final FragmentActivity A00;
    public final UserSession A01;

    @Override // X.GYB
    public final void CJ8(android.net.Uri uri, Bundle bundle) {
        C14360o3.A0B(uri, 0);
        EnumC55212gM enumC55212gM = EnumC55212gM.A11;
        String obj = uri.toString();
        UserSession userSession = this.A01;
        if (enumC55212gM.A00(userSession, obj)) {
            C32272EJh c32272EJh = new C32272EJh();
            Bundle A0b = AbstractC166987dD.A0b();
            AbstractC31173DnH.A1A(uri, A0b, "trigger");
            AbstractC31173DnH.A1A(uri, A0b, "event");
            c32272EJh.setArguments(A0b);
            AbstractC31177DnL.A16(c32272EJh, this.A00, userSession);
        }
    }

    public GDB(FragmentActivity fragmentActivity, UserSession userSession) {
        this.A00 = fragmentActivity;
        this.A01 = userSession;
    }
}
