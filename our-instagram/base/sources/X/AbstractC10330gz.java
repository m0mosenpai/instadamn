package X;

import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import java.util.ArrayList;

@Deprecated
/* renamed from: X.0gz, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC10330gz extends AbstractC021208i {
    public boolean A04;
    public final int A05;
    public final AbstractC10360h2 A06;
    public AbstractC016706m A01 = null;
    public ArrayList A03 = new ArrayList();
    public ArrayList A02 = new ArrayList();
    public Fragment A00 = null;

    public abstract Fragment A00(int i);

    @Override // X.AbstractC021208i
    public void destroyItem(ViewGroup viewGroup, int i, Object obj) {
        ArrayList arrayList;
        Fragment.SavedState savedState;
        Fragment fragment = (Fragment) obj;
        if (this.A01 == null) {
            this.A01 = new C14240no(this.A06);
        }
        while (true) {
            arrayList = this.A03;
            if (arrayList.size() > i) {
                break;
            } else {
                arrayList.add(null);
            }
        }
        if (fragment.isAdded()) {
            savedState = this.A06.A0N(fragment);
        } else {
            savedState = null;
        }
        arrayList.set(i, savedState);
        this.A02.set(i, null);
        this.A01.A03(fragment);
        if (fragment.equals(this.A00)) {
            this.A00 = null;
        }
    }

    @Override // X.AbstractC021208i
    public final void finishUpdate(ViewGroup viewGroup) {
        AbstractC016706m abstractC016706m = this.A01;
        if (abstractC016706m != null) {
            if (!this.A04) {
                try {
                    this.A04 = true;
                    abstractC016706m.A06();
                } finally {
                    this.A04 = false;
                }
            }
            this.A01 = null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x000c, code lost:
    
        if (r3 != null) goto L6;
     */
    @Override // X.AbstractC021208i
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object instantiateItem(android.view.ViewGroup r6, int r7) {
        /*
            r5 = this;
            java.util.ArrayList r4 = r5.A02
            int r0 = r4.size()
            if (r0 <= r7) goto Lf
            java.lang.Object r3 = r4.get(r7)
            if (r3 == 0) goto Lf
        Le:
            return r3
        Lf:
            X.06m r0 = r5.A01
            if (r0 != 0) goto L1c
            X.0h2 r1 = r5.A06
            X.0no r0 = new X.0no
            r0.<init>(r1)
            r5.A01 = r0
        L1c:
            androidx.fragment.app.Fragment r3 = r5.A00(r7)
            java.util.ArrayList r1 = r5.A03
            int r0 = r1.size()
            if (r0 <= r7) goto L33
            java.lang.Object r0 = r1.get(r7)
            androidx.fragment.app.Fragment$SavedState r0 = (androidx.fragment.app.Fragment.SavedState) r0
            if (r0 == 0) goto L33
            r3.setInitialSavedState(r0)
        L33:
            int r0 = r4.size()
            if (r0 > r7) goto L3e
            r0 = 0
            r4.add(r0)
            goto L33
        L3e:
            r0 = 0
            r3.setMenuVisibility(r0)
            int r2 = r5.A05
            if (r2 != 0) goto L49
            r3.setUserVisibleHint(r0)
        L49:
            r4.set(r7, r3)
            X.06m r1 = r5.A01
            int r0 = r6.getId()
            r1.A09(r3, r0)
            r0 = 1
            if (r2 != r0) goto Le
            X.06m r1 = r5.A01
            X.07S r0 = X.C07S.STARTED
            r1.A04(r3, r0)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC10330gz.instantiateItem(android.view.ViewGroup, int):java.lang.Object");
    }

    @Override // X.AbstractC021208i
    public final boolean isViewFromObject(View view, Object obj) {
        if (((Fragment) obj).mView != view) {
            return false;
        }
        return true;
    }

    @Override // X.AbstractC021208i
    public void restoreState(Parcelable parcelable, ClassLoader classLoader) {
        if (parcelable != null) {
            Bundle bundle = (Bundle) parcelable;
            bundle.setClassLoader(classLoader);
            Parcelable[] parcelableArray = bundle.getParcelableArray("states");
            ArrayList arrayList = this.A03;
            arrayList.clear();
            ArrayList arrayList2 = this.A02;
            arrayList2.clear();
            if (parcelableArray != null) {
                for (Parcelable parcelable2 : parcelableArray) {
                    arrayList.add(parcelable2);
                }
            }
            for (String str : bundle.keySet()) {
                if (str.startsWith("f")) {
                    int parseInt = Integer.parseInt(str.substring(1));
                    Fragment A0P = this.A06.A0P(bundle, str);
                    if (A0P == null) {
                        android.util.Log.w("FragmentStatePagerAdapt", AnonymousClass001.A0R("Bad fragment at key ", str));
                    } else {
                        while (arrayList2.size() <= parseInt) {
                            arrayList2.add(null);
                        }
                        A0P.setMenuVisibility(false);
                        arrayList2.set(parseInt, A0P);
                    }
                }
            }
        }
    }

    @Override // X.AbstractC021208i
    public final Parcelable saveState() {
        Bundle bundle;
        ArrayList arrayList = this.A03;
        if (arrayList.size() > 0) {
            bundle = new Bundle();
            Fragment.SavedState[] savedStateArr = new Fragment.SavedState[arrayList.size()];
            arrayList.toArray(savedStateArr);
            bundle.putParcelableArray("states", savedStateArr);
        } else {
            bundle = null;
        }
        int i = 0;
        while (true) {
            ArrayList arrayList2 = this.A02;
            if (i < arrayList2.size()) {
                Fragment fragment = (Fragment) arrayList2.get(i);
                if (fragment != null && fragment.isAdded()) {
                    if (bundle == null) {
                        bundle = new Bundle();
                    }
                    this.A06.A0f(bundle, fragment, AnonymousClass001.A0O("f", i));
                }
                i++;
            } else {
                return bundle;
            }
        }
    }

    @Override // X.AbstractC021208i
    public final void setPrimaryItem(ViewGroup viewGroup, int i, Object obj) {
        Fragment fragment = (Fragment) obj;
        Fragment fragment2 = this.A00;
        if (fragment != fragment2) {
            if (fragment2 != null) {
                fragment2.setMenuVisibility(false);
                if (this.A05 == 1) {
                    AbstractC016706m abstractC016706m = this.A01;
                    if (abstractC016706m == null) {
                        abstractC016706m = new C14240no(this.A06);
                        this.A01 = abstractC016706m;
                    }
                    abstractC016706m.A04(this.A00, C07S.STARTED);
                } else {
                    this.A00.setUserVisibleHint(false);
                }
            }
            fragment.setMenuVisibility(true);
            if (this.A05 == 1) {
                AbstractC016706m abstractC016706m2 = this.A01;
                if (abstractC016706m2 == null) {
                    abstractC016706m2 = new C14240no(this.A06);
                    this.A01 = abstractC016706m2;
                }
                abstractC016706m2.A04(fragment, C07S.RESUMED);
            } else {
                fragment.setUserVisibleHint(true);
            }
            this.A00 = fragment;
        }
    }

    public AbstractC10330gz(AbstractC10360h2 abstractC10360h2, int i) {
        this.A06 = abstractC10360h2;
        this.A05 = i;
    }

    @Override // X.AbstractC021208i
    public final void startUpdate(ViewGroup viewGroup) {
        if (viewGroup.getId() != -1) {
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("ViewPager with adapter ");
        sb.append(this);
        sb.append(" requires a view id");
        throw new IllegalStateException(sb.toString());
    }
}
