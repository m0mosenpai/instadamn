package X;

import android.os.Looper;
import com.google.android.exoplayer2.Timeline;

/* renamed from: X.4Wq, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C96814Wq {
    public int A00;
    public int A01;
    public long A02 = -9223372036854775807L;
    public Looper A03;
    public Object A04;
    public boolean A05;
    public boolean A06;
    public boolean A07;
    public final InterfaceC96064Tp A08;
    public final Timeline A09;
    public final InterfaceC96714Wg A0A;
    public final C2A7 A0B;

    public final synchronized void A03(boolean z) {
        this.A05 = z | this.A05;
        this.A06 = true;
        notifyAll();
    }

    public final void A00() {
        C4B8.A04(!this.A07);
        this.A07 = true;
        this.A0A.ENl(this);
    }

    public final void A01(int i) {
        C4B8.A04(!this.A07);
        this.A01 = i;
    }

    public final void A02(Object obj) {
        C4B8.A04(!this.A07);
        this.A04 = obj;
    }

    public C96814Wq(Looper looper, InterfaceC96714Wg interfaceC96714Wg, InterfaceC96064Tp interfaceC96064Tp, Timeline timeline, C2A7 c2a7, int i) {
        this.A0A = interfaceC96714Wg;
        this.A08 = interfaceC96064Tp;
        this.A09 = timeline;
        this.A03 = looper;
        this.A0B = c2a7;
        this.A00 = i;
    }
}
