package X;

import android.os.Handler;
import android.os.Message;

/* renamed from: X.Skc, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C63457Skc implements Handler.Callback {
    public final /* synthetic */ C62976SZw A00;

    public C63457Skc(C62976SZw c62976SZw) {
        this.A00 = c62976SZw;
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        int i = message.what;
        if (i == 1) {
            this.A00.A02((QBY) message.obj);
            return true;
        }
        if (i == 2) {
            this.A00.A0D.A00((AbstractC63880SvE) message.obj);
            return false;
        }
        return false;
    }
}
