package X;

import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import java.util.List;
import java.util.Map;

/* renamed from: X.JeN, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public abstract class AbstractC44098JeN extends AbstractC021208i {
    public static final boolean DEBUG = false;
    public static final String TAG = "FragmentPagerAdapter";
    public ViewGroup mContainer;
    public final AbstractC10360h2 mFragmentManager;
    public List mFragmentsWithDeferredMenuVisibility;
    public AbstractC016706m mCurTransaction = null;
    public Fragment mCurrentPrimaryItem = null;
    public final Map mCreatedFragment = AbstractC166987dD.A1I();

    public abstract Fragment createItem(int i);

    public long getItemId(int i) {
        return i;
    }

    @Override // X.AbstractC021208i
    public void restoreState(Parcelable parcelable, ClassLoader classLoader) {
    }

    @Override // X.AbstractC021208i
    public Parcelable saveState() {
        return null;
    }

    @Override // X.AbstractC021208i
    public void destroyItem(ViewGroup viewGroup, int i, Object obj) {
        AbstractC016706m abstractC016706m = this.mCurTransaction;
        if (abstractC016706m == null) {
            abstractC016706m = new C14240no(this.mFragmentManager);
            this.mCurTransaction = abstractC016706m;
        }
        abstractC016706m.A02((Fragment) obj);
    }

    @Override // X.AbstractC021208i
    public void finishUpdate(ViewGroup viewGroup) {
        List<Fragment> list = this.mFragmentsWithDeferredMenuVisibility;
        if (list != null) {
            for (Fragment fragment : list) {
                if (fragment != this.mCurrentPrimaryItem) {
                    fragment.setMenuVisibility(false);
                }
            }
            this.mFragmentsWithDeferredMenuVisibility = null;
        }
        AbstractC016706m abstractC016706m = this.mCurTransaction;
        if (abstractC016706m != null) {
            abstractC016706m.A01();
            this.mCurTransaction = null;
            this.mFragmentManager.A0Z();
        }
        Fragment fragment2 = this.mCurrentPrimaryItem;
        if (fragment2 != null) {
            if (!fragment2.mUserVisibleHint) {
                fragment2.setUserVisibleHint(true);
            }
            if (!fragment2.isMenuVisible()) {
                fragment2.setMenuVisibility(true);
            }
        }
    }

    public final Fragment getItem(int i) {
        this.mContainer.getClass();
        String makeFragmentName = makeFragmentName(this.mContainer.getId(), i);
        Fragment A0Q = this.mFragmentManager.A0Q(makeFragmentName);
        if (A0Q == null) {
            Fragment fragment = (Fragment) this.mCreatedFragment.get(makeFragmentName);
            if (fragment == null) {
                Fragment createItem = createItem(i);
                this.mCreatedFragment.put(makeFragmentName, createItem);
                return createItem;
            }
            return fragment;
        }
        return A0Q;
    }

    @Override // X.AbstractC021208i
    public Object instantiateItem(ViewGroup viewGroup, int i) {
        if (this.mCurTransaction == null) {
            this.mCurTransaction = new C14240no(this.mFragmentManager);
        }
        long j = i;
        String makeFragmentName = makeFragmentName(viewGroup.getId(), j);
        Fragment A0Q = this.mFragmentManager.A0Q(makeFragmentName);
        if (A0Q != null) {
            this.mCurTransaction.A08(A0Q);
        } else {
            A0Q = getItem(i);
            this.mCurTransaction.A0C(A0Q, makeFragmentName(viewGroup.getId(), j), viewGroup.getId());
            this.mCreatedFragment.remove(makeFragmentName);
        }
        List list = this.mFragmentsWithDeferredMenuVisibility;
        if (list != null) {
            list.add(A0Q);
        }
        if (A0Q != this.mCurrentPrimaryItem) {
            A0Q.setUserVisibleHint(false);
            if (this.mFragmentsWithDeferredMenuVisibility == null) {
                A0Q.setMenuVisibility(false);
            }
        }
        return A0Q;
    }

    @Override // X.AbstractC021208i
    public boolean isViewFromObject(View view, Object obj) {
        return AbstractC167007dF.A1X(((Fragment) obj).mView, view);
    }

    public void setContainer(ViewGroup viewGroup) {
        this.mContainer = viewGroup;
    }

    @Override // X.AbstractC021208i
    public void setPrimaryItem(ViewGroup viewGroup, int i, Object obj) {
        Fragment fragment = (Fragment) obj;
        Fragment fragment2 = this.mCurrentPrimaryItem;
        if (fragment != fragment2) {
            if (fragment2 != null) {
                fragment2.setMenuVisibility(false);
                fragment2.setUserVisibleHint(false);
            }
            this.mCurrentPrimaryItem = fragment;
        }
    }

    public AbstractC44098JeN(AbstractC10360h2 abstractC10360h2) {
        this.mFragmentManager = abstractC10360h2;
    }

    public static String makeFragmentName(int i, long j) {
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("android:switcher:");
        A1C.append(i);
        A1C.append(":");
        A1C.append(j);
        return A1C.toString();
    }

    @Override // X.AbstractC021208i
    public void startUpdate(ViewGroup viewGroup) {
        this.mFragmentsWithDeferredMenuVisibility = AbstractC166987dD.A1E();
    }
}
