package X;

import com.instagram.common.session.UserSession;
import com.instagram.model.direct.DirectThreadKey;
import com.instagram.realtimeclient.RealtimeProtocol;
import java.io.IOException;
import java.util.List;
import java.util.Map;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* renamed from: X.1nH, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C36581nH implements C0KV {
    public static final C36581nH A00 = new C36581nH();

    @Override // X.C0KV
    public final /* bridge */ /* synthetic */ Object AXR(final UserSession userSession) {
        int A03 = C0f9.A03(1988946559);
        int A032 = C0f9.A03(-1419793103);
        C14360o3.A0B(userSession, 0);
        final C2DS A002 = AbstractC28761aE.A00(userSession);
        C4L3 c4l3 = new C4L3(userSession, A002) { // from class: X.4Ll
            public final UserSession A00;
            public final C2DS A01;

            {
                C14360o3.A0B(A002, 2);
                this.A00 = userSession;
                this.A01 = A002;
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r3v0, types: [X.0sF, java.lang.Object] */
            /* JADX WARN: Type inference failed for: r3v4, types: [X.4Ll] */
            @Override // X.C4L3
            public final AbstractC1333760g E6D(C5lP c5lP, C125205lR c125205lR, List list, Map map, InterfaceC16620sF interfaceC16620sF, InterfaceC16620sF interfaceC16620sF2, boolean z) {
                C81663kb c81663kb;
                InterfaceC09390do interfaceC09390do;
                C80693iy c80693iy;
                ReentrantReadWriteLock.ReadLock readLock;
                int i;
                ReentrantReadWriteLock.WriteLock writeLock;
                int i2;
                C18920wW c18920wW;
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
                        C1118752z parseFromJson = AbstractC1118652y.parseFromJson(C07950bF.A04.A01(obj.A00, str));
                        if (parseFromJson != null) {
                            C2DS c2ds = obj.A01;
                            DirectThreadKey BKb = c2ed.BKb();
                            C2DU c2du = (C2DU) c2ds;
                            C4GV A0P = c2du.A0P(BKb);
                            if (A0P != null) {
                                String str2 = BKb.A00;
                                if (str2 != null && (c18920wW = c2du.A05) != null) {
                                    boolean z2 = true;
                                    if (!parseFromJson.A08) {
                                        z2 = false;
                                    }
                                    if (A0P.A0I.Ay8() != z2) {
                                        C162337Ov.A0d(c18920wW, str2, "delta", z2);
                                    }
                                }
                                synchronized (A0P) {
                                    try {
                                        c81663kb = A0P.A0I;
                                        interfaceC09390do = c81663kb.A05;
                                        if (((Boolean) interfaceC09390do.getValue()).booleanValue()) {
                                            ReentrantReadWriteLock reentrantReadWriteLock = c81663kb.A03;
                                            readLock = reentrantReadWriteLock.readLock();
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
                                                c80693iy = c81663kb.A01;
                                                c80693iy.A1R = parseFromJson;
                                            } catch (Throwable th) {
                                                while (i3 < i) {
                                                    readLock.lock();
                                                    i3++;
                                                }
                                                writeLock.unlock();
                                                throw th;
                                            }
                                        } else {
                                            c80693iy = c81663kb.A01;
                                            synchronized (c80693iy) {
                                                try {
                                                    c80693iy.A1R = parseFromJson;
                                                } finally {
                                                }
                                            }
                                        }
                                    } catch (Throwable th2) {
                                        throw th2;
                                    }
                                }
                                if (((Boolean) interfaceC09390do.getValue()).booleanValue()) {
                                    ReentrantReadWriteLock reentrantReadWriteLock2 = c81663kb.A03;
                                    readLock = reentrantReadWriteLock2.readLock();
                                    int i5 = 0;
                                    if (reentrantReadWriteLock2.getWriteHoldCount() == 0) {
                                        i = reentrantReadWriteLock2.getReadHoldCount();
                                        for (int i6 = 0; i6 < i; i6++) {
                                            readLock.unlock();
                                        }
                                    } else {
                                        i = 0;
                                    }
                                    writeLock = reentrantReadWriteLock2.writeLock();
                                    writeLock.lock();
                                    try {
                                        c80693iy.A1R = parseFromJson;
                                        c80693iy.A16.A03(parseFromJson);
                                        while (i5 < i) {
                                            readLock.lock();
                                            i5++;
                                        }
                                        writeLock.unlock();
                                        C2Io c2Io = new C2Io(BKb, C05F.A0D, null, null, null, false);
                                        c2du.A06.E4s(c2Io);
                                        C2DU.A0F(c2du, A0P);
                                        c2du.A09.accept(c2Io);
                                    } finally {
                                        while (i5 < i) {
                                            readLock.lock();
                                            i5++;
                                        }
                                        writeLock.unlock();
                                    }
                                } else {
                                    synchronized (c80693iy) {
                                        try {
                                            c80693iy.A1R = parseFromJson;
                                            c80693iy.A16.A03(parseFromJson);
                                        } catch (Throwable th3) {
                                            throw th3;
                                        }
                                    }
                                    C2Io c2Io2 = new C2Io(BKb, C05F.A0D, null, null, null, false);
                                    c2du.A06.E4s(c2Io2);
                                    C2DU.A0F(c2du, A0P);
                                    c2du.A09.accept(c2Io2);
                                }
                            }
                        }
                        return C1333660e.A00;
                    } catch (IOException e) {
                        String simpleName = obj.getClass().getSimpleName();
                        C0K8.A0F(simpleName, "Invalid disappearingModeMetadata payload", e);
                        C14360o3.A07(simpleName);
                        return new C1334060j(e, simpleName, "Invalid disappearingModeMetadata payload");
                    }
                }
                return C1333860h.A00;
            }
        };
        C0f9.A0A(-578312351, A032);
        C0f9.A0A(-785344998, A03);
        return c4l3;
    }
}
