package X;

import com.instagram.common.session.UserSession;
import com.instagram.model.direct.DirectThreadKey;
import com.instagram.realtimeclient.RealtimeProtocol;
import java.io.IOException;
import java.util.List;
import java.util.Map;

/* renamed from: X.1n9, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C36501n9 implements C0KV {
    public static final C36501n9 A00 = new C36501n9();

    @Override // X.C0KV
    public final /* bridge */ /* synthetic */ Object AXR(final UserSession userSession) {
        int A03 = C0f9.A03(-59070051);
        int A032 = C0f9.A03(3256550);
        C14360o3.A0B(userSession, 0);
        final C2DS A002 = AbstractC28761aE.A00(userSession);
        C4L3 c4l3 = new C4L3(userSession, A002) { // from class: X.4Lf
            public final UserSession A00;
            public final C2DS A01;

            {
                C14360o3.A0B(A002, 2);
                this.A00 = userSession;
                this.A01 = A002;
            }

            @Override // X.C4L3
            public final AbstractC1333760g E6D(C5lP c5lP, C125205lR c125205lR, List list, Map map, InterfaceC16620sF interfaceC16620sF, InterfaceC16620sF interfaceC16620sF2, boolean z) {
                C14360o3.A0B(map, 0);
                C14360o3.A0B(c5lP, 1);
                C14360o3.A0B(c125205lR, 2);
                C14360o3.A0B(interfaceC16620sF, 5);
                String str = (String) map.get(RealtimeProtocol.THREAD_ID);
                if (str != null && "replace".equals(c125205lR.A00)) {
                    C2ED c2ed = (C2ED) interfaceC16620sF.invoke(str, c5lP);
                    if (c2ed == null) {
                        return XZZ.A00;
                    }
                    try {
                        boolean z2 = AbstractC81533kO.parseFromJson(C16V.A00(c125205lR.A02)).A0I;
                        AbstractC43712JUx.A01(this.A00, c5lP, str, null, false);
                        C2DS c2ds = this.A01;
                        DirectThreadKey BKb = c2ed.BKb();
                        C2DU c2du = (C2DU) c2ds;
                        synchronized (c2du) {
                            C4GV A0P = c2du.A0P(BKb);
                            if (A0P == null) {
                                C0w9.A03("Null thread entry", AbstractC111324zv.A00(1605));
                            } else {
                                C81543kP A0K = A0P.A0K();
                                C14360o3.A07(A0K);
                                A0K.A0I = z2;
                                C2DU.A0E(A0P.A0L(A0K), c2du, false);
                                C46922Dg c46922Dg = c2du.A0C;
                                C81663kb c81663kb = A0P.A0I;
                                C14360o3.A07(c81663kb);
                                c46922Dg.A0Q(c81663kb, z2, z2, true);
                                c2du.FCS(BKb);
                            }
                        }
                        return C1333660e.A00;
                    } catch (IOException e) {
                        AbstractC43712JUx.A00(this.A00, c5lP, "Invalid InboxSetting format");
                        C0w9.A03("invalid_inbox_setting_format", "Invalid InboxSetting format");
                        return new C1334160k(e, "invalid_inbox_setting_format", "Invalid InboxSetting format");
                    }
                }
                return C1333860h.A00;
            }
        };
        C0f9.A0A(-1404059233, A032);
        C0f9.A0A(-117681895, A03);
        return c4l3;
    }
}
