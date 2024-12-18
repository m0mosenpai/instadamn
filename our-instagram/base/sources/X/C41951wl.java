package X;

import com.facebook.proxygen.LigerSamplePolicy;
import com.instagram.common.session.UserSession;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;

/* renamed from: X.1wl, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C41951wl {
    public InterfaceC09390do A00;
    public final C42311xL A01;
    public final C41981wo A02;

    public static C41951wl A00(final UserSession userSession) {
        C17050sx A01 = AbstractC09440dt.A01(new InterfaceC16820sZ() { // from class: X.1wn
            @Override // X.InterfaceC16820sZ
            public final Object invoke() {
                UserSession userSession2 = UserSession.this;
                C14360o3.A0B(userSession2, 0);
                return AbstractC142856cl.A00(((C4HD) userSession2.A01(C4HC.class, C4HE.A00)).A02());
            }
        });
        return new C41951wl(AbstractC42291xJ.A00(userSession), C41981wo.A00(userSession), A01);
    }

    public final C42221xC A01() {
        C42201xA c42201xA = this.A02.A03;
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        InterfaceC09390do interfaceC09390do = this.A00;
        return c42201xA.A0Q((C5Fn) interfaceC09390do.getValue(), timeUnit, LigerSamplePolicy.CERT_DATA_SAMPLE_WEIGHT).A0O((C5Fn) interfaceC09390do.getValue());
    }

    public final C42321xM A02(String str) {
        C41981wo c41981wo = this.A02;
        Lock lock = c41981wo.A04;
        lock.lock();
        try {
            return (C42321xM) c41981wo.A00.get(str);
        } finally {
            lock.unlock();
        }
    }

    public C41951wl(C42311xL c42311xL, C41981wo c41981wo, InterfaceC09390do interfaceC09390do) {
        this.A02 = c41981wo;
        this.A01 = c42311xL;
        this.A00 = interfaceC09390do;
    }
}
