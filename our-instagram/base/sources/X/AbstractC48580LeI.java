package X;

/* renamed from: X.LeI, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public abstract class AbstractC48580LeI implements InterfaceC50490MQs {
    public C54629OBe A00;

    @Override // X.InterfaceC50490MQs
    public final int BF3() {
        return this.A00.A00;
    }

    @Override // X.InterfaceC50490MQs
    public final String getName() {
        C54629OBe c54629OBe = this.A00;
        if (c54629OBe.A00 != 114) {
            String str = c54629OBe.A01.A04;
            if (!AbstractC116315Ok.A00(str)) {
                return str;
            }
        }
        return c54629OBe.A01.A03;
    }
}
