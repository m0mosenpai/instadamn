package X;

import java.io.IOException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes10.dex */
public final class TWI implements InterfaceC65534Tm4 {
    public final /* synthetic */ C62696SMk A00;
    public final /* synthetic */ SZM A01;

    public TWI(C62696SMk c62696SMk, SZM szm) {
        this.A01 = szm;
        this.A00 = c62696SMk;
    }

    @Override // X.InterfaceC65534Tm4
    public final void DGE(IOException iOException, TIU tiu) {
        this.A01.A00(iOException);
    }

    @Override // X.InterfaceC65534Tm4
    public final void Dgj(TIU tiu, THP thp) {
        ScheduledExecutorService scheduledExecutorService;
        SO5 so5 = thp.A0C;
        try {
            SZM szm = this.A01;
            int i = thp.A00;
            if (i == 101) {
                String str = null;
                String str2 = null;
                C63365SiO c63365SiO = thp.A05;
                String A04 = c63365SiO.A04("Connection");
                if (A04 != null) {
                    str2 = A04;
                }
                if ("Upgrade".equalsIgnoreCase(str2)) {
                    String str3 = null;
                    String A042 = c63365SiO.A04("Upgrade");
                    if (A042 != null) {
                        str3 = A042;
                    }
                    if ("websocket".equalsIgnoreCase(str3)) {
                        String A043 = c63365SiO.A04("Sec-WebSocket-Accept");
                        if (A043 != null) {
                            str = A043;
                        }
                        try {
                            String A00 = SUM.A00(C64531TIl.A03(MessageDigest.getInstance("SHA-1").digest(C64531TIl.A02(AnonymousClass001.A0R(szm.A0G, "258EAFA5-E914-47DA-95CA-C5AB0DC85B11")).data)).data);
                            if (A00.equals(str)) {
                                if (so5 != null) {
                                    C63026Saw c63026Saw = so5.A03;
                                    if (!c63026Saw.A08) {
                                        c63026Saw.A08 = true;
                                        c63026Saw.A0E.A0A();
                                        C65158TeX AJU = so5.A04.AJU();
                                        AJU.A06.setSoTimeout(0);
                                        AJU.A01();
                                        THM thm = new THM(so5, AJU, AJU.A0A, AJU.A0B);
                                        try {
                                            String A0R = AnonymousClass001.A0R("OkHttp WebSocket ", this.A00.A03.A0A());
                                            synchronized (szm) {
                                                try {
                                                    szm.A08 = thm;
                                                    szm.A0A = new SZF(szm.A0J, thm.A00);
                                                    byte[] bArr = AbstractC63404SjZ.A07;
                                                    ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(1, new TVC(A0R, false));
                                                    szm.A05 = scheduledThreadPoolExecutor;
                                                    long j = szm.A0E;
                                                    if (j != 0) {
                                                        scheduledThreadPoolExecutor.scheduleAtFixedRate(new TM6(szm), j, j, TimeUnit.MILLISECONDS);
                                                    }
                                                    if (!szm.A0H.isEmpty() && (scheduledExecutorService = szm.A05) != null) {
                                                        scheduledExecutorService.execute(szm.A0F);
                                                    }
                                                } catch (Throwable th) {
                                                    throw th;
                                                }
                                            }
                                            szm.A09 = new C63154Se2(szm, thm.A01);
                                            while (szm.A00 == -1) {
                                                C63154Se2 c63154Se2 = szm.A09;
                                                C63154Se2.A01(c63154Se2);
                                                if (c63154Se2.A03) {
                                                    C63154Se2.A00(c63154Se2);
                                                } else {
                                                    int i2 = c63154Se2.A00;
                                                    if (i2 == 1 || i2 == 2) {
                                                        while (!c63154Se2.A02) {
                                                            long j2 = c63154Se2.A01;
                                                            if (j2 > 0) {
                                                                c63154Se2.A07.E87(c63154Se2.A06, j2);
                                                                if (!c63154Se2.A08) {
                                                                    throw AbstractC166987dD.A15("buffer");
                                                                }
                                                            }
                                                            if (c63154Se2.A04) {
                                                                SZM szm2 = c63154Se2.A05;
                                                                TWX twx = c63154Se2.A06;
                                                                if (i2 == 1) {
                                                                    String A05 = twx.A05();
                                                                    C65140TeF c65140TeF = (C65140TeF) szm2.A0L;
                                                                    c65140TeF.A00.scheduleCallback(new RunnableC64630TNm(c65140TeF, A05), 0L);
                                                                } else {
                                                                    twx.A08();
                                                                }
                                                            } else {
                                                                while (!c63154Se2.A02) {
                                                                    C63154Se2.A01(c63154Se2);
                                                                    if (!c63154Se2.A03) {
                                                                        break;
                                                                    } else {
                                                                        C63154Se2.A00(c63154Se2);
                                                                    }
                                                                }
                                                                int i3 = c63154Se2.A00;
                                                                if (i3 != 0) {
                                                                    throw AbstractC58322PtE.A0v("Expected continuation opcode. Got: ", Integer.toHexString(i3));
                                                                }
                                                            }
                                                        }
                                                        throw AbstractC58321PtD.A0g();
                                                    }
                                                    throw AbstractC58322PtE.A0v("Unknown opcode: ", Integer.toHexString(i2));
                                                }
                                            }
                                            return;
                                        } catch (Exception e) {
                                            szm.A00(e);
                                            return;
                                        }
                                    }
                                    throw AbstractC58318PtA.A0Z();
                                }
                            }
                        } catch (NoSuchAlgorithmException e2) {
                        }
                    }
                }
            }
        } catch (IOException e3) {
            if (so5 != null) {
                so5.A03.A02(null, so5, true, true);
            }
            this.A01.A00(e3);
            AbstractC63404SjZ.A09(thp);
        }
    }
}
