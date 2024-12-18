package X;

import android.os.BadParcelableException;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentState;
import com.facebook.R;
import com.instagram.react.modules.product.IgReactPurchaseExperienceBridgeModule;
import java.util.ArrayList;

/* renamed from: X.06f, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C016206f {
    public final Fragment A02;
    public final C06G A03;
    public final C016306g A04;
    public boolean A01 = false;
    public int A00 = -1;

    public final Bundle A00() {
        Bundle bundle;
        Bundle bundle2 = new Bundle();
        Fragment fragment = this.A02;
        if (fragment.mState == -1 && (bundle = fragment.mSavedFragmentState) != null) {
            bundle2.putAll(bundle);
        }
        bundle2.putParcelable(IgReactPurchaseExperienceBridgeModule.RN_SHOP_PAY_STATE, new FragmentState(fragment));
        if (fragment.mState > -1) {
            Bundle bundle3 = new Bundle();
            fragment.onSaveInstanceState(bundle3);
            if (!bundle3.isEmpty()) {
                bundle2.putBundle("savedInstanceState", bundle3);
            }
            this.A03.A04(bundle3, fragment, false);
            Bundle bundle4 = new Bundle();
            fragment.mSavedStateRegistryController.A01.A02(bundle4);
            if (!bundle4.isEmpty()) {
                bundle2.putBundle("registryState", bundle4);
            }
            Bundle A0M = fragment.mChildFragmentManager.A0M();
            if (!A0M.isEmpty()) {
                bundle2.putBundle("childFragmentManager", A0M);
            }
            if (fragment.mView != null) {
                A04();
            }
            SparseArray<? extends Parcelable> sparseArray = fragment.mSavedViewState;
            if (sparseArray != null) {
                bundle2.putSparseParcelableArray("viewState", sparseArray);
            }
            Bundle bundle5 = fragment.mSavedViewRegistryState;
            if (bundle5 != null) {
                bundle2.putBundle("viewRegistryState", bundle5);
            }
        }
        Bundle bundle6 = fragment.mArguments;
        if (bundle6 != null) {
            bundle2.putBundle("arguments", bundle6);
        }
        return bundle2;
    }

    public final void A01() {
        View view;
        View view2;
        final Fragment fragment = this.A02;
        final Fragment A02 = AbstractC10360h2.A02(fragment.mContainer);
        Fragment fragment2 = fragment.mParentFragment;
        if (A02 != null && !A02.equals(fragment2)) {
            final int i = fragment.mContainerId;
            C07K c07k = C07K.A01;
            C07L c07l = new C07L(fragment, A02, i) { // from class: X.0fD
                public final Fragment A00;

                /* JADX WARN: Illegal instructions before constructor call */
                {
                    /*
                        r2 = this;
                        java.lang.StringBuilder r1 = new java.lang.StringBuilder
                        r1.<init>()
                        java.lang.String r0 = "Attempting to nest fragment "
                        r1.append(r0)
                        r1.append(r3)
                        java.lang.String r0 = " within the view of parent fragment "
                        r1.append(r0)
                        r1.append(r4)
                        java.lang.String r0 = " via container with ID "
                        r1.append(r0)
                        r1.append(r5)
                        java.lang.String r0 = " without using parent's childFragmentManager"
                        r1.append(r0)
                        java.lang.String r0 = r1.toString()
                        r2.<init>(r3, r0)
                        r2.A00 = r4
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: X.C0fD.<init>(androidx.fragment.app.Fragment, androidx.fragment.app.Fragment, int):void");
                }
            };
            AbstractC10360h2.A0H(3);
            C07J A00 = C07K.A00(fragment);
            if (A00.A01.contains(C07F.DETECT_WRONG_NESTED_HIERARCHY) && C07K.A05(A00, fragment.getClass(), c07l.getClass())) {
                C07K.A04(A00, c07l);
            }
        }
        C016306g c016306g = this.A04;
        ViewGroup viewGroup = fragment.mContainer;
        int i2 = -1;
        if (viewGroup != null) {
            ArrayList arrayList = c016306g.A01;
            int indexOf = arrayList.indexOf(fragment);
            int i3 = indexOf - 1;
            while (true) {
                if (i3 < 0) {
                    while (true) {
                        indexOf++;
                        if (indexOf >= arrayList.size()) {
                            break;
                        }
                        Fragment fragment3 = (Fragment) arrayList.get(indexOf);
                        if (fragment3.mContainer == viewGroup && (view = fragment3.mView) != null) {
                            i2 = viewGroup.indexOfChild(view);
                            break;
                        }
                    }
                } else {
                    Fragment fragment4 = (Fragment) arrayList.get(i3);
                    if (fragment4.mContainer == viewGroup && (view2 = fragment4.mView) != null) {
                        i2 = viewGroup.indexOfChild(view2) + 1;
                        break;
                    }
                    i3--;
                }
            }
        }
        fragment.mContainer.addView(fragment.mView, i2);
    }

    public final void A02() {
        Bundle bundle;
        Fragment fragment = this.A02;
        if (fragment.mFromLayout && fragment.mInLayout && !fragment.mPerformedCreateView) {
            AbstractC10360h2.A0H(3);
            Bundle bundle2 = fragment.mSavedFragmentState;
            if (bundle2 != null) {
                bundle = bundle2.getBundle("savedInstanceState");
            } else {
                bundle = null;
            }
            LayoutInflater onGetLayoutInflater = fragment.onGetLayoutInflater(bundle);
            fragment.mLayoutInflater = onGetLayoutInflater;
            fragment.performCreateView(onGetLayoutInflater, null, bundle);
            View view = fragment.mView;
            if (view != null) {
                view.setSaveFromParentEnabled(false);
                fragment.mView.setTag(R.id.fragment_container_view_tag, fragment);
                if (fragment.mHidden) {
                    fragment.mView.setVisibility(8);
                }
                fragment.performViewCreated();
                this.A03.A00(bundle, fragment.mView, fragment, false);
                fragment.mState = 2;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:138:0x0022, code lost:
    
        continue;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:140:0x0236. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:16:0x001f. Please report as an issue. */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A03() {
        /*
            Method dump skipped, instructions count: 1472
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C016206f.A03():void");
    }

    public final void A04() {
        Fragment fragment = this.A02;
        if (fragment.mView != null) {
            AbstractC10360h2.A0H(2);
            SparseArray<Parcelable> sparseArray = new SparseArray<>();
            fragment.mView.saveHierarchyState(sparseArray);
            if (sparseArray.size() > 0) {
                fragment.mSavedViewState = sparseArray;
            }
            Bundle bundle = new Bundle();
            fragment.mViewLifecycleOwner.A01.A01.A02(bundle);
            if (!bundle.isEmpty()) {
                fragment.mSavedViewRegistryState = bundle;
            }
        }
    }

    public final void A05(ClassLoader classLoader) {
        Fragment fragment = this.A02;
        Bundle bundle = fragment.mSavedFragmentState;
        if (bundle != null) {
            bundle.setClassLoader(classLoader);
            if (fragment.mSavedFragmentState.getBundle("savedInstanceState") == null) {
                fragment.mSavedFragmentState.putBundle("savedInstanceState", new Bundle());
            }
            try {
                fragment.mSavedViewState = fragment.mSavedFragmentState.getSparseParcelableArray("viewState");
                fragment.mSavedViewRegistryState = fragment.mSavedFragmentState.getBundle("viewRegistryState");
                FragmentState fragmentState = (FragmentState) fragment.mSavedFragmentState.getParcelable(IgReactPurchaseExperienceBridgeModule.RN_SHOP_PAY_STATE);
                if (fragmentState != null) {
                    fragment.mTargetWho = fragmentState.A06;
                    fragment.mTargetRequestCode = fragmentState.A03;
                    Boolean bool = fragment.mSavedUserVisibleHint;
                    if (bool != null) {
                        fragment.mUserVisibleHint = bool.booleanValue();
                        fragment.mSavedUserVisibleHint = null;
                    } else {
                        fragment.mUserVisibleHint = fragmentState.A0E;
                    }
                }
                if (!fragment.mUserVisibleHint) {
                    fragment.mDeferStart = true;
                }
            } catch (BadParcelableException e) {
                StringBuilder sb = new StringBuilder();
                sb.append("Failed to restore view hierarchy state for fragment ");
                sb.append(fragment);
                throw new IllegalStateException(sb.toString(), e);
            }
        }
    }

    public C016206f(Bundle bundle, Fragment fragment, C06G c06g, C016306g c016306g) {
        String str;
        this.A03 = c06g;
        this.A04 = c016306g;
        this.A02 = fragment;
        fragment.mSavedViewState = null;
        fragment.mSavedViewRegistryState = null;
        fragment.mBackStackNesting = 0;
        fragment.mInLayout = false;
        fragment.mAdded = false;
        Fragment fragment2 = fragment.mTarget;
        if (fragment2 != null) {
            str = fragment2.mWho;
        } else {
            str = null;
        }
        fragment.mTargetWho = str;
        fragment.mTarget = null;
        fragment.mSavedFragmentState = bundle;
        fragment.mArguments = bundle.getBundle("arguments");
    }

    public C016206f(Fragment fragment, C06G c06g, C016306g c016306g) {
        this.A03 = c06g;
        this.A04 = c016306g;
        this.A02 = fragment;
    }

    public C016206f(Bundle bundle, C06B c06b, C06G c06g, C016306g c016306g, ClassLoader classLoader) {
        this.A03 = c06g;
        this.A04 = c016306g;
        FragmentState fragmentState = (FragmentState) bundle.getParcelable(IgReactPurchaseExperienceBridgeModule.RN_SHOP_PAY_STATE);
        Fragment A01 = c06b.A01(classLoader, fragmentState.A04);
        A01.mWho = fragmentState.A07;
        A01.mFromLayout = fragmentState.A09;
        A01.mInDynamicContainer = fragmentState.A0B;
        A01.mRestored = true;
        A01.mFragmentId = fragmentState.A01;
        A01.mContainerId = fragmentState.A00;
        A01.mTag = fragmentState.A05;
        A01.mRetainInstance = fragmentState.A0D;
        A01.mRemoving = fragmentState.A0C;
        A01.mDetached = fragmentState.A08;
        A01.mHidden = fragmentState.A0A;
        A01.mMaxState = C07S.values()[fragmentState.A02];
        A01.mTargetWho = fragmentState.A06;
        A01.mTargetRequestCode = fragmentState.A03;
        A01.mUserVisibleHint = fragmentState.A0E;
        this.A02 = A01;
        A01.mSavedFragmentState = bundle;
        Bundle bundle2 = bundle.getBundle("arguments");
        if (bundle2 != null) {
            bundle2.setClassLoader(classLoader);
        }
        A01.setArguments(bundle2);
        AbstractC10360h2.A0H(2);
    }
}
