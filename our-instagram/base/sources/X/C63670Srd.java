package X;

import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;
import java.util.List;

/* renamed from: X.Srd, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C63670Srd implements InterfaceC65629Tpq, InterfaceC65309Thl, InterfaceC65630Tpr {
    public boolean A00;
    public final Q2O A02;
    public final AbstractC63308ShE A06;
    public final AbstractC63308ShE A07;
    public final AbstractC63308ShE A08;
    public final String A09;
    public final boolean A0A;
    public final Path A03 = AbstractC166987dD.A0T();
    public final RectF A04 = AbstractC166987dD.A0X();
    public final SK9 A05 = new SK9();
    public AbstractC63308ShE A01 = null;

    @Override // X.InterfaceC65309Thl
    public final void Dya() {
        this.A00 = false;
        this.A02.invalidateSelf();
    }

    @Override // X.InterfaceC65466Tki
    public final void ES5(List list, List list2) {
        for (int i = 0; i < list.size(); i++) {
            InterfaceC65466Tki interfaceC65466Tki = (InterfaceC65466Tki) list.get(i);
            if (interfaceC65466Tki instanceof C63665SrY) {
                C63665SrY c63665SrY = (C63665SrY) interfaceC65466Tki;
                if (c63665SrY.A03 == C05F.A00) {
                    this.A05.A00.add(c63665SrY);
                    c63665SrY.A04.add(this);
                }
            }
            if (interfaceC65466Tki instanceof C63664SrX) {
                this.A01 = ((C63664SrX) interfaceC65466Tki).A01;
            }
        }
    }

    @Override // X.InterfaceC65467Tkj
    public final void AAj(C62961SZe c62961SZe, Object obj) {
        AbstractC63308ShE abstractC63308ShE;
        if (obj == InterfaceC65609To0.A05) {
            abstractC63308ShE = this.A08;
        } else if (obj == InterfaceC65609To0.A04) {
            abstractC63308ShE = this.A07;
        } else if (obj != InterfaceC65609To0.A0C) {
            return;
        } else {
            abstractC63308ShE = this.A06;
        }
        abstractC63308ShE.A0A(c62961SZe);
    }

    @Override // X.InterfaceC65629Tpq
    public final Path Bbd() {
        AbstractC63308ShE abstractC63308ShE;
        boolean z = this.A00;
        Path path = this.A03;
        if (!z) {
            path.reset();
            if (!this.A0A) {
                PointF A03 = AbstractC63308ShE.A03(this.A08);
                float f = A03.x / 2.0f;
                float f2 = A03.y / 2.0f;
                float A0B = ((QAZ) this.A06).A0B();
                if (A0B == 0.0f && (abstractC63308ShE = this.A01) != null) {
                    A0B = Math.min(AbstractC63308ShE.A01(abstractC63308ShE), Math.min(f, f2));
                }
                float min = Math.min(f, f2);
                if (A0B > min) {
                    A0B = min;
                }
                PointF A032 = AbstractC63308ShE.A03(this.A07);
                path.moveTo(A032.x + f, (A032.y - f2) + A0B);
                path.lineTo(A032.x + f, (A032.y + f2) - A0B);
                if (A0B > 0.0f) {
                    RectF rectF = this.A04;
                    float f3 = A032.x + f;
                    float f4 = A0B * 2.0f;
                    float f5 = A032.y + f2;
                    rectF.set(f3 - f4, f5 - f4, f3, f5);
                    path.arcTo(rectF, 0.0f, 90.0f, false);
                }
                path.lineTo((A032.x - f) + A0B, A032.y + f2);
                if (A0B > 0.0f) {
                    RectF rectF2 = this.A04;
                    float f6 = A032.x - f;
                    float f7 = A032.y + f2;
                    float f8 = A0B * 2.0f;
                    rectF2.set(f6, f7 - f8, f8 + f6, f7);
                    path.arcTo(rectF2, 90.0f, 90.0f, false);
                }
                path.lineTo(A032.x - f, (A032.y - f2) + A0B);
                if (A0B > 0.0f) {
                    RectF rectF3 = this.A04;
                    float f9 = A032.x - f;
                    float f10 = A032.y - f2;
                    float f11 = A0B * 2.0f;
                    rectF3.set(f9, f10, f9 + f11, f11 + f10);
                    path.arcTo(rectF3, 180.0f, 90.0f, false);
                }
                path.lineTo((A032.x + f) - A0B, A032.y - f2);
                if (A0B > 0.0f) {
                    RectF rectF4 = this.A04;
                    float f12 = A032.x + f;
                    float f13 = A0B * 2.0f;
                    float f14 = A032.y - f2;
                    rectF4.set(f12 - f13, f14, f12, f14 + f13);
                    path.arcTo(rectF4, 270.0f, 90.0f, false);
                }
                path.close();
                this.A05.A00(path);
            }
            this.A00 = true;
        }
        return path;
    }

    @Override // X.InterfaceC65466Tki
    public final String getName() {
        return this.A09;
    }

    public C63670Srd(Q2O q2o, C63694Ss2 c63694Ss2, AbstractC63678Srl abstractC63678Srl) {
        this.A09 = c63694Ss2.A03;
        this.A0A = c63694Ss2.A04;
        this.A02 = q2o;
        AbstractC63308ShE ALc = c63694Ss2.A01.ALc();
        this.A07 = ALc;
        AbstractC63308ShE ALc2 = c63694Ss2.A02.ALc();
        this.A08 = ALc2;
        QAZ A00 = AbstractC63684Srr.A00(c63694Ss2.A00);
        this.A06 = A00;
        abstractC63678Srl.A0C(ALc);
        abstractC63678Srl.A0C(ALc2);
        abstractC63678Srl.A0C(A00);
        ALc.A09(this);
        ALc2.A09(this);
        A00.A09(this);
    }

    @Override // X.InterfaceC65467Tkj
    public final void EKH(C63221SfR c63221SfR, C63221SfR c63221SfR2, List list, int i) {
        AbstractC63251Sg7.A02(this, c63221SfR, c63221SfR2, list, i);
    }
}
