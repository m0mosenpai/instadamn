package X;

import com.facebook.catalyst.modules.netinfo.NetInfoModule;
import com.instagram.model.direct.messageid.MessageIdentifier;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.G5n, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C36438G5n implements InterfaceC50481MQj {
    public final /* synthetic */ long A00;
    public final /* synthetic */ G4E A01;
    public final /* synthetic */ C189478aR A02;
    public final /* synthetic */ C2EY A03;
    public final /* synthetic */ MessageIdentifier A04;
    public final /* synthetic */ String A05;

    @Override // X.InterfaceC50481MQj
    public final void D90() {
    }

    @Override // X.InterfaceC50481MQj
    public final void DDM(C148336m3 c148336m3) {
        Object obj;
        G4E g4e = this.A01;
        InterfaceC163857Uz Avk = ((C7U0) g4e.A02.getValue()).Avk();
        MessageIdentifier messageIdentifier = this.A04;
        C160787Im BT7 = Avk.BT7(messageIdentifier.A01);
        if (BT7 != null) {
            List A0w = BT7.A0e.A0w();
            C14360o3.A07(A0w);
            Iterator it = A0w.iterator();
            while (true) {
                if (it.hasNext()) {
                    obj = it.next();
                    AnonymousClass441 anonymousClass441 = (AnonymousClass441) obj;
                    if (AbstractC31171DnF.A1W(g4e.A00, anonymousClass441.A00()) && C14360o3.A0K(anonymousClass441.A02, c148336m3.A02)) {
                        break;
                    }
                } else {
                    obj = null;
                    break;
                }
            }
            InterfaceC164877Za interfaceC164877Za = g4e.A01;
            long j = this.A00;
            C2EY c2ey = this.A03;
            if (obj != null) {
                interfaceC164877Za.Dd3(c2ey, messageIdentifier, c148336m3.A02, this.A05, j);
            } else {
                interfaceC164877Za.DTC(c2ey, messageIdentifier, c148336m3.A02, NetInfoModule.CONNECTION_TYPE_NONE, this.A05, null, j, false, true);
            }
        }
        this.A02.A0L(null);
    }

    @Override // X.InterfaceC50481MQj
    public final void DkO() {
    }

    public C36438G5n(G4E g4e, C189478aR c189478aR, C2EY c2ey, MessageIdentifier messageIdentifier, String str, long j) {
        this.A01 = g4e;
        this.A04 = messageIdentifier;
        this.A00 = j;
        this.A03 = c2ey;
        this.A05 = str;
        this.A02 = c189478aR;
    }
}
