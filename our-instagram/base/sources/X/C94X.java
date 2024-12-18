package X;

import com.facebook.odin.model.Example;
import com.instagram.common.session.UserSession;
import com.instagram.direct.stella.StellaIpcDirectMessagingServiceClient;
import java.util.HashMap;
import java.util.List;

/* renamed from: X.94X, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C94X implements C94A {
    public final InterfaceC09390do A00 = AbstractC09440dt.A01(C94Y.A00);
    public final InterfaceC09390do A01;
    public final InterfaceC09390do A02;

    @Override // X.C94A
    public final void cleanup() {
    }

    @Override // X.C94A
    public final void COI() {
        Object obj;
        InterfaceC10260gi interfaceC10260gi = ((C2048694u) this.A01.getValue()).A00;
        if (interfaceC10260gi != null && interfaceC10260gi.AhA(36325699518543143L)) {
            AGF agf = (AGF) this.A02.getValue();
            C73593Rl c73593Rl = agf.A01;
            C2048694u c2048694u = agf.A03;
            C3SN EKt = c73593Rl.EKt(c2048694u.CDV());
            if (EKt.A02 && agf.A00.now() < ((Number) EKt.A00).longValue() + (c2048694u.BtZ() * StellaIpcDirectMessagingServiceClient.KEEP_CONNECTION_ALIVE_MS)) {
                return;
            }
            try {
                C3SN A00 = agf.A02.A00(AD6.A00(c2048694u));
                boolean z = A00.A02;
                if (z) {
                    List list = (List) A00.A00;
                    if (list.size() > 0) {
                        obj = list.get(0);
                    } else {
                        obj = Example.A03;
                    }
                    Example example = (Example) obj;
                    c73593Rl.Eow(example, c2048694u.CDV(), agf.A00.now());
                    AGF.A00(agf, A00.A01, example.A02, z);
                    return;
                }
                String str = A00.A01;
                C0K8.A02(AGF.class, str);
                AGF.A00(agf, str, new HashMap(), z);
                return;
            } catch (Exception e) {
                C0K8.A02(AGF.class, e.getMessage());
                AGF.A00(agf, e.getMessage(), new HashMap(), false);
                return;
            }
        }
        C0K8.A02(C94X.class, "personalization disabled");
    }

    public C94X(UserSession userSession) {
        this.A01 = AbstractC09440dt.A01(new C206919Dw(userSession, 30));
        this.A02 = AbstractC09440dt.A01(new C9F9(41, userSession, this));
    }
}
