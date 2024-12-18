package X;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.locks.ReentrantLock;

/* renamed from: X.6qU, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C150736qU {
    public final C150726qT A00;
    public final List A01;
    public final ScheduledExecutorService A02;
    public final ReentrantLock A03;
    public volatile EnumC150766qZ A04 = null;
    public volatile boolean A05;

    public final synchronized void A01(final EnumC150766qZ enumC150766qZ) {
        if (this.A04 != enumC150766qZ) {
            this.A04 = enumC150766qZ;
            for (final InterfaceC58362lv interfaceC58362lv : this.A01) {
                this.A02.execute(new Runnable() { // from class: X.6Ql
                    @Override // java.lang.Runnable
                    public final void run() {
                        InterfaceC58362lv.this.onChanged(enumC150766qZ);
                    }
                });
            }
        }
    }

    public final void A00() {
        ReentrantLock reentrantLock = this.A03;
        reentrantLock.lock();
        try {
            if (this.A04 == null && !this.A05) {
                this.A05 = true;
                C150726qT c150726qT = this.A00;
                final C150776qa c150776qa = new C150776qa(this);
                try {
                    C1Dk A00 = ((C150796qc) C150786qb.class.getMethod("create", new Class[0]).invoke(null, new Object[0])).A00();
                    C14360o3.A07(A00);
                    c150726qT.A00.ATV(new InterfaceC48212Jk() { // from class: X.6qf
                        @Override // X.InterfaceC48212Jk
                        public final void invoke(Throwable th) {
                            C150776qa c150776qa2 = C150776qa.this;
                            C14360o3.A0A(th);
                            C14360o3.A0B(th, 0);
                            C150736qU c150736qU = c150776qa2.A00;
                            th.getMessage();
                            c150736qU.A05 = false;
                        }
                    }, new InterfaceC48192Ji() { // from class: X.6qe
                        @Override // X.InterfaceC48192Ji
                        public final void invoke(AnonymousClass436 anonymousClass436) {
                            C2JS c2js;
                            C2JS optionalTreeField;
                            EnumC150766qZ enumC150766qZ;
                            if (anonymousClass436 != null && (c2js = (C2JS) anonymousClass436.Bos()) != null && (optionalTreeField = c2js.getOptionalTreeField(0, "viewer", C138796Qk.class, 1410799676)) != null && (enumC150766qZ = (EnumC150766qZ) optionalTreeField.getOptionalEnumField(0, "flm_ar_effect_consent_state", EnumC150766qZ.UNSET_OR_UNRECOGNIZED_ENUM_VALUE)) != null) {
                                C150736qU c150736qU = C150776qa.this.A00;
                                c150736qU.A01(enumC150766qZ);
                                c150736qU.A05 = false;
                            } else {
                                C150776qa c150776qa2 = C150776qa.this;
                                IllegalStateException illegalStateException = new IllegalStateException("Failed to receive user consent state from graphql");
                                C150736qU c150736qU2 = c150776qa2.A00;
                                illegalStateException.getMessage();
                                c150736qU2.A05 = false;
                            }
                        }
                    }, A00);
                } catch (ClassNotFoundException | IllegalAccessException | NoSuchMethodException | InvocationTargetException e) {
                    throw new RuntimeException(e);
                }
            }
        } finally {
            reentrantLock.unlock();
        }
    }

    public C150736qU(C150726qT c150726qT, ScheduledExecutorService scheduledExecutorService) {
        this.A00 = c150726qT;
        this.A02 = scheduledExecutorService;
        List synchronizedList = Collections.synchronizedList(new ArrayList());
        C14360o3.A07(synchronizedList);
        this.A01 = synchronizedList;
        this.A03 = new ReentrantLock();
    }
}
