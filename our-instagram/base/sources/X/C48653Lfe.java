package X;

import com.instagram.common.session.UserSession;
import com.instagram.direct.armadilloexpress.transportpayload.AddMessageContent;
import com.instagram.direct.armadilloexpress.transportpayload.Link;

/* renamed from: X.Lfe, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C48653Lfe implements InterfaceC50453MPh {
    public static final C48653Lfe A00 = new Object();

    @Override // X.InterfaceC50453MPh
    public final void A8H(UserSession userSession, L5O l5o, AddMessageContent addMessageContent, C83403nh c83403nh, C7OH c7oh) {
        Link link;
        AbstractC167027dH.A0a(0, userSession, c83403nh, addMessageContent, l5o);
        if (addMessageContent.addMessageContentCase_ == 3) {
            link = (Link) addMessageContent.addMessageContent_;
        } else {
            link = Link.DEFAULT_INSTANCE;
        }
        C14360o3.A07(link);
        AbstractC46835KnU.A00(userSession, link, c83403nh, Long.valueOf(l5o.A00), l5o.A0B);
    }

    @Override // X.InterfaceC50453MPh
    public final boolean FDU(AddMessageContent addMessageContent) {
        C14360o3.A0B(addMessageContent, 0);
        return AbstractC167007dF.A1P(addMessageContent.addMessageContentCase_, 3);
    }
}
