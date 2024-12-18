package X;

import android.os.Handler;
import android.os.Message;
import java.lang.ref.WeakReference;

/* loaded from: classes11.dex */
public final class U98 extends Handler {
    public final WeakReference A00;

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        U8O u8o;
        C14360o3.A0B(message, 0);
        if (message.what == 1 && (u8o = (U8O) this.A00.get()) != null && u8o.A04) {
            u8o.A04 = false;
            u8o.A0G.clear();
            u8o.invalidateSelf();
        }
    }

    public U98(U8O u8o) {
        this.A00 = new WeakReference(u8o);
    }
}
