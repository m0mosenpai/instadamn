package X;

/* renamed from: X.CrM, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C29033CrM implements C2YT {
    public final AbstractC25398BLp A00;

    public C29033CrM(AbstractC25398BLp abstractC25398BLp) {
        C14360o3.A0B(abstractC25398BLp, 1);
        this.A00 = abstractC25398BLp;
    }

    @Override // X.C2YT
    public final C2YU Cgz(C2YR c2yr, long j) {
        C14360o3.A0B(c2yr, 0);
        BVR bvr = (BVR) AbstractC25228BEl.A0Q(c2yr, C25432BMx.A01);
        AbstractC25398BLp abstractC25398BLp = this.A00;
        bvr.setIndicatorCount(abstractC25398BLp.A03());
        bvr.A06 = C14360o3.A0K(abstractC25398BLp.A06(), "progress_dots");
        return AbstractC25234BEr.A0Q(bvr, j);
    }

    @Override // X.C2VB
    public final /* bridge */ /* synthetic */ boolean CTz(Object obj) {
        return AbstractC25235BEs.A1b(obj, this);
    }
}
