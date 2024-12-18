package X;

import android.content.DialogInterface;

/* loaded from: classes11.dex */
public final class WID implements DialogInterface.OnShowListener {
    public final /* synthetic */ C69490VoD A00;

    public WID(C69490VoD c69490VoD) {
        this.A00 = c69490VoD;
    }

    @Override // android.content.DialogInterface.OnShowListener
    public final void onShow(DialogInterface dialogInterface) {
        C69490VoD c69490VoD = this.A00;
        C70399WUb A00 = C70399WUb.A00(c69490VoD.A08);
        VG4 vg4 = VG4.A0S;
        String str = c69490VoD.A0G;
        A00.A02 = c69490VoD.A0H;
        A00.A01 = str;
        A00.A0I(vg4, "boost_unavailable_dialog");
    }
}
