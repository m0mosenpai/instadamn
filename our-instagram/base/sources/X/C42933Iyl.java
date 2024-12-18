package X;

import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.instagram.api.schemas.FBProductItemDetailsDict;
import com.instagram.common.session.UserSession;
import com.instagram.model.shopping.productfeed.MultiProductComponent;
import com.instagram.model.shopping.productfeed.ProductFeedItem;
import com.instagram.model.shopping.productfeed.ProductTile;
import com.instagram.user.model.Product;
import com.instagram.user.model.User;

/* renamed from: X.Iyl, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C42933Iyl implements JPn {
    public final UserSession A00;
    public final EnumC64852wj A01;
    public final int A02;
    public final Fragment A03;
    public final InterfaceC60442pS A04;
    public final C64952wt A05;
    public final C64972wv A06;
    public final C64862wk A07;
    public final C64892wn A08;
    public final String A09;
    public final String A0A;
    public final String A0B;

    @Override // X.JPn
    public final void A9z(ProductFeedItem productFeedItem, InterfaceC99144cb interfaceC99144cb, IJ0 ij0) {
        String A00;
        C14360o3.A0B(productFeedItem, 1);
        C64892wn c64892wn = this.A08;
        if (interfaceC99144cb instanceof MultiProductComponent) {
            A00 = ((MultiProductComponent) interfaceC99144cb).A00();
            C14360o3.A0A(A00);
        } else {
            A00 = I7P.A00(this.A01.A00);
        }
        c64892wn.A02(productFeedItem, ij0, A00);
    }

    @Override // X.JPn
    public final void APh(InterfaceC99144cb interfaceC99144cb, int i) {
        String str;
        String str2 = this.A09;
        if (str2 != null && (str = this.A0A) != null) {
            AbstractC41775Ier.A0D(this.A00, this.A04, interfaceC99144cb, str2, this.A0B, str, i);
        }
        UserSession userSession = this.A00;
        ILe A00 = I6L.A00(userSession);
        long j = A00.A00;
        if (j > 0) {
            A00.A01.flowMarkPoint(j, AbstractC111324zv.A00(1566));
            A00.A00();
        }
        this.A07.A00 = false;
        AbstractC25651Mw.A00(userSession).E4s(new C42245InV(interfaceC99144cb));
    }

    @Override // X.JPn
    public final void DbD(InterfaceC99144cb interfaceC99144cb, InterfaceC43415JGf interfaceC43415JGf, Product product, int i, int i2) {
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, X.JPm] */
    @Override // X.C37G
    public final JPm Bgz() {
        return new Object();
    }

    @Override // X.JPn
    public final void Db7(C19260xA c19260xA, ProductFeedItem productFeedItem, InterfaceC99144cb interfaceC99144cb, String str, String str2, int i, int i2, int i3) {
        String A00;
        FBProductItemDetailsDict A01;
        FragmentActivity activity = this.A03.getActivity();
        if (activity != null) {
            INP A02 = this.A05.A02(productFeedItem, i, i2);
            A02.A01(interfaceC99144cb);
            A02.A02(Integer.valueOf(i3), str2);
            A02.A03(interfaceC99144cb.C3N());
            A02.A00();
            UserSession userSession = this.A00;
            ILe A002 = I6L.A00(userSession);
            long j = A002.A00;
            if (j > 0) {
                C1QT c1qt = A002.A01;
                c1qt.flowMarkPoint(j, "VISIT_PDP");
                c1qt.flowEndSuccess(A002.A00);
                A002.A00 = 0L;
            }
            if (interfaceC99144cb instanceof C99134ca) {
                A00 = ((C99134ca) interfaceC99144cb).A00();
            } else {
                A00 = AbstractC111324zv.A00(523);
            }
            C14360o3.A0A(A00);
            ProductTile productTile = productFeedItem.A02;
            if (productTile != null && (A01 = AbstractC41709Idf.A01(productTile)) != null) {
                C1XJ.A00.A10(activity, userSession, this.A04, AbstractC37302Gc3.A0Z(A01));
                return;
            }
            Product A022 = productFeedItem.A02();
            if (A022 == null) {
                return;
            }
            C1XJ c1xj = C1XJ.A00;
            InterfaceC60442pS interfaceC60442pS = this.A04;
            C42130Ile A0L = c1xj.A0L(activity, userSession, interfaceC60442pS, A022, A00, this.A0B);
            A0L.A0N = interfaceC60442pS.getModuleName();
            C42130Ile.A01(A0L);
        }
    }

    @Override // X.JPn
    public final void DbF(InterfaceC99144cb interfaceC99144cb, InterfaceC43416JGg interfaceC43416JGg, Product product, Integer num, String str, int i, int i2) {
        String A00;
        String A002;
        C42905IyJ c42905IyJ = new C42905IyJ(this);
        User user = product.A0B;
        if (user != null && (A00 = AbstractC76433bn.A00(user)) != null) {
            C41625IbF c41625IbF = new C41625IbF(null, this.A06, product, A00);
            if (interfaceC99144cb instanceof MultiProductComponent) {
                A002 = ((MultiProductComponent) interfaceC99144cb).A00();
                C14360o3.A0A(A002);
            } else {
                A002 = I7P.A00(this.A01.A00);
            }
            c41625IbF.A06 = A002;
            c41625IbF.A08 = interfaceC99144cb.C3N();
            c41625IbF.A01 = new C9CO(Integer.valueOf(this.A02), num, this.A0A, interfaceC99144cb.Byk(), str, this.A09);
            c41625IbF.A05 = c42905IyJ;
            c41625IbF.A00();
        }
    }

    @Override // X.JPn
    public final void EDd(View view, ProductFeedItem productFeedItem, String str) {
        this.A08.A00(view, productFeedItem, str);
    }

    public C42933Iyl(Fragment fragment, UserSession userSession, InterfaceC60442pS interfaceC60442pS, C64952wt c64952wt, C64972wv c64972wv, EnumC64852wj enumC64852wj, C64862wk c64862wk, C64892wn c64892wn, String str, String str2, String str3, int i) {
        AbstractC167017dG.A1T(c64892wn, enumC64852wj);
        AbstractC25232BEp.A1P(c64952wt, c64972wv);
        this.A07 = c64862wk;
        this.A00 = userSession;
        this.A04 = interfaceC60442pS;
        this.A03 = fragment;
        this.A08 = c64892wn;
        this.A01 = enumC64852wj;
        this.A09 = str;
        this.A0A = str2;
        this.A0B = str3;
        this.A05 = c64952wt;
        this.A06 = c64972wv;
        this.A02 = i;
    }
}
