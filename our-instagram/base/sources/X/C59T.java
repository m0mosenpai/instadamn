package X;

import android.graphics.Paint;
import androidx.compose.ui.graphics.layer.GraphicsLayer;

/* renamed from: X.59T, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C59T extends C59U {
    public static final C5AO A02;
    public AbstractC137606Lg A00;
    public final C5AX A01;

    static {
        C5AN c5an = new C5AN();
        c5an.ERg(C1132359l.A06);
        c5an.A01.setStrokeWidth(1.0f);
        c5an.A01.setStyle(Paint.Style.STROKE);
        A02 = c5an;
    }

    @Override // X.InterfaceC1131659e
    public final int Cnj(int i) {
        C25283BGz A00 = AnonymousClass599.A00(this.A0H);
        InterfaceC1127857k interfaceC1127857k = (InterfaceC1127857k) A00.A00.getValue();
        AnonymousClass599 anonymousClass599 = A00.A01;
        return interfaceC1127857k.Cnk(anonymousClass599.A0W.A04, anonymousClass599.A0U.A0J.A0L(), i);
    }

    @Override // X.InterfaceC1131659e
    public final int Cnm(int i) {
        C25283BGz A00 = AnonymousClass599.A00(this.A0H);
        InterfaceC1127857k interfaceC1127857k = (InterfaceC1127857k) A00.A00.getValue();
        AnonymousClass599 anonymousClass599 = A00.A01;
        return interfaceC1127857k.Cnn(anonymousClass599.A0W.A04, anonymousClass599.A0U.A0J.A0L(), i);
    }

    @Override // X.InterfaceC1131659e
    public final int Cpe(int i) {
        C25283BGz A00 = AnonymousClass599.A00(this.A0H);
        InterfaceC1127857k interfaceC1127857k = (InterfaceC1127857k) A00.A00.getValue();
        AnonymousClass599 anonymousClass599 = A00.A01;
        return interfaceC1127857k.Cpf(anonymousClass599.A0W.A04, anonymousClass599.A0U.A0J.A0L(), i);
    }

    @Override // X.InterfaceC1131659e
    public final int Cph(int i) {
        C25283BGz A00 = AnonymousClass599.A00(this.A0H);
        InterfaceC1127857k interfaceC1127857k = (InterfaceC1127857k) A00.A00.getValue();
        AnonymousClass599 anonymousClass599 = A00.A01;
        return interfaceC1127857k.Cpi(anonymousClass599.A0W.A04, anonymousClass599.A0U.A0J.A0L(), i);
    }

    public C59T(AnonymousClass599 anonymousClass599) {
        super(anonymousClass599);
        C25780BaJ c25780BaJ;
        C5AX c5ax = new C5AX();
        this.A01 = c5ax;
        c5ax.A07(this);
        if (anonymousClass599.A08 != null) {
            c25780BaJ = new C25780BaJ(this);
        } else {
            c25780BaJ = null;
        }
        this.A00 = c25780BaJ;
    }

    @Override // X.C59U, X.C59W
    public final void A0J(GraphicsLayer graphicsLayer, float f, long j) {
        super.A0J(graphicsLayer, f, j);
        if (!((C59V) this).A03) {
            A0a();
            this.A0H.A0U.A0J.A0N();
        }
    }

    @Override // X.C59U, X.C59W
    public final void A0K(InterfaceC16660sJ interfaceC16660sJ, float f, long j) {
        super.A0K(interfaceC16660sJ, f, j);
        if (!((C59V) this).A03) {
            A0a();
            this.A0H.A0U.A0J.A0N();
        }
    }

    @Override // X.InterfaceC1131559d
    public final C59W CpF(long j) {
        A0I(j);
        AnonymousClass599 anonymousClass599 = this.A0H;
        C57S A0A = anonymousClass599.A0A();
        int i = A0A.A00;
        if (i > 0) {
            int i2 = 0;
            Object[] objArr = A0A.A02;
            do {
                ((AnonymousClass599) objArr[i2]).A0U.A0J.A09 = C05F.A0C;
                i2++;
            } while (i2 < i);
        }
        A0f(anonymousClass599.A07.CpD(this, anonymousClass599.A0U.A0J.A0L(), j));
        A0Z();
        return this;
    }
}
