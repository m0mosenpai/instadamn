package X;

import android.view.View;
import com.instagram.user.model.User;

/* loaded from: classes11.dex */
public final class WMf implements View.OnClickListener {
    public final /* synthetic */ int A00;
    public final /* synthetic */ C63752uw A01;
    public final /* synthetic */ C69388VmY A02;
    public final /* synthetic */ User A03;

    public WMf(C63752uw c63752uw, C69388VmY c69388VmY, User user, int i) {
        this.A01 = c63752uw;
        this.A00 = i;
        this.A03 = user;
        this.A02 = c69388VmY;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int A05 = C0f9.A05(-1251877134);
        C63752uw c63752uw = this.A01;
        int i = this.A00;
        User user = this.A03;
        String id = user.getId();
        BIM.A00(c63752uw.A01, c63752uw.A02, id, i);
        C57312k6 A00 = C07Y.A00(c63752uw.A00);
        AbstractC23641Du.A05(AnonymousClass191.A00, new MCG(user, c63752uw, (InterfaceC23621Ds) null, 24), A00);
        C69388VmY c69388VmY = this.A02;
        c69388VmY.A01.setVisibility(8);
        c69388VmY.A06.setVisibility(0);
        C0f9.A0C(-1660211056, A05);
    }
}
