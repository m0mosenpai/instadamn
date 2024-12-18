package X;

import android.view.ViewGroup;
import com.facebook.R;
import com.instagram.shopping.model.variantselector.VariantSelectorModel;
import java.util.Collections;
import java.util.List;

/* renamed from: X.Gto, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38352Gto extends C2UU {
    public JGT A00;
    public VariantSelectorModel A01;
    public final Integer A02;

    @Override // X.C2UU
    public final /* bridge */ /* synthetic */ C3OO onCreateViewHolder(ViewGroup viewGroup, int i) {
        C14360o3.A0B(viewGroup, 0);
        return new C38475Gvw(AbstractC25227BEk.A0D(AbstractC25228BEl.A0P(viewGroup), viewGroup, R.layout.non_visual_variant_selector_item, false), true);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0042, code lost:
    
        if (r10 == r0.A05) goto L12;
     */
    @Override // X.C2UU
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final /* bridge */ /* synthetic */ void onBindViewHolder(X.C3OO r9, int r10) {
        /*
            r8 = this;
            X.Gvw r9 = (X.C38475Gvw) r9
            r0 = 0
            X.C14360o3.A0B(r9, r0)
            com.instagram.shopping.model.variantselector.VariantSelectorModel r0 = r8.A01
            X.C14360o3.A0A(r0)
            com.instagram.model.shopping.ProductVariantDimension r6 = r0.A08
            X.C14360o3.A07(r6)
            java.lang.Integer r3 = r8.A02
            java.lang.Integer r2 = X.C05F.A00
            com.instagram.shopping.model.variantselector.VariantSelectorModel r0 = r8.A01
            if (r3 != r2) goto L72
            X.C14360o3.A0A(r0)
            java.util.List r0 = r0.A00
        L1d:
            java.util.List r0 = java.util.Collections.unmodifiableList(r0)
            java.lang.Object r5 = r0.get(r10)
            java.lang.String r5 = (java.lang.String) r5
            X.C14360o3.A0A(r5)
            com.instagram.shopping.model.variantselector.VariantSelectorModel r0 = r8.A01
            X.C14360o3.A0A(r0)
            int r1 = r0.A06
            if (r1 >= 0) goto L6d
            r1 = 0
        L34:
            r7 = 1
            boolean r0 = X.AbstractC167007dF.A1X(r3, r2)
            if (r1 != r0) goto L6b
            com.instagram.shopping.model.variantselector.VariantSelectorModel r0 = r8.A01
            X.C14360o3.A0A(r0)
            int r0 = r0.A05
            if (r10 != r0) goto L6b
        L44:
            X.JGT r4 = r8.A00
            r3 = 2
            X.C14360o3.A0B(r5, r3)
            android.widget.TextView r0 = r9.A02
            r0.setText(r5)
            X.2iX r2 = r9.A03
            r1 = 8
            r0 = 8
            if (r7 == 0) goto L58
            r0 = 0
        L58:
            r2.setVisibility(r0)
            android.view.View r0 = r9.A00
            r0.setVisibility(r1)
            android.widget.FrameLayout r1 = r9.A01
            X.Iir r0 = new X.Iir
            r0.<init>(r4, r6, r5, r3)
            X.C0fQ.A00(r0, r1)
            return
        L6b:
            r7 = 0
            goto L44
        L6d:
            boolean[] r0 = r0.A0B
            boolean r1 = r0[r1]
            goto L34
        L72:
            X.C14360o3.A0A(r0)
            java.util.List r0 = r0.A01
            goto L1d
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C38352Gto.onBindViewHolder(X.3OO, int):void");
    }

    public C38352Gto(Integer num) {
        this.A02 = num;
    }

    @Override // X.C2UU
    public final int getItemCount() {
        List list;
        int size;
        int i;
        int A03 = C0f9.A03(1823405270);
        VariantSelectorModel variantSelectorModel = this.A01;
        if (variantSelectorModel == null) {
            size = 0;
            i = -1009301782;
        } else {
            if (this.A02 == C05F.A00) {
                C14360o3.A0A(variantSelectorModel);
                list = variantSelectorModel.A00;
            } else {
                C14360o3.A0A(variantSelectorModel);
                list = variantSelectorModel.A01;
            }
            size = Collections.unmodifiableList(list).size();
            i = 773325984;
        }
        C0f9.A0A(i, A03);
        return size;
    }
}
