package X;

import android.graphics.SurfaceTexture;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.view.Surface;

/* renamed from: X.5fT, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public class C121755fT implements InterfaceC121765fU, Handler.Callback {
    public final Handler A00;
    public final C4R4 A01;

    @Override // android.os.Handler.Callback
    public boolean handleMessage(Message message) {
        C95334Qt c95334Qt;
        C4QV c4qv;
        C14360o3.A0B(message, 0);
        if (message.what == 1 && (c95334Qt = (C95334Qt) ((C4R3) this.A01).A00.get()) != null && (c4qv = c95334Qt.A0M) != null) {
            c4qv.DrP();
        }
        return true;
    }

    @Override // X.InterfaceC121765fU
    public final void DM6(SurfaceTexture surfaceTexture, Surface surface) {
        Message obtainMessage;
        Handler handler = this.A00;
        if (handler != null && (obtainMessage = handler.obtainMessage(2)) != null) {
            obtainMessage.sendToTarget();
        }
    }

    @Override // X.InterfaceC121765fU
    public final void DrM(SurfaceTexture surfaceTexture, Surface surface) {
        this.A01.DrA();
    }

    @Override // X.InterfaceC121765fU
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        C4QV c4qv;
        Message obtainMessage;
        Handler handler = this.A00;
        if (handler != null && (obtainMessage = handler.obtainMessage(1)) != null) {
            obtainMessage.sendToTarget();
            return;
        }
        C95334Qt c95334Qt = (C95334Qt) ((C4R3) this.A01).A00.get();
        if (c95334Qt == null || (c4qv = c95334Qt.A0M) == null) {
            return;
        }
        c4qv.DrP();
    }

    public C121755fT(Looper looper, C4R4 c4r4) {
        Handler handler;
        this.A01 = c4r4;
        if (looper != null) {
            handler = new Handler(looper, this);
        } else {
            handler = null;
        }
        this.A00 = handler;
    }

    @Override // X.InterfaceC121765fU
    public final void DrL(SurfaceTexture surfaceTexture, Surface surface, int i, int i2) {
        C14360o3.A07(C0KB.A00(surface));
    }

    @Override // X.InterfaceC121765fU
    public final void E1f(Surface surface) {
        C14360o3.A07(Integer.toHexString(surface.hashCode()));
    }
}
