package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.base.IgFrameLayout;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes6.dex */
public final class FQP {
    public C34595FMe A00;
    public List A01;
    public final FF1 A02;
    public final UserSession A03;
    public final C7OC A04;
    public final List A05;
    public final java.util.Set A06;

    public FQP(UserSession userSession, C7OC c7oc) {
        C14360o3.A0B(userSession, 2);
        this.A04 = c7oc;
        this.A03 = userSession;
        this.A01 = C16930sl.A00;
        this.A06 = AbstractC166987dD.A1H();
        this.A05 = AbstractC166987dD.A1E();
        AnonymousClass548.A00();
        this.A02 = (FF1) userSession.A01(FF1.class, new C29906DGu(userSession, 10));
    }

    public final void A00(C34595FMe c34595FMe, InterfaceC11380iw interfaceC11380iw) {
        ArrayList arrayList;
        C34595FMe c34595FMe2;
        C14360o3.A0B(c34595FMe, 0);
        this.A00 = c34595FMe;
        InterfaceC19630xq interfaceC19630xq = this.A02.A00;
        int i = interfaceC19630xq.getInt("KEY_EMOJI_COUNT", -1);
        if (i > 0) {
            arrayList = AbstractC166987dD.A1E();
            int i2 = 0;
            do {
                String string = interfaceC19630xq.getString(AnonymousClass001.A0O("emoji_", i2), null);
                if (string == null) {
                    string = "";
                }
                arrayList.add(string);
                i2++;
            } while (i2 < i);
        } else {
            arrayList = AbstractC47145Kse.A00;
        }
        if (this.A00 != null) {
            List list = this.A05;
            list.clear();
            java.util.Set set = this.A06;
            set.clear();
            boolean z = false;
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                C148336m3 A05 = C148336m3.A04.A05(this.A03, AbstractC166987dD.A1B(it));
                if (A05 != null && !set.contains(A05)) {
                    list.add(A05);
                    set.add(A05);
                }
                if (list.size() >= 8) {
                    break;
                }
            }
            if (list.size() < 8) {
                Iterator A13 = AbstractC166997dE.A13(AbstractC47145Kse.A00);
                while (A13.hasNext()) {
                    String str = (String) AbstractC166997dE.A0l(A13);
                    if (list.size() == 8) {
                        break;
                    }
                    C148336m3 A052 = C148336m3.A04.A05(this.A03, str);
                    if (A052 != null && !set.contains(A052)) {
                        list.add(A052);
                        set.add(A052);
                    }
                }
            }
            List list2 = this.A01;
            boolean isEmpty = list2.isEmpty();
            if (AbstractC166987dD.A1b(list2)) {
                z = true;
            }
            if ((isEmpty || z) && (c34595FMe2 = this.A00) != null) {
                if (list2.isEmpty()) {
                    int i3 = 0;
                    do {
                        View view = (View) c34595FMe2.A03.get(i3);
                        if (i3 < list.size()) {
                            Object tag = view.getTag();
                            C14360o3.A0C(tag, AbstractC43591JPw.A00(87));
                            AbstractC168777gB.A03(interfaceC11380iw, this.A03, (C148336m3) list.get(i3), this.A04, (C168757g9) tag, 1.0f, true);
                            view.setVisibility(0);
                        } else {
                            view.setVisibility(4);
                        }
                        i3++;
                    } while (i3 < 8);
                    return;
                }
                ViewGroup viewGroup = c34595FMe2.A02;
                Context context = viewGroup.getContext();
                int A0C = AbstractC167017dG.A0C(context);
                List list3 = c34595FMe2.A03;
                int i4 = 0;
                if (list3.size() != list2.size()) {
                    list3.clear();
                    viewGroup.removeAllViews();
                    int size = list2.size();
                    for (int i5 = 0; i5 < size; i5++) {
                        IgFrameLayout A01 = AbstractC168777gB.A01(context, A0C, false);
                        list3.add(A01);
                        viewGroup.addView(A01);
                    }
                }
                for (Object obj : list2) {
                    int i6 = i4 + 1;
                    if (i4 < 0) {
                        AbstractC16960so.A1U();
                        throw C00O.createAndThrow();
                    }
                    Object tag2 = ((View) list3.get(i4)).getTag();
                    C14360o3.A0C(tag2, AbstractC43591JPw.A00(87));
                    AbstractC168777gB.A03(interfaceC11380iw, this.A03, (C148336m3) obj, this.A04, (C168757g9) tag2, 1.0f, true);
                    i4 = i6;
                }
                Iterator it2 = list3.iterator();
                while (it2.hasNext()) {
                    AbstractC13880nE.A0V((View) it2.next(), AbstractC167017dG.A06(context));
                }
                viewGroup.requestLayout();
            }
        }
    }
}
