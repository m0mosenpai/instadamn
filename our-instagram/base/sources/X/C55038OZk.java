package X;

import android.os.Handler;
import android.os.Looper;

/* renamed from: X.OZk, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C55038OZk {
    public int A00;
    public O1X A01;
    public boolean A02;
    public final Handler A03;
    public final OGv A04;
    public final C55100ObB A05;
    public final InterfaceC58103PpS A06;
    public final C55000OUz A07;
    public final Handler.Callback A08;

    public static final void A00(C55038OZk c55038OZk) {
        c55038OZk.A02 = true;
        Handler handler = c55038OZk.A03;
        if (!handler.hasMessages(1)) {
            c55038OZk.A07.A00(AnonymousClass001.A0O("turnBluetoothOn: send MSG_START_SCO | attempts: ", c55038OZk.A00), new Object[0]);
            c55038OZk.A00 = 0;
            handler.sendEmptyMessage(1);
        }
    }

    public static final void A01(C55038OZk c55038OZk, boolean z) {
        C55100ObB c55100ObB = c55038OZk.A05;
        c55038OZk.A07.A00("turnBluetoothOff: remove MSG_START_SCO messages", new Object[0]);
        if (z) {
            c55038OZk.A02 = false;
            c55038OZk.A00 = 0;
        }
        Handler handler = c55038OZk.A03;
        handler.removeMessages(1);
        handler.removeMessages(2);
        c55100ObB.A04(false);
    }

    public C55038OZk(C55100ObB c55100ObB, InterfaceC58103PpS interfaceC58103PpS, C55000OUz c55000OUz) {
        this.A05 = c55100ObB;
        this.A07 = c55000OUz;
        C55342Oh7 c55342Oh7 = new C55342Oh7(this, 1);
        this.A08 = c55342Oh7;
        this.A06 = new C55739Op8(interfaceC58103PpS);
        this.A03 = new Handler(Looper.getMainLooper(), c55342Oh7);
        this.A04 = new OGv(this);
    }
}
