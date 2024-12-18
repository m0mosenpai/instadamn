package X;

import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;

@Deprecated
/* renamed from: X.0h1, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC10350h1 extends AbstractC021208i {
    public boolean A02;
    public final int A03;
    public final AbstractC10360h2 A04;
    public AbstractC016706m A01 = null;
    public Fragment A00 = null;

    public long A00(int i) {
        return i;
    }

    public abstract Fragment A01(int i);

    @Override // X.AbstractC021208i
    public final void destroyItem(ViewGroup viewGroup, int i, Object obj) {
        Fragment fragment = (Fragment) obj;
        AbstractC016706m abstractC016706m = this.A01;
        if (abstractC016706m == null) {
            abstractC016706m = new C14240no(this.A04);
            this.A01 = abstractC016706m;
        }
        abstractC016706m.A02(fragment);
        if (fragment.equals(this.A00)) {
            this.A00 = null;
        }
    }

    @Override // X.AbstractC021208i
    public final void finishUpdate(ViewGroup viewGroup) {
        AbstractC016706m abstractC016706m = this.A01;
        if (abstractC016706m != null) {
            if (!this.A02) {
                try {
                    this.A02 = true;
                    abstractC016706m.A06();
                } finally {
                    this.A02 = false;
                }
            }
            this.A01 = null;
        }
    }

    @Override // X.AbstractC021208i
    public final Object instantiateItem(ViewGroup viewGroup, int i) {
        if (this.A01 == null) {
            this.A01 = new C14240no(this.A04);
        }
        long A00 = A00(i);
        int id = viewGroup.getId();
        StringBuilder sb = new StringBuilder();
        sb.append("android:switcher:");
        sb.append(id);
        sb.append(":");
        sb.append(A00);
        Fragment A0Q = this.A04.A0Q(sb.toString());
        if (A0Q != null) {
            this.A01.A08(A0Q);
        } else {
            A0Q = A01(i);
            AbstractC016706m abstractC016706m = this.A01;
            int id2 = viewGroup.getId();
            int id3 = viewGroup.getId();
            StringBuilder sb2 = new StringBuilder();
            sb2.append("android:switcher:");
            sb2.append(id3);
            sb2.append(":");
            sb2.append(A00);
            abstractC016706m.A0C(A0Q, sb2.toString(), id2);
        }
        if (A0Q != this.A00) {
            A0Q.setMenuVisibility(false);
            if (this.A03 == 1) {
                this.A01.A04(A0Q, C07S.STARTED);
            } else {
                A0Q.setUserVisibleHint(false);
                return A0Q;
            }
        }
        return A0Q;
    }

    @Override // X.AbstractC021208i
    public final boolean isViewFromObject(View view, Object obj) {
        if (((Fragment) obj).mView != view) {
            return false;
        }
        return true;
    }

    @Override // X.AbstractC021208i
    public final void setPrimaryItem(ViewGroup viewGroup, int i, Object obj) {
        Fragment fragment = (Fragment) obj;
        Fragment fragment2 = this.A00;
        if (fragment != fragment2) {
            if (fragment2 != null) {
                fragment2.setMenuVisibility(false);
                if (this.A03 == 1) {
                    AbstractC016706m abstractC016706m = this.A01;
                    if (abstractC016706m == null) {
                        abstractC016706m = new C14240no(this.A04);
                        this.A01 = abstractC016706m;
                    }
                    abstractC016706m.A04(this.A00, C07S.STARTED);
                } else {
                    this.A00.setUserVisibleHint(false);
                }
            }
            fragment.setMenuVisibility(true);
            if (this.A03 == 1) {
                AbstractC016706m abstractC016706m2 = this.A01;
                if (abstractC016706m2 == null) {
                    abstractC016706m2 = new C14240no(this.A04);
                    this.A01 = abstractC016706m2;
                }
                abstractC016706m2.A04(fragment, C07S.RESUMED);
            } else {
                fragment.setUserVisibleHint(true);
            }
            this.A00 = fragment;
        }
    }

    public AbstractC10350h1(AbstractC10360h2 abstractC10360h2, int i) {
        this.A04 = abstractC10360h2;
        this.A03 = i;
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
