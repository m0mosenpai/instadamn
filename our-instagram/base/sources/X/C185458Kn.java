package X;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;

/* renamed from: X.8Kn, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C185458Kn {
    public int A00;
    public int A01;
    public final Handler A02;
    public final InterfaceC185448Km A03;
    public final InterfaceC185428Kk A04;

    public C185458Kn(InterfaceC185448Km interfaceC185448Km, InterfaceC185428Kk interfaceC185428Kk, int i, int i2) {
        this.A01 = i;
        this.A00 = i2;
        this.A04 = interfaceC185428Kk;
        this.A03 = interfaceC185448Km;
        final Looper mainLooper = Looper.getMainLooper();
        this.A02 = new Handler(mainLooper) { // from class: X.8Ko
            @Override // android.os.Handler
            public final void handleMessage(Message message) {
                C185458Kn c185458Kn = this;
                int i3 = c185458Kn.A01;
                if (i3 == 0) {
                    c185458Kn.A03.onFinish();
                } else {
                    c185458Kn.A04.Dt9(i3);
                }
                int i4 = c185458Kn.A01 - 1;
                c185458Kn.A01 = i4;
                if (i4 >= 0) {
                    sendMessageDelayed(Message.obtain(), c185458Kn.A00);
                }
            }
        };
    }
}
