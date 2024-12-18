package X;

import android.content.Context;
import android.view.View;
import com.facebook.R;
import com.instagram.common.ui.base.IgTextView;

/* loaded from: classes6.dex */
public final class E33 extends C3OO {
    public final Context A00;
    public final IgTextView A01;
    public final IgTextView A02;
    public final IgTextView A03;

    public E33(View view) {
        super(view);
        this.A00 = AbstractC166997dE.A0L(view);
        this.A03 = AbstractC25231BEo.A0d(view, R.id.address_button_title);
        this.A02 = AbstractC25231BEo.A0d(view, R.id.address_button_subtitle);
        this.A01 = AbstractC25231BEo.A0d(view, R.id.primary_address_label);
    }
}
