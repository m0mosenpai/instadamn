package X;

import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;

/* loaded from: classes10.dex */
public final class SZp {
    public Runnable A01;
    public boolean A02;
    public final AbstractC62998SaM A04 = new Object();
    public final AbstractC62998SaM A06 = new Object();
    public final AbstractC62998SaM A05 = new Object();
    public final SparseArray A03 = new SparseArray(0);
    public long A00 = -1;

    public static void A00(View view, SZp sZp) {
        view.setClickable(false);
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                A00(viewGroup.getChildAt(i), sZp);
            }
        }
    }

    public final boolean A02(View view) {
        if (view != null) {
            return (this.A02 && view.getParent() != null) || this.A03.get(view.getId()) != null;
        }
        return false;
    }

    public final void A01() {
        AbstractC62998SaM abstractC62998SaM = this.A04;
        abstractC62998SaM.A03 = null;
        abstractC62998SaM.A01 = 0;
        abstractC62998SaM.A00 = 0;
        abstractC62998SaM.A02 = null;
        AbstractC62998SaM abstractC62998SaM2 = this.A06;
        abstractC62998SaM2.A03 = null;
        abstractC62998SaM2.A01 = 0;
        abstractC62998SaM2.A00 = 0;
        abstractC62998SaM2.A02 = null;
        AbstractC62998SaM abstractC62998SaM3 = this.A05;
        abstractC62998SaM3.A03 = null;
        abstractC62998SaM3.A01 = 0;
        abstractC62998SaM3.A00 = 0;
        abstractC62998SaM3.A02 = null;
        this.A01 = null;
        this.A02 = false;
        this.A00 = -1L;
    }
}
