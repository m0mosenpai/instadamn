package X;

import android.view.ViewGroup;
import android.widget.TextView;
import com.facebook.R;
import com.instagram.igds.components.checkbox.IgdsCheckBox;

/* renamed from: X.FKw, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C34562FKw {
    public final TextView A00;
    public final TextView A01;
    public final IgdsCheckBox A02;

    public C34562FKw(ViewGroup viewGroup) {
        this.A01 = AbstractC166997dE.A0T(viewGroup, R.id.text);
        this.A00 = AbstractC166997dE.A0T(viewGroup, R.id.learn_more_link);
        this.A02 = (IgdsCheckBox) viewGroup.requireViewById(R.id.list_view_item_checkbox);
    }
}
