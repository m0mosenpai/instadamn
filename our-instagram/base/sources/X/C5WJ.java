package X;

/* renamed from: X.5WJ, reason: invalid class name */
/* loaded from: classes3.dex */
public abstract class C5WJ implements C5AH {
    public final C5WH A00;
    public final C5WH A01;
    public final C5WH A02;
    public final C5WH A03;

    @Override // X.C5AH
    public final AbstractC119385av AMh(InterfaceC1128957x interfaceC1128957x, AnonymousClass583 anonymousClass583, long j) {
        float EqU = this.A03.EqU(interfaceC1128957x, j);
        float EqU2 = this.A02.EqU(interfaceC1128957x, j);
        float EqU3 = this.A00.EqU(interfaceC1128957x, j);
        float EqU4 = this.A01.EqU(interfaceC1128957x, j);
        float A01 = C5YC.A01(j);
        float f = EqU + EqU4;
        if (f > A01) {
            float f2 = A01 / f;
            EqU *= f2;
            EqU4 *= f2;
        }
        float f3 = EqU2 + EqU3;
        if (f3 > A01) {
            float f4 = A01 / f3;
            EqU2 *= f4;
            EqU3 *= f4;
        }
        if (EqU >= 0.0f && EqU2 >= 0.0f && EqU3 >= 0.0f && EqU4 >= 0.0f) {
            if (EqU + EqU2 + EqU3 + EqU4 == 0.0f) {
                return new C119375au(AbstractC119355as.A01(0L, j));
            }
            C114205Dh A012 = AbstractC119355as.A01(0L, j);
            AnonymousClass583 anonymousClass5832 = AnonymousClass583.Ltr;
            float f5 = EqU2;
            if (anonymousClass583 == anonymousClass5832) {
                f5 = EqU;
            }
            long A00 = AbstractC137636Lj.A00(f5, f5);
            if (anonymousClass583 == anonymousClass5832) {
                EqU = EqU2;
            }
            long A002 = AbstractC137636Lj.A00(EqU, EqU);
            float f6 = EqU4;
            if (anonymousClass583 == anonymousClass5832) {
                f6 = EqU3;
            }
            long A003 = AbstractC137636Lj.A00(f6, f6);
            if (anonymousClass583 == anonymousClass5832) {
                EqU3 = EqU4;
            }
            return new C6Ln(new C137656Ll(A012.A01, A012.A03, A012.A02, A012.A00, A00, A002, A003, AbstractC137636Lj.A00(EqU3, EqU3)));
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Corner size in Px can't be negative(topStart = ");
        sb.append(EqU);
        sb.append(", topEnd = ");
        sb.append(EqU2);
        sb.append(", bottomEnd = ");
        sb.append(EqU3);
        sb.append(", bottomStart = ");
        sb.append(EqU4);
        sb.append(")!");
        throw new IllegalArgumentException(sb.toString());
    }

    public C5WJ(C5WH c5wh, C5WH c5wh2, C5WH c5wh3, C5WH c5wh4) {
        this.A03 = c5wh;
        this.A02 = c5wh2;
        this.A00 = c5wh3;
        this.A01 = c5wh4;
    }
}
