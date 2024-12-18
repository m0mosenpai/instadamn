package X;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.viewpager.widget.ViewPager;
import com.facebook.R;
import java.util.List;

/* loaded from: classes8.dex */
public final class K5O extends K5K {
    public Button A00;
    public ImageView A01;
    public LinearLayout A02;
    public ProgressBar A03;
    public ViewPager A04;
    public List A05;

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        C14360o3.A0B(view, 0);
        Context A0L = AbstractC166997dE.A0L(view);
        AbstractC31174DnI.A1C(view, AbstractC47994LKy.A01(A0L, R.attr.sc_surface_background));
        this.A03 = (ProgressBar) view.findViewById(R.id.pb_loading);
        ViewPager viewPager = (ViewPager) AbstractC47961LGz.A00(view, R.id.onboarding_view_pager);
        this.A04 = viewPager;
        C14360o3.A0A(viewPager);
        viewPager.setOffscreenPageLimit(2);
        this.A02 = (LinearLayout) AbstractC47961LGz.A00(view, R.id.onboarding_pager_control);
        Button button = (Button) AbstractC47961LGz.A00(view, R.id.btn_next);
        this.A00 = button;
        C14360o3.A0A(button);
        AbstractC47994LKy.A05(button);
        ViewPager viewPager2 = this.A04;
        C14360o3.A0A(viewPager2);
        viewPager2.setVisibility(8);
        LinearLayout linearLayout = this.A02;
        C14360o3.A0A(linearLayout);
        linearLayout.setVisibility(8);
        this.A01 = AbstractC47961LGz.A01(view, R.id.iv_back_button);
        Context context = getContext();
        if (((AbstractC44444JlB) this).A00 != null && context != null) {
            ImageView imageView = this.A01;
            C14360o3.A0A(imageView);
            C14360o3.A0A(((AbstractC44444JlB) this).A00);
            AbstractC166997dE.A19(context, imageView, R.drawable.instagram_arrow_left_pano_outline_24);
        }
        Y6Z.A00(new CallableC44082Je7(this, 0)).A02(new C48116LRq(this, 2), Y6Z.A0B);
        TextView A02 = AbstractC47961LGz.A02(view, R.id.tv_privacy_disclaimer);
        A02.setText(2131972838);
        AbstractC47994LKy.A04(A0L, A02, R.attr.sc_secondary_text);
        AbstractC31174DnI.A1C(AbstractC47961LGz.A00(view, R.id.divider), AbstractC47994LKy.A01(A0L, R.attr.sc_divider));
        C023409i.A0A.A04(requireArguments());
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(-1068244338);
        C14360o3.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.sc_ig_onboarding_fragment, viewGroup, false);
        C0f9.A09(1399951470, A02);
        return inflate;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onResume() {
        int A02 = C0f9.A02(210034080);
        super.onResume();
        ViewPager viewPager = this.A04;
        C14360o3.A0A(viewPager);
        if (viewPager.getVisibility() == 0) {
            ViewPager viewPager2 = this.A04;
            C14360o3.A0A(viewPager2);
            viewPager2.getCurrentItem();
            List list = this.A05;
            if (list != null) {
                int size = list.size();
                for (int i = 0; i < size; i++) {
                    List list2 = this.A05;
                    C14360o3.A0A(list2);
                    list2.get(i);
                }
            }
        }
        C0f9.A09(-223469823, A02);
    }
}
