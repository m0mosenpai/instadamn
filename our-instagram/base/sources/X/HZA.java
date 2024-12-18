package X;

import android.content.res.Resources;
import android.graphics.Paint;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.R;
import com.instagram.shopping.model.variantselector.VariantSelectorModel;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes7.dex */
public final class HZA extends AbstractC38938HCn {
    public static final String __redex_internal_original_name = "NonVisualSegregatedVariantSelectorFragment";
    public RecyclerView A00;
    public RecyclerView A01;
    public final C38352Gto A02 = new C38352Gto(C05F.A00);
    public final C38352Gto A03 = new C38352Gto(C05F.A01);
    public final InterfaceC09390do A05 = J8U.A00(this, 26);
    public final InterfaceC09390do A04 = AbstractC60492pY.A02(this);

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "non_visual_variant_selector";
    }

    private final int A00(VariantSelectorModel variantSelectorModel) {
        String[] strArr = variantSelectorModel.A0A;
        int length = strArr.length;
        if (length == 1) {
            return 1;
        }
        if (length != 2) {
            List A0A = AbstractC009903n.A0A(new C37863GlI(2), strArr);
            int i = 3;
            if (length != 3) {
                i = 4;
            }
            Resources A09 = AbstractC31177DnL.A09(this);
            int A0A2 = (((AbstractC13880nE.A0A(requireContext()) - (A09.getDimensionPixelSize(R.dimen.account_discovery_bottom_gap) * 2)) - (((AbstractC166997dE.A06(A09) * 2) * i) - 1)) - ((AbstractC166997dE.A08(A09) * 2) * i)) / i;
            Iterator it = A0A.iterator();
            while (it.hasNext()) {
                String A1B = AbstractC166987dD.A1B(it);
                C14360o3.A0A(A1B);
                if (((Paint) this.A05.getValue()).measureText(A1B) > A0A2) {
                    return 2;
                }
            }
            return i;
        }
        return 2;
    }

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return AbstractC166987dD.A0n(this.A04);
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x010e, code lost:
    
        if (X.AbstractC37301Gc2.A1b(r8.A01) != false) goto L22;
     */
    @Override // androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.view.View onCreateView(android.view.LayoutInflater r13, android.view.ViewGroup r14, android.os.Bundle r15) {
        /*
            Method dump skipped, instructions count: 354
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.HZA.onCreateView(android.view.LayoutInflater, android.view.ViewGroup, android.os.Bundle):android.view.View");
    }
}
