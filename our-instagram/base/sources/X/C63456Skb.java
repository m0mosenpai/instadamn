package X;

import android.os.Handler;
import android.os.Message;

/* renamed from: X.Skb, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C63456Skb implements Handler.Callback {
    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        if (message.what == 1) {
            ((InterfaceC65558Tme) message.obj).recycle();
            return true;
        }
        return false;
    }
}
