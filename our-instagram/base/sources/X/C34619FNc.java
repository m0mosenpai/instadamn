package X;

import android.view.View;
import com.facebook.R;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.common.ui.widget.imageview.IgImageView;

/* renamed from: X.FNc, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C34619FNc {
    public final IgTextView A00;
    public final IgTextView A01;
    public final IgImageView A02;
    public final IgImageView A03;
    public final IgImageView A04;
    public final View A05;

    public C34619FNc(View view) {
        C14360o3.A0B(view, 1);
        this.A05 = view;
        this.A04 = AbstractC167007dF.A0T(view, R.id.profile_featured_banner_item_order_icon);
        this.A03 = AbstractC167007dF.A0T(view, R.id.profile_featured_banner_item_banner_icon);
        this.A01 = AbstractC25231BEo.A0d(view, R.id.profile_header_banner_item_title);
        this.A00 = AbstractC25231BEo.A0d(view, R.id.profile_header_banner_item_subtitle);
        this.A02 = AbstractC167007dF.A0T(view, R.id.profile_featured_banner_item_remove_icon);
    }
}
