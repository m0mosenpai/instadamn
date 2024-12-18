package com.instagram.nux.aymh.viewmodel;

import X.AbstractC09440dt;
import X.AbstractC141776au;
import X.AbstractC166987dD;
import X.AbstractC167007dF;
import X.AbstractC167027dH;
import X.AbstractC31172DnG;
import X.AbstractC52922bZ;
import X.C07270a1;
import X.C14360o3;
import X.C17280tP;
import X.C24721Ip;
import X.C34900FZm;
import X.C34901FZn;
import X.C34988FbK;
import X.C35193Ffl;
import X.C3NY;
import X.C51757Mtg;
import X.C57510Pfk;
import X.C83743oJ;
import X.E6N;
import X.FJP;
import X.GUD;
import X.GUE;
import X.InterfaceC09390do;
import X.InterfaceC23621Ds;
import X.InterfaceC24731Iq;
import X.MCR;

/* loaded from: classes6.dex */
public final class AymhViewModel extends AbstractC52922bZ {
    public E6N A00;
    public final C34900FZm A01;
    public final C34901FZn A02;
    public final C34988FbK A03;
    public final C35193Ffl A04;
    public final AggregateAccountLoginHandler A05;
    public final C17280tP A06;
    public final C83743oJ A07;
    public final InterfaceC09390do A08;
    public final InterfaceC09390do A09;
    public final InterfaceC09390do A0A;
    public final InterfaceC24731Iq A0B;

    public final void A01(C51757Mtg c51757Mtg, C07270a1 c07270a1, E6N e6n, C3NY c3ny) {
        C14360o3.A0B(c07270a1, 1);
        AbstractC31172DnG.A0F(this.A0A).A0B(new FJP(2131974091, true));
        AbstractC166987dD.A1Z(new MCR((InterfaceC23621Ds) null, this, c51757Mtg, c07270a1, c3ny, e6n, 21), AbstractC141776au.A00(this));
    }

    public AymhViewModel() {
        C34900FZm c34900FZm = C34900FZm.A00;
        C34988FbK c34988FbK = C34988FbK.A00;
        C34901FZn c34901FZn = C34901FZn.A00;
        C35193Ffl c35193Ffl = C35193Ffl.A00;
        AggregateAccountLoginHandler aggregateAccountLoginHandler = new AggregateAccountLoginHandler(c34988FbK, c35193Ffl);
        C83743oJ A00 = C83743oJ.A00();
        C17280tP A0y = AbstractC166987dD.A0y();
        AbstractC167027dH.A13(c34900FZm, c34988FbK, c34901FZn);
        AbstractC167007dF.A1H(c35193Ffl, 4, A0y);
        this.A01 = c34900FZm;
        this.A03 = c34988FbK;
        this.A02 = c34901FZn;
        this.A04 = c35193Ffl;
        this.A05 = aggregateAccountLoginHandler;
        this.A07 = A00;
        this.A06 = A0y;
        this.A0B = new C24721Ip(0);
        this.A09 = AbstractC09440dt.A01(new C57510Pfk(this, 4));
        this.A0A = AbstractC09440dt.A01(GUE.A00);
        this.A08 = AbstractC09440dt.A01(GUD.A00);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object A00(X.C07270a1 r7, com.instagram.nux.aymh.viewmodel.AymhViewModel r8, X.C3NY r9, X.InterfaceC23621Ds r10) {
        /*
            r3 = 23
            boolean r0 = X.PX5.A02(r10, r3)
            if (r0 == 0) goto L55
            r5 = r10
            X.PX5 r5 = (X.PX5) r5
            int r2 = r5.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L55
            int r2 = r2 - r1
            r5.A00 = r2
        L16:
            java.lang.Object r1 = r5.A01
            X.1JX r6 = X.C1JX.A02
            int r0 = r5.A00
            r4 = 1
            if (r0 == 0) goto L27
            if (r0 != r4) goto L5d
            X.AbstractC09560e7.A00(r1)
        L24:
            X.0eB r6 = X.C0eB.A00
            return r6
        L27:
            X.AbstractC09560e7.A00(r1)
            boolean r0 = r9 instanceof X.C3NX
            if (r0 != 0) goto L24
            boolean r0 = r9 instanceof X.C194848jk
            if (r0 == 0) goto L62
            X.8jk r9 = (X.C194848jk) r9
            java.lang.Object r3 = r9.A00
            X.Nk3 r3 = (X.C53414Nk3) r3
            java.lang.Throwable r0 = r3.getCause()
            boolean r0 = r0 instanceof X.RGN
            if (r0 == 0) goto L24
            X.1Iq r2 = r8.A0B
            X.GAq r1 = new X.GAq
            r1.<init>(r7, r3, r8)
            X.GAn r0 = new X.GAn
            r0.<init>(r1)
            r5.A00 = r4
            java.lang.Object r0 = r2.EMz(r0, r5)
            if (r0 != r6) goto L24
            return r6
        L55:
            r0 = 42
            X.PX5 r5 = new X.PX5
            r5.<init>(r8, r10, r3, r0)
            goto L16
        L5d:
            java.lang.IllegalStateException r0 = X.AbstractC166987dD.A13()
            throw r0
        L62:
            X.B4Z r0 = X.B4Z.A00()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.nux.aymh.viewmodel.AymhViewModel.A00(X.0a1, com.instagram.nux.aymh.viewmodel.AymhViewModel, X.3NY, X.1Ds):java.lang.Object");
    }
}
