package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.facebook.R;
import java.util.List;

/* renamed from: X.BrG, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC26735BrG extends AbstractC59962oe {
    public static final String __redex_internal_original_name = "HighlightsToGridBottomSheet";
    public Integer A00;
    public String A01;
    public String A03;
    public List A04;
    public String A02 = __redex_internal_original_name;
    public final InterfaceC09390do A05 = AbstractC60492pY.A02(this);

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        C14360o3.A0B(view, 0);
        super.onViewCreated(view, bundle);
        TextView A0N = AbstractC167007dF.A0N(view, R.id.nux_title);
        List A1Q = AbstractC16960so.A1Q((LinearLayout) view.requireViewById(R.id.bullet_point_1), (LinearLayout) view.requireViewById(R.id.bullet_point_2), (LinearLayout) view.requireViewById(R.id.bullet_point_3));
        String str = this.A03;
        if (str != null) {
            this.A02 = str;
        }
        Integer num = this.A00;
        if (num != null) {
            AbstractC25227BEk.A12(A0N, this, num.intValue());
        }
        List list = this.A04;
        if (list != null) {
            int i = 0;
            for (Object obj : list) {
                int i2 = i + 1;
                if (i < 0) {
                    AbstractC16960so.A1U();
                    throw C00O.createAndThrow();
                }
                C51737MtK c51737MtK = (C51737MtK) obj;
                View view2 = (View) A1Q.get(i);
                String string = getString(c51737MtK.A01, this.A01);
                C14360o3.A07(string);
                int i3 = c51737MtK.A00;
                TextView A0Q = AbstractC25230BEn.A0Q(view2, R.id.bullet_subtitle);
                ImageView imageView = (ImageView) AbstractC166987dD.A0c(view2, R.id.bullet_icon);
                A0Q.setText(string);
                imageView.setImageResource(i3);
                i = i2;
            }
        }
    }

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return AbstractC166987dD.A0n(this.A05);
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return this.A02;
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(445130277);
        C14360o3.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.layout_highlights_to_grid_nux_bottomsheet, viewGroup, false);
        C0f9.A09(1996959774, A02);
        return inflate;
    }
}
