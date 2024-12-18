package X;

import android.view.View;

/* loaded from: classes9.dex */
public final class PIM implements GYX {
    public final int A00;
    public final Object A01;

    public PIM(N5Z n5z, int i) {
        this.A00 = i;
        this.A01 = n5z;
    }

    @Override // X.GYX
    public final View getRowView() {
        View view;
        int i = this.A00;
        N5Z n5z = (N5Z) this.A01;
        switch (i) {
            case 0:
                view = n5z.A08;
                if (view == null) {
                    throw AbstractC166987dD.A14("Should only be called between onCreateView and onDestroyView");
                }
                return view;
            case 1:
                view = n5z.A05;
                if (view == null) {
                    throw AbstractC166987dD.A14("Should only be called between onCreateView and onDestroyView");
                }
                return view;
            default:
                view = n5z.A04;
                if (view == null) {
                    throw AbstractC166987dD.A14("Should only be called between onCreateView and onDestroyView");
                }
                return view;
        }
    }
}
