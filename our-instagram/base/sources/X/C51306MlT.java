package X;

import android.content.Context;
import android.view.View;
import com.facebook.R;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.common.ui.widget.imageview.CircularImageView;

/* renamed from: X.MlT, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C51306MlT extends C3OO {
    public final InterfaceC11380iw A00;
    public final IgTextView A01;
    public final CircularImageView A02;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C51306MlT(View view, InterfaceC11380iw interfaceC11380iw) {
        super(view);
        C14360o3.A0B(interfaceC11380iw, 2);
        this.A00 = interfaceC11380iw;
        CircularImageView circularImageView = (CircularImageView) AbstractC166987dD.A0c(view, R.id.quick_snap_reaction_item_avatar);
        this.A02 = circularImageView;
        this.A01 = AbstractC31175DnJ.A0L(view, R.id.quick_snap_reaction_item_emoji);
        Context context = view.getContext();
        int A00 = AMo.A00(context, R.dimen.account_recs_header_image_margin);
        C14360o3.A07(context);
        circularImageView.A0H(A00, AbstractC167007dF.A09(context, R.attr.igds_color_icon_on_media));
        circularImageView.setStrokeAlpha(38);
    }
}
