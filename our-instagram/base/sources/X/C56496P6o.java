package X;

import android.content.Context;
import android.os.Bundle;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;

/* renamed from: X.P6o, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C56496P6o implements InterfaceC57971PnH {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ C189478aR A01;
    public final /* synthetic */ User A02;
    public final /* synthetic */ C31535DtK A03;

    public C56496P6o(Context context, C189478aR c189478aR, User user, C31535DtK c31535DtK) {
        this.A01 = c189478aR;
        this.A03 = c31535DtK;
        this.A00 = context;
        this.A02 = user;
    }

    @Override // X.InterfaceC57971PnH
    public final void E2j() {
        C189478aR c189478aR = this.A01;
        C31535DtK c31535DtK = this.A03;
        C189448aO A0y = AbstractC25225BEi.A0y(C31535DtK.A03(c31535DtK));
        AbstractC25225BEi.A1Q(A0y, true);
        AbstractC31172DnG.A1G(this.A00.getResources(), A0y, 2131962725);
        AbstractC31364DqT.A03();
        UserSession A03 = C31535DtK.A03(c31535DtK);
        String id = this.A02.getId();
        C14360o3.A0B(A03, 0);
        Bundle A05 = AbstractC31178DnM.A05(A03);
        A05.putString("ProfileLiveNotificationsSettingsFragment.ARG_DISPLAYED_USER_ID", id);
        C52115N4n c52115N4n = new C52115N4n();
        c52115N4n.setArguments(A05);
        c189478aR.A0F(c52115N4n, A0y);
    }
}
