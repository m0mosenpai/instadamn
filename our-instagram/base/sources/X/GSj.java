package X;

import com.instagram.common.typedurl.ImageUrl;
import com.instagram.reels.groupmention.fragment.GroupMentionQuickReplySheetContent;

/* loaded from: classes6.dex */
public final class GSj extends C03E implements InterfaceC16610sE {
    public final int A00;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public GSj(java.lang.Object r8, int r9) {
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
            java.lang.Class<X.6Xe> r3 = X.C140506Xe.class
        L8:
            r1 = 3
            java.lang.String r4 = "onPostClick"
            java.lang.String r5 = "onPostClick$fbandroid_java_com_instagram_reels_viewer_superlative_superlative(Ljava/lang/String;II)V"
        Ld:
            r6 = 0
            r2 = r8
            r0.<init>(r1, r2, r3, r4, r5, r6)
            return
        L13:
            java.lang.Class<X.EMM> r3 = X.EMM.class
            r1 = 3
            java.lang.String r4 = "onSendButtonClicked"
            java.lang.String r5 = "onSendButtonClicked(Ljava/lang/String;Ljava/lang/String;Lcom/instagram/common/typedurl/ImageUrl;)V"
            goto Ld
        L1b:
            java.lang.Class<X.6Xd> r3 = X.C140496Xd.class
            goto L8
        */
        throw new UnsupportedOperationException("Method not decompiled: X.GSj.<init>(java.lang.Object, int):void");
    }

    @Override // X.InterfaceC16610sE
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        if (this.A00 != 0) {
            int A0H = AbstractC166987dD.A0H(obj2);
            int A0H2 = AbstractC166987dD.A0H(obj3);
            InterfaceC16610sE interfaceC16610sE = ((C6XW) AbstractC25229BEm.A0o(obj, this)).A05;
            if (interfaceC16610sE != null) {
                interfaceC16610sE.invoke(obj, Integer.valueOf(A0H), Integer.valueOf(A0H2));
            }
        } else {
            String str = (String) obj;
            String str2 = (String) obj2;
            ImageUrl imageUrl = (ImageUrl) obj3;
            AbstractC167027dH.A12(str, str2, imageUrl);
            EMM emm = (EMM) this.receiver;
            InterfaceC09390do interfaceC09390do = emm.A0F;
            AbstractC34759FSy.A01(AbstractC166987dD.A0r(interfaceC09390do), "reshare", emm.A0B);
            EN7 en7 = new EN7();
            en7.setArguments(AbstractC167027dH.A09("group_mention_base_reel_owner", emm.A05, AbstractC166987dD.A1L("content", new GroupMentionQuickReplySheetContent(imageUrl, str, str2)), AbstractC166987dD.A1L("group_mention_base_reel_id", emm.A06), AbstractC166987dD.A1L("group_mention_base_reel_item_id", emm.A07)));
            C189478aR A0x = AbstractC25228BEl.A0x(emm.getActivity(), C3DN.A00);
            if (A0x != null) {
                A0x.A0F(en7, AbstractC25231BEo.A0g(interfaceC09390do));
            }
        }
        return C0eB.A00;
    }
}
