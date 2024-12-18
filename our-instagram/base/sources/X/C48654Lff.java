package X;

import com.instagram.common.session.UserSession;
import com.instagram.direct.armadilloexpress.transportpayload.AddMessageContent;
import com.instagram.direct.armadilloexpress.transportpayload.Media;

/* renamed from: X.Lff, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C48654Lff implements InterfaceC50453MPh {
    public static final C48654Lff A00 = new Object();

    @Override // X.InterfaceC50453MPh
    public final void A8H(UserSession userSession, L5O l5o, AddMessageContent addMessageContent, C83403nh c83403nh, C7OH c7oh) {
        AbstractC167027dH.A0a(0, userSession, c83403nh, addMessageContent, l5o);
        Media A0L = addMessageContent.A0L();
        C14360o3.A07(A0L);
        boolean z = l5o.A0C;
        LL2.A05(userSession, A0L, c83403nh, Long.valueOf(l5o.A00), l5o.A0B, z);
    }

    @Override // X.InterfaceC50453MPh
    public final boolean FDU(AddMessageContent addMessageContent) {
        C14360o3.A0B(addMessageContent, 0);
        return AbstractC167007dF.A1P(addMessageContent.addMessageContentCase_, 5);
    }
}
