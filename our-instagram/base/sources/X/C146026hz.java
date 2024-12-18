package X;

import com.instagram.common.session.UserSession;
import java.util.Map;

/* renamed from: X.6hz, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C146026hz {
    public boolean A00;
    public final AbstractC59962oe A01;
    public final UserSession A02;
    public final InterfaceC1118853a A03;
    public final InterfaceC144586fe A04;

    public C146026hz(AbstractC59962oe abstractC59962oe, UserSession userSession, InterfaceC1118853a interfaceC1118853a, InterfaceC144586fe interfaceC144586fe) {
        C14360o3.A0B(userSession, 2);
        C14360o3.A0B(interfaceC144586fe, 4);
        this.A01 = abstractC59962oe;
        this.A02 = userSession;
        this.A03 = interfaceC1118853a;
        this.A04 = interfaceC144586fe;
    }

    public final void A00(C41181vS c41181vS, String str, Map map) {
        C14360o3.A0B(str, 0);
        C14360o3.A0B(map, 1);
        if (!this.A00) {
            this.A00 = true;
            AbstractC59962oe abstractC59962oe = this.A01;
            AbstractC192798gL A05 = C192108fB.A05(this.A02, str, map);
            A05.A00(new HDY(c41181vS, this));
            abstractC59962oe.schedule(A05);
        }
    }
}
