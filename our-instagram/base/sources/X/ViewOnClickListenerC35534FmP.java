package X;

import android.content.Context;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.instagram.common.session.UserSession;

/* renamed from: X.FmP, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class ViewOnClickListenerC35534FmP implements View.OnClickListener {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ C3CZ A01;

    public ViewOnClickListenerC35534FmP(Context context, C3CZ c3cz) {
        this.A01 = c3cz;
        this.A00 = context;
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [X.Ef2, X.Fby] */
    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int A05 = C0f9.A05(-1517187075);
        C3CZ c3cz = this.A01;
        C3CZ.A0C = "manage_sync_settings";
        UserSession userSession = c3cz.A04;
        EnumC69993Ci enumC69993Ci = C3CZ.A0B;
        String str = userSession.userId;
        C14360o3.A0B(str, 0);
        AbstractC003100w.A0k(10, str);
        AbstractC31719DwO.A00(enumC69993Ci, userSession, AbstractC43591JPw.A00(91), "im_settings", C3CZ.A0C, null, null);
        Fragment fragment = c3cz.A01;
        C35241Fga.A02(EnumC33507Erg.EDIT_PHOTO_REMINDER, userSession, "reminder_manage_settings");
        C28361Yx c28361Yx = C28361Yx.A02;
        if (c28361Yx != null) {
            ?? abstractC35025Fby = new AbstractC35025Fby(fragment, userSession);
            abstractC35025Fby.A00 = 0;
            c28361Yx.A00 = abstractC35025Fby;
            abstractC35025Fby.A04("PHOTO_SETTINGS");
            C69923Cb.A00();
            C0f9.A0C(-1267774987, A05);
            return;
        }
        AbstractC31171DnF.A0v();
        throw C00O.createAndThrow();
    }
}
