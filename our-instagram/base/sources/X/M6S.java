package X;

import android.view.View;
import android.view.ViewGroup;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.common.ui.widget.prioritizedverticallayout.IgPrioritizedVerticalLayout;

/* loaded from: classes8.dex */
public final class M6S implements Runnable {
    public final /* synthetic */ View A00;
    public final /* synthetic */ IgTextView A01;
    public final /* synthetic */ LIi A02;
    public final /* synthetic */ boolean A03;

    public M6S(View view, IgTextView igTextView, LIi lIi, boolean z) {
        this.A03 = z;
        this.A00 = view;
        this.A01 = igTextView;
        this.A02 = lIi;
    }

    @Override // java.lang.Runnable
    public final void run() {
        IgTextView igTextView;
        ViewGroup.LayoutParams layoutParams;
        String A00;
        int i;
        if (this.A03) {
            boolean z = this.A00 instanceof IgPrioritizedVerticalLayout;
            igTextView = this.A01;
            if (z) {
                layoutParams = igTextView.getLayoutParams();
                A00 = "null cannot be cast to non-null type com.instagram.common.ui.widget.prioritizedverticallayout.IgPrioritizedVerticalLayout.LayoutParams";
            } else {
                i = 8;
                igTextView.setVisibility(i);
            }
        } else {
            igTextView = this.A01;
            layoutParams = igTextView.getLayoutParams();
            A00 = AbstractC111324zv.A00(5);
        }
        C14360o3.A0C(layoutParams, A00);
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        marginLayoutParams.topMargin = (this.A00.getTop() - igTextView.getHeight()) - AbstractC167017dG.A06(this.A02.A06);
        igTextView.setLayoutParams(marginLayoutParams);
        i = 0;
        igTextView.setVisibility(i);
    }
}
