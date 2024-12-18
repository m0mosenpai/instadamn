package X;

/* renamed from: X.Oxk, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public abstract class AbstractC56237Oxk implements InterfaceC50490MQs {
    public final int A00;
    public final int A01;
    public final InterfaceC58189Pqv A02;
    public final String A03;

    public AbstractC56237Oxk(InterfaceC58189Pqv interfaceC58189Pqv, String str, int i, int i2) {
        C14360o3.A0B(str, 2);
        this.A01 = i;
        this.A03 = str;
        this.A00 = i2;
        this.A02 = interfaceC58189Pqv;
    }

    @Override // X.InterfaceC50490MQs
    public final InterfaceC58189Pqv Arg() {
        return this.A02;
    }

    @Override // X.InterfaceC50490MQs
    public final int BF3() {
        return this.A01;
    }

    @Override // X.InterfaceC50490MQs
    public final String getName() {
        return this.A03;
    }
}
