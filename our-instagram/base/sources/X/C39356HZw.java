package X;

import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.facebook.R;
import com.instagram.common.ui.widget.imageview.IgImageView;
import java.util.List;

/* renamed from: X.HZw, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C39356HZw extends AbstractC38392GuT {
    public final LinearLayout A00;
    public final LinearLayout A01;
    public final TextView A02;
    public final TextView A03;
    public final IgImageView A04;
    public final List A05;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C39356HZw(View view) {
        super(view);
        C14360o3.A0B(view, 1);
        this.A01 = (LinearLayout) AbstractC166997dE.A0R(view, R.id.product_thumbnail_container);
        this.A05 = AbstractC166987dD.A1E();
        this.A00 = (LinearLayout) view;
        this.A04 = AbstractC167007dF.A0T(view, R.id.merchant_avatar);
        this.A03 = AbstractC167007dF.A0N(view, R.id.merchant_username);
        this.A02 = AbstractC167007dF.A0N(view, R.id.merchant_secondary_info);
    }
}
