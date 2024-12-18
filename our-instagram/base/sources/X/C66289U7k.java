package X;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.instagram.common.session.UserSession;
import java.util.HashMap;
import java.util.List;

/* renamed from: X.U7k, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C66289U7k {
    public int A00;
    public boolean A01;
    public final AbstractC70663Fe A02;
    public final RecyclerView A03;
    public final XDm A04;
    public final UserSession A05;
    public final HashMap A06;

    public static final int A00(C66289U7k c66289U7k, int i, int i2, boolean z) {
        int i3;
        View A0e;
        AbstractC70663Fe abstractC70663Fe = c66289U7k.A02;
        C14360o3.A0B(abstractC70663Fe, 0);
        int Bax = abstractC70663Fe.Bax();
        int Bat = abstractC70663Fe.A00 - abstractC70663Fe.Bat();
        int i4 = 0;
        while (i < i2) {
            int A01 = AbstractC72193Ls.A01(abstractC70663Fe);
            if (i >= A01 && (i3 = i - A01) <= abstractC70663Fe.A0T() && (A0e = abstractC70663Fe.A0e(i3)) != null) {
                int A00 = AbstractC110854yx.A00(A0e, abstractC70663Fe);
                ViewGroup.LayoutParams layoutParams = A0e.getLayoutParams();
                C14360o3.A0C(layoutParams, "null cannot be cast to non-null type androidx.recyclerview.widget.RecyclerView.LayoutParams");
                int A0V = abstractC70663Fe.A0V(A0e) + ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin;
                if (z) {
                    A00 = Math.max(A00, Bax);
                    A0V = Math.min(A0V, Bat);
                }
                i4 += A0V - A00;
                i++;
            } else {
                return -1;
            }
        }
        return i4;
    }

    public final int A01(int i) {
        int i2;
        View A0e;
        AbstractC70663Fe abstractC70663Fe = this.A02;
        int A01 = AbstractC72193Ls.A01(abstractC70663Fe);
        if (i >= A01 && (i2 = i - A01) <= abstractC70663Fe.A0T() && (A0e = abstractC70663Fe.A0e(i2)) != null) {
            AbstractC166997dE.A1U(Integer.valueOf(i), this.A06, A0e.getHeight());
        }
        return AbstractC167017dG.A0K((Number) AbstractC58319PtB.A0n(this.A06, i));
    }

    public final int A02(int i) {
        List AZY = this.A04.AZY();
        if (i >= 0 && i < AZY.size()) {
            return AbstractC31176DnK.A01(AZY, i);
        }
        return -1;
    }

    public final int A03(int i) {
        AbstractC70663Fe abstractC70663Fe = this.A02;
        int A01 = AbstractC72193Ls.A01(abstractC70663Fe);
        int A02 = AbstractC72193Ls.A02(abstractC70663Fe) + 1;
        int A022 = A02(i);
        if (A022 == -1) {
            return 0;
        }
        int max = Math.max(A01, A022);
        int A023 = A02(i + 1);
        if (A023 != -1) {
            A02 = Math.min(A02, A023);
        }
        return A00(this, max, A02, true);
    }

    public C66289U7k(RecyclerView recyclerView, ViewOnTouchListenerC60632pm viewOnTouchListenerC60632pm, UserSession userSession, C66290U7l c66290U7l, XDm xDm) {
        this.A04 = xDm;
        this.A03 = recyclerView;
        this.A05 = userSession;
        AbstractC70663Fe abstractC70663Fe = recyclerView.A0D;
        if (abstractC70663Fe != null) {
            this.A02 = abstractC70663Fe;
            this.A06 = new HashMap();
            recyclerView.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserverOnGlobalLayoutListenerC66229U4z(3, this, viewOnTouchListenerC60632pm, c66290U7l));
            return;
        }
        throw AbstractC166997dE.A0g();
    }
}
