package X;

import com.google.common.collect.ImmutableList;
import com.instagram.common.session.UserSession;
import com.instagram.realtimeclient.RealtimeProtocol;
import java.io.IOException;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* renamed from: X.1mh, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C36231mh implements C0KV {
    public static final C36231mh A00 = new C36231mh();

    @Override // X.C0KV
    public final /* bridge */ /* synthetic */ Object AXR(final UserSession userSession) {
        int A03 = C0f9.A03(-1239408945);
        int A032 = C0f9.A03(61141219);
        C14360o3.A0B(userSession, 0);
        final C2DS A002 = AbstractC28761aE.A00(userSession);
        C4L3 c4l3 = new C4L3(userSession, A002) { // from class: X.4LB
            public final UserSession A00;
            public final C2DS A01;

            {
                C14360o3.A0B(A002, 2);
                this.A00 = userSession;
                this.A01 = A002;
            }

            @Override // X.C4L3
            public final AbstractC1333760g E6D(C5lP c5lP, C125205lR c125205lR, List list, Map map, InterfaceC16620sF interfaceC16620sF, InterfaceC16620sF interfaceC16620sF2, boolean z) {
                C2Io c2Io;
                C910143t c910143t;
                Integer num;
                String str;
                C910143t c910143t2;
                C910143t c910143t3;
                C910143t c910143t4;
                InterfaceC109094vY interfaceC109094vY;
                C2Io c2Io2;
                C114665Fw c114665Fw;
                C914346k BaW;
                C914346k AfM;
                C2Io c2Io3;
                C14360o3.A0B(map, 0);
                C14360o3.A0B(c5lP, 1);
                C14360o3.A0B(c125205lR, 2);
                C14360o3.A0B(interfaceC16620sF, 5);
                Object obj = map.get(RealtimeProtocol.THREAD_ID);
                String str2 = (String) map.get(RealtimeProtocol.ITEM_ID);
                if (obj != null && str2 != null) {
                    if (C14360o3.A0K(c125205lR.A00, "replace")) {
                        C2ED c2ed = (C2ED) interfaceC16620sF.invoke(obj, c5lP);
                        if (c2ed == null) {
                            return XZZ.A00;
                        }
                        C2DS c2ds = this.A01;
                        if (c2ds.BSh(c2ed.BKb(), str2) != null) {
                            UserSession userSession2 = this.A00;
                            if (AbstractC47010KqT.A00(userSession2).booleanValue()) {
                                String C7I = c2ed.C7I();
                                if (C7I != null) {
                                    C83693oE c83693oE = new C83693oE(C7I);
                                    try {
                                        FM3 parseFromJson = F74.parseFromJson(C16V.A00(c125205lR.A02));
                                        C14360o3.A07(parseFromJson);
                                        C2EY c2ey = parseFromJson.A01;
                                        try {
                                            if (c2ey == C2EY.A1i) {
                                                List list2 = parseFromJson.A02;
                                                C2DU c2du = (C2DU) c2ds;
                                                C4GV A0P = c2du.A0P(AbstractC140956Yx.A01(AbstractC140946Yw.A01(c83693oE)));
                                                if (A0P == null) {
                                                    C0w9.A03("Null thread entry", "Entry should exist before function call");
                                                } else {
                                                    synchronized (A0P) {
                                                        C83403nh A0I = A0P.A0I(str2);
                                                        if (A0I == null) {
                                                            C18950wb.A01.AEp("Message is missing from thread entry", 20134884).report();
                                                            c2Io3 = null;
                                                        } else {
                                                            A0I.A1L(list2);
                                                            c2Io3 = new C2Io(A0P.A0I.BKb(), C05F.A0C, null, null, Collections.singletonList(A0I), false);
                                                        }
                                                    }
                                                    if (c2Io3 != null) {
                                                        c2du.A06.E4s(c2Io3);
                                                    }
                                                }
                                            } else if (c2ey == C2EY.A1C) {
                                                C38321qM c38321qM = parseFromJson.A00;
                                                if (c38321qM != null) {
                                                    interfaceC109094vY = c38321qM.BRN();
                                                } else {
                                                    interfaceC109094vY = null;
                                                }
                                                List list3 = parseFromJson.A02;
                                                C2DU c2du2 = (C2DU) c2ds;
                                                synchronized (c2du2) {
                                                    try {
                                                        C4GV A0P2 = c2du2.A0P(AbstractC140956Yx.A01(AbstractC140946Yw.A01(c83693oE)));
                                                        if (A0P2 == null) {
                                                            C0w9.A03("Null thread entry", "Entry should exist before function call");
                                                        } else {
                                                            synchronized (A0P2) {
                                                                C83403nh A0I2 = A0P2.A0I(str2);
                                                                if (A0I2 == null) {
                                                                    C18950wb.A01.AEp("Message is missing from thread entry", 20134884).report();
                                                                    c2Io2 = null;
                                                                } else {
                                                                    C38321qM c38321qM2 = A0I2.A0s;
                                                                    if (c38321qM2 != null) {
                                                                        if (interfaceC109094vY == null) {
                                                                            C69728VuN c69728VuN = new C69728VuN(new C109084vX(null, null, null, null, null, null, null, null, null, null, null, null, null, null));
                                                                            c69728VuN.A07 = 5;
                                                                            interfaceC109094vY = c69728VuN.A01();
                                                                            c38321qM2 = A0I2.A0s;
                                                                        }
                                                                        C114665Fw c114665Fw2 = null;
                                                                        if (interfaceC109094vY == null || (AfM = interfaceC109094vY.AfM()) == null) {
                                                                            c114665Fw = null;
                                                                        } else {
                                                                            c114665Fw = AbstractC40567Hyn.A00(AfM);
                                                                        }
                                                                        c38321qM2.A06 = c114665Fw;
                                                                        if (interfaceC109094vY != null && (BaW = interfaceC109094vY.BaW()) != null) {
                                                                            c114665Fw2 = AbstractC40567Hyn.A00(BaW);
                                                                        }
                                                                        c38321qM2.A07 = c114665Fw2;
                                                                        c38321qM2.A0C.EYy(interfaceC109094vY);
                                                                        A0I2.A1L(list3);
                                                                    }
                                                                    c2Io2 = new C2Io(A0P2.A0I.BKb(), C05F.A0C, null, null, Collections.singletonList(A0I2), false);
                                                                }
                                                            }
                                                            if (c2Io2 != null) {
                                                                c2du2.A06.E4s(c2Io2);
                                                            }
                                                        }
                                                    } finally {
                                                    }
                                                }
                                            } else if (c2ey == C2EY.A1u) {
                                                List list4 = parseFromJson.A03;
                                                List list5 = parseFromJson.A02;
                                                C2DU c2du3 = (C2DU) c2ds;
                                                C4GV A0P3 = c2du3.A0P(AbstractC140956Yx.A01(AbstractC140946Yw.A01(c83693oE)));
                                                if (A0P3 == null) {
                                                    C0w9.A03("Null thread entry", "Entry should exist before function call");
                                                } else {
                                                    synchronized (A0P3) {
                                                        C83403nh A0I3 = A0P3.A0I(str2);
                                                        if (A0I3 == null) {
                                                            C18950wb.A01.AEp("Message is missing from thread entry", 20134884).report();
                                                            c2Io = null;
                                                        } else {
                                                            if (A0I3.A0H() != null) {
                                                                synchronized (XkH.A00) {
                                                                    try {
                                                                        ImmutableList A0H = A0I3.A0H();
                                                                        Integer num2 = null;
                                                                        if (A0H != null) {
                                                                            List A0a = AbstractC001800i.A0a(A0H);
                                                                            if (!A0a.isEmpty() && (c910143t = (C910143t) A0a.get(0)) != null) {
                                                                                if (list4 == null || (c910143t4 = (C910143t) list4.get(0)) == null) {
                                                                                    num = null;
                                                                                } else {
                                                                                    num = c910143t4.A0i;
                                                                                }
                                                                                c910143t.A0i = num;
                                                                                if (list4 == null || (c910143t3 = (C910143t) list4.get(0)) == null) {
                                                                                    str = null;
                                                                                } else {
                                                                                    str = c910143t3.A1G;
                                                                                }
                                                                                c910143t.A1G = str;
                                                                                if (list4 != null && (c910143t2 = (C910143t) list4.get(0)) != null) {
                                                                                    num2 = c910143t2.A0j;
                                                                                }
                                                                                c910143t.A0j = num2;
                                                                            }
                                                                            ImmutableList copyOf = ImmutableList.copyOf((Collection) A0a);
                                                                            synchronized (A0I3) {
                                                                                try {
                                                                                    A0I3.A26 = copyOf;
                                                                                    A0I3.A2C = true;
                                                                                } catch (Throwable th) {
                                                                                    throw th;
                                                                                }
                                                                            }
                                                                            A0I3.A1L(list5);
                                                                        }
                                                                    } finally {
                                                                    }
                                                                }
                                                            }
                                                            c2Io = new C2Io(A0P3.A0I.BKb(), C05F.A0C, null, null, Collections.singletonList(A0I3), false);
                                                        }
                                                    }
                                                    if (c2Io != null) {
                                                        c2du3.A06.E4s(c2Io);
                                                    }
                                                }
                                            }
                                        } catch (Throwable th2) {
                                            throw th2;
                                        }
                                    } catch (IOException e) {
                                        C1ZX A01 = C1ZV.A00(userSession2).A01(C05F.A0N, C05F.A0K, false);
                                        A01.A03("error_message:", "Invalid MessageMediaMisinfo format");
                                        A01.A05(e);
                                        A01.A00();
                                        String simpleName = getClass().getSimpleName();
                                        C14360o3.A07(simpleName);
                                        return new C1334060j(e, simpleName, "Invalid MessageMediaMisinfo format");
                                    }
                                }
                            }
                            return C1333660e.A00;
                        }
                        return new C220139nz("UpdateMessageMediaMisinifoDeltaProcessor", "No cached message to update");
                    }
                    return C1333860h.A00;
                }
                String A0R = AnonymousClass001.A0R("Invalid operation: ", c125205lR.A00);
                return new C1334160k(new Exception(A0R), "UpdateMessageMediaMisinifoDeltaProcessor", A0R);
            }
        };
        C0f9.A0A(1359247631, A032);
        C0f9.A0A(1118723681, A03);
        return c4l3;
    }
}
