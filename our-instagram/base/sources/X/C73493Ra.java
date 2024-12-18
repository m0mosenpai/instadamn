package X;

import com.instagram.common.session.UserSession;
import java.util.concurrent.locks.ReentrantLock;

/* renamed from: X.3Ra, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C73493Ra implements InterfaceC73503Rb {
    public final UserSession A00;
    public final InterfaceC09390do A02 = AbstractC09440dt.A01(new C206859Dq(this, 49));
    public final InterfaceC09390do A01 = AbstractC09440dt.A01(new C206859Dq(this, 47));
    public final InterfaceC09390do A03 = AbstractC09440dt.A01(new C206859Dq(this, 48));

    public final void A00() {
        InterfaceC10260gi interfaceC10260gi;
        InterfaceC09390do interfaceC09390do = this.A02;
        if (((C3RT) interfaceC09390do.getValue()).BfO() == C05F.A01 && ((C3RT) interfaceC09390do.getValue()).Bvt() && (interfaceC10260gi = ((C3RT) interfaceC09390do.getValue()).A00) != null && interfaceC10260gi.AhA(36317753830675989L)) {
            C14120nc.A00().ATO(new AbstractRunnableC14200nk() { // from class: X.9iN
                {
                    super(364579106, 3, false, false);
                }

                @Override // java.lang.Runnable
                public final void run() {
                    AH5 ah5 = (AH5) C73493Ra.this.A01.getValue();
                    ReentrantLock reentrantLock = ah5.A02;
                    reentrantLock.lock();
                    try {
                        if (ah5.A00 == null) {
                            ah5.A01();
                        }
                    } finally {
                        reentrantLock.unlock();
                    }
                }
            });
        }
    }

    @Override // X.InterfaceC73503Rb
    public final InterfaceC73913Tc BX9() {
        return (InterfaceC73913Tc) this.A03.getValue();
    }

    public C73493Ra(UserSession userSession) {
        this.A00 = userSession;
    }
}
