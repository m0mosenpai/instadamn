package X;

import android.content.DialogInterface;

/* renamed from: X.Ofu, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class DialogInterfaceOnClickListenerC55279Ofu implements DialogInterface.OnClickListener {
    public final /* synthetic */ C1Y6 A00;
    public final /* synthetic */ C69667Vt8 A01;
    public final /* synthetic */ C69490VoD A02;

    public DialogInterfaceOnClickListenerC55279Ofu(C1Y6 c1y6, C69667Vt8 c69667Vt8, C69490VoD c69490VoD) {
        this.A02 = c69490VoD;
        this.A00 = c1y6;
        this.A01 = c69667Vt8;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        C70399WUb.A00(this.A02.A08).A0G(VG4.A0I, "choose_new_audio_button");
        C1Y6.A02(this.A00, this.A01, false);
    }
}
