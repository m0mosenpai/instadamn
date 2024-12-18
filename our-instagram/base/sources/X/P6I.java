package X;

import com.instagram.api.schemas.MediaGenAIDetectionMethod;
import com.instagram.model.fundraiser.NewFundraiserInfo;
import com.instagram.model.shopping.productcollection.ProductCollectionTagInfo;
import com.instagram.model.venue.LocationDict;
import com.instagram.model.venue.Venue;
import com.instagram.shopping.model.taggingfeed.ProductCollectionFeedTaggingMeta;
import com.instagram.user.model.UpcomingEvent;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes9.dex */
public final class P6I implements InterfaceC58205PrB {
    public final C47Z A00;

    @Override // X.InterfaceC58205PrB
    public final List Ab3() {
        return this.A00.A47;
    }

    @Override // X.InterfaceC58205PrB
    public final String AcE() {
        return this.A00.A2O;
    }

    @Override // X.InterfaceC58205PrB
    public final String AcF() {
        return this.A00.A13.A03;
    }

    @Override // X.InterfaceC58205PrB
    public final String AcU() {
        return this.A00.A2o;
    }

    @Override // X.InterfaceC58205PrB
    public final Integer AfX() {
        return this.A00.A27;
    }

    @Override // X.InterfaceC58205PrB
    public final String AfY() {
        return this.A00.A2R;
    }

    @Override // X.InterfaceC58205PrB
    public final List AfZ() {
        return this.A00.A4A;
    }

    @Override // X.InterfaceC58205PrB
    public final Boolean Afa() {
        return this.A00.A1r;
    }

    @Override // X.InterfaceC58205PrB
    public final List Afb() {
        return this.A00.A4B;
    }

    @Override // X.InterfaceC58205PrB
    public final Boolean Afc() {
        return this.A00.A1s;
    }

    @Override // X.InterfaceC58205PrB
    public final String Afd() {
        return this.A00.A2S;
    }

    @Override // X.InterfaceC58205PrB
    public final String Afe() {
        return this.A00.A2T;
    }

    @Override // X.InterfaceC58205PrB
    public final C38801H6q Aff() {
        return this.A00.A0z;
    }

    @Override // X.InterfaceC58205PrB
    public final String Ak5() {
        return this.A00.A2X;
    }

    @Override // X.InterfaceC58205PrB
    public final int AmG() {
        return this.A00.A04;
    }

    @Override // X.InterfaceC58205PrB
    public final List An5() {
        return this.A00.A4F;
    }

    @Override // X.InterfaceC58205PrB
    public final String Aow() {
        return this.A00.A2d;
    }

    @Override // X.InterfaceC58205PrB
    public final List Aox() {
        List list = this.A00.A4L;
        if (list == null) {
            return C16930sl.A00;
        }
        return list;
    }

    @Override // X.InterfaceC58205PrB
    public final C38709H2v Ar5() {
        return this.A00.A0v;
    }

    @Override // X.InterfaceC58205PrB
    public final boolean AsY() {
        return this.A00.A52;
    }

    @Override // X.InterfaceC58205PrB
    public final String Ase() {
        return this.A00.A2g;
    }

    @Override // X.InterfaceC58205PrB
    public final String AvC() {
        return this.A00.A2j;
    }

    @Override // X.InterfaceC58205PrB
    public final String AzF() {
        return this.A00.A2l;
    }

    @Override // X.InterfaceC58205PrB
    public final String B0Y() {
        return this.A00.A2n;
    }

    @Override // X.InterfaceC58205PrB
    public final C45116Jxl B5Y() {
        C47Z c47z = this.A00;
        C45116Jxl c45116Jxl = c47z.A0p;
        if (c45116Jxl == null) {
            H4C h4c = c47z.A0x;
            if (h4c != null) {
                return new C45116Jxl(h4c.A01, h4c.A02, c47z.A2r, 2);
            }
            return null;
        }
        return c45116Jxl;
    }

    @Override // X.InterfaceC58205PrB
    public final String B9D() {
        return this.A00.A2y;
    }

    @Override // X.InterfaceC58205PrB
    public final MediaGenAIDetectionMethod B9W() {
        return this.A00.A0w;
    }

    @Override // X.InterfaceC58205PrB
    public final MUD B9o() {
        return this.A00.A0o;
    }

    @Override // X.InterfaceC58205PrB
    public final List BFi() {
        return this.A00.A4T;
    }

    @Override // X.InterfaceC58205PrB
    public final C51685MsG BGI() {
        return this.A00.A1B;
    }

