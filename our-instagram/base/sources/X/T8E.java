package X;

/* loaded from: classes10.dex */
public final class T8E implements C2JL {
    public final int A00;

    public T8E(int i) {
        this.A00 = i;
    }

    @Override // X.C2JL
    public final void onFailure(Throwable th) {
        if (this.A00 != 0) {
            C14360o3.A0B(th, 0);
            C0K8.A0F(MSV.A00(771), "Background worker schedule failed", th);
        }
    }

    @Override // X.C2JL
    public final void onSuccess(Object obj) {
    }
}
