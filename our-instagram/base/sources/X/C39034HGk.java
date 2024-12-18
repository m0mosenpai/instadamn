package X;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import com.facebook.R;
import com.instagram.api.schemas.ContainerEffectEnum;
import com.instagram.api.schemas.DynamicEffectState;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.widget.imageview.IgImageView;
import com.instagram.model.mediasize.ExtendedImageUrl;
import com.instagram.model.mediasize.ImageInfoImpl;
import com.instagram.model.shopping.ProductArEffectMetadata;
import com.instagram.shopping.intf.ProductDetailsPageArguments;
import com.instagram.user.model.Product;
import java.util.HashMap;

/* renamed from: X.HGk, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C39034HGk extends AbstractC65806TuP {
    @Override // X.AbstractC65806TuP
    public final View A0J(Context context) {
        C14360o3.A0B(context, 0);
        View A0D = AbstractC25227BEk.A0D(LayoutInflater.from(context), null, R.layout.hero_carousel_try_in_ar, false);
        A0D.setTag(new C38474Gvv(A0D));
        return AbstractC41652Ibk.A00(A0D);
    }

    @Override // X.AbstractC65806TuP
    public final void A0M(View view, C6FG c6fg, C102884kP c102884kP, Object obj, Object obj2) {
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r15v0, types: [X.2pS, X.0iw, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v1, types: [X.0ps, java.lang.Object] */
    public final void A0O(View view, C6FG c6fg, C102884kP c102884kP, boolean z) {
        ProductDetailsPageArguments productDetailsPageArguments;
        Product product;
        C14360o3.A0B(c6fg, 1);
        UserSession A00 = IQ2.A00(c6fg, "HeroCarouselTryInARRenderUnit");
        if (A00 != null) {
            ?? obj = new Object();
            C41121IIm A02 = AbstractC41652Ibk.A02(c6fg, A00, "HeroCarouselTryInARRenderUnit");
            if (A02 != null && (product = (productDetailsPageArguments = A02.A00).A06) != null) {
                ImageInfoImpl imageInfoImpl = null;
                String str = "";
                String str2 = "";
                String A0L = c102884kP.A0L(40);
                if (A0L != null) {
                    str = A0L;
                }
                String str3 = str2;
                String A0H = c102884kP.A0H();
                if (A0H != null) {
                    str3 = A0H;
                }
                String str4 = str2;
                String A0J = c102884kP.A0J();
                if (A0J != null) {
                    str4 = A0J;
                }
                String str5 = str2;
                String A0I = c102884kP.A0I();
                if (A0I != null) {
                    str5 = A0I;
                }
                String str6 = str2;
                String A0G = c102884kP.A0G();
                if (A0G != null) {
                    str6 = A0G;
                }
                boolean A0S = c102884kP.A0S(46, false);
                ContainerEffectEnum containerEffectEnum = (ContainerEffectEnum) ContainerEffectEnum.A01.get(str6);
                if (containerEffectEnum == null) {
                    containerEffectEnum = ContainerEffectEnum.A0I;
                }
                ProductArEffectMetadata productArEffectMetadata = new ProductArEffectMetadata(containerEffectEnum, DynamicEffectState.A05, null, str5, null, null);
                C102884kP A08 = c102884kP.A08(45);
                if (A08 != null) {
                    String A0I2 = A08.A0I();
                    if (A0I2 != null) {
                        str2 = A0I2;
                    }
                    imageInfoImpl = new ImageInfoImpl(null, null, null, AbstractC31174DnI.A0z(new ExtendedImageUrl(str2, A08.A03(40, 0), A08.A03(35, 0))), null);
                }
                C39354HZt c39354HZt = new C39354HZt(imageInfoImpl, productArEffectMetadata, Boolean.valueOf(A0S), str, str3, str4, null, null);
                ?? obj2 = new Object();
                C41753IeT c41753IeT = new C41753IeT();
                c41753IeT.A09 = product;
                c41753IeT.A08 = product;
                EnumC39541HdD enumC39541HdD = EnumC39541HdD.A02;
                HashMap A1G = AbstractC166987dD.A1G();
                HashMap A1G2 = AbstractC166987dD.A1G();
                A1G.put(C41723Idu.A00(A00, product), AbstractC166987dD.A1J(c39354HZt));
                c41753IeT.A04 = new C41723Idu(null, enumC39541HdD, null, null, A1G2, A1G);
                obj2.A00 = new C41726Idx(c41753IeT);
                Context context = c6fg.A00;
                INQ inq = new INQ(context, A00, obj, new C42885Ixz(obj2));
                C42922Iya c42922Iya = new C42922Iya(null, new J7Q(obj2, 27), null, null, null, null);
                AbstractC31171DnF.A1P(context);
                C41693IdM c41693IdM = new C41693IdM((Activity) context, A00, c42922Iya, productDetailsPageArguments.A0Q, productDetailsPageArguments.A0H);
                Object obj3 = obj2.A00;
                C14360o3.A06(obj3);
                C41726Idx c41726Idx = (C41726Idx) obj3;
                C14360o3.A0B(c41726Idx, 2);
                C42895Iy9 c42895Iy9 = new C42895Iy9(A02, obj, c6fg, A00, inq, c41693IdM, c42922Iya, c41726Idx, product);
                C41727Idy A01 = IQ2.A01(A02, A00, obj, c42922Iya, product.A0H);
                C57112jm A002 = C57112jm.A00();
                A002.A06(view, new ViewOnAttachStateChangeListenerC56972jY(view));
                C42411xV A003 = C42411xV.A00(A00);
                C14360o3.A07(A003);
                new IIM(context, A00, obj, A003, z);
                C14360o3.A0B(A01, 2);
                INL inl = new INL(A00, A002, null, A01, c42895Iy9, false);
                C38376GuD c38376GuD = new C38376GuD(context, A00);
                Object tag = view.getTag();
                C14360o3.A0C(tag, "null cannot be cast to non-null type com.instagram.shopping.adapter.pdp.herocarousel.HeroCarouselARViewBinder.Holder");
                C38474Gvv c38474Gvv = (C38474Gvv) tag;
                C41580IaT c41580IaT = new C41580IaT(A00, c42895Iy9, inl);
                IKK ikk = new IKK(EnumC39591He1.A05, product, "HeroCarouselTryInARRenderUnit", null, 1, 0, false);
                C29899DGn c29899DGn = new C29899DGn(7, c42895Iy9, c39354HZt);
                c41580IaT.A02.A01(c39354HZt, ikk);
                String str7 = c39354HZt.A06;
                String str8 = c39354HZt.A05;
                C42332Iou A004 = C41580IaT.A00(c39354HZt, ikk, c29899DGn);
                C14360o3.A0B(c38474Gvv, 1);
                C41609Iay.A00.A00(obj, A00, c38474Gvv.A03, c38376GuD, A004);
                c38474Gvv.A01.setText(str7);
                c38474Gvv.A00.setText(str8);
                IgImageView igImageView = c38474Gvv.A02;
                ExtendedImageUrl A005 = A004.A00(AbstractC166997dE.A0L(igImageView));
                if (A005 != null) {
                    igImageView.setUrl(A005, obj);
                } else {
                    igImageView.A09();
                }
            }
        }
    }

    @Override // X.AbstractC65806TuP
    public final Object A0K(View view, C6FG c6fg, C102884kP c102884kP, Object obj) {
        A0O(view, c6fg, c102884kP, AbstractC25233BEq.A1b(view, c6fg, c102884kP));
        return null;
    }

    @Override // X.InterfaceC50822Vd
    public final /* bridge */ /* synthetic */ Object ALq(Context context) {
        return A0J(context);
    }
}
