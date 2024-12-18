package X;

import android.view.View;
import android.widget.ImageButton;
import com.facebook.R;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.common.ui.widget.imageview.RoundedCornerImageView;

/* renamed from: X.IIa, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C41109IIa {
    public final ImageButton A00;
    public final IgTextView A01;
    public final IgTextView A02;
    public final RoundedCornerImageView A03;

    public C41109IIa(View view) {
        C14360o3.A0B(view, 1);
        this.A02 = AbstractC25231BEo.A0d(view, R.id.shopping_item_name);
        this.A01 = AbstractC25231BEo.A0d(view, R.id.shopping_item_details);
        this.A03 = (RoundedCornerImageView) AbstractC166997dE.A0R(view, R.id.shopping_item_image);
        this.A00 = (ImageButton) AbstractC166997dE.A0R(view, R.id.shopping_item_delete_button);
    }
}
