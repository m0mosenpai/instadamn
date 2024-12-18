package X;

import com.instagram.common.session.UserSession;
import com.instagram.model.direct.DirectThreadKey;
import com.instagram.realtimeclient.RealtimeProtocol;
import java.io.IOException;
import java.util.List;
import java.util.Map;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* renamed from: X.1nI, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C36591nI implements C0KV {
    public static final C36591nI A00 = new C36591nI();

    @Override // X.C0KV
    public final /* bridge */ /* synthetic */ Object AXR(final UserSession userSession) {
        int A03 = C0f9.A03(45578104);
        int A032 = C0f9.A03(-1694485712);
        C14360o3.A0B(userSession, 0);
        final C2DS A002 = AbstractC28761aE.A00(userSession);
        C4L3 c4l3 = new C4L3(userSession, A002) { // from class: X.4Lm
            public final UserSession A00;
            public final C2DS A01;

            {
                C14360o3.A0B(A002, 2);
                this.A00 = userSession;
                this.A01 = A002;
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r3v0, types: [X.0sF, java.lang.Object] */
            /* JADX WARN: Type inference failed for: r3v4, types: [X.4Lm] */
            @Override // X.C4L3
            public final AbstractC1333760g E6D(C5lP c5lP, C125205lR c125205lR, List list, Map map, InterfaceC16620sF interfaceC16620sF, InterfaceC16620sF interfaceC16620sF2, boolean z) {
                int i;
                C14360o3.A0B(map, 0);
                C14360o3.A0B(c5lP, 1);
                C14360o3.A0B(c125205lR, 2);
                Object obj = interfaceC16620sF;
                C14360o3.A0B(obj, 5);
                Object obj2 = map.get(RealtimeProtocol.THREAD_ID);
                if (obj2 != null && C14360o3.A0K(c125205lR.A00, "replace")) {
                    String str = c125205lR.A02;
                    C14360o3.A06(str);
                    C2ED c2ed = (C2ED) obj.invoke(obj2, c5lP);
                    if (c2ed == null) {
                        return XZZ.A00;
                    }
                    try {
                        obj = this;
                        FGI parseFromJson = AbstractC34128F4e.parseFromJson(C07950bF.A04.A01(obj.A00, str));
                        if (parseFromJson != null) {
                            C2DS c2ds = obj.A01;
                            DirectThreadKey BKb = c2ed.BKb();
                            C2DU c2du = (C2DU) c2ds;
                            C4GV A0P = c2du.A0P(BKb);
                            if (A0P != null) {
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
                                            C81543kP c81543kP = c81663kb.A01.A0t;
                                            if (c81543kP != null) {
                                                c81543kP.A0L = parseFromJson.A00;
                                            }
                                            while (i2 < i) {
                                                readLock.lock();
                                                i2++;
                                            }
                                            writeLock.unlock();
                                        } catch (Throwable th) {
                                            while (i2 < i) {
                                                readLock.lock();
                                                i2++;
                                            }
                                            writeLock.unlock();
                                            throw th;
                                        }
                                    } else {
                                        C80693iy c80693iy = c81663kb.A01;
                                        synchronized (c80693iy) {
                                            try {
                                                C81543kP c81543kP2 = c80693iy.A0t;
                                                if (c81543kP2 != null) {
                                                    c81543kP2.A0L = parseFromJson.A00;
                                                }
                                            } finally {
                                            }
                                        }
                                    }
                                }
                                C2Io c2Io = new C2Io(BKb, C05F.A0D, null, null, null, false);
                                c2du.A06.E4s(c2Io);
                                C2DU.A0F(c2du, A0P);
                                c2du.A09.accept(c2Io);
                            }
                        }
                        return C1333660e.A00;
                    } catch (IOException e) {
                        String simpleName = obj.getClass().getSimpleName();
                        C0K8.A0F(simpleName, "Invalid channel hide setting payload", e);
                        C14360o3.A07(simpleName);
                        return new C1334060j(e, simpleName, "Invalid channel hide setting payload");
                    }
                }
                return C1333860h.A00;
            }
        };
        C0f9.A0A(2101026828, A032);
        C0f9.A0A(1696250461, A03);
        return c4l3;
    }
}
