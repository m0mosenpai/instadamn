package X;

import android.content.Context;
import android.util.SparseArray;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.model.reels.Reel;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.CYu, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC28066CYu {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r15v1, types: [X.0pQ, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v6, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r4v5, types: [java.util.List] */
    public static final void A01(Context context, UserSession userSession, ImageUrl imageUrl, Reel reel, InterfaceC16660sJ interfaceC16660sJ) {
        String str;
        int i = 0;
        List<C41181vS> A0O = reel.A0O(userSession);
        C14360o3.A07(A0O);
        ArrayList A1E = AbstractC166987dD.A1E();
        for (C41181vS c41181vS : A0O) {
            if (!C41661wG.A00(userSession).Cbf(reel, c41181vS)) {
                C14360o3.A0A(c41181vS);
                A1E.add(c41181vS);
            }
        }
        List A00 = A00(A0O);
        ArrayList A0q = AbstractC167017dG.A0q(A00);
        Iterator it = A00.iterator();
        while (it.hasNext()) {
            A0q.add(AbstractC25226BEj.A15(it).Bhu());
        }
        List A002 = A00(A1E);
        ArrayList A0q2 = AbstractC167017dG.A0q(A002);
        Iterator it2 = A002.iterator();
        while (it2.hasNext()) {
            A0q2.add(AbstractC25226BEj.A15(it2).Bhu());
        }
        if (A0q2.size() != 3) {
            ArrayList A1E2 = AbstractC166987dD.A1E();
            int size = 3 - A0q2.size();
            int size2 = A0q.size();
            ArrayList arrayList = A0q;
            if (size2 > size) {
                arrayList = A0q.subList(0, size);
            }
            Iterator it3 = A0q2.iterator();
            while (it3.hasNext()) {
                A1E2.add(it3.next());
            }
            for (Object obj : arrayList) {
                if (!A1E2.contains(obj)) {
                    A1E2.add(obj);
                }
            }
            int size3 = A1E2.size();
            ArrayList arrayList2 = A1E2;
            if (size3 > 3) {
                arrayList2 = A1E2.subList(0, 3);
            }
            A0q2 = arrayList2;
        }
        int A04 = AbstractC25235BEs.A04(context);
        float f = A04 / 64.0f;
        C29935DHx c29935DHx = new C29935DHx(userSession, imageUrl, interfaceC16660sJ, f, A04, 0);
        ArrayList A1E3 = AbstractC166987dD.A1E();
        A1E3.addAll(A0q2);
        if (A0q2.size() == 1) {
            if (imageUrl != null) {
                A1E3.add(imageUrl);
            } else {
                C18950wb.A01.AEp("Exception getting Candid cover image url", 817896325);
            }
        }
        ?? obj2 = new Object();
        obj2.A00 = 2;
        if (A1E3.size() > 2) {
            obj2.A00 = 3;
            str = "THREE_FACES";
        } else {
            str = "TWO_FACES";
        }
        SparseArray sparseArray = new SparseArray();
        Iterator it4 = A1E3.iterator();
        while (it4.hasNext()) {
            Object next = it4.next();
            int i2 = i + 1;
            if (i < 0) {
                AbstractC16960so.A1U();
                throw C00O.createAndThrow();
            }
            C30176DRg c30176DRg = new C30176DRg(i, 14, sparseArray, (Object) obj2, c29935DHx);
            C1OG A0J = C25821No.A00().A0J((ImageUrl) next, "ROLL_CALL_FACEPILE");
            A0J.A02(new C29143CtA(str, c30176DRg, f, i));
            A0J.A01();
            i = i2;
        }
    }

    public static final List A00(List list) {
        ArrayList A1E = AbstractC166987dD.A1E();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            User user = ((C41181vS) it.next()).A0i;
            if (user != null) {
                A1E.add(user);
            }
        }
        return AbstractC001800i.A0d(AbstractC001800i.A0W(A1E), 3);
    }
}
