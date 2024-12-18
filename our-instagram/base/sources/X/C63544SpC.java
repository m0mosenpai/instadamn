package X;

/* renamed from: X.SpC, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C63544SpC implements C1N8 {
    public final /* synthetic */ int A00;
    public final /* synthetic */ T2O A01;

    public C63544SpC(T2O t2o, int i) {
        this.A01 = t2o;
        this.A00 = i;
    }

    @Override // X.C1N8
    public final /* bridge */ /* synthetic */ Object apply(Object obj) {
        R1X A0E;
        R1S A0E2;
        QWN A0E3;
        QWW A0L;
        R1O A0E4;
        QRZ A0E5;
        R0L r0l = (R0L) obj;
        int i = this.A00;
        if (r0l == null || (A0E = r0l.A0E()) == null) {
            return null;
        }
        if (i != 0) {
            R0I A0F = A0E.A0F();
            if (A0F == null || (A0E4 = A0F.A0E()) == null || (A0E5 = A0E4.A0E()) == null) {
                return null;
            }
            A0L = AbstractC58322PtE.A0L(A0E5);
        } else {
            R0K A0H = A0E.A0H();
            if (A0H == null || (A0E2 = A0H.A0E()) == null || (A0E3 = A0E2.A0E()) == null) {
                return null;
            }
            A0L = AbstractC58322PtE.A0L(A0E3);
        }
        if (A0L == null) {
            return null;
        }
        return AbstractC63238Sfs.A03(A0L);
    }
}
