package X;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.instagram.api.schemas.ProductReviewStatus;
import com.instagram.api.schemas.RankingInfo;
import com.instagram.api.schemas.SellerShoppableFeedType;
import com.instagram.common.session.UserSession;
import com.instagram.model.androidlink.AndroidLink;
import com.instagram.model.shopping.ProductArEffectMetadataIntf;
import com.instagram.model.shopping.ProductGroup;
import com.instagram.model.shopping.ProductItemWithAR;
import com.instagram.model.shopping.incentives.igfunded.IgFundedIncentive;
import com.instagram.model.shopping.reels.ProductCollectionLinkIntf;
import com.instagram.shopping.intf.featuredproducts.FeaturedProductMediaFeedGridConfiguration;
import com.instagram.shopping.intf.productpicker.ProductPickerArguments;
import com.instagram.shopping.intf.taggingfeed.ShoppingTaggingFeedArguments;
import com.instagram.shopping.model.analytics.ProductDetailsPageLoggingInfo;
import com.instagram.user.model.Product;
import com.instagram.user.model.User;
import java.util.HashMap;
import java.util.List;

/* renamed from: X.1XJ, reason: invalid class name */
/* loaded from: classes.dex */
public abstract class C1XJ {
    public static C1XJ A00;

    public abstract Bundle A02(String str);

    public abstract IFM A03(InterfaceC11380iw interfaceC11380iw, UserSession userSession, String str);

    public abstract C54816OKr A04(C22P c22p, InterfaceC11380iw interfaceC11380iw, UserSession userSession, String str);

    public abstract C41701IdV A05(UserSession userSession, InterfaceC60442pS interfaceC60442pS, String str, String str2, String str3);

    public abstract C1821585z A06(AbstractC59962oe abstractC59962oe, UserSession userSession, ProductItemWithAR productItemWithAR, String str, String str2);

    public abstract C41623IbD A07(FragmentActivity fragmentActivity, C22P c22p, UserSession userSession, ProductArEffectMetadataIntf productArEffectMetadataIntf, Product product, Boolean bool, String str, String str2);

    public abstract C41623IbD A08(FragmentActivity fragmentActivity, C22P c22p, UserSession userSession, ProductArEffectMetadataIntf productArEffectMetadataIntf, Product product, String str, String str2);

    public abstract C55099ObA A09(Context context, AbstractC018607g abstractC018607g, UserSession userSession, AnonymousClass840 anonymousClass840, OJZ ojz);

    public abstract IMY A0A(FragmentActivity fragmentActivity, UserSession userSession, String str);

    public abstract ILA A0B(UserSession userSession);

    @Deprecated
    public abstract C64972wv A0C(Context context, FragmentActivity fragmentActivity, RankingInfo rankingInfo, UserSession userSession, InterfaceC60442pS interfaceC60442pS, YN1 yn1, Integer num, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, boolean z, boolean z2);

    public abstract IK5 A0D(UserSession userSession, EnumC39584Hdu enumC39584Hdu, String str, String str2, int i, boolean z, boolean z2);

    public abstract C36284Fzb A0E(UserSession userSession);

    public abstract C3BU A0F(UserSession userSession);

    public abstract C54565O8r A0G(FragmentActivity fragmentActivity, UserSession userSession);

    public abstract IK6 A0H(FragmentActivity fragmentActivity, UserSession userSession, C38321qM c38321qM, AndroidLink androidLink, String str);

    public abstract OXN A0I(Context context, AbstractC018607g abstractC018607g, UserSession userSession, InterfaceC57994Pne interfaceC57994Pne);

    public abstract INF A0J(FragmentActivity fragmentActivity, UserSession userSession, EnumC39622HeW enumC39622HeW, String str, String str2);

    public abstract C42130Ile A0K(FragmentActivity fragmentActivity, ProductReviewStatus productReviewStatus, UserSession userSession, InterfaceC60442pS interfaceC60442pS, String str, String str2, String str3, String str4, String str5);

    public abstract C42130Ile A0L(FragmentActivity fragmentActivity, UserSession userSession, InterfaceC60442pS interfaceC60442pS, Product product, String str, String str2);

    public abstract C41749IeN A0M(android.net.Uri uri, FragmentActivity fragmentActivity, UserSession userSession, C38321qM c38321qM, InterfaceC60442pS interfaceC60442pS, boolean z);

    public abstract C41749IeN A0N(FragmentActivity fragmentActivity, SellerShoppableFeedType sellerShoppableFeedType, UserSession userSession, InterfaceC60442pS interfaceC60442pS, String str, String str2, String str3, String str4, String str5);

    public abstract C41749IeN A0O(FragmentActivity fragmentActivity, UserSession userSession, C38321qM c38321qM, InterfaceC60442pS interfaceC60442pS, C75113Zb c75113Zb, User user, String str, String str2);

