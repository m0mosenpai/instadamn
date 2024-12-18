package X;

import android.os.Debug;
import com.facebook.errorreporting.lacrima.common.check.DirectReports;
import java.io.File;
import java.util.HashMap;
import java.util.List;
import java.util.Properties;
import java.util.Random;

/* renamed from: X.Svn, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C63912Svn implements InterfaceC100254en, InterfaceC100294er, InterfaceC02710Av {
    public byte A00;
    public long A01;
    public long A02;
    public C88023wA A03;
    public final byte A05;
    public final int A06;
    public final int A07;
    public final int A08;
    public final int A09;
    public final long A0A;
    public final C0Mo A0B;
    public final RunnableC100284eq A0D;
    public final C63284Sgj A0E;
    public final C07920bC A0F;
    public final InterfaceC04680Mk A0G;
    public final C0N0 A0H;
    public final String A0I;
    public final boolean A0J;
    public final boolean A0K;
    public final byte[] A0L;
    public final Class[] A0M;
    public final Class[] A0N;
    public boolean A04 = false;
    public final Random A0C = new Random();

    @Override // X.InterfaceC100254en
    public final synchronized C88023wA Aua() {
        return this.A03;
    }

    @Override // X.InterfaceC100264eo
    public final void CpU(C88023wA c88023wA) {
        Integer num;
        byte[] bArr;
        int intValue;
        synchronized (c88023wA) {
            this.A03 = null;
            C0Mo c0Mo = this.A0B;
            if (c0Mo != null) {
                Integer num2 = c88023wA.A08;
                synchronized (c0Mo) {
                    if (!A01(c88023wA)) {
                        if (num2 == C05F.A0C) {
                            c0Mo.A0C();
                        }
                        num = C05F.A00;
                    } else {
                        num = C05F.A01;
                        if (num2 != num) {
                            if (num2 != C05F.A00 && num2 != C05F.A0Y) {
                                if (num2 == C05F.A0N) {
                                    c0Mo.A0C();
                                }
                                C0N0 c0n0 = this.A0H;
                                bArr = this.A0L;
                                boolean A02 = C63284Sgj.A02(c88023wA, c0n0, bArr, 0);
                                intValue = 3;
                                if (A02) {
                                    intValue = 4;
                                }
                            } else {
                                C63284Sgj c63284Sgj = this.A0E;
                                bArr = this.A0L;
                                intValue = c63284Sgj.A03(c88023wA, this.A0H, bArr, this.A01).intValue();
                            }
                            A00(intValue, bArr);
                        }
                    }
                    c88023wA.A09(num);
                }
            }
        }
    }

    @Override // X.InterfaceC100254en
    public final void CpZ(C88023wA c88023wA) {
        byte b;
        Integer num;
        synchronized (c88023wA) {
            C0Mo c0Mo = this.A0B;
            if (c0Mo != null && this.A0J) {
                Integer num2 = c88023wA.A08;
                Integer num3 = C05F.A01;
                if (num2 != num3 && ((C88033wB) c88023wA).A05 == -1) {
                    synchronized (c0Mo) {
                        C88023wA c88023wA2 = this.A03;
                        if (c88023wA2 != null && c88023wA2 == c88023wA) {
                            Integer num4 = c88023wA2.A08;
                            Integer num5 = C05F.A0N;
                            if (num4 == num5) {
                                c0Mo.A0C();
                            } else if (num4 == C05F.A00 || num4 == C05F.A0Y) {
                                C63284Sgj c63284Sgj = this.A0E;
                                byte[] bArr = this.A0L;
                                c63284Sgj.A03(c88023wA2, this.A0H, bArr, this.A01);
                                Integer num6 = C05F.A0C;
                                A00(2, bArr);
                                this.A03.A09(num6);
                            }
                            C88023wA c88023wA3 = this.A03;
                            C0N0 c0n0 = this.A0H;
                            byte[] bArr2 = this.A0L;
                            C63284Sgj.A01(bArr2, 0, c88023wA3.A01());
                            C63284Sgj.A01(bArr2, 4, c88023wA3.A00());
                            if (C87973w5.A02.A01.get()) {
                                num3 = C05F.A0C;
                            }
                            if (1 - num3.intValue() != 0) {
                                b = 1;
                            } else {
                                b = 2;
                            }
                            bArr2[8] = b;
                            List list = c88023wA3.A0A;
                            if (list != null && !list.isEmpty()) {
                                C63284Sgj.A00(c88023wA3, c0n0, bArr2, 9);
                                num = C05F.A0u;
                            } else {
                                num = C05F.A15;
                            }
                            A00(num.intValue(), bArr2);
                            this.A03.A09(num5);
                        }
                    }
                }
            }
        }
    }

    @Override // X.InterfaceC100264eo
    public final void Cpa(C88023wA c88023wA) {
        synchronized (c88023wA) {
            this.A03 = c88023wA;
            C0Mo c0Mo = this.A0B;
            if (c0Mo != null) {
                c88023wA.A09(C05F.A00);
                if (!A01(c88023wA)) {
                    if (((C88033wB) c88023wA).A05 == -1) {
                        if (this.A0K) {
                            c88023wA.A09(C05F.A0Y);
                        }
                    }
                }
                synchronized (c0Mo) {
                    C63284Sgj c63284Sgj = this.A0E;
                    byte[] bArr = this.A0L;
                    Integer A03 = c63284Sgj.A03(c88023wA, this.A0H, bArr, this.A01);
                    A00(A03.intValue(), bArr);
                    Integer num = C05F.A01;
                    if (A03 != num && A03 != C05F.A0j) {
                        num = C05F.A0C;
                    }
                    c88023wA.A09(num);
                }
            }
        }
    }

    private void A00(int i, byte[] bArr) {
        C0Mo c0Mo = this.A0B;
        if (c0Mo == null) {
            return;
        }
        try {
            c0Mo.A0G(i, bArr);
        } catch (IllegalStateException e) {
            int length = bArr.length;
            int i2 = this.A08;
            if (i2 > 0 && this.A0C.nextInt(i2) < 1) {
                StringBuilder A1C = AbstractC166987dD.A1C();
                c0Mo.A0H(A1C);
                A1C.append(" record type: ");
                A1C.append(i);
                A1C.append(" size: ");
                A1C.append(length);
                HashMap A1G = AbstractC166987dD.A1G();
                A1G.put("lifecycle_raw_buffer", c0Mo.A0B());
                new StringBuilder();
                synchronized (c0Mo) {
                    DirectReports.A01(null, null, null, null, "Exception writing record", A1C.toString(), e, A1G);
                }
            }
            try {
                c0Mo.A0D();
            } catch (Exception unused) {
            }
        }
    }

    private boolean A01(C88023wA c88023wA) {
        if (!c88023wA.A06(this.A09)) {
            Class[] clsArr = this.A0N;
            int length = clsArr.length;
            int i = 0;
            while (true) {
                if (i < length) {
                    Class cls = clsArr[i];
                    if (cls != null && ((C88033wB) c88023wA).A09 == cls && ((C88033wB) c88023wA).A07 == null) {
                        break;
                    }
                    i++;
                } else {
                    Class[] clsArr2 = this.A0M;
                    int length2 = clsArr2.length;
                    int i2 = 0;
                    while (true) {
                        if (i2 < length2) {
                            Class cls2 = clsArr2[i2];
                            if (cls2 != null && ((C88033wB) c88023wA).A07 == cls2) {
                                break;
                            }
                            i2++;
                        } else {
                            Integer num = c88023wA.A08;
                            if (num == C05F.A01 || num == C05F.A0N) {
                                break;
                            }
                            return false;
                        }
                    }
                }
            }
        }
        return true;
    }

    @Override // X.InterfaceC100254en
    public final void CxZ(String str) {
        if (!this.A04 && this.A0B != null) {
            this.A04 = true;
            C0N0 c0n0 = this.A0H;
            String[] strArr = {"nativePollOnce:bg", "nativePollOnce", "android.view.Choreographer$FrameHandler", "android.view.Choreographer$FrameDisplayEventReceiver", "android.os.Handler", "android.app.ActivityThread$H", "android.os.Handler", "android.os.BinderProxy", "android.view.ViewRootImpl$ViewRootHandler", "android.app.ActivityThread$ContextCleanupInfo", "android.app.ActivityThread$CreateServiceData", "android.app.ActivityThread$BindServiceData"};
            synchronized (c0n0) {
                int i = 0;
                do {
                    String str2 = strArr[i];
                    Properties properties = c0n0.A04;
                    if (properties.getProperty(str2) == null) {
                        short s = (short) (c0n0.A00 + 1);
                        c0n0.A00 = s;
                        properties.setProperty(str2, Short.toString(s));
                    }
                    i++;
                } while (i < 12);
                C0N0.A00(c0n0);
            }
            RunnableC100284eq runnableC100284eq = this.A0D;
            if (runnableC100284eq != null && !Debug.isDebuggerConnected()) {
                runnableC100284eq.A00(0L, false);
            }
        }
    }

    @Override // X.InterfaceC100264eo
    public final String getName() {
        return this.A0I;
    }

    /* JADX WARN: Type inference failed for: r0v17, types: [java.lang.Object, X.Sgj] */
    public C63912Svn(AbstractC100044eS abstractC100044eS, C100234el c100234el, InterfaceC04650Mh interfaceC04650Mh, File file, List list, int i) {
        int i2;
        RunnableC100284eq runnableC100284eq;
        Class<?> cls;
        int i3 = 0;
        for (Integer num : C05F.A00(8)) {
            if (i3 < AbstractC02700Au.A00(num)) {
                i3 = AbstractC02700Au.A00(num);
            }
        }
        this.A0L = new byte[i3 - 1];
        this.A0G = new SxM(this);
        this.A0I = "ufad_looper_history";
        this.A08 = i;
        if (abstractC100044eS.A0A()) {
            File A0w = MSW.A0w(file, "looper.bin");
            if (!A0w.exists()) {
                this.A0F = interfaceC04650Mh.ALA(A0w, (int) abstractC100044eS.A01());
            } else {
                throw AbstractC31175DnJ.A0V("File exists: ", A0w.getName());
            }
        } else {
            this.A0F = null;
        }
        this.A06 = (int) abstractC100044eS.A01();
        this.A09 = (int) abstractC100044eS.A02();
        if (abstractC100044eS.A06()) {
            i2 = (int) abstractC100044eS.A00();
        } else {
            i2 = 0;
        }
        this.A07 = i2;
        this.A0K = abstractC100044eS.A0C();
        this.A0J = abstractC100044eS.A0B();
        if (abstractC100044eS.A06()) {
            runnableC100284eq = new RunnableC100284eq(this, abstractC100044eS, c100234el, list);
        } else {
            runnableC100284eq = null;
        }
        this.A0D = runnableC100284eq;
        long currentTimeMillis = System.currentTimeMillis();
        this.A0A = currentTimeMillis;
        byte b = C87973w5.A02.A01.get() ? (byte) 1 : (byte) 2;
        this.A05 = b;
        this.A00 = b;
        this.A02 = currentTimeMillis;
        this.A0H = new C0N0(file, false);
        this.A0E = new Object();
        C100274ep c100274ep = C100274ep.A03;
        Class<?> cls2 = c100274ep.A00;
        if (cls2 == null) {
            try {
                cls = Class.forName("android.app.ActivityThread$H");
                cls2 = cls;
            } catch (Throwable unused) {
                cls = null;
                cls2 = null;
            }
            c100274ep.A00 = cls;
        }
        this.A0N = new Class[]{cls2};
        this.A0M = c100274ep.A00();
        if (this.A0F != null) {
            Integer[] A00 = C05F.A00(8);
            int length = A00.length;
            int[] iArr = new int[length - 1];
            for (int i4 = 1; i4 < length; i4++) {
                iArr[i4 - 1] = AbstractC02700Au.A00(A00[i4]);
            }
            C0Mo c0Mo = new C0Mo(this.A0G, this.A0F.A00, iArr, (byte) 11, (int) abstractC100044eS.A01(), abstractC100044eS.A05());
            this.A0B = c0Mo;
            this.A01 = c0Mo.A0A();
            C87973w5.A02.A00(this);
            return;
        }
        this.A0B = null;
    }

    @Override // X.InterfaceC100294er
    public final void ASt(boolean z) {
        long currentTimeMillis = System.currentTimeMillis();
        C0Mo c0Mo = this.A0B;
        if (c0Mo != null) {
            byte b = 2;
            if (z) {
                b = 1;
            }
            synchronized (c0Mo) {
                c0Mo.A0E(4, b);
                c0Mo.A0F(3, currentTimeMillis);
                c0Mo.A0E(6, this.A00);
                c0Mo.A0F(5, this.A02);
            }
            this.A00 = b;
            this.A02 = currentTimeMillis;
        }
    }

    @Override // X.InterfaceC100254en
    public final String C05(long j) {
        throw AbstractC43592JPx.A11();
    }
}
