package X;

import com.facebook.common.time.AwakeTimeSinceBootClock;
import com.facebook.logginginfra.falco.AppScopedIdentity;
import com.facebook.logginginfra.falco.Checksum;
import com.facebook.logginginfra.falco.FacebookIdentity;
import com.facebook.logginginfra.falco.Identity;
import com.facebook.logginginfra.falco.SetQPLConfigDirective;
import java.util.AbstractMap;
import java.util.Random;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: X.0c3, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C08400c3 extends AbstractC208310f implements C0XM {
    public final ExecutorC19230x5 A00;
    public final AtomicReference A01 = new AtomicReference();
    public final InterfaceC08830cm A02;
    public final AwakeTimeSinceBootClock A03;
    public final C109574wj A04;
    public final C0R9 A05;
    public final C12090kD A06;
    public final Random A07;
    public final InterfaceC08830cm A08;
    public final InterfaceC08830cm A09;
    public final InterfaceC08830cm A0A;
    public final InterfaceC08830cm A0B;
    public final InterfaceC08830cm A0C;
    public volatile C10p A0D;
    public volatile C11A A0E;
    public volatile C0f8 A0F;

    public static boolean A01(Identity identity, Identity identity2) {
        FacebookIdentity A04;
        Object A00;
        Object A002;
        if (identity2 == null) {
            return false;
        }
        AppScopedIdentity A03 = identity.A03();
        if (A03 != null) {
            AppScopedIdentity A032 = identity2.A03();
            if (A032 != null) {
                if (!C02O.A00(A03.A00(0), A032.A00(0))) {
                    A00 = identity.A03().A00(2);
                    A002 = identity2.A03().A00(2);
                }
            }
            return false;
        }
        FacebookIdentity A042 = identity.A04();
        if (A042 != null && (A04 = identity2.A04()) != null && C02O.A00(A042.A00(0), A04.A00(0))) {
            A00 = identity.A04().A00(1);
            A002 = identity2.A04().A00(1);
        } else {
            return false;
        }
        return C02O.A00(A00, A002);
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0049, code lost:
    
        if (r1 != 3) goto L21;
     */
    @Override // X.C0XM
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long BqB(int r8) {
        /*
            r7 = this;
            r3 = 3
            r2 = 1
            r0 = 27792138(0x1a8130a, float:6.1740773E-38)
            if (r8 != r0) goto Lc
            long r0 = X.AbstractC06750Xr.A00(r2, r3, r2)
            return r0
        Lc:
            java.util.concurrent.atomic.AtomicReference r6 = r7.A01
            java.lang.Object r0 = r6.get()
            X.0ZL r0 = (X.C0ZL) r0
            if (r0 == 0) goto L52
            X.0ZI r0 = r0.A04
            X.0aR r0 = r0.A00
            r5 = 0
            r1 = -1
            int r0 = r0.get(r8, r1)
            if (r0 == r1) goto L23
            r5 = r0
        L23:
            r4 = 6
            java.lang.Object r0 = r6.get()
            X.0ZL r0 = (X.C0ZL) r0
            if (r0 == 0) goto L4b
            X.0ZI r0 = r0.A04
            X.0aT r0 = r0.A01
            java.lang.Object r1 = r0.get(r8)
            com.facebook.hyperthrift.HyperThriftBase r1 = (com.facebook.hyperthrift.HyperThriftBase) r1
            if (r1 == 0) goto L4b
            r0 = 0
            java.lang.Object r0 = r1.A00(r0)
            java.lang.Number r0 = (java.lang.Number) r0
            if (r0 == 0) goto L4b
            int r1 = r0.intValue()
            r0 = 2
            if (r1 == r0) goto L50
            r0 = 3
            if (r1 == r3) goto L50
        L4b:
            long r0 = X.AbstractC06750Xr.A00(r5, r4, r2)
            return r0
        L50:
            r2 = r0
            goto L4b
        L52:
            X.10p r0 = r7.A0D
            if (r0 != 0) goto L60
            X.0cm r0 = r7.A0A
            java.lang.Object r0 = r0.get()
            X.10p r0 = (X.C10p) r0
            r7.A0D = r0
        L60:
            X.10p r0 = r7.A0D
            if (r0 == 0) goto L6f
            X.10p r0 = r7.A0D
            int r0 = r0.A00(r8)
            long r0 = X.AbstractC06750Xr.A00(r0, r3, r2)
            return r0
        L6f:
            r1 = -1
            r0 = 5
            long r0 = X.AbstractC06750Xr.A00(r1, r0, r2)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C08400c3.BqB(int):long");
    }

    private Checksum A00(Identity identity) {
        try {
            AtomicReference atomicReference = this.A01;
            return C0ZL.A00(this.A04, identity, (C0eL) this.A02.get(), this.A05, atomicReference);
        } catch (Exception e) {
            C0Gd c0Gd = (C0Gd) this.A08.get();
            if (c0Gd != null) {
                c0Gd.EmP("QPLConfig", "Failed to load config", e);
                return null;
            }
            return null;
        }
    }

    public final Checksum A02() {
        C0ZL c0zl = (C0ZL) this.A01.get();
        if (c0zl == null) {
            return null;
        }
        return c0zl.A00;
    }

    public final Checksum A03(Identity identity) {
        C0ZL c0zl = (C0ZL) this.A01.get();
        if (c0zl != null && A01(identity, c0zl.A01)) {
            return c0zl.A00;
        }
        return A00(identity);
    }

    public final /* synthetic */ void A04() {
        AwakeTimeSinceBootClock awakeTimeSinceBootClock = this.A03;
        awakeTimeSinceBootClock.nowNanos();
        try {
            AtomicReference atomicReference = this.A01;
            C0eL c0eL = (C0eL) this.A02.get();
            C0ZL A01 = C0ZL.A01(this.A04, this.A06.A00(), c0eL, this.A05, atomicReference);
            if (A01 != null) {
                C0DN.A00(null, A01, atomicReference);
                A01.A04.A00.size();
                InterfaceC07530aS interfaceC07530aS = A01.A03.A00;
                if (interfaceC07530aS != null) {
                    interfaceC07530aS.size();
                }
            }
        } catch (Exception e) {
            C0Gd c0Gd = (C0Gd) this.A08.get();
            if (c0Gd != null) {
                c0Gd.EmP("QPLConfig", "Failed to load config", e);
            }
        }
        awakeTimeSinceBootClock.nowNanos();
    }

    public final void A05(SetQPLConfigDirective setQPLConfigDirective, C0ZL c0zl) {
        if (A01(this.A06.A00(), c0zl.A01)) {
            this.A01.set(c0zl);
        }
        AwakeTimeSinceBootClock awakeTimeSinceBootClock = this.A03;
        awakeTimeSinceBootClock.nowNanos();
        C0ZL.A04(this.A04, setQPLConfigDirective, (C0eL) this.A02.get(), c0zl);
        awakeTimeSinceBootClock.nowNanos();
    }

    @Override // X.AbstractC208310f, X.C0XM
    public final C0XN AsU() {
        C0ZL c0zl = (C0ZL) this.A01.get();
        if (c0zl != null) {
            return c0zl.A06;
        }
        return C208010c.A00;
    }

    @Override // X.AbstractC208310f, X.C0XM
    public final boolean CY1(int i) {
        C0ZL c0zl = (C0ZL) this.A01.get();
        if (c0zl == null) {
            return false;
        }
        C0ZI c0zi = c0zl.A04;
        this.A0C.get();
        if (c0zi.A00.indexOfKey(i) >= 0 && !c0zl.A02.A00(i)) {
            return false;
        }
        return true;
    }

    @Override // X.C0XM
    public final int E7i(int i) {
        Random random = this.A07;
        if (i > 0) {
            if (i == 1) {
                return 1;
            }
            if (random.nextInt(i) == 0) {
                return i;
            }
            return Integer.MAX_VALUE;
        }
        return Integer.MAX_VALUE;
    }

    @Override // X.AbstractC208310f, X.C0XM
    public final int EKK(int i, String str) {
        AbstractMap abstractMap;
        Number number;
        C0ZL c0zl = (C0ZL) this.A01.get();
        if (c0zl != null && (abstractMap = (AbstractMap) c0zl.A05.A00.get(i)) != null && (number = (Number) abstractMap.get(str)) != null) {
            return number.intValue();
        }
        return i;
    }

    public C08400c3(AwakeTimeSinceBootClock awakeTimeSinceBootClock, C109574wj c109574wj, C0R9 c0r9, ExecutorC19230x5 executorC19230x5, C12090kD c12090kD, Random random, InterfaceC08830cm interfaceC08830cm, InterfaceC08830cm interfaceC08830cm2, InterfaceC08830cm interfaceC08830cm3, InterfaceC08830cm interfaceC08830cm4, InterfaceC08830cm interfaceC08830cm5, InterfaceC08830cm interfaceC08830cm6) {
        this.A00 = executorC19230x5;
        this.A02 = interfaceC08830cm;
        this.A09 = interfaceC08830cm2;
        this.A0B = interfaceC08830cm3;
        this.A0A = interfaceC08830cm4;
        this.A08 = interfaceC08830cm5;
        this.A0C = interfaceC08830cm6;
        this.A06 = c12090kD;
        this.A05 = c0r9;
        this.A07 = random;
        this.A03 = awakeTimeSinceBootClock;
        this.A04 = c109574wj;
        executorC19230x5.execute(new C0ZM(this));
    }

    @Override // X.C0XM
    public final long BTS(int i) {
        int indexOfKey;
        if (i == 36322981) {
            return -1L;
        }
        C0ZL c0zl = (C0ZL) this.A01.get();
        if (this.A0F == null) {
            this.A0F = (C0f8) this.A0B.get();
        }
        if (c0zl != null) {
            InterfaceC07530aS interfaceC07530aS = c0zl.A03.A00;
            if (interfaceC07530aS != null && (indexOfKey = interfaceC07530aS.indexOfKey(i)) >= 0) {
                return interfaceC07530aS.valueAt(indexOfKey);
            }
            return 0L;
        }
        if (this.A0E == null) {
            this.A0E = (C11A) this.A09.get();
        }
        return this.A0E.A01(i);
    }
}
