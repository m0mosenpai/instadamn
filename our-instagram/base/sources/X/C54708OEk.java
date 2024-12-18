package X;

import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import android.widget.ImageView;
import com.facebook.R;
import com.instagram.common.ui.base.IgTextView;

/* renamed from: X.OEk, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C54708OEk {
    public final Context A00;
    public final View A01;
    public final View A02;
    public final ImageView A03;
    public final IgTextView A04;
    public final IgTextView A05;
    public final IgTextView A06;

    public C54708OEk(View view) {
        C14360o3.A0B(view, 1);
        Context A0L = AbstractC166997dE.A0L(view);
        this.A00 = A0L;
        Resources resources = A0L.getResources();
        this.A01 = view;
        this.A02 = view.requireViewById(R.id.fundraiser_cta_description_layout);
        ImageView A0I = AbstractC31173DnH.A0I(view, R.id.thumbnail_image);
        this.A03 = A0I;
        this.A06 = AbstractC31172DnG.A0X(view, R.id.fundraiser_title);
        this.A05 = AbstractC31172DnG.A0X(view, R.id.fundraiser_subtitle);
        this.A04 = AbstractC31172DnG.A0X(view, R.id.fundraiser_cta_button);
        A0I.setImageDrawable(new BOM(A0L, null, resources.getDimensionPixelSize(R.dimen.abc_dropdownitem_icon_width), resources.getDimensionPixelSize(R.dimen.audience_lists_text_in_badge_horizontal_margin_right), 0, 0, 0, -1, false));
    }
}
