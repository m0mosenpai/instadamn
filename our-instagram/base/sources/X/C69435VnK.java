package X;

import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.facebook.R;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.common.ui.widget.imageview.IgImageView;
import com.instagram.ui.widget.thumbnailview.ThumbnailView;

/* renamed from: X.VnK, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C69435VnK {
    public IgTextView A00;
    public IgImageView A01;
    public final int A02;
    public final int A03;
    public final ViewGroup A04;
    public final ImageView A05;
    public final TextView A06;
    public final InterfaceC56392iX A07;
    public final InterfaceC56392iX A08;
    public final ThumbnailView A09;

    public C69435VnK(ViewGroup viewGroup) {
        C14360o3.A0B(viewGroup, 1);
        this.A04 = viewGroup;
        this.A09 = (ThumbnailView) AbstractC166997dE.A0R(viewGroup, R.id.saved_collection_thumbnail);
        this.A06 = AbstractC167007dF.A0N(viewGroup, R.id.saved_collection_name);
        this.A08 = AbstractC166997dE.A0X(viewGroup, R.id.saved_collection_glyph_stub);
        InterfaceC56392iX A0X = AbstractC166997dE.A0X(viewGroup, R.id.saved_collection_context_stub);
        this.A07 = A0X;
        A0X.EZv(new C70833Whq(this, 2));
        this.A05 = (ImageView) viewGroup.requireViewById(R.id.saved_collection_icon);
        this.A02 = viewGroup.getResources().getDimensionPixelSize(R.dimen.ab_test_media_thumbnail_preview_item_internal_padding);
        this.A03 = AbstractC53242c7.A0B(viewGroup.getContext());
        AbstractC56952jT.A01(viewGroup);
    }
}
