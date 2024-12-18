package X;

import android.view.View;

/* loaded from: classes5.dex */
public final class D5P extends C06840Yb implements InterfaceC16660sJ {
    public final int A00;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public D5P(java.lang.Object r8, int r9) {
        /*
            r7 = this;
            r0 = r7
            r7.A00 = r9
            switch(r9) {
                case 0: goto L13;
                case 1: goto L16;
                case 2: goto L1e;
                case 3: goto L26;
                case 4: goto L2e;
                case 5: goto L38;
                case 6: goto L38;
                default: goto L6;
            }
        L6:
            java.lang.Class<X.Boo> r3 = X.C26591Boo.class
            r1 = 1
            java.lang.String r4 = "onCardClick"
            java.lang.String r5 = "onCardClick(Landroid/view/View;Linstagram/features/clips/intentawareads/logging/ClipsIntentAwareAdsLogger$CardAdClickType;)V"
        Ld:
            r6 = 0
        Le:
            r2 = r8
            r0.<init>(r1, r2, r3, r4, r5, r6)
            return
        L13:
            java.lang.Class<X.Bce> r3 = X.C25879Bce.class
            goto L18
        L16:
            java.lang.Class<X.Bcd> r3 = X.C25878Bcd.class
        L18:
            r1 = 1
            java.lang.String r4 = "regenerateField"
            java.lang.String r5 = "regenerateField(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;)V"
            goto Ld
        L1e:
            java.lang.Class<X.N6I> r3 = X.N6I.class
            r1 = 1
            java.lang.String r4 = "onFetchArchive"
            java.lang.String r5 = "onFetchArchive(ZLjava/lang/String;)V"
            goto Ld
        L26:
            java.lang.Class<X.N6J> r3 = X.N6J.class
            r1 = 1
            java.lang.String r4 = "updateCaptionAddOnData"
            java.lang.String r5 = "updateCaptionAddOnData(Lcom/instagram/api/schemas/CaptionAddOnData;Ljava/lang/String;)V"
            goto Ld
        L2e:
            java.lang.Class<X.BcQ> r3 = X.C25869BcQ.class
            r1 = 1
            java.lang.String r4 = "toggleAutoReplies"
            java.lang.String r5 = "toggleAutoReplies(Z)Z"
            r6 = 8
            goto Le
        L38:
            java.lang.Class<X.BbT> r3 = X.C25812BbT.class
            r1 = 1
            java.lang.String r4 = "handleImagineAction"
            java.lang.String r5 = "handleImagineAction(Lcom/meta/metaai/imagine/creation/impl/viewmodel/ImagineMediaAction;Z)V"
            goto Ld
        */
        throw new UnsupportedOperationException("Method not decompiled: X.D5P.<init>(java.lang.Object, int):void");
    }

    @Override // X.InterfaceC16660sJ
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        switch (this.A00) {
            case 0:
                ((C25879Bce) this.receiver).A0D(null, AbstractC167027dH.A0Q(obj), null, null);
                break;
            case 1:
                ((C25878Bcd) this.receiver).A0C(null, AbstractC167027dH.A0Q(obj), null, null);
                break;
            case 2:
                C51039Mgp.A01((C51039Mgp) ((N6I) this.receiver).A0A.getValue(), null, AbstractC166987dD.A1a(obj));
                break;
            case 3:
                N6J.A0B((C1117351z) obj, (N6J) this.receiver, null);
                break;
            case 4:
                ((C25869BcQ) this.receiver).A01(AbstractC166987dD.A1a(obj));
                break;
            case 5:
            case 6:
                AbstractC27455C9x abstractC27455C9x = (AbstractC27455C9x) obj;
                C14360o3.A0B(abstractC27455C9x, 0);
                ((C25812BbT) this.receiver).A0F(abstractC27455C9x, false);
                break;
            default:
                View A0R = AbstractC25228BEl.A0R(obj);
                C26591Boo c26591Boo = (C26591Boo) this.receiver;
                Integer num = C05F.A00;
                C26591Boo.A0D(c26591Boo);
                C26591Boo.A0A(A0R, c26591Boo, num);
                break;
        }
        return C0eB.A00;
    }
}
