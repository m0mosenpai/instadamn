package X;

import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;

/* loaded from: classes9.dex */
public final class ODB {
    public final UserSession A00;
    public final OWa A01;
    public final InterfaceC57834Pl0 A02;
    public final String A03;
    public final C56320Ozh A04;

    public ODB(FragmentActivity fragmentActivity, UserSession userSession, InterfaceC57834Pl0 interfaceC57834Pl0, String str, boolean z) {
        C14360o3.A0B(userSession, 2);
        this.A00 = userSession;
        this.A03 = str;
        this.A02 = interfaceC57834Pl0;
        C56320Ozh c56320Ozh = new C56320Ozh(this, 0);
        this.A04 = c56320Ozh;
        this.A01 = new OWa(fragmentActivity, userSession, c56320Ozh, str, null, false, true, false, z);
    }
}
