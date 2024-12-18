package X;

/* loaded from: classes9.dex */
public final class OVh {
    public long A00;
    public long A01;
    public final InterfaceC16820sZ A02;

    public final long A00() {
        long j = this.A00;
        if (this.A01 >= 0) {
            j += MSZ.A0E(this.A02) - this.A01;
        }
        this.A00 = j;
        this.A01 = -1L;
        return j;
    }

    public OVh(InterfaceC16820sZ interfaceC16820sZ) {
        this.A02 = interfaceC16820sZ;
        this.A01 = -1L;
    }

    public OVh() {
        this(C57410Pe8.A00);
    }
}
