package X;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: X.Ffy, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C35206Ffy {
    public EgP A00;
    public List A05;
    public List A06;
    public List A02 = AbstractC166987dD.A1E();
    public List A01 = AbstractC166987dD.A1E();
    public CopyOnWriteArrayList A04 = null;
    public CopyOnWriteArrayList A03 = null;
    public final Object A07 = new Object();

    public static void A00(AbstractC12990ll abstractC12990ll, C35206Ffy c35206Ffy, String str) {
        if (str != null) {
            C25621Ms A0M = AbstractC31173DnH.A0M(abstractC12990ll);
            A0M.A0B("fb/ig_user/");
            A0M.A9s("big_blue_token", str);
            C1ON A0I = AbstractC31178DnM.A0I(A0M, C32159EBg.class, C34801FVd.class);
            C31456Ds0.A00(A0I, c35206Ffy, abstractC12990ll, 35);
            C1GJ.A03(A0I);
            return;
        }
        A01(c35206Ffy);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [X.1vw, java.lang.Object, X.FvX] */
    public static void A01(C35206Ffy c35206Ffy) {
        Iterator it;
        synchronized (c35206Ffy.A07) {
            CopyOnWriteArrayList copyOnWriteArrayList = c35206Ffy.A03;
            copyOnWriteArrayList.getClass();
            it = copyOnWriteArrayList.iterator();
            c35206Ffy.A03.clear();
        }
        while (it.hasNext()) {
            it.next();
        }
        C41451vu c41451vu = C41451vu.A01;
        ?? obj = new Object();
        obj.A00 = null;
        c41451vu.E4s(obj);
    }

    public static void A02(C35206Ffy c35206Ffy) {
        Iterator it;
        synchronized (c35206Ffy.A07) {
            c35206Ffy.A01 = AbstractC166987dD.A1E();
            CopyOnWriteArrayList copyOnWriteArrayList = c35206Ffy.A04;
            copyOnWriteArrayList.getClass();
            it = copyOnWriteArrayList.iterator();
            c35206Ffy.A04.clear();
        }
        while (it.hasNext()) {
            it.next();
        }
    }

    public final void A03(List list, CopyOnWriteArrayList copyOnWriteArrayList) {
        Iterator it;
        CopyOnWriteArrayList copyOnWriteArrayList2;
        String str;
        C203168yY c203168yY;
        synchronized (this.A07) {
            ArrayList A1E = AbstractC166987dD.A1E();
            ArrayList A1E2 = AbstractC166987dD.A1E();
            List list2 = this.A02;
            A1E.addAll(list2);
            A1E2.addAll(list2);
            EgP egP = this.A00;
            if (egP != null) {
                C203158yX c203158yX = C36007Fv5.A00().A01;
                if (c203158yX != null && (c203168yY = c203158yX.A00) != null) {
                    str = c203168yY.A01;
                } else {
                    str = null;
                }
                if (TextUtils.equals(str, egP.A02)) {
                    int indexOf = A1E.indexOf(egP);
                    if (indexOf >= 0) {
                        A1E.set(indexOf, egP);
                    } else {
                        A1E.add(egP);
                    }
                    A1E2.add(egP);
                }
            }
            for (EgO egO : this.A01) {
                if (A1E.indexOf(egO) < 0) {
                    A1E.add(egO);
                }
                A1E2.add(egO);
            }
            this.A06 = A1E;
            this.A05 = A1E2;
            it = copyOnWriteArrayList.iterator();
            copyOnWriteArrayList.clear();
            CopyOnWriteArrayList copyOnWriteArrayList3 = this.A04;
            if (copyOnWriteArrayList3 != null && copyOnWriteArrayList3.isEmpty() && (copyOnWriteArrayList2 = this.A03) != null) {
                copyOnWriteArrayList2.isEmpty();
            }
        }
        while (it.hasNext()) {
            it.next();
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                it2.next();
            }
        }
    }
}
