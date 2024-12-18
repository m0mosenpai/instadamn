package X;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;

/* renamed from: X.Utc, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C67624Utc extends C70470WYb implements Handler.Callback, XLB {
    public final C4R4 A00;
    public final Handler A01;

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        C14360o3.A0B(message, 0);
        if (message.what == 1) {
            this.A00.E1j(new C117275Sm(C4Y0.A1P, EnumC117265Sl.A0I, "Reused SurfaceView Surface Was Released"));
        }
        return true;
    }

    @Override // X.XLB
    public final void D7n(Exception exc) {
        Handler handler = this.A01;
        if (handler != null) {
            handler.obtainMessage(1).sendToTarget();
            return;
        }
        this.A00.E1j(new C117275Sm(C4Y0.A1P, EnumC117265Sl.A0I, "Reused SurfaceView Surface Was Released"));
    }

    public C67624Utc(Looper looper, C4R4 c4r4) {
        super(c4r4);
        Handler handler;
        this.A00 = c4r4;
        if (looper != null) {
            handler = new Handler(looper, this);
        } else {
            handler = null;
        }
        this.A01 = handler;
    }
}
