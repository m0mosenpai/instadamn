package X;

import android.view.View;
import android.widget.TextView;
import com.facebook.R;
import com.instagram.common.ui.base.IgSimpleImageView;

/* renamed from: X.MlO, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C51301MlO extends C3OO {
    public final TextView A00;
    public final TextView A01;
    public final IgSimpleImageView A02;

    public C51301MlO(View view) {
        super(view);
        this.A02 = AbstractC31176DnK.A0T(view, R.id.mk_info_sheet_item_icon);
        this.A01 = AbstractC167007dF.A0N(view, R.id.mk_info_sheet_item_title);
        this.A00 = AbstractC167007dF.A0N(view, R.id.mk_info_sheet_item_description);
    }
}
