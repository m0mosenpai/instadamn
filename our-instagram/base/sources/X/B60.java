package X;

/* loaded from: classes4.dex */
public final class B60 extends C0YY implements InterfaceC16820sZ {
    public final /* synthetic */ long A00;
    public final /* synthetic */ long A01;
    public final /* synthetic */ C1S8 A02;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public B60(C1S8 c1s8, long j, long j2) {
        super(0);
        this.A02 = c1s8;
        this.A00 = j;
        this.A01 = j2;
    }

    @Override // X.InterfaceC16820sZ
    public final /* bridge */ /* synthetic */ Object invoke() {
        super/*X.1S9*/.onHeaderBytesReceived(this.A00, this.A01);
        return C0eB.A00;
    }
}
