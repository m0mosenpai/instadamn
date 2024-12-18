package X;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;

/* loaded from: classes11.dex */
public final class U9C extends Handler {
    public C68835Vcr A00;

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        C68835Vcr c68835Vcr;
        C14360o3.A0B(message, 0);
        if (message.what == 1 && (c68835Vcr = this.A00) != null) {
            UMC umc = c68835Vcr.A00;
            umc.A02.DQV(0.0f, 0.0f);
            umc.A00 = true;
        }
    }

    public U9C() {
        super(Looper.getMainLooper());
    }
}
