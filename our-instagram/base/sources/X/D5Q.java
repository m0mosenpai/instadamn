package X;

/* loaded from: classes5.dex */
public final class D5Q extends C06840Yb implements InterfaceC16620sF {
    public final int A00;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public D5Q(java.lang.Object r8, int r9) {
        /*
            r7 = this;
            r0 = r7
            r7.A00 = r9
            switch(r9) {
                case 0: goto L13;
                case 1: goto L16;
                default: goto L6;
            }
        L6:
            java.lang.Class<X.BoU> r3 = X.C26571BoU.class
            r1 = 2
            java.lang.String r4 = "onMoreButtonClicked"
            java.lang.String r5 = "onMoreButtonClicked(Lcom/meta/metaai/imagine/creation/impl/data/ImagineGeneratedImageWithStatus;Lcom/meta/metaai/shared/litho/ui/tooltip/AnchorHandle;Ljava/lang/Integer;Lkotlin/jvm/functions/Function0;)V"
        Ld:
            r6 = 0
            r2 = r8
            r0.<init>(r1, r2, r3, r4, r5, r6)
            return
        L13:
            java.lang.Class<X.Bcd> r3 = X.C25878Bcd.class
            goto L18
        L16:
            java.lang.Class<X.Bce> r3 = X.C25879Bce.class
        L18:
            r1 = 2
            java.lang.String r4 = "regenerateField"
            java.lang.String r5 = "regenerateField(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;)V"
            goto Ld
        */
        throw new UnsupportedOperationException("Method not decompiled: X.D5Q.<init>(java.lang.Object, int):void");
    }

    @Override // X.InterfaceC16620sF
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        switch (this.A00) {
            case 0:
                String str = (String) obj;
                C14360o3.A0B(str, 0);
                ((C25878Bcd) this.receiver).A0C(null, str, (String) obj2, null);
                break;
            case 1:
                String str2 = (String) obj;
                C14360o3.A0B(str2, 0);
                ((C25879Bce) this.receiver).A0D(null, str2, (String) obj2, null);
                break;
            default:
                CVV cvv = (CVV) obj2;
                C14360o3.A0B(cvv, 1);
                C26571BoU.A03((C28266CdB) obj, (C26571BoU) this.receiver, cvv, null, DEW.A00);
                break;
        }
        return C0eB.A00;
    }
}
