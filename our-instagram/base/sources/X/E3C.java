package X;

import android.view.View;
import android.widget.ImageView;
import com.facebook.R;
import com.instagram.common.ui.base.IgTextView;

/* loaded from: classes6.dex */
public final class E3C extends C3OO {
    public final ImageView A00;
    public final IgTextView A01;
    public final InterfaceC56392iX A02;
    public final IgTextView A03;

    public E3C(View view) {
        super(view);
        this.A00 = AbstractC31176DnK.A0D(view, R.id.image);
        this.A01 = AbstractC25231BEo.A0d(view, R.id.label);
        this.A03 = AbstractC25231BEo.A0d(view, R.id.secondary_label);
        this.A02 = AbstractC166997dE.A0X(view, R.id.universal_creation_menu_row_badge_stub);
    }
}
