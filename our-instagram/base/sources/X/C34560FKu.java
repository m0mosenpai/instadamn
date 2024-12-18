package X;

import android.view.ViewGroup;
import android.widget.TextView;
import com.facebook.R;
import com.instagram.common.ui.widget.imageview.CircularImageView;
import com.instagram.igds.components.checkbox.IgdsCheckBox;

/* renamed from: X.FKu, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C34560FKu {
    public final TextView A00;
    public final CircularImageView A01;
    public final IgdsCheckBox A02;

    public C34560FKu(ViewGroup viewGroup) {
        this.A01 = AbstractC31173DnH.A0T(viewGroup, R.id.row_user_avatar);
        this.A00 = AbstractC166997dE.A0T(viewGroup, R.id.row_username_textview);
        this.A02 = (IgdsCheckBox) viewGroup.requireViewById(R.id.select_checkbox);
    }
}
