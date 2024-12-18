package X;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.R;

/* renamed from: X.Dw1, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C31696Dw1 extends AbstractC66412zI {
    public final int A00;
    public final boolean A01;

    @Override // X.AbstractC66422zJ
    public final /* bridge */ /* synthetic */ C3OO createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        C14360o3.A0B(viewGroup, 0);
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.row_search_placeholder, viewGroup, false);
        C14360o3.A0A(inflate);
        inflate.setTag(new C31701Dw6(inflate));
        C3OO c3oo = new C3OO(inflate);
        if (inflate.getTag() instanceof C31701Dw6) {
            return c3oo;
        }
        throw new IllegalStateException("Check failed.");
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0023, code lost:
    
        if (r5 == X.C05F.A0C) goto L6;
     */
    @Override // X.AbstractC66422zJ
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final /* bridge */ /* synthetic */ void bind(X.InterfaceC66482zP r11, X.C3OO r12) {
        /*
            r10 = this;
            X.MZS r11 = (X.MZS) r11
            r2 = 0
            X.C14360o3.A0B(r11, r2)
            r4 = 1
            X.C14360o3.A0B(r12, r4)
            android.view.View r0 = r12.itemView
            java.lang.Object r3 = r0.getTag()
            java.lang.String r0 = "null cannot be cast to non-null type com.instagram.search.common.ui.PlaceholderRowViewBinder.Holder"
            X.C14360o3.A0C(r3, r0)
            X.Dw6 r3 = (X.C31701Dw6) r3
            boolean r6 = r10.A01
            java.lang.Integer r5 = r11.A00
            java.lang.Integer r0 = X.C05F.A01
            r9 = 0
            if (r5 == r0) goto L25
            java.lang.Integer r0 = X.C05F.A0C
            r1 = 0
            if (r5 != r0) goto L26
        L25:
            r1 = 1
        L26:
            java.lang.Integer r0 = X.C05F.A0C
            if (r5 != r0) goto L2b
            r9 = 1
        L2b:
            int r0 = r10.A00
            X.C14360o3.A0B(r3, r2)
            if (r1 == 0) goto Lac
            com.facebook.shimmer.ShimmerFrameLayout r0 = r3.A02
            X.AbstractC66174U2p.A02(r0)
            com.instagram.common.ui.widget.imageview.CircularImageView r8 = r3.A03
            com.instagram.ui.widget.gradientspinner.GradientSpinner r7 = r3.A04
            X.C14360o3.A0B(r8, r2)
            X.C14360o3.A0B(r7, r4)
            android.content.Context r4 = r8.getContext()
            android.content.res.Resources r0 = r4.getResources()
            r1 = 2131165218(0x7f070022, float:1.7944647E38)
            int r6 = r0.getDimensionPixelSize(r1)
            android.content.res.Resources r0 = r4.getResources()
            int r5 = r0.getDimensionPixelSize(r1)
            android.content.res.Resources r1 = r4.getResources()
            r0 = 2131165190(0x7f070006, float:1.794459E38)
            int r4 = r1.getDimensionPixelSize(r0)
            android.view.ViewGroup$LayoutParams r0 = r8.getLayoutParams()
            r0.height = r6
            android.view.ViewGroup$LayoutParams r0 = r8.getLayoutParams()
            r0.width = r6
            r8.setPadding(r5, r5, r5, r5)
            android.view.ViewGroup$LayoutParams r1 = r8.getLayoutParams()
            java.lang.String r0 = "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams"
            X.C14360o3.A0C(r1, r0)
            android.view.ViewGroup$MarginLayoutParams r1 = (android.view.ViewGroup.MarginLayoutParams) r1
            r1.setMargins(r4, r2, r4, r2)
            r1 = 8
            r7.setVisibility(r1)
            android.view.View r0 = r3.A01
            r0.setVisibility(r1)
            android.view.View r2 = r3.A00
            r1 = 2131165460(0x7f070114, float:1.7945138E38)
            if (r9 == 0) goto L94
            r1 = 2131165185(0x7f070001, float:1.794458E38)
        L94:
            android.content.Context r0 = r2.getContext()
            android.content.res.Resources r0 = r0.getResources()
            int r1 = r0.getDimensionPixelSize(r1)
            android.view.ViewGroup$LayoutParams r0 = r2.getLayoutParams()
            r0.width = r1
        La6:
            com.facebook.shimmer.ShimmerFrameLayout r0 = r3.A02
            r0.A02()
            return
        Lac:
            if (r6 != 0) goto Lb0
            if (r0 != r4) goto La6
        Lb0:
            com.facebook.shimmer.ShimmerFrameLayout r0 = r3.A02
            X.AbstractC66174U2p.A01(r0)
            com.instagram.common.ui.widget.imageview.CircularImageView r7 = r3.A03
            com.instagram.ui.widget.gradientspinner.GradientSpinner r5 = r3.A04
            X.C14360o3.A0B(r7, r2)
            X.C14360o3.A0B(r5, r4)
            android.content.Context r6 = r7.getContext()
            android.content.res.Resources r1 = r6.getResources()
            r0 = 2131165250(0x7f070042, float:1.7944712E38)
            int r4 = r1.getDimensionPixelSize(r0)
            android.content.res.Resources r1 = r6.getResources()
            r0 = 2131165218(0x7f070022, float:1.7944647E38)
            int r1 = r1.getDimensionPixelSize(r0)
            android.view.ViewGroup$LayoutParams r0 = r7.getLayoutParams()
            r0.height = r4
            android.view.ViewGroup$LayoutParams r0 = r7.getLayoutParams()
            r0.width = r4
            r7.setPadding(r1, r1, r1, r1)
            android.content.Context r0 = r5.getContext()
            android.content.res.Resources r1 = r0.getResources()
            r0 = 2131165270(0x7f070056, float:1.7944752E38)
            int r1 = r1.getDimensionPixelSize(r0)
            android.view.ViewGroup$LayoutParams r0 = r5.getLayoutParams()
            r0.height = r1
            android.view.ViewGroup$LayoutParams r0 = r5.getLayoutParams()
            r0.width = r1
            android.view.View r0 = r3.A01
            r0.setVisibility(r2)
            android.view.View r2 = r3.A00
            r1 = 2131165747(0x7f070233, float:1.794572E38)
            goto L94
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C31696Dw1.bind(X.2zP, X.3OO):void");
    }

    public C31696Dw1(boolean z, int i) {
        this.A01 = z;
        this.A00 = i;
    }

    @Override // X.AbstractC66422zJ
    public final Class modelClass() {
        return MZS.class;
    }
}
