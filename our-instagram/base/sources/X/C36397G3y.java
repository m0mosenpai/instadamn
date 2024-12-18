package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.G3y, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C36397G3y implements InterfaceC65529Tlz {
    public final /* synthetic */ G3L A00;
    public final /* synthetic */ boolean A01;

    public C36397G3y(G3L g3l, boolean z) {
        this.A00 = g3l;
        this.A01 = z;
    }

    @Override // X.InterfaceC65529Tlz
    public final void onFailure() {
        C35030Fc3 c35030Fc3 = C35030Fc3.A00;
        G3L g3l = this.A00;
        c35030Fc3.A01(g3l.A02, "thread_details_page", E70.A03(g3l.A06));
    }

    @Override // X.InterfaceC65529Tlz
    public final void onSuccess() {
        G3L g3l = this.A00;
        UserSession userSession = g3l.A02;
        InterfaceC83733oI interfaceC83733oI = g3l.A06.A0L;
        C83693oE A01 = AbstractC1345466e.A01(interfaceC83733oI);
        boolean z = this.A01;
        AbstractC31278Dp0.A0A(userSession, A01, "thread_details_page", z);
        String A0c = AbstractC31171DnF.A0c(interfaceC83733oI);
        C5G2 c5g2 = g3l.A05;
        if (z) {
            if (A0c != null) {
                c5g2.A02.add(A0c);
            }
            c5g2.A01 = false;
        } else if (A0c != null) {
            c5g2.A02.remove(A0c);
        }
        g3l.A07.invoke();
        C35030Fc3.A00.A02(userSession, "thread_details_page", AbstractC1345466e.A07(interfaceC83733oI));
    }
}
