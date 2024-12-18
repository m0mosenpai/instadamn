package X;

import android.content.Context;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.R;

/* renamed from: X.GqJ, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC38152GqJ {
    public static final int A00(ViewGroup viewGroup, ViewOnTouchListenerC60632pm viewOnTouchListenerC60632pm, InterfaceC65252xN interfaceC65252xN, C3FQ c3fq, int i) {
        AbstractC167017dG.A1R(interfaceC65252xN, viewGroup);
        viewGroup.measure(0, 0);
        int measuredHeight = viewGroup.getMeasuredHeight() + i;
        Context context = c3fq.getContext();
        C14360o3.A07(context);
        int A00 = C3HB.A00(context) + measuredHeight;
        viewOnTouchListenerC60632pm.A06(interfaceC65252xN, c3fq, A00);
        return A00;
    }

    public static final void A01(RecyclerView recyclerView) {
        C14360o3.A0B(recyclerView, 0);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(recyclerView.getContext(), 0, false);
        linearLayoutManager.A12(true);
        recyclerView.setLayoutManager(linearLayoutManager);
        int dimensionPixelSize = recyclerView.getResources().getDimensionPixelSize(R.dimen.abc_button_inset_vertical_material);
        recyclerView.A10(new C3YB(dimensionPixelSize, dimensionPixelSize));
    }
}
