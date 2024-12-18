package X;

import com.instagram.common.session.UserSession;
import com.instagram.model.reels.Reel;
import instagram.features.stories.fragment.ReelViewerFragment;
import java.util.HashMap;
import java.util.List;

/* renamed from: X.GEy, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C36678GEy implements InterfaceC140686Xw {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;

    @Override // X.InterfaceC140686Xw
    public final void onCancel() {
    }

    public C36678GEy(int i, Object obj, Object obj2, Object obj3) {
        this.A00 = i;
        this.A03 = obj;
        this.A02 = obj2;
        this.A01 = obj3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC140686Xw
    public final void DhL(String str) {
        HashMap A1G;
        C141586ab A0U;
        List A1J;
        String valueOf;
        InterfaceC09390do interfaceC09390do;
        N6K n6k;
        ReelViewerFragment A01;
        C140966Yy A0j;
        switch (this.A00) {
            case 0:
                N6K n6k2 = (N6K) this.A03;
                if (!n6k2.isAdded()) {
                    return;
                }
                A1G = AbstractC166987dD.A1G();
                Reel reel = (Reel) this.A02;
                A1G.put(String.valueOf(reel.getId()), this.A01);
                A0U = AbstractC31171DnF.A0U();
                A1J = AbstractC166987dD.A1J(reel);
                valueOf = String.valueOf(reel.getId());
                interfaceC09390do = n6k2.A07;
                n6k = n6k2;
                break;
            case 1:
                A1G = AbstractC166987dD.A1G();
                Reel reel2 = (Reel) this.A02;
                A1G.put(reel2.getId(), this.A01);
                A0U = AbstractC31171DnF.A0U();
                A1J = AbstractC166987dD.A1J(reel2);
                valueOf = reel2.getId();
                N6L n6l = (N6L) this.A03;
                interfaceC09390do = n6l.A0B;
                n6k = n6l;
                break;
            default:
                HashMap A1G2 = AbstractC166987dD.A1G();
                Reel reel3 = (Reel) this.A02;
                A1G2.put(reel3.getId(), this.A01);
                C141586ab A0U2 = AbstractC31171DnF.A0U();
                List A1J2 = AbstractC166987dD.A1J(reel3);
                String id = reel3.getId();
                GAJ gaj = (GAJ) this.A03;
                UserSession userSession = gaj.A06;
                A0U2.A02(userSession, id, A1J2);
                A0U2.A03(C3G2.A0L);
                A0U2.A0T = A1G2;
                AbstractC31177DnL.A1P(A0U2);
                A01 = ITS.A01(A0U2.A00());
                A0j = AbstractC25225BEi.A0r(gaj.A02, userSession);
                A0j.A0D(A01);
                A0j.A0A = AbstractC111324zv.A00(94);
                A0j.A04();
        }
        A0U.A02(AbstractC166987dD.A0r(interfaceC09390do), valueOf, A1J);
        A0U.A03(C3G2.A0L);
        A0U.A0T = A1G;
        AbstractC31177DnL.A1P(A0U);
        A01 = ITS.A01(A0U.A00());
        A0j = AbstractC25233BEq.A0j(n6k, interfaceC09390do);
        A0j.A0D(A01);
        A0j.A0A = AbstractC111324zv.A00(94);
        A0j.A04();
    }

    @Override // X.InterfaceC140686Xw
    public final void Dbk(float f) {
    }
}
