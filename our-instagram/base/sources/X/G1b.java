package X;

import android.content.Context;

/* loaded from: classes6.dex */
public final class G1b implements GXO {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ C32341EMn A01;
    public final /* synthetic */ C2EC A02;
    public final /* synthetic */ String A03;

    @Override // X.GXO
    public final void FAn(FKM fkm) {
        int i = fkm.A00;
        int i2 = fkm.A01;
        C32341EMn c32341EMn = this.A01;
        c32341EMn.A00 = true;
        if (i != -1 && fkm.A02) {
            AbstractC31278Dp0.A0F(AbstractC166987dD.A0r(c32341EMn.A07), Integer.valueOf(i2), this.A03, 5, i);
        } else {
            AbstractC31278Dp0.A08(AbstractC166987dD.A0r(c32341EMn.A07), this.A02.Aic(), this.A03, 5, false, false);
        }
        AbstractC31176DnK.A12(this.A00, C3DN.A00);
    }

    public G1b(Context context, C32341EMn c32341EMn, C2EC c2ec, String str) {
        this.A01 = c32341EMn;
        this.A03 = str;
        this.A02 = c2ec;
        this.A00 = context;
    }
}
