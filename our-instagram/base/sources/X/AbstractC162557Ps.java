package X;

import com.instagram.direct.model.messaginguser.MessagingUser;
import java.util.concurrent.TimeUnit;

/* renamed from: X.7Ps, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC162557Ps {
    public static final int A00(MessagingUser messagingUser, InterfaceC83433nk interfaceC83433nk, InterfaceC83433nk interfaceC83433nk2, C7P8 c7p8, boolean z, boolean z2) {
        C14360o3.A0B(c7p8, 4);
        if (!z2) {
            return 8;
        }
        if (c7p8.CQP() && !messagingUser.A03(interfaceC83433nk.BtE())) {
            if (c7p8.ABK() || interfaceC83433nk2 == null) {
                return 0;
            }
            if ((c7p8.Cea() && !AbstractC162587Pv.A00(interfaceC83433nk2.C8i(), interfaceC83433nk.C8i())) || interfaceC83433nk2.CBg() == C2EY.A0G || !AbstractC162597Pw.A00(interfaceC83433nk, interfaceC83433nk2) || z) {
                return 0;
            }
            return 4;
        }
        return 4;
    }

    public static final int A01(MessagingUser messagingUser, InterfaceC83433nk interfaceC83433nk, C7P8 c7p8, String str, boolean z, boolean z2) {
        C14360o3.A0B(c7p8, 3);
        if (!z2) {
            return 8;
        }
        boolean z3 = !AbstractC162587Pv.A00(interfaceC83433nk.C8i(), TimeUnit.MILLISECONDS.toMicros(System.currentTimeMillis()));
        if (c7p8.CQP() && !messagingUser.A03(interfaceC83433nk.BtE())) {
            if (c7p8.ABK() || z || z3 || !str.equals(interfaceC83433nk.BtE())) {
                return 0;
            }
            return 4;
        }
        return 4;
    }
}
