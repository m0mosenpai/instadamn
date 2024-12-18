package X;

import com.instagram.clips.intf.ClipsViewerSource;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.base.IgSimpleImageView;
import com.instagram.common.ui.widget.imageview.IgImageView;
import java.util.List;

/* loaded from: classes7.dex */
public final class J2X implements InterfaceC43458JHw {
    public final /* synthetic */ C41161IKa A00;
    public final /* synthetic */ String A01;

    @Override // X.InterfaceC43458JHw
    public final void D58(C38321qM c38321qM, O9V o9v, List list, int i) {
        C14360o3.A0B(c38321qM, 0);
        C41161IKa c41161IKa = this.A00;
        UserSession userSession = c41161IKa.A04;
        C116875Qr c116875Qr = new C116875Qr(ClipsViewerSource.A0q, userSession);
        c116875Qr.A1D = c38321qM.getId();
        c116875Qr.A0o = this.A01;
        c116875Qr.A1d = false;
        c116875Qr.A1h = true;
        c116875Qr.A1Q = true;
        AbstractC31173DnH.A1J(c41161IKa.A01, c116875Qr, userSession);
    }

    @Override // X.InterfaceC43458JHw
    public final void D59(C120985dq c120985dq, IgSimpleImageView igSimpleImageView, IgImageView igImageView, C38321qM c38321qM) {
    }

    public J2X(C41161IKa c41161IKa, String str) {
        this.A00 = c41161IKa;
        this.A01 = str;
    }

    @Override // X.InterfaceC43458JHw
    public final void D57(C38514GwZ c38514GwZ, String str) {
        this.A00.A07.A0G(c38514GwZ);
    }

    @Override // X.InterfaceC43458JHw
    public final void D5A(C38514GwZ c38514GwZ) {
        J23 j23 = c38514GwZ.A01;
        if (j23 != null) {
            j23.A00();
        }
        c38514GwZ.A01 = null;
    }
}
