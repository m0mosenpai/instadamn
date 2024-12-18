package X;

import android.app.Activity;
import androidx.fragment.app.Fragment;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.UpcomingEvent;
import java.io.File;

/* renamed from: X.WiM, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C70856WiM implements InterfaceC50449MPd {
    public final /* synthetic */ Activity A00;
    public final /* synthetic */ Fragment A01;
    public final /* synthetic */ C22P A02;
    public final /* synthetic */ UserSession A03;
    public final /* synthetic */ UpcomingEvent A04;

    public C70856WiM(Activity activity, Fragment fragment, C22P c22p, UserSession userSession, UpcomingEvent upcomingEvent) {
        this.A02 = c22p;
        this.A04 = upcomingEvent;
        this.A03 = userSession;
        this.A00 = activity;
        this.A01 = fragment;
    }

    @Override // X.InterfaceC50449MPd
    public final void Dq9(File file) {
        C22P c22p = this.A02;
        UpcomingEvent upcomingEvent = this.A04;
        C11T.A02(new RunnableC71622WxU(this.A00, this.A01, c22p, this.A03, upcomingEvent, file));
    }

    @Override // X.InterfaceC50449MPd
    public final void onFailure(Exception exc) {
        C11T.A02(new RunnableC71372Wsh(this.A00));
    }
}
