package X;

import com.instagram.api.schemas.FBProductItemDetailsDict;
import com.instagram.api.schemas.FBProductItemDetailsDictImpl;
import com.instagram.api.schemas.ProductCardSubtitleType;
import com.instagram.api.schemas.ProductTileLabel;
import com.instagram.api.schemas.ProductTileMetadata;
import com.instagram.api.schemas.ProductTileMetadataDecorations;
import com.instagram.api.schemas.ProductTileMetadataDecorationsImpl;
import com.instagram.api.schemas.ProductTileMetadataDestination;
import com.instagram.api.schemas.ProductTileMetadataImpl;
import com.instagram.api.schemas.ProductTileProduct;
import com.instagram.api.schemas.ProductTileProductImpl;
import com.instagram.api.schemas.ProductTileUCILoggingInfo;
import com.instagram.api.schemas.ProductTileUCILoggingInfoImpl;
import com.instagram.api.schemas.RankingInfo;
import com.instagram.model.shopping.productfeed.ProductTile;
import com.instagram.user.model.Product;
import com.instagram.user.model.ProductDetailsProductItemDict;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes7.dex */
public final class IEZ {
    public ProductTile A00;
    public final InterfaceC43486JIy A01;

    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, com.instagram.model.shopping.productfeed.ProductTile] */
    public IEZ(InterfaceC43486JIy interfaceC43486JIy) {
        FBProductItemDetailsDictImpl fBProductItemDetailsDictImpl;
        C14360o3.A0B(interfaceC43486JIy, 1);
        this.A01 = interfaceC43486JIy;
        H5A h5a = (H5A) interfaceC43486JIy;
        InterfaceC43479JIr interfaceC43479JIr = h5a.A00;
        if (interfaceC43479JIr != null) {
            ?? obj = new Object();
            C38746H4m c38746H4m = (C38746H4m) interfaceC43479JIr;
            ProductDetailsProductItemDict productDetailsProductItemDict = c38746H4m.A06;
            if (productDetailsProductItemDict != null) {
                obj.A08 = new AbstractC41215IMe(productDetailsProductItemDict).A00();
            }
            ProductTileProduct productTileProduct = c38746H4m.A02;
            if (productTileProduct != null) {
                FBProductItemDetailsDict fBProductItemDetailsDict = productTileProduct.AKU().A00;
                if (fBProductItemDetailsDict != null) {
                    fBProductItemDetailsDictImpl = fBProductItemDetailsDict.EtM();
                } else {
                    fBProductItemDetailsDictImpl = null;
                }
                obj.A02 = new ProductTileProductImpl(fBProductItemDetailsDictImpl);
            }
            obj.A00 = c38746H4m.A00;
            ProductTileMetadata productTileMetadata = c38746H4m.A01;
            if (productTileMetadata != null) {
                C41091IHi AKT = productTileMetadata.AKT();
                C1DY A0b = AbstractC25235BEs.A0b(new C37761pD(null));
                ProductTileMetadataDecorations productTileMetadataDecorations = AKT.A00;
                ProductTileMetadataDecorationsImpl EyX = productTileMetadataDecorations != null ? productTileMetadataDecorations.EyX(A0b) : null;
                ProductTileMetadataDestination productTileMetadataDestination = AKT.A01;
                List list = AKT.A02;
                ArrayList A0q = AbstractC167017dG.A0q(list);
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    A0q.add(((ProductTileLabel) it.next()).EyV());
                }
                obj.A01 = new ProductTileMetadataImpl(EyX, productTileMetadataDestination, A0q);
            }
            obj.A05 = c38746H4m.A05;
            RankingInfo rankingInfo = c38746H4m.A04;
            if (rankingInfo != null) {
                obj.A04 = new RankingInfo(rankingInfo.BlB(), rankingInfo.BoG(), rankingInfo.CHt());
            }
            ProductTileUCILoggingInfo productTileUCILoggingInfo = c38746H4m.A03;
            if (productTileUCILoggingInfo != null) {
                C41152IJr AKV = productTileUCILoggingInfo.AKV();
                obj.A03 = new ProductTileUCILoggingInfoImpl(AKV.A00, AKV.A02, AKV.A03, AKV.A04, AKV.A05, AKV.A01);
            }
            ProductDetailsProductItemDict productDetailsProductItemDict2 = obj.A08;
            obj.A07 = productDetailsProductItemDict2 != null ? new Product(null, productDetailsProductItemDict2) : null;
            if (obj.A00 == ProductCardSubtitleType.A0F) {
                obj.A00 = ProductCardSubtitleType.A05;
            }
            this.A00 = obj;
        }
        ProductDetailsProductItemDict productDetailsProductItemDict3 = h5a.A02;
        if (productDetailsProductItemDict3 != null) {
            this.A00 = new ProductTile(AbstractC38048Gob.A01(productDetailsProductItemDict3));
        }
    }
}
