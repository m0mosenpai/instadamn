package X;

import android.graphics.Path;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.Srb, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C63668Srb implements InterfaceC65629Tpq, InterfaceC65309Thl, InterfaceC65630Tpr {
    public boolean A00;
    public final Q2O A01;
    public final Path A02 = AbstractC166987dD.A0T();
    public final SK9 A03 = new SK9();
    public final QAT A04;
    public final String A05;
    public final boolean A06;

    @Override // X.InterfaceC65309Thl
    public final void Dya() {
        this.A00 = false;
        this.A01.invalidateSelf();
    }

    @Override // X.InterfaceC65466Tki
    public final void ES5(List list, List list2) {
        ArrayList arrayList = null;
        for (int i = 0; i < list.size(); i++) {
            InterfaceC65466Tki interfaceC65466Tki = (InterfaceC65466Tki) list.get(i);
            if (interfaceC65466Tki instanceof C63665SrY) {
                C63665SrY c63665SrY = (C63665SrY) interfaceC65466Tki;
                if (c63665SrY.A03 == C05F.A00) {
                    this.A03.A00.add(c63665SrY);
                    c63665SrY.A04.add(this);
                }
            }
            if (interfaceC65466Tki instanceof C63664SrX) {
                arrayList = MSY.A0j(arrayList);
                arrayList.add(interfaceC65466Tki);
            }
        }
        this.A04.A02 = arrayList;
    }

    @Override // X.InterfaceC65467Tkj
    public final void AAj(C62961SZe c62961SZe, Object obj) {
        if (obj == InterfaceC65609To0.A02) {
            this.A04.A0A(c62961SZe);
        }
    }

    @Override // X.InterfaceC65629Tpq
    public final Path Bbd() {
        if (this.A00 && ((AbstractC63308ShE) this.A04).A03 == null) {
            return this.A02;
        }
        Path path = this.A02;
        path.reset();
        if (!this.A06) {
            Path path2 = (Path) this.A04.A06();
            if (path2 == null) {
                return path;
            }
            path.set(path2);
            path.setFillType(Path.FillType.EVEN_ODD);
            this.A03.A00(path);
        }
        this.A00 = true;
        return path;
    }

    @Override // X.InterfaceC65466Tki
    public final String getName() {
        return this.A05;
    }

    public C63668Srb(Q2O q2o, C63693Ss1 c63693Ss1, AbstractC63678Srl abstractC63678Srl) {
        this.A05 = c63693Ss1.A01;
        this.A06 = c63693Ss1.A02;
        this.A01 = q2o;
        QAT qat = new QAT(c63693Ss1.A00.A00);
        this.A04 = qat;
        abstractC63678Srl.A0C(qat);
        qat.A09(this);
    }

    @Override // X.InterfaceC65467Tkj
    public final void EKH(C63221SfR c63221SfR, C63221SfR c63221SfR2, List list, int i) {
        AbstractC63251Sg7.A02(this, c63221SfR, c63221SfR2, list, i);
    }
}
