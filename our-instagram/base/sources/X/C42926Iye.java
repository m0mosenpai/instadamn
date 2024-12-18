package X;

import android.app.Activity;
import android.graphics.RectF;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.Product;

/* renamed from: X.Iye, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C42926Iye implements JI1 {
    public Product A00;
    public final Activity A01;
    public final UserSession A02;
    public final String A03;
    public final String A04;

    @Override // X.JI1
    public final void Dlr(AbstractC115105If abstractC115105If, boolean z) {
    }

    @Override // X.JI1
    public final void Dls() {
    }

    @Override // X.JI1
    public final boolean isEmpty() {
        return true;
    }

    @Override // X.JI1
    public final C25621Ms Ac9() {
        C25621Ms A0M = AbstractC31177DnL.A0M(this.A02);
        A0M.A0L("commerce/products/%s/details/", this.A04);
        A0M.A9s("merchant_id", this.A03);
        A0M.A9s("device_width", String.valueOf(AbstractC13890nF.A01(this.A01)));
        A0M.A9s("shopping_bag_enabled", "false");
        A0M.A0R(HBA.class, ISV.class);
        return A0M;
    }

    @Override // X.JI1
    public final /* bridge */ /* synthetic */ void Dlt(InterfaceC74303Vl interfaceC74303Vl, boolean z, boolean z2) {
        HBA hba = (HBA) interfaceC74303Vl;
        C14360o3.A0B(hba, 0);
        UserSession userSession = this.A02;
        this.A00 = AbstractC40801I6d.A00(userSession, hba, null).A00.A03;
        Activity activity = this.A01;
        int A01 = AbstractC13890nF.A01(activity);
        float A00 = AbstractC13890nF.A00(activity);
        RectF rectF = new RectF(0.0f, A00, A01, A00);
        Product product = this.A00;
        if (product != null) {
            FQL fql = new FQL(activity, userSession, product);
            fql.A01 = rectF;
            fql.A00();
        }
    }

    public C42926Iye(Activity activity, UserSession userSession, String str, String str2) {
        AbstractC167017dG.A1Q(userSession, str);
        this.A02 = userSession;
        this.A01 = activity;
        this.A04 = str;
        this.A03 = str2;
    }
}
