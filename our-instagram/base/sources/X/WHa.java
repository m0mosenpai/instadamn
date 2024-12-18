package X;

import android.content.DialogInterface;

/* loaded from: classes11.dex */
public final class WHa implements DialogInterface.OnClickListener {
    public final /* synthetic */ C1Y6 A00;
    public final /* synthetic */ C69490VoD A01;

    public WHa(C1Y6 c1y6, C69490VoD c69490VoD) {
        this.A01 = c69490VoD;
        this.A00 = c1y6;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        C70399WUb.A00(this.A01.A08).A0G(VG4.A0E, "cancel_button");
        C1Y6.A01(this.A00);
    }
}
