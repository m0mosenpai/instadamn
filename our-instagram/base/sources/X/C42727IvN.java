package X;

import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.api.schemas.FBProductItemDetailsDict;
import com.instagram.api.schemas.FBProductItemDetailsDictImpl;
import com.instagram.api.schemas.ImmutablePandoFBProductItemDetailsDict;
import com.instagram.model.shopping.productcheckoutproperties.ProductCheckoutProperties;
import com.instagram.model.shopping.productcheckoutproperties.ProductCheckoutPropertiesIntf;
import com.instagram.model.shopping.productimagecontainer.ProductImageContainer;
import com.instagram.model.shopping.productimagecontainer.ProductImageContainerImpl;
import java.util.Collection;
import java.util.Collections;

/* renamed from: X.IvN, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C42727IvN implements InterfaceC76653cC {
    public FBProductItemDetailsDict A00;
    public final long A01 = System.currentTimeMillis();
    public final String A02 = AbstractC167017dG.A0j();

    @Override // X.InterfaceC38391qT
    public final void AEH(AbstractC12990ll abstractC12990ll) {
        if (abstractC12990ll != null) {
            AbstractC25651Mw.A00(abstractC12990ll).E4s(new C3HW(this));
        }
    }

    @Override // X.InterfaceC76653cC
    public final String BIa() {
        return this.A02;
    }

    @Override // X.InterfaceC76653cC
    public final long BIc() {
        return this.A01;
    }

    @Override // X.InterfaceC38391qT
    public final EnumC77213d7 BqJ() {
        if (AbstractC31177DnL.A1b(this.A00.BCz())) {
            return EnumC77213d7.A04;
        }
        return EnumC77213d7.A03;
    }

    @Override // X.InterfaceC38391qT
    public final String BqK() {
        FBProductItemDetailsDict fBProductItemDetailsDict = this.A00;
        C14360o3.A0B(fBProductItemDetailsDict, 0);
        return AbstractC37302Gc3.A0Z(fBProductItemDetailsDict);
    }

    @Override // X.InterfaceC38391qT
    public final Integer BqO() {
        return C05F.A01;
    }

    @Override // X.InterfaceC38391qT
    public final boolean CcN() {
        return AbstractC31177DnL.A1b(this.A00.BCz());
    }

    @Override // X.InterfaceC38391qT
    public final void Ed3(EnumC77213d7 enumC77213d7) {
        ProductCheckoutProperties productCheckoutProperties;
        ProductImageContainerImpl productImageContainerImpl;
        Object fBProductItemDetailsDictImpl;
        TreeUpdaterJNI treeUpdaterJNI;
        TreeUpdaterJNI treeUpdaterJNI2;
        C41166IKf AKJ = this.A00.AKJ();
        AKJ.A03 = Boolean.valueOf(AbstractC167007dF.A1X(enumC77213d7, EnumC77213d7.A04));
        FBProductItemDetailsDict fBProductItemDetailsDict = AKJ.A0D;
        if (fBProductItemDetailsDict instanceof ImmutablePandoFBProductItemDetailsDict) {
            TreeUpdaterJNI treeUpdaterJNI3 = TreeUpdaterJNI.$redex_init_class;
            ProductCheckoutPropertiesIntf productCheckoutPropertiesIntf = AKJ.A00;
            TreeUpdaterJNI treeUpdaterJNI4 = null;
            if (productCheckoutPropertiesIntf != null) {
                treeUpdaterJNI = productCheckoutPropertiesIntf.F7o();
            } else {
                treeUpdaterJNI = null;
            }
            C09530e4 A1L = AbstractC166987dD.A1L("checkout_properties", treeUpdaterJNI);
            C09530e4 A1L2 = AbstractC166987dD.A1L("has_viewer_saved", AKJ.A03);
            C09530e4 A1L3 = AbstractC166987dD.A1L("listing_price", AKJ.A04);
            C09530e4 A1L4 = AbstractC166987dD.A1L("listing_price_stripped", AKJ.A05);
            ProductImageContainer productImageContainer = AKJ.A01;
            if (productImageContainer != null) {
                treeUpdaterJNI2 = productImageContainer.F7o();
            } else {
                treeUpdaterJNI2 = null;
            }
            C09530e4 A1L5 = AbstractC166987dD.A1L("main_image", treeUpdaterJNI2);
            C09530e4 A1L6 = AbstractC166987dD.A1L("page_id", AKJ.A06);
            C09530e4 A1L7 = AbstractC166987dD.A1L("page_name", AKJ.A07);
            C09530e4 A1L8 = AbstractC166987dD.A1L("page_profile_pic", AKJ.A08);
            C09530e4 A1L9 = AbstractC166987dD.A1L("product_id", AKJ.A09);
            C09530e4 A1L10 = AbstractC166987dD.A1L("product_name", AKJ.A0A);
            C09530e4 A1L11 = AbstractC166987dD.A1L("strikethrough_price", AKJ.A0B);
            C09530e4 A1L12 = AbstractC166987dD.A1L("strikethrough_price_stripped", AKJ.A0C);
            ProductImageContainer productImageContainer2 = AKJ.A02;
            if (productImageContainer2 != null) {
                treeUpdaterJNI4 = productImageContainer2.F7o();
            }
            fBProductItemDetailsDictImpl = AbstractC37303Gc4.A06(fBProductItemDetailsDict, new C09530e4[]{A1L, A1L2, A1L3, A1L4, A1L5, A1L6, A1L7, A1L8, A1L9, A1L10, A1L11, A1L12, AbstractC166987dD.A1L("thumbnail_image", treeUpdaterJNI4)});
        } else {
            ProductCheckoutPropertiesIntf productCheckoutPropertiesIntf2 = AKJ.A00;
            ProductImageContainerImpl productImageContainerImpl2 = null;
            if (productCheckoutPropertiesIntf2 != null) {
                productCheckoutProperties = productCheckoutPropertiesIntf2.F69();
            } else {
                productCheckoutProperties = null;
            }
            Boolean bool = AKJ.A03;
            String str = AKJ.A04;
            String str2 = AKJ.A05;
            ProductImageContainer productImageContainer3 = AKJ.A01;
            if (productImageContainer3 != null) {
                productImageContainerImpl = productImageContainer3.F6D();
            } else {
                productImageContainerImpl = null;
            }
            String str3 = AKJ.A06;
            String str4 = AKJ.A07;
            String str5 = AKJ.A08;
            String str6 = AKJ.A09;
            String str7 = AKJ.A0A;
            String str8 = AKJ.A0B;
            String str9 = AKJ.A0C;
            ProductImageContainer productImageContainer4 = AKJ.A02;
            if (productImageContainer4 != null) {
                productImageContainerImpl2 = productImageContainer4.F6D();
            }
            fBProductItemDetailsDictImpl = new FBProductItemDetailsDictImpl(productCheckoutProperties, productImageContainerImpl, productImageContainerImpl2, bool, str, str2, str3, str4, str5, str6, str7, str8, str9);
        }
        this.A00 = (FBProductItemDetailsDict) fBProductItemDetailsDictImpl;
    }

    public C42727IvN(FBProductItemDetailsDict fBProductItemDetailsDict) {
        this.A00 = fBProductItemDetailsDict;
    }

    @Override // X.InterfaceC38391qT
    public final Collection BqL() {
        return Collections.emptyList();
    }
}
