package X;

import android.graphics.Path;
import android.graphics.PointF;
import java.util.List;

/* renamed from: X.Src, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C63669Src implements InterfaceC65629Tpq, InterfaceC65309Thl, InterfaceC65630Tpr {
    public boolean A00;
    public final Q2O A01;
    public final Path A02 = AbstractC166987dD.A0T();
    public final SK9 A03 = new SK9();
    public final AbstractC63308ShE A04;
    public final AbstractC63308ShE A05;
    public final C63686Srt A06;
    public final String A07;

    @Override // X.InterfaceC65309Thl
    public final void Dya() {
        this.A00 = false;
        this.A01.invalidateSelf();
    }

    @Override // X.InterfaceC65466Tki
    public final void ES5(List list, List list2) {
        for (int i = 0; i < list.size(); i++) {
            InterfaceC65466Tki interfaceC65466Tki = (InterfaceC65466Tki) list.get(i);
            if (interfaceC65466Tki instanceof C63665SrY) {
                C63665SrY c63665SrY = (C63665SrY) interfaceC65466Tki;
                if (c63665SrY.A03 == C05F.A00) {
                    this.A03.A00.add(c63665SrY);
                    c63665SrY.A04.add(this);
                }
            }
        }
    }

    @Override // X.InterfaceC65467Tkj
    public final void AAj(C62961SZe c62961SZe, Object obj) {
        AbstractC63308ShE abstractC63308ShE;
        if (obj == InterfaceC65609To0.A03) {
            abstractC63308ShE = this.A05;
        } else if (obj != InterfaceC65609To0.A04) {
            return;
        } else {
            abstractC63308ShE = this.A04;
        }
        abstractC63308ShE.A0A(c62961SZe);
    }

    @Override // X.InterfaceC65629Tpq
    public final Path Bbd() {
        boolean z = this.A00;
        Path path = this.A02;
        if (!z) {
            path.reset();
            C63686Srt c63686Srt = this.A06;
            if (!c63686Srt.A03) {
                PointF A03 = AbstractC63308ShE.A03(this.A05);
                float f = A03.x / 2.0f;
                float f2 = A03.y / 2.0f;
                float f3 = f * 0.55228f;
                float f4 = 0.55228f * f2;
                path.reset();
                if (c63686Srt.A04) {
                    float f5 = -f2;
                    path.moveTo(0.0f, f5);
                    float f6 = 0.0f - f3;
                    float f7 = -f;
                    float f8 = 0.0f - f4;
                    path.cubicTo(f6, f5, f7, f8, f7, 0.0f);
                    float f9 = f4 + 0.0f;
                    path.cubicTo(f7, f9, f6, f2, 0.0f, f2);
                    float f10 = f3 + 0.0f;
                    path.cubicTo(f10, f2, f, f9, f, 0.0f);
                    path.cubicTo(f, f8, f10, f5, 0.0f, f5);
                } else {
                    float f11 = -f2;
                    path.moveTo(0.0f, f11);
                    float f12 = f3 + 0.0f;
                    float f13 = 0.0f - f4;
                    path.cubicTo(f12, f11, f, f13, f, 0.0f);
                    float f14 = f4 + 0.0f;
                    path.cubicTo(f, f14, f12, f2, 0.0f, f2);
                    float f15 = 0.0f - f3;
                    float f16 = -f;
                    path.cubicTo(f15, f2, f16, f14, f16, 0.0f);
                    path.cubicTo(f16, f13, f15, f11, 0.0f, f11);
                }
                PointF A032 = AbstractC63308ShE.A03(this.A04);
                path.offset(A032.x, A032.y);
                path.close();
                this.A03.A00(path);
            }
            this.A00 = true;
        }
        return path;
    }

    @Override // X.InterfaceC65466Tki
    public final String getName() {
        return this.A07;
    }

    public C63669Src(Q2O q2o, C63686Srt c63686Srt, AbstractC63678Srl abstractC63678Srl) {
        this.A07 = c63686Srt.A02;
        this.A01 = q2o;
        QAd qAd = new QAd(c63686Srt.A00.A00);
        this.A05 = qAd;
        AbstractC63308ShE ALc = c63686Srt.A01.ALc();
        this.A04 = ALc;
        this.A06 = c63686Srt;
        abstractC63678Srl.A0C(qAd);
        abstractC63678Srl.A0C(ALc);
        qAd.A09(this);
        ALc.A09(this);
    }

    @Override // X.InterfaceC65467Tkj
    public final void EKH(C63221SfR c63221SfR, C63221SfR c63221SfR2, List list, int i) {
        AbstractC63251Sg7.A02(this, c63221SfR, c63221SfR2, list, i);
    }
}
