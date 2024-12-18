package X;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.facebook.R;
import com.instagram.common.ui.widget.imageview.CircularImageView;
import com.instagram.ui.widget.gradientspinner.GradientSpinner;

/* renamed from: X.MmN, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public class C51362MmN extends C3OO {
    public final View A00;
    public final View A01;
    public final View A02;
    public final View A03;
    public final View A04;
    public final View A05;
    public final LinearLayout A06;
    public final TextView A07;
    public final TextView A08;
    public final TextView A09;
    public final CircularImageView A0A;
    public final GradientSpinner A0B;
    public final ODR A0C;
    public final int A0D;
    public final int A0E;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C51362MmN(View view) {
        super(view);
        C14360o3.A0B(view, 1);
        this.A04 = view;
        this.A00 = view.findViewById(R.id.comment_container);
        this.A0A = (CircularImageView) view.findViewById(R.id.user_imageview);
        this.A05 = view.findViewById(R.id.user_image_container);
        this.A0B = (GradientSpinner) view.findViewById(R.id.user_profile_gradient_spinner);
        this.A06 = (LinearLayout) view.findViewById(R.id.comment_text_container);
        this.A08 = AbstractC166987dD.A0e(view, R.id.comment_text_title);
        this.A03 = view.findViewById(R.id.comment_text_title_container);
        this.A07 = AbstractC166987dD.A0e(view, R.id.comment_text_subtitle);
        this.A02 = view.findViewById(R.id.comment_text_subtitle_container);
        this.A09 = AbstractC166987dD.A0e(view, R.id.comment_text_posting);
        this.A0C = new ODR(view);
        this.A01 = view.findViewById(R.id.comment_pin_icon);
        Context context = view.getContext();
        this.A0E = context.getResources().getDimensionPixelSize(R.dimen.abc_text_size_menu_header_material);
        this.A0D = context.getColor(R.color.design_dark_default_color_on_background);
    }

    public void A00() {
        View view = this.A04;
        AbstractC31177DnL.A0G(view).setMarginEnd(AbstractC25228BEl.A0M(view).getDimensionPixelSize(R.dimen.account_group_management_title_text_horizontal_padding));
        view.setAlpha(1.0f);
        this.A05.setVisibility(0);
        CircularImageView circularImageView = this.A0A;
        circularImageView.setBackground(null);
        circularImageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
        circularImageView.setPadding(0, 0, 0, 0);
        this.A0B.setVisibility(4);
        this.A00.setBackground(null);
        this.A08.setVisibility(8);
        TextView textView = this.A07;
        textView.setTextSize(0, this.A0E);
        textView.setTextColor(this.A0D);
        ODR odr = this.A0C;
        odr.A04.setVisibility(8);
        odr.A02.setVisibility(8);
        odr.A00.setVisibility(8);
        odr.A03.setVisibility(8);
        odr.A01.setVisibility(8);
    }
}
