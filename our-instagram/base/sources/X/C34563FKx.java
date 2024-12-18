package X;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.facebook.R;
import com.instagram.common.ui.widget.imageview.IgImageView;

/* renamed from: X.FKx, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C34563FKx {
    public final TextView A00;
    public final TextView A01;
    public final IgImageView A02;

    public C34563FKx(View view) {
        IgImageView A0Z = AbstractC31172DnG.A0Z(view, R.id.autocomplete_user_row_imageview);
        this.A02 = A0Z;
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) A0Z.getLayoutParams();
        marginLayoutParams.setMargins(0, 0, 0, 0);
        A0Z.setLayoutParams(marginLayoutParams);
        A0Z.setVisibility(0);
        TextView A0T = AbstractC166997dE.A0T(view, R.id.autocomplete_user_row_username);
        this.A01 = A0T;
        A0T.getPaint().setFakeBoldText(true);
        this.A00 = AbstractC166997dE.A0T(view, R.id.autocomplete_user_row_fullname);
    }
}
