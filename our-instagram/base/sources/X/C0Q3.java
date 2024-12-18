package X;

import com.facebook.common.time.AwakeTimeSinceBootClock;
import java.util.AbstractMap;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Random;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: X.0Q3, reason: invalid class name */
/* loaded from: classes.dex */
public final class C0Q3 extends AbstractC208310f implements C0XM, InterfaceC07320a6 {
    public final AwakeTimeSinceBootClock A00;
    public final C0R9 A01;
    public final ExecutorC19230x5 A02;
    public final C12080kC A03;
    public final Random A04;
    public final AtomicReference A05;
    public final InterfaceC08830cm A06;
    public final InterfaceC08830cm A07;
    public final InterfaceC08830cm A08;
    public final InterfaceC08830cm A09;
    public final InterfaceC08830cm A0A;
    public final C12080kC A0B;
    public final HashMap A0C;
    public final HashMap A0D;
    public volatile C10p A0E;
    public volatile C11A A0F;
    public volatile C0f8 A0G;

    public C0Q3(AwakeTimeSinceBootClock awakeTimeSinceBootClock, C0R9 c0r9, ExecutorC19230x5 executorC19230x5, C12080kC c12080kC, Random random, InterfaceC08830cm interfaceC08830cm, InterfaceC08830cm interfaceC08830cm2, InterfaceC08830cm interfaceC08830cm3, InterfaceC08830cm interfaceC08830cm4, InterfaceC08830cm interfaceC08830cm5) {
        C14360o3.A0B(interfaceC08830cm2, 3);
        C14360o3.A0B(interfaceC08830cm3, 4);
        C14360o3.A0B(interfaceC08830cm4, 5);
        this.A05 = new AtomicReference();
        this.A02 = executorC19230x5;
        this.A06 = interfaceC08830cm;
        this.A08 = interfaceC08830cm2;
        this.A0A = interfaceC08830cm3;
        this.A09 = interfaceC08830cm4;
        this.A07 = interfaceC08830cm5;
        this.A03 = c12080kC;
        this.A01 = c0r9;
        this.A04 = random;
        this.A00 = awakeTimeSinceBootClock;
        executorC19230x5.execute(new C0ZA(this));
        this.A0B = c12080kC;
        this.A0D = new HashMap();
        this.A0C = new HashMap();
    }

    @Override // X.InterfaceC07320a6
    public final synchronized void AHr(int i) {
        this.A0C.remove(Integer.valueOf(i));
    }

    @Override // X.InterfaceC07320a6
    public final synchronized void AHu(int i) {
        this.A0D.remove(Integer.valueOf(i));
    }

    @Override // X.C0XM
    public final long BqB(int i) {
        InterfaceC07520aR interfaceC07520aR;
        int i2;
        InterfaceC07520aR interfaceC07520aR2;
        synchronized (this) {
            Integer num = (Integer) this.A0C.get(Integer.valueOf(i));
            if (num == null) {
                short s = (short) (i >> 16);
                num = (Integer) this.A0D.get(Integer.valueOf(s));
                if (num == null) {
                    if (i == 27792138) {
                        return AbstractC06750Xr.A00(1, 3, 1);
                    }
                    AtomicReference atomicReference = this.A05;
                    C0Z9 c0z9 = (C0Z9) atomicReference.get();
                    if (c0z9 == null) {
                        if (this.A0E == null) {
                            this.A0E = (C10p) this.A09.get();
                            if (this.A0E == null) {
                                return AbstractC06750Xr.A00(-1, 5, 1);
                            }
                        }
                        return AbstractC06750Xr.A00(this.A0E.A00(i), 3, 1);
                    }
                    C0Z6 c0z6 = c0z9.A02;
                    InterfaceC07520aR interfaceC07520aR3 = c0z6.A02;
                    if ((interfaceC07520aR3 == null || (i2 = interfaceC07520aR3.get(i, -1)) == -1) && ((interfaceC07520aR = c0z6.A03) == null || (i2 = interfaceC07520aR.get(s, -1)) == -1)) {
                        i2 = c0z6.A00;
                    }
                    int i3 = 1;
                    C0Z9 c0z92 = (C0Z9) atomicReference.get();
                    if (c0z92 != null && (interfaceC07520aR2 = c0z92.A02.A01) != null) {
                        i3 = interfaceC07520aR2.get(i, 1);
                    }
                    return AbstractC06750Xr.A00(i2, 6, i3);
                }
            }
            return AbstractC06750Xr.A00(num.intValue(), 4, 1);
        }
    }

    @Override // X.InterfaceC07320a6
    public final synchronized void E38(int i, int i2) {
        this.A0C.put(Integer.valueOf(i), 1);
    }

    @Override // X.InterfaceC07320a6
    public final synchronized void E39(int i, int i2) {
        this.A0D.put(Integer.valueOf(i), 1);
    }

    @Override // X.AbstractC208310f, X.C0XM
    public final C0XN AsU() {
        C0eI c0eI;
        C0Z9 c0z9 = (C0Z9) this.A05.get();
        if (c0z9 != null && (c0eI = c0z9.A04) != null) {
            return c0eI;
        }
        return C208010c.A00;
    }

    @Override // X.AbstractC208310f, X.C0XM
    public final boolean CY1(int i) {
        C0Z9 c0z9 = (C0Z9) this.A05.get();
        if (c0z9 == null || Arrays.binarySearch(c0z9.A00.A00, i) < 0) {
            return false;
        }
        return true;
    }

    @Override // X.C0XM
    public final int E7i(int i) {
        Random random = this.A04;
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
        C0Z8 c0z8;
        AbstractMap abstractMap;
        Number number;
        C0Z9 c0z9 = (C0Z9) this.A05.get();
        if (c0z9 != null && (c0z8 = c0z9.A03) != null && (abstractMap = (AbstractMap) c0z8.A00.get(i)) != null && (number = (Number) abstractMap.get(str)) != null) {
            return number.intValue();
        }
        return i;
    }

    @Override // X.InterfaceC07320a6
    public final void Egb(String str) {
        this.A0B.A00 = str;
        AtomicReference atomicReference = this.A05;
        if (str == null) {
            atomicReference.set(null);
            this.A06.get();
        } else {
            atomicReference.set(null);
            this.A02.execute(new C0ZA(this));
        }
    }

    @Override // X.C0XM
    public final long BTS(int i) {
        C0Z5 c0z5;
        if (i == 36322981) {
            return -1L;
        }
        C0Z9 c0z9 = (C0Z9) this.A05.get();
        if (this.A0G == null) {
            this.A0G = (C0f8) this.A0A.get();
        }
        if (c0z9 != null && (c0z5 = c0z9.A01) != null) {
            return c0z5.A03(i);
        }
        if (this.A0F == null) {
            this.A0F = (C11A) this.A08.get();
        }
        return this.A0F.A01(i);
    }
}
