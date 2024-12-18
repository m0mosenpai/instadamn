package X;

import android.view.View;
import android.widget.TextView;
import com.facebook.R;

/* renamed from: X.6Te, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C139496Te {
    public View A00;
    public TextView A01;
    public TextView A02;
    public final InterfaceC56392iX A03;

    public C139496Te(InterfaceC56392iX interfaceC56392iX) {
        this.A03 = interfaceC56392iX;
        interfaceC56392iX.EZv(new InterfaceC69513Al() { // from class: X.6Tf
            @Override // X.InterfaceC69513Al
            public final void DLu(View view) {
                C14360o3.A0B(view, 0);
                C139496Te c139496Te = C139496Te.this;
                c139496Te.A00 = view;
                TextView textView = (TextView) view.requireViewById(R.id.product_pill_header);
                C14360o3.A0B(textView, 0);
                c139496Te.A02 = textView;
                TextView textView2 = (TextView) view.requireViewById(R.id.product_pill_header_more_products);
                C14360o3.A0B(textView2, 0);
                c139496Te.A01 = textView2;
            }
        });
    }
}
