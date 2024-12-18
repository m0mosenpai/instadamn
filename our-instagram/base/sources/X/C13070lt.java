package X;

import android.graphics.Rect;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.0lt, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C13070lt extends AnonymousClass073 {
    public Object A00;
    public final C20030yX A01;
    public final C06v A02;
    public final C10300gw A03;
    public final C10300gw A04;
    public final List A05;
    public final C20030yX A06;
    public final C20030yX A07;
    public final C62731SNv A08 = new C62731SNv();
    public final Object A09;
    public final ArrayList A0A;
    public final ArrayList A0B;
    public final ArrayList A0C;
    public final ArrayList A0D;

    private final void A02(ViewGroup viewGroup, ArrayList arrayList, InterfaceC16820sZ interfaceC16820sZ) {
        AbstractC016906o.A00(arrayList, 4);
        final C06v c06v = this.A02;
        final ArrayList arrayList2 = this.A0D;
        final ArrayList arrayList3 = new ArrayList();
        int size = arrayList2.size();
        for (int i = 0; i < size; i++) {
            View view = (View) arrayList2.get(i);
            arrayList3.add(view.getTransitionName());
            view.setTransitionName(null);
        }
        if (AbstractC10360h2.A0H(2)) {
            Iterator it = this.A0C.iterator();
            while (it.hasNext()) {
                Object next = it.next();
                C14360o3.A07(next);
                ((View) next).getTransitionName();
            }
            Iterator it2 = arrayList2.iterator();
            while (it2.hasNext()) {
                Object next2 = it2.next();
                C14360o3.A07(next2);
                ((View) next2).getTransitionName();
            }
        }
        interfaceC16820sZ.invoke();
        final ArrayList arrayList4 = this.A0C;
        C20030yX c20030yX = this.A07;
        final int size2 = arrayList2.size();
        final ArrayList arrayList5 = new ArrayList();
        for (int i2 = 0; i2 < size2; i2++) {
            View view2 = (View) arrayList4.get(i2);
            String transitionName = view2.getTransitionName();
            arrayList5.add(transitionName);
            if (transitionName != null) {
                view2.setTransitionName(null);
                String str = (String) c20030yX.get(transitionName);
                int i3 = 0;
                while (true) {
                    if (i3 >= size2) {
                        break;
                    }
                    if (str.equals(arrayList3.get(i3))) {
                        ((View) arrayList2.get(i3)).setTransitionName(transitionName);
                        break;
                    }
                    i3++;
                }
            }
        }
        C03O.A00(viewGroup, new Runnable() { // from class: X.06u
            @Override // java.lang.Runnable
            public final void run() {
                for (int i4 = 0; i4 < size2; i4++) {
                    ((View) arrayList2.get(i4)).setTransitionName((String) arrayList3.get(i4));
                    ((View) arrayList4.get(i4)).setTransitionName((String) arrayList5.get(i4));
                }
            }
        });
        AbstractC016906o.A00(arrayList, 0);
        c06v.A0J(this.A09, arrayList4, arrayList2);
    }

    private final C09530e4 A00(ViewGroup viewGroup, final C10300gw c10300gw, final C10300gw c10300gw2) {
        ArrayList arrayList;
        Object obj;
        View view = new View(viewGroup.getContext());
        final Rect rect = new Rect();
        List<C13020lo> list = this.A05;
        Iterator it = list.iterator();
        View view2 = null;
        boolean z = false;
        while (it.hasNext()) {
            if (((C13020lo) it.next()).A00 != null && c10300gw2 != null && c10300gw != null && (!this.A07.isEmpty()) && (obj = this.A09) != null) {
                C20030yX c20030yX = this.A06;
                C06v c06v = AbstractC016906o.A01;
                C14360o3.A0B(c20030yX, 3);
                C03O.A00(viewGroup, new Runnable(this) { // from class: X.05l
                    public final /* synthetic */ C13070lt A00;

                    {
                        this.A00 = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        C20030yX c20030yX2 = this.A00.A01;
                        C06v c06v2 = AbstractC016906o.A01;
                        C14360o3.A0B(c20030yX2, 3);
                    }
                });
                ArrayList arrayList2 = this.A0C;
                arrayList2.addAll(c20030yX.values());
                ArrayList arrayList3 = this.A0B;
                if (!arrayList3.isEmpty()) {
                    Object obj2 = arrayList3.get(0);
                    C14360o3.A07(obj2);
                    view2 = (View) c20030yX.get(obj2);
                    this.A02.A09(view2, obj);
                }
                ArrayList arrayList4 = this.A0D;
                C20030yX c20030yX2 = this.A01;
                arrayList4.addAll(c20030yX2.values());
                ArrayList arrayList5 = this.A0A;
                if (!arrayList5.isEmpty()) {
                    Object obj3 = arrayList5.get(0);
                    C14360o3.A07(obj3);
                    final View view3 = (View) c20030yX2.get(obj3);
                    if (view3 != null) {
                        final C06v c06v2 = this.A02;
                        C03O.A00(viewGroup, new Runnable() { // from class: X.05m
                            @Override // java.lang.Runnable
                            public final void run() {
                                C06v c06v3 = c06v2;
                                View view4 = view3;
                                Rect rect2 = rect;
                                C14360o3.A0B(c06v3, 0);
                                C14360o3.A0B(rect2, 2);
                                C06v.A00(view4, rect2);
                            }
                        });
                        z = true;
                    }
                }
                C06v c06v3 = this.A02;
                c06v3.A0B(view, obj, arrayList2);
                c06v3.A0H(obj, null, null, obj, null, null, arrayList4);
            }
        }
        ArrayList arrayList6 = new ArrayList();
        Object obj4 = null;
        Object obj5 = null;
        for (C13020lo c13020lo : list) {
            C10300gw c10300gw3 = ((AbstractC014105h) c13020lo).A00;
            C06v c06v4 = this.A02;
            Object A03 = c06v4.A03(c13020lo.A01);
            if (A03 != null) {
                final ArrayList arrayList7 = new ArrayList();
                Fragment fragment = c10300gw3.A07;
                View view4 = fragment.mView;
                C14360o3.A06(view4);
                A01(view4, arrayList7);
                if (this.A09 != null && (c10300gw3 == c10300gw2 || c10300gw3 == c10300gw)) {
                    if (c10300gw3 == c10300gw2) {
                        arrayList = this.A0C;
                    } else {
                        arrayList = this.A0D;
                    }
                    arrayList7.removeAll(AbstractC001800i.A0k(arrayList));
                }
                if (arrayList7.isEmpty()) {
                    c06v4.A08(view, A03);
                } else {
                    c06v4.A0I(A03, arrayList7);
                    c06v4.A0H(A03, A03, null, null, arrayList7, null, null);
                    if (c10300gw3.A00 == C05F.A0C) {
                        c10300gw3.A02 = false;
                        ArrayList arrayList8 = new ArrayList(arrayList7);
                        arrayList8.remove(fragment.mView);
                        c06v4.A0A(fragment.mView, A03, arrayList8);
                        C03O.A00(viewGroup, new Runnable() { // from class: X.05n
                            @Override // java.lang.Runnable
                            public final void run() {
                                ArrayList arrayList9 = arrayList7;
                                C14360o3.A0B(arrayList9, 0);
                                AbstractC016906o.A00(arrayList9, 4);
                            }
                        });
                    }
                }
                if (c10300gw3.A00 == C05F.A01) {
                    arrayList6.addAll(arrayList7);
                    if (z) {
                        c06v4.A07(rect, A03);
                    }
                    if (AbstractC10360h2.A0H(2)) {
                        Iterator it2 = arrayList7.iterator();
                        while (it2.hasNext()) {
                            C14360o3.A07(it2.next());
                        }
                    }
                } else {
                    c06v4.A09(view2, A03);
                    if (AbstractC10360h2.A0H(2)) {
                        Iterator it3 = arrayList7.iterator();
                        while (it3.hasNext()) {
                            C14360o3.A07(it3.next());
                        }
                    }
                }
                if (c13020lo.A02) {
                    obj4 = c06v4.A06(obj4, A03, null);
                } else {
                    obj5 = c06v4.A06(obj5, A03, null);
                }
            }
        }
        Object A05 = this.A02.A05(obj4, obj5, this.A09);
        AbstractC10360h2.A0H(2);
        return new C09530e4(arrayList6, A05);
    }

    private final void A01(View view, ArrayList arrayList) {
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            if (!viewGroup.isTransitionGroup()) {
                int childCount = viewGroup.getChildCount();
                for (int i = 0; i < childCount; i++) {
                    View childAt = viewGroup.getChildAt(i);
                    if (childAt.getVisibility() == 0) {
                        A01(childAt, arrayList);
                    }
                }
                return;
            }
        }
        if (!arrayList.contains(view)) {
            arrayList.add(view);
        }
    }

    @Override // X.AnonymousClass073
    public final void A04(ViewGroup viewGroup) {
        this.A08.A00();
    }

    @Override // X.AnonymousClass073
    public final void A06(ViewGroup viewGroup, AnonymousClass002 anonymousClass002) {
        Object obj = this.A00;
        if (obj != null) {
            this.A02.A0G(obj, anonymousClass002.A00);
        }
    }

    @Override // X.AnonymousClass073
    public final boolean A07() {
        Object obj;
        C06v c06v = this.A02;
        if (!c06v.A0L()) {
            return false;
        }
        List<C13020lo> list = this.A05;
        if (!(list instanceof Collection) || !list.isEmpty()) {
            for (C13020lo c13020lo : list) {
                if (Build.VERSION.SDK_INT < 34 || (obj = c13020lo.A01) == null || !c06v.A0N(obj)) {
                    return false;
                }
            }
        }
        Object obj2 = this.A09;
        if (obj2 != null && !c06v.A0N(obj2)) {
            return false;
        }
        return true;
    }

    public final boolean A08() {
        List list = this.A05;
        if (!(list instanceof Collection) || !list.isEmpty()) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                if (!((AbstractC014105h) it.next()).A00.A07.mTransitioning) {
                    return false;
                }
            }
        }
        return true;
    }

    public C13070lt(C20030yX c20030yX, C20030yX c20030yX2, C20030yX c20030yX3, C06v c06v, C10300gw c10300gw, C10300gw c10300gw2, Object obj, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, ArrayList arrayList4, List list) {
        this.A05 = list;
        this.A03 = c10300gw;
        this.A04 = c10300gw2;
        this.A02 = c06v;
        this.A09 = obj;
        this.A0C = arrayList;
        this.A0D = arrayList2;
        this.A07 = c20030yX;
        this.A0A = arrayList3;
        this.A0B = arrayList4;
        this.A06 = c20030yX2;
        this.A01 = c20030yX3;
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [X.0ps, java.lang.Object] */
    @Override // X.AnonymousClass073
    public final void A03(ViewGroup viewGroup) {
        if (!viewGroup.isLaidOut()) {
            Iterator it = this.A05.iterator();
            while (it.hasNext()) {
                it.next();
                AbstractC10360h2.A0H(2);
            }
            return;
        }
        if (A08() && this.A09 != null) {
            A07();
        }
        if (A07() && A08()) {
            final ?? obj = new Object();
            C09530e4 A00 = A00(viewGroup, this.A04, this.A03);
            ArrayList arrayList = (ArrayList) A00.A00;
            Object obj2 = A00.A01;
            List list = this.A05;
            ArrayList<C10300gw> arrayList2 = new ArrayList(AbstractC06950Ym.A1E(list, 10));
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                arrayList2.add(((AbstractC014105h) it2.next()).A00);
            }
            for (final C10300gw c10300gw : arrayList2) {
                Runnable runnable = new Runnable() { // from class: X.05j
                    @Override // java.lang.Runnable
                    public final void run() {
                        C15370ps c15370ps = C15370ps.this;
                        C14360o3.A0B(c15370ps, 0);
                        InterfaceC16820sZ interfaceC16820sZ = (InterfaceC16820sZ) c15370ps.A00;
                        if (interfaceC16820sZ != null) {
                            interfaceC16820sZ.invoke();
                        }
                    }
                };
                this.A02.A0E(this.A08, c10300gw.A07, obj2, runnable, new Runnable(this) { // from class: X.05k
                    public final /* synthetic */ C13070lt A00;

                    {
                        this.A00 = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        C10300gw c10300gw2 = c10300gw;
                        C13070lt c13070lt = this.A00;
                        AbstractC10360h2.A0H(2);
                        c10300gw2.A02(c13070lt);
                    }
                });
            }
            A02(viewGroup, arrayList, new C0SI(viewGroup, this, obj2, obj));
        }
    }

    @Override // X.AnonymousClass073
    public final void A05(ViewGroup viewGroup) {
        if (!viewGroup.isLaidOut()) {
            Iterator it = this.A05.iterator();
            while (it.hasNext()) {
                C10300gw c10300gw = ((AbstractC014105h) it.next()).A00;
                AbstractC10360h2.A0H(2);
                c10300gw.A02(this);
            }
            return;
        }
        Object obj = this.A00;
        if (obj != null) {
            this.A02.A0F(obj);
        } else {
            C09530e4 A00 = A00(viewGroup, this.A04, this.A03);
            ArrayList arrayList = (ArrayList) A00.A00;
            Object obj2 = A00.A01;
            List list = this.A05;
            ArrayList<C10300gw> arrayList2 = new ArrayList(AbstractC06950Ym.A1E(list, 10));
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                arrayList2.add(((AbstractC014105h) it2.next()).A00);
            }
            for (final C10300gw c10300gw2 : arrayList2) {
                this.A02.A0D(this.A08, c10300gw2.A07, obj2, new Runnable(this) { // from class: X.05i
                    public final /* synthetic */ C13070lt A00;

                    {
                        this.A00 = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        C10300gw c10300gw3 = c10300gw2;
                        C13070lt c13070lt = this.A00;
                        AbstractC10360h2.A0H(2);
                        c10300gw3.A02(c13070lt);
                    }
                });
            }
            A02(viewGroup, arrayList, new AnonymousClass033(0, viewGroup, this, obj2));
        }
        AbstractC10360h2.A0H(2);
    }
}
