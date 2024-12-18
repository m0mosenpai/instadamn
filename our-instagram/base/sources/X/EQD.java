package X;

import android.content.Context;
import java.util.ArrayList;

/* loaded from: classes6.dex */
public final class EQD extends C2US implements InterfaceC65242xM {
    public final C32464ERq A00;
    public final ArrayList A01;
    public final Context A02;
    public final C31545DtV A03;
    public final InterfaceC62602sz A04;
    public final C65842yM A05;
    public final InterfaceC37204GaF A06;
    public final String A07;
    public final boolean A08;
    public final boolean A09;

    public EQD(Context context, InterfaceC11380iw interfaceC11380iw, InterfaceC62602sz interfaceC62602sz, InterfaceC37204GaF interfaceC37204GaF, String str, boolean z, boolean z2, boolean z3) {
        super(false);
        this.A02 = context;
        this.A07 = str;
        this.A09 = z;
        this.A08 = z2;
        this.A06 = interfaceC37204GaF;
        this.A04 = interfaceC62602sz;
        this.A01 = AbstractC166987dD.A1E();
        C31545DtV c31545DtV = new C31545DtV(context);
        this.A03 = c31545DtV;
        C32464ERq c32464ERq = new C32464ERq(interfaceC11380iw, interfaceC37204GaF, false, z3);
        this.A00 = c32464ERq;
        C65842yM c65842yM = new C65842yM(context);
        this.A05 = c65842yM;
        init(c31545DtV, c32464ERq, c65842yM);
    }

    @Override // X.InterfaceC65242xM
    public final /* bridge */ /* synthetic */ Object getAdapter() {
        return this;
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x004d, code lost:
    
        if (r9.A08 == false) goto L17;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void A00(X.EQD r9) {
        /*
            r9.clear()
            java.util.ArrayList r1 = r9.A01
            boolean r0 = r1.isEmpty()
            if (r0 == 0) goto L1d
            android.content.Context r1 = r9.A02
            r0 = 2131968556(0x7f13422c, float:1.957401E38)
            java.lang.String r1 = r1.getString(r0)
            X.DtV r0 = r9.A03
        L16:
            r9.addModel(r1, r0)
        L19:
            r9.updateListView()
            return
        L1d:
            java.util.Iterator r2 = X.AbstractC166997dE.A13(r1)
        L21:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L70
            java.lang.Object r4 = X.AbstractC166997dE.A0l(r2)
            com.instagram.user.model.User r4 = (com.instagram.user.model.User) r4
            java.lang.String r1 = r9.A07
            java.lang.String r0 = "BATCH_MANAGE_NON_RECIP_FOLLOWERS"
            boolean r0 = X.C14360o3.A0K(r1, r0)
            if (r0 == 0) goto L5d
            java.lang.String r6 = r4.getUsername()
            java.lang.String r1 = r4.B8y()
            r7 = 0
            boolean r0 = r9.A09
            if (r0 == 0) goto L4f
            X.17P r0 = r4.A03
            java.lang.String r7 = r0.Bhe()
            boolean r0 = r9.A08
            r5 = r1
            if (r0 != 0) goto L51
        L4f:
            r5 = r6
            r6 = r1
        L51:
            r8 = 0
        L52:
            X.FNI r3 = new X.FNI
            r3.<init>(r4, r5, r6, r7, r8)
            X.ERq r0 = r9.A00
            r9.addModel(r3, r0)
            goto L21
        L5d:
            X.GaF r0 = r9.A06
            boolean r8 = r0.Caq(r4)
            java.lang.String r5 = r4.getUsername()
            java.lang.String r6 = r4.getFullName()
            java.lang.String r7 = X.AbstractC31171DnF.A0e(r4)
            goto L52
        L70:
            X.2sz r1 = r9.A04
            if (r1 == 0) goto L19
            boolean r0 = r1.CLJ()
            if (r0 == 0) goto L19
            X.2yM r0 = r9.A05
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: X.EQD.A00(X.EQD):void");
    }
}
