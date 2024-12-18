package X;

import android.view.View;
import android.widget.TextView;
import com.facebook.R;
import com.instagram.common.ui.widget.imageview.IgImageView;

/* loaded from: classes6.dex */
public final class FN7 {
    public final TextView A00;
    public final TextView A01;
    public final TextView A02;
    public final IgImageView A03;
    public final IgImageView A04;

    public FN7(View view) {
        C14360o3.A0B(view, 1);
        this.A02 = AbstractC167007dF.A0N(view, R.id.save_collection_header_title);
        this.A00 = AbstractC167007dF.A0N(view, R.id.save_collection_header_primary_subtitle);
        this.A01 = AbstractC167007dF.A0N(view, R.id.save_collection_header_secondary_subtitle);
        this.A03 = AbstractC167007dF.A0T(view, R.id.direct_share_button);
        this.A04 = AbstractC167007dF.A0T(view, R.id.save_collection_header_facepile);
    }
}
