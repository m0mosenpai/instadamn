package X;

import android.os.Handler;
import android.os.Message;

/* loaded from: classes10.dex */
public final class QDK extends AbstractC100374ez implements InterfaceC100384f0 {
    public final Handler A00;

    @Override // X.InterfaceC100384f0
    public final void start() {
    }

    public QDK(InterfaceC100264eo[] interfaceC100264eoArr) {
        super(interfaceC100264eoArr);
        this.A00 = new Q3Y(C87923w0.A00().A01.getLooper(), this);
    }

    @Override // X.InterfaceC100384f0
    public final void E66(C88023wA c88023wA) {
        Message obtain = Message.obtain();
        obtain.obj = c88023wA;
        this.A00.sendMessage(obtain);
    }
}
