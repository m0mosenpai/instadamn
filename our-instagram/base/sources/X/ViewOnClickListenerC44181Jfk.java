package X;

import android.view.View;
import com.instagram.common.session.UserSession;
import com.instagram.friendmap.configs.FriendMapLaunchConfig;

/* renamed from: X.Jfk, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class ViewOnClickListenerC44181Jfk implements View.OnClickListener {
    public final /* synthetic */ C4F3 A00;
    public final /* synthetic */ C4FH A01;

    public ViewOnClickListenerC44181Jfk(C4F3 c4f3, C4FH c4fh) {
        this.A01 = c4fh;
        this.A00 = c4f3;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int A05 = C0f9.A05(661841200);
        C4F8 c4f8 = this.A01.A03;
        C4F3 c4f3 = this.A00;
        C3L9.A00();
        UserSession userSession = c4f8.A03;
        if (C3LA.A05(userSession, true)) {
            C135976Dc A01 = AbstractC135966Db.A01(userSession);
            A01.A01 = new C152706ty(null, EnumC152696tw.POG, null, null, Long.valueOf(c4f3.A01), null, c4f3.A04.getId(), null, null, null, AbstractC166987dD.A1J(JZA.FRIEND_MAP_ENTRYPOINT), c4f3.A00, false);
            A01.A0D(EnumC46303KeZ.A0b);
            C3L9.A00().A01(c4f8.A01.requireActivity(), userSession, new FriendMapLaunchConfig(null, C05F.A00, null, null, null, null, false, false, false));
        }
        C0f9.A0C(-362583243, A05);
    }
}
