package X;

import java.util.concurrent.TimeUnit;

/* loaded from: classes12.dex */
public final class XO0 extends C6D6 {
    public final long A00;
    public final AbstractC150996r0 A01;
    public final TimeUnit A02;

    public XO0(InterfaceC42061ww interfaceC42061ww, AbstractC150996r0 abstractC150996r0, TimeUnit timeUnit) {
        super(interfaceC42061ww);
        this.A00 = 5L;
        this.A02 = timeUnit;
        this.A01 = abstractC150996r0;
    }

    @Override // X.AbstractC42051wv
    public final void A02(InterfaceC42071wx interfaceC42071wx) {
        XML xml = new XML(interfaceC42071wx);
        AbstractC151006r1 A00 = this.A01.A00();
        super.A00.EpF(new C72061XMe(xml, A00, this.A02, this.A00));
    }
}
