package X;

import android.os.Handler;
import android.os.Looper;
import android.view.animation.Interpolator;

/* renamed from: X.7Rj, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C162987Rj {
    public float A00;
    public float A01;
    public float A02;
    public C55982hj A03;
    public float A04;
    public float A05;
    public float A06;
    public float A07;
    public float A08;
    public float A09;
    public boolean A0A;
    public final Handler A0B;
    public final InterfaceC55932he A0C;
    public final InterfaceC162977Ri A0D;
    public final Runnable A0E;
    public final Interpolator A0F;
    public final C55942hf A0G;
    public final C55952hg A0H;

    /* JADX WARN: Type inference failed for: r0v1, types: [android.view.animation.Interpolator, java.lang.Object] */
    public C162987Rj(C55952hg c55952hg, InterfaceC162977Ri interfaceC162977Ri) {
        C14360o3.A0B(c55952hg, 1);
        this.A0H = c55952hg;
        this.A0D = interfaceC162977Ri;
        this.A0F = new Object();
        this.A0G = new C55942hf(100.0d, 5.0d);
        this.A0B = new Handler(Looper.getMainLooper());
        this.A0C = new C668630d() { // from class: X.7Rl
            @Override // X.C668630d, X.InterfaceC55932he
            public final void Dnm(C55982hj c55982hj) {
                C14360o3.A0B(c55982hj, 0);
                float f = (float) c55982hj.A09.A00;
                if (f >= 1.0f) {
                    C0K8.A02(C162987Rj.class, "media_send_complete");
                }
                C162987Rj.A00(C162987Rj.this, 0.0f, f);
            }

            @Override // X.C668630d, X.InterfaceC55932he
            public final void Dnk(C55982hj c55982hj) {
                C162987Rj.this.A0D.CwW();
            }
        };
        this.A0E = new Runnable() { // from class: X.7Rm
            @Override // java.lang.Runnable
            public final void run() {
                C55982hj c55982hj = C162987Rj.this.A03;
                if (c55982hj != null && c55982hj.A09.A00 == 0.0d) {
                    c55982hj.A05(r6.A02);
                    c55982hj.A06(1.0d);
                }
            }
        };
    }

    public final void A02(float f, float f2, boolean z) {
        this.A05 = f;
        this.A04 = f - 0.0f;
        boolean z2 = false;
        if (f2 == 0.0f) {
            z2 = true;
        }
        this.A0A = !z2;
        this.A06 = f2;
        A00(this, this.A00, this.A02);
        if (z) {
            C55982hj A02 = this.A0H.A02();
            A02.A09(this.A0G);
            A02.A06 = true;
            A02.A05(0.0d);
            this.A03 = A02;
            InterfaceC55932he interfaceC55932he = this.A0C;
            A02.A0B(interfaceC55932he);
            A02.A0A(interfaceC55932he);
            this.A0B.postDelayed(this.A0E, 100L);
            return;
        }
        this.A03 = null;
    }

    public static final void A00(C162987Rj c162987Rj, float f, float f2) {
        float f3;
        if (c162987Rj.A01 == f2) {
            c162987Rj.A0D.Dx5(f2, f, c162987Rj.A07, c162987Rj.A08, c162987Rj.A09);
            return;
        }
        float f4 = (c162987Rj.A04 * f2) + 0.0f;
        float interpolation = c162987Rj.A0F.getInterpolation(f2);
        InterfaceC162977Ri interfaceC162977Ri = c162987Rj.A0D;
        float Abt = (interpolation * (interfaceC162977Ri.Abt() - 0.0f)) + 0.0f;
        if (c162987Rj.A0A) {
            f3 = (float) Math.toDegrees(Math.atan(Math.abs(Abt - c162987Rj.A08) / Math.abs(f4 - c162987Rj.A07)));
            if (f2 < 0.5f) {
                f3 = Math.max(f3, Math.abs(c162987Rj.A06));
            } else if (f2 >= 1.0f) {
                f3 = 0.0f;
            }
            if (c162987Rj.A05 >= 0.0f) {
                f3 = -f3;
            }
        } else {
            f3 = c162987Rj.A06;
        }
        interfaceC162977Ri.Dx5(f2, f, f4, Abt, f3);
        c162987Rj.A01 = f2;
        c162987Rj.A07 = f4;
        c162987Rj.A08 = Abt;
        c162987Rj.A09 = f3;
    }

    public final void A01() {
        C55982hj c55982hj = this.A03;
        if (c55982hj != null) {
            c55982hj.A0D.clear();
            this.A03 = null;
            this.A0B.removeCallbacks(this.A0E);
        }
        this.A00 = 0.0f;
    }
}
