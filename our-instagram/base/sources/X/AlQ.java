package X;

import android.text.TextUtils;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;

/* loaded from: classes4.dex */
public final class AlQ implements InterfaceC169117gk {
    public final C195218kN A00;
    public final /* synthetic */ UserSession A01;

    @Override // X.InterfaceC169117gk
    public final Object E7Q(String str) {
        C14360o3.A0B(str, 0);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        C195218kN c195218kN = this.A00;
        UserSession userSession = this.A01;
        synchronized (c195218kN) {
            c195218kN.A05();
            Map map = null;
            C127165ou c127165ou = (C127165ou) c195218kN.A01.A05.get("coefficient_besties_list_ranking");
            if (c127165ou == null) {
                C0w9.A03("UsersBootstrapService", AnonymousClass001.A0R("Requested missing surface ", "coefficient_besties_list_ranking"));
            } else {
                map = c127165ou.A03;
                if (map == null) {
                    map = Collections.emptyMap();
                }
            }
            if (!TextUtils.isEmpty(str)) {
                C195248kQ c195248kQ = c195218kN.A04;
                if (str.length() > 0) {
                    Collection<User> collection = c195248kQ.A01[Character.toLowerCase(str.charAt(0)) % 30];
                    if (collection != null) {
                        for (User user : collection) {
                            if (AbstractC169157go.A00(user, str) && !user.CQf() && (map == null || map.containsKey(user.getId()))) {
                                if (!C14360o3.A0K(AbstractC166987dD.A10(userSession), user)) {
                                    linkedHashSet.add(user);
                                }
                            }
                        }
                    }
                }
            } else {
                Iterator A16 = AbstractC166997dE.A16(c195218kN.A02.A05);
                while (A16.hasNext()) {
                    User user2 = (User) A16.next();
                    if (!user2.CQf() && (map == null || map.containsKey(user2.getId()))) {
                        if (!C14360o3.A0K(AbstractC166987dD.A10(userSession), user2)) {
                            linkedHashSet.add(user2);
                        }
                    }
                }
            }
        }
        ArrayList A0U = AbstractC001800i.A0U(linkedHashSet);
        c195218kN.A09("coefficient_besties_list_ranking", A0U);
        return new A7R(A0U, linkedHashSet);
    }

    public AlQ(UserSession userSession) {
        this.A01 = userSession;
        C195218kN A00 = C195218kN.A00(userSession);
        C14360o3.A07(A00);
        this.A00 = A00;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0, types: [java.util.AbstractCollection, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.util.List, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v3, types: [X.0sl] */
    @Override // X.InterfaceC169117gk
    public final /* bridge */ /* synthetic */ Object AIV(Object obj, Object obj2) {
        ?? A1E;
        List list = (List) obj2;
        UserSession userSession = this.A01;
        if (list == null) {
            A1E = C16930sl.A00;
        } else {
            A1E = AbstractC166987dD.A1E();
            for (Object obj3 : list) {
                if (!C14360o3.A0K(AbstractC166987dD.A10(userSession), obj3)) {
                    A1E.add(obj3);
                }
            }
        }
        if (obj != null && (obj instanceof A7R)) {
            C01L A1I = C0eM.A1I();
            A1I.addAll(((A7R) obj).A00);
            ArrayList A1E2 = AbstractC166987dD.A1E();
            for (Object obj4 : A1E) {
                if (!r7.A01.contains(obj4)) {
                    A1E2.add(obj4);
                }
            }
            A1I.addAll(A1E2);
            return C0eM.A1J(A1I);
        }
        return A1E;
    }

    @Override // X.InterfaceC169117gk
    public final /* bridge */ /* synthetic */ Object ARP() {
        return AbstractC166987dD.A1F(C16930sl.A00);
    }
}
