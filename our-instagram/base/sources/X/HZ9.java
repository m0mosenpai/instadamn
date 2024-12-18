package X;

import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.text.TextPaint;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.R;
import com.instagram.shopping.model.variantselector.VariantSelectorModel;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

/* loaded from: classes7.dex */
public final class HZ9 extends AbstractC38938HCn {
    public static final String __redex_internal_original_name = "NonVisualVariantSelectorFragment";
    public RecyclerView A00;
    public final C38353Gtp A01 = new C2UU();
    public final InterfaceC09390do A02 = AbstractC60492pY.A02(this);

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "non_visual_variant_selector";
    }

    private final TextPaint A00() {
        TextPaint textPaint = new TextPaint();
        textPaint.setTextSize(AbstractC166997dE.A0N(this).getDimensionPixelSize(R.dimen.abc_text_size_menu_header_material));
        textPaint.setColor(requireContext().getColor(AbstractC53242c7.A07(getContext())));
        textPaint.setFakeBoldText(true);
        return textPaint;
    }

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return AbstractC166987dD.A0n(this.A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(-1371891166);
        C14360o3.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.layout_recyclerview, viewGroup, false);
        Bundle bundle2 = this.mArguments;
        if (bundle2 != null) {
            int i = bundle2.getInt("arg_fixed_height");
            if (i > 0) {
                C14360o3.A0A(inflate);
                AbstractC13880nE.A0W(inflate, i);
                AbstractC13880nE.A0g(inflate, AbstractC13880nE.A07(requireContext()));
            }
            VariantSelectorModel variantSelectorModel = (VariantSelectorModel) bundle2.getParcelable("variant_selector_model");
            if (variantSelectorModel != null) {
                Context context = getContext();
                String[] strArr = variantSelectorModel.A0A;
                int length = strArr.length;
                int i2 = 1;
                if (length != 1) {
                    if (length != 2) {
                        ArrayList A1E = AbstractC166987dD.A1E();
                        A1E.addAll(AbstractC16960so.A1Q(Arrays.copyOf(strArr, length)));
                        C01T.A1D(A1E, J67.A00);
                        i2 = 3;
                        if (length != 3) {
                            i2 = 4;
                        }
                        Resources A09 = AbstractC31177DnL.A09(this);
                        int A0A = (((AbstractC13880nE.A0A(requireContext()) - (A09.getDimensionPixelSize(R.dimen.account_discovery_bottom_gap) * 2)) - (((AbstractC166997dE.A06(A09) * 2) * i2) - 1)) - ((AbstractC166997dE.A08(A09) * 2) * i2)) / i2;
                        Iterator it = A1E.iterator();
                        while (it.hasNext()) {
                            String A1B = AbstractC166987dD.A1B(it);
                            A00();
                            if (A00().measureText(A1B) <= A0A) {
                            }
                        }
                    }
                    i2 = 2;
                    break;
                }
                GridLayoutManager gridLayoutManager = new GridLayoutManager(context, i2);
                RecyclerView A0F = AbstractC31176DnK.A0F(inflate);
                this.A00 = A0F;
                if (A0F != null) {
                    A0F.setLayoutManager(gridLayoutManager);
                    int A0E = AbstractC167017dG.A0E(requireContext());
                    AbstractC13880nE.A0i(A0F, A0E, A0E);
                    A0F.A10(new JoD(A0E, A0E));
                    C38353Gtp c38353Gtp = this.A01;
                    boolean z = bundle2.getBoolean("arg_disable_sold_out");
                    c38353Gtp.A01 = variantSelectorModel;
                    c38353Gtp.A02 = z;
                    c38353Gtp.notifyDataSetChanged();
                    A0F.setAdapter(c38353Gtp);
                    A0F.A0n(variantSelectorModel.A06);
                }
            }
            C0f9.A09(-83824118, A02);
            return inflate;
        }
        IllegalStateException A0g = AbstractC166997dE.A0g();
        C0f9.A09(1666716248, A02);
        throw A0g;
    }
}
