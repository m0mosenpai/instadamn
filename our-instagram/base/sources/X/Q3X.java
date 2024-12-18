package X;

import android.os.Handler;
import android.os.Message;

/* loaded from: classes10.dex */
public final class Q3X extends Handler {
    public final C62409SAj A00;

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        AbstractC09820fg.A01(this.A00.A00);
        C88633xO.A01().remove(this);
    }

    public Q3X(C62409SAj c62409SAj) {
        this.A00 = c62409SAj;
    }
}
