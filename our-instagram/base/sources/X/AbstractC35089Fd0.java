package X;

import com.facebook.catalyst.modules.netinfo.NetInfoModule;
import com.instagram.common.session.UserSession;
import com.instagram.save.model.SavedCollection;

/* renamed from: X.Fd0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC35089Fd0 {
    public static void A02(InterfaceC02590Ai interfaceC02590Ai, UserSession userSession, SavedCollection savedCollection) {
        interfaceC02590Ai.AAP("collection_name", savedCollection.A0G);
        interfaceC02590Ai.AAP("user_type", A01(savedCollection.A01(userSession)));
        interfaceC02590Ai.Cht();
    }

    public static String A00(UserSession userSession, C33491iB c33491iB) {
        return A01(c33491iB.A07().A01(userSession));
    }

    public static String A01(Integer num) {
        switch (num.intValue()) {
            case 0:
                return "OWNER";
            case 1:
                return "VIEWER";
            case 2:
                return "COLLABORATOR";
            default:
                return NetInfoModule.CONNECTION_TYPE_NONE_DEPRECATED;
        }
    }
}
