package X;

import android.view.View;

/* renamed from: X.GJh, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C36784GJh implements GZY {
    public final /* synthetic */ View A00;
    public final /* synthetic */ GBV A01;

    public C36784GJh(View view, GBV gbv) {
        this.A01 = gbv;
        this.A00 = view;
    }

    @Override // X.GZY
    public final void onAuthorizeFail() {
        C9GR.A0B(this.A01.A04.getContext(), "authorize_failed");
    }

    @Override // X.GZY
    public final void onAuthorizeSuccess(String str, String str2) {
        GBV gbv = this.A01;
        FLA fla = new FLA(gbv.A04, gbv.A02);
        fla.A00 = new DSA(43, this.A00, gbv);
        AbstractC35216Fg9.A02(fla.A02, fla, 19);
    }
}
