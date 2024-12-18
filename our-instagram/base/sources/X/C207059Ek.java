package X;

/* renamed from: X.9Ek, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C207059Ek extends C0YY implements InterfaceC16820sZ {
    public final int A00;
    public final long A01;
    public final long A02;
    public final Object A03;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C207059Ek(C1S8 c1s8, int i, long j, long j2) {
        super(0);
        this.A00 = i;
        this.A03 = c1s8;
        if (i != 0) {
            this.A01 = j;
            this.A02 = j2;
        } else {
            this.A02 = j;
            this.A01 = j2;
        }
    }

    @Override // X.InterfaceC16820sZ
    public final /* bridge */ /* synthetic */ Object invoke() {
        int i = this.A00;
        C1S8 c1s8 = (C1S8) this.A03;
        if (i != 0) {
            super/*X.1S9*/.onUploadProgress(this.A01, this.A02);
        } else {
            super/*X.1S9*/.onLastByteAcked(this.A02, this.A01);
        }
        return C0eB.A00;
    }
}
