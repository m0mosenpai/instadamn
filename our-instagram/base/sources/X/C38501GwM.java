package X;

import android.content.Context;
import android.view.View;
import android.widget.TextView;
import com.facebook.R;
import com.instagram.common.ui.text.TitleTextView;
import com.instagram.common.ui.widget.imageview.IgImageView;

/* renamed from: X.GwM, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38501GwM extends C3OO {
    public final TextView A00;
    public final TitleTextView A01;
    public final TitleTextView A02;
    public final TitleTextView A03;
    public final IgImageView A04;
    public final IJL A05;
    public final Integer A06;
    public final Runnable A07;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C38501GwM(View view, Integer num) {
        super(view);
        C14360o3.A0B(view, 1);
        this.A06 = num;
        IgImageView A0T = AbstractC167007dF.A0T(view, R.id.thumbnail_image);
        this.A04 = A0T;
        this.A05 = new IJL(view);
        TitleTextView titleTextView = (TitleTextView) AbstractC166997dE.A0R(view, R.id.title);
        this.A03 = titleTextView;
        TitleTextView titleTextView2 = (TitleTextView) AbstractC166997dE.A0R(view, R.id.secondary_title);
        this.A01 = titleTextView2;
        TitleTextView titleTextView3 = (TitleTextView) AbstractC166997dE.A0R(view, R.id.tertiary_title);
        this.A02 = titleTextView3;
        this.A00 = AbstractC167007dF.A0N(view, R.id.call_to_action);
        Context context = view.getContext();
        C14360o3.A0A(context);
        AbstractC167017dG.A1N(context, num);
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.block_comment_empty_state_padding_top);
        int A0E = AbstractC167017dG.A0E(context);
        AbstractC13880nE.A0g(view, dimensionPixelSize);
        AbstractC13880nE.A0W(A0T, dimensionPixelSize);
        float f = A0E;
        titleTextView.setTextSize(0, f);
        titleTextView2.setTextSize(0, f);
        titleTextView3.setTextSize(0, f);
        this.A07 = new J5Q(view, this, view.getResources().getDimensionPixelSize(R.dimen.ad4ad_button_bottom_margin));
    }
}
