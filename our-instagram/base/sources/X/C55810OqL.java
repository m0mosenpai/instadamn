package X;

/* renamed from: X.OqL, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C55810OqL implements C2JL {
    public final /* synthetic */ C1P1 A00;
    public final /* synthetic */ C2045093j A01;

    @Override // X.C2JL
    public final void onFailure(Throwable th) {
    }

    public C55810OqL(C1P1 c1p1, C2045093j c2045093j) {
        this.A01 = c2045093j;
        this.A00 = c1p1;
    }

    @Override // X.C2JL
    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        AnonymousClass435 anonymousClass435 = (AnonymousClass435) obj;
        if (anonymousClass435 != null) {
            C11T.A02(new PR9(this.A00, AbstractC37979GnM.A00(anonymousClass435, this.A01.A00)));
        }
    }
}
