package X;

import com.facebook.common.dextricks.StringTreeSet;
import java.net.ProtocolException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* renamed from: X.Se2, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C63154Se2 {
    public int A00;
    public long A01;
    public boolean A02;
    public boolean A03;
    public boolean A04;
    public final SZM A05;
    public final InterfaceC65701TsN A07;
    public final boolean A08;
    public final TWX A09 = new Object();
    public final TWX A06 = new Object();

    /* JADX WARN: Type inference failed for: r0v0, types: [X.TWX, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v1, types: [X.TWX, java.lang.Object] */
    public C63154Se2(SZM szm, InterfaceC65701TsN interfaceC65701TsN) {
        if (interfaceC65701TsN != null) {
            this.A08 = true;
            this.A07 = interfaceC65701TsN;
            this.A05 = szm;
            return;
        }
        throw AbstractC166987dD.A15("source == null");
    }

    public static void A00(C63154Se2 c63154Se2) {
        String str;
        THM thm;
        StringBuilder A1C;
        long j = c63154Se2.A01;
        if (j > 0) {
            c63154Se2.A07.E87(c63154Se2.A09, j);
            if (!c63154Se2.A08) {
                throw AbstractC166987dD.A15("buffer");
            }
        }
        int i = c63154Se2.A00;
        switch (i) {
            case 8:
                short s = 1005;
                TWX twx = c63154Se2.A09;
                long j2 = twx.A00;
                if (j2 != 1) {
                    if (j2 != 0) {
                        s = twx.readShort();
                        str = twx.A05();
                        if (s >= 1000 && s < 5000) {
                            if (s >= 1004 && (s <= 1006 || (s >= 1012 && s <= 2999))) {
                                A1C = AbstractC166987dD.A1C();
                                A1C.append("Code ");
                                A1C.append((int) s);
                                A1C.append(" is reserved and may not be used.");
                            }
                        } else {
                            A1C = AbstractC166987dD.A1C();
                            A1C.append("Code must be in range [1000,5000): ");
                            A1C.append((int) s);
                        }
                        String obj = A1C.toString();
                        if (obj != null) {
                            throw new ProtocolException(obj);
                        }
                    } else {
                        str = "";
                    }
                    SZM szm = c63154Se2.A05;
                    if (s != -1) {
                        synchronized (szm) {
                            if (szm.A00 == -1) {
                                szm.A00 = s;
                                szm.A04 = str;
                                thm = null;
                                if (szm.A0C && szm.A0H.isEmpty()) {
                                    THM thm2 = szm.A08;
                                    szm.A08 = null;
                                    ScheduledFuture scheduledFuture = szm.A06;
                                    if (scheduledFuture != null) {
                                        scheduledFuture.cancel(false);
                                    }
                                    szm.A05.shutdown();
                                    thm = thm2;
                                }
                            } else {
                                throw AbstractC166987dD.A14("already closed");
                            }
                        }
                        try {
                            AbstractC61527Rp3 abstractC61527Rp3 = szm.A0L;
                            if (thm != null) {
                                C65140TeF c65140TeF = (C65140TeF) abstractC61527Rp3;
                                c65140TeF.A00.scheduleCallback(new RunnableC64567TKe(c65140TeF), 0L);
                            }
                            AbstractC63404SjZ.A09(thm);
                            c63154Se2.A02 = true;
                            return;
                        } catch (Throwable th) {
                            AbstractC63404SjZ.A09(thm);
                            throw th;
                        }
                    }
                    throw AbstractC58318PtA.A0Y();
                }
                throw new ProtocolException("Malformed close payload length of 1.");
            case 9:
                SZM szm2 = c63154Se2.A05;
                C64531TIl A08 = c63154Se2.A09.A08();
                synchronized (szm2) {
                    if (!szm2.A0D && (!szm2.A0C || !szm2.A0H.isEmpty())) {
                        szm2.A0I.add(A08);
                        ScheduledExecutorService scheduledExecutorService = szm2.A05;
                        if (scheduledExecutorService != null) {
                            scheduledExecutorService.execute(szm2.A0F);
                        }
                        szm2.A01++;
                    }
                }
                return;
            case 10:
                SZM szm3 = c63154Se2.A05;
                c63154Se2.A09.A08();
                synchronized (szm3) {
                    szm3.A02++;
                    szm3.A0B = false;
                }
                return;
            default:
                throw AbstractC58322PtE.A0v("Unknown control opcode: ", Integer.toHexString(i));
        }
    }

    public static void A01(C63154Se2 c63154Se2) {
        String str;
        if (!c63154Se2.A02) {
            InterfaceC65701TsN interfaceC65701TsN = c63154Se2.A07;
            long A01 = interfaceC65701TsN.Eq9().A01();
            interfaceC65701TsN.Eq9().A03();
            try {
                int A00 = InterfaceC65701TsN.A00(interfaceC65701TsN);
                interfaceC65701TsN.Eq9().A05(TimeUnit.NANOSECONDS, A01);
                c63154Se2.A00 = A00 & 15;
                boolean z = true;
                boolean A1M = AbstractC167007dF.A1M(A00 & 128);
                c63154Se2.A04 = A1M;
                boolean A1M2 = AbstractC167007dF.A1M(A00 & 8);
                c63154Se2.A03 = A1M2;
                if (A1M2 && !A1M) {
                    throw new ProtocolException("Control frames must be final.");
                }
                boolean A1M3 = AbstractC167007dF.A1M(A00 & 64);
                boolean A1M4 = AbstractC167007dF.A1M(A00 & 32);
                boolean A1M5 = AbstractC167007dF.A1M(A00 & 16);
                if (!A1M3 && !A1M4 && !A1M5) {
                    int A002 = InterfaceC65701TsN.A00(interfaceC65701TsN);
                    if ((A002 & 128) == 0) {
                        z = false;
                    }
                    boolean z2 = c63154Se2.A08;
                    if (z == z2) {
                        if (z2) {
                            str = "Server-sent frames must not be masked.";
                        } else {
                            str = "Client-sent frames must be masked.";
                        }
                        throw new ProtocolException(str);
                    }
                    long j = A002 & StringTreeSet.MAX_SYMBOL_COUNT;
                    c63154Se2.A01 = j;
                    if (j == 126) {
                        j = interfaceC65701TsN.readShort() & 65535;
                        c63154Se2.A01 = j;
                    } else if (j == 127) {
                        j = interfaceC65701TsN.readLong();
                        c63154Se2.A01 = j;
                        if (j < 0) {
                            throw new ProtocolException(AnonymousClass001.A0g("Frame length 0x", Long.toHexString(j), " > 0x7FFFFFFFFFFFFFFF"));
                        }
                    }
                    if (c63154Se2.A03 && j > 125) {
                        throw new ProtocolException("Control frame must be less than 125B.");
                    }
                    if (z) {
                        interfaceC65701TsN.readFully(null);
                        return;
                    }
                    return;
                }
                throw new ProtocolException("Reserved flags are unsupported.");
            } catch (Throwable th) {
                interfaceC65701TsN.Eq9().A05(TimeUnit.NANOSECONDS, A01);
                throw th;
            }
        }
        throw AbstractC58321PtD.A0g();
    }
}
