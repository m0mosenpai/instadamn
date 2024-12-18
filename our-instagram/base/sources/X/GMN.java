package X;

import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;

/* loaded from: classes6.dex */
public final class GMN implements Runnable {
    public final /* synthetic */ C36658GEe A00;

    public GMN(C36658GEe c36658GEe) {
        this.A00 = c36658GEe;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Bundle A0b = AbstractC166987dD.A0b();
        AbstractC34231F8d.A00(A0b, EnumC33365Eoy.A04);
        C36658GEe c36658GEe = this.A00;
        FragmentActivity fragmentActivity = c36658GEe.A00;
        UserSession userSession = c36658GEe.A01;
        C140966Yy A0r = AbstractC25225BEi.A0r(fragmentActivity, userSession);
        A0r.A0B(A0b, AbstractC31175DnJ.A0R().A01(userSession));
        A0r.A04();
    }
}
