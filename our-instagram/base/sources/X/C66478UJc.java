package X;

import android.view.View;
import com.facebook.R;
import com.instagram.common.ui.base.IgSimpleImageView;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.common.ui.widget.imageview.CircularImageView;

/* renamed from: X.UJc, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C66478UJc extends C3OO {
    public final View A00;
    public final IgSimpleImageView A01;
    public final IgTextView A02;
    public final IgTextView A03;
    public final IgTextView A04;
    public final IgTextView A05;
    public final IgTextView A06;
    public final IgTextView A07;
    public final CircularImageView A08;
    public final IgSimpleImageView A09;

    public C66478UJc(View view) {
        super(view);
        this.A00 = view;
        this.A08 = AbstractC31176DnK.A0U(view, R.id.row_search_upsell_imageview);
        this.A04 = AbstractC25231BEo.A0d(view, R.id.row_search_upsell_header);
        this.A06 = AbstractC25231BEo.A0d(view, R.id.row_search_upsell_title);
        this.A07 = AbstractC25231BEo.A0d(view, R.id.row_search_upsell_title_non_bold);
        this.A03 = AbstractC25231BEo.A0d(view, R.id.row_search_upsell_cta);
        this.A05 = AbstractC25231BEo.A0d(view, R.id.row_search_upsell_subtitle);
        this.A01 = AbstractC31176DnK.A0T(view, R.id.dismiss_button);
        this.A09 = AbstractC31176DnK.A0T(view, R.id.chevron);
        this.A02 = AbstractC25231BEo.A0d(view, R.id.button);
    }
}
