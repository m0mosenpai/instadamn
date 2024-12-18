package X;

import android.content.Context;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;

/* renamed from: X.38C, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C38C implements C38D {
    public final int A00;
    public final Fragment A01;

    public C38C(Fragment fragment) {
        this(fragment, -1);
    }

    @Override // X.C38D
    public final Fragment B8M() {
        return this.A01;
    }

    @Override // X.C38D
    public final C38P BlJ() {
        Fragment fragment = this.A01;
        if (fragment instanceof C38P) {
            return (C38P) fragment;
        }
        return null;
    }

    @Override // X.C38D
    public final int Bo2() {
        return this.A00;
    }

    @Override // X.C38D
    public final C38J Br4() {
        Fragment fragment = this.A01;
        if (fragment instanceof C38J) {
            return (C38J) fragment;
        }
        return null;
    }

    @Override // X.C38D
    public final FragmentActivity getActivity() {
        return this.A01.getActivity();
    }

    @Override // X.C38D
    public final Context getContext() {
        return this.A01.getContext();
    }

    @Override // X.C38D
    public final View getRootView() {
        return this.A01.mView;
    }

    @Override // X.C38D
    public final boolean isResumed() {
        return this.A01.isResumed();
    }

    public C38C(Fragment fragment, int i) {
        this.A01 = fragment;
        this.A00 = i;
    }
}
