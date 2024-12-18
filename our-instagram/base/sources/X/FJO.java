package X;

import android.view.ViewGroup;
import android.widget.TextView;
import com.facebook.R;
import com.instagram.igds.components.checkbox.IgdsCheckBox;

/* loaded from: classes6.dex */
public final class FJO {
    public final TextView A00;
    public final IgdsCheckBox A01;

    public FJO(ViewGroup viewGroup) {
        this.A00 = AbstractC166997dE.A0T(viewGroup, R.id.text);
        this.A01 = (IgdsCheckBox) viewGroup.requireViewById(R.id.list_view_item_checkbox);
    }
}
