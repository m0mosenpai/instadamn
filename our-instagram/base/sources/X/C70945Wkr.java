package X;

import android.view.View;

/* renamed from: X.Wkr, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C70945Wkr implements InterfaceC58152PqH {
    public final /* synthetic */ C40R A00;
    public final /* synthetic */ C43631zr A01;

    @Override // X.InterfaceC58152PqH
    public final void onDismiss() {
    }

    @Override // X.InterfaceC58152PqH
    public final void onShow() {
    }

    @Override // X.InterfaceC58152PqH
    public final /* synthetic */ void onTextClick(View view) {
    }

    public C70945Wkr(C40R c40r, C43631zr c43631zr) {
        this.A01 = c43631zr;
        this.A00 = c40r;
    }

    @Override // X.InterfaceC58152PqH
    public final void onButtonClick(View view) {
        C43631zr c43631zr = this.A01;
        C40R c40r = this.A00;
        C43631zr.A04(c43631zr, c40r.A05, c40r.A08, "Snack Bar open button clicked", null, c40r.A07);
        C43631zr.A03(c40r, c43631zr);
    }
}
