package X;

import android.content.Context;

/* renamed from: X.Wkp, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C70943Wkp implements GZB {
    public final /* synthetic */ C40R A00;
    public final /* synthetic */ C43631zr A01;

    public C70943Wkp(C40R c40r, C43631zr c43631zr) {
        this.A01 = c43631zr;
        this.A00 = c40r;
    }

    @Override // X.GZB
    public final void D3J(Context context) {
        C43631zr c43631zr = this.A01;
        C40R c40r = this.A00;
        C43631zr.A04(c43631zr, c40r.A05, c40r.A08, "In App Notification open button clicked", null, c40r.A07);
        C43631zr.A03(c40r, c43631zr);
    }

    @Override // X.GZB
    public final void onDismiss() {
        C43631zr c43631zr = this.A01;
        C40R c40r = this.A00;
        C43631zr.A04(c43631zr, c40r.A05, c40r.A08, "Dismiss In App Notification", null, c40r.A07);
    }
}
