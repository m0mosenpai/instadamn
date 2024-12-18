package X;

import com.instagram.common.session.UserSession;
import com.instagram.model.direct.DirectThreadKey;
import com.instagram.realtimeclient.RealtimeProtocol;
import java.io.IOException;
import java.util.List;
import java.util.Map;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* renamed from: X.1n7, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C36481n7 implements C0KV {
    public static final C36481n7 A00 = new C36481n7();

    @Override // X.C0KV
    public final /* bridge */ /* synthetic */ Object AXR(UserSession userSession) {
        int A03 = C0f9.A03(-1597322196);
        int A032 = C0f9.A03(-1606833734);
        C14360o3.A0B(userSession, 0);
        final C2DS A002 = AbstractC28761aE.A00(userSession);
        C4L3 c4l3 = new C4L3(A002) { // from class: X.4Ld
            public final C2DS A00;

            {
                C14360o3.A0B(A002, 1);
                this.A00 = A002;
            }

            @Override // X.C4L3
            public final AbstractC1333760g E6D(C5lP c5lP, C125205lR c125205lR, List list, Map map, InterfaceC16620sF interfaceC16620sF, InterfaceC16620sF interfaceC16620sF2, boolean z) {
                int i;
                C14360o3.A0B(map, 0);
                C14360o3.A0B(c5lP, 1);
                C14360o3.A0B(c125205lR, 2);
                C14360o3.A0B(interfaceC16620sF, 5);
                Object obj = map.get(RealtimeProtocol.THREAD_ID);
                if (obj != null && "replace".equals(c125205lR.A00)) {
                    C2ED c2ed = (C2ED) interfaceC16620sF.invoke(obj, c5lP);
                    if (c2ed == null) {
                        return XZZ.A00;
                    }
                    try {
                        E69 parseFromJson = F4E.parseFromJson(C16V.A00(c125205lR.A02));
                        if (parseFromJson != null) {
                            C2DS c2ds = this.A00;
                            DirectThreadKey BKb = c2ed.BKb();
                            C2DU c2du = (C2DU) c2ds;
                            C4GV A0P = c2du.A0P(BKb);
                            if (A0P != null) {
                                int i2 = parseFromJson.A00;
                                if (i2 != 3) {
                                    C81663kb c81663kb = A0P.A0I;
                                    if (((Boolean) c81663kb.A05.getValue()).booleanValue()) {
                                        ReentrantReadWriteLock reentrantReadWriteLock = c81663kb.A03;
                                        ReentrantReadWriteLock.ReadLock readLock = reentrantReadWriteLock.readLock();
                                        int i3 = 0;
                                        if (reentrantReadWriteLock.getWriteHoldCount() == 0) {
                                            i = reentrantReadWriteLock.getReadHoldCount();
                                            for (int i4 = 0; i4 < i; i4++) {
                                                readLock.unlock();
                                            }
                                        } else {
                                            i = 0;
                                        }
                                        ReentrantReadWriteLock.WriteLock writeLock = reentrantReadWriteLock.writeLock();
                                        writeLock.lock();
                                        try {
                                            c81663kb.A01.A1M.A03(Integer.valueOf(i2));
                                            while (i3 < i) {
                                                readLock.lock();
                                                i3++;
                                            }
                                            writeLock.unlock();
                                        } catch (Throwable th) {
                                            while (i3 < i) {
                                                readLock.lock();
                                                i3++;
                                            }
                                            writeLock.unlock();
                                            throw th;
                                        }
                                    } else {
                                        C80693iy c80693iy = c81663kb.A01;
                                        synchronized (c80693iy) {
                                            try {
                                                c80693iy.A1M.A03(Integer.valueOf(i2));
                                            } catch (Throwable th2) {
                                                throw th2;
                                            }
                                        }
                                    }
                                }
                                String str = parseFromJson.A01;
                                if (str != null) {
                                    A0P.A0I.A01.A1k = str;
                                }
                                C81663kb c81663kb2 = A0P.A0I;
                                DirectThreadKey BKb2 = c81663kb2.BKb();
                                EnumC46982Dm C4i = c81663kb2.C4i();
                                C14360o3.A07(C4i);
                                C2DU.A0C(C4i, c81663kb2, c2du, A0P, C2EB.A04, BKb2);
                                c2du.A06.E4s(new C36107Fwh(BKb, c81663kb2.BAY(), c81663kb2.CVT()));
                            }
                        }
                        return C1333660e.A00;
                    } catch (IOException e) {
                        C0w9.A05("invalid_thread_group_invite_link_format", "Invalid GroupInviteLink data format", 1, e);
                        return new C1334060j(e, "invalid_thread_group_invite_link_format", "Invalid GroupInviteLink data format");
                    }
                }
                return C1333860h.A00;
            }
        };
        C0f9.A0A(-2041872545, A032);
        C0f9.A0A(299696607, A03);
        return c4l3;
    }
}
