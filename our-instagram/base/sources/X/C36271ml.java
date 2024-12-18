package X;

import com.instagram.common.session.UserSession;
import com.instagram.model.direct.DirectThreadKey;
import com.instagram.realtimeclient.RealtimeProtocol;
import java.util.List;
import java.util.Map;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* renamed from: X.1ml, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C36271ml implements C0KV {
    public static final C36271ml A00 = new C36271ml();

    @Override // X.C0KV
    public final /* bridge */ /* synthetic */ Object AXR(UserSession userSession) {
        int A03 = C0f9.A03(-2106533074);
        int A032 = C0f9.A03(-1465388953);
        C14360o3.A0B(userSession, 0);
        final C2DS A002 = AbstractC28761aE.A00(userSession);
        C4L3 c4l3 = new C4L3(A002) { // from class: X.4LF
            public final C2DS A00;

            {
                C14360o3.A0B(A002, 1);
                this.A00 = A002;
            }

            @Override // X.C4L3
            public final AbstractC1333760g E6D(C5lP c5lP, C125205lR c125205lR, List list, Map map, InterfaceC16620sF interfaceC16620sF, InterfaceC16620sF interfaceC16620sF2, boolean z) {
                C2DU c2du;
                int i;
                ReentrantReadWriteLock.WriteLock writeLock;
                int i2;
                C14360o3.A0B(map, 0);
                C14360o3.A0B(c5lP, 1);
                C14360o3.A0B(c125205lR, 2);
                C14360o3.A0B(interfaceC16620sF, 5);
                Object obj = map.get(RealtimeProtocol.THREAD_ID);
                Object obj2 = map.get(RealtimeProtocol.USER_ID);
                if (obj != null && obj2 != null) {
                    String str = c125205lR.A00;
                    try {
                        if (C14360o3.A0K(str, "add")) {
                            C2ED c2ed = (C2ED) interfaceC16620sF.invoke(obj, c5lP);
                            if (c2ed != null) {
                                C2DS c2ds = this.A00;
                                DirectThreadKey BKb = c2ed.BKb();
                                c2du = (C2DU) c2ds;
                                synchronized (c2du) {
                                    C4GV A0P = c2du.A0P(BKb);
                                    if (A0P != null) {
                                        C81663kb c81663kb = A0P.A0I;
                                        if (((Boolean) c81663kb.A05.getValue()).booleanValue()) {
                                            ReentrantReadWriteLock reentrantReadWriteLock = c81663kb.A03;
                                            ReentrantReadWriteLock.ReadLock readLock = reentrantReadWriteLock.readLock();
                                            int i3 = 0;
                                            if (reentrantReadWriteLock.getWriteHoldCount() == 0) {
                                                i2 = reentrantReadWriteLock.getReadHoldCount();
                                                for (int i4 = 0; i4 < i2; i4++) {
                                                    readLock.unlock();
                                                }
                                            } else {
                                                i2 = 0;
                                            }
                                            writeLock = reentrantReadWriteLock.writeLock();
                                            writeLock.lock();
                                            try {
                                                C80693iy c80693iy = c81663kb.A01;
                                                if (!c80693iy.A22.contains(obj2)) {
                                                    c80693iy.A22.add(obj2);
                                                }
                                                writeLock.unlock();
                                            } finally {
                                                th = th;
                                                while (i3 < i2) {
                                                    readLock.lock();
                                                    i3++;
                                                }
                                                writeLock.unlock();
                                            }
                                        } else {
                                            C80693iy c80693iy2 = c81663kb.A01;
                                            synchronized (c80693iy2) {
                                                if (!c80693iy2.A22.contains(obj2)) {
                                                    c80693iy2.A22.add(obj2);
                                                }
                                            }
                                        }
                                        if (z) {
                                            C2DU.A0F(c2du, A0P);
                                        }
                                        C2Io c2Io = new C2Io(BKb, C05F.A0D, null, null, null, false);
                                        c2du.A06.E4s(c2Io);
                                        c2du.A09.accept(c2Io);
                                    }
                                    return C1333660e.A00;
                                }
                            }
                            return XZZ.A00;
                        }
                        if (C14360o3.A0K(str, "remove")) {
                            C2ED c2ed2 = (C2ED) interfaceC16620sF.invoke(obj, c5lP);
                            if (c2ed2 != null) {
                                C2DS c2ds2 = this.A00;
                                DirectThreadKey BKb2 = c2ed2.BKb();
                                c2du = (C2DU) c2ds2;
                                synchronized (c2du) {
                                    C4GV A0P2 = c2du.A0P(BKb2);
                                    if (A0P2 != null) {
                                        C81663kb c81663kb2 = A0P2.A0I;
                                        if (((Boolean) c81663kb2.A05.getValue()).booleanValue()) {
                                            ReentrantReadWriteLock reentrantReadWriteLock2 = c81663kb2.A03;
                                            ReentrantReadWriteLock.ReadLock readLock2 = reentrantReadWriteLock2.readLock();
                                            int i5 = 0;
                                            if (reentrantReadWriteLock2.getWriteHoldCount() == 0) {
                                                i = reentrantReadWriteLock2.getReadHoldCount();
                                                for (int i6 = 0; i6 < i; i6++) {
                                                    readLock2.unlock();
                                                }
                                            } else {
                                                i = 0;
                                            }
                                            writeLock = reentrantReadWriteLock2.writeLock();
                                            writeLock.lock();
                                            try {
                                                C80693iy c80693iy3 = c81663kb2.A01;
                                                if (c80693iy3.A22.contains(obj2)) {
                                                    c80693iy3.A22.remove(obj2);
                                                }
                                                while (i5 < i) {
                                                    readLock2.lock();
                                                    i5++;
                                                }
                                                writeLock.unlock();
                                            } catch (Throwable th) {
                                                th = th;
                                                while (i5 < i) {
                                                    readLock2.lock();
                                                    i5++;
                                                }
                                                writeLock.unlock();
                                            }
                                        } else {
                                            C80693iy c80693iy4 = c81663kb2.A01;
                                            synchronized (c80693iy4) {
                                                if (c80693iy4.A22.contains(obj2)) {
                                                    c80693iy4.A22.remove(obj2);
                                                }
                                            }
                                        }
                                        if (z) {
                                            C2DU.A0F(c2du, A0P2);
                                        }
                                        C2Io c2Io2 = new C2Io(BKb2, C05F.A0D, null, null, null, false);
                                        c2du.A06.E4s(c2Io2);
                                        c2du.A09.accept(c2Io2);
                                    }
                                    return C1333660e.A00;
                                }
                            }
                            return XZZ.A00;
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                return C1333860h.A00;
            }
        };
        C0f9.A0A(-2135236261, A032);
        C0f9.A0A(1481329105, A03);
        return c4l3;
    }
}
