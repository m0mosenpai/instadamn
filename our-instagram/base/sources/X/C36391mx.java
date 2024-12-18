package X;

import com.instagram.common.session.UserSession;
import com.instagram.model.direct.DirectThreadKey;
import com.instagram.realtimeclient.RealtimeProtocol;
import java.util.List;
import java.util.Map;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* renamed from: X.1mx, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C36391mx implements C0KV {
    public static final C36391mx A00 = new C36391mx();

    @Override // X.C0KV
    public final /* bridge */ /* synthetic */ Object AXR(UserSession userSession) {
        int A03 = C0f9.A03(634275155);
        int A032 = C0f9.A03(1847750981);
        C14360o3.A0B(userSession, 0);
        final C2DS A002 = AbstractC28761aE.A00(userSession);
        C4L3 c4l3 = new C4L3(A002) { // from class: X.4LT
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
                int i;
                C125805mV c125805mV2;
                C14360o3.A0B(map, 0);
                C14360o3.A0B(c5lP, 1);
                C14360o3.A0B(c125205lR, 2);
                C14360o3.A0B(interfaceC16620sF, 5);
                Object obj = map.get(RealtimeProtocol.THREAD_ID);
                if (obj != null && C14360o3.A0K(c125205lR.A00, "replace")) {
                    C2ED c2ed = (C2ED) interfaceC16620sF.invoke(obj, c5lP);
                    if (c2ed == null) {
                        return XZZ.A00;
                    }
                    try {
                        String str = c125205lR.A02;
                        C14360o3.A06(str);
                        c09540e5 = AbstractC003100w.A0k(10, str);
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
                        C0w9.A03("PolicyViolation_Thread_IrisSyncMessageProcessor", "timestamp is missing for policy violation reported");
                        return new C1334160k(new Exception("timestamp is missing for policy violation reported"), "PolicyViolation_Thread_IrisSyncMessageProcessor", "timestamp is missing for policy violation reported");
                    }
                    C2DS c2ds = this.A00;
                    DirectThreadKey BKb = c2ed.BKb();
                    long longValue = number.longValue();
                    C2DU c2du = (C2DU) c2ds;
                    C4GV A0P = c2du.A0P(BKb);
                    if (A0P == null) {
                        C0w9.A03("PolicyViolation_THREAD_DirectThreadStoreImpl", "Entry should exist before function call");
                    } else {
                        synchronized (A0P) {
                            C81663kb c81663kb = A0P.A0I;
                            if (((Boolean) c81663kb.A05.getValue()).booleanValue()) {
                                ReentrantReadWriteLock reentrantReadWriteLock = c81663kb.A03;
                                ReentrantReadWriteLock.ReadLock readLock = reentrantReadWriteLock.readLock();
                                int i2 = 0;
                                if (reentrantReadWriteLock.getWriteHoldCount() == 0) {
                                    i = reentrantReadWriteLock.getReadHoldCount();
                                    for (int i3 = 0; i3 < i; i3++) {
                                        readLock.unlock();
                                    }
                                } else {
                                    i = 0;
                                }
                                ReentrantReadWriteLock.WriteLock writeLock = reentrantReadWriteLock.writeLock();
                                writeLock.lock();
                                try {
                                    C80693iy c80693iy = c81663kb.A01;
                                    C125805mV c125805mV3 = c80693iy.A0s;
                                    if (c125805mV3 == null) {
                                        c125805mV2 = new C125805mV(0L, longValue, "UNKNOWN");
                                    } else {
                                        c125805mV2 = new C125805mV(c125805mV3.A00, longValue, c125805mV3.A00());
                                    }
                                    c80693iy.A0s = c125805mV2;
                                    while (i2 < i) {
                                        readLock.lock();
                                        i2++;
                                    }
                                    writeLock.unlock();
                                    c2Io = new C2Io(c81663kb.BKb(), C05F.A0K, null, null, null, false);
                                } catch (Throwable th2) {
                                    while (i2 < i) {
                                        readLock.lock();
                                        i2++;
                                    }
                                    writeLock.unlock();
                                    throw th2;
                                }
                            } else {
                                C80693iy c80693iy2 = c81663kb.A01;
                                synchronized (c80693iy2) {
                                    try {
                                        C125805mV c125805mV4 = c80693iy2.A0s;
                                        if (c125805mV4 == null) {
                                            c125805mV = new C125805mV(0L, longValue, "UNKNOWN");
                                        } else {
                                            c125805mV = new C125805mV(c125805mV4.A00, longValue, c125805mV4.A00());
                                        }
                                        c80693iy2.A0s = c125805mV;
                                    } finally {
                                    }
                                }
                                c2Io = new C2Io(c81663kb.BKb(), C05F.A0K, null, null, null, false);
                            }
                        }
                        C2DU.A0E(c2Io, c2du, z);
                    }
                    return C1333660e.A00;
                }
                C0w9.A03("PolicyViolation_Thread_IrisSyncMessageProcessor", "threadId is missing from policy violation reported path or operation is not replace");
                return C1333860h.A00;
            }
        };
        C0f9.A0A(355183720, A032);
        C0f9.A0A(1959143467, A03);
        return c4l3;
    }
}
