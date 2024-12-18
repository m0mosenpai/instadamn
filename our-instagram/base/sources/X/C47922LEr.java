package X;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.facebook.R;
import com.instagram.common.ui.base.IgFrameLayout;

/* renamed from: X.LEr, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C47922LEr {
    public static final int[] A05 = {R.id.bottom_context, R.id.megaphone_social_context_facepile, R.id.megaphone_social_context_text, R.id.megaphone_icon};
    public final View A00;
    public final ImageView A01;
    public final TextView A02;
    public final TextView A03;
    public final IgFrameLayout A04;

    public C47922LEr(View view, JUB jub) {
        this.A00 = view;
        this.A03 = AbstractC31178DnM.A0C(view);
        this.A02 = AbstractC167007dF.A0N(view, R.id.message);
        this.A01 = AbstractC31176DnK.A0D(view, R.id.dismiss_button);
        this.A04 = (IgFrameLayout) AbstractC166997dE.A0R(view, R.id.button_placeholder);
        AbstractC31176DnK.A1D(view, R.id.button_placeholder);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 8388627;
        TextView textView = this.A03;
        textView.setText(2131975154);
        textView.setLayoutParams(layoutParams);
        textView.setGravity(8388611);
        TextView textView2 = this.A02;
        textView2.setText(2131975153);
        textView2.setLayoutParams(layoutParams);
        textView2.setGravity(8388611);
        ImageView imageView = this.A01;
        AbstractC166997dE.A18(imageView.getContext(), imageView, 2131960995);
        ViewOnClickListenerC48074LPz.A01(imageView, 28, jub);
        ViewOnClickListenerC48074LPz A00 = ViewOnClickListenerC48074LPz.A00(jub, 27);
        IgFrameLayout igFrameLayout = this.A04;
        View inflate = AbstractC25228BEl.A0P(igFrameLayout).inflate(R.layout.generic_v3_megaphone_one_button_primary, (ViewGroup) igFrameLayout, false);
        C14360o3.A0C(inflate, "null cannot be cast to non-null type android.widget.LinearLayout");
        TextView A0N = AbstractC167007dF.A0N(inflate, R.id.primary_button);
        A0N.setText(2131975152);
        A0N.setVisibility(0);
        C0fQ.A00(A00, A0N);
        IgFrameLayout igFrameLayout2 = this.A04;
        igFrameLayout2.setVisibility(0);
        AbstractC31177DnL.A0x(igFrameLayout2, igFrameLayout2.getPaddingLeft(), igFrameLayout2.getPaddingTop());
        igFrameLayout2.addView(inflate);
        ImageView imageView2 = this.A01;
        imageView2.setImageTintList(JQ1.A02(imageView2));
    }
}
