package X;

import android.os.Handler;
import android.os.Message;

/* renamed from: X.Utf, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C67626Utf extends C121755fT implements Handler.Callback, XLD {
    @Override // X.C121755fT, android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        C14360o3.A0B(message, 0);
        if (message.what == 3) {
            this.A01.E1j(new C117275Sm(C4Y0.A1U, EnumC117265Sl.A0I, "Reused Surface Texture Was Released"));
        }
        return super.handleMessage(message);
    }

    @Override // X.XLD
    public final void DrN(IllegalArgumentException illegalArgumentException) {
        Message obtainMessage;
        Handler handler = this.A00;
        if (handler != null && (obtainMessage = handler.obtainMessage(3)) != null) {
            obtainMessage.sendToTarget();
        } else {
            this.A01.E1j(new C117275Sm(C4Y0.A1U, EnumC117265Sl.A0I, "Reused Surface Texture Was Released"));
        }
    }
}
