package X;

import com.google.common.collect.ImmutableList;
import com.instagram.clips.intf.ClipsViewerConfig;
import com.instagram.common.session.UserSession;

/* renamed from: X.Gjw, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C37781Gjw extends AbstractC116895Qv {
    public final int A00;
    public final Object A01;

    public C37781Gjw(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    @Override // X.AbstractC116895Qv, X.InterfaceC116905Qw
    public final void D5F() {
        if (3 - this.A00 != 0) {
            super.D5F();
            return;
        }
        C3FR c3fr = ((HCZ) this.A01).A03;
        if (c3fr == null) {
            return;
        }
        c3fr.EWc(false);
    }

    @Override // X.AbstractC116895Qv, X.InterfaceC116905Qw
    public final void D5H(C37818GkY c37818GkY) {
        ImmutableList immutableList;
        C120985dq c120985dq;
        switch (this.A00) {
            case 0:
                C14360o3.A0B(c37818GkY, 0);
                if (!c37818GkY.A0D || !c37818GkY.A0I || c37818GkY.A00 != 0 || c37818GkY.A0F) {
                    return;
                }
                C37705Gig c37705Gig = (C37705Gig) this.A01;
                ClipsViewerConfig clipsViewerConfig = c37705Gig.A03;
                if (clipsViewerConfig.A1I == null && ((immutableList = clipsViewerConfig.A0E) == null || immutableList.isEmpty())) {
                    return;
                }
                String str = c37818GkY.A04;
                UserSession userSession = c37705Gig.A05;
                if ((C1LE.A05(userSession) || C1LE.A04(userSession)) && str == null) {
                    return;
                }
                c37705Gig.A01 = false;
                InterfaceC19610xo ARD = c37705Gig.A06.ARD();
                ARD.E77("seen_chained_media_headload_response", c37705Gig.A01);
                ARD.apply();
                C37695GiW c37695GiW = c37705Gig.A07;
                if (c37695GiW == null) {
                    return;
                }
                c37695GiW.A07(null, false);
                return;
            case 1:
                ((C37625GhK) this.A01).A0B();
                return;
            case 2:
                C14360o3.A0B(c37818GkY, 0);
                if (!c37818GkY.A0D) {
                    return;
                }
                IG5 ig5 = (IG5) this.A01;
                if (ig5.A00 != null || (c120985dq = (C120985dq) AbstractC001800i.A0J(c37818GkY.A09)) == null) {
                    return;
                }
                ig5.A00 = c120985dq.getId();
                return;
            default:
                super.D5H(c37818GkY);
                return;
        }
    }
}
