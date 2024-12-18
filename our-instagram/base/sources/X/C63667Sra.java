package X;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.RectF;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;

/* renamed from: X.Sra, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C63667Sra implements InterfaceC65629Tpq, InterfaceC65309Thl, InterfaceC65628Tpp, InterfaceC65308Thk, InterfaceC65630Tpr {
    public C63672Srf A00;
    public final Matrix A01 = AbstractC166987dD.A0Q();
    public final Path A02 = AbstractC166987dD.A0T();
    public final Q2O A03;
    public final AbstractC63308ShE A04;
    public final AbstractC63308ShE A05;
    public final SQ3 A06;
    public final AbstractC63678Srl A07;
    public final String A08;
    public final boolean A09;

    @Override // X.InterfaceC65308Thk
    public final void A75(ListIterator listIterator) {
        if (this.A00 != null) {
            return;
        }
        while (listIterator.hasPrevious() && listIterator.previous() != this) {
        }
        ArrayList A1E = AbstractC166987dD.A1E();
        while (listIterator.hasPrevious()) {
            A1E.add(listIterator.previous());
            listIterator.remove();
        }
        Collections.reverse(A1E);
        this.A00 = new C63672Srf(this.A03, null, this.A07, "Repeater", A1E, this.A09);
    }

    @Override // X.InterfaceC65467Tkj
    public final void AAj(C62961SZe c62961SZe, Object obj) {
        AbstractC63308ShE abstractC63308ShE;
        if (!this.A06.A04(c62961SZe, obj)) {
            if (obj == InterfaceC65609To0.A0N) {
                abstractC63308ShE = this.A04;
            } else if (obj != InterfaceC65609To0.A0O) {
                return;
            } else {
                abstractC63308ShE = this.A05;
            }
            abstractC63308ShE.A0A(c62961SZe);
        }
    }

    @Override // X.InterfaceC65628Tpp
    public final void AQR(Canvas canvas, Matrix matrix, int i) {
        float A01 = AbstractC63308ShE.A01(this.A04);
        float A012 = AbstractC63308ShE.A01(this.A05);
        SQ3 sq3 = this.A06;
        float A013 = AbstractC63308ShE.A01(sq3.A06) / 100.0f;
        float A014 = AbstractC63308ShE.A01(sq3.A01) / 100.0f;
        int i2 = (int) A01;
        while (true) {
            i2--;
            if (i2 >= 0) {
                Matrix matrix2 = this.A01;
                matrix2.set(matrix);
                float f = i2;
                matrix2.preConcat(sq3.A01(f + A012));
                this.A00.AQR(canvas, matrix2, (int) (i * AbstractC58321PtD.A01(A014, A013, f / A01)));
            } else {
                return;
            }
        }
    }

    @Override // X.InterfaceC65628Tpp
    public final void Aho(Matrix matrix, RectF rectF, boolean z) {
        this.A00.Aho(matrix, rectF, z);
    }

    @Override // X.InterfaceC65629Tpq
    public final Path Bbd() {
        Path Bbd = this.A00.Bbd();
        Path path = this.A02;
        path.reset();
        float A01 = AbstractC63308ShE.A01(this.A04);
        float A012 = AbstractC63308ShE.A01(this.A05);
        int i = (int) A01;
        while (true) {
            i--;
            if (i >= 0) {
                Matrix matrix = this.A01;
                matrix.set(this.A06.A01(i + A012));
                path.addPath(Bbd, matrix);
            } else {
                return path;
            }
        }
    }

    @Override // X.InterfaceC65309Thl
    public final void Dya() {
        this.A03.invalidateSelf();
    }

    @Override // X.InterfaceC65466Tki
    public final void ES5(List list, List list2) {
        this.A00.ES5(list, list2);
    }

    @Override // X.InterfaceC65466Tki
    public final String getName() {
        return this.A08;
    }

    public C63667Sra(Q2O q2o, C63687Sru c63687Sru, AbstractC63678Srl abstractC63678Srl) {
        this.A03 = q2o;
        this.A07 = abstractC63678Srl;
        this.A08 = c63687Sru.A03;
        this.A09 = c63687Sru.A04;
        QAZ A00 = AbstractC63684Srr.A00(c63687Sru.A00);
        this.A04 = A00;
        abstractC63678Srl.A0C(A00);
        A00.A09(this);
        QAZ A002 = AbstractC63684Srr.A00(c63687Sru.A01);
        this.A05 = A002;
        abstractC63678Srl.A0C(A002);
        A002.A09(this);
        SQ3 sq3 = new SQ3(c63687Sru.A02);
        this.A06 = sq3;
        sq3.A03(abstractC63678Srl);
        sq3.A02(this);
    }

    @Override // X.InterfaceC65467Tkj
    public final void EKH(C63221SfR c63221SfR, C63221SfR c63221SfR2, List list, int i) {
        AbstractC63251Sg7.A02(this, c63221SfR, c63221SfR2, list, i);
        for (int i2 = 0; i2 < this.A00.A04.size(); i2++) {
            InterfaceC65466Tki interfaceC65466Tki = (InterfaceC65466Tki) this.A00.A04.get(i2);
            if (interfaceC65466Tki instanceof InterfaceC65630Tpr) {
                AbstractC63251Sg7.A02((InterfaceC65630Tpr) interfaceC65466Tki, c63221SfR, c63221SfR2, list, i);
            }
        }
    }
}
