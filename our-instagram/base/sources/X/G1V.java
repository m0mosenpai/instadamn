package X;

import android.content.Context;

/* loaded from: classes6.dex */
public final class G1V implements InterfaceC37220GaV {
    public boolean A00;
    public final Context A01;
    public final C2EE A02;
    public final String A03;
    public final C148676mc A04;
    public final String A05;

    /* JADX WARN: Code restructure failed: missing block: B:11:0x003b, code lost:
    
        if (r0 == null) goto L13;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public G1V(android.content.Context r4, X.C148676mc r5, X.C2EE r6) {
        /*
            r3 = this;
            r0 = 3
            X.C14360o3.A0B(r5, r0)
            r3.<init>()
            r3.A01 = r4
            r3.A02 = r6
            r3.A04 = r5
            r0 = 2131976274(0x7f136052, float:1.9589664E38)
            java.lang.String r0 = X.AbstractC166997dE.A0p(r4, r0)
            r3.A05 = r0
            X.2EE r0 = r3.A02
            if (r0 == 0) goto L3d
            java.util.List r0 = r0.BSH()
            if (r0 == 0) goto L3d
            java.lang.Object r0 = X.AbstractC001800i.A0N(r0)
            com.instagram.user.model.User r0 = (com.instagram.user.model.User) r0
            if (r0 == 0) goto L3d
            java.lang.String r2 = r0.getShortName()
            if (r2 != 0) goto L32
            java.lang.String r2 = r0.B8y()
        L32:
            android.content.Context r1 = r3.A01
            r0 = 2131975486(0x7f135d3e, float:1.9588066E38)
            java.lang.String r0 = X.AbstractC167007dF.A0f(r1, r2, r0)
            if (r0 != 0) goto L46
        L3d:
            android.content.Context r1 = r3.A01
            r0 = 2131975487(0x7f135d3f, float:1.9588068E38)
            java.lang.String r0 = X.AbstractC166997dE.A0p(r1, r0)
        L46:
            r3.A03 = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.G1V.<init>(android.content.Context, X.6mc, X.2EE):void");
    }

    @Override // X.InterfaceC37220GaV
    public final /* bridge */ /* synthetic */ CharSequence Ay2() {
        return null;
    }

    @Override // X.InterfaceC37220GaV
    public final String BrR() {
        return null;
    }

    @Override // X.InterfaceC37220GaV
    public final void Djb() {
    }

    @Override // X.InterfaceC37220GaV
    public final void D8n() {
        C34979Fb6 c34979Fb6 = C34979Fb6.A00;
        Context context = this.A01;
        C148676mc c148676mc = this.A04;
        c34979Fb6.A00(context, c148676mc, c148676mc.A03);
    }

    @Override // X.InterfaceC37220GaV
    public final void DAx() {
        if (!this.A00) {
            this.A00 = true;
        }
    }

    @Override // X.InterfaceC37220GaV
    public final String Ata() {
        return this.A05;
    }

    @Override // X.InterfaceC37220GaV
    public final /* bridge */ /* synthetic */ CharSequence B7n() {
        return this.A03;
    }
}
