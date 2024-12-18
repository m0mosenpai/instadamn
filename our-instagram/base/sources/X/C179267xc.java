package X;

import android.os.Handler;

/* renamed from: X.7xc, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C179267xc implements InterfaceC179087xK {
    public C179427xs A00;
    public C179377xn A01;
    public boolean A02;
    public boolean A03;
    public final C179287xe A04;
    public final C179277xd A05;
    public final C179257xb A06;
    public final C178747wm A07;
    public final C179377xn A08;
    public final boolean A09;

    @Override // X.InterfaceC179087xK
    public final void CNk(C178907x2 c178907x2) {
        C14360o3.A0B(c178907x2, 0);
        c178907x2.A03(this.A08);
        c178907x2.A03(this.A01);
    }

    @Override // X.InterfaceC179087xK
    public final void detach() {
        C179287xe c179287xe = this.A04;
        c179287xe.A0G = false;
        c179287xe.A08.post(c179287xe.A0A);
    }

    @Override // X.InterfaceC179087xK
    public final void release() {
    }

    public C179267xc(Handler handler, C179257xb c179257xb, C178747wm c178747wm, boolean z) {
        C179427xs c179427xs;
        this.A07 = c178747wm;
        this.A09 = z;
        this.A06 = c179257xb;
        C179277xd c179277xd = new C179277xd(this);
        this.A05 = c179277xd;
        this.A04 = new C179287xe(handler, c179277xd, z, z);
        this.A08 = new C179377xn(c178747wm);
        this.A01 = new C179377xn(c178747wm);
        if (z) {
            c179427xs = null;
        } else {
            c179427xs = new C179427xs(c178747wm, new C179387xo(), new C179417xr(), false);
        }
        this.A00 = c179427xs;
    }

    @Override // X.InterfaceC179087xK
    public final void ACv(InterfaceC180227zC interfaceC180227zC) {
    }
}
