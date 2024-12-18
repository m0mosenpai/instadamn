package X;

/* renamed from: X.Wcx, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C70563Wcx implements C2JL {
    public final /* synthetic */ C5M0 A00;
    public final /* synthetic */ WY2 A01;
    public final /* synthetic */ C5M2 A02;
    public final /* synthetic */ AbstractC115825Lw A03;

    public C70563Wcx(C5M0 c5m0, WY2 wy2, C5M2 c5m2, AbstractC115825Lw abstractC115825Lw) {
        this.A03 = abstractC115825Lw;
        this.A01 = wy2;
        this.A02 = c5m2;
        this.A00 = c5m0;
    }

    @Override // X.C2JL
    public final void onFailure(Throwable th) {
        this.A00.DK2();
    }

    @Override // X.C2JL
    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        if (obj == null) {
            new C53401Njq(MSV.A00(76), null);
            this.A00.DK2();
        } else {
            this.A03.A0N.put(this.A01.A00, obj);
            this.A02.D8v();
        }
    }
}
