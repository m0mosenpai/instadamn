package X;

import android.view.View;
import android.view.ViewStub;

/* renamed from: X.3PX, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C3PX {
    public View A00;
    public final int A01;
    public final View A02;
    public final ViewStub A03;

    public final View A00() {
        View view = this.A00;
        if (view == null) {
            ViewStub viewStub = this.A03;
            if (viewStub != null) {
                if (viewStub.getParent() != null) {
                    View inflate = viewStub.inflate();
                    C14360o3.A0C(inflate, "null cannot be cast to non-null type T of com.instagram.ui.autostub.AutoViewStub._get_view_$lambda$2");
                    inflate.setTag(Integer.valueOf(this.A01));
                    this.A00 = inflate;
                    return inflate;
                }
                View findViewWithTag = this.A02.findViewWithTag(Integer.valueOf(this.A01));
                this.A00 = findViewWithTag;
                C14360o3.A0A(findViewWithTag);
                return findViewWithTag;
            }
            throw new IllegalStateException("Required value was null.");
        }
        return view;
    }

    public final boolean A01() {
        if (this.A00 == null) {
            return false;
        }
        return true;
    }

    public C3PX(View view, View view2, ViewStub viewStub, int i) {
        this.A01 = i;
        if ((viewStub != null) ^ (view2 != null)) {
            this.A02 = view;
            this.A00 = view2;
            this.A03 = viewStub;
            return;
        }
        throw new IllegalStateException("Check failed.");
    }
}
