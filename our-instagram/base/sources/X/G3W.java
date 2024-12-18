package X;

import com.instagram.common.session.UserSession;

/* loaded from: classes6.dex */
public final class G3W implements InterfaceC37196Ga7 {
    public final int A00;
    public final Object A01;
    public final Object A02;

    @Override // X.InterfaceC37196Ga7
    public final void DJl() {
    }

    @Override // X.InterfaceC37196Ga7
    public final void DV6() {
    }

    public G3W(int i, Object obj, Object obj2) {
        this.A00 = i;
        this.A02 = obj;
        this.A01 = obj2;
    }

    @Override // X.InterfaceC37196Ga7
    public final void DGI(String str) {
        C189448aO A0g;
        C1YY A01;
        UserSession A0r;
        String str2;
        C189478aR c189478aR;
        if (this.A00 != 0) {
            C36881nl c36881nl = ((C32534EUk) this.A01).A00;
            c189478aR = c36881nl.A08;
            if (c189478aR != null) {
                A01 = FVI.A01();
                A0r = c36881nl.A11;
                java.util.Set set = FE3.A00;
                str2 = "invite_link_preview_broadcast_chat";
                A0g = (C189448aO) this.A02;
            } else {
                return;
            }
        } else {
            C14360o3.A0B(str, 0);
            InterfaceC09390do interfaceC09390do = ((C32233EHr) this.A02).A01;
            A0g = AbstractC25231BEo.A0g(interfaceC09390do);
            A01 = FVI.A01();
            A0r = AbstractC166987dD.A0r(interfaceC09390do);
            java.util.Set set2 = FE3.A00;
            str2 = "profile_subscriber_channel_click";
            c189478aR = (C189478aR) this.A01;
        }
        A01.A07(A0r, c189478aR, A0g, str, str2);
    }

    @Override // X.InterfaceC37196Ga7
    public final void Czz(boolean z) {
    }
}
