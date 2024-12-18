package X;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.view.View;
import com.facebook.R;
import com.instagram.common.ui.base.IgLinearLayout;
import com.instagram.common.ui.base.IgSimpleImageView;
import com.instagram.common.ui.base.IgTextView;

/* renamed from: X.E3u, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C31992E3u extends C3OO {
    public final Drawable A00;
    public final Drawable A01;
    public final View A02;
    public final IgLinearLayout A03;
    public final IgSimpleImageView A04;
    public final IgSimpleImageView A05;
    public final IgTextView A06;
    public final IgTextView A07;
    public final /* synthetic */ C31870Dzc A08;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C31992E3u(View view, C31870Dzc c31870Dzc) {
        super(view);
        this.A08 = c31870Dzc;
        this.A02 = view;
        this.A03 = (IgLinearLayout) AbstractC166987dD.A0c(view, R.id.birthday_effects_audience_item_root);
        this.A04 = (IgSimpleImageView) AbstractC166987dD.A0c(view, R.id.birthday_effects_audience_icon);
        this.A07 = AbstractC31175DnJ.A0L(view, R.id.birthday_effects_audience_title);
        this.A06 = AbstractC31175DnJ.A0L(view, R.id.birthday_effects_audience_subtitle);
        this.A05 = (IgSimpleImageView) AbstractC166987dD.A0c(view, R.id.birthday_effects_audience_radio_button);
        Context A0L = AbstractC166997dE.A0L(view);
        int A0C = AbstractC53242c7.A0C(A0L);
        Paint paint = C3LQ.A00;
        this.A00 = C3LQ.A05(A0L, R.drawable.instagram_payments_icons_radio, A0L.getColor(A0C));
        this.A01 = C3LQ.A05(A0L, R.drawable.unchecked, A0L.getColor(AbstractC53242c7.A0B(A0L)));
    }
}
