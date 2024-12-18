package X;

import android.app.AlertDialog;
import android.view.ContextThemeWrapper;
import com.facebook.smartcapture.view.IdCaptureActivity;

/* loaded from: classes10.dex */
public final class TL9 implements Runnable {
    public final /* synthetic */ IdCaptureActivity A00;

    public TL9(IdCaptureActivity idCaptureActivity) {
        this.A00 = idCaptureActivity;
    }

    @Override // java.lang.Runnable
    public final void run() {
        IdCaptureActivity idCaptureActivity = this.A00;
        if (!idCaptureActivity.isFinishing()) {
            new AlertDialog.Builder(new ContextThemeWrapper(idCaptureActivity, idCaptureActivity.A01().A00)).setTitle(2131972924).setCancelable(false).setPositiveButton(2131972925, new DialogInterfaceOnClickListenerC63420Sjy(idCaptureActivity, 6)).show();
        }
    }
}
