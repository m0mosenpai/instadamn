package X;

import com.instagram.direct.model.messaginguser.MessagingUser;

/* renamed from: X.G5j, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C36434G5j implements InterfaceC50480MQi {
    public final /* synthetic */ G1e A00;
    public final /* synthetic */ C189478aR A01;

    @Override // X.InterfaceC50480MQi
    public final void Dd2(String str, String str2, String str3) {
        if (str2 != null && str != null && str3 != null) {
            this.A00.A04.AEG(str2, "DELETED", str, null, null);
        }
        this.A01.A0L(null);
    }

    public C36434G5j(G1e g1e, C189478aR c189478aR) {
        this.A00 = g1e;
        this.A01 = c189478aR;
    }

    @Override // X.InterfaceC50480MQi
    public final void Crd(MessagingUser messagingUser) {
        this.A01.A0L(null);
        this.A00.A00 = messagingUser;
    }

    @Override // X.InterfaceC50480MQi
    public final void onError(String str) {
        C9GR.A0F(this.A00.A02, "direct_unknown_error", 2131960763);
        C0w9.A03(str, "CollectionItemEmojiReactionsListNavigator.openReactionBottomsheet");
        this.A01.A0L(null);
    }
}
