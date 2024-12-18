package X;

import com.facebook.common.dextricks.JITProfilePQR;
import com.facebook.forker.Process;
import com.instagram.api.schemas.ProductCardSubtitleType;
import com.instagram.model.shopping.productfeed.ProductFeedItem;
import com.instagram.react.modules.base.IgReactQEModule;

/* renamed from: X.Gz1, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38660Gz1 extends C0T6 {
    public final int A00;
    public final int A01;
    public final ProductCardSubtitleType A02;
    public final C19260xA A03;
    public final ProductFeedItem A04;
    public final EnumC39622HeW A05;
    public final EnumC39541HdD A06;
    public final Integer A07;
    public final String A08;
    public final String A09;
    public final String A0A;
    public final boolean A0B;
    public final boolean A0C;
    public final boolean A0D;
    public final boolean A0E;
    public final boolean A0F;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C38660Gz1) {
                C38660Gz1 c38660Gz1 = (C38660Gz1) obj;
                if (!C14360o3.A0K(this.A04, c38660Gz1.A04) || this.A05 != c38660Gz1.A05 || this.A07 != c38660Gz1.A07 || !C14360o3.A0K(this.A0A, c38660Gz1.A0A) || !C14360o3.A0K(this.A09, c38660Gz1.A09) || this.A01 != c38660Gz1.A01 || this.A00 != c38660Gz1.A00 || !C14360o3.A0K(this.A03, c38660Gz1.A03) || this.A02 != c38660Gz1.A02 || this.A0C != c38660Gz1.A0C || !C14360o3.A0K(this.A08, c38660Gz1.A08) || this.A0F != c38660Gz1.A0F || this.A0D != c38660Gz1.A0D || this.A0E != c38660Gz1.A0E || this.A0B != c38660Gz1.A0B || this.A06 != c38660Gz1.A06) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        String str;
        int A02;
        int A0M = AbstractC167017dG.A0M(this.A04) * 31;
        int A00 = AbstractC53644Nnp.A00();
        int A0M2 = (((A0M + A00) * 31) + AbstractC167017dG.A0M(this.A05)) * 31;
        Integer num = this.A07;
        if (num == null) {
            A02 = 0;
        } else {
            int intValue = num.intValue();
            switch (intValue) {
                case 1:
                    str = "AT_SHOP_COLLECTION";
                    break;
                case 2:
                    str = "CART";
                    break;
                case 3:
                    str = "DROP_COLLECTION";
                    break;
                case 4:
                    str = "INSTANT_COLLECTION";
                    break;
                case 5:
                    str = "SALE_COLLECTION";
                    break;
                case 6:
                    str = "SELLER_CURATED_COLLECTION";
                    break;
                case 7:
                    str = "WISH_LIST";
                    break;
                case 8:
                    str = "RECONSIDERATION_DESTINATION";
                    break;
                case 9:
                    str = "DISCOVERY_CHAINING_FEED";
                    break;
                case 10:
                    str = "POST_LIVE";
                    break;
                case 11:
                    str = "PRODUCT_DETAILS_PAGE";
                    break;
                case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
                    str = "LIVE_VIEWER";
                    break;
                case JITProfilePQR.HEADER_COMPRESSED_SIZE_OFFSET /* 13 */:
                    str = "IGTV_VIEWER";
                    break;
                case 14:
                    str = MSV.A00(809);
                    break;
                case Process.SIGTERM /* 15 */:
                    str = "PROFILE_SHOP";
                    break;
                case 16:
                    str = "BLOKS";
                    break;
                case 17:
                    str = "UPCOMING_EVENT_BOTTOM_SHEET";
                    break;
                case 18:
                    str = "UPCOMING_EVENT_POST_LIVE";
                    break;
                case Process.SIGSTOP /* 19 */:
                    str = "FEATURED_PRODUCTS";
                    break;
                case 20:
                    str = "VISUAL_SEARCH";
                    break;
                case 21:
                    str = "UPCOMING_EVENT_PAGE";
                    break;
                case 22:
                    str = "MAIN_FEED";
                    break;
                default:
                    str = "SHOPPING_HOME";
                    break;
            }
            A02 = AbstractC25226BEj.A02(str, intValue);
        }
        return (((((((((AbstractC167007dF.A0D(this.A0B, AbstractC167007dF.A0D(this.A0E, AbstractC167007dF.A0D(this.A0D, AbstractC167007dF.A0D(this.A0F, (AbstractC167007dF.A0D(this.A0C, (((((((((((((A0M2 + A02) * 31) + AbstractC167017dG.A0O(this.A0A)) * 31) + AbstractC167017dG.A0O(this.A09)) * 31) + this.A01) * 31) + this.A00) * 31) + AbstractC167017dG.A0M(this.A03)) * 31) + AbstractC167017dG.A0M(this.A02)) * 31) + AbstractC167017dG.A0O(this.A08)) * 31)) * 31)) + A00) * 31) + A00) * 31) + AbstractC167017dG.A0M(this.A06)) * 31) + A00) * 31) + A00) * 31;
    }

    public C38660Gz1(ProductCardSubtitleType productCardSubtitleType, C19260xA c19260xA, ProductFeedItem productFeedItem, EnumC39622HeW enumC39622HeW, EnumC39541HdD enumC39541HdD, Integer num, String str, String str2, String str3, int i, int i2, boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        this.A04 = productFeedItem;
        this.A05 = enumC39622HeW;
        this.A07 = num;
        this.A0A = str;
        this.A09 = str2;
        this.A01 = i;
        this.A00 = i2;
        this.A03 = c19260xA;
        this.A02 = productCardSubtitleType;
        this.A0C = z;
        this.A08 = str3;
        this.A0F = z2;
        this.A0D = z3;
        this.A0E = z4;
        this.A0B = z5;
        this.A06 = enumC39541HdD;
    }
}
