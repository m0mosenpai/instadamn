package X;

import android.content.DialogInterface;
import com.instagram.common.session.UserSession;

/* loaded from: classes11.dex */
public final class WHU implements DialogInterface.OnClickListener {
    public final /* synthetic */ C1Y6 A00;
    public final /* synthetic */ C69490VoD A01;

    public WHU(C1Y6 c1y6, C69490VoD c69490VoD) {
        this.A01 = c69490VoD;
        this.A00 = c1y6;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        C69490VoD c69490VoD = this.A01;
        UserSession userSession = c69490VoD.A08;
        C70399WUb.A00(userSession).A0G(VG4.A0H, "cancel_button");
        C70399WUb A00 = C70399WUb.A00(userSession);
        String str = c69490VoD.A0H;
        String str2 = c69490VoD.A0G;
        EnumC39597He7 enumC39597He7 = c69490VoD.A09;
        C38321qM c38321qM = c69490VoD.A0A;
        String boostUnavailableIdentifier = c38321qM.A0C.getBoostUnavailableIdentifier();
        if (boostUnavailableIdentifier != null) {
            A00.A0Q(enumC39597He7, str, str2, boostUnavailableIdentifier, AbstractC65703TsZ.A14(c69490VoD, c38321qM));
            C1Y6.A01(this.A00);
            return;
        }
        throw new IllegalStateException("boost_unavailable_identifier cannot be null when boosted_status == UNAVAILABLE");
    }
}