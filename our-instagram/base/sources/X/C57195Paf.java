package X;

/* renamed from: X.Paf, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C57195Paf extends C06840Yb implements InterfaceC16820sZ {
    public final int A00;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C57195Paf(java.lang.Object r8, int r9) {
        /*
            r7 = this;
            r0 = r7
            r7.A00 = r9
            r2 = r8
            switch(r9) {
                case 0: goto L13;
                case 1: goto L1b;
                default: goto L7;
            }
        L7:
            java.lang.Class<X.OeK> r3 = X.C55207OeK.class
            r1 = 0
            java.lang.String r4 = "createCallComponents"
            java.lang.String r5 = "createCallComponents(Lcom/facebook/msys/mca/Mailbox;Lcom/facebook/msys/mci/AccountSession;Lcom/facebook/rsys/crypto/gen/CryptoContextHolder;)Lcom/instagram/rtc/interactor/rsys/RtcCallComponents;"
            r6 = r1
        Lf:
            r0.<init>(r1, r2, r3, r4, r5, r6)
            return
        L13:
            java.lang.Class<X.MgR> r3 = X.C51019MgR.class
            r1 = 0
            java.lang.String r4 = "onPostTooltipSeen"
            java.lang.String r5 = "onPostTooltipSeen()Lkotlinx/coroutines/Job;"
            goto L22
        L1b:
            java.lang.Class<X.Mfh> r3 = X.C50974Mfh.class
            r1 = 0
            java.lang.String r4 = "onDoneClick"
            java.lang.String r5 = "onDoneClick()Lkotlinx/coroutines/Job;"
        L22:
            r6 = 8
            goto Lf
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C57195Paf.<init>(java.lang.Object, int):void");
    }

    @Override // X.InterfaceC16820sZ
    public final /* bridge */ /* synthetic */ Object invoke() {
        C141796aw A00;
        InterfaceC16620sF c57160PZe;
        switch (this.A00) {
            case 0:
                AbstractC52922bZ abstractC52922bZ = (AbstractC52922bZ) this.receiver;
                A00 = AbstractC141776au.A00(abstractC52922bZ);
                c57160PZe = new PYX(abstractC52922bZ, null, 29);
                break;
            case 1:
                AbstractC52922bZ abstractC52922bZ2 = (AbstractC52922bZ) this.receiver;
                A00 = AbstractC141776au.A00(abstractC52922bZ2);
                c57160PZe = new C57160PZe(abstractC52922bZ2, null, 38);
                break;
            default:
                return C55207OeK.A00(null, null, (C55207OeK) this.receiver);
        }
        AbstractC166987dD.A1Z(c57160PZe, A00);
        return C0eB.A00;
    }
}
