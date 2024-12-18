package X;

import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.method.LinkMovementMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.facebook.R;
import com.instagram.igds.components.bottombutton.IgdsBottomButtonLayout;
import com.instagram.igds.components.bulletcell.IgdsBulletCell;
import com.instagram.igds.components.headline.IgdsHeadline;
import java.util.List;

/* renamed from: X.Dy2, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C31783Dy2 extends Fragment {
    public static C62956SYy A02;
    public IgdsBottomButtonLayout A00;
    public IgdsHeadline A01;

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        C14360o3.A0B(view, 0);
        view.setBackgroundColor(AbstractC167007dF.A09(requireContext(), R.attr.igds_color_primary_background));
        this.A01 = (IgdsHeadline) AbstractC166987dD.A0c(view, R.id.safe_browsing_headline);
        this.A00 = (IgdsBottomButtonLayout) AbstractC166987dD.A0c(view, R.id.safe_browsing_bottom_button);
        IgdsHeadline igdsHeadline = this.A01;
        String str = "headline";
        if (igdsHeadline != null) {
            igdsHeadline.setImageResource(R.drawable.ig_illustrations_illo_warning_refresh);
            IgdsHeadline igdsHeadline2 = this.A01;
            if (igdsHeadline2 != null) {
                igdsHeadline2.setHeadline(2131976200);
                FragmentActivity activity = getActivity();
                AbstractC31171DnF.A1P(activity);
                C35228FgL A01 = C35228FgL.A01(activity, true);
                C60977Rd5 c60977Rd5 = new C60977Rd5(requireContext().getColor(R.color.igds_link), 0);
                String A0v = AbstractC25227BEk.A0v(this, 2131965052);
                SpannableStringBuilder A0H = AbstractC25225BEi.A0H(AnonymousClass001.A0T(getString(2131976197), A0v, ' '));
                AnonymousClass773.A04(A0H, c60977Rd5, A0v);
                A01.A04(null, A0H, R.drawable.instagram_info_pano_outline_24);
                A01.A04(null, getString(2131976198), R.drawable.instagram_user_circle_pano_outline_24);
                A01.A04(null, getString(2131976199), R.drawable.instagram_settings_pano_outline_24);
                List A03 = A01.A03();
                ((IgdsBulletCell) A03.get(0)).setMovementMethod(null, LinkMovementMethod.getInstance());
                IgdsHeadline igdsHeadline3 = this.A01;
                if (igdsHeadline3 != null) {
                    igdsHeadline3.setBulletList(A03);
                    IgdsBottomButtonLayout igdsBottomButtonLayout = this.A00;
                    str = "bottomButton";
                    if (igdsBottomButtonLayout != null) {
                        igdsBottomButtonLayout.setDividerVisible(true);
                        IgdsBottomButtonLayout igdsBottomButtonLayout2 = this.A00;
                        if (igdsBottomButtonLayout2 != null) {
                            AbstractC31173DnH.A1H(this, igdsBottomButtonLayout2, 2131976191);
                            IgdsBottomButtonLayout igdsBottomButtonLayout3 = this.A00;
                            if (igdsBottomButtonLayout3 != null) {
                                igdsBottomButtonLayout3.setPrimaryActionOnClickListener(ViewOnClickListenerC35649Foj.A00);
                                IgdsBottomButtonLayout igdsBottomButtonLayout4 = this.A00;
                                if (igdsBottomButtonLayout4 != null) {
                                    igdsBottomButtonLayout4.setSecondaryActionText(getString(2131976195));
                                    IgdsBottomButtonLayout igdsBottomButtonLayout5 = this.A00;
                                    if (igdsBottomButtonLayout5 != null) {
                                        igdsBottomButtonLayout5.setSecondaryActionOnClickListener(new Fp1(this, 0));
                                        return;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        C14360o3.A0F(str);
        throw C00O.createAndThrow();
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = C0f9.A02(1243002921);
        C14360o3.A0B(layoutInflater, 0);
        View A0R = AbstractC25226BEj.A0R(layoutInflater, viewGroup, R.layout.safe_browsing_warning_headline, false);
        C0f9.A09(1737024814, A022);
        return A0R;
    }
}
