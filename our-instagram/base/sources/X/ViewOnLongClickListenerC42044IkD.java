package X;

import android.view.View;
import com.instagram.model.shopping.productfeed.ProductFeedItem;

/* renamed from: X.IkD, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class ViewOnLongClickListenerC42044IkD implements View.OnLongClickListener {
    public final int A00;
    public final int A01;
    public final int A02;
    public final Object A03;
    public final Object A04;
    public final String A05;

    public ViewOnLongClickListenerC42044IkD(ProductFeedItem productFeedItem, JII jii, String str, int i, int i2, int i3) {
        this.A00 = i3;
        this.A03 = jii;
        this.A04 = productFeedItem;
        this.A02 = i;
        this.A01 = i2;
        this.A05 = str;
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(View view) {
        return ((JII) this.A03).DbA((ProductFeedItem) this.A04, this.A05, this.A02, this.A01, false);
    }
}
