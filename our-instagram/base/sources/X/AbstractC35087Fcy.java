package X;

import com.instagram.common.session.UserSession;
import com.instagram.save.model.SavedCollection;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: X.Fcy, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC35087Fcy {
    public static final void A01(InterfaceC11380iw interfaceC11380iw, UserSession userSession, SavedCollection savedCollection, Integer num) {
        String str;
        InterfaceC02590Ai A0f = AbstractC166987dD.A0f(AbstractC31173DnH.A0Q(interfaceC11380iw, userSession, num, 3), "ig_collections");
        if (A0f.isSampled()) {
            A0f.AAP("module_name", interfaceC11380iw.getModuleName());
            AbstractC31171DnF.A1B(A0f, "context_menu_action");
            switch (num.intValue()) {
                case 0:
                    str = "edit";
                    break;
                case 1:
                    str = "select";
                    break;
                case 2:
                    str = "report";
                    break;
                case 3:
                    str = "Delete collection";
                    break;
                default:
                    str = "Add to collection";
                    break;
            }
            AbstractC25233BEq.A17(A0f, "collection_type", AbstractC31180DnO.A0d(A0f, savedCollection, "action_type", str));
            AbstractC35089Fd0.A02(A0f, userSession, savedCollection);
        }
    }

    public static final void A02(UserSession userSession, InterfaceC60442pS interfaceC60442pS, SavedCollection savedCollection, ArrayList arrayList) {
        C14360o3.A0B(userSession, 3);
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            String A1B = AbstractC166987dD.A1B(it);
            C82713mZ c82713mZ = new C82713mZ(interfaceC60442pS, "instagram_organic_add_to_collection");
            c82713mZ.A61 = A1B;
            c82713mZ.A4r = savedCollection.A0F;
            c82713mZ.A4t = savedCollection.A02();
            c82713mZ.A6C = AbstractC25225BEi.A14();
            c82713mZ.A6x = savedCollection.A0G;
            if (!C5I7.A00(userSession, c82713mZ, interfaceC60442pS, C05F.A01)) {
                AbstractC31173DnH.A1S(c82713mZ.A00(), userSession);
            }
        }
    }

    public static final void A00(InterfaceC11380iw interfaceC11380iw, UserSession userSession, SavedCollection savedCollection) {
        InterfaceC02590Ai A0f = AbstractC166987dD.A0f(AbstractC31176DnK.A0L(interfaceC11380iw, userSession), "ig_collections");
        if (A0f.isSampled()) {
            A0f.AAP("module_name", interfaceC11380iw.getModuleName());
            AbstractC31171DnF.A1B(A0f, "create_new_collection");
            AbstractC25233BEq.A17(A0f, "collection_type", AbstractC31180DnO.A0d(A0f, savedCollection, "user_type", AbstractC35089Fd0.A01(savedCollection.A01(userSession))));
            A0f.AAP("collection_name", savedCollection.A0G);
            A0f.Cht();
        }
    }
}
