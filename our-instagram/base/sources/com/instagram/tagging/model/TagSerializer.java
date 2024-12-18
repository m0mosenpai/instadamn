package com.instagram.tagging.model;

import X.AbstractC166987dD;
import X.AbstractC167007dF;
import X.AbstractC167017dG;
import X.AbstractC37300Gc1;
import X.AbstractC43592JPx;
import X.AbstractC50522MSa;
import X.AnonymousClass182;
import X.C14360o3;
import X.C17z;
import android.graphics.PointF;
import com.instagram.debug.devoptions.signalsplayground.fragment.CreatorInspirationSignalsPlaygroundTestUsersFragment;
import java.io.StringWriter;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* loaded from: classes9.dex */
public abstract class TagSerializer {
    public static final void A03(AnonymousClass182 anonymousClass182, Tag tag) {
        if (tag != null) {
            anonymousClass182.A0d();
            anonymousClass182.A0R(tag.A03(), AbstractC43592JPx.A05(tag.getId()));
            AbstractC50522MSa.A0u(tag.A00(), anonymousClass182);
            tag.A05(anonymousClass182);
            anonymousClass182.A0a();
        }
    }

    public static final String A00(List list, List list2) {
        StringWriter A0O = AbstractC37300Gc1.A0O();
        C17z A0S = AbstractC167007dF.A0S(A0O);
        if (!list.isEmpty()) {
            A0S.A0M("in");
            Iterator it = list.iterator();
            while (it.hasNext()) {
                A03(A0S, (Tag) it.next());
            }
            A0S.A0Z();
        }
        if (list2 != null && !list2.isEmpty()) {
            A0S.A0M("untagged");
            Iterator it2 = list2.iterator();
            while (it2.hasNext()) {
                A03(A0S, (Tag) it2.next());
            }
            A0S.A0Z();
        }
        String A0l = AbstractC167017dG.A0l(A0S, A0O);
        C14360o3.A07(A0l);
        return A0l;
    }

    public static final String A01(List list, List list2, List list3) {
        StringWriter A0O = AbstractC37300Gc1.A0O();
        C17z A0S = AbstractC167007dF.A0S(A0O);
        A0S.A0M("in");
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                A03(A0S, (Tag) it.next());
            }
        }
        A0S.A0Z();
        if (list2 != null && !list2.isEmpty()) {
            A0S.A0r("removed");
            A0S.A0c();
            Iterator it2 = list2.iterator();
            while (it2.hasNext()) {
                Tag tag = (Tag) it2.next();
                if (tag != null) {
                    A0S.A0u(tag.getId());
                }
            }
            A0S.A0Z();
        }
        if (list3 != null && !list3.isEmpty()) {
            A0S.A0r("added");
            A0S.A0c();
            Iterator it3 = list3.iterator();
            while (it3.hasNext()) {
                Tag tag2 = (Tag) it3.next();
                if (tag2 != null) {
                    A0S.A0u(tag2.getId());
                }
            }
            A0S.A0Z();
        }
        String A0l = AbstractC167017dG.A0l(A0S, A0O);
        C14360o3.A07(A0l);
        return A0l;
    }

    public static final String A02(Map map, Set set, Set set2) {
        StringWriter A0O = AbstractC37300Gc1.A0O();
        C17z A0S = AbstractC167007dF.A0S(A0O);
        A0S.A0M("in");
        if (set != null) {
            Iterator it = set.iterator();
            while (it.hasNext()) {
                String A1B = AbstractC166987dD.A1B(it);
                A0S.A0d();
                A0S.A0S(CreatorInspirationSignalsPlaygroundTestUsersFragment.INTENT_EXTRA_USER_ID, A1B);
                if (map != null) {
                    AbstractC50522MSa.A0u((PointF) map.get(A1B), A0S);
                }
                A0S.A0a();
            }
        }
        A0S.A0Z();
        A0S.A0M("removed");
        if (set2 != null) {
            Iterator it2 = set2.iterator();
            while (it2.hasNext()) {
                A0S.A0u(AbstractC166987dD.A1B(it2));
            }
        }
        A0S.A0Z();
        String A0l = AbstractC167017dG.A0l(A0S, A0O);
        C14360o3.A07(A0l);
        return A0l;
    }
}
