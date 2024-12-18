package X;

/* renamed from: X.RVh, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C60844RVh extends TSX {
    public final /* synthetic */ TZX A00;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C60844RVh(TZX tzx) {
        super(tzx.A00);
        this.A00 = tzx;
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        C5MV c5mv = this.A02;
        C5MT c5mt = this.A03;
        if (c5mv != c5mt.A05) {
            if (c5mt.A00 == super.A00) {
                this.A02 = c5mv.A02;
                this.A01 = c5mv;
                return c5mv;
            }
            throw AbstractC58318PtA.A0z();
        }
        throw AbstractC58318PtA.A13();
    }
}
