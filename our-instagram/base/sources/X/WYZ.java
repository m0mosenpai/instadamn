package X;

import android.content.Context;
import android.view.Surface;
import android.view.SurfaceControl;
import android.view.SurfaceView;
import android.view.View;
import android.view.ViewGroup;

/* loaded from: classes11.dex */
public final class WYZ implements C4RH {
    public SurfaceControl A00;
    public Utd A01;
    public Surface A02;
    public SurfaceControl A03;
    public SurfaceView A04;
    public X9Q A05;
    public final C121745fS A06;
    public final XLA A07;

    @Override // X.C4RH
    public final View AMm(Context context, C4RP c4rp, C4RP c4rp2) {
        Surface surface;
        SurfaceControl surfaceControl;
        XLA xla = this.A07;
        C121745fS c121745fS = this.A06;
        if (!c121745fS.A07 || ((surfaceControl = this.A00) != null && !surfaceControl.isValid())) {
            this.A04 = null;
            this.A00 = null;
        }
        SurfaceControl surfaceControl2 = this.A03;
        if (surfaceControl2 == null || !surfaceControl2.isValid() || (surface = this.A02) == null || !surface.isValid()) {
            this.A02 = null;
            this.A03 = null;
        }
        SurfaceControl surfaceControl3 = this.A00;
        if (surfaceControl3 == null && (surfaceControl3 = this.A03) == null) {
            surfaceControl3 = new SurfaceControl.Builder().setName(Integer.toHexString(hashCode())).setBufferSize(0, 0).build();
            C14360o3.A07(surfaceControl3);
        }
        SurfaceView surfaceView = this.A04;
        SurfaceView surfaceView2 = surfaceView;
        if (surfaceView == null) {
            UtR utR = new UtR(context);
            this.A05 = utR;
            surfaceView2 = utR;
        }
        if (this.A04 == null) {
            this.A04 = surfaceView2;
            Utd utd = new Utd(surfaceControl3, surfaceView2, c4rp, c121745fS, this.A05, xla);
            utd.A00 = this.A02;
            surfaceView2.getHolder().addCallback(utd);
            this.A01 = utd;
        }
        this.A03 = null;
        this.A02 = null;
        this.A00 = surfaceControl3;
        return surfaceView2;
    }

    public static final /* synthetic */ Surface A00(WYZ wyz) {
        SurfaceControl build = new SurfaceControl.Builder().setName(Integer.toHexString(wyz.hashCode())).setBufferSize(0, 0).build();
        C14360o3.A07(build);
        Utd utd = wyz.A01;
        if (utd != null) {
            utd.A03(build);
        }
        wyz.A00 = build;
        return new Surface(build);
    }

    @Override // X.C4RH
    public final void ACK(C4ST c4st) {
        Surface surface;
        SurfaceControl A01;
        C126145nB c126145nB = c4st.A06;
        if (c126145nB != null && (surface = c126145nB.A00) != null && surface.isValid() && (A01 = c126145nB.A01()) != null && A01.isValid()) {
            this.A02 = surface;
            this.A03 = A01;
        }
    }

    @Override // X.C4RH
    public final Surface BAQ() {
        Utd utd = this.A01;
        if (utd != null) {
            return ((WL0) utd).A00;
        }
        return null;
    }

    @Override // X.C4RH
    public final C6Q2 Be3() {
        return new C6Q2(this.A06);
    }

    @Override // X.C4RH
    public final InterfaceC126155nC C4P() {
        Surface surface;
        SurfaceControl surfaceControl = this.A00;
        Utd utd = this.A01;
        if (utd == null || (surface = ((WL0) utd).A00) == null) {
            return null;
        }
        return new C126145nB(surface, surfaceControl);
    }

    @Override // X.C4RH
    public final void D9z(ViewGroup viewGroup) {
        Utd utd;
        C121745fS c121745fS = this.A06;
        if (c121745fS.A03 && (utd = this.A01) != null) {
            utd.A02();
        }
        if (!c121745fS.A02) {
            this.A01 = null;
            this.A00 = null;
        }
    }

    @Override // X.C4RH
    public final void Ded() {
        if (this.A06.A04) {
            Utd utd = this.A01;
            if (utd != null) {
                utd.A02();
            }
            this.A01 = null;
            this.A00 = null;
        }
    }

    @Override // X.C4RH
    public final void Dzu(int i, int i2, float f) {
        Utd utd = this.A01;
        if (utd != null) {
            Utd.A00(utd, Double.valueOf(i / i2), ((WL0) utd).A02.A01);
        }
    }

    public WYZ(C121745fS c121745fS, XLA xla) {
        this.A06 = c121745fS;
        this.A07 = xla;
    }
}
