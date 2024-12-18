package X;

import com.instagram.common.session.UserSession;
import com.instagram.model.direct.DirectThreadKey;
import com.instagram.realtimeclient.RealtimeProtocol;
import java.io.IOException;
import java.util.List;
import java.util.Map;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* renamed from: X.1nL, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C36621nL implements C0KV {
    public static final C36621nL A00 = new C36621nL();

    @Override // X.C0KV
    public final /* bridge */ /* synthetic */ Object AXR(final UserSession userSession) {
        int A03 = C0f9.A03(-1750305583);
        int A032 = C0f9.A03(1869012625);
        C14360o3.A0B(userSession, 0);
        final C2DS A002 = AbstractC28761aE.A00(userSession);
        C4L3 c4l3 = new C4L3(userSession, A002) { // from class: X.4Lp
            public final UserSession A00;
            public final C2DS A01;

            {
                C14360o3.A0B(A002, 2);
                this.A00 = userSession;
                this.A01 = A002;
            }

            @Override // X.C4L3
            public final AbstractC1333760g E6D(C5lP c5lP, C125205lR c125205lR, List list, Map map, InterfaceC16620sF interfaceC16620sF, InterfaceC16620sF interfaceC16620sF2, boolean z) {
                C133205zm c133205zm;
                int i;
                C14360o3.A0B(map, 0);
                C14360o3.A0B(c125205lR, 2);
                String str = (String) map.get(RealtimeProtocol.THREAD_ID);
                if (str != null && C14360o3.A0K(c125205lR.A00, "replace")) {
                    String str2 = c125205lR.A02;
                    C14360o3.A06(str2);
                    try {
                        DirectThreadKey directThreadKey = new DirectThreadKey(str, null);
                        C126455ng parseFromJson = AbstractC126445nf.parseFromJson(C07950bF.A04.A01(this.A00, str2));
                        if (parseFromJson != null && (c133205zm = parseFromJson.A0h) != null) {
                            C2DU c2du = (C2DU) this.A01;
                            C4GV A0P = c2du.A0P(directThreadKey);
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
                                            c81663kb.A01.A0z = c133205zm;
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
                                                c80693iy.A0z = c133205zm;
                                            } finally {
                                            }
                                        }
                                    }
                                }
                                C2Io c2Io = new C2Io(directThreadKey, C05F.A0D, null, null, null, false);
                                c2du.A06.E4s(c2Io);
                                c2du.A09.accept(c2Io);
                            }
                            return C1333660e.A00;
                        }
                        String simpleName = getClass().getSimpleName();
                        C14360o3.A07(simpleName);
                        return new C1334060j(new Exception("Invalid instamadilloCutoverMetadata payload"), simpleName, "Invalid instamadilloCutoverMetadata payload");
                    } catch (IOException e) {
                        String simpleName2 = getClass().getSimpleName();
                        C0K8.A0F(simpleName2, "Invalid instamadilloCutoverMetadata payload", e);
                        C14360o3.A07(simpleName2);
                        return new C1334060j(e, simpleName2, "Invalid instamadilloCutoverMetadata payload");
                    }
                }
                return C1333860h.A00;
            }
        };
        C0f9.A0A(299983997, A032);
        C0f9.A0A(1083478261, A03);
        return c4l3;
    }
}
