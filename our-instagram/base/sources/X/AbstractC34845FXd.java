package X;

import com.instagram.user.model.Product;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.FXd, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC34845FXd {
    public static final List A00(List list) {
        ArrayList A0q = AbstractC167017dG.A0q(list);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            A0q.add(((Product) it.next()).A0H);
        }
        return A0q;
    }

    public static final List A01(List list) {
        ArrayList A1E = AbstractC166987dD.A1E();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            AbstractC31179DnN.A1X(A1E, it);
        }
        return A1E;
    }
}
