package X;

import android.content.DialogInterface;
import android.os.Handler;
import android.os.Message;
import java.lang.ref.WeakReference;

/* loaded from: classes11.dex */
public final class U94 extends Handler {
    public WeakReference A00;

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        int i = message.what;
        if (i != -3 && i != -2 && i != -1) {
            if (i == 1) {
                ((DialogInterface) message.obj).dismiss();
                return;
            }
            return;
        }
        ((DialogInterface.OnClickListener) message.obj).onClick((DialogInterface) this.A00.get(), i);
    }
}
