package X;

import com.instagram.common.session.UserSession;
import com.instagram.direct.armadilloexpress.transportpayload.AddMessageContent;
import com.instagram.direct.armadilloexpress.transportpayload.Collection;

/* renamed from: X.Lfc, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C48651Lfc implements InterfaceC50453MPh {
    public static final C48651Lfc A00 = new Object();

    @Override // X.InterfaceC50453MPh
    public final void A8H(UserSession userSession, L5O l5o, AddMessageContent addMessageContent, C83403nh c83403nh, C7OH c7oh) {
        Collection collection;
        AbstractC167027dH.A0a(0, userSession, c83403nh, addMessageContent, l5o);
        if (addMessageContent.addMessageContentCase_ == 7) {
            collection = (Collection) addMessageContent.addMessageContent_;
        } else {
            collection = Collection.DEFAULT_INSTANCE;
        }
        C14360o3.A07(collection);
        LJO.A00(userSession, collection, c83403nh, Long.valueOf(l5o.A00), l5o.A0B);
    }

    @Override // X.InterfaceC50453MPh
    public final boolean FDU(AddMessageContent addMessageContent) {
        C14360o3.A0B(addMessageContent, 0);
        return AbstractC167007dF.A1P(addMessageContent.addMessageContentCase_, 7);
    }
}
