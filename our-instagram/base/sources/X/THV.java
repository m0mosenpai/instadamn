package X;

import com.facebook.common.dextricks.OdexSchemeArtXdex;
import java.io.Closeable;
import java.io.EOFException;
import java.util.ArrayList;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledExecutorService;
import java.util.logging.Level;
import java.util.logging.Logger;

/* loaded from: classes10.dex */
public final class THV implements Closeable {
    public static final Logger A03 = AbstractC58319PtB.A17(C63116SdK.class);
    public final C63195Sex A00;
    public final InterfaceC65701TsN A01;
    public final C64841TWh A02;

    /* JADX WARN: Failed to find 'out' block for switch in B:21:0x0062. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r15v3, types: [X.TWX, java.lang.Object] */
    public final boolean A02(C65147TeM c65147TeM, boolean z) {
        Object[] A1Y;
        String str;
        C63029Sb0[] c63029Sb0Arr;
        ScheduledExecutorService scheduledExecutorService;
        Runnable c65153TeS;
        boolean z2;
        TWX twx;
        boolean z3;
        boolean A1O;
        long j;
        long j2;
        int i = 0;
        try {
            InterfaceC65701TsN interfaceC65701TsN = this.A01;
            interfaceC65701TsN.EJO(9L);
            int A00 = InterfaceC65701TsN.A00(interfaceC65701TsN) | (InterfaceC65701TsN.A00(interfaceC65701TsN) << 16) | (InterfaceC65701TsN.A00(interfaceC65701TsN) << 8);
            if (A00 >= 0 && A00 <= 16384) {
                byte A002 = (byte) InterfaceC65701TsN.A00(interfaceC65701TsN);
                if (z && A002 != 4) {
                    A1Y = new Object[]{Byte.valueOf(A002)};
                    str = "Expected a SETTINGS frame but was %s";
                } else {
                    byte A003 = (byte) InterfaceC65701TsN.A00(interfaceC65701TsN);
                    int readInt = interfaceC65701TsN.readInt() & Integer.MAX_VALUE;
                    Logger logger = A03;
                    if (logger.isLoggable(Level.FINE)) {
                        logger.fine(C63116SdK.A00(A002, A003, readInt, A00, true));
                    }
                    switch (A002) {
                        case 0:
                            short s = 0;
                            if (readInt != 0) {
                                boolean A1M = AbstractC167007dF.A1M(A003 & 1);
                                if ((A003 & 32) != 0) {
                                    A1Y = new Object[0];
                                    str = "PROTOCOL_ERROR: FLAG_COMPRESSED without SETTINGS_COMPRESS_DATA";
                                    break;
                                } else {
                                    if ((A003 & 8) != 0) {
                                        s = (short) InterfaceC65701TsN.A00(interfaceC65701TsN);
                                    }
                                    int A004 = A00(A003, A00, s);
                                    THU thu = c65147TeM.A01;
                                    ExecutorService executorService = THU.A0N;
                                    if ((readInt & 1) == 0) {
                                        ?? obj = new Object();
                                        long j3 = A004;
                                        interfaceC65701TsN.EJO(j3);
                                        interfaceC65701TsN.E7q(obj, j3);
                                        long j4 = obj.A00;
                                        if (j4 == j3) {
                                            THU.A00(new C65154TeT(thu, obj, AbstractC25228BEl.A1Z(thu.A0C, readInt), readInt, A004), thu);
                                        } else {
                                            StringBuilder A1C = AbstractC166987dD.A1C();
                                            A1C.append(j4);
                                            throw MSW.A0y(AbstractC58320PtC.A12(" != ", A1C, A004));
                                        }
                                    } else {
                                        C63029Sb0 A01 = thu.A01(readInt);
                                        if (A01 == null) {
                                            thu.A03(readInt, C05F.A01);
                                            long j5 = A004;
                                            thu.A04(j5);
                                            interfaceC65701TsN.Em6(j5);
                                        } else {
                                            C64843TWj c64843TWj = A01.A09;
                                            long j6 = A004;
                                            while (true) {
                                                if (j6 > 0) {
                                                    C63029Sb0 c63029Sb0 = c64843TWj.A06;
                                                    synchronized (c63029Sb0) {
                                                        z2 = c64843TWj.A02;
                                                        twx = c64843TWj.A04;
                                                        z3 = true;
                                                        A1O = AbstractC167007dF.A1O(((twx.A00 + j6) > c64843TWj.A03 ? 1 : ((twx.A00 + j6) == c64843TWj.A03 ? 0 : -1)));
                                                    }
                                                    if (A1O) {
                                                        interfaceC65701TsN.Em6(j6);
                                                        c63029Sb0.A05(C05F.A0N);
                                                    } else if (z2) {
                                                        interfaceC65701TsN.Em6(j6);
                                                    } else {
                                                        TWX twx2 = c64843TWj.A05;
                                                        long E7q = interfaceC65701TsN.E7q(twx2, j6);
                                                        if (E7q != -1) {
                                                            j6 -= E7q;
                                                            synchronized (c63029Sb0) {
                                                                if (c64843TWj.A01) {
                                                                    j = twx2.A00;
                                                                    twx2.A0A();
                                                                } else {
                                                                    if (twx.A00 != 0) {
                                                                        z3 = false;
                                                                    }
                                                                    do {
                                                                    } while (twx2.E7q(twx, OdexSchemeArtXdex.STATE_PGO_ATTEMPTED) != -1);
                                                                    if (z3) {
                                                                        c63029Sb0.notifyAll();
                                                                    }
                                                                    j = 0;
                                                                }
                                                            }
                                                            if (j > 0) {
                                                                c63029Sb0.A07.A04(j);
                                                            }
                                                        } else {
                                                            throw new EOFException();
                                                        }
                                                    }
                                                }
                                            }
                                            if (A1M) {
                                                A01.A06(AbstractC63404SjZ.A04, true);
                                            }
                                        }
                                    }
                                    j2 = s;
                                    interfaceC65701TsN.Em6(j2);
                                    return true;
                                }
                            } else {
                                A1Y = new Object[0];
                                str = "PROTOCOL_ERROR: TYPE_DATA streamId == 0";
                                break;
                            }
                        case 1:
                            short s2 = 0;
                            if (readInt != 0) {
                                boolean A1M2 = AbstractC167007dF.A1M(A003 & 1);
                                if ((A003 & 8) != 0) {
                                    s2 = (short) InterfaceC65701TsN.A00(interfaceC65701TsN);
                                }
                                if ((A003 & 32) != 0) {
                                    interfaceC65701TsN.readInt();
                                    interfaceC65701TsN.readByte();
                                    A00 -= 5;
                                }
                                ArrayList A012 = A01(A003, A00(A003, A00, s2), readInt, s2);
                                THU thu2 = c65147TeM.A01;
                                ExecutorService executorService2 = THU.A0N;
                                if ((readInt & 1) == 0) {
                                    THU.A00(new C65152TeR(A012, thu2, new Object[]{thu2.A0C, Integer.valueOf(readInt)}, readInt), thu2);
                                    return true;
                                }
                                synchronized (thu2) {
                                    C63029Sb0 A013 = thu2.A01(readInt);
                                    if (A013 == null) {
                                        if (!thu2.A0B && readInt > thu2.A00 && readInt % 2 != thu2.A01 % 2) {
                                            C63029Sb0 c63029Sb02 = new C63029Sb0(AbstractC63404SjZ.A08(A012), thu2, readInt, false, A1M2);
                                            thu2.A00 = readInt;
                                            Map map = thu2.A0E;
                                            Integer valueOf = Integer.valueOf(readInt);
                                            map.put(valueOf, c63029Sb02);
                                            THU.A0N.execute(new C65145TeK(c65147TeM, c63029Sb02, thu2.A0C, valueOf));
                                        }
                                        return true;
                                    }
                                    A013.A06(AbstractC63404SjZ.A08(A012), A1M2);
                                    return true;
                                }
                            }
                            A1Y = new Object[0];
                            str = "PROTOCOL_ERROR: TYPE_HEADERS streamId == 0";
                            break;
                            break;
                        case 2:
                            if (A00 == 5) {
                                if (readInt != 0) {
                                    interfaceC65701TsN.readInt();
                                    interfaceC65701TsN.readByte();
                                    return true;
                                }
                                A1Y = new Object[0];
                                str = "TYPE_PRIORITY streamId == 0";
                                break;
                            } else {
                                A1Y = AbstractC25228BEl.A1Y(A00);
                                str = "TYPE_PRIORITY length: %d != 5";
                                break;
                            }
                        case 3:
                            if (A00 == 4) {
                                if (readInt != 0) {
                                    int readInt2 = interfaceC65701TsN.readInt();
                                    Integer[] A005 = C05F.A00(11);
                                    int length = A005.length;
                                    int i2 = 0;
                                    while (true) {
                                        if (i2 < length) {
                                            Integer num = A005[i2];
                                            if (AbstractC62284S5d.A00(num) == readInt2) {
                                                if (num != null) {
                                                    THU thu3 = c65147TeM.A01;
                                                    ExecutorService executorService3 = THU.A0N;
                                                    if ((readInt & 1) == 0) {
                                                        THU.A00(new C65144TeJ(thu3, AbstractC25228BEl.A1Z(thu3.A0C, readInt), readInt), thu3);
                                                        return true;
                                                    }
                                                    C63029Sb0 A02 = thu3.A02(readInt);
                                                    if (A02 != null) {
                                                        synchronized (A02) {
                                                            if (A02.A03 == null) {
                                                                A02.A03 = num;
                                                                A02.notifyAll();
                                                            }
                                                        }
                                                        return true;
                                                    }
                                                }
                                            } else {
                                                i2++;
                                            }
                                        }
                                    }
                                    A1Y = AbstractC25228BEl.A1Y(readInt2);
                                    str = "TYPE_RST_STREAM unexpected error code: %d";
                                    break;
                                } else {
                                    A1Y = new Object[0];
                                    str = "TYPE_RST_STREAM streamId == 0";
                                    break;
                                }
                            } else {
                                A1Y = AbstractC25228BEl.A1Y(A00);
                                str = "TYPE_RST_STREAM length: %d != 4";
                                break;
                            }
                        case 4:
                            if (readInt == 0) {
                                if ((A003 & 1) != 0) {
                                    if (A00 != 0) {
                                        A1Y = new Object[0];
                                        str = "FRAME_SIZE_ERROR ack frame should be empty!";
                                        break;
                                    }
                                    return true;
                                }
                                if (A00 % 6 == 0) {
                                    C62719SNj c62719SNj = new C62719SNj();
                                    for (int i3 = 0; i3 < A00; i3 += 6) {
                                        int readShort = interfaceC65701TsN.readShort() & 65535;
                                        int readInt3 = interfaceC65701TsN.readInt();
                                        if (readShort != 2) {
                                            if (readShort != 3) {
                                                if (readShort != 4) {
                                                    if (readShort == 5 && (readInt3 < 16384 || readInt3 > 16777215)) {
                                                        A1Y = AbstractC25228BEl.A1Y(readInt3);
                                                        str = "PROTOCOL_ERROR SETTINGS_MAX_FRAME_SIZE: %s";
                                                        break;
                                                    }
                                                } else {
                                                    readShort = 7;
                                                    if (readInt3 < 0) {
                                                        A1Y = new Object[0];
                                                        str = "PROTOCOL_ERROR SETTINGS_INITIAL_WINDOW_SIZE > 2^31 - 1";
                                                        break;
                                                    }
                                                }
                                            } else {
                                                readShort = 4;
                                            }
                                            c62719SNj.A01(readShort, readInt3);
                                        } else {
                                            if (readInt3 != 0 && readInt3 != 1) {
                                                A1Y = new Object[0];
                                                str = "PROTOCOL_ERROR SETTINGS_ENABLE_PUSH != 0 or 1";
                                                break;
                                            }
                                            c62719SNj.A01(readShort, readInt3);
                                        }
                                    }
                                    THU thu4 = c65147TeM.A01;
                                    ExecutorService executorService4 = THU.A0N;
                                    scheduledExecutorService = thu4.A0G;
                                    c65153TeS = new C65146TeL(c65147TeM, c62719SNj, thu4.A0C);
                                    scheduledExecutorService.execute(c65153TeS);
                                    return true;
                                }
                                A1Y = AbstractC25228BEl.A1Y(A00);
                                str = "TYPE_SETTINGS length %% 6 != 0: %s";
                                break;
                            } else {
                                A1Y = new Object[0];
                                str = "TYPE_SETTINGS streamId != 0";
                                break;
                            }
                            break;
                        case 5:
                            short s3 = 0;
                            if (readInt != 0) {
                                if ((A003 & 8) != 0) {
                                    s3 = (short) InterfaceC65701TsN.A00(interfaceC65701TsN);
                                }
                                int readInt4 = interfaceC65701TsN.readInt() & Integer.MAX_VALUE;
                                ArrayList A014 = A01(A003, A00(A003, A00 - 4, s3), readInt, s3);
                                THU thu5 = c65147TeM.A01;
                                synchronized (thu5) {
                                    java.util.Set set = thu5.A0F;
                                    Integer valueOf2 = Integer.valueOf(readInt4);
                                    if (set.contains(valueOf2)) {
                                        thu5.A03(readInt4, C05F.A01);
                                        return true;
                                    }
                                    set.add(valueOf2);
                                    THU.A00(new C65151TeQ(A014, thu5, new Object[]{thu5.A0C, valueOf2}, readInt4), thu5);
                                    return true;
                                }
                            }
                            A1Y = new Object[0];
                            str = "PROTOCOL_ERROR: TYPE_PUSH_PROMISE streamId == 0";
                            break;
                        case 6:
                            if (A00 == 8) {
                                if (readInt == 0) {
                                    int readInt5 = interfaceC65701TsN.readInt();
                                    int readInt6 = interfaceC65701TsN.readInt();
                                    if ((A003 & 1) != 0) {
                                        THU thu6 = c65147TeM.A01;
                                        synchronized (thu6) {
                                            if (readInt5 == 1) {
                                                ExecutorService executorService5 = THU.A0N;
                                                thu6.A08 = 1 + thu6.A08;
                                            } else if (readInt5 != 2) {
                                                if (readInt5 == 3) {
                                                    ExecutorService executorService6 = THU.A0N;
                                                    thu6.A02 = 1 + thu6.A02;
                                                    thu6.notifyAll();
                                                }
                                            } else {
                                                ExecutorService executorService7 = THU.A0N;
                                                thu6.A06 = 1 + thu6.A06;
                                            }
                                        }
                                        return true;
                                    }
                                    THU thu7 = c65147TeM.A01;
                                    ExecutorService executorService8 = THU.A0N;
                                    scheduledExecutorService = thu7.A0G;
                                    c65153TeS = new C65153TeS(thu7, readInt5, readInt6);
                                    scheduledExecutorService.execute(c65153TeS);
                                    return true;
                                }
                                A1Y = new Object[0];
                                str = "TYPE_PING streamId != 0";
                                break;
                            } else {
                                A1Y = AbstractC25228BEl.A1Y(A00);
                                str = "TYPE_PING length != 8: %s";
                                break;
                            }
                        case 7:
                            if (A00 >= 8) {
                                if (readInt == 0) {
                                    int readInt7 = interfaceC65701TsN.readInt();
                                    int readInt8 = interfaceC65701TsN.readInt();
                                    int i4 = A00 - 8;
                                    Integer[] A006 = C05F.A00(11);
                                    int length2 = A006.length;
                                    while (true) {
                                        if (i < length2) {
                                            Integer num2 = A006[i];
                                            if (AbstractC62284S5d.A00(num2) == readInt8) {
                                                if (num2 != null) {
                                                    if (i4 > 0) {
                                                        interfaceC65701TsN.E7w(i4);
                                                    }
                                                    THU thu8 = c65147TeM.A01;
                                                    synchronized (thu8) {
                                                        Map map2 = thu8.A0E;
                                                        c63029Sb0Arr = (C63029Sb0[]) map2.values().toArray(new C63029Sb0[map2.size()]);
                                                        thu8.A0B = true;
                                                    }
                                                    for (C63029Sb0 c63029Sb03 : c63029Sb0Arr) {
                                                        if (c63029Sb03.A05 > readInt7 && (c63029Sb03.A05 & 1) == 1) {
                                                            Integer num3 = C05F.A0Y;
                                                            synchronized (c63029Sb03) {
                                                                if (c63029Sb03.A03 == null) {
                                                                    c63029Sb03.A03 = num3;
                                                                    c63029Sb03.notifyAll();
                                                                }
                                                            }
                                                            thu8.A02(c63029Sb03.A05);
                                                        }
                                                    }
                                                    break;
                                                }
                                            } else {
                                                i++;
                                            }
                                        }
                                    }
                                    A1Y = AbstractC25228BEl.A1Y(readInt8);
                                    str = "TYPE_GOAWAY unexpected error code: %d";
                                    break;
                                } else {
                                    A1Y = new Object[0];
                                    str = "TYPE_GOAWAY streamId != 0";
                                    break;
                                }
                            } else {
                                A1Y = AbstractC25228BEl.A1Y(A00);
                                str = "TYPE_GOAWAY length < 8: %s";
                                break;
                            }
                        case 8:
                            if (A00 == 4) {
                                long readInt9 = interfaceC65701TsN.readInt() & 2147483647L;
                                if (readInt9 != 0) {
                                    THU thu9 = c65147TeM.A01;
                                    if (readInt == 0) {
                                        synchronized (thu9) {
                                            thu9.A03 += readInt9;
                                            thu9.notifyAll();
                                        }
                                        return true;
                                    }
                                    C63029Sb0 A015 = thu9.A01(readInt);
                                    if (A015 != null) {
                                        synchronized (A015) {
                                            A015.A00 += readInt9;
                                            if (readInt9 > 0) {
                                                A015.notifyAll();
                                            }
                                        }
                                        return true;
                                    }
                                    return true;
                                }
                                A1Y = AbstractC58319PtB.A1Y(readInt9);
                                str = "windowSizeIncrement was 0";
                                break;
                            } else {
                                A1Y = AbstractC25228BEl.A1Y(A00);
                                str = "TYPE_WINDOW_UPDATE length !=4: %s";
                                break;
                            }
                        default:
                            j2 = A00;
                            interfaceC65701TsN.Em6(j2);
                            return true;
                    }
                }
            } else {
                A1Y = AbstractC25228BEl.A1Y(A00);
                str = "FRAME_SIZE_ERROR: %s";
            }
            String[] strArr = C63116SdK.A01;
            throw MSW.A0y(AbstractC58321PtD.A0x(str, A1Y));
        } catch (EOFException unused) {
            return false;
        }
    }

    public static int A00(byte b, int i, short s) {
        if ((b & 8) != 0) {
            i--;
        }
        if (s <= i) {
            return (short) (i - s);
        }
        Object[] A1Z = AbstractC25228BEl.A1Z(Short.valueOf(s), i);
        String[] strArr = C63116SdK.A01;
        throw MSW.A0y(AbstractC58321PtD.A0x("PROTOCOL_ERROR padding %s > remaining length %s", A1Z));
    }

    /* JADX WARN: Code restructure failed: missing block: B:72:0x0125, code lost:
    
        throw X.AbstractC58320PtC.A0i("Header index too large ", r3 + 1);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private java.util.ArrayList A01(byte r8, int r9, int r10, short r11) {
        /*
            Method dump skipped, instructions count: 311
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.THV.A01(byte, int, int, short):java.util.ArrayList");
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.A01.close();
    }

    public THV(InterfaceC65701TsN interfaceC65701TsN) {
        this.A01 = interfaceC65701TsN;
        C64841TWh c64841TWh = new C64841TWh(interfaceC65701TsN);
        this.A02 = c64841TWh;
        this.A00 = new C63195Sex(c64841TWh);
    }
}
