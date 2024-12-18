package X;

import com.instagram.common.session.UserSession;
import java.util.HashSet;

/* renamed from: X.73m, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1570773m implements InterfaceC13000lm {
    public final C18920wW A00;
    public final C1570873n A01;
    public final C6Z0 A02;
    public final HashSet A03;
    public final InterfaceC09390do A04;

    public C1570773m(UserSession userSession) {
        C14360o3.A0B(userSession, 1);
        this.A00 = AbstractC12220kQ.A02(userSession);
        this.A01 = (C1570873n) userSession.A01(C1570873n.class, new C37058GUs(userSession, 39));
        this.A03 = new HashSet();
        this.A04 = AbstractC09440dt.A01(new C206869Dr(this, 4));
        this.A02 = new C6Z0(new C1570973o(this));
    }

    public final void A00() {
        C1570873n c1570873n = this.A01;
        c1570873n.A00();
        long j = c1570873n.A00;
        if (j != 0) {
            c1570873n.A02.flowEndSuccess(j);
            c1570873n.A00 = 0L;
            c1570873n.A04.clear();
        }
        this.A02.A01();
        this.A03.clear();
    }

    @Override // X.InterfaceC13000lm
    public final void onSessionWillEnd() {
        C10190gb A00 = C10190gb.A00();
        Object value = this.A04.getValue();
        if (value != null) {
            A00.A00.remove(value);
        }
        this.A02.A00();
    }
}
