package X;

import android.graphics.Paint;

/* renamed from: X.Srh, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C63674Srh implements InterfaceC65309Thl {
    public boolean A00 = true;
    public final AbstractC63308ShE A01;
    public final AbstractC63308ShE A02;
    public final AbstractC63308ShE A03;
    public final AbstractC63308ShE A04;
    public final InterfaceC65309Thl A05;
    public final AbstractC63308ShE A06;

    @Override // X.InterfaceC65309Thl
    public final void Dya() {
        this.A00 = true;
        this.A05.Dya();
    }

    public final void A00(Paint paint) {
        if (this.A00) {
            this.A00 = false;
            double A01 = AbstractC63308ShE.A01(this.A02) * 0.017453292519943295d;
            float A012 = AbstractC63308ShE.A01(this.A03);
            paint.setShadowLayer(AbstractC63308ShE.A01(this.A04), ((float) Math.sin(A01)) * A012, ((float) Math.cos(A01 + 3.141592653589793d)) * A012, AbstractC167017dG.A02(AbstractC166987dD.A0H(this.A01.A06()), Math.round(AbstractC63308ShE.A01(this.A06))));
        }
    }

    public final void A01(C62961SZe c62961SZe) {
        C58812QAv c58812QAv;
        AbstractC63308ShE abstractC63308ShE = this.A06;
        if (c62961SZe == null) {
            c58812QAv = null;
        } else {
            c58812QAv = new C58812QAv(this, c62961SZe);
        }
        abstractC63308ShE.A0A(c58812QAv);
    }

    public C63674Srh(InterfaceC65309Thl interfaceC65309Thl, AbstractC63678Srl abstractC63678Srl, SI6 si6) {
        this.A05 = interfaceC65309Thl;
        AbstractC63308ShE abstractC63308ShE = new AbstractC63308ShE(si6.A00.A00);
        this.A01 = abstractC63308ShE;
        abstractC63308ShE.A09(this);
        abstractC63678Srl.A0C(abstractC63308ShE);
        QAZ A00 = AbstractC63684Srr.A00(si6.A03);
        this.A06 = A00;
        A00.A09(this);
        abstractC63678Srl.A0C(A00);
        QAZ A002 = AbstractC63684Srr.A00(si6.A01);
        this.A02 = A002;
        A002.A09(this);
        abstractC63678Srl.A0C(A002);
        QAZ A003 = AbstractC63684Srr.A00(si6.A02);
        this.A03 = A003;
        A003.A09(this);
        abstractC63678Srl.A0C(A003);
        QAZ A004 = AbstractC63684Srr.A00(si6.A04);
        this.A04 = A004;
        A004.A09(this);
        abstractC63678Srl.A0C(A004);
    }
}