    public abstract C41214IMd A0P(FragmentActivity fragmentActivity, UserSession userSession, InterfaceC60442pS interfaceC60442pS);

    public abstract C1563970j A0Q(FragmentActivity fragmentActivity, UserSession userSession, AbstractC38948HCy abstractC38948HCy, C41206ILu c41206ILu, String str, String str2, String str3, String str4, String str5, String str6, String str7);

    public abstract C1564070k A0R(UserSession userSession, C1563970j c1563970j, String str, String str2);

    public abstract INB A0S(FragmentActivity fragmentActivity, UserSession userSession, String str);

    public abstract C41769Iel A0T();

    public abstract InterfaceC58077Pp2 A0U(Context context, AbstractC018607g abstractC018607g, UserSession userSession);

    public abstract C41220IMj A0V(UserSession userSession);

    public abstract EVS A0W(UserSession userSession);

    public abstract C52253NAt A0X(UserSession userSession);

    public abstract Integer A0Y(UserSession userSession);

    public abstract String A0Z(android.net.Uri uri, InterfaceC08100bW interfaceC08100bW, String str);

    public abstract void A0a(Activity activity, Fragment fragment, UserSession userSession, String str, String str2);

    public abstract void A0b(Activity activity, Fragment fragment, UserSession userSession, String str, String str2);

    public abstract void A0c(Activity activity, UserSession userSession, String str, boolean z);

    public abstract void A0d(Context context, FragmentActivity fragmentActivity, UserSession userSession, String str, String str2, String str3, String str4);

    public abstract void A0e(Context context, AbstractC10360h2 abstractC10360h2, UserSession userSession, ProductGroup productGroup, InterfaceC43414JGe interfaceC43414JGe, String str, boolean z);

    public abstract void A0f(Context context, UserSession userSession, String str);

    public abstract void A0g(Context context, UserSession userSession, String str);

    public abstract void A0h(Context context, ProductGroup productGroup, Product product);

    public abstract void A0i(Bundle bundle, FragmentActivity fragmentActivity, UserSession userSession, EnumC39540HdC enumC39540HdC, Integer num, String str, String str2, String str3, String str4, String str5, String str6);

    public abstract void A0j(Fragment fragment, FragmentActivity fragmentActivity, FragmentActivity fragmentActivity2, UserSession userSession, ShoppingTaggingFeedArguments shoppingTaggingFeedArguments, String str, boolean z, boolean z2);

    public abstract void A0k(Fragment fragment, UserSession userSession, C38321qM c38321qM);

    public abstract void A0l(Fragment fragment, UserSession userSession, ProductPickerArguments productPickerArguments);

    public abstract void A0m(FragmentActivity fragmentActivity, EnumC39651Hig enumC39651Hig, EnumC39644HiZ enumC39644HiZ, EnumC39650Hif enumC39650Hif, EnumC39649Hie enumC39649Hie, UserSession userSession, Long l, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, HashMap hashMap, boolean z);

    public abstract void A0n(FragmentActivity fragmentActivity, EnumC39651Hig enumC39651Hig, EnumC39644HiZ enumC39644HiZ, EnumC39650Hif enumC39650Hif, EnumC39649Hie enumC39649Hie, UserSession userSession, String str, String str2, String str3, int i, boolean z);

    public abstract void A0o(FragmentActivity fragmentActivity, EnumC39651Hig enumC39651Hig, EnumC39644HiZ enumC39644HiZ, EnumC39650Hif enumC39650Hif, EnumC39649Hie enumC39649Hie, UserSession userSession, String str, String str2, String str3, String str4, String str5, String str6, String str7, boolean z);

    public abstract void A0p(FragmentActivity fragmentActivity, EnumC39651Hig enumC39651Hig, EnumC39644HiZ enumC39644HiZ, EnumC39650Hif enumC39650Hif, EnumC39649Hie enumC39649Hie, UserSession userSession, String str, String str2, String str3, String str4, String str5, String str6, boolean z);

    public abstract void A0q(FragmentActivity fragmentActivity, UserSession userSession);

    public abstract void A0r(FragmentActivity fragmentActivity, UserSession userSession, C38321qM c38321qM, InterfaceC60442pS interfaceC60442pS, C75113Zb c75113Zb);

    public abstract void A0s(FragmentActivity fragmentActivity, UserSession userSession, C38321qM c38321qM, InterfaceC60442pS interfaceC60442pS, C75113Zb c75113Zb, InterfaceC86363t8 interfaceC86363t8, InterfaceC43588JPt interfaceC43588JPt, String str, String str2);

    public abstract void A0t(FragmentActivity fragmentActivity, UserSession userSession, C38321qM c38321qM, InterfaceC60442pS interfaceC60442pS, C75113Zb c75113Zb, InterfaceC86363t8 interfaceC86363t8, String str, String str2, String str3);

