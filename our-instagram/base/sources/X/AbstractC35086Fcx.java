package X;

import com.instagram.save.model.SavedCollection;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.Fcx, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC35086Fcx {
    public static void A00(C25671My c25671My, SavedCollection savedCollection, List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            AbstractC31172DnG.A0i(it).BqL().add(savedCollection.A0F);
        }
        C36116Fwq.A00(c25671My, savedCollection, list);
    }

    public static void A01(C25671My c25671My, SavedCollection savedCollection, List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            AbstractC31172DnG.A0i(it).BqL().remove(savedCollection.A0F);
        }
        C36116Fwq.A00(c25671My, savedCollection, list);
    }

    public static void A02(SavedCollection savedCollection, SavedCollection savedCollection2, List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C38321qM A0i = AbstractC31172DnG.A0i(it);
            A0i.BqL().add(savedCollection2.A0F);
            A0i.BqL().remove(savedCollection.A0F);
        }
        if (savedCollection2.A04 == null) {
            C38321qM c38321qM = (C38321qM) AbstractC166987dD.A16(list);
            savedCollection2.A0H = c38321qM.getId();
            savedCollection2.A04 = c38321qM;
        }
    }
}
