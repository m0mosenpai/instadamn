package X;

import com.facebook.common.dextricks.Constants;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;
import java.util.concurrent.ExecutorService;

/* loaded from: classes10.dex */
public abstract class TM2 implements Runnable {
    public final String A00;

    public TM2(String str, Object... objArr) {
        this.A00 = AbstractC58321PtD.A0x(str, objArr);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.Runnable
    public final void run() {
        Integer num;
        Integer num2;
        Integer num3;
        boolean z;
        boolean z2;
        C62696SMk c62696SMk;
        THP A00;
        String str;
        String str2;
        THU thu;
        boolean z3;
        C62719SNj c62719SNj;
        C63029Sb0[] c63029Sb0Arr;
        long j;
        int i;
        C62971SZq c62971SZq;
        int min;
        int i2;
        int i3;
        Thread currentThread = Thread.currentThread();
        String name = currentThread.getName();
        C65147TeM c65147TeM = this;
        currentThread.setName(((TM2) c65147TeM).A00);
        try {
            if (c65147TeM instanceof C65147TeM) {
                try {
                    c65147TeM = c65147TeM;
                    num = C05F.A0C;
                    IOException e = null;
                    try {
                        THV thv = c65147TeM.A00;
                        if (!thv.A02(c65147TeM, true)) {
                            String[] strArr = C63116SdK.A01;
                            throw MSW.A0y(AbstractC58321PtD.A0x("Required SETTINGS preface not received", new Object[0]));
                        }
                        do {
                        } while (thv.A02(c65147TeM, false));
                        num2 = C05F.A00;
                        num3 = C05F.A0j;
                    } catch (IOException e2) {
                        e = e2;
                        num2 = C05F.A01;
                        num3 = num2;
                    }
                    c65147TeM.A01.A05(e, num2, num3);
                    AbstractC63404SjZ.A09(c65147TeM.A00);
                    return;
                } catch (Throwable th) {
                    c65147TeM.A01.A05(null, num, num);
                    AbstractC63404SjZ.A09(c65147TeM.A00);
                    throw th;
                }
            }
            if (c65147TeM instanceof C65143TeI) {
                THU thu2 = ((C65143TeI) c65147TeM).A00.A01;
                C65158TeX c65158TeX = (C65158TeX) thu2.A0H;
                synchronized (c65158TeX.A0F) {
                    try {
                        synchronized (thu2) {
                            C62719SNj c62719SNj2 = thu2.A0L;
                            i3 = Integer.MAX_VALUE;
                            if ((c62719SNj2.A00 & 16) != 0) {
                                i3 = c62719SNj2.A01[4];
                            }
                        }
                        c65158TeX.A00 = i3;
                    } finally {
                    }
                }
            } else if (c65147TeM instanceof C65146TeL) {
                C65146TeL c65146TeL = (C65146TeL) c65147TeM;
                C65147TeM c65147TeM2 = c65146TeL.A00;
                C62719SNj c62719SNj3 = c65146TeL.A01;
                THU thu3 = c65147TeM2.A01;
                THS ths = thu3.A0J;
                synchronized (ths) {
                    try {
                        synchronized (thu3) {
                            c62719SNj = thu3.A0L;
                            int A002 = c62719SNj.A00();
                            int i4 = 0;
                            do {
                                if (((1 << i4) & c62719SNj3.A00) != 0) {
                                    c62719SNj.A01(i4, c62719SNj3.A01[i4]);
                                }
                                i4++;
                            } while (i4 < 10);
                            int A003 = c62719SNj.A00();
                            c63029Sb0Arr = null;
                            if (A003 != -1 && A003 != A002) {
                                j = A003 - A002;
                                Map map = thu3.A0E;
                                if (!map.isEmpty()) {
                                    c63029Sb0Arr = (C63029Sb0[]) map.values().toArray(new C63029Sb0[map.size()]);
                                }
                            } else {
                                j = 0;
                            }
                        }
                        try {
                            if (!ths.A01) {
                                int i5 = ths.A00;
                                int i6 = c62719SNj.A00;
                                if ((i6 & 32) != 0) {
                                    i5 = c62719SNj.A01[5];
                                }
                                ths.A00 = i5;
                                if ((i6 & 2) != 0 && (i = c62719SNj.A01[1]) != -1 && (i2 = (c62971SZq = ths.A02).A02) != (min = Math.min(i, Constants.LOAD_RESULT_DEX2OAT_CLASSPATH_SET))) {
                                    if (min < i2) {
                                        c62971SZq.A04 = Math.min(c62971SZq.A04, min);
                                    }
                                    c62971SZq.A05 = true;
                                    c62971SZq.A02 = min;
                                    int i7 = c62971SZq.A00;
                                    if (min < i7) {
                                        if (min != 0) {
                                            C62971SZq.A00(c62971SZq, i7 - min);
                                        } else {
                                            Arrays.fill(c62971SZq.A06, (Object) null);
                                            c62971SZq.A03 = c62971SZq.A06.length - 1;
                                            c62971SZq.A01 = 0;
                                            c62971SZq.A00 = 0;
                                        }
                                    }
                                }
                                ths.A01((byte) 4, (byte) 1, 0, 0);
                                ths.A04.flush();
                            } else {
                                throw AbstractC58321PtD.A0g();
                            }
                        } catch (Throwable th2) {
                            try {
                                throw th2;
                            } catch (IOException e3) {
                                Integer num4 = C05F.A01;
                                thu3.A05(e3, num4, num4);
                            }
                        }
                    } finally {
                    }
                }
                if (c63029Sb0Arr != null) {
                    for (C63029Sb0 c63029Sb0 : c63029Sb0Arr) {
                        synchronized (c63029Sb0) {
                            try {
                                c63029Sb0.A00 += j;
                                if (j > 0) {
                                    c63029Sb0.notifyAll();
                                }
                            } finally {
                            }
                        }
                    }
                }
                THU.A0N.execute(new C65143TeI(c65147TeM2, thu3.A0C));
            } else {
                try {
                    if (c65147TeM instanceof C65145TeK) {
                        C65145TeK c65145TeK = (C65145TeK) c65147TeM;
                        try {
                            c65145TeK.A01.A04(null, C05F.A0Y);
                        } catch (IOException e4) {
                            C63220SfQ.A01.A03(AnonymousClass001.A0R("Http2Connection.Listener failure for ", c65145TeK.A00.A01.A0C), e4, 4);
                            c65145TeK.A01.A04(e4, C05F.A01);
                        }
                    } else if (c65147TeM instanceof C65153TeS) {
                        C65153TeS c65153TeS = (C65153TeS) c65147TeM;
                        c65153TeS.A02.A07(true, c65153TeS.A00, c65153TeS.A01);
                    } else if (c65147TeM instanceof C65142TeH) {
                        THU thu4 = ((C65142TeH) c65147TeM).A00;
                        synchronized (thu4) {
                            try {
                                ExecutorService executorService = THU.A0N;
                                long j2 = thu4.A08;
                                long j3 = thu4.A07;
                                if (j2 < j3) {
                                    z3 = true;
                                } else {
                                    thu4.A07 = 1 + j3;
                                    z3 = false;
                                }
                            } finally {
                            }
                        }
                        if (z3) {
                            Integer num5 = C05F.A01;
                            thu4.A05(null, num5, num5);
                        } else {
                            thu4.A07(false, 1, 0);
                        }
                    } else if (c65147TeM instanceof C65144TeJ) {
                        C65144TeJ c65144TeJ = (C65144TeJ) c65147TeM;
                        THU thu5 = c65144TeJ.A01;
                        int i8 = c65144TeJ.A00;
                        synchronized (thu5) {
                            try {
                                thu5.A0F.remove(Integer.valueOf(i8));
                            } finally {
                            }
                        }
                    } else if (c65147TeM instanceof C65154TeT) {
                        C65154TeT c65154TeT = (C65154TeT) c65147TeM;
                        THU thu6 = c65154TeT.A02;
                        int i9 = c65154TeT.A01;
                        c65154TeT.A03.Em6(c65154TeT.A00);
                        thu6.A0J.A03(i9, C05F.A0j);
                        synchronized (thu6) {
                            try {
                                thu6.A0F.remove(Integer.valueOf(i9));
                            } finally {
                            }
                        }
                    } else if (c65147TeM instanceof C65152TeR) {
                        C65152TeR c65152TeR = (C65152TeR) c65147TeM;
                        THU thu7 = c65152TeR.A02;
                        int i10 = c65152TeR.A00;
                        thu7.A0J.A03(i10, C05F.A0j);
                        synchronized (thu7) {
                            try {
                                thu7.A0F.remove(Integer.valueOf(i10));
                            } finally {
                            }
                        }
                    } else if (c65147TeM instanceof C65151TeQ) {
                        C65151TeQ c65151TeQ = (C65151TeQ) c65147TeM;
                        THU thu8 = c65151TeQ.A02;
                        int i11 = c65151TeQ.A00;
                        thu8.A0J.A03(i11, C05F.A0j);
                        synchronized (thu8) {
                            try {
                                thu8.A0F.remove(Integer.valueOf(i11));
                            } catch (Throwable th3) {
                                throw th3;
                            }
                        }
                    } else if (c65147TeM instanceof C65141TeG) {
                        ((C65141TeG) c65147TeM).A00.A07(false, 2, 0);
                    } else if (c65147TeM instanceof C65150TeP) {
                        C65150TeP c65150TeP = (C65150TeP) c65147TeM;
                        try {
                            c65150TeP.A02.A0J.A02(c65150TeP.A00, c65150TeP.A01);
                        } catch (IOException e5) {
                            e = e5;
                            thu = c65150TeP.A02;
                            ExecutorService executorService2 = THU.A0N;
                            Integer num6 = C05F.A01;
                            thu.A05(e, num6, num6);
                            return;
                        }
                    } else if (c65147TeM instanceof C65149TeO) {
                        C65149TeO c65149TeO = (C65149TeO) c65147TeM;
                        try {
                            c65149TeO.A02.A0J.A03(c65149TeO.A00, c65149TeO.A01);
                        } catch (IOException e6) {
                            e = e6;
                            thu = c65149TeO.A02;
                            ExecutorService executorService22 = THU.A0N;
                            Integer num62 = C05F.A01;
                            thu.A05(e, num62, num62);
                            return;
                        }
                    } else {
                        C65148TeN c65148TeN = (C65148TeN) c65147TeM;
                        TIU tiu = c65148TeN.A02;
                        tiu.A00.A0E.A08();
                        try {
                            try {
                                ArrayList A1E = AbstractC166987dD.A1E();
                                TIY tiy = tiu.A02;
                                A1E.addAll(tiy.A08);
                                A1E.add(new TWP(tiy));
                                A1E.add(new TWN(tiy.A0I));
                                A1E.add(new Object());
                                A1E.add(new TWM(tiy));
                                z2 = tiu.A04;
                                if (!z2) {
                                    A1E.addAll(tiy.A09);
                                }
                                A1E.add(new TWO(z2));
                                C63026Saw c63026Saw = tiu.A00;
                                c62696SMk = tiu.A03;
                                C62709SMx c62709SMx = new C62709SMx(A1E, tiu, c62696SMk, null, c63026Saw, 0, tiy.A01, tiy.A03, tiy.A04);
                                try {
                                    A00 = c62709SMx.A00(c62696SMk, c62709SMx.A05, c62709SMx.A06);
                                } catch (IOException e7) {
                                    try {
                                        throw tiu.A00.A01(e7);
                                    } catch (Throwable th4) {
                                        throw th4;
                                    }
                                } catch (Throwable th5) {
                                    tiu.A00.A01(null);
                                    throw th5;
                                }
                            } catch (Throwable th6) {
                                tiu.A02.A0J.A01(c65148TeN);
                                throw th6;
                            }
                        } catch (IOException e8) {
                            c65148TeN.A00.DGE(e8, tiu);
                        } catch (Throwable th7) {
                            th = th7;
                            z = false;
                        }
                        if (!tiu.A00.A06()) {
                            tiu.A00.A01(null);
                            z = true;
                            try {
                                c65148TeN.A00.Dgj(tiu, A00);
                            } catch (IOException e9) {
                                C63220SfQ c63220SfQ = C63220SfQ.A01;
                                if (tiu.A00.A06()) {
                                    str = "canceled ";
                                } else {
                                    str = "";
                                }
                                if (!z2) {
                                    str2 = "call";
                                } else {
                                    str2 = "web socket";
                                }
                                c63220SfQ.A03(AnonymousClass001.A0R("Callback failure for ", AnonymousClass001.A0u(str, str2, " to ", c62696SMk.A03.A0A())), e9, 4);
                            } catch (Throwable th8) {
                                th = th8;
                                tiu.A00.A04();
                                if (!z) {
                                    IOException A0y = MSW.A0y(AbstractC167017dG.A0n(th, "canceled due to ", AbstractC166987dD.A1C()));
                                    Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(A0y, th);
                                    c65148TeN.A00.DGE(A0y, tiu);
                                }
                                throw th;
                            }
                            tiu.A02.A0J.A01(c65148TeN);
                        } else {
                            AbstractC63404SjZ.A09(A00);
                            throw MSW.A0y("Canceled");
                        }
                    }
                } catch (IOException unused) {
                }
            }
            return;
        } finally {
        }
        currentThread.setName(name);
    }
}