    @Override // X.InterfaceC58205PrB
    public final String BNN() {
        return this.A00.A37;
    }

    @Override // X.InterfaceC58205PrB
    public final String BTM() {
        return this.A00.A3A;
    }

    @Override // X.InterfaceC58205PrB
    public final NewFundraiserInfo BWh() {
        return this.A00.A1E;
    }

    @Override // X.InterfaceC58205PrB
    public final String BZE() {
        return this.A00.A3F;
    }

    @Override // X.InterfaceC58205PrB
    public final String BZX() {
        return this.A00.A3G;
    }

    @Override // X.InterfaceC58205PrB
    public final ArrayList BcJ() {
        return this.A00.A40;
    }

    @Override // X.InterfaceC58205PrB
    public final ProductCollectionTagInfo Bgu() {
        ProductCollectionFeedTaggingMeta productCollectionFeedTaggingMeta = this.A00.A1o;
        if (productCollectionFeedTaggingMeta != null) {
            return new ProductCollectionTagInfo(Boolean.valueOf(productCollectionFeedTaggingMeta.A05), productCollectionFeedTaggingMeta.A01, productCollectionFeedTaggingMeta.A00.toString(), null, null);
        }
        return null;
    }

    @Override // X.InterfaceC58205PrB
    public final List BhK() {
        return this.A00.A4X;
    }

    @Override // X.InterfaceC58205PrB
    public final ArrayList BhN() {
        return this.A00.A41;
    }

    @Override // X.InterfaceC58205PrB
    public final int BnA() {
        return this.A00.A0J;
    }

    @Override // X.InterfaceC58205PrB
    public final String BnO() {
        return this.A00.A3W;
    }

    @Override // X.InterfaceC58205PrB
    public final String BnS() {
        return this.A00.A3X;
    }

    @Override // X.InterfaceC58205PrB
    public final boolean Bu8() {
        return this.A00.A5s;
    }

    @Override // X.InterfaceC58205PrB
    public final String BuI() {
        return this.A00.A3c;
    }

    @Override // X.InterfaceC58205PrB
    public final List BuJ() {
        return this.A00.A4d;
    }

    @Override // X.InterfaceC58205PrB
    public final String Byh() {
        return this.A00.A3g;
    }

    @Override // X.InterfaceC58205PrB
    public final String Byk() {
        return this.A00.A3h;
    }

    @Override // X.InterfaceC58205PrB
    public final String Byn() {
        return this.A00.A3i;
    }

    @Override // X.InterfaceC58205PrB
    public final UpcomingEvent CD4() {
        return this.A00.A1p;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [com.instagram.model.venue.Venue, java.lang.Object] */
    @Override // X.InterfaceC58205PrB
    public final Venue CEm() {
        LocationDict locationDict = this.A00.A1H;
        if (locationDict != null) {
            ?? obj = new Object();
            obj.A00 = locationDict;
            return obj;
        }
        return null;
    }

    @Override // X.InterfaceC58205PrB
    public final boolean CUC() {
        return this.A00.A5T;
    }

    @Override // X.InterfaceC58205PrB
    public final Boolean CVL() {
        return this.A00.A1w;
    }

    @Override // X.InterfaceC58205PrB
    public final boolean CWz() {
        return this.A00.A5Z;
    }

    @Override // X.InterfaceC58205PrB
    public final boolean CYi() {
        return this.A00.A5c;
    }

    @Override // X.InterfaceC58205PrB
    public final boolean CZl() {
        return this.A00.A5f;
    }

    @Override // X.InterfaceC58205PrB
    public final boolean Ccv() {
        return this.A00.A5t;
    }

    @Override // X.InterfaceC58205PrB
    public final boolean CeJ() {
        EnumC40111tc enumC40111tc = this.A00.A1G;
        if (enumC40111tc != EnumC40111tc.A0X && enumC40111tc != EnumC40111tc.A0Y) {
            return false;
        }
        return true;
    }

    @Override // X.InterfaceC58205PrB
    public final String getCaptureType() {
        return this.A00.A2V;
    }

    @Override // X.InterfaceC58205PrB
    public final boolean getCommentsDisabled() {
        return this.A00.A4y;
    }

    @Override // X.InterfaceC58205PrB
    public final String getFundraiserId() {
        return this.A00.A2x;
    }

    @Override // X.InterfaceC58205PrB
    public final boolean getLikeAndViewCountsDisabled() {
        return this.A00.A5a;
    }

    public P6I(C47Z c47z) {
        this.A00 = c47z;
    }
}
