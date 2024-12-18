package X;

import android.content.DialogInterface;

/* loaded from: classes11.dex */
public final class WHX implements DialogInterface.OnClickListener {
    public final /* synthetic */ C1Y6 A00;
    public final /* synthetic */ C69490VoD A01;

    public WHX(C1Y6 c1y6, C69490VoD c69490VoD) {
        this.A00 = c1y6;
        this.A01 = c69490VoD;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        C1Y6 c1y6 = this.A00;
        C69490VoD c69490VoD = this.A01;
        c1y6.A0A(c69490VoD.A02, c69490VoD.A08, c69490VoD.A0G, c69490VoD.A0E, false, false, false);
    }
}
