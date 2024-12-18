package X;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.instagram.api.schemas.FBProductItemDetailsDict;
import com.instagram.common.session.UserSession;
import com.instagram.model.shopping.productfeed.ProductFeedItem;
import com.instagram.model.shopping.productfeed.ProductTile;
import com.instagram.user.model.Product;

/* loaded from: classes7.dex */
public final class IMS {
    public final Fragment A00;
    public final UserSession A01;
    public final InterfaceC60442pS A02;
    public final C64952wt A03;
    public final C64972wv A04;
    public final C64892wn A05;
    public final String A06;
    public final String A07;
    public final InterfaceC43420JGk A08;

    public final void A00(ProductFeedItem productFeedItem, InterfaceC99144cb interfaceC99144cb, String str, String str2, int i, int i2, int i3) {
        INP A02 = this.A03.A02(productFeedItem, i, i2);
        A02.A01(interfaceC99144cb);
        A02.A02(Integer.valueOf(i3), str2);
        A02.A00();
        ProductTile productTile = productFeedItem.A02;
        if (productTile != null && AbstractC41709Idf.A01(productTile) != null) {
            C1XJ c1xj = C1XJ.A00;
            FragmentActivity activity = this.A00.getActivity();
            activity.getClass();
            UserSession userSession = this.A01;
            InterfaceC60442pS interfaceC60442pS = this.A02;
            FBProductItemDetailsDict A01 = AbstractC41709Idf.A01(productFeedItem.A02);
            C14360o3.A0B(A01, 0);
            c1xj.A10(activity, userSession, interfaceC60442pS, AbstractC37302Gc3.A0Z(A01));
            return;
        }
        C1XJ c1xj2 = C1XJ.A00;
        FragmentActivity activity2 = this.A00.getActivity();
        activity2.getClass();
        Product A022 = productFeedItem.A02();
        A022.getClass();
        C42130Ile A0L = c1xj2.A0L(activity2, this.A01, this.A02, A022, str, this.A07);
        A0L.A0N = this.A06;
        C42130Ile.A01(A0L);
    }

    public IMS(Fragment fragment, UserSession userSession, InterfaceC60442pS interfaceC60442pS, C64952wt c64952wt, C64972wv c64972wv, InterfaceC43420JGk interfaceC43420JGk, C64892wn c64892wn, String str, String str2) {
        this.A00 = fragment;
        this.A01 = userSession;
        this.A02 = interfaceC60442pS;
        this.A07 = str;
        this.A06 = str2;
        this.A04 = c64972wv;
        this.A05 = c64892wn;
        this.A08 = interfaceC43420JGk;
        this.A03 = c64952wt;
    }
}
