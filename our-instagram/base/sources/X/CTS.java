package X;

import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;

/* loaded from: classes5.dex */
public final class CTS {
    public final C26867BtT A00(FragmentActivity fragmentActivity, EnumC25577BSp enumC25577BSp, UserSession userSession, InterfaceC30992Djr interfaceC30992Djr, String str, String str2, String str3, boolean z, boolean z2) {
        AbstractC25233BEq.A0w(1, userSession, str, str2);
        C3DN A00 = C3DN.A00.A00(fragmentActivity);
        Bundle A0b = AbstractC166987dD.A0b();
        A0b.putString("media_id", str);
        A0b.putString("container_module", str2);
        A0b.putBoolean("disable_secondary_button", z);
        A0b.putSerializable("event_source", enumC25577BSp);
        if (str3 != null) {
            A0b.putString("mimicry_entry_point", str3);
        }
        C26867BtT c26867BtT = new C26867BtT();
        c26867BtT.A00 = interfaceC30992Djr;
        c26867BtT.setArguments(A0b);
        C189478aR A002 = F86.A00(A00);
        if (A002 != null && A002.A03.getViewLifecycleOwner().getLifecycle().A07().A00(C07S.CREATED)) {
            C189448aO A0y = AbstractC25225BEi.A0y(userSession);
            A0y.A1O = z2;
            A0y.A0T = c26867BtT;
            A002.A0G(c26867BtT, A0y, false, false);
        } else {
            C189448aO A0y2 = AbstractC25225BEi.A0y(userSession);
            A0y2.A1O = z2;
            AbstractC25225BEi.A1Q(A0y2, true);
            A0y2.A03 = 1.0f;
            A0y2.A0T = c26867BtT;
            if (A0y2.A00().A02(fragmentActivity, c26867BtT) == null) {
                AbstractC166987dD.A1T(C18950wb.A01, "NUX Bottom Sheet failed to open", 817892647);
                interfaceC30992Djr.Dap();
                return c26867BtT;
            }
        }
        return c26867BtT;
    }
}
