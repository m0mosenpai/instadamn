package X;

/* renamed from: X.GkB, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C37796GkB implements C1PK {
    public final int A00;

    public C37796GkB(int i) {
        this.A00 = i;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0002. Please report as an issue. */
    @Override // X.C1PK
    public final /* bridge */ /* synthetic */ InterfaceC38221qC ATz(Object obj) {
        C38321qM A0D;
        switch (this.A00) {
            case 0:
                A0D = AbstractC37301Gc2.A0J(obj).A0K;
                return A0D.A26();
            case 1:
                A0D = AbstractC37303Gc4.A0D(obj);
                if (A0D == null) {
                    return null;
                }
                return A0D.A26();
            default:
                A0D = AbstractC25226BEj.A0y(AbstractC37302Gc3.A0G(obj));
                return A0D.A26();
        }
    }
}
