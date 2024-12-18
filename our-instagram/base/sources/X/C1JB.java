package X;

import android.os.SystemClock;
import android.util.SparseArray;
import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.1JB, reason: invalid class name */
/* loaded from: classes.dex */
public final class C1JB {
    public static volatile boolean A09 = true;
    public static C1J4 A0A;
    public static final C1J9 A0B = C1J9.A01;
    public final int A01;
    public final C1JA A03;
    public final C95U A04;
    public final AnonymousClass157 A05;
    public final AnonymousClass155 A06;
    public AnonymousClass153 A00 = null;
    public final List A07 = new ArrayList();
    public final SparseArray A02 = new SparseArray();
    public final AtomicInteger A08 = new AtomicInteger(0);

    /* JADX WARN: Multi-variable type inference failed */
    public static InterfaceC219914z A00(C1JB c1jb, C2050395s c2050395s) {
        int i;
        C15E c15e;
        InterfaceC219914z interfaceC219914z;
        C15Q c15q;
        InterfaceC219914z interfaceC219914z2 = c2050395s.A00;
        if (interfaceC219914z2 == null) {
            try {
                C1J9 c1j9 = A0B;
                i = c2050395s.A04;
                synchronized (c1j9) {
                    SparseArray sparseArray = c1j9.A00;
                    c15e = (C15E) sparseArray.get(i);
                    if (c15e == null) {
                        c15e = C96C.A00;
                        sparseArray.put(i, c15e);
                    }
                }
            } catch (Error | Exception e) {
                AnonymousClass155 anonymousClass155 = c1jb.A06;
                i = c2050395s.A04;
                AnonymousClass155.A01(anonymousClass155, e);
                anonymousClass155.A00.EmQ(AnonymousClass155.A00("BoosterBuilderInitializationWithException", e.getMessage(), i), e);
                c15e = C96C.A00;
            }
            try {
                int i2 = c2050395s.A03;
                C15P c15p = c2050395s.A05;
                interfaceC219914z = c15e.A01(c15p, i2);
                if (interfaceC219914z instanceof AbstractC219814y) {
                    AbstractC219814y abstractC219814y = (AbstractC219814y) interfaceC219914z;
                    if (c15p != null) {
                        c15q = c15p.A03;
                    } else {
                        c15q = new Object();
                    }
                    abstractC219814y.A01 = c15q;
                }
                if (interfaceC219914z instanceof C219714x) {
                    AnonymousClass157 anonymousClass157 = c1jb.A05;
                    String A00 = C2050395s.A00(i);
                    String str = c15e.A00;
                    AnonymousClass150 anonymousClass150 = anonymousClass157.A00;
                    if (anonymousClass150.A00) {
                        C2050595u c2050595u = new C2050595u(null, 35, true);
                        c2050595u.A02("booster", A00);
                        c2050595u.A02("event", "no_op_booster");
                        if (str != null) {
                            c2050595u.A02("reason", str);
                        }
                        c2050595u.A00(2);
                        anonymousClass150.CjC(c2050595u);
                    }
                }
            } catch (Error | Exception e2) {
                AnonymousClass155 anonymousClass1552 = c1jb.A06;
                AnonymousClass155.A01(anonymousClass1552, e2);
                anonymousClass1552.A00.EmQ(AnonymousClass155.A00("BoosterInitializationWithException", e2.getMessage(), i), e2);
                interfaceC219914z = C219714x.A00;
            }
            synchronized (c1jb) {
                InterfaceC219914z interfaceC219914z3 = c2050395s.A00;
                if (interfaceC219914z3 == null) {
                    AnonymousClass153 anonymousClass153 = new AnonymousClass153() { // from class: X.96X
                        public long A03 = 0;
                        public long A02 = 0;
                        public long A01 = 0;
                        public long A00 = -1;

                        @Override // X.AnonymousClass153
                        public final void onPostReleaseBoost(InterfaceC219914z interfaceC219914z4, int i3, boolean z) {
                            if (z) {
                                this.A02++;
                            }
                            this.A01++;
                            long j = this.A00;
                            if (j > -1) {
                                this.A03 += SystemClock.uptimeMillis() - j;
                                this.A00 = -1L;
                            }
                        }

                        @Override // X.AnonymousClass153
                        public final void onPostRequestBoost(InterfaceC219914z interfaceC219914z4, boolean z, int i3) {
                            if (z) {
                                this.A00 = SystemClock.uptimeMillis();
                            }
                        }

                        @Override // X.AnonymousClass153
                        public final void onPreReleaseBoost(InterfaceC219914z interfaceC219914z4, int i3, boolean z) {
                        }
                    };
                    c1jb.A00 = anonymousClass153;
                    interfaceC219914z.EDO(anonymousClass153);
                    c2050395s.A01 = c1jb.A00;
                    c2050395s.A00 = interfaceC219914z;
                } else {
                    interfaceC219914z = interfaceC219914z3;
                }
            }
            return interfaceC219914z;
        }
        return interfaceC219914z2;
    }

