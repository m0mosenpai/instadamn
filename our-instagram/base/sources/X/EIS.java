package X;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.facebook.R;
import com.instagram.igds.components.bulletcell.IgdsBulletCell;
import com.instagram.nux.common.HowItWorksNuxFragment$Row;
import java.util.List;

/* loaded from: classes6.dex */
public final class EIS extends AbstractC59962oe {
    public static final String __redex_internal_original_name = "HowItWorksNuxFragment";
    public Integer A00;
    public String A01;
    public String A02;
    public String A03;
    public boolean A05;
    public boolean A06;
    public List A04 = C16930sl.A00;
    public final InterfaceC09390do A07 = AbstractC60492pY.A02(this);

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        C14360o3.A0B(view, 0);
        super.onViewCreated(view, bundle);
        Context requireContext = requireContext();
        ViewGroup viewGroup = (ViewGroup) AbstractC166997dE.A0S(view, R.id.how_it_works_row_container);
        Integer num = this.A00;
        if (num != null) {
            int intValue = num.intValue();
            ImageView A0I = AbstractC31173DnH.A0I(view, R.id.header_icon);
            AbstractC166997dE.A19(requireContext, A0I, intValue);
            if (this.A05) {
                int A05 = AbstractC166997dE.A05(A0I.getResources());
                LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -1);
                layoutParams.setMargins(A05, A05, A05, A05);
                A0I.setLayoutParams(layoutParams);
            }
            A0I.setVisibility(0);
        }
        String str = this.A03;
        if (str != null) {
            TextView A0T = AbstractC166997dE.A0T(view, R.id.header_text);
            A0T.setText(str);
            A0T.setVisibility(0);
            if (this.A06) {
                A0T.setTextAppearance(R.style.igds_headline_2_panorama);
                AbstractC31177DnL.A0G(A0T).setMargins(AbstractC13690mv.A01(requireContext(), 34), 0, AbstractC13690mv.A01(requireContext(), 34), AbstractC13690mv.A01(requireContext(), 8));
            }
        }
        for (HowItWorksNuxFragment$Row howItWorksNuxFragment$Row : this.A04) {
            IgdsBulletCell igdsBulletCell = new IgdsBulletCell(requireContext, null, 0);
            igdsBulletCell.setText(howItWorksNuxFragment$Row.A03, howItWorksNuxFragment$Row.A00);
            Integer num2 = howItWorksNuxFragment$Row.A02;
            if (num2 != null) {
                igdsBulletCell.setIcon(num2.intValue());
            }
            Integer num3 = howItWorksNuxFragment$Row.A01;
            if (num3 != null) {
                igdsBulletCell.setIconColor(num3.intValue());
            }
            viewGroup.addView(igdsBulletCell);
        }
        if (this.A02 != null) {
            TextView A0T2 = AbstractC166997dE.A0T(view, R.id.footer_text);
            A0T2.setText(this.A02);
            A0T2.setVisibility(0);
        }
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        String str = this.A01;
        if (str == null) {
            return "how_it_works_nux";
        }
        return str;
    }

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return AbstractC166987dD.A0n(this.A07);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        Integer num;
        boolean z;
        int A02 = C0f9.A02(-1495356909);
        super.onCreate(bundle);
        Bundle requireArguments = requireArguments();
        this.A01 = AbstractC153636vY.A01(requireArguments, MSV.A00(179));
        this.A04 = AbstractC153636vY.A02(requireArguments, HowItWorksNuxFragment$Row.class, "argument_rows");
        if (requireArguments.containsKey("argument_header_icon_id")) {
            num = AbstractC31179DnN.A0X(requireArguments, "argument_header_icon_id");
        } else {
            num = null;
        }
        this.A00 = num;
        this.A03 = requireArguments.getString("argument_header_text");
        this.A02 = requireArguments.getString("argument_footer_text");
        boolean z2 = false;
        if (requireArguments.containsKey("argument_use_default_icon_size")) {
            z = requireArguments.getBoolean("argument_use_default_icon_size");
        } else {
            z = false;
        }
        this.A05 = z;
        if (requireArguments.containsKey("argument_use_updated_header_font")) {
            z2 = requireArguments.getBoolean("argument_use_updated_header_font");
        }
        this.A06 = z2;
        C0f9.A09(-295361826, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(-1378204709);
        C14360o3.A0B(layoutInflater, 0);
        View A0R = AbstractC25226BEj.A0R(layoutInflater, viewGroup, R.layout.how_it_works_bottom_sheet, false);
        C0f9.A09(1908044462, A02);
        return A0R;
    }
}
