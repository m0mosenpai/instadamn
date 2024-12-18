package X;

import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import com.facebook.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/* renamed from: X.07A, reason: invalid class name */
/* loaded from: classes.dex */
public abstract class C07A {
    public boolean A00;
    public boolean A01;
    public final ViewGroup A02;
    public final List A03 = new ArrayList();
    public final List A04 = new ArrayList();

    public static final C07A A02(ViewGroup viewGroup, AbstractC10360h2 abstractC10360h2) {
        C14360o3.A0B(viewGroup, 0);
        C14360o3.A07(abstractC10360h2.A0V());
        Object tag = viewGroup.getTag(R.id.special_effects_controller_view_tag);
        if (tag instanceof C07A) {
            return (C07A) tag;
        }
        C07A c07a = new C07A(viewGroup);
        viewGroup.setTag(R.id.special_effects_controller_view_tag, c07a);
        return c07a;
    }

    public final void A07() {
        AbstractC10360h2.A0H(2);
        ViewGroup viewGroup = this.A02;
        viewGroup.isAttachedToWindow();
        List list = this.A03;
        synchronized (list) {
            A03();
            A05(this, list);
            Iterator it = AbstractC001800i.A0U(this.A04).iterator();
            while (it.hasNext()) {
                C10300gw c10300gw = (C10300gw) it.next();
                AbstractC10360h2.A0H(2);
                c10300gw.A01(viewGroup);
            }
            Iterator it2 = new ArrayList(list).iterator();
            while (it2.hasNext()) {
                C10300gw c10300gw2 = (C10300gw) it2.next();
                AbstractC10360h2.A0H(2);
                c10300gw2.A01(viewGroup);
            }
        }
    }

    public final void A09(C10300gw c10300gw) {
        C14360o3.A0B(c10300gw, 0);
        if (c10300gw.A02) {
            AnonymousClass077.A00(c10300gw.A07.requireView(), this.A02, c10300gw.A00);
            c10300gw.A02 = false;
        }
    }

