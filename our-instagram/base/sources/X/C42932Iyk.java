package X;

import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.model.shopping.productfeed.ProductFeedItem;
import com.instagram.model.shopping.productfeed.ProductTile;
import com.instagram.user.model.Product;
import com.instagram.user.model.User;
import java.util.Map;

/* renamed from: X.Iyk, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C42932Iyk implements JPn {
    public final Fragment A00;
    public final UserSession A01;
    public final InterfaceC686136y A02;
    public final InterfaceC60442pS A03;
    public final InterfaceC65282xQ A04;
    public final C64892wn A05;
    public final C1M1 A06;
    public final String A07;

    @Override // X.JPn
    public final void A9z(ProductFeedItem productFeedItem, InterfaceC99144cb interfaceC99144cb, IJ0 ij0) {
        C14360o3.A0B(productFeedItem, 1);
        C64892wn c64892wn = this.A05;
        String id = interfaceC99144cb.getId();
        C14360o3.A07(id);
        c64892wn.A02(productFeedItem, ij0, id);
    }

    @Override // X.JPn
    public final void DbD(InterfaceC99144cb interfaceC99144cb, InterfaceC43415JGf interfaceC43415JGf, Product product, int i, int i2) {
    }

    @Override // X.JPn
    public final void APh(InterfaceC99144cb interfaceC99144cb, int i) {
        InterfaceC60442pS interfaceC60442pS = this.A03;
        UserSession userSession = this.A01;
        AbstractC41775Ier.A0D(userSession, interfaceC60442pS, interfaceC99144cb, this.A06.getSessionId(), this.A07, interfaceC99144cb.Byk(), i);
        Map map = AbstractC99104cX.A00(userSession).A00;
        String Byk = interfaceC99144cb.Byk();
        if (Byk != null) {
            map.remove(Byk);
            this.A04.AVK();
            return;
        }
        throw AbstractC166997dE.A0g();
    }

    @Override // X.C37G
    public final JPm Bgz() {
        return this.A02.Bgz();
    }

    @Override // X.JPn
    public final void Db7(C19260xA c19260xA, ProductFeedItem productFeedItem, InterfaceC99144cb interfaceC99144cb, String str, String str2, int i, int i2, int i3) {
        Product A02;
        FragmentActivity activity = this.A00.getActivity();
        if (activity != null) {
            ProductTile productTile = productFeedItem.A02;
            if ((productTile == null || (A02 = productTile.A07) == null) && (A02 = productFeedItem.A02()) == null) {
                return;
            }
            UserSession userSession = this.A01;
            InterfaceC60442pS interfaceC60442pS = this.A03;
            String str3 = this.A07;
            INP A022 = new C64952wt(interfaceC60442pS, userSession, str3, null, null, interfaceC60442pS.getModuleName(), null, null, null, null, null, null, null, -1).A02(productFeedItem, i, i2);
            A022.A01(interfaceC99144cb);
            A022.A02(Integer.valueOf(i3), str2);
            A022.A00();
            C1XJ c1xj = C1XJ.A00;
            if (str != null) {
                C42130Ile.A01(c1xj.A0L(activity, userSession, interfaceC60442pS, A02, str, str3));
                return;
            }
            throw AbstractC166997dE.A0g();
        }
    }

    @Override // X.JPn
    public final void DbF(InterfaceC99144cb interfaceC99144cb, InterfaceC43416JGg interfaceC43416JGg, Product product, Integer num, String str, int i, int i2) {
        String A00;
        FragmentActivity activity = this.A00.getActivity();
        if (activity != null) {
            UserSession userSession = this.A01;
            InterfaceC60442pS interfaceC60442pS = this.A03;
            C64972wv A01 = AbstractC64962wu.A01(activity, activity, userSession, interfaceC60442pS, interfaceC60442pS.getModuleName(), this.A07);
            User user = product.A0B;
            if (user != null && (A00 = AbstractC76433bn.A00(user)) != null) {
                C41625IbF c41625IbF = new C41625IbF(null, A01, product, A00);
                String id = interfaceC99144cb.getId();
                c41625IbF.A06 = id;
                c41625IbF.A08 = id;
                c41625IbF.A05 = interfaceC43416JGg;
                c41625IbF.A00();
                return;
            }
            throw AbstractC166997dE.A0g();
        }
    }

    @Override // X.JPn
    public final void EDd(View view, ProductFeedItem productFeedItem, String str) {
        this.A05.A00(view, productFeedItem, str);
    }

    public C42932Iyk(Fragment fragment, UserSession userSession, InterfaceC686136y interfaceC686136y, InterfaceC60442pS interfaceC60442pS, InterfaceC65282xQ interfaceC65282xQ, C64892wn c64892wn, C1M1 c1m1, String str) {
        AbstractC167017dG.A1T(c64892wn, c1m1);
        this.A02 = interfaceC686136y;
        this.A01 = userSession;
        this.A03 = interfaceC60442pS;
        this.A00 = fragment;
        this.A05 = c64892wn;
        this.A06 = c1m1;
        this.A07 = str;
        this.A04 = interfaceC65282xQ;
    }
}