    public abstract void A0u(FragmentActivity fragmentActivity, UserSession userSession, C38321qM c38321qM, InterfaceC60442pS interfaceC60442pS, C41551w4 c41551w4, InterfaceC1119153d interfaceC1119153d);

    public abstract void A0v(FragmentActivity fragmentActivity, UserSession userSession, InterfaceC60442pS interfaceC60442pS, FeaturedProductMediaFeedGridConfiguration featuredProductMediaFeedGridConfiguration, ProductDetailsPageLoggingInfo productDetailsPageLoggingInfo, String str, String str2);

    public abstract void A0w(FragmentActivity fragmentActivity, UserSession userSession, InterfaceC60442pS interfaceC60442pS, FeaturedProductMediaFeedGridConfiguration featuredProductMediaFeedGridConfiguration, ProductDetailsPageLoggingInfo productDetailsPageLoggingInfo, String str, String str2);

    public abstract void A0x(FragmentActivity fragmentActivity, UserSession userSession, InterfaceC60442pS interfaceC60442pS, ProductDetailsPageLoggingInfo productDetailsPageLoggingInfo, String str, String str2, String str3, String str4, String str5, String str6, String str7, List list);

    public abstract void A0y(FragmentActivity fragmentActivity, UserSession userSession, InterfaceC60442pS interfaceC60442pS, ProductDetailsPageLoggingInfo productDetailsPageLoggingInfo, String str, String str2, String str3, String str4, String str5, String str6, String str7, List list);

    public abstract void A0z(FragmentActivity fragmentActivity, UserSession userSession, InterfaceC60442pS interfaceC60442pS, Product product, String str, String str2, String str3);

    public abstract void A10(FragmentActivity fragmentActivity, UserSession userSession, InterfaceC60442pS interfaceC60442pS, String str);

    public abstract void A11(FragmentActivity fragmentActivity, UserSession userSession, IgFundedIncentive igFundedIncentive);

    public abstract void A12(FragmentActivity fragmentActivity, UserSession userSession, ProductCollectionLinkIntf productCollectionLinkIntf, String str, String str2);

    public abstract void A13(FragmentActivity fragmentActivity, UserSession userSession, Product product);

    public abstract void A14(FragmentActivity fragmentActivity, UserSession userSession, User user, String str, String str2, String str3, String str4);

    public abstract void A15(FragmentActivity fragmentActivity, UserSession userSession, User user, String str, String str2, String str3, String str4, List list, boolean z);

    public abstract void A16(FragmentActivity fragmentActivity, UserSession userSession, Boolean bool, Long l, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, boolean z, boolean z2, boolean z3);

    public abstract void A17(FragmentActivity fragmentActivity, UserSession userSession, String str);

    public abstract void A18(FragmentActivity fragmentActivity, UserSession userSession, String str, String str2);

    public abstract void A19(FragmentActivity fragmentActivity, UserSession userSession, String str, String str2);

    public abstract void A1A(FragmentActivity fragmentActivity, UserSession userSession, String str, String str2, String str3);

    public abstract void A1B(FragmentActivity fragmentActivity, UserSession userSession, String str, String str2, String str3);

    public abstract void A1C(FragmentActivity fragmentActivity, UserSession userSession, String str, String str2, String str3, String str4, String str5, String str6);

    public abstract void A1D(FragmentActivity fragmentActivity, UserSession userSession, String str, String str2, String str3, String str4, boolean z, boolean z2, boolean z3);

    public abstract void A1E(FragmentActivity fragmentActivity, UserSession userSession, String str, String str2, boolean z);

    public abstract void A1F(FragmentActivity fragmentActivity, UserSession userSession, String str, boolean z);

    public abstract void A1G(AbstractC59962oe abstractC59962oe, UserSession userSession, String str);

    public abstract void A1H(UserSession userSession, Integer num, String str, String str2);

    public abstract void A1I(UserSession userSession, Integer num, String str, String str2);

    public abstract void A1J(C189478aR c189478aR, C189448aO c189448aO, Long l, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, boolean z);

    public abstract boolean A1K(DialogInterface.OnDismissListener onDismissListener, DialogInterface.OnShowListener onShowListener, FragmentActivity fragmentActivity, ProductReviewStatus productReviewStatus, UserSession userSession, C38321qM c38321qM, InterfaceC60442pS interfaceC60442pS, InterfaceC146006hx interfaceC146006hx, String str, String str2, boolean z);

    public final void A01(FragmentActivity fragmentActivity, UserSession userSession, String str, String str2, String str3, String str4, String str5, String str6) {
        A0m(fragmentActivity, EnumC39651Hig.A0I, EnumC39644HiZ.UNKNOWN, EnumC39650Hif.A0I, EnumC39649Hie.A0C, userSession, null, str, str2, str3, str4, null, null, null, null, str5, str6, null, null, null, null, false);
    }
}
