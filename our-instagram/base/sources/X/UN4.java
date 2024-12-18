package X;

import android.graphics.Matrix;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import java.io.IOException;

/* loaded from: classes11.dex */
public final class UN4 extends UML implements InterfaceC58722mV {
    public static final Handler A0F = AbstractC167007dF.A0J();
    public static final C27531Vg A0G;
    public int A00;
    public long A01;
    public C1VO A02;
    public C1W1 A03;
    public C2nP A04;
    public C70426WVe A05;
    public Object A06;
    public boolean A07;
    public boolean A08;
    public Runnable A09;
    public final UMN A0A;
    public final C2nS A0B;
    public final W1O A0C;
    public final Runnable A0D;
    public final C1W8 A0E;

    public UN4(C1W8 c1w8) {
        C14360o3.A0B(c1w8, 3);
        C2nS c2nS = new C2nS();
        this.A0B = c2nS;
        if (c2nS.A00 != null) {
            throw new NullPointerException("trying to set localImagePerfStateListener without a localPerfStatePublisher");
        }
        this.A0E = c1w8;
        this.A0D = new RunnableC71245Wqa(this);
        Matrix matrix = C162867Qx.A03;
        this.A0A = new UMN(U8U.A00, InterfaceC27851Wn.A01);
        this.A0C = new W1O(this);
        this.A00 = 1;
    }

    @Override // X.InterfaceC59242nQ
    public final Drawable AZ0() {
        Drawable A02 = A02(1);
        UMN umn = this.A0A;
        if (A02 == umn) {
            return ((C162867Qx) umn).A00;
        }
        return A02;
    }

    @Override // X.InterfaceC59242nQ
    public final synchronized long BGi() {
        return this.A01;
    }

    @Override // X.InterfaceC58722mV
    public final void DVf(C1W1 c1w1) {
        boolean A1W;
        C2nP c2nP = this.A04;
        C70426WVe c70426WVe = this.A05;
        if (c1w1 == this.A03 && c2nP != null && c70426WVe != null) {
            synchronized (c1w1) {
                A1W = AbstractC167007dF.A1W(c1w1.A02);
            }
            if (A1W) {
                C1VO c1vo = (C1VO) c1w1.A02();
                if (c1vo != null) {
                    try {
                        if (c1vo.A05()) {
                            C70426WVe.A00(c1vo, c1w1, c2nP, c70426WVe, this, false, false);
                        }
                    } finally {
                        C1VO.A01(c1vo);
                    }
                }
                c70426WVe.A01(c1w1, c2nP, this);
            }
        }
    }

    @Override // X.UML, java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        A09();
        A08();
        this.A01 = 0L;
        super.close();
        UMM.A00(this);
        invalidateSelf();
        this.A0A.A01(U8U.A00);
        C1VO.A01(this.A02);
        this.A02 = null;
        this.A05 = null;
        C1W1 c1w1 = this.A03;
        if (c1w1 != null) {
            c1w1.A04();
        }
        this.A03 = null;
        this.A08 = false;
        this.A04 = null;
        this.A00 = 1;
        try {
            this.A0B.A02 = null;
        } catch (IOException unused) {
        }
    }

    public final void A08() {
        if (this.A07) {
            A0F.removeCallbacks(this.A0D);
            this.A07 = false;
        }
    }

    public final void A09() {
        C27531Vg c27531Vg = A0G;
        synchronized (c27531Vg.A02) {
            c27531Vg.A00.remove(this);
        }
    }

    @Override // X.InterfaceC59242nQ
    public final Object Ajt() {
        return this.A06;
    }

    @Override // X.InterfaceC59242nQ
    public final C2nP BGo() {
        return this.A04;
    }

    @Override // X.InterfaceC59242nQ
    public final Runnable Bm6() {
        return this.A09;
    }

    @Override // X.InterfaceC59242nQ
    public final boolean CUk() {
        return this.A08;
    }

    @Override // X.InterfaceC58722mV
    public final void DFy(C1W1 c1w1) {
        C2nP c2nP = this.A04;
        C70426WVe c70426WVe = this.A05;
        if (c1w1 == this.A03 && c2nP != null && c70426WVe != null) {
            c70426WVe.A01(c1w1, c2nP, this);
        }
    }

    @Override // X.InterfaceC58722mV
    public final void Dbx(C1W1 c1w1) {
        float f;
        C2nP c2nP = this.A04;
        C70426WVe c70426WVe = this.A05;
        if (c1w1 == this.A03 && c2nP != null && c70426WVe != null && !c1w1.A08()) {
            synchronized (c1w1) {
                f = c1w1.A00;
            }
            A06(f);
        }
    }

    static {
        C27531Vg c27531Vg;
        synchronized (C27531Vg.class) {
            c27531Vg = C27531Vg.A05;
            if (c27531Vg == null) {
                c27531Vg = new C27531Vg();
                C27531Vg.A05 = c27531Vg;
            }
        }
        A0G = c27531Vg;
    }

    public final void A0A() {
        C2nP c2nP;
        A08();
        A0G.A00(this);
        if (this.A05 != null && (c2nP = this.A04) != null) {
            this.A0B.Dec(VMN.A00(null, null, c2nP, this), c2nP, BGi());
        }
    }

    public final void A0B(Drawable drawable, C1VO c1vo) {
        C1VO c1vo2;
        A09();
        A08();
        UMN umn = this.A0A;
        if (drawable != umn) {
            umn.A01(U8U.A00);
        }
        C1VO.A01(this.A02);
        if (c1vo != null) {
            c1vo2 = c1vo.A03();
        } else {
            c1vo2 = null;
        }
        this.A02 = c1vo2;
        A03(drawable, 1);
    }

    @Override // X.InterfaceC59242nQ
    public final void EcP(Runnable runnable) {
        this.A09 = runnable;
    }

    @Override // X.AbstractC66312U8l, android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return super.getIntrinsicHeight();
    }

    @Override // X.AbstractC66312U8l, android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return super.getIntrinsicWidth();
    }

    @Override // X.InterfaceC59312na
    public final void release() {
        close();
    }
}
