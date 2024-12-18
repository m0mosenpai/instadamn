package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.facebook.R;
import com.instagram.common.ui.base.IgLinearLayout;
import com.instagram.igds.components.button.IgdsButton;

/* loaded from: classes8.dex */
public final class LI8 {
    public static final int[] A05 = {R.id.bottom_context, R.id.megaphone_social_context_facepile, R.id.megaphone_social_context_text, R.id.megaphone_icon};
    public final View A00;
    public final ImageView A01;
    public final TextView A02;
    public final TextView A03;
    public final IgLinearLayout A04;

    private final LinearLayout A00(View.OnClickListener onClickListener, Integer num, String str, String str2) {
        if (str != null && str.length() != 0) {
            Integer num2 = C05F.A00;
            int i = R.layout.igds_megaphone_secondary_style_button;
            int i2 = R.id.secondary_style_button;
            if (num == num2) {
                i = R.layout.igds_megaphone_primary_style_button;
                i2 = R.id.primary_style_button;
            }
            IgLinearLayout igLinearLayout = this.A04;
            View inflate = AbstractC25228BEl.A0P(igLinearLayout).inflate(i, (ViewGroup) igLinearLayout, false);
            C14360o3.A0C(inflate, "null cannot be cast to non-null type android.widget.LinearLayout");
            LinearLayout linearLayout = (LinearLayout) inflate;
            IgdsButton igdsButton = (IgdsButton) AbstractC166997dE.A0R(linearLayout, i2);
            igdsButton.setText(str);
            if (str2 != null) {
                igdsButton.setContentDescription(str2);
            }
            igdsButton.setVisibility(0);
            C0fQ.A00(onClickListener, igdsButton);
            return linearLayout;
        }
        return null;
    }

    public LI8(View view, C43699JUj c43699JUj, C45078Jx7 c45078Jx7) {
        this.A00 = view;
        this.A03 = AbstractC31178DnM.A0C(view);
        this.A02 = AbstractC167007dF.A0N(view, R.id.message);
        this.A01 = AbstractC31176DnK.A0D(view, R.id.dismiss_button);
        this.A04 = (IgLinearLayout) AbstractC166997dE.A0R(view, R.id.igds_button_layout);
        AbstractC31176DnK.A1D(view, R.id.button_placeholder);
        this.A03.setText(c45078Jx7.A0D);
        this.A02.setText(c45078Jx7.A06);
        ImageView imageView = this.A01;
        AbstractC166997dE.A18(imageView.getContext(), imageView, 2131960995);
        ViewOnClickListenerC48074LPz.A01(imageView, 26, c43699JUj);
        LinearLayout A00 = A00(ViewOnClickListenerC48074LPz.A00(c43699JUj, 24), c45078Jx7.A04, c45078Jx7.A08, c45078Jx7.A07);
        LinearLayout A002 = A00(ViewOnClickListenerC48074LPz.A00(c43699JUj, 25), c45078Jx7.A05, c45078Jx7.A0B, c45078Jx7.A0A);
        IgLinearLayout igLinearLayout = this.A04;
        igLinearLayout.setVisibility(0);
        int paddingLeft = igLinearLayout.getPaddingLeft();
        int paddingTop = igLinearLayout.getPaddingTop();
        int paddingRight = igLinearLayout.getPaddingRight();
        Context context = igLinearLayout.getContext();
        igLinearLayout.setPadding(paddingLeft, paddingTop, paddingRight, AbstractC167017dG.A0B(context));
        if (c45078Jx7.A03 == C05F.A00) {
            igLinearLayout.setOrientation(1);
            igLinearLayout.setGravity(1);
            if (A00 != null) {
                igLinearLayout.addView(A00);
            }
            if (A002 != null) {
                igLinearLayout.addView(A002);
            }
        } else {
            igLinearLayout.setOrientation(0);
            igLinearLayout.setGravity(1);
            if (A002 != null) {
                igLinearLayout.addView(A002);
            }
            if (A00 != null) {
                igLinearLayout.addView(A00);
                if (A002 != null) {
                    (AbstractC25228BEl.A0M(this.A00).getConfiguration().getLayoutDirection() != 1 ? A002 : A00).setPadding(A002.getPaddingLeft(), A002.getPaddingTop(), AbstractC167017dG.A06(context), A002.getPaddingBottom());
                }
            }
        }
        ImageView imageView2 = this.A01;
        imageView2.setImageTintList(JQ1.A02(imageView2));
    }
}
