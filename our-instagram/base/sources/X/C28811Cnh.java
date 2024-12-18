package X;

/* renamed from: X.Cnh, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C28811Cnh implements C5E5 {
    public final int A00;

    public C28811Cnh(int i) {
        this.A00 = i;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0002. Please report as an issue. */
    @Override // X.C5E5
    public final /* synthetic */ Object DZz(InterfaceC23621Ds interfaceC23621Ds, long j, long j2) {
        long A01;
        switch (this.A00) {
            case 0:
                A01 = 0;
                return new C25242BFb(A01);
            case 1:
                A01 = C25242BFb.A01(0.0f, 0.0f, 1, j2);
                return new C25242BFb(A01);
            default:
                return null;
        }
    }

    @Override // X.C5E5
    public final /* synthetic */ long Da2(long j, long j2, int i) {
        if (1 - this.A00 != 0) {
            return 0L;
        }
        return C119365at.A03(0.0f, 1, j2);
    }

    @Override // X.C5E5
    public final /* synthetic */ Object Da5(InterfaceC23621Ds interfaceC23621Ds, long j) {
        return new C25242BFb(0L);
    }

    @Override // X.C5E5
    public final /* synthetic */ long DaA(long j, int i) {
        return 0L;
    }
}
