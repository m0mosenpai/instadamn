package X;

import com.instagram.api.schemas.BrandedContentGatingInfo;
import com.instagram.api.schemas.BrandedContentProjectMetadata;
import com.instagram.api.schemas.BrandedContentProjectMetadataIntf;
import com.instagram.api.schemas.MediaGenAIDetectionMethod;
import com.instagram.model.shopping.reels.InstagramShopLink;
import com.instagram.model.shopping.reels.ProductCollectionLink;
import com.instagram.model.shopping.reels.ProfileShopLink;
import com.instagram.model.shopping.reels.ReelMultiProductLink;
import com.instagram.model.shopping.reels.ReelProductLink;
import com.instagram.reels.fragment.model.ReelMoreOptionsModel;
import java.util.List;

/* renamed from: X.8Du, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C183938Du {
    public BrandedContentGatingInfo A00;
    public BrandedContentProjectMetadataIntf A01;
    public MediaGenAIDetectionMethod A02;
    public InstagramShopLink A03;
    public ProductCollectionLink A04;
    public ProductCollectionLink A05;
    public ProfileShopLink A06;
    public ReelMultiProductLink A07;
    public ReelProductLink A08;
    public EnumC183928Dt A09;
    public String A0A;
    public String A0B;
    public String A0C;
    public List A0D;
    public boolean A0E;
    public boolean A0F;
    public boolean A0G;
    public boolean A0H;

    /* JADX WARN: Type inference failed for: r0v0, types: [com.instagram.reels.fragment.model.ReelMoreOptionsModel, java.lang.Object] */
    public static ReelMoreOptionsModel A00(BrandedContentGatingInfo brandedContentGatingInfo, BrandedContentProjectMetadataIntf brandedContentProjectMetadataIntf, MediaGenAIDetectionMethod mediaGenAIDetectionMethod, InstagramShopLink instagramShopLink, ProductCollectionLink productCollectionLink, ProductCollectionLink productCollectionLink2, ProfileShopLink profileShopLink, ReelMultiProductLink reelMultiProductLink, ReelProductLink reelProductLink, EnumC183928Dt enumC183928Dt, String str, String str2, String str3, List list, boolean z, boolean z2, boolean z3, boolean z4) {
        BrandedContentProjectMetadata brandedContentProjectMetadata;
        ?? obj = new Object();
        obj.A09 = enumC183928Dt;
        obj.A0C = str3;
        obj.A0B = str2;
        obj.A0A = str;
        obj.A06 = profileShopLink;
        obj.A03 = instagramShopLink;
        obj.A04 = productCollectionLink;
        obj.A05 = productCollectionLink2;
        obj.A08 = reelProductLink;
        obj.A07 = reelMultiProductLink;
        obj.A00 = brandedContentGatingInfo;
        obj.A0D = list;
        if (brandedContentProjectMetadataIntf != null) {
            brandedContentProjectMetadata = brandedContentProjectMetadataIntf.ErO();
        } else {
            brandedContentProjectMetadata = null;
        }
        obj.A01 = brandedContentProjectMetadata;
        obj.A0H = z4;
        obj.A0E = z;
        obj.A0G = z3;
        obj.A0F = z2;
        obj.A02 = mediaGenAIDetectionMethod;
        return obj;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [com.instagram.reels.fragment.model.ReelMoreOptionsModel, java.lang.Object] */
    public final ReelMoreOptionsModel A01() {
        BrandedContentProjectMetadata brandedContentProjectMetadata;
        EnumC183928Dt enumC183928Dt = this.A09;
        String str = this.A0C;
        String str2 = this.A0B;
        String str3 = this.A0A;
        ProfileShopLink profileShopLink = this.A06;
        InstagramShopLink instagramShopLink = this.A03;
        ProductCollectionLink productCollectionLink = this.A04;
        ProductCollectionLink productCollectionLink2 = this.A05;
        ReelProductLink reelProductLink = this.A08;
        ReelMultiProductLink reelMultiProductLink = this.A07;
        BrandedContentGatingInfo brandedContentGatingInfo = this.A00;
        List list = this.A0D;
        BrandedContentProjectMetadataIntf brandedContentProjectMetadataIntf = this.A01;
        boolean z = this.A0H;
        boolean z2 = this.A0E;
        boolean z3 = this.A0G;
        boolean z4 = this.A0F;
        MediaGenAIDetectionMethod mediaGenAIDetectionMethod = this.A02;
        ?? obj = new Object();
        obj.A09 = enumC183928Dt;
        obj.A0C = str;
        obj.A0B = str2;
        obj.A0A = str3;
        obj.A06 = profileShopLink;
        obj.A03 = instagramShopLink;
        obj.A04 = productCollectionLink;
        obj.A05 = productCollectionLink2;
        obj.A08 = reelProductLink;
        obj.A07 = reelMultiProductLink;
        obj.A00 = brandedContentGatingInfo;
        obj.A0D = list;
        if (brandedContentProjectMetadataIntf != null) {
            brandedContentProjectMetadata = brandedContentProjectMetadataIntf.ErO();
        } else {
            brandedContentProjectMetadata = null;
        }
        obj.A01 = brandedContentProjectMetadata;
        obj.A0H = z;
        obj.A0E = z2;
        obj.A0G = z3;
        obj.A0F = z4;
        obj.A02 = mediaGenAIDetectionMethod;
        return obj;
    }

    public C183938Du(ReelMoreOptionsModel reelMoreOptionsModel) {
        this.A0H = false;
        this.A0E = false;
        this.A0G = false;
        this.A0F = false;
        this.A09 = reelMoreOptionsModel.A09;
        this.A0C = reelMoreOptionsModel.A0C;
        this.A0B = reelMoreOptionsModel.A0B;
        this.A0A = reelMoreOptionsModel.A0A;
        this.A06 = reelMoreOptionsModel.A06;
        this.A03 = reelMoreOptionsModel.A03;
        this.A04 = reelMoreOptionsModel.A04;
        this.A05 = reelMoreOptionsModel.A05;
        this.A08 = reelMoreOptionsModel.A08;
        this.A07 = reelMoreOptionsModel.A07;
        this.A00 = reelMoreOptionsModel.A00;
        this.A0D = reelMoreOptionsModel.A0D;
        this.A01 = reelMoreOptionsModel.A01;
        this.A0H = reelMoreOptionsModel.A0H;
        this.A0E = reelMoreOptionsModel.A0E;
        this.A0G = reelMoreOptionsModel.A0G;
        this.A0F = reelMoreOptionsModel.A0F;
        this.A02 = reelMoreOptionsModel.A02;
    }

    public C183938Du() {
        this.A0H = false;
        this.A0E = false;
        this.A0G = false;
        this.A0F = false;
    }
}
