package X;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.facebook.R;
import com.instagram.igds.components.button.IgdsButton;

/* loaded from: classes7.dex */
public final class IIC {
    public final ViewGroup A00;
    public final TextView A01;
    public final TextView A02;
    public final IgdsButton A03;

    public IIC(ViewGroup viewGroup) {
        C14360o3.A0B(viewGroup, 1);
        this.A00 = viewGroup;
        View requireViewById = viewGroup.requireViewById(R.id.overlay_title);
        TextView textView = (TextView) requireViewById;
        AbstractC37300Gc1.A0d(textView, true);
        C14360o3.A07(requireViewById);
        this.A02 = textView;
        this.A01 = AbstractC167007dF.A0N(viewGroup, R.id.overlay_subtitle);
        this.A03 = (IgdsButton) AbstractC166997dE.A0R(viewGroup, R.id.overlay_button);
    }
}
