package X;

import com.facebook.odin.model.Example;
import com.facebook.odin.model.FeatureData;
import com.facebook.odin.model.OdinContext;
import com.facebook.odin.model.Type;
import com.instagram.common.session.UserSession;
import com.instagram.direct.stella.StellaIpcDirectMessagingServiceClient;
import java.util.HashMap;
import java.util.List;

/* renamed from: X.94V, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C94V implements C94A {
    public final InterfaceC09390do A00 = AbstractC09440dt.A01(C94W.A00);
    public final InterfaceC09390do A01;
    public final InterfaceC09390do A02;
    public final InterfaceC09390do A03;
    public final InterfaceC09390do A04;
    public final InterfaceC09390do A05;

    @Override // X.C94A
    public final void COI() {
        Example example;
        Object obj;
        long j;
        InterfaceC09390do interfaceC09390do = this.A04;
        if (!((AnonymousClass946) interfaceC09390do.getValue()).Car()) {
            C0K8.A02(C94V.class, "prediction disabled");
            cleanup();
            return;
        }
        A95 a95 = (A95) this.A05.getValue();
        C73593Rl c73593Rl = a95.A01;
        C3RU c3ru = a95.A03;
        C3SN EKt = c73593Rl.EKt(c3ru.CDV());
        if (!EKt.A02 || a95.A00.now() >= ((Number) EKt.A00).longValue() + (c3ru.BtZ() * StellaIpcDirectMessagingServiceClient.KEEP_CONNECTION_ALIVE_MS)) {
            try {
                C3SN A00 = a95.A02.A00(AD6.A00(c3ru));
                if (A00.A02) {
                    List list = (List) A00.A00;
                    if (list.size() > 0) {
                        obj = list.get(0);
                    } else {
                        obj = Example.A03;
                    }
                    example = (Example) obj;
                } else {
                    example = Example.A03;
                }
            } catch (Exception unused) {
                example = Example.A03;
            }
            HashMap hashMap = example.A02;
            if (!hashMap.containsKey("3882")) {
                hashMap.put("3882", new FeatureData(Type.A06, "3882", null, null, -1.0d, 16372, 0L));
            }
            if (!hashMap.containsKey("3884")) {
                hashMap.put("3884", new FeatureData(Type.A06, "3884", null, null, -1.0d, 16372, 0L));
            }
            c73593Rl.Eow(example, c3ru.CDV(), a95.A00.now());
        }
        InterfaceC10260gi interfaceC10260gi = ((AnonymousClass946) interfaceC09390do.getValue()).A00;
        if (interfaceC10260gi != null) {
            j = interfaceC10260gi.BP2(36605688436888911L);
        } else {
            j = 0;
        }
        InterfaceC09390do interfaceC09390do2 = this.A03;
        long A002 = ((C4QF) interfaceC09390do2.getValue()).A00("last_prediction_time", -1L);
        if (A002 != -1) {
            Object value = this.A00.getValue();
            C14360o3.A07(value);
            if (((C0JM) value).now() < A002 + (j * StellaIpcDirectMessagingServiceClient.KEEP_CONNECTION_ALIVE_MS)) {
                return;
            }
        }
        C3SN E59 = ((C3SD) this.A01.getValue()).E59(null, OdinContext.A05);
        if (E59.A02) {
            int doubleValue = (int) ((Number) E59.A00).doubleValue();
            C4QF c4qf = (C4QF) interfaceC09390do2.getValue();
            c4qf.A00.edit().putInt(AnonymousClass001.A0T(c4qf.A01, "prediction_score", '_'), doubleValue).apply();
            C4QF c4qf2 = (C4QF) interfaceC09390do2.getValue();
            Object value2 = this.A00.getValue();
            C14360o3.A07(value2);
            c4qf2.A05("last_prediction_time", ((C0JM) value2).now());
            return;
        }
        String str = E59.A01;
        if (str == null) {
            str = "unknown failure reason";
        }
        C0K8.A02(C94V.class, AnonymousClass001.A0R("failed to update shared prefs: ", str));
    }

    @Override // X.C94A
    public final void cleanup() {
        InterfaceC09390do interfaceC09390do = this.A03;
        ((C4QF) interfaceC09390do.getValue()).A03("prediction_score");
        ((C4QF) interfaceC09390do.getValue()).A03("last_prediction_time");
    }

    public C94V(UserSession userSession) {
        this.A04 = AbstractC09440dt.A01(new C206919Dw(userSession, 43));
        this.A05 = AbstractC09440dt.A01(new C9F9(44, userSession, this));
        this.A02 = AbstractC09440dt.A01(new C9F9(43, userSession, this));
        this.A01 = AbstractC09440dt.A01(new C9F9(42, userSession, this));
        this.A03 = AbstractC09440dt.A01(new C206919Dw(userSession, 42));
    }
}
