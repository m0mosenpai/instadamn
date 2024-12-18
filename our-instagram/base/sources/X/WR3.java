package X;

/* loaded from: classes11.dex */
public final class WR3 implements InterfaceC52932ba {
    public final Integer A00;
    public final boolean A01;

    @Override // X.InterfaceC52932ba
    public final /* synthetic */ AbstractC52922bZ create(InterfaceC16510rw interfaceC16510rw, AbstractC52972be abstractC52972be) {
        return AbstractC53002bh.A00(this, abstractC52972be, interfaceC16510rw);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC52932ba
    public final AbstractC52922bZ create(Class cls) {
        R8R r8r;
        C14360o3.A0B(cls, 0);
        if (cls.equals(UFR.class)) {
            Integer num = this.A00;
            if (num != null) {
                boolean z = this.A01;
                int intValue = num.intValue();
                if (intValue != 0) {
                    if (intValue == 1) {
                        r8r = new Object();
                    }
                } else {
                    r8r = new R8R(z);
                }
                return new UFR(r8r);
            }
            r8r = null;
            return new UFR(r8r);
        }
        throw AbstractC37303Gc4.A0M(cls, "Unknown ViewModel class: ", new StringBuilder());
    }

    @Override // X.InterfaceC52932ba
    public final /* synthetic */ AbstractC52922bZ create(Class cls, AbstractC52972be abstractC52972be) {
        return AbstractC53002bh.A01(this, cls);
    }

    public WR3(Integer num, boolean z) {
        this.A00 = num;
        this.A01 = z;
    }

    public WR3() {
        this(null, false);
    }
}
