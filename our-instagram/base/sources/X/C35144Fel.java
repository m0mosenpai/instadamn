package X;

import android.app.Activity;
import androidx.recyclerview.widget.RecyclerView;
import com.instagram.common.recyclerview.ViewModelListUpdate;
import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.Fel, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C35144Fel {
    public static final C35144Fel A00 = new Object();

    public final void A01(Activity activity, RecyclerView recyclerView, UserSession userSession, InterfaceC1569372x interfaceC1569372x, Integer num, List list, boolean z, boolean z2) {
        C51758Mth c51758Mth;
        AbstractC167007dF.A1D(userSession, 0, recyclerView);
        C70623Ez c70623Ez = new C70623Ez();
        ((C3F0) c70623Ez).A00 = false;
        recyclerView.setItemAnimator(c70623Ez);
        AbstractC31174DnI.A17(activity, recyclerView, false);
        recyclerView.A10(new C3YB(0, AbstractC166987dD.A0C(activity, 8)));
        C66392zG A002 = C66362zD.A00(activity);
        A002.A01(new C32604EXe(activity, null, userSession, null, interfaceC1569372x, num));
        C66362zD A0R = AbstractC31173DnH.A0R(A002, new EXU(activity, userSession, interfaceC1569372x));
        ViewModelListUpdate A0E = AbstractC31171DnF.A0E();
        ArrayList arrayList = null;
        if (list != null) {
            arrayList = AbstractC167017dG.A0q(list);
            Iterator it = list.iterator();
            while (it.hasNext()) {
                InterfaceC37273GbQ interfaceC37273GbQ = (InterfaceC37273GbQ) it.next();
                if (interfaceC37273GbQ != null) {
                    c51758Mth = new C51758Mth(interfaceC37273GbQ, false);
                } else {
                    c51758Mth = null;
                }
                arrayList.add(c51758Mth);
            }
        }
        A0E.A01(A00(arrayList, z, z2));
        A0R.A05(A0E);
        recyclerView.setAdapter(A0R);
    }

    public static final List A00(List list, boolean z, boolean z2) {
        Boolean bool;
        ArrayList A1E = AbstractC166987dD.A1E();
        int i = 0;
        if ((z || z2) && (list == null || list.isEmpty())) {
            A1E.clear();
            A1E.add(new C32101E8z(true));
        } else {
            A1E.clear();
            if (z2) {
                A1E.add(new C32101E8z(false));
            }
            if (list != null) {
                ArrayList A0q = AbstractC167017dG.A0q(list);
                int i2 = 0;
                for (Object obj : list) {
                    i++;
                    if (i2 < 0) {
                        AbstractC16960so.A1U();
                        throw C00O.createAndThrow();
                    }
                    C51758Mth c51758Mth = (C51758Mth) obj;
                    if (c51758Mth != null) {
                        bool = Boolean.valueOf(A1E.add(new C32077E8b(c51758Mth, AbstractC167007dF.A1N(i2))));
                    } else {
                        bool = null;
                    }
                    A0q.add(bool);
                    i2 = i;
                }
            }
        }
        return AbstractC001800i.A0a(A1E);
    }
}
