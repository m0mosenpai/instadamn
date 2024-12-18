package X;

import androidx.fragment.app.Fragment;
import com.instagram.api.schemas.AppInstallCTAInfoIntf;
import com.instagram.common.session.UserSession;
import java.util.HashMap;

/* renamed from: X.GfQ, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C37508GfQ implements JG1 {
    public final Fragment A00;
    public final UserSession A01;

    public C37508GfQ(Fragment fragment, UserSession userSession) {
        this.A01 = userSession;
        this.A00 = fragment;
    }

    @Override // X.JG1
    public final void Cx0(C38321qM c38321qM, C75113Zb c75113Zb) {
        HashMap A1G = AbstractC166987dD.A1G();
        String A2u = c38321qM.A2u();
        if (A2u != null) {
            A1G.put("media_id", A2u);
            AppInstallCTAInfoIntf AcI = c38321qM.A0C.AcI();
            if (AcI != null) {
                String Abn = AcI.Abn();
                A1G.put("android_package", Abn);
                if (AbstractC25228BEl.A1A(Abn).length() > 0) {
                    AbstractC41776Ies.A03(this.A00.requireActivity(), AnonymousClass001.A0R(AbstractC58317Pt9.A00(807), AcI.Abn()));
                }
            }
            LL0.A05((InterfaceC11380iw) this.A00, this.A01, C05F.A08, A1G);
            return;
        }
        throw AbstractC166997dE.A0g();
    }
}
