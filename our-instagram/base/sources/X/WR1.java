package X;

import com.facebookpay.logging.LoggingContext;

/* loaded from: classes11.dex */
public final class WR1 implements InterfaceC52932ba {
    public final UFP A00;
    public final LoggingContext A01;
    public final UFS A02;

    @Override // X.InterfaceC52932ba
    public final /* synthetic */ AbstractC52922bZ create(InterfaceC16510rw interfaceC16510rw, AbstractC52972be abstractC52972be) {
        return AbstractC53002bh.A00(this, abstractC52972be, interfaceC16510rw);
    }

    @Override // X.InterfaceC52932ba
    public final AbstractC52922bZ create(Class cls) {
        C14360o3.A0B(cls, 0);
        if (cls.equals(UFU.class)) {
            return new UFU(this.A00, this.A01, this.A02);
        }
        throw new IllegalArgumentException("Input class not implemented");
    }

    @Override // X.InterfaceC52932ba
    public final /* synthetic */ AbstractC52922bZ create(Class cls, AbstractC52972be abstractC52972be) {
        return AbstractC53002bh.A01(this, cls);
    }

    public WR1(UFP ufp, LoggingContext loggingContext, UFS ufs) {
        AbstractC167017dG.A1R(ufs, ufp);
        this.A01 = loggingContext;
        this.A02 = ufs;
        this.A00 = ufp;
    }
}
