package X;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.TimeInterpolator;
import android.os.Build;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowId;
import android.widget.ListView;
import com.facebook.R;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: X.TyM, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public abstract class AbstractC66024TyM implements Cloneable {
    public long A02;
    public long A04;
    public VIL A07;
    public UK8 A08;
    public ArrayList A0G;
    public ArrayList A0H;
    public XE3[] A0P;
    public static final Animator[] A0T = new Animator[0];
    public static final int[] A0S = {2, 1, 3, 4};
    public static final C68269VKg A0R = new C68269VKg();
    public static ThreadLocal A0Q = new ThreadLocal();
    public String A0D = MSY.A0h(this);
    public long A03 = -1;
    public long A01 = -1;
    public TimeInterpolator A05 = null;
    public ArrayList A0I = new ArrayList();
    public ArrayList A0J = new ArrayList();
    public C66038Tya A0C = new C66038Tya();
    public C66038Tya A0B = new C66038Tya();
    public UK2 A0A = null;
    public int[] A0L = A0S;
    public ArrayList A0F = new ArrayList();
    public Animator[] A0O = A0T;
    public int A00 = 0;
    public boolean A0N = false;
    public boolean A0K = false;
    public AbstractC66024TyM A09 = null;
    public ArrayList A0M = null;
    public ArrayList A0E = new ArrayList();
    public C68269VKg A06 = A0R;

    /* JADX WARN: Type inference failed for: r1v2, types: [X.01p, X.0yX, java.lang.Object] */
    public static C20030yX A01() {
        ThreadLocal threadLocal = A0Q;
        C20030yX c20030yX = (C20030yX) threadLocal.get();
        if (c20030yX == null) {
            ?? c005001p = new C005001p(0);
            threadLocal.set(c005001p);
            return c005001p;
        }
        return c20030yX;
    }

    public static void A02(View view, C66025TyN c66025TyN, C66038Tya c66038Tya) {
        c66038Tya.A02.put(view, c66025TyN);
        int id = view.getId();
        if (id >= 0) {
            SparseArray sparseArray = c66038Tya.A00;
            if (sparseArray.indexOfKey(id) >= 0) {
                sparseArray.put(id, null);
            } else {
                sparseArray.put(id, view);
            }
        }
        String transitionName = view.getTransitionName();
        if (transitionName != null) {
            C20030yX c20030yX = c66038Tya.A01;
            if (c20030yX.containsKey(transitionName)) {
                c20030yX.put(transitionName, null);
            } else {
                c20030yX.put(transitionName, view);
            }
        }
        if (view.getParent() instanceof ListView) {
            ListView listView = (ListView) view.getParent();
            if (listView.getAdapter().hasStableIds()) {
                long itemIdAtPosition = listView.getItemIdAtPosition(listView.getPositionForView(view));
                C003501a c003501a = c66038Tya.A03;
                if (c003501a.A01(itemIdAtPosition) >= 0) {
                    View view2 = (View) c003501a.A05(itemIdAtPosition);
                    if (view2 != null) {
                        view2.setHasTransientState(false);
                        c003501a.A09(itemIdAtPosition, null);
                        return;
                    }
                    return;
                }
                view.setHasTransientState(true);
                c003501a.A09(itemIdAtPosition, view);
            }
        }
    }

    private void A03(View view, boolean z) {
        C66038Tya c66038Tya;
        if (view != null) {
            view.getId();
            if (view.getParent() instanceof ViewGroup) {
                C66025TyN c66025TyN = new C66025TyN(view);
                if (z) {
                    A0Y(c66025TyN);
                } else {
                    A0W(c66025TyN);
                }
                c66025TyN.A01.add(this);
                A0X(c66025TyN);
                if (z) {
                    c66038Tya = this.A0C;
                } else {
                    c66038Tya = this.A0B;
                }
                A02(view, c66025TyN, c66038Tya);
            }
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                for (int i = 0; i < viewGroup.getChildCount(); i++) {
                    A03(viewGroup.getChildAt(i), z);
                }
            }
        }
    }

    public static void A04(XFY xfy, AbstractC66024TyM abstractC66024TyM, AbstractC66024TyM abstractC66024TyM2, boolean z) {
        AbstractC66024TyM abstractC66024TyM3 = abstractC66024TyM.A09;
        if (abstractC66024TyM3 != null) {
            A04(xfy, abstractC66024TyM3, abstractC66024TyM2, z);
        }
        ArrayList arrayList = abstractC66024TyM.A0M;
        if (arrayList != null && !arrayList.isEmpty()) {
            int size = arrayList.size();
            XE3[] xe3Arr = abstractC66024TyM.A0P;
            if (xe3Arr == null) {
                xe3Arr = new XE3[size];
            }
            abstractC66024TyM.A0P = null;
            XE3[] xe3Arr2 = (XE3[]) arrayList.toArray(xe3Arr);
            for (int i = 0; i < size; i++) {
                XE3 xe3 = xe3Arr2[i];
                switch (((C66020TyI) xfy).A00) {
                    case 0:
                        xe3.DvT(abstractC66024TyM2, z);
                        break;
                    case 1:
                        xe3.DvO(abstractC66024TyM2);
                        break;
                    case 2:
                        xe3.DvN(abstractC66024TyM2);
                        break;
                    case 3:
                        xe3.DvP(abstractC66024TyM2);
                        break;
                    default:
                        xe3.DvR(abstractC66024TyM2);
                        break;
                }
                xe3Arr2[i] = null;
            }
            abstractC66024TyM.A0P = xe3Arr2;
        }
    }

    public final UK8 A05() {
        UK8 uk8 = new UK8(this);
        this.A08 = uk8;
        A0A(uk8);
        return this.A08;
    }

    public final AbstractC66024TyM A07() {
        UK2 uk2 = this.A0A;
        if (uk2 != null) {
            return uk2.A07();
        }
        return this;
    }

    public AbstractC66024TyM A08(View view) {
        this.A0J.add(view);
        return this;
    }

    public AbstractC66024TyM A09(View view) {
        this.A0J.remove(view);
        return this;
    }

    public AbstractC66024TyM A0A(XE3 xe3) {
        ArrayList arrayList = this.A0M;
        if (arrayList == null) {
            arrayList = new ArrayList();
            this.A0M = arrayList;
        }
        arrayList.add(xe3);
        return this;
    }

    public AbstractC66024TyM A0B(XE3 xe3) {
        AbstractC66024TyM abstractC66024TyM;
        ArrayList arrayList = this.A0M;
        if (arrayList != null) {
            if (!arrayList.remove(xe3) && (abstractC66024TyM = this.A09) != null) {
                abstractC66024TyM.A0B(xe3);
            }
            if (this.A0M.size() == 0) {
                this.A0M = null;
            }
        }
        return this;
    }

    public final C66025TyN A0C(View view, boolean z) {
        ArrayList arrayList;
        ArrayList arrayList2;
        UK2 uk2 = this.A0A;
        if (uk2 != null) {
            return uk2.A0C(view, z);
        }
        if (z) {
            arrayList = this.A0H;
        } else {
            arrayList = this.A0G;
        }
        if (arrayList == null) {
            return null;
        }
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            C66025TyN c66025TyN = (C66025TyN) arrayList.get(i);
            if (c66025TyN == null) {
                return null;
            }
            if (c66025TyN.A00 == view) {
                if (i < 0) {
                    return null;
                }
                if (z) {
                    arrayList2 = this.A0G;
                } else {
                    arrayList2 = this.A0H;
                }
                return (C66025TyN) arrayList2.get(i);
            }
        }
        return null;
    }

    public final C66025TyN A0D(View view, boolean z) {
        C66038Tya c66038Tya;
        UK2 uk2 = this.A0A;
        if (uk2 != null) {
            return uk2.A0D(view, z);
        }
        if (z) {
            c66038Tya = this.A0C;
        } else {
            c66038Tya = this.A0B;
        }
        return (C66025TyN) c66038Tya.A02.get(view);
    }

    public String A0E(String str) {
        StringBuilder sb = new StringBuilder(str);
        sb.append(AbstractC31173DnH.A0q(this));
        sb.append("@");
        AbstractC58318PtA.A1T(sb, hashCode());
        sb.append(": ");
        long j = this.A01;
        if (j != -1) {
            sb.append("dur(");
            sb.append(j);
            sb.append(") ");
        }
        long j2 = this.A03;
        if (j2 != -1) {
            sb.append("dly(");
            sb.append(j2);
            sb.append(") ");
        }
        TimeInterpolator timeInterpolator = this.A05;
        if (timeInterpolator != null) {
            sb.append("interp(");
            sb.append(timeInterpolator);
            sb.append(") ");
        }
        ArrayList arrayList = this.A0I;
        if (arrayList.size() > 0 || this.A0J.size() > 0) {
            sb.append("tgts(");
            if (arrayList.size() > 0) {
                for (int i = 0; i < arrayList.size(); i++) {
                    if (i > 0) {
                        sb.append(", ");
                    }
                    sb.append(arrayList.get(i));
                }
            }
            ArrayList arrayList2 = this.A0J;
            if (arrayList2.size() > 0) {
                for (int i2 = 0; i2 < arrayList2.size(); i2++) {
                    if (i2 > 0) {
                        sb.append(", ");
                    }
                    sb.append(arrayList2.get(i2));
                }
            }
            sb.append(")");
        }
        return sb.toString();
    }

    public void A0F() {
        ArrayList arrayList = this.A0F;
        int size = arrayList.size();
        Animator[] animatorArr = (Animator[]) arrayList.toArray(this.A0O);
        this.A0O = A0T;
        while (true) {
            size--;
            if (size >= 0) {
                Animator animator = animatorArr[size];
                animatorArr[size] = null;
                animator.cancel();
            } else {
                this.A0O = animatorArr;
                A04(XFY.A00, this, this, false);
                return;
            }
        }
    }

    public final void A0G() {
        long j;
        if (this instanceof UK2) {
            UK2 uk2 = (UK2) this;
            ((AbstractC66024TyM) uk2).A04 = 0L;
            UK7 uk7 = new UK7(uk2, 0);
            int i = 0;
            while (true) {
                ArrayList arrayList = uk2.A02;
                if (i < arrayList.size()) {
                    AbstractC66024TyM abstractC66024TyM = (AbstractC66024TyM) arrayList.get(i);
                    abstractC66024TyM.A0A(uk7);
                    abstractC66024TyM.A0G();
                    long j2 = abstractC66024TyM.A04;
                    boolean z = uk2.A03;
                    long j3 = ((AbstractC66024TyM) uk2).A04;
                    if (z) {
                        j = Math.max(j3, j2);
                    } else {
                        abstractC66024TyM.A02 = j3;
                        j = j3 + j2;
                    }
                    ((AbstractC66024TyM) uk2).A04 = j;
                    i++;
                } else {
                    return;
                }
            }
        } else {
            C20030yX A01 = A01();
            this.A04 = 0L;
            int i2 = 0;
            while (true) {
                ArrayList arrayList2 = this.A0E;
                if (i2 < arrayList2.size()) {
                    Animator animator = (Animator) arrayList2.get(i2);
                    C68246VJi c68246VJi = (C68246VJi) A01.get(animator);
                    if (animator != null && c68246VJi != null) {
                        long j4 = this.A01;
                        if (j4 >= 0) {
                            c68246VJi.A00.setDuration(j4);
                        }
                        long j5 = this.A03;
                        if (j5 >= 0) {
                            Animator animator2 = c68246VJi.A00;
                            animator2.setStartDelay(j5 + animator2.getStartDelay());
                        }
                        TimeInterpolator timeInterpolator = this.A05;
                        if (timeInterpolator != null) {
                            c68246VJi.A00.setInterpolator(timeInterpolator);
                        }
                        this.A0F.add(animator);
                        this.A04 = Math.max(this.A04, animator.getTotalDuration());
                    }
                    i2++;
                } else {
                    arrayList2.clear();
                    return;
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v2, types: [X.UK4, java.lang.Object, X.XE3] */
    public final void A0H() {
        ArrayList arrayList;
        if (this instanceof UK2) {
            UK2 uk2 = (UK2) this;
            if (uk2.A02.isEmpty()) {
                uk2.A0K();
                uk2.A0J();
                return;
            }
            ?? obj = new Object();
            obj.A00 = uk2;
            Iterator it = uk2.A02.iterator();
            while (it.hasNext()) {
                ((AbstractC66024TyM) it.next()).A0A(obj);
            }
            uk2.A01 = uk2.A02.size();
            if (!uk2.A03) {
                int i = 1;
                while (true) {
                    arrayList = uk2.A02;
                    if (i >= arrayList.size()) {
                        break;
                    }
                    ((AbstractC66024TyM) arrayList.get(i - 1)).A0A(new C66033TyV(1, arrayList.get(i), uk2));
                    i++;
                }
                AbstractC66024TyM abstractC66024TyM = (AbstractC66024TyM) arrayList.get(0);
                if (abstractC66024TyM == null) {
                    return;
                }
                abstractC66024TyM.A0H();
                return;
            }
            Iterator it2 = uk2.A02.iterator();
            while (it2.hasNext()) {
                ((AbstractC66024TyM) it2.next()).A0H();
            }
            return;
        }
        A0K();
        C20030yX A01 = A01();
        Iterator it3 = this.A0E.iterator();
        while (it3.hasNext()) {
            Animator animator = (Animator) it3.next();
            if (A01.containsKey(animator)) {
                A0K();
                if (animator != null) {
                    animator.addListener(new C66300U7y(0, this, A01));
                    long j = this.A01;
                    if (j >= 0) {
                        animator.setDuration(j);
                    }
                    long j2 = this.A03;
                    if (j2 >= 0) {
                        animator.setStartDelay(j2 + animator.getStartDelay());
                    }
                    TimeInterpolator timeInterpolator = this.A05;
                    if (timeInterpolator != null) {
                        animator.setInterpolator(timeInterpolator);
                    }
                    animator.addListener(new U5Q(this, 1));
                    animator.start();
                }
            }
        }
        this.A0E.clear();
        A0J();
    }

    public final void A0I() {
        if (this instanceof UK2) {
            UK2 uk2 = (UK2) this;
            uk2.A00 |= 2;
            int size = uk2.A02.size();
            for (int i = 0; i < size; i++) {
                ((AbstractC66024TyM) uk2.A02.get(i)).A0I();
            }
        }
    }

    public final void A0J() {
        int i = this.A00 - 1;
        this.A00 = i;
        if (i == 0) {
            A04(XFY.A01, this, this, false);
            int i2 = 0;
            while (true) {
                C003501a c003501a = this.A0C.A03;
                if (i2 >= c003501a.A00()) {
                    break;
                }
                View view = (View) c003501a.A04(i2);
                if (view != null) {
                    view.setHasTransientState(false);
                }
                i2++;
            }
            int i3 = 0;
            while (true) {
                C003501a c003501a2 = this.A0B.A03;
                if (i3 < c003501a2.A00()) {
                    View view2 = (View) c003501a2.A04(i3);
                    if (view2 != null) {
                        view2.setHasTransientState(false);
                    }
                    i3++;
                } else {
                    this.A0K = true;
                    return;
                }
            }
        }
    }

    public final void A0K() {
        if (this.A00 == 0) {
            A04(XFY.A04, this, this, false);
            this.A0K = false;
        }
        this.A00++;
    }

    public final void A0L(long j) {
        if (this instanceof UK2) {
            ((UK2) this).A0d(j);
        } else {
            this.A01 = j;
        }
    }

    public final void A0M(long j, long j2) {
        if (this instanceof UK2) {
            UK2 uk2 = (UK2) this;
            long j3 = ((AbstractC66024TyM) uk2).A04;
            if (uk2.A0A != null) {
                if (j >= 0 || j2 >= 0) {
                    if (j > j3 && j2 > j3) {
                        return;
                    }
                } else {
                    return;
                }
            }
            int i = 0;
            boolean A1P = AbstractC25230BEn.A1P((j > j2 ? 1 : (j == j2 ? 0 : -1)));
            if ((j >= 0 && j2 < 0) || (j <= j3 && j2 > j3)) {
                uk2.A0K = false;
                A04(XFY.A04, uk2, uk2, A1P);
            }
            if (!uk2.A03) {
                int i2 = 1;
                while (true) {
                    ArrayList arrayList = uk2.A02;
                    if (i2 < arrayList.size()) {
                        if (((AbstractC66024TyM) arrayList.get(i2)).A02 > j2) {
                            break;
                        } else {
                            i2++;
                        }
                    } else {
                        i2 = arrayList.size();
                        break;
                    }
                }
                int i3 = i2 - 1;
                if (j < j2) {
                    while (i3 >= 0) {
                        AbstractC66024TyM abstractC66024TyM = (AbstractC66024TyM) uk2.A02.get(i3);
                        long j4 = abstractC66024TyM.A02;
                        long j5 = j - j4;
                        abstractC66024TyM.A0M(j5, j2 - j4);
                        if (j5 >= 0) {
                            break;
                        } else {
                            i3--;
                        }
                    }
                } else {
                    while (true) {
                        ArrayList arrayList2 = uk2.A02;
                        if (i3 >= arrayList2.size()) {
                            break;
                        }
                        AbstractC66024TyM abstractC66024TyM2 = (AbstractC66024TyM) arrayList2.get(i3);
                        long j6 = abstractC66024TyM2.A02;
                        long j7 = j - j6;
                        if (j7 < 0) {
                            break;
                        }
                        abstractC66024TyM2.A0M(j7, j2 - j6);
                        i3++;
                    }
                }
            } else {
                while (true) {
                    ArrayList arrayList3 = uk2.A02;
                    if (i >= arrayList3.size()) {
                        break;
                    }
                    ((AbstractC66024TyM) arrayList3.get(i)).A0M(j, j2);
                    i++;
                }
            }
            if (uk2.A0A == null) {
                return;
            }
            if ((j <= j3 || j2 > j3) && (j >= 0 || j2 < 0)) {
                return;
            }
            if (j > j3) {
                uk2.A0K = true;
            }
            A04(XFY.A01, uk2, uk2, A1P);
            return;
        }
        long j8 = this.A04;
        boolean A1P2 = AbstractC25230BEn.A1P((j > j2 ? 1 : (j == j2 ? 0 : -1)));
        if ((j2 < 0 && j >= 0) || (j2 > j8 && j <= j8)) {
            this.A0K = false;
            A04(XFY.A04, this, this, A1P2);
        }
        ArrayList arrayList4 = this.A0F;
        int size = arrayList4.size();
        Animator[] animatorArr = (Animator[]) arrayList4.toArray(this.A0O);
        this.A0O = A0T;
        for (int i4 = 0; i4 < size; i4++) {
            Animator animator = animatorArr[i4];
            animatorArr[i4] = null;
            ((AnimatorSet) animator).setCurrentPlayTime(Math.min(Math.max(0L, j), animator.getTotalDuration()));
        }
        this.A0O = animatorArr;
        if ((j <= j8 || j2 > j8) && (j >= 0 || j2 < 0)) {
            return;
        }
        if (j > j8) {
            this.A0K = true;
        }
        A04(XFY.A01, this, this, A1P2);
    }

    public final void A0N(TimeInterpolator timeInterpolator) {
        if (this instanceof UK2) {
            UK2 uk2 = (UK2) this;
            uk2.A00 |= 1;
            ArrayList arrayList = uk2.A02;
            if (arrayList != null) {
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    ((AbstractC66024TyM) uk2.A02.get(i)).A0N(timeInterpolator);
                }
            }
            uk2.A05 = timeInterpolator;
            return;
        }
        this.A05 = timeInterpolator;
    }

    public void A0O(View view) {
        if (!this.A0K) {
            ArrayList arrayList = this.A0F;
            int size = arrayList.size();
            Animator[] animatorArr = (Animator[]) arrayList.toArray(this.A0O);
            this.A0O = A0T;
            for (int i = size - 1; i >= 0; i--) {
                Animator animator = animatorArr[i];
                animatorArr[i] = null;
                animator.pause();
            }
            this.A0O = animatorArr;
            A04(XFY.A02, this, this, false);
            this.A0N = true;
        }
    }

    public void A0P(View view) {
        if (this.A0N) {
            if (!this.A0K) {
                ArrayList arrayList = this.A0F;
                int size = arrayList.size();
                Animator[] animatorArr = (Animator[]) arrayList.toArray(this.A0O);
                this.A0O = A0T;
                while (true) {
                    size--;
                    if (size < 0) {
                        break;
                    }
                    Animator animator = animatorArr[size];
                    animatorArr[size] = null;
                    animator.resume();
                }
                this.A0O = animatorArr;
                A04(XFY.A03, this, this, false);
            }
            this.A0N = false;
        }
    }

    public final void A0R(ViewGroup viewGroup) {
        C68246VJi c68246VJi;
        C66025TyN c66025TyN;
        View view;
        View view2;
        View view3;
        this.A0H = new ArrayList();
        this.A0G = new ArrayList();
        C66038Tya c66038Tya = this.A0C;
        C66038Tya c66038Tya2 = this.A0B;
        C20030yX c20030yX = c66038Tya.A02;
        C005001p c005001p = new C005001p(0);
        c005001p.A09(c20030yX);
        C20030yX c20030yX2 = c66038Tya2.A02;
        C005001p c005001p2 = new C005001p(0);
        c005001p2.A09(c20030yX2);
        int i = 0;
        while (true) {
            int[] iArr = this.A0L;
            if (i >= iArr.length) {
                break;
            }
            int i2 = iArr[i];
            if (i2 != 1) {
                if (i2 != 2) {
                    if (i2 != 3) {
                        if (i2 == 4) {
                            C003501a c003501a = c66038Tya.A03;
                            C003501a c003501a2 = c66038Tya2.A03;
                            int A00 = c003501a.A00();
                            for (int i3 = 0; i3 < A00; i3++) {
                                View view4 = (View) c003501a.A04(i3);
                                if (view4 != null && A0b(view4) && (view3 = (View) c003501a2.A05(c003501a.A02(i3))) != null && A0b(view3)) {
                                    Object obj = c005001p.get(view4);
                                    Object obj2 = c005001p2.get(view3);
                                    if (obj != null && obj2 != null) {
                                        this.A0H.add(obj);
                                        this.A0G.add(obj2);
                                        c005001p.remove(view4);
                                        c005001p2.remove(view3);
                                    }
                                }
                            }
                        }
                    } else {
                        SparseArray sparseArray = c66038Tya.A00;
                        SparseArray sparseArray2 = c66038Tya2.A00;
                        int size = sparseArray.size();
                        for (int i4 = 0; i4 < size; i4++) {
                            View view5 = (View) sparseArray.valueAt(i4);
                            if (view5 != null && A0b(view5) && (view2 = (View) sparseArray2.get(sparseArray.keyAt(i4))) != null && A0b(view2)) {
                                Object obj3 = c005001p.get(view5);
                                Object obj4 = c005001p2.get(view2);
                                if (obj3 != null && obj4 != null) {
                                    this.A0H.add(obj3);
                                    this.A0G.add(obj4);
                                    c005001p.remove(view5);
                                    c005001p2.remove(view2);
                                }
                            }
                        }
                    }
                } else {
                    C20030yX c20030yX3 = c66038Tya.A01;
                    C20030yX c20030yX4 = c66038Tya2.A01;
                    int size2 = c20030yX3.size();
                    for (int i5 = 0; i5 < size2; i5++) {
                        View view6 = (View) c20030yX3.A06(i5);
                        if (view6 != null && A0b(view6) && (view = (View) c20030yX4.get(c20030yX3.A05(i5))) != null && A0b(view)) {
                            Object obj5 = c005001p.get(view6);
                            Object obj6 = c005001p2.get(view);
                            if (obj5 != null && obj6 != null) {
                                this.A0H.add(obj5);
                                this.A0G.add(obj6);
                                c005001p.remove(view6);
                                c005001p2.remove(view);
                            }
                        }
                    }
                }
            } else {
                int size3 = c005001p.size();
                while (true) {
                    size3--;
                    if (size3 >= 0) {
                        View view7 = (View) c005001p.A05(size3);
                        if (view7 != null && A0b(view7) && (c66025TyN = (C66025TyN) c005001p2.remove(view7)) != null && A0b(c66025TyN.A00)) {
                            this.A0H.add(c005001p.A04(size3));
                            this.A0G.add(c66025TyN);
                        }
                    }
                }
            }
            i++;
        }
        for (int i6 = 0; i6 < c005001p.size(); i6++) {
            C66025TyN c66025TyN2 = (C66025TyN) c005001p.A06(i6);
            if (A0b(c66025TyN2.A00)) {
                this.A0H.add(c66025TyN2);
                this.A0G.add(null);
            }
        }
        for (int i7 = 0; i7 < c005001p2.size(); i7++) {
            C66025TyN c66025TyN3 = (C66025TyN) c005001p2.A06(i7);
            if (A0b(c66025TyN3.A00)) {
                this.A0G.add(c66025TyN3);
                this.A0H.add(null);
            }
        }
        C20030yX A01 = A01();
        int size4 = A01.size();
        WindowId windowId = viewGroup.getWindowId();
        for (int i8 = size4 - 1; i8 >= 0; i8--) {
            Animator animator = (Animator) A01.A05(i8);
            if (animator != null && (c68246VJi = (C68246VJi) A01.get(animator)) != null && c68246VJi.A01 != null && windowId.equals(c68246VJi.A02)) {
                C66025TyN c66025TyN4 = c68246VJi.A04;
                View view8 = c68246VJi.A01;
                C66025TyN A0D = A0D(view8, true);
                C66025TyN A0C = A0C(view8, true);
                if ((A0D != null || A0C != null || (A0C = (C66025TyN) this.A0B.A02.get(view8)) != null) && c68246VJi.A03.A0c(c66025TyN4, A0C)) {
                    AbstractC66024TyM abstractC66024TyM = c68246VJi.A03;
                    if (abstractC66024TyM.A07().A08 != null) {
                        animator.cancel();
                        ArrayList arrayList = abstractC66024TyM.A0F;
                        arrayList.remove(animator);
                        A01.remove(animator);
                        if (arrayList.size() == 0) {
                            A04(XFY.A00, abstractC66024TyM, abstractC66024TyM, false);
                            if (!abstractC66024TyM.A0K) {
                                abstractC66024TyM.A0K = true;
                                A04(XFY.A01, abstractC66024TyM, abstractC66024TyM, false);
                            }
                        }
                    } else if (!animator.isRunning() && !animator.isStarted()) {
                        A01.remove(animator);
                    } else {
                        animator.cancel();
                    }
                }
            }
        }
        A0S(viewGroup, this.A0C, this.A0B, this.A0H, this.A0G);
        if (this.A08 == null) {
            A0H();
        } else {
            if (Build.VERSION.SDK_INT < 34) {
                return;
            }
            A0G();
            this.A08.A02();
            this.A08.A03();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:49:0x0104, code lost:
    
        if (r10 != r9) goto L50;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:103:0x04bd  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x009b A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0221  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0153  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x016b  */
    /* JADX WARN: Type inference failed for: r1v31, types: [X.VJi, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r27v0, types: [X.0yX, X.01p] */
    /* JADX WARN: Type inference failed for: r2v16, types: [android.animation.ObjectAnimator, android.animation.Animator] */
    /* JADX WARN: Type inference failed for: r2v26, types: [android.animation.AnimatorSet] */
    /* JADX WARN: Type inference failed for: r2v36, types: [android.animation.AnimatorSet, android.animation.Animator] */
    /* JADX WARN: Type inference failed for: r9v3, types: [X.U88, android.animation.Animator$AnimatorPauseListener, android.animation.Animator$AnimatorListener] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A0S(android.view.ViewGroup r43, X.C66038Tya r44, X.C66038Tya r45, java.util.ArrayList r46, java.util.ArrayList r47) {
        /*
            Method dump skipped, instructions count: 1314
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC66024TyM.A0S(android.view.ViewGroup, X.Tya, X.Tya, java.util.ArrayList, java.util.ArrayList):void");
    }

    public final void A0T(ViewGroup viewGroup, boolean z) {
        C66038Tya c66038Tya;
        C66038Tya c66038Tya2;
        C66038Tya c66038Tya3;
        if (z) {
            this.A0C.A02.clear();
            this.A0C.A00.clear();
            c66038Tya = this.A0C;
        } else {
            this.A0B.A02.clear();
            this.A0B.A00.clear();
            c66038Tya = this.A0B;
        }
        c66038Tya.A03.A07();
        ArrayList arrayList = this.A0I;
        if (arrayList.size() <= 0 && this.A0J.size() <= 0) {
            A03(viewGroup, z);
            return;
        }
        for (int i = 0; i < arrayList.size(); i++) {
            View findViewById = viewGroup.findViewById(((Number) arrayList.get(i)).intValue());
            if (findViewById != null) {
                C66025TyN c66025TyN = new C66025TyN(findViewById);
                if (z) {
                    A0Y(c66025TyN);
                } else {
                    A0W(c66025TyN);
                }
                c66025TyN.A01.add(this);
                A0X(c66025TyN);
                if (z) {
                    c66038Tya3 = this.A0C;
                } else {
                    c66038Tya3 = this.A0B;
                }
                A02(findViewById, c66025TyN, c66038Tya3);
            }
        }
        int i2 = 0;
        while (true) {
            ArrayList arrayList2 = this.A0J;
            if (i2 >= arrayList2.size()) {
                return;
            }
            View view = (View) arrayList2.get(i2);
            C66025TyN c66025TyN2 = new C66025TyN(view);
            if (z) {
                A0Y(c66025TyN2);
            } else {
                A0W(c66025TyN2);
            }
            c66025TyN2.A01.add(this);
            A0X(c66025TyN2);
            if (z) {
                c66038Tya2 = this.A0C;
            } else {
                c66038Tya2 = this.A0B;
            }
            A02(view, c66025TyN2, c66038Tya2);
            i2++;
        }
    }

    public void A0U(C68269VKg c68269VKg) {
        if (c68269VKg == null) {
            c68269VKg = A0R;
        }
        this.A06 = c68269VKg;
    }

    public final void A0V(VIL vil) {
        if (this instanceof UK2) {
            UK2 uk2 = (UK2) this;
            uk2.A07 = vil;
            uk2.A00 |= 8;
            int size = uk2.A02.size();
            for (int i = 0; i < size; i++) {
                ((AbstractC66024TyM) uk2.A02.get(i)).A0V(vil);
            }
            return;
        }
        this.A07 = vil;
    }

    public final void A0W(C66025TyN c66025TyN) {
        if (this instanceof UK3) {
            UK3.A01(c66025TyN);
            return;
        }
        if (this instanceof UK2) {
            UK2 uk2 = (UK2) this;
            View view = c66025TyN.A00;
            if (!uk2.A0b(view)) {
                return;
            }
            Iterator it = uk2.A02.iterator();
            while (it.hasNext()) {
                AbstractC66024TyM abstractC66024TyM = (AbstractC66024TyM) it.next();
                if (abstractC66024TyM.A0b(view)) {
                    abstractC66024TyM.A0W(c66025TyN);
                    c66025TyN.A01.add(abstractC66024TyM);
                }
            }
            return;
        }
        C66023TyL.A00(c66025TyN);
    }

    public final void A0X(C66025TyN c66025TyN) {
        if (this instanceof UK2) {
            UK2 uk2 = (UK2) this;
            int size = uk2.A02.size();
            for (int i = 0; i < size; i++) {
                ((AbstractC66024TyM) uk2.A02.get(i)).A0X(c66025TyN);
            }
        }
    }

    public final void A0Y(C66025TyN c66025TyN) {
        float f;
        if (this instanceof UK3) {
            UK3.A01(c66025TyN);
            View view = c66025TyN.A00;
            Object tag = view.getTag(R.id.transition_pause_alpha);
            if (tag == null) {
                if (view.getVisibility() == 0) {
                    f = VZP.A02.A00(view);
                } else {
                    f = 0.0f;
                }
                tag = Float.valueOf(f);
            }
            c66025TyN.A02.put("android:fade:transitionAlpha", tag);
            return;
        }
        if (this instanceof UK2) {
            UK2 uk2 = (UK2) this;
            View view2 = c66025TyN.A00;
            if (!uk2.A0b(view2)) {
                return;
            }
            Iterator it = uk2.A02.iterator();
            while (it.hasNext()) {
                AbstractC66024TyM abstractC66024TyM = (AbstractC66024TyM) it.next();
                if (abstractC66024TyM.A0b(view2)) {
                    abstractC66024TyM.A0Y(c66025TyN);
                    c66025TyN.A01.add(abstractC66024TyM);
                }
            }
            return;
        }
        C66023TyL.A00(c66025TyN);
    }

    public final boolean A0Z() {
        if (this instanceof UK2) {
            UK2 uk2 = (UK2) this;
            int i = 0;
            while (true) {
                ArrayList arrayList = uk2.A02;
                if (i >= arrayList.size()) {
                    return false;
                }
                if (((AbstractC66024TyM) arrayList.get(i)).A0Z()) {
                    return true;
                }
                i++;
            }
        } else {
            return !this.A0F.isEmpty();
        }
    }

    public final boolean A0a() {
        if (this instanceof UK2) {
            ArrayList arrayList = ((UK2) this).A02;
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                if (!((AbstractC66024TyM) arrayList.get(i)).A0a()) {
                    return false;
                }
            }
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0007, code lost:
    
        if (r9 == null) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean A0c(X.C66025TyN r8, X.C66025TyN r9) {
        /*
            r7 = this;
            boolean r0 = r7 instanceof X.UK3
            r6 = 0
            if (r0 == 0) goto L1d
            if (r8 != 0) goto La
            if (r9 != 0) goto L75
        L9:
            return r6
        La:
            if (r9 == 0) goto L75
            java.util.Map r0 = r9.A02
            java.lang.String r2 = "android:visibility:visibility"
            boolean r1 = r0.containsKey(r2)
            java.util.Map r0 = r8.A02
            boolean r0 = r0.containsKey(r2)
            if (r1 == r0) goto L75
            return r6
        L1d:
            if (r8 == 0) goto L9
            if (r9 == 0) goto L9
            boolean r0 = r7 instanceof X.C66023TyL
            if (r0 == 0) goto L4b
            java.lang.String[] r5 = X.C66023TyL.A05
            r4 = 5
            r3 = 0
        L29:
            r2 = r5[r3]
            java.util.Map r0 = r8.A02
            java.lang.Object r1 = r0.get(r2)
            java.util.Map r0 = r9.A02
            java.lang.Object r0 = r0.get(r2)
            if (r1 != 0) goto L40
            if (r0 != 0) goto L85
        L3b:
            int r3 = r3 + 1
            if (r3 >= r4) goto L9
            goto L29
        L40:
            if (r0 == 0) goto L85
            boolean r0 = r1.equals(r0)
            r0 = r0 ^ 1
            if (r0 == 0) goto L3b
            goto L85
        L4b:
            java.util.Map r4 = r8.A02
            java.util.Iterator r3 = X.AbstractC43593JPy.A12(r4)
        L51:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L9
            java.lang.Object r2 = r3.next()
            java.lang.Object r1 = r4.get(r2)
            java.util.Map r0 = r9.A02
            java.lang.Object r0 = r0.get(r2)
            if (r1 != 0) goto L6a
            if (r0 != 0) goto L85
            goto L51
        L6a:
            if (r0 == 0) goto L85
            boolean r0 = r1.equals(r0)
            r0 = r0 ^ 1
            if (r0 == 0) goto L51
            goto L85
        L75:
            X.VlS r1 = X.UK3.A00(r8, r9)
            boolean r0 = r1.A05
            if (r0 == 0) goto L9
            int r0 = r1.A01
            if (r0 == 0) goto L85
            int r0 = r1.A00
            if (r0 != 0) goto L9
        L85:
            r6 = 1
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC66024TyM.A0c(X.TyN, X.TyN):boolean");
    }

    public final String toString() {
        return A0E("");
    }

    /* renamed from: A06, reason: merged with bridge method [inline-methods] */
    public AbstractC66024TyM clone() {
        try {
            AbstractC66024TyM abstractC66024TyM = (AbstractC66024TyM) super.clone();
            abstractC66024TyM.A0E = new ArrayList();
            abstractC66024TyM.A0C = new C66038Tya();
            abstractC66024TyM.A0B = new C66038Tya();
            abstractC66024TyM.A0H = null;
            abstractC66024TyM.A0G = null;
            abstractC66024TyM.A08 = null;
            abstractC66024TyM.A09 = this;
            abstractC66024TyM.A0M = null;
            return abstractC66024TyM;
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }

    public void A0Q(ViewGroup viewGroup) {
        C20030yX A01 = A01();
        int size = A01.size();
        if (size != 0) {
            WindowId windowId = viewGroup.getWindowId();
            C005001p c005001p = new C005001p(0);
            c005001p.A09(A01);
            A01.clear();
            while (true) {
                size--;
                if (size >= 0) {
                    C68246VJi c68246VJi = (C68246VJi) c005001p.A06(size);
                    if (c68246VJi.A01 != null && windowId.equals(c68246VJi.A02)) {
                        ((Animator) c005001p.A05(size)).end();
                    }
                } else {
                    return;
                }
            }
        }
    }

    public final boolean A0b(View view) {
        int id = view.getId();
        ArrayList arrayList = this.A0I;
        if ((arrayList.size() != 0 || this.A0J.size() != 0) && !arrayList.contains(Integer.valueOf(id)) && !this.A0J.contains(view)) {
            return false;
        }
        return true;
    }
}
