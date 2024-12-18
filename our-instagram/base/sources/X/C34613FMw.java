package X;

import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.facebook.R;
import com.instagram.common.ui.widget.imageview.CircularImageView;
import com.instagram.igds.components.checkbox.IgdsCheckBox;

/* renamed from: X.FMw, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C34613FMw {
    public final LinearLayout A00;
    public final TextView A01;
    public final TextView A02;
    public final CircularImageView A03;
    public final IgdsCheckBox A04;

    public C34613FMw(ViewGroup viewGroup) {
        this.A03 = AbstractC31173DnH.A0T(viewGroup, R.id.avatar_image_view);
        this.A02 = AbstractC31180DnO.A06(viewGroup);
        this.A01 = AbstractC166997dE.A0T(viewGroup, R.id.full_name);
        this.A04 = (IgdsCheckBox) viewGroup.requireViewById(R.id.list_view_item_checkbox);
        this.A00 = AbstractC31172DnG.A0B(viewGroup, R.id.multiple_account_user_row);
    }
}
