package X;

import com.instagram.user.model.User;

/* loaded from: classes9.dex */
public final class NAG extends NA7 {
    public final /* synthetic */ C52684NSp A00;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NAG(C1P1 c1p1, C52684NSp c52684NSp) {
        super(c1p1);
        this.A00 = c52684NSp;
    }

    @Override // X.NA7, X.C1P1
    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        int A03 = C0f9.A03(-1451674753);
        C3DB c3db = (C3DB) obj;
        int A0N = AbstractC167017dG.A0N(c3db, 1090343157);
        super.onSuccess(c3db);
        User A00 = C72W.A00(c3db);
        if (A00 != null) {
            ((AnonymousClass706) this.A00).A00.EPB(A00.A0I(), A00.getId());
        } else {
            onFail(new C115115Ig(c3db));
        }
        C0f9.A0A(1582773220, A0N);
        C0f9.A0A(687261678, A03);
    }
}
