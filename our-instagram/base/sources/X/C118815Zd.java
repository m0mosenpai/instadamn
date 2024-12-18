package X;

import android.graphics.Paint;
import androidx.compose.ui.graphics.layer.GraphicsLayer;

/* renamed from: X.5Zd, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C118815Zd extends C59U {
    public static final C5AO A03;
    public Y8P A00;
    public C5DW A01;
    public AbstractC137606Lg A02;

    static {
        C5AN c5an = new C5AN();
        c5an.ERg(C1132359l.A02);
        c5an.A01.setStrokeWidth(1.0f);
        c5an.A01.setStyle(Paint.Style.STROKE);
        A03 = c5an;
    }

    private final void A00() {
        if (!((C59V) this).A03) {
            A0a();
            if (this.A00 != null) {
                C14360o3.A0A(this.A02);
                throw new NullPointerException("isPlacementApproachInProgress");
            }
            A0N().E4Q();
            C14360o3.A0A(this.A06);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void A0k(C5DW c5dw) {
        Y8P y8p;
        if (!c5dw.equals(this.A01)) {
            if ((((C58J) c5dw).A03.A01 & 512) != 0) {
                y8p = this.A00;
                if (y8p == null) {
                    y8p = new Y8P(this);
                }
            } else {
                y8p = null;
            }
            this.A00 = y8p;
        }
        this.A01 = c5dw;
    }

    @Override // X.InterfaceC1131659e
    public final int Cnj(int i) {
        if (this.A00 != null) {
            C14360o3.A0A(this.A06);
            throw new NullPointerException("maxApproachIntrinsicHeight");
        }
        C5DW c5dw = this.A01;
        C59U c59u = this.A06;
        C14360o3.A0A(c59u);
        return c5dw.Cnl(c59u, this, i);
    }

    @Override // X.InterfaceC1131659e
    public final int Cnm(int i) {
        if (this.A00 != null) {
            C14360o3.A0A(this.A06);
            throw new NullPointerException("maxApproachIntrinsicWidth");
        }
        C5DW c5dw = this.A01;
        C59U c59u = this.A06;
        C14360o3.A0A(c59u);
        return c5dw.Cno(c59u, this, i);
    }

    @Override // X.InterfaceC1131659e
    public final int Cpe(int i) {
        if (this.A00 != null) {
            C14360o3.A0A(this.A06);
            throw new NullPointerException("minApproachIntrinsicHeight");
        }
        C5DW c5dw = this.A01;
        C59U c59u = this.A06;
        C14360o3.A0A(c59u);
        return c5dw.Cpg(c59u, this, i);
    }

    @Override // X.InterfaceC1131659e
    public final int Cph(int i) {
        if (this.A00 != null) {
            C14360o3.A0A(this.A06);
            throw new NullPointerException("minApproachIntrinsicWidth");
        }
        C5DW c5dw = this.A01;
        C59U c59u = this.A06;
        C14360o3.A0A(c59u);
        return c5dw.Cpj(c59u, this, i);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C118815Zd(C5DW c5dw, AnonymousClass599 anonymousClass599) {
        super(anonymousClass599);
        C25781BaK c25781BaK;
        this.A01 = c5dw;
        if (anonymousClass599.A08 != null) {
            c25781BaK = new C25781BaK(this);
        } else {
            c25781BaK = null;
        }
        this.A02 = c25781BaK;
        this.A00 = (((C58J) c5dw).A03.A01 & 512) != 0 ? new Y8P(this) : null;
    }

    @Override // X.C59U, X.C59W
    public final void A0J(GraphicsLayer graphicsLayer, float f, long j) {
        super.A0J(graphicsLayer, f, j);
        A00();
    }

    @Override // X.C59U, X.C59W
    public final void A0K(InterfaceC16660sJ interfaceC16660sJ, float f, long j) {
        super.A0K(interfaceC16660sJ, f, j);
        A00();
    }

    @Override // X.InterfaceC1131559d
    public final C59W CpF(long j) {
        A0I(j);
        Y8P y8p = this.A00;
        if (y8p != null) {
            AbstractC137606Lg abstractC137606Lg = y8p.A00.A02;
            C14360o3.A0A(abstractC137606Lg);
            abstractC137606Lg.A0N();
            throw new NullPointerException("isMeasurementApproachInProgress-ozmzZPI");
        }
        C5DW c5dw = this.A01;
        C59U c59u = this.A06;
        C14360o3.A0A(c59u);
        A0f(c5dw.CpE(c59u, this, j));
        A0Z();
        return this;
    }
}
