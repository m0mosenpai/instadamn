package X;

import com.instagram.common.session.UserSession;
import com.instagram.direct.armadilloexpress.transportpayload.AddMessageContent;
import com.instagram.direct.armadilloexpress.transportpayload.Text;

/* renamed from: X.Lfh, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C48656Lfh implements InterfaceC50453MPh {
    public static final C48656Lfh A00 = new Object();

    @Override // X.InterfaceC50453MPh
    public final void A8H(UserSession userSession, L5O l5o, AddMessageContent addMessageContent, C83403nh c83403nh, C7OH c7oh) {
        AbstractC25233BEq.A0v(0, userSession, c83403nh, addMessageContent);
        Text A0N = addMessageContent.A0N();
        C14360o3.A07(A0N);
        AbstractC46836KnV.A00(userSession, A0N, c83403nh);
    }

    @Override // X.InterfaceC50453MPh
    public final boolean FDU(AddMessageContent addMessageContent) {
        C14360o3.A0B(addMessageContent, 0);
        return AbstractC43593JPy.A1Y(addMessageContent.addMessageContentCase_);
    }
}
