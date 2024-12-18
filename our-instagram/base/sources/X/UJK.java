package X;

import android.view.View;
import android.widget.ImageView;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.UpcomingEvent;

/* loaded from: classes11.dex */
public final class UJK extends C3OO {
    public UpcomingEvent A00;
    public final ImageView A01;
    public final UserSession A02;
    public final C3PF A03;

    public UJK(View view, UserSession userSession, InterfaceC186168Nk interfaceC186168Nk) {
        super(view);
        this.A02 = userSession;
        ImageView A0D = AbstractC31176DnK.A0D(view, R.id.upcoming_event_sticker);
        this.A01 = A0D;
        C3P9 c3p9 = new C3P9(A0D);
        c3p9.A07 = true;
        c3p9.A04 = new C216529i9(1, this, interfaceC186168Nk);
        this.A03 = c3p9.A00();
    }
}
