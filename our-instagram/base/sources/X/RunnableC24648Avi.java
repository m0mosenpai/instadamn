package X;

import android.view.View;
import com.instagram.common.session.UserSession;

/* renamed from: X.Avi, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class RunnableC24648Avi implements Runnable {
    public final /* synthetic */ View A00;
    public final /* synthetic */ UserSession A01;

    public RunnableC24648Avi(View view, UserSession userSession) {
        this.A00 = view;
        this.A01 = userSession;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C8QC.A06(new View[]{this.A00}, true, true);
        InterfaceC19610xo ARD = AbstractC166987dD.A0x(this.A01).ARD();
        ARD.E77("has_seen_valentines_sticker_tray_icon", true);
        ARD.apply();
    }
}
