package X;

import android.content.DialogInterface;
import com.instagram.common.session.UserSession;

/* loaded from: classes11.dex */
public final class WHQ implements DialogInterface.OnClickListener {
    public final /* synthetic */ C1Y6 A00;
    public final /* synthetic */ C69490VoD A01;

    public WHQ(C1Y6 c1y6, C69490VoD c69490VoD) {
        this.A01 = c69490VoD;
        this.A00 = c1y6;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        C69490VoD c69490VoD = this.A01;
        UserSession userSession = c69490VoD.A08;
        C70399WUb A00 = C70399WUb.A00(userSession);
        VG4 vg4 = VG4.A0S;
        A00.A01 = "boost_unavailable_dialog";
        A00.A0G(vg4, "boost_another_post_button");
        this.A00.A0A(c69490VoD.A02, userSession, c69490VoD.A0G, c69490VoD.A0E, false, false, false);
    }
}
