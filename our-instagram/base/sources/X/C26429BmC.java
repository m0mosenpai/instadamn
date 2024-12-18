package X;

import android.graphics.Typeface;
import android.widget.ImageView;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrlBase;
import com.instagram.model.mediasize.ImageInfo;
import com.instagram.model.shopping.productimagecontainer.ProductImageContainer;
import com.instagram.user.model.Product;
import java.util.List;

/* renamed from: X.BmC, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26429BmC extends AbstractC51572Yf {
    public final List A00;
    public final InterfaceC16660sJ A01;
    public final InterfaceC16660sJ A02;
    public final InterfaceC11380iw A03;
    public final UserSession A04;

    public C26429BmC(InterfaceC11380iw interfaceC11380iw, UserSession userSession, List list, InterfaceC16660sJ interfaceC16660sJ, InterfaceC16660sJ interfaceC16660sJ2) {
        AbstractC25234BEr.A0j(2, interfaceC11380iw, userSession, interfaceC16660sJ, interfaceC16660sJ2);
        this.A00 = list;
        this.A03 = interfaceC11380iw;
        this.A04 = userSession;
        this.A02 = interfaceC16660sJ;
        this.A01 = interfaceC16660sJ2;
    }

    @Override // X.AbstractC51572Yf
    public final AbstractC50812Vc A0Y(C76223bS c76223bS) {
        int min;
        Product product;
        ImageInfo BGx;
        List AlQ;
        ImageUrlBase imageUrlBase;
        ImageInfo BGx2;
        List AlQ2;
        ImageUrlBase imageUrlBase2;
        C14360o3.A0B(c76223bS, 0);
        List list = this.A00;
        if (list != null && !list.isEmpty()) {
            long A0C = AbstractC77623dm.A0C(c76223bS);
            long A0D = AbstractC77623dm.A0D(c76223bS, R.dimen.ab_test_media_thumbnail_preview_item_width);
            long A0D2 = AbstractC77623dm.A0D(c76223bS, R.dimen.ad_not_delivering_thumbnail_height);
            long A0B = AbstractC77623dm.A0B(c76223bS);
            long A0B2 = AbstractC77623dm.A0B(c76223bS);
            int A09 = AbstractC25228BEl.A09(c76223bS, R.color.fundraiser_search_background_tint_color);
            C2XE c2xe = c76223bS.A05;
            int A02 = AbstractC25232BEp.A02(c2xe.A0C, c76223bS);
            String A00 = AnonymousClass001.A00('+', list.size() - 2);
            boolean A1S = AbstractC25230BEn.A1S(list.size(), 3);
            if (A1S) {
                min = 2;
            } else {
                min = Math.min(list.size(), 3);
            }
            List<Product> A0i = AbstractC001800i.A0i(list, C17s.A0C(0, min));
            if (A1S) {
                product = (Product) AbstractC001800i.A0O(list, 2);
            } else {
                product = null;
            }
            C75933ay c75933ay = C51722Yv.A02;
            EnumC77683ds enumC77683ds = EnumC77683ds.CENTER;
            Integer num = C05F.A00;
            C51722Yv A002 = C9CU.A00(AbstractC25233BEq.A0b(AbstractC25232BEp.A17(num, enumC77683ds, 3), num, 0), C05F.A04, 0, A0C);
            C2Z0 A0P = AbstractC167007dF.A0P(c2xe);
            for (Product product2 : A0i) {
                ProductImageContainer productImageContainer = product2.A09;
                if (productImageContainer == null || (BGx2 = productImageContainer.BGx()) == null || (AlQ2 = BGx2.AlQ()) == null || (imageUrlBase2 = (ImageUrlBase) AbstractC001800i.A0J(AlQ2)) == null) {
                    return null;
                }
                A0P.A00(new C26645Bpg(ImageView.ScaleType.CENTER_CROP, AbstractC25233BEq.A0d(C9CU.A00(C9CU.A00(C9CU.A00(AbstractC25230BEn.A0d(AbstractC25230BEn.A0d(null, C05F.A01, 1.0f, 1), C05F.A0Y, 1.0f, 1), C05F.A0N, 0, A0D), C05F.A0C, 0, A0D2), C05F.A0G, 0, A0B2), new C57751Pje(15, product2, this)), this.A03, imageUrlBase2, AbstractC25228BEl.A08(A0P, A0B), AbstractC25233BEq.A05(A0P), -16777216, false, false));
            }
            if (product != null) {
                ProductImageContainer productImageContainer2 = product.A09;
                if (productImageContainer2 == null || (BGx = productImageContainer2.BGx()) == null || (AlQ = BGx.AlQ()) == null || (imageUrlBase = (ImageUrlBase) AbstractC001800i.A0J(AlQ)) == null) {
                    return null;
                }
                Integer num2 = C05F.A01;
                C51722Yv A0d = AbstractC25230BEn.A0d(null, num2, 1.0f, 1);
                Integer num3 = C05F.A0Y;
                C51722Yv A0d2 = AbstractC25233BEq.A0d(C9CU.A00(C9CU.A00(C9CU.A00(AbstractC25230BEn.A0d(A0d, num3, 1.0f, 1), C05F.A0N, 0, A0D), C05F.A0C, 0, A0D2), C05F.A0G, 0, A0B2), new C57746PjZ(this, 10));
                C2Z0 A13 = AbstractC25232BEp.A13(A0P);
                C51722Yv A0N = AbstractC25234BEr.A0N(null, num2, num, 100.0f, 0);
                EnumC77933eL enumC77933eL = EnumC77933eL.ABSOLUTE;
                A13.A00(new C26645Bpg(ImageView.ScaleType.CENTER_CROP, C9CV.A00(A0N, num3, enumC77933eL, 3), this.A03, imageUrlBase, AbstractC25228BEl.A08(A13, A0B), AbstractC25233BEq.A05(A13), -16777216, false, false));
                A13.A00(new C26629BpQ(C9CV.A00(AbstractC25234BEr.A0N(null, num2, num, 100.0f, 0), num3, enumC77933eL, 3), AbstractC25228BEl.A08(A13, A0B), A09));
                C51722Yv A003 = C9CV.A00(null, num, enumC77683ds, 3);
                long A0r = AbstractC25232BEp.A0r(14.0f);
                Typeface typeface = Typeface.DEFAULT;
                long A0D3 = AbstractC25229BEm.A0D();
                C77723dw A0a = AbstractC25231BEo.A0a(A13.A00, null, A00, 0);
                AbstractC25233BEq.A1B(A13, A0a, A02, A0r);
                A0a.A0S(0);
                AbstractC25234BEr.A0o(typeface, A13, A0a, A0D3);
                A0a.A0X(num);
                AbstractC25234BEr.A1D(A0a, num, 1.0f, false, true);
                AbstractC25233BEq.A1A(A13, A003, A0a);
                A0P.A00(AbstractC76963ci.A04(A13, A0P, A0d2));
            }
            return AbstractC76963ci.A0F(A0P, c76223bS, A002);
        }
        return null;
    }
}
