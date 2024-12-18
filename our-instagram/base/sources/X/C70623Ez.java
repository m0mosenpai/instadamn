package X;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewPropertyAnimator;
import java.util.AbstractCollection;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.3Ez, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public class C70623Ez extends C3F0 {
    public static TimeInterpolator A0B;
    public ArrayList A0A = new ArrayList();
    public ArrayList A07 = new ArrayList();
    public ArrayList A09 = new ArrayList();
    public ArrayList A08 = new ArrayList();
    public ArrayList A01 = new ArrayList();
    public ArrayList A05 = new ArrayList();
    public ArrayList A03 = new ArrayList();
    public ArrayList A00 = new ArrayList();
    public ArrayList A04 = new ArrayList();
    public ArrayList A06 = new ArrayList();
    public ArrayList A02 = new ArrayList();

    /* JADX WARN: Type inference failed for: r0v17, types: [java.lang.Object, X.VK0] */
    @Override // X.C3F0
    public final boolean A0U(C3OO c3oo, C3OO c3oo2, int i, int i2, int i3, int i4) {
        if (c3oo == c3oo2) {
            return A0T(c3oo, i, i2, i3, i4);
        }
        float translationX = c3oo.itemView.getTranslationX();
        float translationY = c3oo.itemView.getTranslationY();
        float alpha = c3oo.itemView.getAlpha();
        A00(c3oo);
        c3oo.itemView.setTranslationX(translationX);
        c3oo.itemView.setTranslationY(translationY);
        c3oo.itemView.setAlpha(alpha);
        A00(c3oo2);
        c3oo2.itemView.setTranslationX(-((int) ((i3 - i) - translationX)));
        c3oo2.itemView.setTranslationY(-((int) ((i4 - i2) - translationY)));
        c3oo2.itemView.setAlpha(0.0f);
        ArrayList arrayList = this.A08;
        ?? obj = new Object();
        obj.A05 = c3oo;
        obj.A04 = c3oo2;
        obj.A00 = i;
        obj.A01 = i2;
        obj.A02 = i3;
        obj.A03 = i4;
        arrayList.add(obj);
        return true;
    }

    private void A00(C3OO c3oo) {
        if (A0B == null) {
            A0B = new ValueAnimator().getInterpolator();
        }
        c3oo.itemView.animate().setInterpolator(A0B);
        A0K(c3oo);
    }

    private boolean A03(VK0 vk0, C3OO c3oo) {
        if (vk0.A04 == c3oo) {
            vk0.A04 = null;
        } else {
            if (vk0.A05 != c3oo) {
                return false;
            }
            vk0.A05 = null;
        }
        c3oo.itemView.setAlpha(1.0f);
        c3oo.itemView.setTranslationX(0.0f);
        c3oo.itemView.setTranslationY(0.0f);
        A0C(c3oo);
        return true;
    }

    @Override // X.C3F1
    public void A0I() {
        ArrayList arrayList = this.A09;
        int size = arrayList.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            C3OO c3oo = ((C99204ch) arrayList.get(size)).A04;
            View view = c3oo.itemView;
            view.setTranslationY(0.0f);
            view.setTranslationX(0.0f);
            A0P(c3oo);
            arrayList.remove(size);
        }
        ArrayList arrayList2 = this.A0A;
        int size2 = arrayList2.size();
        while (true) {
            size2--;
            if (size2 < 0) {
                break;
            }
            A0Q((C3OO) arrayList2.get(size2));
            arrayList2.remove(size2);
        }
        ArrayList arrayList3 = this.A07;
        int size3 = arrayList3.size();
        while (true) {
            size3--;
            if (size3 < 0) {
                break;
            }
            C3OO c3oo2 = (C3OO) arrayList3.get(size3);
            c3oo2.itemView.setAlpha(1.0f);
            A0O(c3oo2);
            arrayList3.remove(size3);
        }
        ArrayList arrayList4 = this.A08;
        int size4 = arrayList4.size();
        while (true) {
            size4--;
            if (size4 < 0) {
                break;
            }
            VK0 vk0 = (VK0) arrayList4.get(size4);
            C3OO c3oo3 = vk0.A05;
            if (c3oo3 != null) {
                A03(vk0, c3oo3);
            }
            C3OO c3oo4 = vk0.A04;
            if (c3oo4 != null) {
                A03(vk0, c3oo4);
            }
        }
        arrayList4.clear();
        if (A0L()) {
            ArrayList arrayList5 = this.A05;
            int size5 = arrayList5.size();
            while (true) {
                size5--;
                if (size5 < 0) {
                    break;
                }
                AbstractList abstractList = (AbstractList) arrayList5.get(size5);
                int size6 = abstractList.size();
                while (true) {
                    size6--;
                    if (size6 >= 0) {
                        C3OO c3oo5 = ((C99204ch) abstractList.get(size6)).A04;
                        View view2 = c3oo5.itemView;
                        view2.setTranslationY(0.0f);
                        view2.setTranslationX(0.0f);
                        A0P(c3oo5);
                        abstractList.remove(size6);
                        if (abstractList.isEmpty()) {
                            arrayList5.remove(abstractList);
                        }
                    }
                }
            }
            ArrayList arrayList6 = this.A01;
            int size7 = arrayList6.size();
            while (true) {
                size7--;
                if (size7 < 0) {
                    break;
                }
                AbstractList abstractList2 = (AbstractList) arrayList6.get(size7);
                int size8 = abstractList2.size();
                while (true) {
                    size8--;
                    if (size8 >= 0) {
                        C3OO c3oo6 = (C3OO) abstractList2.get(size8);
                        c3oo6.itemView.setAlpha(1.0f);
                        A0O(c3oo6);
                        abstractList2.remove(size8);
                        if (abstractList2.isEmpty()) {
                            arrayList6.remove(abstractList2);
                        }
                    }
                }
            }
            ArrayList arrayList7 = this.A03;
            int size9 = arrayList7.size();
            while (true) {
                size9--;
                if (size9 >= 0) {
                    AbstractList abstractList3 = (AbstractList) arrayList7.get(size9);
                    int size10 = abstractList3.size();
                    while (true) {
                        size10--;
                        if (size10 >= 0) {
                            VK0 vk02 = (VK0) abstractList3.get(size10);
                            C3OO c3oo7 = vk02.A05;
                            if (c3oo7 != null) {
                                A03(vk02, c3oo7);
                            }
                            C3OO c3oo8 = vk02.A04;
                            if (c3oo8 != null) {
                                A03(vk02, c3oo8);
                            }
                            if (abstractList3.isEmpty()) {
                                arrayList7.remove(abstractList3);
                            }
                        }
                    }
                } else {
                    A02(this.A06);
                    A02(this.A04);
                    A02(this.A00);
                    A02(this.A02);
                    A0A();
                    return;
                }
            }
        }
    }

    @Override // X.C3F1
    public void A0J() {
        long j;
        long j2;
        ArrayList arrayList = this.A0A;
        boolean z = !arrayList.isEmpty();
        ArrayList arrayList2 = this.A09;
        boolean z2 = !arrayList2.isEmpty();
        ArrayList arrayList3 = this.A08;
        boolean z3 = !arrayList3.isEmpty();
        ArrayList arrayList4 = this.A07;
        boolean z4 = !arrayList4.isEmpty();
        if (!z && !z2 && !z4 && !z3) {
            return;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            final C3OO c3oo = (C3OO) it.next();
            final View view = c3oo.itemView;
            final ViewPropertyAnimator animate = view.animate();
            this.A06.add(c3oo);
            animate.setDuration(A09()).alpha(0.0f).setListener(new AnimatorListenerAdapter() { // from class: X.3Tn
                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public final void onAnimationStart(Animator animator) {
                }

                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public final void onAnimationEnd(Animator animator) {
                    animate.setListener(null);
                    view.setAlpha(1.0f);
                    C70623Ez c70623Ez = this;
                    C3OO c3oo2 = c3oo;
                    c70623Ez.A0Q(c3oo2);
                    c70623Ez.A06.remove(c3oo2);
                    if (!c70623Ez.A0L()) {
                        c70623Ez.A0A();
                    }
                }
            }).start();
        }
        arrayList.clear();
        if (z2) {
            final ArrayList arrayList5 = new ArrayList();
            arrayList5.addAll(arrayList2);
            this.A05.add(arrayList5);
            arrayList2.clear();
            Runnable runnable = new Runnable() { // from class: X.4ci
                @Override // java.lang.Runnable
                public final void run() {
                    ArrayList arrayList6 = arrayList5;
                    Iterator it2 = arrayList6.iterator();
                    while (it2.hasNext()) {
                        C99204ch c99204ch = (C99204ch) it2.next();
                        final C70623Ez c70623Ez = C70623Ez.this;
                        final C3OO c3oo2 = c99204ch.A04;
                        int i = c99204ch.A00;
                        int i2 = c99204ch.A01;
                        int i3 = c99204ch.A02;
                        int i4 = c99204ch.A03;
                        final View view2 = c3oo2.itemView;
                        final int i5 = i3 - i;
                        final int i6 = i4 - i2;
                        if (i5 != 0) {
                            view2.animate().translationX(0.0f);
                        }
                        if (i6 != 0) {
                            view2.animate().translationY(0.0f);
                        }
                        final ViewPropertyAnimator animate2 = view2.animate();
                        c70623Ez.A04.add(c3oo2);
                        animate2.setDuration(c70623Ez.A08()).setListener(new AnimatorListenerAdapter() { // from class: X.4tX
                            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                            public final void onAnimationStart(Animator animator) {
                            }

                            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                            public final void onAnimationCancel(Animator animator) {
                                if (i5 != 0) {
                                    view2.setTranslationX(0.0f);
                                }
                                if (i6 != 0) {
                                    view2.setTranslationY(0.0f);
                                }
                            }

                            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                            public final void onAnimationEnd(Animator animator) {
                                animate2.setListener(null);
                                C70623Ez c70623Ez2 = c70623Ez;
                                C3OO c3oo3 = c3oo2;
                                c70623Ez2.A0P(c3oo3);
                                c70623Ez2.A04.remove(c3oo3);
                                if (!c70623Ez2.A0L()) {
                                    c70623Ez2.A0A();
                                }
                            }
                        }).start();
                    }
                    arrayList6.clear();
                    C70623Ez.this.A05.remove(arrayList6);
                }
            };
            if (z) {
                ((C99204ch) arrayList5.get(0)).A04.itemView.postOnAnimationDelayed(runnable, A09());
            } else {
                runnable.run();
            }
        }
        if (z3) {
            ArrayList arrayList6 = new ArrayList();
            arrayList6.addAll(arrayList3);
            this.A03.add(arrayList6);
            arrayList3.clear();
            RunnableC65913TwK runnableC65913TwK = new RunnableC65913TwK(this, arrayList6);
            if (z) {
                ((VK0) arrayList6.get(0)).A05.itemView.postOnAnimationDelayed(runnableC65913TwK, A09());
            } else {
                runnableC65913TwK.run();
            }
        }
        if (!z4) {
            return;
        }
        final ArrayList arrayList7 = new ArrayList();
        arrayList7.addAll(arrayList4);
        this.A01.add(arrayList7);
        arrayList4.clear();
        Runnable runnable2 = new Runnable() { // from class: X.3Ti
            @Override // java.lang.Runnable
            public final void run() {
                ArrayList arrayList8 = arrayList7;
                Iterator it2 = arrayList8.iterator();
                while (it2.hasNext()) {
                    final C3OO c3oo2 = (C3OO) it2.next();
                    final C70623Ez c70623Ez = C70623Ez.this;
                    final View view2 = c3oo2.itemView;
                    final ViewPropertyAnimator animate2 = view2.animate();
                    c70623Ez.A00.add(c3oo2);
                    animate2.alpha(1.0f).setDuration(c70623Ez.A06()).setListener(new AnimatorListenerAdapter() { // from class: X.3Tj
                        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                        public final void onAnimationStart(Animator animator) {
                        }

                        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                        public final void onAnimationCancel(Animator animator) {
                            view2.setAlpha(1.0f);
                        }

                        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                        public final void onAnimationEnd(Animator animator) {
                            animate2.setListener(null);
                            C70623Ez c70623Ez2 = c70623Ez;
                            C3OO c3oo3 = c3oo2;
                            c70623Ez2.A0O(c3oo3);
                            c70623Ez2.A00.remove(c3oo3);
                            if (!c70623Ez2.A0L()) {
                                c70623Ez2.A0A();
                            }
                        }
                    }).start();
                }
                arrayList8.clear();
                C70623Ez.this.A01.remove(arrayList8);
            }
        };
        if (!z && !z2 && !z3) {
            runnable2.run();
            return;
        }
        long j3 = 0;
        if (z) {
            j = A09();
        } else {
            j = 0;
        }
        if (z2) {
            j2 = A08();
        } else {
            j2 = 0;
        }
        if (z3) {
            j3 = A07();
        }
        ((C3OO) arrayList7.get(0)).itemView.postOnAnimationDelayed(runnable2, j + Math.max(j2, j3));
    }

    @Override // X.C3F1
    public void A0K(C3OO c3oo) {
        View view = c3oo.itemView;
        view.animate().cancel();
        ArrayList arrayList = this.A09;
        int size = arrayList.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            if (((C99204ch) arrayList.get(size)).A04 == c3oo) {
                view.setTranslationY(0.0f);
                view.setTranslationX(0.0f);
                A0P(c3oo);
                arrayList.remove(size);
            }
        }
        A01(c3oo, this.A08);
        if (this.A0A.remove(c3oo)) {
            view.setAlpha(1.0f);
            A0Q(c3oo);
        }
        if (this.A07.remove(c3oo)) {
            view.setAlpha(1.0f);
            A0O(c3oo);
        }
        ArrayList arrayList2 = this.A03;
        int size2 = arrayList2.size();
        while (true) {
            size2--;
            if (size2 < 0) {
                break;
            }
            ArrayList arrayList3 = (ArrayList) arrayList2.get(size2);
            A01(c3oo, arrayList3);
            if (arrayList3.isEmpty()) {
                arrayList2.remove(size2);
            }
        }
        ArrayList arrayList4 = this.A05;
        int size3 = arrayList4.size();
        while (true) {
            size3--;
            if (size3 < 0) {
                break;
            }
            AbstractList abstractList = (AbstractList) arrayList4.get(size3);
            int size4 = abstractList.size();
            while (true) {
                size4--;
                if (size4 < 0) {
                    break;
                }
                if (((C99204ch) abstractList.get(size4)).A04 == c3oo) {
                    view.setTranslationY(0.0f);
                    view.setTranslationX(0.0f);
                    A0P(c3oo);
                    abstractList.remove(size4);
                    if (abstractList.isEmpty()) {
                        arrayList4.remove(size3);
                    }
                }
            }
        }
        ArrayList arrayList5 = this.A01;
        int size5 = arrayList5.size();
        while (true) {
            size5--;
            if (size5 < 0) {
                break;
            }
            AbstractCollection abstractCollection = (AbstractCollection) arrayList5.get(size5);
            if (abstractCollection.remove(c3oo)) {
                view.setAlpha(1.0f);
                A0O(c3oo);
                if (abstractCollection.isEmpty()) {
                    arrayList5.remove(size5);
                }
            }
        }
        this.A06.remove(c3oo);
        this.A00.remove(c3oo);
        this.A02.remove(c3oo);
        this.A04.remove(c3oo);
        if (!A0L()) {
            A0A();
        }
    }

    @Override // X.C3F1
    public boolean A0L() {
        if (this.A07.isEmpty() && this.A08.isEmpty() && this.A09.isEmpty() && this.A0A.isEmpty() && this.A04.isEmpty() && this.A06.isEmpty() && this.A00.isEmpty() && this.A02.isEmpty() && this.A05.isEmpty() && this.A01.isEmpty() && this.A03.isEmpty()) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0025, code lost:
    
        if (r1 != 0) goto L9;
     */
    /* JADX WARN: Type inference failed for: r0v8, types: [java.lang.Object, X.4ch] */
    @Override // X.C3F0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean A0T(X.C3OO r4, int r5, int r6, int r7, int r8) {
        /*
            r3 = this;
            android.view.View r2 = r4.itemView
            float r0 = r2.getTranslationX()
            int r0 = (int) r0
            int r5 = r5 + r0
            android.view.View r0 = r4.itemView
            float r0 = r0.getTranslationY()
            int r0 = (int) r0
            int r6 = r6 + r0
            r3.A00(r4)
            int r0 = r7 - r5
            int r1 = r8 - r6
            if (r0 != 0) goto L20
            if (r1 != 0) goto L27
            r3.A0P(r4)
            r0 = 0
            return r0
        L20:
            int r0 = -r0
            float r0 = (float) r0
            r2.setTranslationX(r0)
            if (r1 == 0) goto L2c
        L27:
            int r0 = -r1
            float r0 = (float) r0
            r2.setTranslationY(r0)
        L2c:
            java.util.ArrayList r1 = r3.A09
            X.4ch r0 = new X.4ch
            r0.<init>()
            r0.A04 = r4
            r0.A00 = r5
            r0.A01 = r6
            r0.A02 = r7
            r0.A03 = r8
            r1.add(r0)
            r0 = 1
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C70623Ez.A0T(X.3OO, int, int, int, int):boolean");
    }

    private void A01(C3OO c3oo, List list) {
        int size = list.size();
        while (true) {
            size--;
            if (size >= 0) {
                VK0 vk0 = (VK0) list.get(size);
                if (A03(vk0, c3oo) && vk0.A05 == null && vk0.A04 == null) {
                    list.remove(vk0);
                }
            } else {
                return;
            }
        }
    }

    public static final void A02(List list) {
        int size = list.size();
        while (true) {
            size--;
            if (size >= 0) {
                ((C3OO) list.get(size)).itemView.animate().cancel();
            } else {
                return;
            }
        }
    }

    @Override // X.C3F0
    public boolean A0R(C3OO c3oo) {
        A00(c3oo);
        c3oo.itemView.setAlpha(0.0f);
        this.A07.add(c3oo);
        return true;
    }

    @Override // X.C3F0
    public boolean A0S(C3OO c3oo) {
        A00(c3oo);
        this.A0A.add(c3oo);
        return true;
    }
}
