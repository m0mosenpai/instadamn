package X;

import android.view.View;
import com.facebook.R;
import com.instagram.igds.components.button.IgdsButton;

/* loaded from: classes6.dex */
public final class FNT {
    public final View A00;
    public final View A01;
    public final View A02;
    public final IgdsButton A03;
    public final IgdsButton A04;
    public final IgdsButton A05;

    public FNT(View view) {
        View requireViewById = view.requireViewById(R.id.cta_1);
        this.A00 = requireViewById;
        View requireViewById2 = view.requireViewById(R.id.cta_2);
        this.A01 = requireViewById2;
        View requireViewById3 = view.requireViewById(R.id.cta_3);
        this.A02 = requireViewById3;
        this.A03 = AbstractC31173DnH.A0W(requireViewById, R.id.cta_button);
        this.A04 = AbstractC31173DnH.A0W(requireViewById2, R.id.cta_button);
        this.A05 = AbstractC31173DnH.A0W(requireViewById3, R.id.cta_button);
    }
}
