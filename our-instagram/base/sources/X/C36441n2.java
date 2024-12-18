package X;

import com.instagram.common.session.UserSession;
import com.instagram.model.direct.DirectThreadKey;
import com.instagram.realtimeclient.RealtimeProtocol;
import java.io.IOException;
import java.util.List;
import java.util.Map;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* renamed from: X.1n2, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C36441n2 implements C0KV {
    public static final C36441n2 A00 = new C36441n2();

    @Override // X.C0KV
    public final /* bridge */ /* synthetic */ Object AXR(final UserSession userSession) {
        int A03 = C0f9.A03(1304899047);
        int A032 = C0f9.A03(2040851713);
        C14360o3.A0B(userSession, 0);
        final C2DS A002 = AbstractC28761aE.A00(userSession);
        C4L3 c4l3 = new C4L3(userSession, A002) { // from class: X.4LY
            public final UserSession A00;
            public final C2DS A01;

            {
                C14360o3.A0B(A002, 2);
                this.A00 = userSession;
                this.A01 = A002;
            }

            @Override // X.C4L3
            public final AbstractC1333760g E6D(C5lP c5lP, C125205lR c125205lR, List list, Map map, InterfaceC16620sF interfaceC16620sF, InterfaceC16620sF interfaceC16620sF2, boolean z) {
                int i;
                C14360o3.A0B(map, 0);
                C14360o3.A0B(c125205lR, 2);
                String str = (String) map.get(RealtimeProtocol.THREAD_ID);
                if (str != null) {
                    String str2 = c125205lR.A00;
                    if (C14360o3.A0K(str2, "add") || C14360o3.A0K(str2, "replace")) {
                        String str3 = c125205lR.A02;
                        C14360o3.A06(str3);
                        if (str3.length() > 0) {
                            try {
                                C07880b8 c07880b8 = C07950bF.A04;
                                UserSession userSession2 = this.A00;
                                String str4 = c125205lR.A02;
                                C14360o3.A06(str4);
                                C51593Mql parseFromJson = AbstractC50571MUc.parseFromJson(c07880b8.A01(userSession2, str4));
                                if (parseFromJson != null && parseFromJson.A02 > 0) {
                                    C2DS c2ds = this.A01;
                                    C83693oE c83693oE = new C83693oE(str);
                                    C2DU c2du = (C2DU) c2ds;
                                    synchronized (c2du) {
                                        DirectThreadKey A01 = AbstractC140956Yx.A01(c83693oE);
                                        C4GV A04 = c2du.A0F.A04(A01);
                                        if (A04 != null) {
                                            C81663kb c81663kb = A04.A0I;
                                            C14360o3.A07(c81663kb);
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
                                                    c81663kb.A01.A0V = parseFromJson;
                                                    c2du.FCS(A01);
                                                } finally {
                                                    while (i2 < i) {
                                                        readLock.lock();
                                                        i2++;
                                                    }
                                                    writeLock.unlock();
                                                }
                                            } else {
                                                C80693iy c80693iy = c81663kb.A01;
                                                synchronized (c80693iy) {
                                                    try {
                                                        c80693iy.A0V = parseFromJson;
                                                    } catch (Throwable th) {
                                                        throw th;
                                                    }
                                                }
                                                c2du.FCS(A01);
                                            }
                                        }
                                    }
                                    return C1333660e.A00;
                                }
                                return new C1334160k(new Exception("Failed to parse value as TakedownThreadMetadata"), "TakedownThreadMetadataDeltaProcessor", "Failed to parse value as TakedownThreadMetadata");
                            } catch (IOException e) {
                                C0K8.A0F(getClass().getSimpleName(), "Invalid takedown thread payload", e);
                                return new C1334060j(e, "BatchedPollsMessageDeltaProcessor", "Invalid takedown thread payload");
                            }
                        }
                        return new C1334160k(new Exception("Failed to parse value as TakedownThreadMetadata"), "TakedownThreadMetadataDeltaProcessor", "Failed to parse value as TakedownThreadMetadata");
                    }
                }
                return C1333860h.A00;
            }
        };
        C0f9.A0A(-302328893, A032);
        C0f9.A0A(-104792553, A03);
        return c4l3;
    }
}
