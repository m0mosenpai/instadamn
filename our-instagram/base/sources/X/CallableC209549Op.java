package X;

import android.hardware.Camera;
import java.util.concurrent.Callable;
import java.util.concurrent.locks.ReentrantLock;

/* renamed from: X.9Op, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class CallableC209549Op implements Callable {
    public final int A00;
    public final Object A01;

    public CallableC209549Op(C208789Lm c208789Lm, int i) {
        this.A00 = i;
        this.A01 = c208789Lm;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        String str;
        boolean A1b;
        switch (this.A00) {
            case 0:
                C208789Lm c208789Lm = (C208789Lm) this.A01;
                AbstractC175037qd.A00(15, c208789Lm.A00, null);
                try {
                    c208789Lm.A0F("Cannot switch cameras.");
                    boolean A1N = AbstractC167007dF.A1N(c208789Lm.A00);
                    if (!c208789Lm.A0H.A08(A1N ? 1 : 0)) {
                        if (A1N) {
                            str = "FRONT";
                        } else {
                            str = "BACK";
                        }
                        throw new UnsupportedOperationException(AnonymousClass001.A0g("Cannot switch to ", str, ", camera is not present"));
                    }
                    C208789Lm.A08(c208789Lm, A1N ? 1 : 0);
                    InterfaceC174657pz interfaceC174657pz = c208789Lm.A06;
                    interfaceC174657pz.getClass();
                    C176577tF c176577tF = c208789Lm.A07;
                    c176577tF.getClass();
                    C177447ue A02 = C208789Lm.A02(c208789Lm, interfaceC174657pz, c176577tF, c208789Lm.A01);
                    AbstractC175037qd.A00(17, A1N ? 1 : 0, null);
                    return A02;
                } catch (Exception e) {
                    AbstractC175037qd.A00(16, c208789Lm.A00, e);
                    throw e;
                }
            case 1:
                C208789Lm c208789Lm2 = (C208789Lm) this.A01;
                if (!c208789Lm2.isConnected()) {
                    return null;
                }
                c208789Lm2.A0J.A00(c208789Lm2.A0Z);
                return null;
            case 2:
                C208789Lm c208789Lm3 = (C208789Lm) this.A01;
                c208789Lm3.A0F("Cannot set focus mode for video");
                c208789Lm3.A0I.A02();
                return null;
            case 3:
                C208789Lm c208789Lm4 = (C208789Lm) this.A01;
                if (c208789Lm4.isConnected()) {
                    C72096XNq c72096XNq = c208789Lm4.A0K;
                    synchronized (c72096XNq) {
                        A1b = AbstractC166987dD.A1b(c72096XNq.A03.A00);
                    }
                    if (!A1b) {
                        Camera camera = c208789Lm4.A0Z;
                        camera.getClass();
                        c72096XNq.A01(camera);
                        synchronized (c72096XNq) {
                            c72096XNq.A04.clear();
                        }
                    }
                }
                return null;
            case 4:
                C208789Lm c208789Lm5 = (C208789Lm) this.A01;
                if (!c208789Lm5.isConnected()) {
                    return null;
                }
                c208789Lm5.A0J.A01(true, c208789Lm5.A0Z);
                return null;
            case 5:
                C208789Lm c208789Lm6 = (C208789Lm) this.A01;
                if (c208789Lm6.isConnected() && !c208789Lm6.A0d) {
                    c208789Lm6.A0I.A01();
                }
                return null;
            case 6:
                C208789Lm c208789Lm7 = (C208789Lm) this.A01;
                if (!c208789Lm7.isConnected()) {
                    return null;
                }
                C208979Mf c208979Mf = c208789Lm7.A0J;
                C208969Me c208969Me = c208979Mf.A00;
                if ((c208969Me.A00 & 4) == 4) {
                    return null;
                }
                ReentrantLock reentrantLock = c208969Me.A01;
                reentrantLock.lock();
                try {
                    boolean A00 = c208969Me.A00();
                    reentrantLock.lock();
                    if (!c208969Me.A01()) {
                        reentrantLock.lock();
                        try {
                            boolean A1P = AbstractC167007dF.A1P(c208969Me.A00 & 4, 4);
                            reentrantLock.unlock();
                            if (!A1P) {
                                c208969Me.A00 = (c208969Me.A00 | 4) & (-2);
                            }
                        } finally {
                        }
                    }
                    reentrantLock.unlock();
                    if (A00) {
                        AbstractC175037qd.A00(18, 0, null);
                        if (c208979Mf.A03 != null) {
                            c208979Mf.A03.A00();
                        }
                        C1814082s c1814082s = c208979Mf.A01;
                        if (!c1814082s.A00.isEmpty()) {
                            C176567tE.A00(new C9OM(c208979Mf, c1814082s.A00));
                        }
                    }
                    return null;
                } catch (Throwable th) {
                    throw th;
                } finally {
                }
            case 7:
                C208789Lm c208789Lm8 = (C208789Lm) this.A01;
                if (c208789Lm8.isConnected()) {
                    AbstractC176797tb A022 = c208789Lm8.A0N.A02(c208789Lm8.A00);
                    c208789Lm8.A0K.A02(c208789Lm8.A0Z, (C176877tj) A022.A02(AbstractC176797tb.A0q), AbstractC167017dG.A0H(AbstractC176797tb.A0m, A022));
                }
                return null;
            case 8:
                return Integer.valueOf(((C9M1) this.A01).A04());
            case 9:
                C9M1.A01();
                return null;
            default:
                C209039Ml c209039Ml = (C209039Ml) this.A01;
                c209039Ml.A00(c209039Ml.A02);
                return null;
        }
    }

    public CallableC209549Op(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }
}
