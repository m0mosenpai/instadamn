package X;

import android.app.Activity;

/* loaded from: classes9.dex */
public final class PK2 implements GZY {
    public final /* synthetic */ Activity A00;
    public final /* synthetic */ N51 A01;

    public PK2(Activity activity, N51 n51) {
        this.A01 = n51;
        this.A00 = activity;
    }

    @Override // X.GZY
    public final void onAuthorizeFail() {
        AbstractC167017dG.A0y(this.A00, C3DN.A00);
    }

    @Override // X.GZY
    public final void onAuthorizeSuccess(String str, String str2) {
        AbstractC167017dG.A0y(this.A00, C3DN.A00);
    }
}
