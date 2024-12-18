package X;

import android.content.DialogInterface;

/* loaded from: classes11.dex */
public final class WHT implements DialogInterface.OnClickListener {
    public final /* synthetic */ C1Y6 A00;
    public final /* synthetic */ C69490VoD A01;

    public WHT(C1Y6 c1y6, C69490VoD c69490VoD) {
        this.A01 = c69490VoD;
        this.A00 = c1y6;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        C69490VoD c69490VoD = this.A01;
        C70399WUb.A00(c69490VoD.A08).A0S(VG4.A0H.toString(), MSV.A00(1508));
        C1Y6.A03(this.A00, c69490VoD);
    }
}
