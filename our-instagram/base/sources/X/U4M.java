package X;

import android.os.Handler;
import android.os.Message;

/* loaded from: classes11.dex */
public final class U4M implements Handler.Callback {
    public final Handler.Callback A00;

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        String str;
        C14360o3.A0B(message, 0);
        Object obj = message.obj;
        if (obj instanceof U40) {
            C14360o3.A0C(obj, "null cannot be cast to non-null type com.bloks.foa.core.surface.MessageParam");
            str = ((U40) obj).A00;
            C1LN.A01(str);
        } else {
            str = null;
        }
        try {
            return this.A00.handleMessage(message);
        } finally {
            if (str != null) {
                C1LN.A00();
            }
        }
    }

    public U4M(Handler.Callback callback) {
        this.A00 = callback;
    }
}
