package X;

import com.instagram.common.session.UserSession;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.6Dr, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C136096Dr implements InterfaceC13000lm {
    public final C2FQ A00;
    public final Map A01;

    public C136096Dr(UserSession userSession) {
        C14360o3.A0B(userSession, 1);
        this.A00 = C2FO.A00(userSession);
        this.A01 = AbstractC06930Yk.A06(new C09530e4(1, new Object()), new C09530e4(2, new Object()), new C09530e4(3, new Object()), new C09530e4(5, new Object()));
    }

    public final void A00(final InterfaceC16820sZ interfaceC16820sZ, final int i) {
        AbstractC25011Ke abstractC25011Ke = (AbstractC25011Ke) this.A01.get(Integer.valueOf(i));
        if (abstractC25011Ke == null) {
            interfaceC16820sZ.invoke();
        } else {
            C2OD.A03(new C2JL() { // from class: X.9Hf
                @Override // X.C2JL
                public final void onFailure(Throwable th) {
                    C14360o3.A0B(th, 0);
                    C0K8.A0C("AuxDBsState", AnonymousClass001.A05(i, "Callback won't run, onFailure for dbType: ", " failed: ", th.getMessage()));
                }

                @Override // X.C2JL
                public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
                    interfaceC16820sZ.invoke();
                }
            }, abstractC25011Ke, C1M8.A01);
        }
    }

    @Override // X.InterfaceC13000lm
    public final void onSessionWillEnd() {
        Map map = this.A01;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : map.entrySet()) {
            if (!((AbstractC25011Ke) entry.getValue()).isDone()) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        Iterator it = linkedHashMap.entrySet().iterator();
        while (it.hasNext()) {
            ((AbstractC25011Ke) ((Map.Entry) it.next()).getValue()).cancel(true);
        }
    }
}
