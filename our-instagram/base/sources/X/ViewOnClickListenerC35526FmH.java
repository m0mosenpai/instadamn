package X;

import android.view.View;
import com.instagram.debug.devoptions.api.DeveloperOptionsLauncher;

/* renamed from: X.FmH, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class ViewOnClickListenerC35526FmH implements View.OnClickListener {
    public final /* synthetic */ C34963Fan A00;

    public ViewOnClickListenerC35526FmH(C34963Fan c34963Fan) {
        this.A00 = c34963Fan;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int A05 = C0f9.A05(-2095012191);
        C34963Fan c34963Fan = this.A00;
        DeveloperOptionsLauncher.launchHomeDeliveryDebugTool(c34963Fan.A00, c34963Fan.A02, c34963Fan.A04);
        C0f9.A0C(1023194094, A05);
    }
}
