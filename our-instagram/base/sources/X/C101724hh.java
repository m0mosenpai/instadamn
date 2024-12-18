package X;

import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.4hh, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C101724hh {
    public static final C101724hh A00 = new Object();

    public final C101734hi A00(UserSession userSession, C38321qM c38321qM, InterfaceC60442pS interfaceC60442pS, C75113Zb c75113Zb) {
        C14360o3.A0B(c38321qM, 1);
        C14360o3.A0B(c75113Zb, 2);
        C14360o3.A0B(interfaceC60442pS, 3);
        int A16 = c38321qM.A16(userSession);
        List A3I = c38321qM.A3I();
        if (A3I == null) {
            A3I = C16930sl.A00;
        }
        c75113Zb.A07(A16, -1);
        ArrayList A3I2 = c38321qM.A3I();
        boolean z = false;
        if (A3I2 == null || A3I2.isEmpty() || c75113Zb.A1z || !AbstractC79433gq.A00(userSession).A02(interfaceC60442pS, c38321qM, c38321qM) || C79453gs.A01(userSession, c38321qM, false)) {
            z = true;
        }
        return new C101734hi(c75113Zb, A3I, A16, z);
    }
}
