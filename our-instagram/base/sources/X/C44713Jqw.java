package X;

import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.facebook.R;
import com.instagram.common.ui.base.IgSimpleImageView;
import com.instagram.common.ui.widget.imageview.IgImageView;

/* renamed from: X.Jqw, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C44713Jqw extends C3OO {
    public final LinearLayout A00;
    public final TextView A01;
    public final IgSimpleImageView A02;
    public final IgImageView A03;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C44713Jqw(View view) {
        super(view);
        C14360o3.A0B(view, 1);
        this.A00 = (LinearLayout) AbstractC166997dE.A0R(view, R.id.row_effect_recent_search_container);
        this.A03 = AbstractC167007dF.A0T(view, R.id.row_search_profile_image);
        this.A01 = AbstractC167007dF.A0N(view, R.id.row_effect_recent_search_title);
        this.A02 = AbstractC31176DnK.A0T(view, R.id.dismiss_button);
    }
}
