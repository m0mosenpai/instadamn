package X;

import android.graphics.RectF;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.modal.TransparentModalActivity;
import com.instagram.model.reels.Reel;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.GEz, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C36679GEz implements InterfaceC140686Xw {
    public final /* synthetic */ RectF A00;
    public final /* synthetic */ FragmentActivity A01;
    public final /* synthetic */ UserSession A02;
    public final /* synthetic */ Reel A03;
    public final /* synthetic */ C3G2 A04;
    public final /* synthetic */ C3M4 A05;
    public final /* synthetic */ ArrayList A06;

    @Override // X.InterfaceC140686Xw
    public final void Dbk(float f) {
    }

    @Override // X.InterfaceC140686Xw
    public final void onCancel() {
    }

    public C36679GEz(RectF rectF, FragmentActivity fragmentActivity, UserSession userSession, Reel reel, C3G2 c3g2, C3M4 c3m4, ArrayList arrayList) {
        this.A01 = fragmentActivity;
        this.A03 = reel;
        this.A02 = userSession;
        this.A06 = arrayList;
        this.A04 = c3g2;
        this.A05 = c3m4;
        this.A00 = rectF;
    }

    @Override // X.InterfaceC140686Xw
    public final void DhL(String str) {
        FragmentActivity fragmentActivity = this.A01;
        fragmentActivity.onBackPressed();
        C141586ab A0U = AbstractC31171DnF.A0U();
        List A1J = AbstractC166987dD.A1J(this.A03);
        UserSession userSession = this.A02;
        A0U.A02(userSession, str, A1J);
        A0U.A0A(this.A06);
        A0U.A03(this.A04);
        AbstractC31177DnL.A1P(A0U);
        A0U.A01(userSession);
        A0U.A04(AbstractC25227BEk.A0p());
        C3M4 c3m4 = this.A05;
        A0U.A07(new C31559Dtj(fragmentActivity, this.A00, new GF2(3), C05F.A01).A03);
        A0U.A05(c3m4.A0x);
        AbstractC31178DnM.A0j(fragmentActivity, A0U.A00(), userSession, TransparentModalActivity.class, "reel_viewer");
    }
}
