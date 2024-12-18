package X;

import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes11.dex */
public final class UHE extends C1I4 {
    @Override // X.C1I4
    public final void onScrolled(RecyclerView recyclerView, int i, int i2) {
        int A0N = AbstractC167017dG.A0N(recyclerView, 1550324123);
        int childCount = recyclerView.getChildCount();
        if (childCount >= 0) {
            int i3 = 0;
            while (true) {
                if (recyclerView.getChildAt(i3) instanceof ViewGroup) {
                    C2FP.A0H();
                }
                if (i3 == childCount) {
                    break;
                } else {
                    i3++;
                }
            }
        }
        C0f9.A0A(2135194798, A0N);
    }
}
