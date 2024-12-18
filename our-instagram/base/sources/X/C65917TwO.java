package X;

import android.os.Looper;
import com.google.android.exoplayer2.Timeline;
import java.util.Map;

/* renamed from: X.TwO, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C65917TwO extends C4XV implements InterfaceC71906X9q {
    public long A00;
    public C2BC A01;
    public boolean A02;
    public boolean A03;
    public boolean A04;
    public final C4W1 A05;
    public final C4W2 A06;
    public final C4XR A07;
    public final InterfaceC71862X7v A08;
    public final InterfaceC96424Va A09;
    public final C4XO A0A;

    @Override // X.C4XV
    public final void A0B() {
    }

    @Override // X.C4XW
    public final C4Z0 AMl(C4WX c4wx, InterfaceC96344Us interfaceC96344Us, long j) {
        InterfaceC92354Bq ALy = this.A09.ALy();
        C2BC c2bc = this.A01;
        if (c2bc != null) {
            ALy.addTransferListener(c2bc);
        }
        Map map = C65771Ttm.A0e;
        C4W1 c4w1 = this.A05;
        android.net.Uri uri = c4w1.A00;
        InterfaceC71862X7v interfaceC71862X7v = this.A08;
        C4WZ c4wz = C4WZ.A03;
        C65995Txq c65995Txq = new C65995Txq(((C66006Ty1) interfaceC71862X7v).A00);
        C4XR c4xr = this.A07;
        return new C65771Ttm(uri, new C4XY(c4wx, super.A03.A02, 0), c4xr, A09(c4wx), c65995Txq, this, interfaceC96344Us, ALy, this.A0A, c4w1.A03);
    }

    @Override // X.C4XW
    public final void Cp0() {
    }

    private void A00() {
        Timeline c126635nz = new C126635nz(this.A06, this.A00, this.A04, this.A02);
        if (this.A03) {
            c126635nz = new C66007Ty2(c126635nz, this);
        }
        A0A(c126635nz);
    }

    @Override // X.C4XV
    public final void A0C(C2BC c2bc) {
        this.A01 = c2bc;
        C4XR c4xr = this.A07;
        c4xr.E5P();
        Looper myLooper = Looper.myLooper();
        myLooper.getClass();
        C4WZ c4wz = super.A00;
        C4B8.A01(c4wz);
        c4xr.Eb4(myLooper, c4wz);
        A00();
    }

    @Override // X.C4XW
    public final C4W2 BRA() {
        return this.A06;
    }

    @Override // X.C4XW
    public final void EEP(C4Z0 c4z0) {
        C65771Ttm c65771Ttm = (C65771Ttm) c4z0;
        if (c65771Ttm.A0E) {
            for (C98044aj c98044aj : c65771Ttm.A0H) {
                c98044aj.A08();
            }
        }
        c65771Ttm.A0S.A03(c65771Ttm);
        c65771Ttm.A0L.removeCallbacksAndMessages(null);
        c65771Ttm.A06 = null;
        c65771Ttm.A0F = true;
    }

    public C65917TwO(C4W2 c4w2, C4XR c4xr, InterfaceC71862X7v interfaceC71862X7v, InterfaceC96424Va interfaceC96424Va, C4XO c4xo) {
        C4W1 c4w1 = c4w2.A03;
        c4w1.getClass();
        this.A05 = c4w1;
        this.A06 = c4w2;
        this.A09 = interfaceC96424Va;
        this.A08 = interfaceC71862X7v;
        this.A07 = c4xr;
        this.A0A = c4xo;
        this.A03 = true;
        this.A00 = -9223372036854775807L;
    }

    @Override // X.InterfaceC71906X9q
    public final void DnN(long j, boolean z, boolean z2) {
        if (j == -9223372036854775807L) {
            j = this.A00;
        }
        if (!this.A03 && this.A00 == j && this.A04 == z && this.A02 == z2) {
            return;
        }
        this.A00 = j;
        this.A04 = z;
        this.A02 = z2;
        this.A03 = false;
        A00();
    }
}
