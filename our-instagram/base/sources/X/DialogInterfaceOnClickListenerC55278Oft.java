package X;

import android.content.DialogInterface;
import androidx.fragment.app.FragmentActivity;

/* renamed from: X.Oft, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class DialogInterfaceOnClickListenerC55278Oft implements DialogInterface.OnClickListener {
    public final /* synthetic */ C1Y6 A00;
    public final /* synthetic */ C69667Vt8 A01;
    public final /* synthetic */ C69490VoD A02;

    public DialogInterfaceOnClickListenerC55278Oft(C1Y6 c1y6, C69667Vt8 c69667Vt8, C69490VoD c69490VoD) {
        this.A02 = c69490VoD;
        this.A00 = c1y6;
        this.A01 = c69667Vt8;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        C69490VoD c69490VoD = this.A02;
        FragmentActivity fragmentActivity = c69490VoD.A02;
        C1GJ.A00(fragmentActivity, AbstractC018607g.A00(fragmentActivity), AbstractC1571873x.A02(new NAD(1, c69490VoD, this.A01, this.A00), c69490VoD.A08, true, false));
    }
}
