package X;

/* renamed from: X.DsZ, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C31489DsZ extends C3CI {
    public final AbstractC31433Drd A00;
    public final C31440Drk A01;
    public final java.util.Set A02 = AbstractC166987dD.A1H();

    @Override // X.C36Z
    public final void FDm(C3AB c3ab, int i) {
        Object A01 = this.A01.A01(i);
        if (A01 instanceof C47O) {
            C47O c47o = (C47O) A01;
            if (this.A02.add(c47o.getId())) {
                this.A00.A0F(c47o, 0L);
            }
        }
    }

    public C31489DsZ(AbstractC31433Drd abstractC31433Drd, C31440Drk c31440Drk) {
        this.A01 = c31440Drk;
        this.A00 = abstractC31433Drd;
    }

    @Override // X.C36Z
    public final Class CAO() {
        return C47O.class;
    }
}
