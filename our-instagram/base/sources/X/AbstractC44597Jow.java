package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.Jow, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public abstract class AbstractC44597Jow extends C3OO {
    public final void A01(JUS jus) {
        Object obj;
        Object Bsj;
        Object obj2;
        AbstractC46972Dl abstractC46972Dl;
        int i;
        if (this instanceof C44114Jee) {
            C44114Jee c44114Jee = (C44114Jee) this;
            ArrayList A1E = AbstractC166987dD.A1E();
            List list = jus.A01;
            boolean z = true;
            boolean A1S = AbstractC25230BEn.A1S(list.size(), 3);
            Context A0L = AbstractC166997dE.A0L(c44114Jee.A01);
            int A0C = AbstractC166987dD.A0C(A0L, (AbstractC25226BEj.A05(list) * 8) + 32);
            Iterator it = list.iterator();
            int i2 = 0;
            while (it.hasNext()) {
                C43792JYf A00 = AbstractC43791JYe.A00(A0L, (C25313BIi) it.next(), c44114Jee.A02, jus.A02);
                if (A1S) {
                    C43795JYi c43795JYi = c44114Jee.A04;
                    c43795JYi.A00(A00, C44140Jf5.A00, false);
                    c43795JYi.itemView.measure(0, 0);
                    ((AbstractC43793JYg) A00).A00 = c43795JYi.itemView.getMeasuredWidth();
                    i2 += c43795JYi.itemView.getMeasuredWidth();
                } else {
                    ((AbstractC43793JYg) A00).A00 = (c44114Jee.A00 - A0C) / list.size();
                }
                A1E.add(A00);
            }
            UserSession userSession = c44114Jee.A02;
            if (C2E8.A03(userSession)) {
                ArrayList A1E2 = AbstractC166987dD.A1E();
                for (Object obj3 : list) {
                    if (((C25313BIi) obj3).A02 instanceof C2E6) {
                        A1E2.add(obj3);
                    }
                }
                if (A1E2.size() >= 5) {
                    z = false;
                }
                A1E.add(new AbstractC43793JYg(AbstractC166997dE.A0q(A0L.getResources(), 2131959643), z));
            }
            if (A1S && (i = (c44114Jee.A00 - i2) - A0C) > 0) {
                Iterator it2 = A1E.iterator();
                while (it2.hasNext()) {
                    ((AbstractC43793JYg) it2.next()).A00 += i / A1E.size();
                }
            }
            JYV jyv = c44114Jee.A05;
            if (C2E8.A02(userSession)) {
                Iterator it3 = list.iterator();
                do {
                    obj2 = null;
                    if (!it3.hasNext()) {
                        break;
                    } else {
                        obj2 = it3.next();
                    }
                } while (!(!C14360o3.A0K(((C25313BIi) obj2).A02, C2057498z.A00)));
                C25313BIi c25313BIi = (C25313BIi) obj2;
                if (c25313BIi != null && (abstractC46972Dl = (AbstractC46972Dl) c25313BIi.A02) != null) {
                    c44114Jee.A03.CoU(abstractC46972Dl);
                }
            }
            Iterator it4 = list.iterator();
            int i3 = 0;
            int i4 = 0;
            while (true) {
                if (!it4.hasNext()) {
                    break;
                }
                C25313BIi c25313BIi2 = (C25313BIi) it4.next();
                if (C2E9.A07(userSession)) {
                    EnumC44049Jda Bsr = c44114Jee.A03.Bsr();
                    if (Bsr != null) {
                        obj = Bsr.A00;
                    } else {
                        obj = null;
                    }
                    Bsj = c25313BIi2.A02;
                } else {
                    obj = c25313BIi2.A02;
                    Bsj = c44114Jee.A03.Bsj();
                }
                if (C14360o3.A0K(obj, Bsj)) {
                    if (i4 >= 0) {
                        i3 = i4;
                    }
                } else {
                    i4++;
                }
            }
            List list2 = jyv.A02;
            list2.clear();
            list2.addAll(A1E);
            jyv.A00 = Integer.valueOf(i3);
            jyv.notifyDataSetChanged();
            return;
        }
        KQX kqx = (KQX) this;
        C14360o3.A0B(jus, 0);
        View view = kqx.A01;
        ViewGroup.MarginLayoutParams A0G = AbstractC31177DnL.A0G(view);
        Context A0L2 = AbstractC166997dE.A0L(view);
        A0G.topMargin = AbstractC167017dG.A06(A0L2);
        view.setLayoutParams(A0G);
        List list3 = jus.A01;
        if (list3.size() == 3) {
            int A0C2 = (kqx.A00 - AbstractC166987dD.A0C(A0L2, (AbstractC25226BEj.A05(list3) * 8) + 32)) / list3.size();
            C43795JYi c43795JYi2 = new C43795JYi(AbstractC166987dD.A0c(view, R.id.pill_0));
            C43795JYi c43795JYi3 = new C43795JYi(AbstractC166987dD.A0c(view, R.id.pill_1));
            C43795JYi c43795JYi4 = new C43795JYi(AbstractC166987dD.A0c(view, R.id.pill_2));
            KQX.A00(kqx, c43795JYi2, jus, 0, A0C2);
            KQX.A00(kqx, c43795JYi3, jus, 1, A0C2);
            KQX.A00(kqx, c43795JYi4, jus, 2, A0C2);
            return;
        }
        throw AbstractC166987dD.A14("Unsupported tab count");
    }
}
