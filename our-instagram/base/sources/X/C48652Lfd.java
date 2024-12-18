package X;

import com.instagram.common.session.UserSession;
import com.instagram.direct.armadilloexpress.transportpayload.AddMessageContent;

/* renamed from: X.Lfd, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C48652Lfd implements InterfaceC50453MPh {
    public static final C48652Lfd A00 = new Object();

    @Override // X.InterfaceC50453MPh
    public final void A8H(UserSession userSession, L5O l5o, AddMessageContent addMessageContent, C83403nh c83403nh, C7OH c7oh) {
        C14360o3.A0B(c83403nh, 2);
        c83403nh.A18(C2EY.A18, "❤");
    }

    @Override // X.InterfaceC50453MPh
    public final boolean FDU(AddMessageContent addMessageContent) {
        C14360o3.A0B(addMessageContent, 0);
        return AbstractC167007dF.A1P(addMessageContent.addMessageContentCase_, 2);
    }
}
