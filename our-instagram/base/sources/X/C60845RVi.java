package X;

/* renamed from: X.RVi, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C60845RVi extends TSX {
    public final /* synthetic */ TZY A00;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C60845RVi(TZY tzy) {
        super(tzy.A00);
        this.A00 = tzy;
    }

    @Override // java.util.Iterator
    public final Object next() {
        C5MV c5mv = this.A02;
        C5MT c5mt = this.A03;
        if (c5mv != c5mt.A05) {
            if (c5mt.A00 == super.A00) {
                this.A02 = c5mv.A02;
                this.A01 = c5mv;
                return c5mv.A07;
            }
            throw AbstractC58318PtA.A0z();
        }
        throw AbstractC58318PtA.A13();
    }
}
