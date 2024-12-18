package X;

import android.content.Context;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;

/* renamed from: X.DsO, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C31479DsO implements C38D {
    public final Context A00;
    public final FragmentActivity A01;

    @Override // X.C38D
    public final Fragment B8M() {
        return null;
    }

    @Override // X.C38D
    public final C38P BlJ() {
        return null;
    }

    @Override // X.C38D
    public final int Bo2() {
        return -1;
    }

    @Override // X.C38D
    public final C38J Br4() {
        return null;
    }

    @Override // X.C38D
    public final View getRootView() {
        return null;
    }

    @Override // X.C38D
    public final boolean isResumed() {
        return true;
    }

    public C31479DsO(Context context, FragmentActivity fragmentActivity) {
        this.A01 = fragmentActivity;
        this.A00 = context;
    }

    @Override // X.C38D
    public final FragmentActivity getActivity() {
        return this.A01;
    }

    @Override // X.C38D
    public final Context getContext() {
        return this.A00;
    }
}
