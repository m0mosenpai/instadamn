package X;

import java.util.Calendar;

/* renamed from: X.7Pt, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC162567Pt {
    public static final boolean A00(InterfaceC83433nk interfaceC83433nk, InterfaceC83433nk interfaceC83433nk2, C7P8 c7p8) {
        C14360o3.A0B(c7p8, 2);
        if (!c7p8.Cea()) {
            return false;
        }
        if (interfaceC83433nk2 == null) {
            if (interfaceC83433nk.Cd1()) {
                return false;
            }
        } else {
            long C8i = interfaceC83433nk.C8i();
            long C8i2 = interfaceC83433nk2.C8i();
            Calendar calendar = AbstractC162607Px.A05;
            if (C8i - C8i2 < 3600000000L) {
                Calendar calendar2 = AbstractC162607Px.A05;
                calendar2.setTimeInMillis(C8i / 1000);
                int i = calendar2.get(1);
                int i2 = calendar2.get(6);
                calendar2.setTimeInMillis(C8i2 / 1000);
                int i3 = calendar2.get(1);
                if (i2 == calendar2.get(6) && i == i3) {
                    return false;
                }
            }
        }
        return true;
    }
}
