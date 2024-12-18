package X;

import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcelable;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.BackStackRecordState;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentContainerView;
import androidx.fragment.app.FragmentManagerState;
import androidx.fragment.app.FragmentState;
import com.facebook.R;
import com.facebook.react.views.textinput.ReactTextInputManager;
import com.instagram.react.modules.product.IgReactPurchaseExperienceBridgeModule;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.0h2, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC10360h2 {
    public C00M A01;
    public C00X A02;
    public C00X A03;
    public C00X A04;
    public Fragment A06;
    public Fragment A07;
    public AnonymousClass067 A08;
    public AbstractC10920i8 A0A;
    public C06X A0B;
    public boolean A0G;
    public boolean A0H;
    public boolean A0I;
    public boolean A0J;
    public ArrayList A0M;
    public ArrayList A0N;
    public ArrayList A0O;
    public ArrayList A0P;
    public boolean A0Q;
    public boolean mExecutingActions;
    public final ArrayList A0V = new ArrayList();
    public final C016306g A0U = new C016306g();
    public ArrayList A0E = new ArrayList();
    public final C06E A0S = new C06E(this);
    public C14240no A05 = null;
    public final C00H A0R = new C00H() { // from class: X.0hl
        {
            super(false);
        }

        @Override // X.C00H
        public final void A00() {
            AbstractC10360h2.A0H(3);
            final AbstractC10360h2 abstractC10360h2 = AbstractC10360h2.this;
            C14240no c14240no = abstractC10360h2.A05;
            if (c14240no != null) {
                c14240no.A01 = false;
                Runnable runnable = new Runnable() { // from class: X.06H
                    @Override // java.lang.Runnable
                    public final void run() {
                        Iterator it = AbstractC10360h2.this.A0F.iterator();
                        while (it.hasNext()) {
                            it.next();
                        }
                    }
                };
                ArrayList arrayList = c14240no.A0A;
                if (arrayList == null) {
                    arrayList = new ArrayList();
                    c14240no.A0A = arrayList;
                }
                arrayList.add(runnable);
                c14240no.A0J(false);
                abstractC10360h2.A0Z();
            }
            abstractC10360h2.A05 = null;
        }

        @Override // X.C00H
        public final void A01() {
            AbstractC10360h2.A0H(3);
            AbstractC10360h2 abstractC10360h2 = AbstractC10360h2.this;
            abstractC10360h2.A10(true);
            C14240no c14240no = abstractC10360h2.A05;
            if (c14240no != null) {
                ArrayList arrayList = abstractC10360h2.A0F;
                if (!arrayList.isEmpty()) {
                    LinkedHashSet linkedHashSet = new LinkedHashSet(AbstractC10360h2.A04(c14240no));
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        it.next();
                        Iterator it2 = linkedHashSet.iterator();
                        while (it2.hasNext()) {
                            it2.next();
                        }
                    }
                }
                Iterator it3 = abstractC10360h2.A05.A0B.iterator();
                while (it3.hasNext()) {
                    Fragment fragment = ((C06l) it3.next()).A05;
                    if (fragment != null) {
                        fragment.mTransitioning = false;
                    }
                }
                Iterator it4 = abstractC10360h2.A0W(new ArrayList(Collections.singletonList(abstractC10360h2.A05)), 0, 1).iterator();
                while (it4.hasNext()) {
                    C07A c07a = (C07A) it4.next();
                    AbstractC10360h2.A0H(3);
                    List list = c07a.A04;
                    C07A.A05(c07a, list);
                    c07a.A0A(list);
                }
                Iterator it5 = abstractC10360h2.A05.A0B.iterator();
                while (it5.hasNext()) {
                    Fragment fragment2 = ((C06l) it5.next()).A05;
                    if (fragment2 != null && fragment2.mContainer == null) {
                        abstractC10360h2.A0U(fragment2).A03();
                    }
                }
                abstractC10360h2.A05 = null;
                AbstractC10360h2.A0B(abstractC10360h2);
                AbstractC10360h2.A0H(3);
                return;
            }
            boolean z = abstractC10360h2.A0R.A01;
            AbstractC10360h2.A0H(3);
            if (z) {
                abstractC10360h2.A12();
            } else {
                abstractC10360h2.A01.A04();
            }
        }

        @Override // X.C00H
        public final void A02(AnonymousClass002 anonymousClass002) {
            AbstractC10360h2.A0H(2);
            AbstractC10360h2 abstractC10360h2 = AbstractC10360h2.this;
            C14240no c14240no = abstractC10360h2.A05;
            if (c14240no != null) {
                Iterator it = abstractC10360h2.A0W(new ArrayList(Collections.singletonList(c14240no)), 0, 1).iterator();
                while (it.hasNext()) {
                    C07A c07a = (C07A) it.next();
                    AbstractC10360h2.A0H(2);
                    List list = c07a.A04;
                    ArrayList arrayList = new ArrayList();
                    Iterator it2 = list.iterator();
                    while (it2.hasNext()) {
                        AnonymousClass016.A16(((C10300gw) it2.next()).A0B, arrayList);
                    }
                    List A0a = AbstractC001800i.A0a(AbstractC001800i.A0k(arrayList));
                    int size = A0a.size();
                    for (int i = 0; i < size; i++) {
                        ((AnonymousClass073) A0a.get(i)).A06(c07a.A02, anonymousClass002);
                    }
                }
                Iterator it3 = abstractC10360h2.A0F.iterator();
                while (it3.hasNext()) {
                    it3.next();
                }
            }
        }

        @Override // X.C00H
        public final void A03(AnonymousClass002 anonymousClass002) {
            AbstractC10360h2.A0H(3);
            final AbstractC10360h2 abstractC10360h2 = AbstractC10360h2.this;
            AbstractC10360h2.A0A(abstractC10360h2);
            abstractC10360h2.A0s(new C06O() { // from class: X.0hI
                @Override // X.C06O
                public final boolean AWw(ArrayList arrayList, ArrayList arrayList2) {
                    boolean A19;
                    AbstractC10360h2 abstractC10360h22 = AbstractC10360h2.this;
                    AbstractC10360h2.A0H(2);
                    ArrayList arrayList3 = abstractC10360h22.A0E;
                    if (arrayList3.isEmpty()) {
                        A19 = false;
                    } else {
                        C14240no c14240no = (C14240no) arrayList3.get(arrayList3.size() - 1);
                        abstractC10360h22.A05 = c14240no;
                        Iterator it = c14240no.A0B.iterator();
                        while (it.hasNext()) {
                            Fragment fragment = ((C06l) it.next()).A05;
                            if (fragment != null) {
                                fragment.mTransitioning = true;
                            }
                        }
                        A19 = abstractC10360h22.A19(null, arrayList, arrayList2, -1, 0);
                    }
                    ArrayList arrayList4 = abstractC10360h22.A0F;
                    if (!arrayList4.isEmpty() && arrayList.size() > 0) {
                        arrayList2.get(arrayList.size() - 1);
                        LinkedHashSet linkedHashSet = new LinkedHashSet();
                        Iterator it2 = arrayList.iterator();
                        while (it2.hasNext()) {
                            linkedHashSet.addAll(AbstractC10360h2.A04((C14240no) it2.next()));
                        }
                        Iterator it3 = arrayList4.iterator();
                        while (it3.hasNext()) {
                            it3.next();
                            Iterator it4 = linkedHashSet.iterator();
                            while (it4.hasNext()) {
                                it4.next();
                            }
                        }
                    }
                    return A19;
                }
            }, false);
        }
    };
    public final AtomicInteger A0a = new AtomicInteger();
    public final Map A0W = Collections.synchronizedMap(new HashMap());
    public final Map A0Y = Collections.synchronizedMap(new HashMap());
    public final Map A0X = Collections.synchronizedMap(new HashMap());
    public ArrayList A0F = new ArrayList();
    public final C06G A0T = new C06G(this);
    public final CopyOnWriteArrayList A0Z = new CopyOnWriteArrayList();
    public final C02N A0b = new C02N() { // from class: X.0hs
        @Override // X.C02N
        public final void accept(Object obj) {
            AbstractC10360h2 abstractC10360h2 = AbstractC10360h2.this;
            Configuration configuration = (Configuration) obj;
            if (AbstractC10360h2.A0J(abstractC10360h2)) {
                for (Fragment fragment : abstractC10360h2.A0U.A04()) {
                    if (fragment != null) {
                        fragment.onConfigurationChanged(configuration);
                    }
                }
            }
        }
    };
    public final C02N A0e = new C02N() { // from class: X.0hr
        @Override // X.C02N
        public final void accept(Object obj) {
            AbstractC10360h2 abstractC10360h2 = AbstractC10360h2.this;
            Number number = (Number) obj;
            if (AbstractC10360h2.A0J(abstractC10360h2) && number.intValue() == 80) {
                for (Fragment fragment : abstractC10360h2.A0U.A04()) {
                    if (fragment != null) {
                        fragment.onLowMemory();
                    }
                }
            }
        }
    };
    public final C02N A0c = new C02N() { // from class: X.0hp
        @Override // X.C02N
        public final void accept(Object obj) {
            AbstractC10360h2 abstractC10360h2 = AbstractC10360h2.this;
            if (AbstractC10360h2.A0J(abstractC10360h2)) {
                Iterator it = abstractC10360h2.A0U.A04().iterator();
                while (it.hasNext()) {
                    it.next();
                }
            }
        }
    };
    public final C02N A0d = new C02N() { // from class: X.0ho
        @Override // X.C02N
        public final void accept(Object obj) {
            AbstractC10360h2 abstractC10360h2 = AbstractC10360h2.this;
            if (AbstractC10360h2.A0J(abstractC10360h2)) {
                Iterator it = abstractC10360h2.A0U.A04().iterator();
                while (it.hasNext()) {
                    it.next();
                }
            }
        }
    };
    public final C03F A0f = new C10750hj(this);
    public int A00 = -1;
    public C06B A09 = null;
    public C06B A0K = new C06B() { // from class: X.0hi
        @Override // X.C06B
        public final Fragment A01(ClassLoader classLoader, String str) {
            return Fragment.instantiate(AbstractC10360h2.this.A0A.A01, str, null);
        }
    };
    public C07B A0L = new C07B() { // from class: X.0hh
    };
    public ArrayDeque A0D = new ArrayDeque();
    public Runnable A0C = new Runnable() { // from class: X.06I
        @Override // java.lang.Runnable
        public final void run() {
            AbstractC10360h2.this.A10(true);
        }
    };

    public static Fragment A02(View view) {
        Fragment fragment;
        while (view != null) {
            Object tag = view.getTag(R.id.fragment_container_view_tag);
            if ((tag instanceof Fragment) && (fragment = (Fragment) tag) != null) {
                return fragment;
            }
            Object parent = view.getParent();
            if (parent instanceof View) {
                view = (View) parent;
            } else {
                view = null;
            }
        }
        return null;
    }

    private void A05() {
        this.mExecutingActions = false;
        this.A0O.clear();
        this.A0P.clear();
    }

    public static void A0C(AbstractC10360h2 abstractC10360h2, int i) {
        try {
            abstractC10360h2.mExecutingActions = true;
            for (C016206f c016206f : abstractC10360h2.A0U.A02.values()) {
                if (c016206f != null) {
                    c016206f.A00 = i;
                }
            }
            abstractC10360h2.A0e(i, false);
            Iterator it = abstractC10360h2.A03().iterator();
            while (it.hasNext()) {
                ((C07A) it.next()).A07();
            }
            abstractC10360h2.mExecutingActions = false;
            abstractC10360h2.A10(true);
        } catch (Throwable th) {
            abstractC10360h2.mExecutingActions = false;
            throw th;
        }
    }

    private boolean A0K(String str, int i, int i2) {
        A10(false);
        A0G(true);
        Fragment fragment = this.A07;
        if (fragment != null && i < 0 && str == null && fragment.getChildFragmentManager().A12()) {
            return true;
        }
        ArrayList arrayList = this.A0P;
        ArrayList arrayList2 = this.A0O;
        boolean A19 = A19(str, arrayList, arrayList2, i, i2);
        if (A19) {
            this.mExecutingActions = true;
            try {
                A0E(arrayList, arrayList2);
            } finally {
                A05();
            }
        }
        A0B(this);
        A06();
        this.A0U.A02.values().removeAll(Collections.singleton(null));
        return A19;
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0015, code lost:
    
        if (r0 != false) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A0X() {
        /*
            r5 = this;
            r0 = 1
            r5.A0G = r0
            r5.A10(r0)
            A0A(r5)
            X.0i8 r1 = r5.A0A
            boolean r0 = r1 instanceof X.InterfaceC018407e
            if (r0 == 0) goto L48
            X.06g r0 = r5.A0U
            X.06X r0 = r0.A00
            boolean r0 = r0.A00
        L15:
            if (r0 == 0) goto L57
        L17:
            java.util.Map r0 = r5.A0W
            java.util.Collection r0 = r0.values()
            java.util.Iterator r4 = r0.iterator()
        L21:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L57
            java.lang.Object r0 = r4.next()
            androidx.fragment.app.BackStackState r0 = (androidx.fragment.app.BackStackState) r0
            java.util.List r0 = r0.A00
            java.util.Iterator r3 = r0.iterator()
        L33:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L21
            java.lang.Object r2 = r3.next()
            java.lang.String r2 = (java.lang.String) r2
            X.06g r0 = r5.A0U
            X.06X r1 = r0.A00
            r0 = 0
            r1.A02(r2, r0)
            goto L33
        L48:
            android.content.Context r1 = r1.A01
            boolean r0 = r1 instanceof android.app.Activity
            if (r0 == 0) goto L17
            android.app.Activity r1 = (android.app.Activity) r1
            boolean r0 = r1.isChangingConfigurations()
            r0 = r0 ^ 1
            goto L15
        L57:
            r0 = -1
            A0C(r5, r0)
            X.0i8 r1 = r5.A0A
            boolean r0 = r1 instanceof X.C1UC
            if (r0 == 0) goto L68
            X.1UC r1 = (X.C1UC) r1
            X.02N r0 = r5.A0e
            r1.removeOnTrimMemoryListener(r0)
        L68:
            X.0i8 r1 = r5.A0A
            boolean r0 = r1 instanceof X.C1U9
            if (r0 == 0) goto L75
            X.1U9 r1 = (X.C1U9) r1
            X.02N r0 = r5.A0b
            r1.removeOnConfigurationChangedListener(r0)
        L75:
            X.0i8 r1 = r5.A0A
            boolean r0 = r1 instanceof X.C1UA
            if (r0 == 0) goto L82
            X.1UA r1 = (X.C1UA) r1
            X.02N r0 = r5.A0c
            r1.removeOnMultiWindowModeChangedListener(r0)
        L82:
            X.0i8 r1 = r5.A0A
            boolean r0 = r1 instanceof X.C1UB
            if (r0 == 0) goto L8f
            X.1UB r1 = (X.C1UB) r1
            X.02N r0 = r5.A0d
            r1.removeOnPictureInPictureModeChangedListener(r0)
        L8f:
            X.0i8 r1 = r5.A0A
            boolean r0 = r1 instanceof X.AnonymousClass036
            if (r0 == 0) goto La0
            androidx.fragment.app.Fragment r0 = r5.A06
            if (r0 != 0) goto La0
            X.036 r1 = (X.AnonymousClass036) r1
            X.03F r0 = r5.A0f
            r1.removeMenuProvider(r0)
        La0:
            r2 = 0
            r5.A0A = r2
            r5.A08 = r2
            r5.A06 = r2
            X.00M r0 = r5.A01
            if (r0 == 0) goto Lc5
            X.00H r0 = r5.A0R
            java.util.concurrent.CopyOnWriteArrayList r0 = r0.A02
            java.util.Iterator r1 = r0.iterator()
        Lb3:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto Lc3
            java.lang.Object r0 = r1.next()
            X.003 r0 = (X.AnonymousClass003) r0
            r0.cancel()
            goto Lb3
        Lc3:
            r5.A01 = r2
        Lc5:
            X.00X r0 = r5.A03
            if (r0 == 0) goto Ld6
            r0.A00()
            X.00X r0 = r5.A04
            r0.A00()
            X.00X r0 = r5.A02
            r0.A00()
        Ld6:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC10360h2.A0X():void");
    }

    public final void A0Z() {
        A10(true);
        A07();
    }

    public final void A0b() {
        A0s(new C10620hW(this, null, -1, 0), false);
    }

    public final void A0c(int i) {
        if (i >= 0) {
            A0K(null, i, 1);
            return;
        }
        throw new IllegalArgumentException(AnonymousClass001.A0O("Bad id: ", i));
    }

    public final void A0i(Fragment fragment) {
        A0H(2);
        if (fragment.mDetached) {
            fragment.mDetached = false;
            if (!fragment.mAdded) {
                this.A0U.A05(fragment);
                A0H(2);
                if (A0I(fragment)) {
                    this.A0H = true;
                }
            }
        }
    }

    public final void A0j(Fragment fragment) {
        A0H(2);
        if (!fragment.mDetached) {
            fragment.mDetached = true;
            if (fragment.mAdded) {
                A0H(2);
                ArrayList arrayList = this.A0U.A01;
                synchronized (arrayList) {
                    arrayList.remove(fragment);
                }
                fragment.mAdded = false;
                if (A0I(fragment)) {
                    this.A0H = true;
                }
                A08(fragment);
            }
        }
    }

    public final void A0k(Fragment fragment) {
        A0H(2);
        boolean z = false;
        if (fragment.mBackStackNesting > 0) {
            z = true;
        }
        boolean z2 = !z;
        if (!fragment.mDetached || z2) {
            ArrayList arrayList = this.A0U.A01;
            synchronized (arrayList) {
                arrayList.remove(fragment);
            }
            fragment.mAdded = false;
            if (A0I(fragment)) {
                this.A0H = true;
            }
            fragment.mRemoving = true;
            A08(fragment);
        }
    }

    public final void A0x(String str, int i) {
        A0s(new C10620hW(this, str, -1, i), false);
    }

    public final boolean A12() {
        return A0K(null, -1, 0);
    }

    public final boolean A17(Fragment fragment) {
        if (fragment != null) {
            AbstractC10360h2 abstractC10360h2 = fragment.mFragmentManager;
            if (!fragment.equals(abstractC10360h2.A07) || !A17(abstractC10360h2.A06)) {
                return false;
            }
        }
        return true;
    }

    public final boolean A18(String str, int i) {
        return A0K(str, -1, i);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x005e A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean A19(java.lang.String r8, java.util.ArrayList r9, java.util.ArrayList r10, int r11, int r12) {
        /*
            r7 = this;
            r6 = 1
            r0 = r12 & 1
            r5 = 0
            r2 = 0
            if (r0 == 0) goto L8
            r2 = 1
        L8:
            java.util.ArrayList r4 = r7.A0E
            boolean r0 = r4.isEmpty()
            if (r0 != 0) goto L83
            if (r8 != 0) goto L38
            if (r11 >= 0) goto L38
            if (r2 == 0) goto L31
            r3 = 0
        L17:
            java.util.ArrayList r2 = r7.A0E
            int r1 = r2.size()
            int r1 = r1 - r6
        L1e:
            if (r1 < r3) goto L82
            java.lang.Object r0 = r2.remove(r1)
            r9.add(r0)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r6)
            r10.add(r0)
            int r1 = r1 + (-1)
            goto L1e
        L31:
            int r0 = r4.size()
            int r3 = r0 + (-1)
            goto L5c
        L38:
            int r3 = r4.size()
        L3c:
            int r3 = r3 + (-1)
            if (r3 < 0) goto L83
            java.lang.Object r1 = r4.get(r3)
            X.0no r1 = (X.C14240no) r1
            if (r8 == 0) goto L7b
            java.lang.String r0 = r1.A09
            boolean r0 = r8.equals(r0)
            if (r0 == 0) goto L7b
        L50:
            if (r2 != 0) goto L5f
            int r0 = r4.size()
            int r0 = r0 + (-1)
            if (r3 == r0) goto L83
            int r3 = r3 + 1
        L5c:
            if (r3 >= 0) goto L17
            return r5
        L5f:
            if (r3 <= 0) goto L5c
            int r2 = r3 + (-1)
            java.lang.Object r1 = r4.get(r2)
            X.0no r1 = (X.C14240no) r1
            if (r8 == 0) goto L73
            java.lang.String r0 = r1.A09
            boolean r0 = r8.equals(r0)
            if (r0 != 0) goto L79
        L73:
            if (r11 < 0) goto L17
            int r0 = r1.A00
            if (r11 != r0) goto L17
        L79:
            r3 = r2
            goto L5f
        L7b:
            if (r11 < 0) goto L3c
            int r0 = r1.A00
            if (r11 != r0) goto L3c
            goto L50
        L82:
            return r6
        L83:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC10360h2.A19(java.lang.String, java.util.ArrayList, java.util.ArrayList, int, int):boolean");
    }

    private ViewGroup A00(Fragment fragment) {
        ViewGroup viewGroup = fragment.mContainer;
        if (viewGroup == null) {
            if (fragment.mContainerId <= 0 || !this.A08.A01()) {
                return null;
            }
            View A00 = this.A08.A00(fragment.mContainerId);
            if (!(A00 instanceof ViewGroup)) {
                return null;
            }
            return (ViewGroup) A00;
        }
        return viewGroup;
    }

    private HashSet A03() {
        HashSet hashSet = new HashSet();
        Iterator it = this.A0U.A02().iterator();
        while (it.hasNext()) {
            ViewGroup viewGroup = ((C016206f) it.next()).A02.mContainer;
            if (viewGroup != null) {
                C14360o3.A0B(A0V(), 1);
                Object tag = viewGroup.getTag(R.id.special_effects_controller_view_tag);
                if (!(tag instanceof C07A)) {
                    tag = new C07A(viewGroup);
                    viewGroup.setTag(R.id.special_effects_controller_view_tag, tag);
                }
                hashSet.add(tag);
            }
        }
        return hashSet;
    }

    public static final HashSet A04(C14240no c14240no) {
        HashSet hashSet = new HashSet();
        int i = 0;
        while (true) {
            ArrayList arrayList = c14240no.A0B;
            if (i < arrayList.size()) {
                Fragment fragment = ((C06l) arrayList.get(i)).A05;
                if (fragment != null && c14240no.A0E) {
                    hashSet.add(fragment);
                }
                i++;
            } else {
                return hashSet;
            }
        }
    }

    private void A06() {
        if (this.A0Q) {
            this.A0Q = false;
            Iterator it = this.A0U.A02().iterator();
            while (it.hasNext()) {
                A0v((C016206f) it.next());
            }
        }
    }

    public static void A09(Fragment fragment, AbstractC10360h2 abstractC10360h2) {
        if (fragment != null) {
            if (fragment.equals(abstractC10360h2.A0U.A00(fragment.mWho))) {
                fragment.performPrimaryNavigationFragmentChanged();
            }
        }
    }

    public static void A0B(AbstractC10360h2 abstractC10360h2) {
        ArrayList arrayList = abstractC10360h2.A0V;
        synchronized (arrayList) {
            boolean z = true;
            if (!arrayList.isEmpty()) {
                abstractC10360h2.A0R.A04(true);
                A0H(3);
                return;
            }
            if (abstractC10360h2.A0L() <= 0 || !abstractC10360h2.A17(abstractC10360h2.A06)) {
                z = false;
            }
            A0H(3);
            abstractC10360h2.A0R.A04(z);
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:128:0x0205. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:166:0x02ef. Please report as an issue. */
    /* JADX WARN: Type inference failed for: r14v23, types: [java.lang.Object, X.06l] */
    /* JADX WARN: Type inference failed for: r15v8, types: [java.lang.Object, X.06l] */
    /* JADX WARN: Type inference failed for: r1v11, types: [java.lang.Object, X.06l] */
    private void A0F(ArrayList arrayList, ArrayList arrayList2, int i, int i2) {
        AbstractC10360h2 abstractC10360h2;
        AbstractC10360h2 abstractC10360h22;
        Fragment fragment;
        int i3 = i;
        boolean z = ((AbstractC016706m) arrayList.get(i3)).A0G;
        ArrayList arrayList3 = this.A0N;
        if (arrayList3 == null) {
            arrayList3 = new ArrayList();
            this.A0N = arrayList3;
        } else {
            arrayList3.clear();
        }
        C016306g c016306g = this.A0U;
        arrayList3.addAll(c016306g.A04());
        Fragment fragment2 = this.A07;
        boolean z2 = false;
        for (int i4 = i3; i4 < i2; i4++) {
            AbstractC016706m abstractC016706m = (AbstractC016706m) arrayList.get(i4);
            boolean booleanValue = ((Boolean) arrayList2.get(i4)).booleanValue();
            ArrayList arrayList4 = this.A0N;
            if (!booleanValue) {
                int i5 = 0;
                while (true) {
                    ArrayList arrayList5 = abstractC016706m.A0B;
                    if (i5 < arrayList5.size()) {
                        C06l c06l = (C06l) arrayList5.get(i5);
                        int i6 = c06l.A00;
                        if (i6 != 1) {
                            if (i6 != 2) {
                                if (i6 != 3 && i6 != 6) {
                                    if (i6 != 7) {
                                        if (i6 == 8) {
                                            ?? obj = new Object();
                                            obj.A00 = 9;
                                            obj.A05 = fragment2;
                                            obj.A08 = true;
                                            C07S c07s = C07S.RESUMED;
                                            obj.A07 = c07s;
                                            obj.A06 = c07s;
                                            arrayList5.add(i5, obj);
                                            c06l.A08 = true;
                                            i5++;
                                            fragment2 = c06l.A05;
                                        }
                                    }
                                } else {
                                    arrayList4.remove(c06l.A05);
                                    Fragment fragment3 = c06l.A05;
                                    if (fragment3 == fragment2) {
                                        arrayList5.add(i5, new C06l(fragment3, 9));
                                        i5++;
                                        fragment2 = null;
                                    }
                                }
                            } else {
                                fragment = c06l.A05;
                                int i7 = fragment.mContainerId;
                                boolean z3 = false;
                                for (int size = arrayList4.size() - 1; size >= 0; size--) {
                                    Fragment fragment4 = (Fragment) arrayList4.get(size);
                                    if (fragment4.mContainerId == i7) {
                                        if (fragment4 == fragment) {
                                            z3 = true;
                                        } else {
                                            if (fragment4 == fragment2) {
                                                ?? obj2 = new Object();
                                                obj2.A00 = 9;
                                                obj2.A05 = fragment4;
                                                obj2.A08 = true;
                                                C07S c07s2 = C07S.RESUMED;
                                                obj2.A07 = c07s2;
                                                obj2.A06 = c07s2;
                                                arrayList5.add(i5, obj2);
                                                i5++;
                                                fragment2 = null;
                                            }
                                            ?? obj3 = new Object();
                                            obj3.A00 = 3;
                                            obj3.A05 = fragment4;
                                            obj3.A08 = true;
                                            C07S c07s3 = C07S.RESUMED;
                                            obj3.A07 = c07s3;
                                            obj3.A06 = c07s3;
                                            obj3.A01 = c06l.A01;
                                            obj3.A03 = c06l.A03;
                                            obj3.A02 = c06l.A02;
                                            obj3.A04 = c06l.A04;
                                            arrayList5.add(i5, obj3);
                                            arrayList4.remove(fragment4);
                                            i5++;
                                        }
                                    }
                                }
                                if (z3) {
                                    arrayList5.remove(i5);
                                    i5--;
                                } else {
                                    c06l.A00 = 1;
                                    c06l.A08 = true;
                                    arrayList4.add(fragment);
                                }
                            }
                            i5++;
                        }
                        fragment = c06l.A05;
                        arrayList4.add(fragment);
                        i5++;
                    }
                }
            } else {
                ArrayList arrayList6 = abstractC016706m.A0B;
                for (int size2 = arrayList6.size() - 1; size2 >= 0; size2--) {
                    C06l c06l2 = (C06l) arrayList6.get(size2);
                    int i8 = c06l2.A00;
                    if (i8 != 1) {
                        if (i8 != 3) {
                            switch (i8) {
                                case 8:
                                    fragment2 = null;
                                    break;
                                case 9:
                                    fragment2 = c06l2.A05;
                                    break;
                                case 10:
                                    c06l2.A06 = c06l2.A07;
                                    break;
                            }
                        }
                        arrayList4.add(c06l2.A05);
                    }
                    arrayList4.remove(c06l2.A05);
                }
            }
            if (!z2) {
                z2 = false;
                if (!abstractC016706m.A0E) {
                }
            }
            z2 = true;
        }
        this.A0N.clear();
        if (!z && this.A00 >= 1) {
            for (int i9 = i3; i9 < i2; i9++) {
                Iterator it = ((AbstractC016706m) arrayList.get(i9)).A0B.iterator();
                while (it.hasNext()) {
                    Fragment fragment5 = ((C06l) it.next()).A05;
                    if (fragment5 != null && fragment5.mFragmentManager != null) {
                        c016306g.A06(A0U(fragment5));
                    }
                }
            }
        }
        for (int i10 = i3; i10 < i2; i10++) {
            C14240no c14240no = (C14240no) arrayList.get(i10);
            if (((Boolean) arrayList2.get(i10)).booleanValue()) {
                c14240no.A0L(-1);
                ArrayList arrayList7 = c14240no.A0B;
                for (int size3 = arrayList7.size() - 1; size3 >= 0; size3--) {
                    C06l c06l3 = (C06l) arrayList7.get(size3);
                    Fragment fragment6 = c06l3.A05;
                    if (fragment6 != null) {
                        fragment6.mBeingSaved = false;
                        fragment6.setPopDirection(true);
                        int i11 = c14240no.A06;
                        int i12 = 4100;
                        if (i11 != 4097) {
                            if (i11 != 8194) {
                                if (i11 != 8197) {
                                    if (i11 != 4099) {
                                        i12 = 8197;
                                        if (i11 != 4100) {
                                            i12 = 0;
                                        }
                                    } else {
                                        i12 = 4099;
                                    }
                                }
                            } else {
                                i12 = 4097;
                            }
                        } else {
                            i12 = ReactTextInputManager.INPUT_TYPE_KEYBOARD_DECIMAL_PAD;
                        }
                        fragment6.setNextTransition(i12);
                        fragment6.setSharedElementNames(c14240no.A0D, c14240no.A0C);
                    }
                    int i13 = c06l3.A00;
                    switch (i13) {
                        case 1:
                            fragment6.setAnimations(c06l3.A01, c06l3.A02, c06l3.A03, c06l3.A04);
                            AbstractC10360h2 abstractC10360h23 = c14240no.A02;
                            abstractC10360h23.A0o(fragment6, true);
                            abstractC10360h23.A0k(fragment6);
                        case 2:
                        default:
                            throw new IllegalArgumentException(AnonymousClass001.A0O("Unknown cmd: ", i13));
                        case 3:
                            fragment6.setAnimations(c06l3.A01, c06l3.A02, c06l3.A03, c06l3.A04);
                            c14240no.A02.A0T(fragment6);
                        case 4:
                            fragment6.setAnimations(c06l3.A01, c06l3.A02, c06l3.A03, c06l3.A04);
                            A0H(2);
                            if (fragment6.mHidden) {
                                fragment6.mHidden = false;
                                fragment6.mHiddenChanged = !fragment6.mHiddenChanged;
                            }
                        case 5:
                            fragment6.setAnimations(c06l3.A01, c06l3.A02, c06l3.A03, c06l3.A04);
                            AbstractC10360h2 abstractC10360h24 = c14240no.A02;
                            abstractC10360h24.A0o(fragment6, true);
                            A0H(2);
                            if (!fragment6.mHidden) {
                                fragment6.mHidden = true;
                                fragment6.mHiddenChanged = !fragment6.mHiddenChanged;
                                abstractC10360h24.A08(fragment6);
                            }
                        case 6:
                            fragment6.setAnimations(c06l3.A01, c06l3.A02, c06l3.A03, c06l3.A04);
                            c14240no.A02.A0i(fragment6);
                        case 7:
                            fragment6.setAnimations(c06l3.A01, c06l3.A02, c06l3.A03, c06l3.A04);
                            AbstractC10360h2 abstractC10360h25 = c14240no.A02;
                            abstractC10360h25.A0o(fragment6, true);
                            abstractC10360h25.A0j(fragment6);
                        case 8:
                            abstractC10360h22 = c14240no.A02;
                            fragment6 = null;
                            abstractC10360h22.A0l(fragment6);
                        case 9:
                            abstractC10360h22 = c14240no.A02;
                            abstractC10360h22.A0l(fragment6);
                        case 10:
                            c14240no.A02.A0n(fragment6, c06l3.A07);
                    }
                }
            } else {
                c14240no.A0L(1);
                ArrayList arrayList8 = c14240no.A0B;
                int size4 = arrayList8.size();
                for (int i14 = 0; i14 < size4; i14++) {
                    C06l c06l4 = (C06l) arrayList8.get(i14);
                    Fragment fragment7 = c06l4.A05;
                    if (fragment7 != null) {
                        fragment7.mBeingSaved = false;
                        fragment7.setPopDirection(false);
                        fragment7.setNextTransition(c14240no.A06);
                        fragment7.setSharedElementNames(c14240no.A0C, c14240no.A0D);
                    }
                    int i15 = c06l4.A00;
                    switch (i15) {
                        case 1:
                            fragment7.setAnimations(c06l4.A01, c06l4.A02, c06l4.A03, c06l4.A04);
                            AbstractC10360h2 abstractC10360h26 = c14240no.A02;
                            abstractC10360h26.A0o(fragment7, false);
                            abstractC10360h26.A0T(fragment7);
                        case 2:
                        default:
                            throw new IllegalArgumentException(AnonymousClass001.A0O("Unknown cmd: ", i15));
                        case 3:
                            fragment7.setAnimations(c06l4.A01, c06l4.A02, c06l4.A03, c06l4.A04);
                            c14240no.A02.A0k(fragment7);
                        case 4:
                            fragment7.setAnimations(c06l4.A01, c06l4.A02, c06l4.A03, c06l4.A04);
                            AbstractC10360h2 abstractC10360h27 = c14240no.A02;
                            A0H(2);
                            if (!fragment7.mHidden) {
                                fragment7.mHidden = true;
                                fragment7.mHiddenChanged = !fragment7.mHiddenChanged;
                                abstractC10360h27.A08(fragment7);
                            }
                        case 5:
                            fragment7.setAnimations(c06l4.A01, c06l4.A02, c06l4.A03, c06l4.A04);
                            c14240no.A02.A0o(fragment7, false);
                            A0H(2);
                            if (fragment7.mHidden) {
                                fragment7.mHidden = false;
                                fragment7.mHiddenChanged = !fragment7.mHiddenChanged;
                            }
                        case 6:
                            fragment7.setAnimations(c06l4.A01, c06l4.A02, c06l4.A03, c06l4.A04);
                            c14240no.A02.A0j(fragment7);
                        case 7:
                            fragment7.setAnimations(c06l4.A01, c06l4.A02, c06l4.A03, c06l4.A04);
                            AbstractC10360h2 abstractC10360h28 = c14240no.A02;
                            abstractC10360h28.A0o(fragment7, false);
                            abstractC10360h28.A0i(fragment7);
                        case 8:
                            abstractC10360h2 = c14240no.A02;
                            abstractC10360h2.A0l(fragment7);
                        case 9:
                            abstractC10360h2 = c14240no.A02;
                            fragment7 = null;
                            abstractC10360h2.A0l(fragment7);
                        case 10:
                            c14240no.A02.A0n(fragment7, c06l4.A06);
                    }
                }
            }
        }
        boolean booleanValue2 = ((Boolean) arrayList2.get(i2 - 1)).booleanValue();
        if (z2) {
            ArrayList arrayList9 = this.A0F;
            if (!arrayList9.isEmpty()) {
                LinkedHashSet linkedHashSet = new LinkedHashSet();
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    linkedHashSet.addAll(A04((C14240no) it2.next()));
                }
                if (this.A05 == null) {
                    Iterator it3 = arrayList9.iterator();
                    while (it3.hasNext()) {
                        it3.next();
                        Iterator it4 = linkedHashSet.iterator();
                        while (it4.hasNext()) {
                            it4.next();
                        }
                    }
                    Iterator it5 = arrayList9.iterator();
                    while (it5.hasNext()) {
                        it5.next();
                        Iterator it6 = linkedHashSet.iterator();
                        while (it6.hasNext()) {
                            it6.next();
                        }
                    }
                }
            }
        }
        for (int i16 = i3; i16 < i2; i16++) {
            AbstractC016706m abstractC016706m2 = (AbstractC016706m) arrayList.get(i16);
            ArrayList arrayList10 = abstractC016706m2.A0B;
            if (booleanValue2) {
                for (int size5 = arrayList10.size() - 1; size5 >= 0; size5--) {
                    Fragment fragment8 = ((C06l) abstractC016706m2.A0B.get(size5)).A05;
                    if (fragment8 != null) {
                        A0U(fragment8).A03();
                    }
                }
            } else {
                Iterator it7 = arrayList10.iterator();
                while (it7.hasNext()) {
                    Fragment fragment9 = ((C06l) it7.next()).A05;
                    if (fragment9 != null) {
                        A0U(fragment9).A03();
                    }
                }
            }
        }
        A0e(this.A00, true);
        Iterator it8 = A0W(arrayList, i3, i2).iterator();
        while (it8.hasNext()) {
            C07A c07a = (C07A) it8.next();
            c07a.A01 = booleanValue2;
            c07a.A08();
            c07a.A06();
        }
        while (i3 < i2) {
            C14240no c14240no2 = (C14240no) arrayList.get(i3);
            if (((Boolean) arrayList2.get(i3)).booleanValue() && c14240no2.A00 >= 0) {
                c14240no2.A00 = -1;
            }
            if (c14240no2.A0A != null) {
                int i17 = 0;
                while (true) {
                    ArrayList arrayList11 = c14240no2.A0A;
                    if (i17 < arrayList11.size()) {
                        ((Runnable) arrayList11.get(i17)).run();
                        i17++;
                    } else {
                        c14240no2.A0A = null;
                    }
                }
            }
            i3++;
        }
        if (z2) {
            int i18 = 0;
            while (true) {
                ArrayList arrayList12 = this.A0F;
                if (i18 < arrayList12.size()) {
                    ((C06N) arrayList12.get(i18)).onBackStackChanged();
                    i18++;
                } else {
                    return;
                }
            }
        }
    }

    private void A0G(boolean z) {
        if (!this.mExecutingActions) {
            if (this.A0A == null) {
                if (this.A0G) {
                    throw new IllegalStateException("FragmentManager has been destroyed");
                }
                throw new IllegalStateException("FragmentManager has not been attached to a host.");
            }
            if (Looper.myLooper() == this.A0A.A02.getLooper()) {
                if (!z && A11()) {
                    throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
                }
                if (this.A0P == null) {
                    this.A0P = new ArrayList();
                    this.A0O = new ArrayList();
                    return;
                }
                return;
            }
            throw new IllegalStateException("Must be called from main thread of fragment host");
        }
        throw new IllegalStateException("FragmentManager is already executing transactions");
    }

    public static boolean A0H(int i) {
        if (!android.util.Log.isLoggable("FragmentManager", i)) {
            return false;
        }
        return true;
    }

    public static boolean A0I(Fragment fragment) {
        if (!fragment.mHasMenu || !fragment.mMenuVisible) {
            Iterator it = fragment.mChildFragmentManager.A0U.A03().iterator();
            while (it.hasNext()) {
                Fragment fragment2 = (Fragment) it.next();
                if (fragment2 != null && A0I(fragment2)) {
                    return true;
                }
            }
            return false;
        }
        return true;
    }

    public static boolean A0J(AbstractC10360h2 abstractC10360h2) {
        Fragment fragment = abstractC10360h2.A06;
        if (fragment == null || (fragment.isAdded() && A0J(fragment.getParentFragmentManager()))) {
            return true;
        }
        return false;
    }

    public final int A0L() {
        int size = this.A0E.size();
        int i = 0;
        if (this.A05 != null) {
            i = 1;
        }
        return size + i;
    }

    public final Bundle A0M() {
        ArrayList arrayList;
        Bundle bundle = new Bundle();
        A07();
        A0A(this);
        A10(true);
        this.A0I = true;
        this.A0B.A01 = true;
        C016306g c016306g = this.A0U;
        HashMap hashMap = c016306g.A02;
        ArrayList arrayList2 = new ArrayList(hashMap.size());
        for (C016206f c016206f : hashMap.values()) {
            if (c016206f != null) {
                Fragment fragment = c016206f.A02;
                c016306g.A03.put(fragment.mWho, c016206f.A00());
                arrayList2.add(fragment.mWho);
                A0H(2);
            }
        }
        HashMap hashMap2 = c016306g.A03;
        if (hashMap2.isEmpty()) {
            A0H(2);
        } else {
            ArrayList arrayList3 = c016306g.A01;
            synchronized (arrayList3) {
                if (arrayList3.isEmpty()) {
                    arrayList = null;
                } else {
                    arrayList = new ArrayList(arrayList3.size());
                    Iterator it = arrayList3.iterator();
                    while (it.hasNext()) {
                        arrayList.add(((Fragment) it.next()).mWho);
                        A0H(2);
                    }
                }
            }
            BackStackRecordState[] backStackRecordStateArr = null;
            int size = this.A0E.size();
            if (size > 0) {
                backStackRecordStateArr = new BackStackRecordState[size];
                int i = 0;
                do {
                    backStackRecordStateArr[i] = new BackStackRecordState((C14240no) this.A0E.get(i));
                    if (A0H(2)) {
                        this.A0E.get(i);
                    }
                    i++;
                } while (i < size);
            }
            FragmentManagerState fragmentManagerState = new FragmentManagerState();
            fragmentManagerState.A02 = arrayList2;
            fragmentManagerState.A03 = arrayList;
            fragmentManagerState.A07 = backStackRecordStateArr;
            fragmentManagerState.A00 = this.A0a.get();
            Fragment fragment2 = this.A07;
            if (fragment2 != null) {
                fragmentManagerState.A01 = fragment2.mWho;
            }
            ArrayList arrayList4 = fragmentManagerState.A04;
            Map map = this.A0W;
            arrayList4.addAll(map.keySet());
            fragmentManagerState.A05.addAll(map.values());
            fragmentManagerState.A06 = new ArrayList(this.A0D);
            bundle.putParcelable(IgReactPurchaseExperienceBridgeModule.RN_SHOP_PAY_STATE, fragmentManagerState);
            Map map2 = this.A0Y;
            for (String str : map2.keySet()) {
                bundle.putBundle(AnonymousClass001.A0R("result_", str), (Bundle) map2.get(str));
            }
            for (String str2 : hashMap2.keySet()) {
                bundle.putBundle(AnonymousClass001.A0R("fragment_", str2), (Bundle) hashMap2.get(str2));
            }
        }
        return bundle;
    }

    public final Fragment.SavedState A0N(Fragment fragment) {
        C016306g c016306g = this.A0U;
        C016206f c016206f = (C016206f) c016306g.A02.get(fragment.mWho);
        if (c016206f != null) {
            Fragment fragment2 = c016206f.A02;
            if (fragment2.equals(fragment)) {
                if (fragment2.mState > -1) {
                    return new Fragment.SavedState(c016206f.A00());
                }
                return null;
            }
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Fragment ");
        sb.append(fragment);
        sb.append(" is not currently in the FragmentManager");
        A0D(new IllegalStateException(sb.toString()));
        throw C00O.createAndThrow();
    }

    public final Fragment A0O(int i) {
        C016306g c016306g = this.A0U;
        ArrayList arrayList = c016306g.A01;
        int size = arrayList.size();
        while (true) {
            size--;
            if (size >= 0) {
                Fragment fragment = (Fragment) arrayList.get(size);
                if (fragment != null && fragment.mFragmentId == i) {
                    return fragment;
                }
            } else {
                for (C016206f c016206f : c016306g.A02.values()) {
                    if (c016206f != null) {
                        Fragment fragment2 = c016206f.A02;
                        if (fragment2.mFragmentId == i) {
                            return fragment2;
                        }
                    }
                }
                return null;
            }
        }
    }

    public final Fragment A0Q(String str) {
        C016306g c016306g = this.A0U;
        if (str != null) {
            ArrayList arrayList = c016306g.A01;
            int size = arrayList.size();
            while (true) {
                size--;
                if (size >= 0) {
                    Fragment fragment = (Fragment) arrayList.get(size);
                    if (fragment != null && str.equals(fragment.mTag)) {
                        return fragment;
                    }
                } else {
                    for (C016206f c016206f : c016306g.A02.values()) {
                        if (c016206f != null) {
                            Fragment fragment2 = c016206f.A02;
                            if (str.equals(fragment2.mTag)) {
                                return fragment2;
                            }
                        }
                    }
                    return null;
                }
            }
        } else {
            return null;
        }
    }

    public final C06B A0R() {
        C06B c06b = this.A09;
        if (c06b == null) {
            Fragment fragment = this.A06;
            if (fragment != null) {
                return fragment.mFragmentManager.A0R();
            }
            return this.A0K;
        }
        return c06b;
    }

    public final C06J A0S(int i) {
        ArrayList arrayList = this.A0E;
        if (i == arrayList.size()) {
            C14240no c14240no = this.A05;
            if (c14240no == null) {
                throw new IndexOutOfBoundsException();
            }
            return c14240no;
        }
        return (C06J) arrayList.get(i);
    }

    public final C016206f A0T(Fragment fragment) {
        String str = fragment.mPreviousWho;
        if (str != null) {
            C07K.A03(fragment, str);
        }
        A0H(2);
        C016206f A0U = A0U(fragment);
        fragment.mFragmentManager = this;
        C016306g c016306g = this.A0U;
        c016306g.A06(A0U);
        if (!fragment.mDetached) {
            c016306g.A05(fragment);
            fragment.mRemoving = false;
            if (fragment.mView == null) {
                fragment.mHiddenChanged = false;
            }
            if (A0I(fragment)) {
                this.A0H = true;
            }
        }
        return A0U;
    }

    public final C016206f A0U(Fragment fragment) {
        C016306g c016306g = this.A0U;
        C016206f c016206f = (C016206f) c016306g.A02.get(fragment.mWho);
        if (c016206f == null) {
            C016206f c016206f2 = new C016206f(fragment, this.A0T, c016306g);
            c016206f2.A05(this.A0A.A01.getClassLoader());
            c016206f2.A00 = this.A00;
            return c016206f2;
        }
        return c016206f;
    }

    public final C07B A0V() {
        Fragment fragment = this.A06;
        if (fragment != null) {
            return fragment.mFragmentManager.A0V();
        }
        return this.A0L;
    }

    public final HashSet A0W(ArrayList arrayList, int i, int i2) {
        ViewGroup viewGroup;
        HashSet hashSet = new HashSet();
        while (i < i2) {
            Iterator it = ((AbstractC016706m) arrayList.get(i)).A0B.iterator();
            while (it.hasNext()) {
                Fragment fragment = ((C06l) it.next()).A05;
                if (fragment != null && (viewGroup = fragment.mContainer) != null) {
                    hashSet.add(C07A.A02(viewGroup, this));
                }
            }
            i++;
        }
        return hashSet;
    }

    public final void A0Y() {
        Iterator it = this.A0U.A03().iterator();
        while (it.hasNext()) {
            Fragment fragment = (Fragment) it.next();
            if (fragment != null) {
                fragment.onHiddenChanged(fragment.isHidden());
                fragment.mChildFragmentManager.A0Y();
            }
        }
    }

    public final void A0a() {
        if (this.A0A != null) {
            this.A0I = false;
            this.A0J = false;
            this.A0B.A01 = false;
            for (Fragment fragment : this.A0U.A04()) {
                if (fragment != null) {
                    fragment.noteStateNotSaved();
                }
            }
        }
    }

    public final void A0d(int i, int i2, boolean z) {
        if (i >= 0) {
            A0s(new C10620hW(this, null, i, i2), z);
            return;
        }
        throw new IllegalArgumentException(AnonymousClass001.A0O("Bad id: ", i));
    }

    public final void A0e(int i, boolean z) {
        AbstractC10920i8 abstractC10920i8;
        if (this.A0A == null && i != -1) {
            throw new IllegalStateException("No activity");
        }
        if (!z && i == this.A00) {
            return;
        }
        this.A00 = i;
        C016306g c016306g = this.A0U;
        Iterator it = c016306g.A01.iterator();
        while (it.hasNext()) {
            C016206f c016206f = (C016206f) c016306g.A02.get(((Fragment) it.next()).mWho);
            if (c016206f != null) {
                c016206f.A03();
            }
        }
        for (C016206f c016206f2 : c016306g.A02.values()) {
            if (c016206f2 != null) {
                c016206f2.A03();
                Fragment fragment = c016206f2.A02;
                if (fragment.mRemoving && fragment.mBackStackNesting <= 0) {
                    if (fragment.mBeingSaved) {
                        HashMap hashMap = c016306g.A03;
                        if (!hashMap.containsKey(fragment.mWho)) {
                            hashMap.put(fragment.mWho, c016206f2.A00());
                        }
                    }
                    c016306g.A07(c016206f2);
                }
            }
        }
        Iterator it2 = c016306g.A02().iterator();
        while (it2.hasNext()) {
            A0v((C016206f) it2.next());
        }
        if (!this.A0H || (abstractC10920i8 = this.A0A) == null || this.A00 != 7) {
            return;
        }
        abstractC10920i8.A03();
        this.A0H = false;
    }

    public final void A0f(Bundle bundle, Fragment fragment, String str) {
        if (fragment.mFragmentManager != this) {
            StringBuilder sb = new StringBuilder();
            sb.append("Fragment ");
            sb.append(fragment);
            sb.append(" is not currently in the FragmentManager");
            A0D(new IllegalStateException(sb.toString()));
            throw C00O.createAndThrow();
        }
        bundle.putString(str, fragment.mWho);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v0, types: [java.lang.Object, X.06l] */
    public final void A0g(Parcelable parcelable) {
        C016206f c016206f;
        Bundle bundle;
        Bundle bundle2;
        Bundle bundle3 = (Bundle) parcelable;
        for (String str : bundle3.keySet()) {
            if (str.startsWith("result_") && (bundle2 = bundle3.getBundle(str)) != null) {
                bundle2.setClassLoader(this.A0A.A01.getClassLoader());
                this.A0Y.put(str.substring(7), bundle2);
            }
        }
        HashMap hashMap = new HashMap();
        for (String str2 : bundle3.keySet()) {
            if (str2.startsWith("fragment_") && (bundle = bundle3.getBundle(str2)) != null) {
                bundle.setClassLoader(this.A0A.A01.getClassLoader());
                hashMap.put(str2.substring(9), bundle);
            }
        }
        C016306g c016306g = this.A0U;
        HashMap hashMap2 = c016306g.A03;
        hashMap2.clear();
        hashMap2.putAll(hashMap);
        FragmentManagerState fragmentManagerState = (FragmentManagerState) bundle3.getParcelable(IgReactPurchaseExperienceBridgeModule.RN_SHOP_PAY_STATE);
        if (fragmentManagerState != null) {
            HashMap hashMap3 = c016306g.A02;
            hashMap3.clear();
            Iterator it = fragmentManagerState.A02.iterator();
            while (it.hasNext()) {
                Bundle bundle4 = (Bundle) hashMap2.remove(it.next());
                if (bundle4 != null) {
                    FragmentState fragmentState = (FragmentState) bundle4.getParcelable(IgReactPurchaseExperienceBridgeModule.RN_SHOP_PAY_STATE);
                    Fragment fragment = (Fragment) this.A0B.A03.get(fragmentState.A07);
                    if (fragment != null) {
                        A0H(2);
                        c016206f = new C016206f(bundle4, fragment, this.A0T, c016306g);
                    } else {
                        c016206f = new C016206f(bundle4, A0R(), this.A0T, c016306g, this.A0A.A01.getClassLoader());
                    }
                    Fragment fragment2 = c016206f.A02;
                    fragment2.mSavedFragmentState = bundle4;
                    fragment2.mFragmentManager = this;
                    A0H(2);
                    c016206f.A05(this.A0A.A01.getClassLoader());
                    c016306g.A06(c016206f);
                    c016206f.A00 = this.A00;
                }
            }
            Iterator it2 = new ArrayList(this.A0B.A03.values()).iterator();
            while (it2.hasNext()) {
                Fragment fragment3 = (Fragment) it2.next();
                if (hashMap3.get(fragment3.mWho) == null) {
                    A0H(2);
                    this.A0B.A01(fragment3);
                    fragment3.mFragmentManager = this;
                    C016206f c016206f2 = new C016206f(fragment3, this.A0T, c016306g);
                    c016206f2.A00 = 1;
                    c016206f2.A03();
                    fragment3.mRemoving = true;
                    c016206f2.A03();
                }
            }
            ArrayList arrayList = fragmentManagerState.A03;
            c016306g.A01.clear();
            if (arrayList != null) {
                Iterator it3 = arrayList.iterator();
                while (it3.hasNext()) {
                    String str3 = (String) it3.next();
                    Fragment A00 = c016306g.A00(str3);
                    if (A00 != null) {
                        A0H(2);
                        c016306g.A05(A00);
                    } else {
                        throw new IllegalStateException(AnonymousClass001.A0g("No instantiated fragment for (", str3, ")"));
                    }
                }
            }
            BackStackRecordState[] backStackRecordStateArr = fragmentManagerState.A07;
            if (backStackRecordStateArr != null) {
                this.A0E = new ArrayList(backStackRecordStateArr.length);
                int i = 0;
                while (true) {
                    BackStackRecordState[] backStackRecordStateArr2 = fragmentManagerState.A07;
                    if (i >= backStackRecordStateArr2.length) {
                        break;
                    }
                    BackStackRecordState backStackRecordState = backStackRecordStateArr2[i];
                    C14240no c14240no = new C14240no(this);
                    int i2 = 0;
                    int i3 = 0;
                    while (true) {
                        int[] iArr = backStackRecordState.A0D;
                        boolean z = true;
                        if (i2 >= iArr.length) {
                            break;
                        }
                        ?? obj = new Object();
                        int i4 = i2 + 1;
                        obj.A00 = iArr[i2];
                        A0H(2);
                        obj.A07 = C07S.values()[backStackRecordState.A0C[i3]];
                        obj.A06 = C07S.values()[backStackRecordState.A0B[i3]];
                        int i5 = i4 + 1;
                        if (iArr[i4] == 0) {
                            z = false;
                        }
                        obj.A08 = z;
                        int i6 = i5 + 1;
                        int i7 = iArr[i5];
                        obj.A01 = i7;
                        int i8 = i6 + 1;
                        int i9 = iArr[i6];
                        obj.A02 = i9;
                        int i10 = i8 + 1;
                        int i11 = iArr[i8];
                        obj.A03 = i11;
                        i2 = i10 + 1;
                        int i12 = iArr[i10];
                        obj.A04 = i12;
                        ((AbstractC016706m) c14240no).A02 = i7;
                        c14240no.A03 = i9;
                        c14240no.A04 = i11;
                        c14240no.A05 = i12;
                        c14240no.A0F(obj);
                        i3++;
                    }
                    c14240no.A06 = backStackRecordState.A03;
                    c14240no.A09 = backStackRecordState.A06;
                    c14240no.A0E = true;
                    ((AbstractC016706m) c14240no).A01 = backStackRecordState.A01;
                    c14240no.A08 = backStackRecordState.A05;
                    ((AbstractC016706m) c14240no).A00 = backStackRecordState.A00;
                    c14240no.A07 = backStackRecordState.A04;
                    c14240no.A0C = backStackRecordState.A08;
                    c14240no.A0D = backStackRecordState.A09;
                    c14240no.A0G = backStackRecordState.A0A;
                    c14240no.A00 = backStackRecordState.A02;
                    int i13 = 0;
                    while (true) {
                        ArrayList arrayList2 = backStackRecordState.A07;
                        if (i13 >= arrayList2.size()) {
                            break;
                        }
                        String str4 = (String) arrayList2.get(i13);
                        if (str4 != null) {
                            ((C06l) c14240no.A0B.get(i13)).A05 = c016306g.A00(str4);
                        }
                        i13++;
                    }
                    c14240no.A0L(1);
                    if (A0H(2)) {
                        PrintWriter printWriter = new PrintWriter(new C017906z());
                        c14240no.A0O(printWriter, "  ", false);
                        printWriter.close();
                    }
                    this.A0E.add(c14240no);
                    i++;
                }
            } else {
                this.A0E = new ArrayList();
            }
            this.A0a.set(fragmentManagerState.A00);
            String str5 = fragmentManagerState.A01;
            if (str5 != null) {
                Fragment A002 = c016306g.A00(str5);
                this.A07 = A002;
                A09(A002, this);
            }
            ArrayList arrayList3 = fragmentManagerState.A04;
            if (arrayList3 != null) {
                for (int i14 = 0; i14 < arrayList3.size(); i14++) {
                    this.A0W.put(arrayList3.get(i14), fragmentManagerState.A05.get(i14));
                }
            }
            this.A0D = new ArrayDeque(fragmentManagerState.A06);
        }
    }

    public final void A0h(Menu menu) {
        if (this.A00 >= 1) {
            for (Fragment fragment : this.A0U.A04()) {
                if (fragment != null) {
                    fragment.performOptionsMenuClosed(menu);
                }
            }
        }
    }

    public final void A0l(Fragment fragment) {
        if (fragment != null) {
            if (!fragment.equals(this.A0U.A00(fragment.mWho)) || (fragment.mHost != null && fragment.mFragmentManager != this)) {
                StringBuilder sb = new StringBuilder();
                sb.append("Fragment ");
                sb.append(fragment);
                sb.append(" is not an active fragment of FragmentManager ");
                sb.append(this);
                throw new IllegalArgumentException(sb.toString());
            }
        }
        Fragment fragment2 = this.A07;
        this.A07 = fragment;
        A09(fragment2, this);
        A09(this.A07, this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x001a  */
    /* JADX WARN: Type inference failed for: r1v22, types: [java.lang.Object, X.00g] */
    /* JADX WARN: Type inference failed for: r1v23, types: [java.lang.Object, X.00g] */
    /* JADX WARN: Type inference failed for: r1v24, types: [java.lang.Object, X.00g] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A0m(final androidx.fragment.app.Fragment r6, X.AnonymousClass067 r7, X.AbstractC10920i8 r8) {
        /*
            Method dump skipped, instructions count: 341
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC10360h2.A0m(androidx.fragment.app.Fragment, X.067, X.0i8):void");
    }

    public final void A0n(Fragment fragment, C07S c07s) {
        if (fragment.equals(this.A0U.A00(fragment.mWho)) && (fragment.mHost == null || fragment.mFragmentManager == this)) {
            fragment.mMaxState = c07s;
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Fragment ");
        sb.append(fragment);
        sb.append(" is not an active fragment of FragmentManager ");
        sb.append(this);
        throw new IllegalArgumentException(sb.toString());
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x001a, code lost:
    
        r3.remove(r2);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A0p(X.C06K r5) {
        /*
            r4 = this;
            X.06G r1 = r4.A0T
            r0 = 0
            X.C14360o3.A0B(r5, r0)
            java.util.concurrent.CopyOnWriteArrayList r3 = r1.A00
            monitor-enter(r3)
            r2 = 0
            int r1 = r3.size()     // Catch: java.lang.Throwable -> L23
        Le:
            if (r2 >= r1) goto L21
            java.lang.Object r0 = r3.get(r2)     // Catch: java.lang.Throwable -> L23
            X.06F r0 = (X.C06F) r0     // Catch: java.lang.Throwable -> L23
            X.06K r0 = r0.A00     // Catch: java.lang.Throwable -> L23
            if (r0 != r5) goto L1e
            r3.remove(r2)     // Catch: java.lang.Throwable -> L23
            goto L21
        L1e:
            int r2 = r2 + 1
            goto Le
        L21:
            monitor-exit(r3)
            return
        L23:
            r0 = move-exception
            monitor-exit(r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC10360h2.A0p(X.06K):void");
    }

    public final void A0q(C06K c06k, boolean z) {
        C06G c06g = this.A0T;
        C14360o3.A0B(c06k, 0);
        c06g.A00.add(new C06F(c06k, z));
    }

    public final void A0r(C06N c06n) {
        this.A0F.add(c06n);
    }

    public final void A0s(C06O c06o, boolean z) {
        if (!z) {
            if (this.A0A == null) {
                if (this.A0G) {
                    throw new IllegalStateException("FragmentManager has been destroyed");
                }
                throw new IllegalStateException("FragmentManager has not been attached to a host.");
            }
            if (A11()) {
                throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
            }
        }
        ArrayList arrayList = this.A0V;
        synchronized (arrayList) {
            if (this.A0A == null) {
                if (!z) {
                    throw new IllegalStateException("Activity has been destroyed");
                }
            } else {
                arrayList.add(c06o);
                try {
                    if (arrayList.size() == 1) {
                        Handler handler = this.A0A.A02;
                        Runnable runnable = this.A0C;
                        handler.removeCallbacks(runnable);
                        this.A0A.A02.post(runnable);
                        A0B(this);
                    }
                } catch (Throwable th) {
                }
            }
        }
    }

    public final void A0t(C06O c06o, boolean z) {
        if (z && (this.A0A == null || this.A0G)) {
            return;
        }
        A0G(z);
        if (c06o.AWw(this.A0P, this.A0O)) {
            this.mExecutingActions = true;
            try {
                A0E(this.A0P, this.A0O);
            } finally {
                A05();
            }
        }
        A0B(this);
        A06();
        this.A0U.A02.values().removeAll(Collections.singleton(null));
    }

    public final void A0v(C016206f c016206f) {
        Fragment fragment = c016206f.A02;
        if (fragment.mDeferStart) {
            if (this.mExecutingActions) {
                this.A0Q = true;
            } else {
                fragment.mDeferStart = false;
                c016206f.A03();
            }
        }
    }

    public final void A0w(String str) {
        C10630hX c10630hX = (C10630hX) this.A0X.remove(str);
        if (c10630hX != null) {
            c10630hX.A00.A0A(c10630hX.A01);
        }
        A0H(2);
    }

    public final void A0y(String str, Bundle bundle) {
        C10630hX c10630hX = (C10630hX) this.A0X.get(str);
        if (c10630hX != null) {
            if (c10630hX.A00.A07().A00(C07S.STARTED)) {
                c10630hX.DIA(str, bundle);
                A0H(2);
            }
        }
        this.A0Y.put(str, bundle);
        A0H(2);
    }

    public final void A0z(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        int size;
        String A0R = AnonymousClass001.A0R(str, "    ");
        C016306g c016306g = this.A0U;
        String A0R2 = AnonymousClass001.A0R(str, "    ");
        HashMap hashMap = c016306g.A02;
        if (!hashMap.isEmpty()) {
            printWriter.print(str);
            printWriter.println("Active Fragments:");
            for (C016206f c016206f : hashMap.values()) {
                printWriter.print(str);
                if (c016206f != null) {
                    Fragment fragment = c016206f.A02;
                    printWriter.println(fragment);
                    fragment.dump(A0R2, fileDescriptor, printWriter, strArr);
                } else {
                    printWriter.println("null");
                }
            }
        }
        ArrayList arrayList = c016306g.A01;
        int size2 = arrayList.size();
        if (size2 > 0) {
            printWriter.print(str);
            printWriter.println("Added Fragments:");
            int i = 0;
            do {
                Object obj = arrayList.get(i);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i);
                printWriter.print(": ");
                printWriter.println(obj.toString());
                i++;
            } while (i < size2);
        }
        ArrayList arrayList2 = this.A0M;
        int i2 = 0;
        if (arrayList2 != null && (size = arrayList2.size()) > 0) {
            printWriter.print(str);
            printWriter.println("Fragments Created Menus:");
            int i3 = 0;
            do {
                Object obj2 = this.A0M.get(i3);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i3);
                printWriter.print(": ");
                printWriter.println(obj2.toString());
                i3++;
            } while (i3 < size);
        }
        int size3 = this.A0E.size();
        if (size3 > 0) {
            printWriter.print(str);
            printWriter.println("Back Stack:");
            int i4 = 0;
            do {
                C14240no c14240no = (C14240no) this.A0E.get(i4);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i4);
                printWriter.print(": ");
                printWriter.println(c14240no.toString());
                c14240no.A0O(printWriter, A0R, true);
                i4++;
            } while (i4 < size3);
        }
        printWriter.print(str);
        printWriter.println(AnonymousClass001.A0O("Back Stack Index: ", this.A0a.get()));
        ArrayList arrayList3 = this.A0V;
        synchronized (arrayList3) {
            int size4 = arrayList3.size();
            if (size4 > 0) {
                printWriter.print(str);
                printWriter.println("Pending Actions:");
                do {
                    Object obj3 = (C06O) arrayList3.get(i2);
                    printWriter.print(str);
                    printWriter.print("  #");
                    printWriter.print(i2);
                    printWriter.print(": ");
                    printWriter.println(obj3);
                    i2++;
                } while (i2 < size4);
            }
        }
        printWriter.print(str);
        printWriter.println("FragmentManager misc state:");
        printWriter.print(str);
        printWriter.print("  mHost=");
        printWriter.println(this.A0A);
        printWriter.print(str);
        printWriter.print("  mContainer=");
        printWriter.println(this.A08);
        if (this.A06 != null) {
            printWriter.print(str);
            printWriter.print("  mParent=");
            printWriter.println(this.A06);
        }
        printWriter.print(str);
        printWriter.print("  mCurState=");
        printWriter.print(this.A00);
        printWriter.print(" mStateSaved=");
        printWriter.print(this.A0I);
        printWriter.print(" mStopped=");
        printWriter.print(this.A0J);
        printWriter.print(" mDestroyed=");
        printWriter.println(this.A0G);
        if (this.A0H) {
            printWriter.print(str);
            printWriter.print("  mNeedMenuInvalidate=");
            printWriter.println(this.A0H);
        }
    }

    public final boolean A11() {
        if (!this.A0I && !this.A0J) {
            return false;
        }
        return true;
    }

    public final boolean A13(Menu menu) {
        boolean z = false;
        if (this.A00 >= 1) {
            for (Fragment fragment : this.A0U.A04()) {
                if (fragment != null && fragment.isMenuVisible() && fragment.performPrepareOptionsMenu(menu)) {
                    z = true;
                }
            }
        }
        return z;
    }

    public final boolean A14(Menu menu, MenuInflater menuInflater) {
        int i = 0;
        if (this.A00 < 1) {
            return false;
        }
        ArrayList arrayList = null;
        boolean z = false;
        for (Fragment fragment : this.A0U.A04()) {
            if (fragment != null && fragment.isMenuVisible() && fragment.performCreateOptionsMenu(menu, menuInflater)) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(fragment);
                z = true;
            }
        }
        if (this.A0M != null) {
            while (true) {
                ArrayList arrayList2 = this.A0M;
                if (i >= arrayList2.size()) {
                    break;
                }
                Object obj = arrayList2.get(i);
                if (arrayList != null) {
                    arrayList.contains(obj);
                }
                i++;
            }
        }
        this.A0M = arrayList;
        return z;
    }

    public final boolean A15(MenuItem menuItem) {
        if (this.A00 >= 1) {
            for (Fragment fragment : this.A0U.A04()) {
                if (fragment != null && fragment.performContextItemSelected(menuItem)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final boolean A16(MenuItem menuItem) {
        if (this.A00 >= 1) {
            for (Fragment fragment : this.A0U.A04()) {
                if (fragment != null && fragment.performOptionsItemSelected(menuItem)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("FragmentManager{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" in ");
        Object obj = this.A06;
        String str = "}";
        if (obj == null && (obj = this.A0A) == null) {
            str = "null";
        } else {
            sb.append(obj.getClass().getSimpleName());
            sb.append("{");
            sb.append(Integer.toHexString(System.identityHashCode(obj)));
        }
        sb.append(str);
        sb.append("}}");
        return sb.toString();
    }

    public static Fragment A01(View view) {
        Fragment A02 = A02(view);
        if (A02 != null) {
            return A02;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("View ");
        sb.append(view);
        sb.append(" does not have a Fragment set");
        throw new IllegalStateException(sb.toString());
    }

    private void A07() {
        Iterator it = A03().iterator();
        while (it.hasNext()) {
            C07A c07a = (C07A) it.next();
            if (c07a.A00) {
                A0H(2);
                c07a.A00 = false;
                c07a.A06();
            }
        }
    }

    private void A08(Fragment fragment) {
        ViewGroup A00 = A00(fragment);
        if (A00 != null && fragment.getEnterAnim() + fragment.getExitAnim() + fragment.getPopEnterAnim() + fragment.getPopExitAnim() > 0) {
            if (A00.getTag(R.id.visible_removing_fragment_view_tag) == null) {
                A00.setTag(R.id.visible_removing_fragment_view_tag, fragment);
            }
            ((Fragment) A00.getTag(R.id.visible_removing_fragment_view_tag)).setPopDirection(fragment.getPopDirection());
        }
    }

    public static void A0A(AbstractC10360h2 abstractC10360h2) {
        Iterator it = abstractC10360h2.A03().iterator();
        while (it.hasNext()) {
            ((C07A) it.next()).A07();
        }
    }

    private void A0D(RuntimeException runtimeException) {
        android.util.Log.e("FragmentManager", runtimeException.getMessage());
        android.util.Log.e("FragmentManager", "Activity state:");
        PrintWriter printWriter = new PrintWriter(new C017906z());
        AbstractC10920i8 abstractC10920i8 = this.A0A;
        try {
            if (abstractC10920i8 != null) {
                ((C12460ko) abstractC10920i8).A00.dump("  ", null, printWriter, new String[0]);
                throw runtimeException;
            }
            A0z("  ", null, printWriter, new String[0]);
            throw runtimeException;
        } catch (Exception e) {
            android.util.Log.e("FragmentManager", "Failed dumping state", e);
            throw runtimeException;
        }
    }

    private void A0E(ArrayList arrayList, ArrayList arrayList2) {
        if (!arrayList.isEmpty()) {
            if (arrayList.size() == arrayList2.size()) {
                int size = arrayList.size();
                int i = 0;
                int i2 = 0;
                while (i < size) {
                    if (!((AbstractC016706m) arrayList.get(i)).A0G) {
                        if (i2 != i) {
                            A0F(arrayList, arrayList2, i2, i);
                        }
                        i2 = i + 1;
                        if (((Boolean) arrayList2.get(i)).booleanValue()) {
                            while (i2 < size && ((Boolean) arrayList2.get(i2)).booleanValue() && !((AbstractC016706m) arrayList.get(i2)).A0G) {
                                i2++;
                            }
                        }
                        A0F(arrayList, arrayList2, i, i2);
                        i = i2 - 1;
                    }
                    i++;
                }
                if (i2 != size) {
                    A0F(arrayList, arrayList2, i2, size);
                    return;
                }
                return;
            }
            throw new IllegalStateException("Internal error with the back stack records");
        }
    }

    public final Fragment A0P(Bundle bundle, String str) {
        String string = bundle.getString(str);
        if (string == null) {
            return null;
        }
        Fragment A00 = this.A0U.A00(string);
        if (A00 != null) {
            return A00;
        }
        A0D(new IllegalStateException(AnonymousClass001.A0u("Fragment no longer exists for key ", str, ": unique id ", string)));
        throw C00O.createAndThrow();
    }

    public final void A0o(Fragment fragment, boolean z) {
        ViewGroup A00 = A00(fragment);
        if (A00 != null && (A00 instanceof FragmentContainerView)) {
            ((FragmentContainerView) A00).A00 = !z;
        }
    }

    public final void A0u(final C06Z c06z, C07X c07x, final String str) {
        final C07T lifecycle = c07x.getLifecycle();
        if (lifecycle.A07() != C07S.DESTROYED) {
            InterfaceC09670ek interfaceC09670ek = new InterfaceC09670ek() { // from class: X.0kn
                @Override // X.InterfaceC09670ek
                public final void DoQ(C07R c07r, C07X c07x2) {
                    if (c07r == C07R.ON_START) {
                        Map map = AbstractC10360h2.this.A0Y;
                        String str2 = str;
                        Bundle bundle = (Bundle) map.get(str2);
                        if (bundle != null) {
                            c06z.DIA(str2, bundle);
                            map.remove(str2);
                            AbstractC10360h2.A0H(2);
                        }
                    }
                    if (c07r == C07R.ON_DESTROY) {
                        lifecycle.A0A(this);
                        AbstractC10360h2.this.A0X.remove(str);
                    }
                }
            };
            C10630hX c10630hX = (C10630hX) this.A0X.put(str, new C10630hX(c06z, lifecycle, interfaceC09670ek));
            if (c10630hX != null) {
                c10630hX.A00.A0A(c10630hX.A01);
            }
            A0H(2);
            lifecycle.A09(interfaceC09670ek);
        }
    }

    public final void A10(boolean z) {
        A0G(z);
        while (true) {
            ArrayList arrayList = this.A0P;
            ArrayList arrayList2 = this.A0O;
            ArrayList arrayList3 = this.A0V;
            synchronized (arrayList3) {
                if (arrayList3.isEmpty()) {
                    break;
                }
                try {
                    int size = arrayList3.size();
                    boolean z2 = false;
                    for (int i = 0; i < size; i++) {
                        z2 |= ((C06O) arrayList3.get(i)).AWw(arrayList, arrayList2);
                    }
                    if (!z2) {
                        break;
                    }
                    this.mExecutingActions = true;
                    try {
                        A0E(this.A0P, this.A0O);
                    } finally {
                        A05();
                    }
                } finally {
                    arrayList3.clear();
                    this.A0A.A02.removeCallbacks(this.A0C);
                }
            }
        }
        A0B(this);
        A06();
        this.A0U.A02.values().removeAll(Collections.singleton(null));
    }
}
