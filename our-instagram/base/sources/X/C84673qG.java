package X;

import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.api.schemas.StickerTraySurface;
import com.instagram.api.schemas.SubscriptionStickerDict;
import com.instagram.api.schemas.SubscriptionStickerDictIntf;

/* renamed from: X.3qG, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C84673qG extends C0T6 implements InterfaceC84683qH {
    public final StickerTraySurface A00;
    public final SubscriptionStickerDict A01;
    public final Boolean A02;
    public final Boolean A03;
    public final Float A04;
    public final Float A05;
    public final Float A06;
    public final Float A07;
    public final Float A08;
    public final Float A09;
    public final Float A0A;
    public final Float A0B;
    public final Integer A0C;
    public final Integer A0D;
    public final Integer A0E;
    public final Integer A0F;
    public final Integer A0G;
    public final String A0H;
    public final String A0I;
    public final String A0J;
    public final String A0K;
    public final String A0L;
    public final String A0M;
    public final String A0N;
    public final String A0O;
    public final String A0P;
    public final String A0Q;
    public final String A0R;

    @Override // X.InterfaceC84683qH
    public final InterfaceC84683qH EAC(C1DY c1dy) {
        return this;
    }

    @Override // X.InterfaceC84683qH
    public final C84673qG F0Y(C1DY c1dy) {
        return this;
    }

    @Override // X.InterfaceC84683qH
    public final C84673qG F0Z(C1DV c1dv) {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C84673qG) {
                C84673qG c84673qG = (C84673qG) obj;
                if (!C14360o3.A0K(this.A0H, c84673qG.A0H) || !C14360o3.A0K(this.A0I, c84673qG.A0I) || !C14360o3.A0K(this.A0J, c84673qG.A0J) || !C14360o3.A0K(this.A0K, c84673qG.A0K) || !C14360o3.A0K(this.A0L, c84673qG.A0L) || !C14360o3.A0K(this.A04, c84673qG.A04) || !C14360o3.A0K(this.A02, c84673qG.A02) || !C14360o3.A0K(this.A05, c84673qG.A05) || !C14360o3.A0K(this.A0M, c84673qG.A0M) || !C14360o3.A0K(this.A0C, c84673qG.A0C) || !C14360o3.A0K(this.A0D, c84673qG.A0D) || !C14360o3.A0K(this.A0E, c84673qG.A0E) || !C14360o3.A0K(this.A0F, c84673qG.A0F) || !C14360o3.A0K(this.A0N, c84673qG.A0N) || !C14360o3.A0K(this.A0O, c84673qG.A0O) || !C14360o3.A0K(this.A0P, c84673qG.A0P) || !C14360o3.A0K(this.A0Q, c84673qG.A0Q) || !C14360o3.A0K(this.A0R, c84673qG.A0R) || !C14360o3.A0K(this.A06, c84673qG.A06) || !C14360o3.A0K(this.A03, c84673qG.A03) || !C14360o3.A0K(this.A07, c84673qG.A07) || !C14360o3.A0K(this.A0G, c84673qG.A0G) || !C14360o3.A0K(this.A01, c84673qG.A01) || this.A00 != c84673qG.A00 || !C14360o3.A0K(this.A08, c84673qG.A08) || !C14360o3.A0K(this.A09, c84673qG.A09) || !C14360o3.A0K(this.A0A, c84673qG.A0A) || !C14360o3.A0K(this.A0B, c84673qG.A0B)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        String str = this.A0H;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.A0I;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.A0J;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.A0K;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.A0L;
        int hashCode5 = (hashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        Float f = this.A04;
        int hashCode6 = (hashCode5 + (f == null ? 0 : f.hashCode())) * 31;
        Boolean bool = this.A02;
        int hashCode7 = (hashCode6 + (bool == null ? 0 : bool.hashCode())) * 31;
        Float f2 = this.A05;
        int hashCode8 = (hashCode7 + (f2 == null ? 0 : f2.hashCode())) * 31;
        String str6 = this.A0M;
        int hashCode9 = (hashCode8 + (str6 == null ? 0 : str6.hashCode())) * 31;
        Integer num = this.A0C;
        int hashCode10 = (hashCode9 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.A0D;
        int hashCode11 = (hashCode10 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.A0E;
        int hashCode12 = (hashCode11 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Integer num4 = this.A0F;
        int hashCode13 = (hashCode12 + (num4 == null ? 0 : num4.hashCode())) * 31;
        String str7 = this.A0N;
        int hashCode14 = (hashCode13 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.A0O;
        int hashCode15 = (hashCode14 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.A0P;
        int hashCode16 = (hashCode15 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.A0Q;
        int hashCode17 = (hashCode16 + (str10 == null ? 0 : str10.hashCode())) * 31;
        String str11 = this.A0R;
        int hashCode18 = (hashCode17 + (str11 == null ? 0 : str11.hashCode())) * 31;
        Float f3 = this.A06;
        int hashCode19 = (hashCode18 + (f3 == null ? 0 : f3.hashCode())) * 31;
        Boolean bool2 = this.A03;
        int hashCode20 = (hashCode19 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Float f4 = this.A07;
        int hashCode21 = (hashCode20 + (f4 == null ? 0 : f4.hashCode())) * 31;
        Integer num5 = this.A0G;
        int hashCode22 = (hashCode21 + (num5 == null ? 0 : num5.hashCode())) * 31;
        SubscriptionStickerDict subscriptionStickerDict = this.A01;
        int hashCode23 = (hashCode22 + (subscriptionStickerDict == null ? 0 : subscriptionStickerDict.hashCode())) * 31;
        StickerTraySurface stickerTraySurface = this.A00;
        int hashCode24 = (hashCode23 + (stickerTraySurface == null ? 0 : stickerTraySurface.hashCode())) * 31;
        Float f5 = this.A08;
        int hashCode25 = (hashCode24 + (f5 == null ? 0 : f5.hashCode())) * 31;
        Float f6 = this.A09;
        int hashCode26 = (hashCode25 + (f6 == null ? 0 : f6.hashCode())) * 31;
        Float f7 = this.A0A;
        int hashCode27 = (hashCode26 + (f7 == null ? 0 : f7.hashCode())) * 31;
        Float f8 = this.A0B;
        return hashCode27 + (f8 != null ? f8.hashCode() : 0);
    }

    @Override // X.InterfaceC84683qH
    public final String AdC() {
        return this.A0H;
    }

    @Override // X.InterfaceC84683qH
    public final String AdO() {
        return this.A0I;
    }

    @Override // X.InterfaceC84683qH
    public final String AvN() {
        return this.A0K;
    }

    @Override // X.InterfaceC84683qH
    public final String Ayd() {
        return this.A0L;
    }

    @Override // X.InterfaceC84683qH
    public final Float B29() {
        return this.A04;
    }

    @Override // X.InterfaceC84683qH
    public final Boolean BBh() {
        return this.A02;
    }

    @Override // X.InterfaceC84683qH
    public final Float BDR() {
        return this.A05;
    }

    @Override // X.InterfaceC84683qH
    public final String BQW() {
        return this.A0N;
    }

    @Override // X.InterfaceC84683qH
    public final String BQY() {
        return this.A0O;
    }

    @Override // X.InterfaceC84683qH
    public final Float Bpa() {
        return this.A06;
    }

    @Override // X.InterfaceC84683qH
    public final Boolean Bvz() {
        return this.A03;
    }

    @Override // X.InterfaceC84683qH
    public final Float Bzq() {
        return this.A07;
    }

    @Override // X.InterfaceC84683qH
    public final Integer C0i() {
        return this.A0G;
    }

    @Override // X.InterfaceC84683qH
    public final /* bridge */ /* synthetic */ SubscriptionStickerDictIntf C3Y() {
        return this.A01;
    }

    @Override // X.InterfaceC84683qH
    public final StickerTraySurface C4I() {
        return this.A00;
    }

    @Override // X.InterfaceC84683qH
    public final Float CHf() {
        return this.A08;
    }

    @Override // X.InterfaceC84683qH
    public final Float CI1() {
        return this.A09;
    }

    @Override // X.InterfaceC84683qH
    public final Float CIa() {
        return this.A0A;
    }

    @Override // X.InterfaceC84683qH
    public final Float CIh() {
        return this.A0B;
    }

    @Override // X.InterfaceC84683qH
    public final Integer CUY() {
        return this.A0C;
    }

    @Override // X.InterfaceC84683qH
    public final Integer CVk() {
        return this.A0D;
    }

    @Override // X.InterfaceC84683qH
    public final Integer CaJ() {
        return this.A0E;
    }

    @Override // X.InterfaceC84683qH
    public final Integer Cdh() {
        return this.A0F;
    }

    @Override // X.InterfaceC84683qH
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return new TreeUpdaterJNI("XDTStoryFeedMediaTappableObject", AbstractC37385GdR.A00(this));
    }

    @Override // X.InterfaceC84683qH
    public final String getClipsCreationEntryPoint() {
        return this.A0J;
    }

    @Override // X.InterfaceC84683qH
    public final String getId() {
        return this.A0M;
    }

    @Override // X.InterfaceC84683qH
    public final String getMediaId() {
        return this.A0P;
    }

    @Override // X.InterfaceC84683qH
    public final String getMediaType() {
        return this.A0Q;
    }

    @Override // X.InterfaceC84683qH
    public final String getProductType() {
        return this.A0R;
    }

    public C84673qG(StickerTraySurface stickerTraySurface, SubscriptionStickerDict subscriptionStickerDict, Boolean bool, Boolean bool2, Float f, Float f2, Float f3, Float f4, Float f5, Float f6, Float f7, Float f8, Integer num, Integer num2, Integer num3, Integer num4, Integer num5, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11) {
        this.A0H = str;
        this.A0I = str2;
        this.A0J = str3;
        this.A0K = str4;
        this.A0L = str5;
        this.A04 = f;
        this.A02 = bool;
        this.A05 = f2;
        this.A0M = str6;
        this.A0C = num;
        this.A0D = num2;
        this.A0E = num3;
        this.A0F = num4;
        this.A0N = str7;
        this.A0O = str8;
        this.A0P = str9;
        this.A0Q = str10;
        this.A0R = str11;
        this.A06 = f3;
        this.A03 = bool2;
        this.A07 = f4;
        this.A0G = num5;
        this.A01 = subscriptionStickerDict;
        this.A00 = stickerTraySurface;
        this.A08 = f5;
        this.A09 = f6;
        this.A0A = f7;
        this.A0B = f8;
    }
}
