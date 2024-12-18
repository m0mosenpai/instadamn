package X;

import com.instagram.common.session.UserSession;
import com.instagram.model.direct.DirectThreadKey;
import com.instagram.realtimeclient.RealtimeProtocol;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* renamed from: X.1mz, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C36411mz implements C0KV {
    public static final C36411mz A00 = new C36411mz();

    @Override // X.C0KV
    public final /* bridge */ /* synthetic */ Object AXR(UserSession userSession) {
        int A03 = C0f9.A03(1309414430);
        int A032 = C0f9.A03(599063374);
        C14360o3.A0B(userSession, 0);
        final C2DS A002 = AbstractC28761aE.A00(userSession);
        C4L3 c4l3 = new C4L3(A002) { // from class: X.4LV
            public final C2DS A00;

            {
                C14360o3.A0B(A002, 1);
                this.A00 = A002;
            }

            @Override // X.C4L3
            public final AbstractC1333760g E6D(C5lP c5lP, C125205lR c125205lR, List list, Map map, InterfaceC16620sF interfaceC16620sF, InterfaceC16620sF interfaceC16620sF2, boolean z) {
                Object c09540e5;
                C125805mV c125805mV;
                C2Io c2Io;
                C14360o3.A0B(map, 0);
                C14360o3.A0B(c5lP, 1);
                C14360o3.A0B(c125205lR, 2);
                C14360o3.A0B(interfaceC16620sF, 5);
                Object obj = map.get(RealtimeProtocol.THREAD_ID);
                String str = (String) map.get(RealtimeProtocol.ITEM_ID);
                if (obj != null && str != null && C14360o3.A0K(c125205lR.A00, "replace")) {
                    C2ED c2ed = (C2ED) interfaceC16620sF.invoke(obj, c5lP);
                    if (c2ed == null) {
                        return XZZ.A00;
                    }
                    try {
                        String str2 = c125205lR.A02;
                        C14360o3.A06(str2);
                        c09540e5 = AbstractC003100w.A0k(10, str2);
                    } catch (Throwable th) {
                        c09540e5 = new C09540e5(th);
                    }
                    Throwable A003 = C09550e6.A00(c09540e5);
                    if (A003 != null) {
                        C0w9.A06("PolicyViolation_IrisSyncMessageProcessor", "Invalid policy violation timestampMs format", A003);
                        c09540e5 = null;
                    }
                    Number number = (Number) c09540e5;
                    if (number == null) {
                        C0w9.A03("PolicyViolation_IrisSyncMessageProcessor", "timestamp is missing for policy violation reviewed");
                        return new C1334160k(new Exception("timestamp is missing for policy violation reviewed"), "PolicyViolation_IrisSyncMessageProcessor", "timestamp is missing for policy violation reviewed");
                    }
                    C2DS c2ds = this.A00;
                    DirectThreadKey BKb = c2ed.BKb();
                    long longValue = number.longValue();
                    C2DU c2du = (C2DU) c2ds;
                    C4GV A0P = c2du.A0P(BKb);
                    if (A0P == null) {
                        C0w9.A03("PolicyViolation_DirectThreadStoreImpl", "Entry should exist before function call");
                    } else {
                        synchronized (A0P) {
                            C83403nh A0I = A0P.A0I(str);
                            if (A0I == null) {
                                C18950wb.A01.AEp("PolicyViolation_DirectThreadEntry policy violation reported message is missing from thread entry", 20134884).report();
                                c2Io = null;
                            } else {
                                synchronized (A0I) {
                                    C125805mV c125805mV2 = A0I.A0W;
                                    if (c125805mV2 == null) {
                                        c125805mV = new C125805mV(longValue, 0L, "UNKNOWN");
                                    } else {
                                        c125805mV = new C125805mV(longValue, c125805mV2.A01, c125805mV2.A00());
                                    }
                                    A0I.A0W = c125805mV;
                                    A0I.A2C = true;
                                }
                                c2Io = new C2Io(A0P.A0I.BKb(), C05F.A0K, null, null, Collections.singletonList(A0I), false);
                            }
                        }
                        C2DU.A0E(c2Io, c2du, z);
                    }
                    return C1333660e.A00;
                }
                C0w9.A03("PolicyViolation_IrisSyncMessageProcessor", "threadId/messageId is missing from policy violation reviewed path or operation is not replace");
                return C1333860h.A00;
            }
        };
        C0f9.A0A(-1391968347, A032);
        C0f9.A0A(1676613976, A03);
        return c4l3;
    }
}