    public static void A01(C1JB c1jb, InterfaceC219914z interfaceC219914z, int i) {
        int i2;
        int i3;
        C2050595u c2050595u;
        int i4;
        try {
            i3 = interfaceC219914z.EJ2(Integer.valueOf(i), c1jb.A01);
            th = null;
        } catch (Throwable th) {
            th = th;
            AnonymousClass155 anonymousClass155 = c1jb.A06;
            if (interfaceC219914z != null) {
                i2 = interfaceC219914z.AhK();
                if (i2 != -1) {
                    AnonymousClass155.A02(interfaceC219914z, anonymousClass155.A01);
                }
            } else {
                C219714x c219714x = C219714x.A00;
                i2 = -1;
            }
            AnonymousClass155.A01(anonymousClass155, th);
            anonymousClass155.A00.EmQ(AnonymousClass155.A00("BoosterFailsRequestWithException", th.getMessage(), i2), th);
            i3 = 3;
        }
        c1jb.A06.A03(interfaceC219914z);
        AnonymousClass157 anonymousClass157 = c1jb.A05;
        int i5 = c1jb.A01;
        AnonymousClass150 anonymousClass150 = anonymousClass157.A00;
        if (anonymousClass150.A00 && !(interfaceC219914z instanceof C219714x) && (interfaceC219914z instanceof AbstractC219814y)) {
            String A03 = ((AbstractC219814y) interfaceC219914z).A03();
            if (i3 == 1) {
                Integer valueOf = Integer.valueOf(i);
                C2050595u c2050595u2 = new C2050595u(null, 25, false);
                c2050595u2.A02("event", "boosting_request");
                c2050595u2.A01("trigger_source_id", i5);
                c2050595u2.A02("booster", A03);
                if (valueOf != null) {
                    c2050595u2.A01("trigger_source_key", valueOf.intValue());
                }
                StringBuffer stringBuffer = new StringBuffer();
                stringBuffer.append(A03);
                stringBuffer.append("_");
                stringBuffer.append(i5);
                stringBuffer.append("_");
                if (valueOf != null) {
                    i4 = valueOf.intValue();
                } else {
                    i4 = 0;
                }
                stringBuffer.append(i4);
                String obj = stringBuffer.toString();
                Map map = anonymousClass150.A01.A00;
                if (!map.containsKey(obj)) {
                    map.put(obj, c2050595u2);
                }
                if (!c2050595u2.A03) {
                    AnonymousClass150.A01(c2050595u2, C1K3.A01);
                    return;
                }
                return;
            }
            if (i3 == 2) {
                Integer valueOf2 = Integer.valueOf(i);
                c2050595u = new C2050595u(null, 25, true);
                c2050595u.A02("event", "boosting_request");
                c2050595u.A02("booster", A03);
                c2050595u.A01("trigger_source_id", i5);
                c2050595u.A00(3);
                if (valueOf2 != null) {
                    c2050595u.A01("trigger_source_key", valueOf2.intValue());
                }
            } else {
                Integer valueOf3 = Integer.valueOf(i);
                c2050595u = new C2050595u(valueOf3, 25, false);
                c2050595u.A02("event", "boosting_request");
                c2050595u.A01("trigger_source_id", i5);
                c2050595u.A02("booster", A03);
                c2050595u.A00(87);
                if (valueOf3 != null) {
                    c2050595u.A01("trigger_source_key", valueOf3.intValue());
                }
                if (th != null && th.getMessage() != null) {
                    c2050595u.A02("error", th.getMessage());
                }
            }
            anonymousClass150.CjC(c2050595u);
        }
    }

    public final void A02(int i) {
        long j;
        java.util.Set set;
        for (C2050395s c2050395s : this.A07) {
            if (i == 0 || (set = c2050395s.A02) == null || !set.contains(Integer.valueOf(i))) {
                if (!C2050395s.A06.contains(Integer.valueOf(c2050395s.A04)) || A09) {
                    InterfaceC219914z A00 = A00(this, c2050395s);
                    C95U c95u = this.A04;
                    if (c95u != null) {
                        int i2 = this.A01;
                        String A002 = C2050395s.A00(A00.AhK());
                        if (i2 == 719983200) {
                            UserSession userSession = c95u.A00;
                            C06090Tz c06090Tz = C06090Tz.A05;
                            if (C18U.A06(c06090Tz, userSession, 2342155815240074501L)) {
                                if ("cpuBoost".equals(A002)) {
                                    j = 36312806026839303L;
                                } else if ("threadBoostByName".equals(A002)) {
                                    j = 36312806026773766L;
                                } else if ("threadAffinity".equals(A002)) {
                                    j = 36312806026904840L;
                                }
                                if (C18U.A06(c06090Tz, userSession, j)) {
                                }
                            }
                        }
                    }
                    A01(this, A00, i);
                }
            }
        }
    }

    public final void A03(C2050395s c2050395s) {
        C95S c95s;
        C1J4 c1j4 = A0A;
        if (c1j4 != null) {
            C1J7 c1j7 = c1j4.A08;
            int i = c2050395s.A04;
            if (c1j7.A01 || i != 1 || ((c95s = c1j7.A00) != null && c95s.A05)) {
                this.A07.add(c2050395s);
                this.A02.put(i, c2050395s);
            }
        }
    }

    public C1JB(C1JA c1ja, C95U c95u, AnonymousClass157 anonymousClass157, AnonymousClass155 anonymousClass155, int i) {
        this.A01 = i;
        this.A05 = anonymousClass157;
        this.A06 = anonymousClass155;
        this.A03 = c1ja;
        this.A04 = c95u;
    }
}
