package X;

import java.util.concurrent.TimeUnit;

/* renamed from: X.XNj, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C72089XNj extends C6D6 {
    public final long A00;
    public final AbstractC150996r0 A01;
    public final TimeUnit A02;

    @Override // X.AbstractC42051wv
    public final void A02(InterfaceC42071wx interfaceC42071wx) {
        InterfaceC42061ww interfaceC42061ww = super.A00;
        long j = this.A00;
        interfaceC42061ww.EpF(new XMK(interfaceC42071wx, this.A01.A00(), this.A02, j));
    }

    public C72089XNj(AbstractC42051wv abstractC42051wv, AbstractC150996r0 abstractC150996r0, TimeUnit timeUnit, long j) {
        super(abstractC42051wv);
        this.A00 = j;
        this.A02 = timeUnit;
        this.A01 = abstractC150996r0;
    }
}
