package X;

import android.view.View;
import androidx.fragment.app.Fragment;

/* renamed from: X.0j3, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C11450j3 extends AnonymousClass067 {
    public final /* synthetic */ Fragment A00;

    public C11450j3(Fragment fragment) {
        this.A00 = fragment;
    }

    @Override // X.AnonymousClass067
    public final View A00(int i) {
        Fragment fragment = this.A00;
        View view = fragment.mView;
        if (view != null) {
            return view.findViewById(i);
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Fragment ");
        sb.append(fragment);
        sb.append(" does not have a view");
        throw new IllegalStateException(sb.toString());
    }

    @Override // X.AnonymousClass067
    public final boolean A01() {
        if (this.A00.mView == null) {
            return false;
        }
        return true;
    }
}
