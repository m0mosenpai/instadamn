package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.Rsc, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public abstract class AbstractC61721Rsc {
    public static final boolean A00(C62416SAq c62416SAq, InterfaceC16820sZ interfaceC16820sZ) {
        C14360o3.A0B(c62416SAq, 0);
        UserSession userSession = c62416SAq.A00;
        String string = AbstractC166987dD.A0x(userSession).getString("autofill_force_bloks_experience", null);
        if (string != null && string.equals("OFF")) {
            return false;
        }
        String string2 = AbstractC166987dD.A0x(userSession).getString("autofill_force_bloks_experience", null);
        if ((string2 == null || !string2.equals("ON")) && !AbstractC166987dD.A1a(interfaceC16820sZ.invoke())) {
            return false;
        }
        return true;
    }
}
