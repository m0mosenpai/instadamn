package X;

import com.instagram.common.session.UserSession;
import java.util.Iterator;

/* renamed from: X.94T, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C94T implements C94A {
    public final InterfaceC09390do A01;
    public final InterfaceC09390do A02;
    public final InterfaceC09390do A03;
    public final InterfaceC09390do A04;
    public final InterfaceC09390do A07;
    public final InterfaceC09390do A00 = AbstractC09440dt.A01(C94U.A00);
    public final InterfaceC09390do A06 = AbstractC09440dt.A01(new C206919Dw(this, 23));
    public final InterfaceC09390do A05 = AbstractC09440dt.A01(new C206919Dw(this, 22));

    @Override // X.C94A
    public final void COI() {
        this.A04.getValue();
        C0K8.A02(C94T.class, "prediction disabled");
        cleanup();
    }

    @Override // X.C94A
    public final void cleanup() {
        InterfaceC09390do interfaceC09390do = this.A07;
        Iterator it = ((C4QF) interfaceC09390do.getValue()).A02().iterator();
        while (it.hasNext()) {
            ((C4QF) interfaceC09390do.getValue()).A03((String) it.next());
        }
    }

    public C94T(UserSession userSession) {
        this.A04 = AbstractC09440dt.A01(new C206919Dw(userSession, 21));
        this.A07 = AbstractC09440dt.A01(new C206919Dw(userSession, 24));
        this.A03 = AbstractC09440dt.A01(new C9F9(40, userSession, this));
        this.A02 = AbstractC09440dt.A01(new C9F9(39, userSession, this));
        this.A01 = AbstractC09440dt.A01(new C9F9(38, userSession, this));
    }
}
