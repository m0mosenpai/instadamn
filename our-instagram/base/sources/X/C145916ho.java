package X;

import com.instagram.common.session.UserSession;
import java.util.LinkedHashMap;

/* renamed from: X.6ho, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C145916ho {
    public final C145826hf A00;
    public final UserSession A01;
    public final C71023Go A02;

    public C145916ho(UserSession userSession, C71023Go c71023Go, C145826hf c145826hf) {
        C14360o3.A0B(c145826hf, 1);
        C14360o3.A0B(userSession, 2);
        C14360o3.A0B(c71023Go, 3);
        this.A00 = c145826hf;
        this.A01 = userSession;
        this.A02 = c71023Go;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v0, types: [X.3ry, java.lang.Object] */
    public final void A00() {
        C64022vN c64022vN = this.A00.A0C;
        if (!c64022vN.A07()) {
            C71023Go c71023Go = this.A02;
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            long currentTimeMillis = System.currentTimeMillis();
            linkedHashMap.putAll(((InterfaceC61432r6) c71023Go.A0B.getValue()).AUS("media/seen/"));
            linkedHashMap.putAll(((InterfaceC85683rx) c71023Go.A07.getValue()).Bbk("media/seen/"));
            c71023Go.A01.EIH(new Object(), c71023Go.A00.getModuleName(), "media/seen/", AbstractC001800i.A0a(linkedHashMap.keySet()), AbstractC06930Yk.A0B(linkedHashMap), System.currentTimeMillis() - currentTimeMillis);
            c64022vN.A08 = AbstractC85703rz.A00(linkedHashMap);
            C64022vN A04 = c64022vN.A04();
            c64022vN.A05();
            C57652ke.A00(this.A01).A0L(A04);
            java.util.Set A01 = AbstractC85703rz.A01(linkedHashMap);
            if (A01 != null) {
                c71023Go.FCF(EnumC74603Ws.A06, A01);
            }
        }
    }
}
