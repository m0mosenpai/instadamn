package X;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.util.Arrays;

/* loaded from: classes11.dex */
public final class U9B extends Handler {
    public final /* synthetic */ C70519Wbc A00;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public U9B(Looper looper, C70519Wbc c70519Wbc) {
        super(looper);
        this.A00 = c70519Wbc;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        byte[] bArr = (byte[]) message.obj;
        if (bArr != null) {
            for (C70517Wba c70517Wba : this.A00.A08) {
                C70517Wba.A00(c70517Wba);
                if (Arrays.equals(c70517Wba.A04, bArr)) {
                    if (message.what == 2 && c70517Wba.A00 == 4) {
                        C70517Wba.A03(c70517Wba, false);
                        return;
                    }
                    return;
                }
            }
        }
    }
}
