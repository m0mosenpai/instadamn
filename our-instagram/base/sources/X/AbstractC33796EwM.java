package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.EwM, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC33796EwM {
    public static final List A00(C6FQ c6fq, C6FW c6fw) {
        Iterable iterable = (Iterable) c6fw.A00.get(0);
        boolean A01 = C6DZ.A01(c6fw.A03(1));
        C6FG c6fg = c6fq.A03;
        if (c6fg != null) {
            AbstractC52232aO.A00(c6fg.A00);
            if (iterable != null) {
                java.util.Set A0k = AbstractC001800i.A0k(iterable);
                Collection collection = (Collection) AbstractC52312aW.A02.getValue();
                ArrayList<C52462al> A1E = AbstractC166987dD.A1E();
                for (Object obj : collection) {
                    C52462al c52462al = (C52462al) obj;
                    if (!A01 || System.currentTimeMillis() < Long.MAX_VALUE) {
                        if (A0k.contains(c52462al.A09)) {
                            A1E.add(obj);
                        }
                    }
                }
                ArrayList A0q = AbstractC167017dG.A0q(A1E);
                for (C52462al c52462al2 : A1E) {
                    C09530e4 A1L = AbstractC166987dD.A1L(PublicKeyCredentialControllerUtility.JSON_KEY_NAME, c52462al2.A09);
                    double d = c52462al2.A06;
                    List list = c52462al2.A07.A00;
                    C09530e4 A1L2 = AbstractC166987dD.A1L("group_size", Double.valueOf((d / list.size()) * 100.0d));
                    HashMap A1G = AbstractC166987dD.A1G();
                    int size = list.size();
                    for (int i = 0; i < size; i++) {
                        A1G.put(Integer.valueOf(i), ((C52432ai) list.get(i)).A01);
                    }
                    C09530e4 A1L3 = AbstractC166987dD.A1L("groups", A1G);
                    String str = C52462al.A00(c52462al2).A01;
                    int size2 = list.size();
                    int i2 = 0;
                    while (true) {
                        if (i2 < size2) {
                            if (!C14360o3.A0K(((C52432ai) list.get(i2)).A01, str)) {
                                i2++;
                            }
                        } else {
                            i2 = -1;
                            break;
                        }
                    }
                    A0q.add(AbstractC06930Yk.A02(A1L, A1L2, A1L3, AbstractC166987dD.A1L("current_group_index", Integer.valueOf(i2))));
                }
                return A0q;
            }
            Collection collection2 = (Collection) AbstractC52312aW.A02.getValue();
            ArrayList A1E2 = AbstractC166987dD.A1E();
            for (Object obj2 : collection2) {
                if (!A01 || System.currentTimeMillis() < Long.MAX_VALUE) {
                    A1E2.add(obj2);
                }
            }
            ArrayList A0q2 = AbstractC167017dG.A0q(A1E2);
            Iterator it = A1E2.iterator();
            while (it.hasNext()) {
                A0q2.add(AbstractC167017dG.A0r(PublicKeyCredentialControllerUtility.JSON_KEY_NAME, ((C52462al) it.next()).A09));
            }
            return A0q2;
        }
        return AbstractC166987dD.A1E();
    }
}
