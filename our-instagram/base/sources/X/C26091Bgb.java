package X;

import android.graphics.Canvas;
import android.graphics.Paint;

/* renamed from: X.Bgb, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26091Bgb extends C0T6 implements InterfaceC30925Dic {
    public final int A00;
    public final C66248U5s A01;
    public final InterfaceC30789DgQ A02;
    public final InterfaceC30790DgR A03;

    @Override // X.InterfaceC30925Dic
    public final void AQT(Canvas canvas, C28225CcV c28225CcV) {
        C66248U5s c66248U5s;
        InterfaceC30789DgQ interfaceC30789DgQ;
        C14360o3.A0B(c28225CcV, 1);
        Paint paint = c28225CcV.A00;
        if (paint == null) {
            paint = AbstractC166987dD.A0S(7);
            AbstractC166987dD.A1R(paint);
            c28225CcV.A00 = paint;
        }
        C66248U5s c66248U5s2 = this.A01;
        C26091Bgb c26091Bgb = c28225CcV.A03;
        if (c26091Bgb != null) {
            c66248U5s = c26091Bgb.A01;
        } else {
            c66248U5s = null;
        }
        if (!C14360o3.A0K(c66248U5s2, c66248U5s)) {
            if (c66248U5s2 != null) {
                paint.setShadowLayer(c66248U5s2.A02, c66248U5s2.A00, c66248U5s2.A01, c66248U5s2.A03);
            } else {
                paint.clearShadowLayer();
            }
        }
        int i = this.A00;
        C26091Bgb c26091Bgb2 = c28225CcV.A03;
        if (c26091Bgb2 == null || i != c26091Bgb2.A00) {
            W8J.A01(i, paint);
        }
        InterfaceC30789DgQ interfaceC30789DgQ2 = this.A02;
        C26091Bgb c26091Bgb3 = c28225CcV.A03;
        if (c26091Bgb3 != null) {
            interfaceC30789DgQ = c26091Bgb3.A02;
        } else {
            interfaceC30789DgQ = null;
        }
        if (!C14360o3.A0K(interfaceC30789DgQ2, interfaceC30789DgQ)) {
            if (interfaceC30789DgQ2 instanceof C26103Bgn) {
                if (paint.getShader() != null) {
                    paint.setShader(null);
                }
                int color = paint.getColor();
                int i2 = ((C26103Bgn) interfaceC30789DgQ2).A00;
                if (color != i2) {
                    paint.setColor(i2);
                }
            } else if (interfaceC30789DgQ2 instanceof C26102Bgm) {
                paint.setShader(((C26102Bgm) interfaceC30789DgQ2).A00.F7h());
            } else {
                throw B4Z.A00();
            }
        }
        c28225CcV.A03 = this;
        InterfaceC30790DgR interfaceC30790DgR = this.A03;
        if (interfaceC30790DgR instanceof C26104Bgo) {
            canvas.drawPath(c28225CcV.A00((C26104Bgo) interfaceC30790DgR, null), paint);
            return;
        }
        if (interfaceC30790DgR instanceof InterfaceC31146Dmp) {
            if ((interfaceC30790DgR instanceof C26108Bgs) && ((C26108Bgs) interfaceC30790DgR).A00 == 1) {
                C50662Um.A03("CanvasFill", "A Line shape cannot be 'filled'. Ignoring.");
                return;
            } else {
                ((InterfaceC31146Dmp) interfaceC30790DgR).AQS(canvas, paint);
                return;
            }
        }
        throw B4Z.A00();
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C26091Bgb) {
                C26091Bgb c26091Bgb = (C26091Bgb) obj;
                if (!C14360o3.A0K(this.A03, c26091Bgb.A03) || !C14360o3.A0K(this.A02, c26091Bgb.A02) || this.A00 != c26091Bgb.A00 || !C14360o3.A0K(this.A01, c26091Bgb.A01)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return ((AbstractC166997dE.A0J(this.A02, AbstractC166987dD.A0G(this.A03)) + this.A00) * 31) + AbstractC167017dG.A0M(this.A01);
    }

    public C26091Bgb(C66248U5s c66248U5s, InterfaceC30789DgQ interfaceC30789DgQ, InterfaceC30790DgR interfaceC30790DgR, int i) {
        this.A03 = interfaceC30790DgR;
        this.A02 = interfaceC30789DgQ;
        this.A00 = i;
        this.A01 = c66248U5s;
    }
}
