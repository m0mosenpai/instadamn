package X;

import com.instagram.api.schemas.SocialContextType;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes5.dex */
public abstract /* synthetic */ class BFJ {
    public static Map A00(InterfaceC87503vI interfaceC87503vI) {
        ArrayList arrayList;
        LinkedHashMap A1I = AbstractC166987dD.A1I();
        ArrayList arrayList2 = null;
        if (interfaceC87503vI.ByL() != null) {
            List<InterfaceC87483vG> ByL = interfaceC87503vI.ByL();
            if (ByL != null) {
                arrayList = AbstractC166987dD.A1E();
                for (InterfaceC87483vG interfaceC87483vG : ByL) {
                    if (interfaceC87483vG != null) {
                        arrayList.add(interfaceC87483vG.F7o());
                    }
                }
            } else {
                arrayList = null;
            }
            A1I.put("social_context_action_metadata", arrayList);
        }
        if (interfaceC87503vI.ByM() != null) {
            List ByM = interfaceC87503vI.ByM();
            ArrayList A0q = AbstractC167017dG.A0q(ByM);
            Iterator it = ByM.iterator();
            while (it.hasNext()) {
                A0q.add(((User) it.next()).A07());
            }
            A1I.put("social_context_facepile_users", A0q);
        }
        if (interfaceC87503vI.ByN() != null) {
            A1I.put(AbstractC111324zv.A00(5386), interfaceC87503vI.ByN());
        }
        User ByQ = interfaceC87503vI.ByQ();
        if (ByQ != null) {
            A1I.put(AbstractC111324zv.A00(5387), ByQ.A07());
        }
        if (interfaceC87503vI.ByR() != null) {
            List<InterfaceC87833vr> ByR = interfaceC87503vI.ByR();
            if (ByR != null) {
                arrayList2 = AbstractC166987dD.A1E();
                for (InterfaceC87833vr interfaceC87833vr : ByR) {
                    if (interfaceC87833vr != null) {
                        arrayList2.add(interfaceC87833vr.F7o());
                    }
                }
            }
            A1I.put("social_context_subitems", arrayList2);
        }
        if (interfaceC87503vI.ByT() != null) {
            SocialContextType ByT = interfaceC87503vI.ByT();
            C14360o3.A0B(ByT, 0);
            A1I.put("social_context_type", ByT.A00);
        }
        interfaceC87503vI.getSocialContextUsersCount();
        A1I.put("social_context_users_count", Integer.valueOf(interfaceC87503vI.getSocialContextUsersCount()));
        return AbstractC06930Yk.A0B(A1I);
    }
}
