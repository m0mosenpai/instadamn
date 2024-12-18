package X;

import com.facebookpay.logging.LoggingContext;

/* loaded from: classes11.dex */
public final class WR2 implements InterfaceC52932ba {
    public final C66393UFe A00;
    public final UFC A01;
    public final C66390UFb A02;
    public final UFP A03;
    public final LoggingContext A04;
    public final UFS A05;
    public final C66392UFd A06;
    public final Q8g A07;
    public final C66389UFa A08;
    public final C66391UFc A09;
    public final UFG A0A;

    @Override // X.InterfaceC52932ba
    public final /* synthetic */ AbstractC52922bZ create(InterfaceC16510rw interfaceC16510rw, AbstractC52972be abstractC52972be) {
        return AbstractC53002bh.A00(this, abstractC52972be, interfaceC16510rw);
    }

    @Override // X.InterfaceC52932ba
    public final AbstractC52922bZ create(Class cls) {
        C14360o3.A0B(cls, 0);
        if (cls.equals(UFX.class)) {
            LoggingContext loggingContext = this.A04;
            Q8g q8g = this.A07;
            C66391UFc c66391UFc = this.A09;
            C66390UFb c66390UFb = this.A02;
            C66393UFe c66393UFe = this.A00;
            C66389UFa c66389UFa = this.A08;
            UFG ufg = this.A0A;
            C66392UFd c66392UFd = this.A06;
            return new UFX(c66393UFe, this.A01, c66390UFb, this.A03, loggingContext, this.A05, c66392UFd, q8g, c66389UFa, c66391UFc, ufg);
        }
        throw new IllegalArgumentException("Input class not implemented");
    }

    @Override // X.InterfaceC52932ba
    public final /* synthetic */ AbstractC52922bZ create(Class cls, AbstractC52972be abstractC52972be) {
        return AbstractC53002bh.A01(this, cls);
    }

    public WR2(C66393UFe c66393UFe, UFC ufc, C66390UFb c66390UFb, UFP ufp, LoggingContext loggingContext, UFS ufs, C66392UFd c66392UFd, Q8g q8g, C66389UFa c66389UFa, C66391UFc c66391UFc, UFG ufg) {
        this.A04 = loggingContext;
        this.A07 = q8g;
        this.A09 = c66391UFc;
        this.A02 = c66390UFb;
        this.A00 = c66393UFe;
        this.A08 = c66389UFa;
        this.A0A = ufg;
        this.A06 = c66392UFd;
        this.A03 = ufp;
        this.A05 = ufs;
        this.A01 = ufc;
    }
}
