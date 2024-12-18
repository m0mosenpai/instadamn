package X;

import android.content.Context;
import com.facebook.R;
import com.instagram.api.schemas.HallpassDetailsDict;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.model.reels.Reel;
import com.instagram.reels.store.ReelStore;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;

/* renamed from: X.Fci, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC35071Fci {
    public static final int A00(UserSession userSession, List list) {
        ArrayList A1F;
        List ByP;
        List ByP2;
        C14360o3.A0B(userSession, 0);
        C1OU c1ou = C1OU.$redex_init_class;
        ReelStore A03 = ReelStore.A03(userSession);
        C14360o3.A07(A03);
        ArrayList A0O = A03.A0O();
        User A0Y = AbstractC166997dE.A0Y(userSession);
        LinkedHashSet A0l = AbstractC31171DnF.A0l();
        ArrayList A1E = AbstractC166987dD.A1E();
        Iterator it = A0O.iterator();
        while (it.hasNext()) {
            List A0g = AbstractC001800i.A0g(((Reel) it.next()).A0I(userSession), new GRI(6));
            ArrayList A1E2 = AbstractC166987dD.A1E();
            Iterator it2 = A0g.iterator();
            while (it2.hasNext()) {
                User user = ((C41181vS) it2.next()).A0i;
                if (user != null) {
                    A1E2.add(user);
                }
            }
            ArrayList A1E3 = AbstractC166987dD.A1E();
            Iterator it3 = A1E2.iterator();
            while (it3.hasNext()) {
                Object next = it3.next();
                AbstractC25232BEp.A1Q(AbstractC31171DnF.A0g(next), A0Y.getId(), next, A1E3);
            }
            Object A0O2 = AbstractC001800i.A0O(A1E3, 0);
            if (A0O2 != null) {
                A0l.add(A0O2);
            }
            A1E.addAll(A1E3);
        }
        if (A0l.size() < 4) {
            A0l.addAll(A1E);
        }
        int size = A0l.size();
        if (size < 4) {
            Iterator it4 = A0O.iterator();
            while (it4.hasNext()) {
                List A0O3 = ((Reel) it4.next()).A0O(userSession);
                ArrayList A10 = AbstractC31174DnI.A10(A0O3);
                Iterator it5 = A0O3.iterator();
                while (it5.hasNext()) {
                    User user2 = ((C41181vS) it5.next()).A0i;
                    if (user2 != null) {
                        A10.add(user2);
                    }
                }
                ArrayList A1E4 = AbstractC166987dD.A1E();
                Iterator it6 = A10.iterator();
                while (it6.hasNext()) {
                    Object next2 = it6.next();
                    AbstractC25232BEp.A1Q(AbstractC31171DnF.A0g(next2), A0Y.getId(), next2, A1E4);
                }
                A0l.addAll(A1E4);
            }
        }
        if (A0l.size() < 4) {
            Iterator it7 = A0O.iterator();
            while (it7.hasNext()) {
                HallpassDetailsDict hallpassDetailsDict = ((Reel) it7.next()).A08;
                if (hallpassDetailsDict != null && (ByP2 = hallpassDetailsDict.ByP()) != null) {
                    ArrayList A1E5 = AbstractC166987dD.A1E();
                    for (Object obj : ByP2) {
                        AbstractC25232BEp.A1Q(AbstractC31171DnF.A0g(obj), A0Y.getId(), obj, A1E5);
                    }
                    A0l.addAll(A1E5);
                }
            }
        }
        if (A0l.size() < 4) {
            ReelStore A032 = ReelStore.A03(userSession);
            C14360o3.A07(A032);
            synchronized (A032) {
                A1F = AbstractC166987dD.A1F(A032.A04);
            }
            Iterator it8 = A1F.iterator();
            while (it8.hasNext()) {
                HallpassDetailsDict hallpassDetailsDict2 = ((Reel) it8.next()).A08;
                if (hallpassDetailsDict2 != null && (ByP = hallpassDetailsDict2.ByP()) != null) {
                    ArrayList A1E6 = AbstractC166987dD.A1E();
                    for (Object obj2 : ByP) {
                        AbstractC25232BEp.A1Q(AbstractC31171DnF.A0g(obj2), A0Y.getId(), obj2, A1E6);
                    }
                    A0l.addAll(A1E6);
                }
            }
        }
        list.clear();
        list.addAll(A0l);
        return size;
    }

    public static final List A02(UserSession userSession) {
        ArrayList A0O = C1OU.A04(userSession).A0O();
        User A10 = AbstractC166987dD.A10(userSession);
        LinkedHashSet A0l = AbstractC31171DnF.A0l();
        ArrayList A1E = AbstractC166987dD.A1E();
        Iterator it = A0O.iterator();
        while (it.hasNext()) {
            List A0g = AbstractC001800i.A0g(((Reel) it.next()).A0I(userSession), new GRI(5));
            ArrayList A1E2 = AbstractC166987dD.A1E();
            Iterator it2 = A0g.iterator();
            while (it2.hasNext()) {
                User user = ((C41181vS) it2.next()).A0i;
                if (user != null) {
                    A1E2.add(user);
                }
            }
            ArrayList A1E3 = AbstractC166987dD.A1E();
            Iterator it3 = A1E2.iterator();
            while (it3.hasNext()) {
                Object next = it3.next();
                AbstractC25232BEp.A1Q(AbstractC31171DnF.A0g(next), A10.getId(), next, A1E3);
            }
            Object A0O2 = AbstractC001800i.A0O(A1E3, 0);
            if (A0O2 != null) {
                A0l.add(A0O2);
            }
            A1E.addAll(A1E3);
        }
        if (A0l.size() < 3) {
            A0l.addAll(A1E);
        }
        if (A0l.isEmpty()) {
            return C16930sl.A00;
        }
        List A0a = AbstractC001800i.A0a(A0l);
        int size = A0l.size();
        if (size > 3) {
            size = 3;
        }
        return A0a.subList(0, size);
    }

    public static final C89533yt A01(Context context, ImageUrl imageUrl, String str) {
        C14360o3.A0B(str, 2);
        return new C89533yt(imageUrl, str, 64, 2, AbstractC167007dF.A09(context, R.attr.igds_color_gradient_cyan), 0, 0, 2, context.getColor(AbstractC53242c7.A0D(context)), false);
    }
}
