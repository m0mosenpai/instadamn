package X;

import android.content.Context;

/* renamed from: X.Ovp, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C56129Ovp implements InterfaceC13000lm {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ String A01;

    public C56129Ovp(Context context, String str) {
        this.A00 = context;
        this.A01 = str;
    }

    @Override // X.InterfaceC13000lm
    public final void onSessionWillEnd() {
        Context A0O = AbstractC166987dD.A0O(this.A00);
        String str = this.A01;
        AbstractC14490oL.A08(A0O, str, AbstractC25229BEm.A1Y(str));
    }
}
