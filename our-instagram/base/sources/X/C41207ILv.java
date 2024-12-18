package X;

import android.view.View;
import android.widget.TextView;
import com.facebook.R;
import com.instagram.model.shopping.ProductSource;

/* renamed from: X.ILv, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C41207ILv {
    public final View A00;
    public final InterfaceC43413JGd A01;
    public final TextView A02;
    public final TextView A03;

    public final void A00(ProductSource productSource) {
        TextView textView = this.A03;
        if (productSource == null) {
            textView.setText(2131968588);
        } else {
            textView.setText(productSource.A04);
            this.A02.setText(productSource.A03);
        }
    }

    public C41207ILv(View view, InterfaceC43413JGd interfaceC43413JGd) {
        this.A01 = interfaceC43413JGd;
        View requireViewById = view.requireViewById(R.id.product_source);
        this.A00 = requireViewById;
        this.A03 = AbstractC166987dD.A0e(view, R.id.product_source_title);
        this.A02 = AbstractC166987dD.A0e(view, R.id.product_source_subtitle);
        ViewOnClickListenerC42035Ik4.A01(requireViewById, 1, this);
    }
}
