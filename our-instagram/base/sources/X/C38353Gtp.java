package X;

import android.view.View;
import android.view.ViewGroup;
import com.facebook.R;
import com.instagram.model.shopping.ProductVariantDimension;
import com.instagram.shopping.model.variantselector.VariantSelectorModel;

/* renamed from: X.Gtp, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38353Gtp extends C2UU {
    public JGT A00;
    public VariantSelectorModel A01;
    public boolean A02;

    @Override // X.C2UU
    public final /* bridge */ /* synthetic */ C3OO onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new C38475Gvw(AbstractC25227BEk.A0D(AbstractC31177DnL.A0E(viewGroup, 0), viewGroup, R.layout.non_visual_variant_selector_item, false), false);
    }

    @Override // X.C2UU
    public final /* bridge */ /* synthetic */ void onBindViewHolder(C3OO c3oo, int i) {
        C38475Gvw c38475Gvw = (C38475Gvw) c3oo;
        C14360o3.A0B(c38475Gvw, 0);
        VariantSelectorModel variantSelectorModel = this.A01;
        if (variantSelectorModel != null) {
            ProductVariantDimension productVariantDimension = variantSelectorModel.A08;
            C14360o3.A07(productVariantDimension);
            String str = variantSelectorModel.A0A[i];
            C14360o3.A04(str);
            boolean A1P = AbstractC167007dF.A1P(i, variantSelectorModel.A06);
            boolean z = variantSelectorModel.A0B[i];
            boolean z2 = this.A02;
            JGT jgt = this.A00;
            c38475Gvw.A02.setText(str);
            InterfaceC56392iX interfaceC56392iX = c38475Gvw.A03;
            int i2 = 0;
            int i3 = 8;
            if (A1P) {
                i3 = 0;
            }
            interfaceC56392iX.setVisibility(i3);
            View view = c38475Gvw.A00;
            if (z) {
                i2 = 8;
            }
            view.setVisibility(i2);
            if (!z && z2) {
                c38475Gvw.A01.setOnClickListener(null);
            } else {
                C0fQ.A00(new ViewOnClickListenerC41960Iir(jgt, productVariantDimension, str, 1), c38475Gvw.A01);
            }
        }
    }

    @Override // X.C2UU
    public final int getItemCount() {
        int i;
        String[] strArr;
        int A03 = C0f9.A03(311179371);
        VariantSelectorModel variantSelectorModel = this.A01;
        if (variantSelectorModel != null && (strArr = variantSelectorModel.A0A) != null) {
            i = strArr.length;
        } else {
            i = 0;
        }
        C0f9.A0A(2077499795, A03);
        return i;
    }
}
