package X;

/* loaded from: classes8.dex */
public final class M6W implements Runnable {
    public final /* synthetic */ EnumC46298KeU A00;
    public final /* synthetic */ C45999KXn A01;
    public final /* synthetic */ boolean A02;
    public final /* synthetic */ boolean A03;

    public M6W(EnumC46298KeU enumC46298KeU, C45999KXn c45999KXn, boolean z, boolean z2) {
        this.A01 = c45999KXn;
        this.A02 = z;
        this.A00 = enumC46298KeU;
        this.A03 = z2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C45999KXn c45999KXn = this.A01;
        boolean z = this.A02;
        c45999KXn.A0M(new C49450LtO(this.A00, new C50168MDv(33, c45999KXn, z), new C57561PgZ(c45999KXn, 0), z, this.A03));
    }
}
