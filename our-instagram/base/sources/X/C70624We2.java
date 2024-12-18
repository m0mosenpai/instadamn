package X;

import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;

/* renamed from: X.We2, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C70624We2 implements XCJ {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ FragmentActivity A02;
    public final /* synthetic */ C07X A03;
    public final /* synthetic */ XDI A04;
    public final /* synthetic */ UserSession A05;
    public final /* synthetic */ String A06;
    public final /* synthetic */ String A07;

    @Override // X.XCJ
    public final void DqC(String str) {
        C14360o3.A0B(str, 0);
        UserSession userSession = this.A05;
        FragmentActivity fragmentActivity = this.A02;
        C07X c07x = this.A03;
        String str2 = this.A07;
        String str3 = this.A06;
        int i = this.A01;
        int i2 = this.A00;
        C70656Wec c70656Wec = new C70656Wec(this.A04);
        C61972ry c61972ry = new C61972ry(fragmentActivity, AbstractC018607g.A00(c07x));
        Tx4 tx4 = new Tx4(3, c70656Wec, userSession, fragmentActivity);
        String str4 = C70399WUb.A00(userSession).A03;
        C14360o3.A0B(str4, 6);
        C25621Ms A0c = AbstractC167017dG.A0c(userSession);
        A0c.A0B("ads/ads_manager/edit_budget_and_duration_v2/");
        A0c.A9s("fb_auth_token", str);
        A0c.A9s("media_id", str2);
        A0c.A0D(AbstractC111324zv.A00(2752), i);
        A0c.A0D(AbstractC111324zv.A00(2751), i2);
        A0c.A0H("flow_id", str4);
        A0c.A0H("boosted_id", str3);
        A0c.A0R(C67812Uyl.class, C69915Vxg.class);
        C1ON A0N = A0c.A0N();
        A0N.A00 = tx4;
        c61972ry.schedule(A0N);
    }

    public C70624We2(FragmentActivity fragmentActivity, C07X c07x, XDI xdi, UserSession userSession, String str, String str2, int i, int i2) {
        this.A05 = userSession;
        this.A02 = fragmentActivity;
        this.A03 = c07x;
        this.A07 = str;
        this.A06 = str2;
        this.A01 = i;
        this.A00 = i2;
        this.A04 = xdi;
    }

    @Override // X.XCJ
    public final void DFf() {
        this.A04.DFk(null, "failed to obtain access token");
    }
}
