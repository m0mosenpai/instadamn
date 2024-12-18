package X;

import android.os.Looper;
import android.os.Message;
import android.os.Process;

/* renamed from: X.50E, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C50E implements InterfaceC88013w9 {
    public int A00;
    public boolean A01;
    public final C2WY A02;
    public final InterfaceC09390do A03 = AbstractC09440dt.A00(EnumC09460dv.A02, new C206859Dq(this, 1));
    public final int A04;

    @Override // X.InterfaceC88013w9
    public final void EnU(Looper looper, String str) {
    }

    private final void A00() {
        C2WY c2wy = this.A02;
        if (c2wy.A06() && this.A01) {
            return;
        }
        if (c2wy.A07()) {
            this.A00 = Process.getThreadPriority(0);
        }
        A01(this.A04);
        this.A01 = true;
    }

    private final void A01(int i) {
        if (this.A02.A09()) {
            A6T a6t = (A6T) this.A03.getValue();
            long currentTimeMillis = System.currentTimeMillis();
            if (currentTimeMillis - a6t.A00 > a6t.A01) {
                a6t.A00 = currentTimeMillis;
            } else {
                return;
            }
        }
        Process.setThreadPriority(i);
    }

    @Override // X.InterfaceC88013w9
    public final void AVg(Message message) {
        if (this.A02.A07()) {
            A01(this.A00);
        }
    }

    @Override // X.InterfaceC88013w9
    public final void AVj() {
        C2WY c2wy = this.A02;
        if (c2wy.A08() && c2wy.A07()) {
            A01(this.A00);
        }
    }

    @Override // X.InterfaceC88013w9
    public final void Ena() {
        if (this.A02.A08()) {
            A00();
        }
    }

    public C50E(C2WY c2wy) {
        this.A02 = c2wy;
        this.A04 = c2wy.A00();
    }

    @Override // X.InterfaceC88013w9
    public final void EnF(Message message) {
        A00();
    }
}
