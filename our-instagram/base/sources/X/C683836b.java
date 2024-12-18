package X;

import com.instagram.common.session.UserSession;
import java.util.concurrent.TimeUnit;

/* renamed from: X.36b, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C683836b implements C33C {
    public boolean A00;
    public final UserSession A01;
    public final C23031Ai A02;

    @Override // X.C33C
    public final boolean Elq() {
        return false;
    }

    @Override // X.C33C
    public final boolean Elr() {
        return false;
    }

    @Override // X.C33C
    public final void Dtr() {
        InterfaceC19630xq interfaceC19630xq = this.A02.A01;
        int i = interfaceC19630xq.getInt("topics_nux_count", 0);
        InterfaceC19610xo ARD = interfaceC19630xq.ARD();
        ARD.E7D("topics_nux_count", i + 1);
        ARD.apply();
        InterfaceC19610xo ARD2 = interfaceC19630xq.ARD();
        ARD2.E7G("topics_nux_seen_timestamp", System.currentTimeMillis());
        ARD2.apply();
        this.A00 = true;
    }

    @Override // X.C33C
    public final boolean Ejn() {
        if (!this.A00) {
            InterfaceC19630xq interfaceC19630xq = this.A02.A01;
            int i = interfaceC19630xq.getInt("topics_nux_count", 0);
            long currentTimeMillis = System.currentTimeMillis() - interfaceC19630xq.getLong("topics_nux_seen_timestamp", 0L);
            if (i < 3) {
                if (i == 0 || currentTimeMillis > TimeUnit.DAYS.toMillis(1L)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return false;
    }

    public C683836b(UserSession userSession) {
        this.A01 = userSession;
        this.A02 = AbstractC23021Ah.A00(userSession);
    }
}
