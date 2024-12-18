package X;

import android.os.Handler;
import android.os.Message;

/* renamed from: X.Dws, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class HandlerC31739Dws extends Handler {
    public final GYA A00;

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        C14360o3.A0B(message, 0);
        if (message.what == 1) {
            this.A00.E4H();
        }
    }

    public HandlerC31739Dws(GYA gya) {
        this.A00 = gya;
    }
}
