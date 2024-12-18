package X;

/* renamed from: X.AVg, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C23321AVg implements BCR {
    public final /* synthetic */ AKN A00;

    public C23321AVg(AKN akn) {
        this.A00 = akn;
    }

    @Override // X.BCR
    public final void CuB(String str, Throwable th) {
        BD9 bd9 = this.A00.A03;
        if (bd9 != null) {
            bd9.onFailure(th);
        }
    }

    @Override // X.BCR
    public final void CuC(String str) {
        BD9 bd9 = this.A00.A03;
        if (bd9 != null) {
            bd9.DqC(str);
        }
    }
}
