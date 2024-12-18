package X;

import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewPropertyAnimator;
import java.util.AbstractCollection;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.3li, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC82213li extends C3F0 {
    public TimeInterpolator A0B;
    public ArrayList A09 = new ArrayList();
    public ArrayList A06 = new ArrayList();
    public ArrayList A08 = new ArrayList();
    public ArrayList A07 = new ArrayList();
    public ArrayList A01 = new ArrayList();
    public ArrayList A05 = new ArrayList();
    public ArrayList A03 = new ArrayList();
    public ArrayList A00 = new ArrayList();
    public ArrayList A04 = new ArrayList();
    public ArrayList A0A = new ArrayList();
    public ArrayList A02 = new ArrayList();

    public void A0Z(C3OO c3oo, int i, int i2, int i3, int i4) {
        View view = c3oo.itemView;
        int i5 = i3 - i;
        int i6 = i4 - i2;
        if (i5 != 0) {
            view.animate().translationX(0.0f);
        }
        if (i6 != 0) {
            view.animate().translationY(0.0f);
        }
        ViewPropertyAnimator animate = view.animate();
        this.A04.add(c3oo);
        animate.setDuration(A08()).setListener(new C65774Ttp(view, animate, c3oo, this, i5, i6)).start();
    }

    private boolean A05(C3OO c3oo, VK2 vk2) {
        if (vk2.A04 == c3oo) {
            vk2.A04 = null;
        } else {
            if (vk2.A05 != c3oo) {
                return false;
            }
            vk2.A05 = null;
        }
        c3oo.itemView.setAlpha(1.0f);
        c3oo.itemView.setTranslationX(0.0f);
        c3oo.itemView.setTranslationY(0.0f);
        A0C(c3oo);
        return true;
    }

    @Override // X.C3F1
    public final void A0I() {
        ArrayList arrayList = this.A08;
        int size = arrayList.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            C3OO c3oo = ((C68243VJf) arrayList.get(size)).A04;
            View view = c3oo.itemView;
            view.setTranslationY(0.0f);
            view.setTranslationX(0.0f);
            A0P(c3oo);
            arrayList.remove(size);
        }
        ArrayList arrayList2 = this.A09;
        int size2 = arrayList2.size();
        while (true) {
            size2--;
            if (size2 < 0) {
                break;
            }
            A0Q((C3OO) arrayList2.get(size2));
            arrayList2.remove(size2);
        }
        ArrayList arrayList3 = this.A06;
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
        ArrayList arrayList4 = this.A07;
        int size4 = arrayList4.size();
        while (true) {
            size4--;
            if (size4 < 0) {
                break;
            }
            VK2 vk2 = (VK2) arrayList4.get(size4);
            C3OO c3oo3 = vk2.A05;
            if (c3oo3 != null) {
                A05(c3oo3, vk2);
            }
            C3OO c3oo4 = vk2.A04;
            if (c3oo4 != null) {
                A05(c3oo4, vk2);
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
                        C3OO c3oo5 = ((C68243VJf) abstractList.get(size6)).A04;
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
                            VK2 vk22 = (VK2) abstractList3.get(size10);
                            C3OO c3oo7 = vk22.A05;
                            if (c3oo7 != null) {
                                A05(c3oo7, vk22);
                            }
                            C3OO c3oo8 = vk22.A04;
                            if (c3oo8 != null) {
                                A05(c3oo8, vk22);
                            }
                            if (abstractList3.isEmpty()) {
                                arrayList7.remove(abstractList3);
                            }
                        }
                    }
                } else {
                    A03(this.A0A);
                    A03(this.A04);
                    A03(this.A00);
                    A03(this.A02);
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
        ArrayList arrayList = this.A09;
        boolean z = !arrayList.isEmpty();
        ArrayList arrayList2 = this.A08;
        boolean z2 = !arrayList2.isEmpty();
        ArrayList arrayList3 = this.A07;
        boolean z3 = !arrayList3.isEmpty();
        ArrayList arrayList4 = this.A06;
        boolean z4 = !arrayList4.isEmpty();
        if (!z && !z2 && !z4 && !z3) {
            return;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            A0X((C3OO) it.next());
        }
        arrayList.clear();
        if (z2) {
            ArrayList arrayList5 = new ArrayList();
            arrayList5.addAll(arrayList2);
            this.A05.add(arrayList5);
            arrayList2.clear();
            RunnableC71447Wu9 runnableC71447Wu9 = new RunnableC71447Wu9(this, arrayList5);
            if (z) {
                ((C68243VJf) arrayList5.get(0)).A04.itemView.postOnAnimationDelayed(runnableC71447Wu9, A09());
            } else {
                runnableC71447Wu9.run();
            }
        }
        if (z3) {
            ArrayList arrayList6 = new ArrayList();
            arrayList6.addAll(arrayList3);
            this.A03.add(arrayList6);
            arrayList3.clear();
            RunnableC71448WuA runnableC71448WuA = new RunnableC71448WuA(this, arrayList6);
            if (z) {
                ((VK2) arrayList6.get(0)).A05.itemView.postOnAnimationDelayed(runnableC71448WuA, A09());
            } else {
                runnableC71448WuA.run();
            }
        }
        if (!z4) {
            return;
        }
        ArrayList arrayList7 = new ArrayList();
        arrayList7.addAll(arrayList4);
        this.A01.add(arrayList7);
        arrayList4.clear();
        RunnableC65779Ttu runnableC65779Ttu = new RunnableC65779Ttu(this, arrayList7);
        if (!z && !z2 && !z3) {
            runnableC65779Ttu.run();
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
        ((C3OO) arrayList7.get(0)).itemView.postOnAnimationDelayed(runnableC65779Ttu, j + Math.max(j2, j3));
    }

    @Override // X.C3F1
    public final void A0K(C3OO c3oo) {
        View view = c3oo.itemView;
        view.animate().cancel();
        ArrayList arrayList = this.A08;
        int size = arrayList.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            if (((C68243VJf) arrayList.get(size)).A04 == c3oo) {
                view.setTranslationY(0.0f);
                view.setTranslationX(0.0f);
                A0P(c3oo);
                arrayList.remove(size);
            }
        }
        A02(c3oo, this.A07);
        if (this.A09.remove(c3oo)) {
            view.setAlpha(1.0f);
            A0Q(c3oo);
        }
        if (this.A06.remove(c3oo)) {
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
            A02(c3oo, arrayList3);
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
                if (((C68243VJf) abstractList.get(size4)).A04 == c3oo) {
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
            if (size5 >= 0) {
                AbstractCollection abstractCollection = (AbstractCollection) arrayList5.get(size5);
                if (abstractCollection.remove(c3oo)) {
                    view.setAlpha(1.0f);
                    A0O(c3oo);
                    if (abstractCollection.isEmpty()) {
                        arrayList5.remove(size5);
                    }
                }
            } else {
                this.A0A.remove(c3oo);
                this.A00.remove(c3oo);
                this.A02.remove(c3oo);
                this.A04.remove(c3oo);
                A0V();
                return;
            }
        }
    }

    @Override // X.C3F1
    public final boolean A0L() {
        if (this.A06.isEmpty() && this.A07.isEmpty() && this.A08.isEmpty() && this.A09.isEmpty() && this.A04.isEmpty() && this.A0A.isEmpty() && this.A00.isEmpty() && this.A02.isEmpty() && this.A05.isEmpty() && this.A01.isEmpty() && this.A03.isEmpty()) {
            return false;
        }
        return true;
    }

    public void A0W(C3OO c3oo) {
        View view = c3oo.itemView;
        ViewPropertyAnimator animate = view.animate();
        this.A00.add(c3oo);
        animate.alpha(1.0f).setDuration(A06()).setListener(new C65778Ttt(view, animate, c3oo, this)).start();
    }

    public void A0X(C3OO c3oo) {
        View view = c3oo.itemView;
        ViewPropertyAnimator animate = view.animate();
        this.A0A.add(c3oo);
        animate.setDuration(A09()).alpha(0.0f).setListener(new C65781Ttw(view, animate, c3oo, this)).start();
    }

    public void A0Y(C3OO c3oo) {
        if (this.A0B == null) {
            this.A0B = new ValueAnimator().getInterpolator();
        }
        c3oo.itemView.animate().setInterpolator(this.A0B);
        A0K(c3oo);
    }

    public final void A0a(VK2 vk2) {
        View view;
        C3OO c3oo = vk2.A05;
        View view2 = null;
        if (c3oo == null) {
            view = null;
        } else {
            view = c3oo.itemView;
        }
        C3OO c3oo2 = vk2.A04;
        if (c3oo2 != null) {
            view2 = c3oo2.itemView;
        }
        if (view != null) {
            ViewPropertyAnimator duration = view.animate().setDuration(A07());
            this.A02.add(vk2.A05);
            duration.translationX(vk2.A02 - vk2.A00);
            duration.translationY(vk2.A03 - vk2.A01);
            duration.alpha(0.0f).setListener(new U81(view, duration, vk2, this)).start();
        }
        if (view2 != null) {
            ViewPropertyAnimator animate = view2.animate();
            this.A02.add(vk2.A04);
            animate.translationX(0.0f).translationY(0.0f).setDuration(A07()).alpha(1.0f).setListener(new U82(view2, animate, vk2, this)).start();
        }
    }

    private void A02(C3OO c3oo, List list) {
        int size = list.size();
        while (true) {
            size--;
            if (size >= 0) {
                VK2 vk2 = (VK2) list.get(size);
                if (A05(c3oo, vk2) && vk2.A05 == null && vk2.A04 == null) {
                    list.remove(vk2);
                }
            } else {
                return;
            }
        }
    }

    public static final void A03(List list) {
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
        A0Y(c3oo);
        c3oo.itemView.setAlpha(0.0f);
        this.A06.add(c3oo);
        return true;
    }

    @Override // X.C3F0
    public boolean A0S(C3OO c3oo) {
        A0Y(c3oo);
        this.A09.add(c3oo);
        return true;
    }

    public final void A0V() {
        if (!A0L()) {
            A0A();
        }
    }
}
