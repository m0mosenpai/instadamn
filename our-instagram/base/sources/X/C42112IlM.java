package X;

/* renamed from: X.IlM, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C42112IlM implements InterfaceC28041Xi {
    public final /* synthetic */ C1XV A00;

    public C42112IlM(C1XV c1xv) {
        this.A00 = c1xv;
    }

    @Override // X.InterfaceC28041Xi
    public final /* bridge */ /* synthetic */ boolean apply(Object obj) {
        C3XG c3xg = (C3XG) obj;
        if (c3xg != null) {
            C1XV c1xv = this.A00;
            C14360o3.A0B(c1xv, 1);
            if (c3xg.A06 != c1xv) {
                return false;
            }
            return true;
        }
        return false;
    }
}
