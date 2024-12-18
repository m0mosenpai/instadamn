package X;

import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;

/* renamed from: X.8pZ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C198248pZ {
    public Boolean A00;
    public Boolean A01;
    public Boolean A02;
    public Boolean A03;
    public Boolean A04;
    public Boolean A05;
    public final C1BX A06;
    public final UserSession A07;

    public static final Boolean A00(C198248pZ c198248pZ) {
        Boolean bool = c198248pZ.A05;
        boolean z = false;
        if (bool == null) {
            bool = false;
            c198248pZ.A05 = bool;
        }
        if (bool.booleanValue()) {
            Boolean bool2 = c198248pZ.A03;
            if (bool2 == null) {
                bool2 = false;
                c198248pZ.A03 = bool2;
            }
            if (C14360o3.A0K(Boolean.valueOf(bool2.booleanValue()), true)) {
                z = true;
            }
        }
        return Boolean.valueOf(z);
    }

    public static final boolean A01(C198248pZ c198248pZ) {
        Boolean CTW;
        User A01 = C17060sy.A01.A01(c198248pZ.A07);
        if ((C2E7.A00(A01) || C2E7.A01(A01)) && (CTW = A01.A03.CTW()) != null && CTW.booleanValue()) {
            return true;
        }
        return false;
    }

    public C198248pZ(UserSession userSession) {
        this.A07 = userSession;
        C1BY c1by = C1BX.A03;
        C14360o3.A0B(userSession, 1);
        this.A06 = c1by.A01(new C681034y(userSession, "smb_support_sticker_prefs"));
    }
}
