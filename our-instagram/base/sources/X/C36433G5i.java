package X;

import com.instagram.direct.model.messaginguser.MessagingUser;
import com.instagram.model.direct.DirectThreadKey;

/* renamed from: X.G5i, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C36433G5i implements InterfaceC50480MQi {
    public final /* synthetic */ EJ0 A00;

    @Override // X.InterfaceC50480MQi
    public final void Crd(MessagingUser messagingUser) {
        EJ0 ej0 = this.A00;
        F3L.A00(ej0.requireActivity(), ej0, AbstractC166987dD.A0r(ej0.A00), messagingUser, "collection_item_username", null, false, false);
    }

    @Override // X.InterfaceC50480MQi
    public final void Dd2(String str, String str2, String str3) {
        if (str2 != null && str != null && str3 != null) {
            AbstractC165967bO.A00(AbstractC166987dD.A0r(this.A00.A00)).A0K(new DirectThreadKey(str3, null), str2, "DELETED", str, null, null);
        }
        AbstractC31177DnL.A13(this.A00);
    }

    public C36433G5i(EJ0 ej0) {
        this.A00 = ej0;
    }

    @Override // X.InterfaceC50480MQi
    public final void onError(String str) {
        EJ0 ej0 = this.A00;
        C9GR.A0F(ej0.getActivity(), "direct_unknown_error", 2131960763);
        C0w9.A03(str, "CollectionItemEmojiReactionsListNavigator.openReactionBottomsheet");
        AbstractC31177DnL.A13(ej0);
    }
}
