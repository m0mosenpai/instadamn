package X;

import com.facebook.avatar.expresso.odr.ODRController;
import java.io.File;

/* loaded from: classes5.dex */
public final class D5g extends C03E implements InterfaceC16590sC {
    public final int A00;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public D5g(java.lang.Object r8, int r9) {
        /*
            r7 = this;
            r0 = r7
            r7.A00 = r9
            switch(r9) {
                case 0: goto L13;
                case 1: goto L1b;
                default: goto L6;
            }
        L6:
            java.lang.Class<X.CUg> r3 = X.C27961CUg.class
            r1 = 5
            java.lang.String r4 = "showOffensiveWarning"
            java.lang.String r5 = "showOffensiveWarning(Landroid/view/ViewGroup;Ljava/lang/String;Ljava/lang/String;Lcom/instagram/feed/media/CommentOffensiveScore;Lcom/instagram/wellbeing/warning/intf/OffensiveContentWarningProgress;)V"
        Ld:
            r6 = 0
            r2 = r8
            r0.<init>(r1, r2, r3, r4, r5, r6)
            return
        L13:
            java.lang.Class<com.facebook.avatar.expresso.odr.ODRController> r3 = com.facebook.avatar.expresso.odr.ODRController.class
            r1 = 5
            java.lang.String r4 = "downloadAsset"
            java.lang.String r5 = "downloadAsset(Ljava/lang/String;Ljava/io/File;Ljava/lang/String;Lcom/facebook/avatar/expresso/utils/ODRSuccess$TemplateInfo;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;"
            goto Ld
        L1b:
            java.lang.Class<X.CUg> r3 = X.C27961CUg.class
            r1 = 5
            java.lang.String r4 = "onCommentPollVoteAdded"
            java.lang.String r5 = "onCommentPollVoteAdded(Ljava/lang/String;Ljava/lang/String;Lcom/instagram/reels/polling/PollIntf;Ljava/lang/Integer;I)V"
            goto Ld
        */
        throw new UnsupportedOperationException("Method not decompiled: X.D5g.<init>(java.lang.Object, int):void");
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0008. Please report as an issue. */
    @Override // X.InterfaceC16590sC
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        switch (this.A00) {
            case 0:
                File file = (File) obj2;
                C54836OLv c54836OLv = (C54836OLv) obj4;
                return ODRController.A03((ODRController) this.receiver, c54836OLv, file, (String) obj, (String) obj3, (InterfaceC23621Ds) obj5);
            case 1:
                String str = (String) obj;
                String str2 = (String) obj2;
                InterfaceC101404gy interfaceC101404gy = (InterfaceC101404gy) obj3;
                int A0H = AbstractC166987dD.A0H(obj5);
                AbstractC167027dH.A12(str, str2, interfaceC101404gy);
                ((C27961CUg) this.receiver).A02.A0U(interfaceC101404gy, (Integer) obj4, str, str2, A0H);
                return C0eB.A00;
            default:
                C14360o3.A0B(obj, 0);
                AbstractC25233BEq.A0w(1, obj2, obj4, obj5);
                return C0eB.A00;
        }
    }
}
