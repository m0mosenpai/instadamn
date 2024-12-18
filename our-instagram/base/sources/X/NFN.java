package X;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.model.reels.ReelViewerConfig;

/* loaded from: classes9.dex */
public final class NFN extends AbstractC66422zJ implements InterfaceC11380iw {
    public static final String __redex_internal_original_name = "ImmersiveCatchUpStoryItemDefinition";
    public final int A00;
    public final FragmentActivity A01;
    public final UserSession A02;
    public final C146286iR A03;

    public NFN(FragmentActivity fragmentActivity, UserSession userSession, int i) {
        C14360o3.A0B(userSession, 2);
        this.A01 = fragmentActivity;
        this.A02 = userSession;
        this.A00 = i;
        this.A03 = new C146286iR(userSession, null, true);
    }

    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ C3OO createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        C14360o3.A0B(viewGroup, 0);
        Object tag = C143546dt.A00(this.A01, viewGroup, null, this.A02, null, C3G2.A0a, C05F.A01).getTag();
        C14360o3.A0C(tag, AbstractC43591JPw.A00(46));
        return (C3OO) tag;
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return __redex_internal_original_name;
    }

    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ void bind(InterfaceC66482zP interfaceC66482zP, C3OO c3oo) {
        C51811MvF c51811MvF = (C51811MvF) interfaceC66482zP;
        C143556du c143556du = (C143556du) c3oo;
        AbstractC167007dF.A1K(c51811MvF, c143556du);
        C41551w4 c41551w4 = c51811MvF.A00;
        UserSession userSession = this.A02;
        C41181vS A08 = c41551w4.A08(userSession);
        C38H c38h = new C38H();
        c38h.A01 = Integer.valueOf(this.A00);
        ReelViewerConfig reelViewerConfig = new ReelViewerConfig(c38h);
        C141596ac C00 = this.A03.C00(A08);
        int A02 = c41551w4.A02(userSession);
        int A03 = c41551w4.A03(userSession, A08);
        boolean z = c41551w4.A0H.A1a;
        InterfaceC144586fe interfaceC144586fe = InterfaceC144586fe.A01;
        InterfaceC144756fv interfaceC144756fv = InterfaceC144756fv.A01;
        C3G2 c3g2 = C3G2.A0a;
        C143546dt.A01(this, new YES(userSession), userSession, new C69433Ad(), A08, c41551w4, reelViewerConfig, c3g2, null, null, null, C00, interfaceC144756fv, interfaceC144586fe, c143556du, null, null, null, "0", A02, A03, -1, z, false);
    }

    @Override // X.AbstractC66422zJ
    public final Class modelClass() {
        return C51811MvF.class;
    }
}
