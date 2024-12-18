package X;

import android.content.Context;
import android.view.ViewGroup;
import android.widget.TextView;
import com.facebook.R;
import com.instagram.model.mediasize.ExtendedImageUrl;
import com.instagram.model.mediasize.ImageInfo;
import com.instagram.shopping.fragment.postpurchase.ProductSharePickerFragment;
import com.instagram.user.model.Product;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.Dzh, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C31875Dzh extends C2UU {
    public final InterfaceC11380iw A00;
    public final ProductSharePickerFragment A01;
    public final List A02;

    @Override // X.C2UU
    public final /* bridge */ /* synthetic */ C3OO onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new C31948E2c(AbstractC25226BEj.A0R(AbstractC25231BEo.A0O(viewGroup), viewGroup, R.layout.product_share_picker_row, false));
    }

    @Override // X.C2UU
    public final /* bridge */ /* synthetic */ void onBindViewHolder(C3OO c3oo, int i) {
        String str;
        C31948E2c c31948E2c = (C31948E2c) c3oo;
        C14360o3.A0B(c31948E2c, 0);
        Product product = (Product) AbstractC001800i.A0O(this.A02, i);
        if (product != null) {
            ProductSharePickerFragment productSharePickerFragment = this.A01;
            InterfaceC11380iw interfaceC11380iw = this.A00;
            Context A05 = AbstractC31172DnG.A05(c31948E2c);
            ImageInfo imageInfo = product.A08;
            if (imageInfo == null && (imageInfo = product.A07) == null) {
                c31948E2c.A02.A09();
            } else {
                ExtendedImageUrl A02 = AbstractC40161tk.A02(imageInfo);
                if (A02 != null) {
                    c31948E2c.A02.setUrl(A02, interfaceC11380iw);
                }
            }
            c31948E2c.A01.setText(product.A0J);
            TextView textView = c31948E2c.A00;
            User user = product.A0B;
            if (user != null) {
                str = user.getUsername();
            } else {
                str = null;
            }
            AbstractC31177DnL.A0r(A05, textView, str, 2131970006);
            ViewOnClickListenerC35687FpM.A00(c31948E2c.itemView, 60, productSharePickerFragment, product);
        }
    }

    public C31875Dzh(InterfaceC11380iw interfaceC11380iw, ProductSharePickerFragment productSharePickerFragment, List list) {
        this.A01 = productSharePickerFragment;
        ArrayList A1E = AbstractC166987dD.A1E();
        this.A02 = A1E;
        A1E.addAll(list);
        this.A00 = interfaceC11380iw;
    }

    @Override // X.C2UU
    public final int getItemCount() {
        int A03 = C0f9.A03(1283463463);
        int size = this.A02.size();
        C0f9.A0A(531921867, A03);
        return size;
    }
}
