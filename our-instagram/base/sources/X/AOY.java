package X;

import android.content.DialogInterface;
import androidx.fragment.app.Fragment;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.UpcomingEvent;

/* loaded from: classes4.dex */
public final class AOY implements DialogInterface.OnClickListener {
    public final /* synthetic */ Fragment A00;
    public final /* synthetic */ InterfaceC11380iw A01;
    public final /* synthetic */ UserSession A02;
    public final /* synthetic */ UpcomingEvent A03;

    public AOY(Fragment fragment, InterfaceC11380iw interfaceC11380iw, UserSession userSession, UpcomingEvent upcomingEvent) {
        this.A00 = fragment;
        this.A02 = userSession;
        this.A01 = interfaceC11380iw;
        this.A03 = upcomingEvent;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        C37021nz A00 = C4M5.A00();
        Fragment fragment = this.A00;
        A00.A01(fragment, fragment.requireActivity(), null, this.A02, this.A03, this.A01.getModuleName(), true);
    }
}