    public final void A0A(List list) {
        C14360o3.A0B(list, 0);
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            AnonymousClass016.A16(((C10300gw) it.next()).A0B, arrayList);
        }
        List A0a = AbstractC001800i.A0a(AbstractC001800i.A0k(arrayList));
        int size = A0a.size();
        for (int i = 0; i < size; i++) {
            ((AnonymousClass073) A0a.get(i)).A05(this.A02);
        }
        int size2 = list.size();
        for (int i2 = 0; i2 < size2; i2++) {
            A09((C10300gw) list.get(i2));
        }
        List A0a2 = AbstractC001800i.A0a(list);
        int size3 = A0a2.size();
        for (int i3 = 0; i3 < size3; i3++) {
            C10300gw c10300gw = (C10300gw) A0a2.get(i3);
            if (c10300gw.A0B.isEmpty()) {
                c10300gw.A00();
            }
        }
    }

    public static final C10300gw A00(Fragment fragment, C07A c07a) {
        Object obj;
        Iterator it = c07a.A03.iterator();
        while (true) {
            if (it.hasNext()) {
                obj = it.next();
                C10300gw c10300gw = (C10300gw) obj;
                if (C14360o3.A0K(c10300gw.A07, fragment) && !c10300gw.A03) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        return (C10300gw) obj;
    }

    public static final C10300gw A01(Fragment fragment, C07A c07a) {
        Object obj;
        Iterator it = c07a.A04.iterator();
        while (true) {
            if (it.hasNext()) {
                obj = it.next();
                C10300gw c10300gw = (C10300gw) obj;
                if (C14360o3.A0K(c10300gw.A07, fragment) && !c10300gw.A03) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        return (C10300gw) obj;
    }

    private final void A03() {
        for (C10300gw c10300gw : this.A03) {
            if (c10300gw.A01 == C05F.A01) {
                c10300gw.A03(AnonymousClass075.A00(c10300gw.A07.requireView().getVisibility()), C05F.A00);
            }
        }
    }

    public static final void A04(C016206f c016206f, final C07A c07a, Integer num, Integer num2) {
        List list = c07a.A03;
        synchronized (list) {
            Fragment fragment = c016206f.A02;
            C10300gw A00 = A00(fragment, c07a);
            if (A00 != null || (fragment.mTransitioning && (A00 = A01(fragment, c07a)) != null)) {
                A00.A03(num, num2);
            } else {
                final C10300gw c10300gw = new C10300gw(c016206f, num, num2);
                list.add(c10300gw);
                Runnable runnable = new Runnable() { // from class: X.070
                    @Override // java.lang.Runnable
                    public final void run() {
                        C07A c07a2 = c07a;
                        C10300gw c10300gw2 = c10300gw;
                        C14360o3.A0B(c10300gw2, 1);
                        if (c07a2.A03.contains(c10300gw2)) {
                            Integer num3 = c10300gw2.A00;
                            View view = c10300gw2.A07.mView;
                            C14360o3.A06(view);
                            AnonymousClass077.A00(view, c07a2.A02, num3);
                        }
                    }
                };
                List list2 = c10300gw.A0A;
                list2.add(runnable);
                list2.add(new Runnable() { // from class: X.071
                    @Override // java.lang.Runnable
                    public final void run() {
                        C07A c07a2 = c07a;
                        C10300gw c10300gw2 = c10300gw;
                        C14360o3.A0B(c10300gw2, 1);
                        c07a2.A03.remove(c10300gw2);
                        c07a2.A04.remove(c10300gw2);
                    }
                });
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:77:0x014c, code lost:
    
        if (r2 == r6) goto L61;
     */
    /* JADX WARN: Removed duplicated region for block: B:258:0x0453 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:262:0x0412 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:284:0x047e  */
    /* JADX WARN: Removed duplicated region for block: B:287:0x047f  */
    /* JADX WARN: Type inference failed for: r19v0, types: [X.01p, X.0yX, java.util.Map] */
    /* JADX WARN: Type inference failed for: r2v10, types: [X.01p, X.0yX, java.util.Map] */
    /* JADX WARN: Type inference failed for: r4v6, types: [X.01p, X.0yX, java.util.Map] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A06() {
        /*
            Method dump skipped, instructions count: 1191
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C07A.A06():void");
    }

    public final void A08() {
        boolean z;
        Object obj;
        List list = this.A03;
        synchronized (list) {
            A03();
            ListIterator listIterator = list.listIterator(list.size());
            while (true) {
                z = false;
                obj = null;
                if (!listIterator.hasPrevious()) {
                    break;
                }
                obj = listIterator.previous();
                C10300gw c10300gw = (C10300gw) obj;
                AnonymousClass075 anonymousClass075 = AnonymousClass077.A00;
                View view = c10300gw.A07.mView;
                C14360o3.A06(view);
                Integer A01 = anonymousClass075.A01(view);
                Integer num = c10300gw.A00;
                Integer num2 = C05F.A01;
                if (num == num2 && A01 != num2) {
                    break;
                }
            }
            C10300gw c10300gw2 = (C10300gw) obj;
            if (c10300gw2 != null) {
                z = c10300gw2.A07.isPostponed();
            }
            this.A00 = z;
        }
    }

    public C07A(ViewGroup viewGroup) {
        this.A02 = viewGroup;
    }

    public static final void A05(C07A c07a, List list) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            C10300gw c10300gw = (C10300gw) list.get(i);
            if (!c10300gw.A06) {
                c10300gw.A06 = true;
                Integer num = c10300gw.A01;
                if (num == C05F.A01) {
                    C016206f c016206f = c10300gw.A08;
                    Fragment fragment = c016206f.A02;
                    View findFocus = fragment.mView.findFocus();
                    if (findFocus != null) {
                        fragment.setFocusedView(findFocus);
                        AbstractC10360h2.A0H(2);
                    }
                    View requireView = c10300gw.A07.requireView();
                    if (requireView.getParent() == null) {
                        c016206f.A01();
                        requireView.setAlpha(0.0f);
                    }
                    if (requireView.getAlpha() == 0.0f && requireView.getVisibility() == 0) {
                        requireView.setVisibility(4);
                    }
                    requireView.setAlpha(fragment.getPostOnViewCreatedAlpha());
                } else if (num == C05F.A0C) {
                    View requireView2 = c10300gw.A08.A02.requireView();
                    if (AbstractC10360h2.A0H(2)) {
                        requireView2.findFocus();
                    }
                    requireView2.clearFocus();
                }
            }
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            AnonymousClass016.A16(((C10300gw) it.next()).A0B, arrayList);
        }
        List A0a = AbstractC001800i.A0a(AbstractC001800i.A0k(arrayList));
        int size2 = A0a.size();
        for (int i2 = 0; i2 < size2; i2++) {
            AnonymousClass073 anonymousClass073 = (AnonymousClass073) A0a.get(i2);
            ViewGroup viewGroup = c07a.A02;
            if (!anonymousClass073.A01) {
                anonymousClass073.A03(viewGroup);
            }
            anonymousClass073.A01 = true;
        }
    }
}
