package X;

import android.content.Context;
import android.view.View;
import android.widget.TextView;
import com.facebook.R;
import com.instagram.common.ui.colorfilter.ColorFilterAlphaImageView;
import com.instagram.ui.recyclerpager.HorizontalRecyclerPager;

/* renamed from: X.L4u, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C47713L4u {
    public L20 A00;
    public final View A01;
    public final View A02;
    public final TextView A03;
    public final TextView A04;
    public final TextView A05;
    public final ColorFilterAlphaImageView A06;
    public final HorizontalRecyclerPager A07;

    public C47713L4u(Context context, View view) {
        this.A01 = view.requireViewById(R.id.netego_carousel_header);
        this.A02 = view.requireViewById(R.id.top_divider);
        this.A05 = AbstractC166997dE.A0T(view, R.id.netego_carousel_title);
        this.A04 = AbstractC166997dE.A0T(view, R.id.netego_carousel_subtitle);
        HorizontalRecyclerPager horizontalRecyclerPager = (HorizontalRecyclerPager) view.requireViewById(R.id.netego_carousel_view);
        this.A07 = horizontalRecyclerPager;
        int A04 = AbstractC167017dG.A04(context);
        horizontalRecyclerPager.A10(new C3YB(A04, A04));
        horizontalRecyclerPager.A01 = AbstractC167017dG.A0E(context);
        TextView textView = (TextView) AbstractC31173DnH.A0E(AbstractC31173DnH.A0G(view, R.id.netego_carousel_cta), R.layout.netego_carousel_text_cta);
        this.A03 = textView;
        textView.setVisibility(4);
        ColorFilterAlphaImageView colorFilterAlphaImageView = (ColorFilterAlphaImageView) AbstractC31173DnH.A0E(AbstractC31173DnH.A0G(view, R.id.netego_button_stub), R.layout.netego_carousel_more_button);
        this.A06 = colorFilterAlphaImageView;
        colorFilterAlphaImageView.setVisibility(8);
    }
}
