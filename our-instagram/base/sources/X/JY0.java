package X;

import android.content.Context;
import android.view.View;
import android.view.ViewParent;
import androidx.constraintlayout.widget.ConstraintLayout;

/* loaded from: classes8.dex */
public final class JY0 implements Runnable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ View A01;
    public final /* synthetic */ View A02;
    public final /* synthetic */ boolean A03;

    public JY0(View view, View view2, int i, boolean z) {
        this.A03 = z;
        this.A02 = view;
        this.A00 = i;
        this.A01 = view2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z = this.A03;
        if (!z) {
            View view = this.A02;
            C14360o3.A0C(view, "null cannot be cast to non-null type com.instagram.direct.inbox.notes.ui.NoteBubbleView");
            if (this.A00 > 3) {
                view.setPadding(0, 0, 0, 0);
            } else {
                view.setPadding(0, AbstractC167017dG.A06(AbstractC166997dE.A0L(view)), 0, 0);
            }
        }
        View view2 = this.A02;
        View view3 = this.A01;
        float A07 = AbstractC166987dD.A07(view2);
        Context A0L = AbstractC166997dE.A0L(view2);
        float f = 70.0f;
        if (z) {
            f = 70.0f / 0.75f;
        }
        if (A07 > AbstractC13690mv.A00(A0L, f)) {
            if (z) {
                C152716tz.A01(view2, view3);
                return;
            }
            C110964z8 c110964z8 = new C110964z8();
            ViewParent parent = view2.getParent();
            C14360o3.A0C(parent, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout");
            c110964z8.A0I((ConstraintLayout) parent);
            c110964z8.A0C(view2.getId(), 3, 0, 3);
            c110964z8.A0C(view2.getId(), 6, 0, 6);
            c110964z8.A0C(view2.getId(), 7, 0, 7);
            c110964z8.A09(view2.getId(), 4);
            ViewParent parent2 = view2.getParent();
            C14360o3.A0C(parent2, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout");
            c110964z8.A0G((ConstraintLayout) parent2);
            return;
        }
        if (z) {
            C152716tz.A02(view2, view3);
        } else {
            C152716tz.A00(view2);
        }
    }
}
