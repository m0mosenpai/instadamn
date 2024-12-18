package X;

import android.view.View;

/* loaded from: classes10.dex */
public final class TGE implements InterfaceC58152PqH {
    public final /* synthetic */ C58883QEt A00;
    public final /* synthetic */ C61602RqR A01;

    @Override // X.InterfaceC58152PqH
    public final void onDismiss() {
    }

    @Override // X.InterfaceC58152PqH
    public final /* synthetic */ void onTextClick(View view) {
    }

    public TGE(C58883QEt c58883QEt, C61602RqR c61602RqR) {
        this.A00 = c58883QEt;
        this.A01 = c61602RqR;
    }

    @Override // X.InterfaceC58152PqH
    public final void onButtonClick(View view) {
        this.A00.A05();
    }

    @Override // X.InterfaceC58152PqH
    public final void onShow() {
        C61602RqR c61602RqR = this.A01;
        if (c61602RqR != null) {
            c61602RqR.A0I = "AUTOMATIC_AUTOFILL_TOAST_SHOWN";
            SZO A00 = c61602RqR.A00();
            C58883QEt c58883QEt = this.A00;
            AbstractC63402SjX.A0A(c58883QEt.A03(), c58883QEt.A0Y, A00);
        }
    }
}
