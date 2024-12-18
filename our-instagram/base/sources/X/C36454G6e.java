package X;

/* renamed from: X.G6e, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C36454G6e implements MR6 {
    public final /* synthetic */ C36881nl A00;
    public final /* synthetic */ String A01;

    @Override // X.MR6
    public final void onFailure() {
    }

    @Override // X.MR6
    public final /* synthetic */ void onFailureInBackground(InterfaceC40821up interfaceC40821up) {
    }

    @Override // X.MR6
    public final /* synthetic */ void onStart() {
    }

    @Override // X.MR6
    public final /* synthetic */ void onSuccessInBackground(C2EC c2ec) {
    }

    public C36454G6e(C36881nl c36881nl, String str) {
        this.A00 = c36881nl;
        this.A01 = str;
    }

    @Override // X.MR6
    public final void onSuccess(C2EC c2ec) {
        C36881nl.A03(this.A00, AbstractC31171DnF.A0N(this.A01), 0);
    }
}
