package X;

import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes6.dex */
public final class E0K extends C1I4 {
    public final View A00;
    public final C73W A01;

    public static final void A00(View view, double d, float f, float f2) {
        boolean z = false;
        AbstractC125325le A01 = AbstractC125325le.A01(view, 0);
        A01.A0G();
        A01.A0M(f, f2);
        A01.A0E(C55942hf.A03(0.0d, d)).A0A().A0H();
        if (f2 == 1.0f) {
            z = true;
        }
        view.setEnabled(z);
    }

    public E0K(View view, C73W c73w) {
        this.A00 = view;
        this.A01 = c73w;
        if (c73w.A00.A09) {
            view.setAlpha(0.0f);
            view.setEnabled(false);
        }
    }

    @Override // X.C1I4
    public final void onScrolled(RecyclerView recyclerView, int i, int i2) {
        int A03 = C0f9.A03(443740914);
        C14360o3.A0B(recyclerView, 0);
        LinearLayoutManager A0J = AbstractC31177DnL.A0J(recyclerView);
        int A1b = A0J.A1b();
        C2UU c2uu = recyclerView.A0A;
        C14360o3.A0C(c2uu, "null cannot be cast to non-null type com.instagram.follow.chaining.FollowChainingAdapter");
        if (C51761Mtk.A02(((C31440Drk) c2uu).A01(A1b), 33)) {
            if (i > 0) {
                View A0e = A0J.A0e(A0J.A0T() - 1);
                C155706yz c155706yz = this.A01.A00;
                if (!c155706yz.A09 && A0e != null) {
                    A00(this.A00, 30.0d, 1.0f, 0.0f);
                    A0e.setAlpha(0.0f);
                    A0e.postDelayed(new GOE(A0e, this), 100L);
                    c155706yz.A09 = true;
                }
            }
        } else if (i < 0) {
            C155706yz c155706yz2 = this.A01.A00;
            if (c155706yz2.A09) {
                A00(this.A00, 30.0d, 0.0f, 1.0f);
                c155706yz2.A09 = false;
            }
        }
        C0f9.A0A(853335538, A03);
    }
}
