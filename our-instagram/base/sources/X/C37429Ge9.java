package X;

import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import instagram.features.feed.fragment.ContextualFeedFragment;

/* renamed from: X.Ge9, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C37429Ge9 extends C1I2 {
    public final /* synthetic */ ContextualFeedFragment A00;

    public C37429Ge9(ContextualFeedFragment contextualFeedFragment) {
        this.A00 = contextualFeedFragment;
    }

    @Override // X.C1I2
    public final void onScroll(C3FQ c3fq, int i, int i2, int i3, int i4, int i5) {
        int i6;
        String str;
        int A03 = C0f9.A03(2030390298);
        C14360o3.A0B(c3fq, 0);
        ViewGroup CFj = c3fq.CFj();
        C14360o3.A07(CFj);
        ContextualFeedFragment contextualFeedFragment = this.A00;
        contextualFeedFragment.A1I.onScrolled((RecyclerView) CFj, i4, i5);
        HY4 hy4 = contextualFeedFragment.A0N;
        if (hy4 == null) {
            str = "adapter";
        } else {
            hy4.Ct5();
            C32S c32s = contextualFeedFragment.A0L;
            if (c32s != null && (i + i2) - 1 >= 0) {
                str = "adapter";
                if (i6 < hy4.getItemCount()) {
                    HY4 hy42 = contextualFeedFragment.A0N;
                    if (hy42 != null) {
                        C38321qM A04 = AbstractC41071vF.A04(hy42.getItem(i6));
                        if (A04 != null) {
                            HY4 hy43 = contextualFeedFragment.A0N;
                            if (hy43 != null) {
                                int position = hy43.BRZ(A04).getPosition();
                                int i7 = contextualFeedFragment.A00;
                                if (position != i7) {
                                    c32s.A0D(position, i7);
                                    c32s.A0C(position);
                                    contextualFeedFragment.A00 = position;
                                }
                            }
                        }
                    }
                }
            }
            C0f9.A0A(1944903677, A03);
            return;
        }
        C14360o3.A0F(str);
        throw C00O.createAndThrow();
    }

    @Override // X.C1I2
    public final void onScrollStateChanged(C3FQ c3fq, int i) {
        int A0N = AbstractC167017dG.A0N(c3fq, -879562182);
        this.A00.A1I.onScrollStateChanged(c3fq, i);
        C0f9.A0A(-947290518, A0N);
    }
}
