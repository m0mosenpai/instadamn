package X;

import android.opengl.GLES20;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.YFc, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public abstract class AbstractC73479YFc implements YRN {
    public float A00;
    public float A01;
    public int A02;
    public YQ3 A03;
    public final long A04 = System.currentTimeMillis();

    public void A01(YQ3 yq3) {
        float f;
        int i;
        this.A03 = yq3;
        float f2 = 0.0f;
        if (yq3 != null) {
            f = ((AbstractC73478YFb) yq3).A00;
        } else {
            f = 0.0f;
        }
        this.A01 = f;
        if (yq3 != null) {
            i = ((AbstractC73478YFb) yq3).A03;
        } else {
            i = 0;
        }
        this.A02 = i;
        if (yq3 != null) {
            f2 = yq3.AbQ() / 255.0f;
        }
        this.A00 = f2;
    }

    @Override // X.YRN
    public final void AJw(W92 w92) {
        YRN yrn;
        if (this instanceof AbstractC72289Xam) {
            AbstractC72289Xam abstractC72289Xam = (AbstractC72289Xam) this;
            YQQ yqq = ((AbstractC73478YFb) abstractC72289Xam.A09).A05;
            yqq.getClass();
            yqq.EV5(w92);
            abstractC72289Xam.A02();
            return;
        }
        if (this instanceof C72280Xad) {
            YRN[] yrnArr = ((C72280Xad) this).A00;
            int i = 0;
            do {
                YRN yrn2 = yrnArr[i];
                C14360o3.A0A(yrn2);
                yrn2.AJw(w92);
                i++;
            } while (i < 3);
            return;
        }
        if (!(this instanceof C72279Xac) || (yrn = ((C72279Xac) this).A00) == null) {
            return;
        }
        yrn.AJw(w92);
    }

    @Override // X.YRN
    public final void ANd(W92 w92, List list) {
        YRN yrn;
        if (this instanceof AbstractC72289Xam) {
            YQ3 yq3 = this.A03;
            C18C.A07(yq3, AbstractC111324zv.A00(2741));
            List CA2 = yq3.CA2(w92, list);
            if (CA2 != null) {
                Iterator it = CA2.iterator();
                while (it.hasNext()) {
                    AJw((W92) it.next());
                }
                return;
            }
            return;
        }
        if ((this instanceof C72279Xac) && (yrn = ((C72279Xac) this).A00) != null) {
            yrn.ANd(w92, list);
        }
    }

    @Override // X.YRN
    public final void AQo() {
        if (this instanceof AbstractC72289Xam) {
            AbstractC72289Xam abstractC72289Xam = (AbstractC72289Xam) this;
            int i = abstractC72289Xam.A02;
            AbstractC72289Xam.A00(abstractC72289Xam, i, abstractC72289Xam.A01 - i);
            abstractC72289Xam.A02 = abstractC72289Xam.A01;
            return;
        }
        if (this instanceof C72280Xad) {
            YRN[] yrnArr = ((C72280Xad) this).A00;
            int i2 = 0;
            do {
                YRN yrn = yrnArr[i2];
                C14360o3.A0A(yrn);
                yrn.AQo();
                i2++;
            } while (i2 < 3);
            return;
        }
        if (!(this instanceof C72279Xac)) {
        } else {
            throw AbstractC166987dD.A1D("Backed brush doesn't support incremental drawing");
        }
    }

    @Override // X.YRN
    public final void ASf(W92 w92) {
        YRN yrn;
        if (this instanceof AbstractC72289Xam) {
            AbstractC72289Xam abstractC72289Xam = (AbstractC72289Xam) this;
            AbstractC72282Xaf abstractC72282Xaf = abstractC72289Xam.A09;
            YQQ yqq = ((AbstractC73478YFb) abstractC72282Xaf).A05;
            yqq.getClass();
            yqq.EV5(w92);
            ((AbstractC73478YFb) abstractC72282Xaf).A05.AIm(w92.A03);
            abstractC72289Xam.A02();
            GLES20.glBindBuffer(34962, abstractC72289Xam.A04.A03);
            C70123W5d c70123W5d = abstractC72289Xam.A04;
            int i = abstractC72289Xam.A02;
            int i2 = abstractC72289Xam.A07;
            c70123W5d.A01(i * i2, (abstractC72289Xam.A01 - i) * i2);
            GLES20.glBindBuffer(34962, 0);
            VBE A00 = abstractC72289Xam.A04.A00();
            C70123W5d c70123W5d2 = abstractC72289Xam.A04;
            C71071WnT c71071WnT = c70123W5d2.A02;
            if (c71071WnT != null) {
                c71071WnT.A01.add(c70123W5d2);
            }
            abstractC72289Xam.A04 = A00;
            abstractC72289Xam.A05 = null;
            return;
        }
        if (this instanceof C72280Xad) {
            YRN[] yrnArr = ((C72280Xad) this).A00;
            int i3 = 0;
            do {
                YRN yrn2 = yrnArr[i3];
                C14360o3.A0A(yrn2);
                yrn2.ASf(w92);
                i3++;
            } while (i3 < 3);
            return;
        }
        if (!(this instanceof C72279Xac) || (yrn = ((C72279Xac) this).A00) == null) {
            return;
        }
        yrn.ASf(w92);
    }

    @Override // X.YRN
    public final void E5O() {
        if (this instanceof C72279Xac) {
            C72279Xac c72279Xac = (C72279Xac) this;
            YRN yrn = c72279Xac.A00;
            if (yrn != null) {
                C72278Xab c72278Xab = c72279Xac.A01;
                if (c72278Xab.A02 != null) {
                    yrn.E5O();
                    c72278Xab.A02.A02();
                    c72278Xab.A02.A03(yrn);
                    return;
                }
                return;
            }
            return;
        }
        if (!(this instanceof C72280Xad)) {
            return;
        }
        YRN[] yrnArr = ((C72280Xad) this).A00;
        int i = 0;
        do {
            YRN yrn2 = yrnArr[i];
            C14360o3.A0A(yrn2);
            yrn2.E5O();
            i++;
        } while (i < 3);
    }

    @Override // X.YP4
    public final void E5r() {
        C73480YFd c73480YFd;
        if (this instanceof C72279Xac) {
            C72279Xac c72279Xac = (C72279Xac) this;
            YRN yrn = c72279Xac.A00;
            if (yrn != null && (c73480YFd = c72279Xac.A01.A02) != null) {
                yrn.E5r();
                C73480YFd.A01(c73480YFd);
                yrn.AQo();
                C73480YFd.A00();
                return;
            }
            return;
        }
        if (this instanceof C72284Xah) {
            C72284Xah c72284Xah = (C72284Xah) this;
            XO2 xo2 = C72284Xah.A03;
            xo2.getClass();
            xo2.A01(c72284Xah.A01, c72284Xah.A00);
            return;
        }
        if (!(this instanceof C72280Xad)) {
            return;
        }
        YRN[] yrnArr = ((C72280Xad) this).A00;
        int i = 0;
        do {
            YRN yrn2 = yrnArr[i];
            C14360o3.A0A(yrn2);
            yrn2.E5r();
            i++;
        } while (i < 3);
    }

    @Override // X.YRN
    public final void EoH(W92 w92) {
        YRN yrn;
        if (this instanceof AbstractC72289Xam) {
            AbstractC72289Xam abstractC72289Xam = (AbstractC72289Xam) this;
            YQQ yqq = ((AbstractC73478YFb) abstractC72289Xam.A09).A05;
            yqq.getClass();
            yqq.En3(w92);
            abstractC72289Xam.A02();
            return;
        }
        if (this instanceof C72280Xad) {
            C14360o3.A0B(w92, 0);
            YRN[] yrnArr = ((C72280Xad) this).A00;
            int i = 0;
            do {
                YRN yrn2 = yrnArr[i];
                C14360o3.A0A(yrn2);
                yrn2.EoH(w92);
                i++;
            } while (i < 3);
            return;
        }
        if (!(this instanceof C72279Xac) || (yrn = ((C72279Xac) this).A00) == null) {
            return;
        }
        yrn.EoH(w92);
    }
}
