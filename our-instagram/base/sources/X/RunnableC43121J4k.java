package X;

import android.media.AudioManager;
import android.os.Handler;

/* renamed from: X.J4k, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class RunnableC43121J4k implements Runnable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ ViewOnKeyListenerC677333n A01;

    public RunnableC43121J4k(ViewOnKeyListenerC677333n viewOnKeyListenerC677333n, int i) {
        this.A01 = viewOnKeyListenerC677333n;
        this.A00 = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ViewOnKeyListenerC677333n viewOnKeyListenerC677333n;
        try {
            viewOnKeyListenerC677333n = this.A01;
            AudioManager audioManager = viewOnKeyListenerC677333n.A03;
            int i = -1;
            if (this.A00 == 24) {
                i = 1;
            }
            audioManager.adjustStreamVolume(3, i, 1);
        } catch (Exception unused) {
            viewOnKeyListenerC677333n = this.A01;
            C0f5 AEp = viewOnKeyListenerC677333n.A04.AEp(AbstractC111324zv.A00(3627), 817905066);
            AEp.ABW("onKey", "Error adjusting stream volume in background thread");
            AEp.report();
        }
        AudioManager audioManager2 = viewOnKeyListenerC677333n.A03;
        C14360o3.A0B(audioManager2, 0);
        ((Handler) viewOnKeyListenerC677333n.A0B.getValue()).post(new J5N(viewOnKeyListenerC677333n, this.A00, audioManager2.getStreamVolume(3)));
    }
}
