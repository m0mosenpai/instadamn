package X;

import android.content.Context;
import android.view.View;
import android.widget.TextView;
import com.facebook.R;
import com.instagram.common.ui.widget.imageview.CircularImageView;
import com.instagram.common.ui.widget.imageview.IgImageView;

/* renamed from: X.MmY, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C51373MmY extends C3OO implements InterfaceC11380iw {
    public static final String __redex_internal_original_name = "ImmersiveCatchUpFilteredItemViewHolder";
    public final Context A00;
    public final TextView A01;
    public final CircularImageView A02;
    public final IgImageView A03;
    public final IgImageView A04;

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "ImmersiveCatchUpExploreItemViewHolder";
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C51373MmY(View view, Context context) {
        super(view);
        AbstractC167017dG.A1P(view, context);
        this.A00 = context;
        this.A04 = AbstractC31172DnG.A0a(view, R.id.explore_image_view_item);
        this.A02 = (CircularImageView) view.findViewById(R.id.profile_picture);
        this.A01 = AbstractC166987dD.A0e(view, R.id.profile_attribution);
        this.A03 = AbstractC31172DnG.A0a(view, R.id.explore_content_type_icon);
    }
}
