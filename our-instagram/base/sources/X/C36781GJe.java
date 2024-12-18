package X;

/* renamed from: X.GJe, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C36781GJe implements GZY {
    public final /* synthetic */ C3CZ A00;

    @Override // X.GZY
    public final void onAuthorizeFail() {
    }

    public C36781GJe(C3CZ c3cz) {
        this.A00 = c3cz;
    }

    @Override // X.GZY
    public final void onAuthorizeSuccess(String str, String str2) {
        C3CZ.A0H.post(new GKY(this.A00));
    }
}
