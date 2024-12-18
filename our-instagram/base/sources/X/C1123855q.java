package X;

import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.api.schemas.StickerTraySurface;
import com.instagram.api.schemas.SubscriptionStickerDict;
import com.instagram.api.schemas.SubscriptionStickerDictIntf;
import com.instagram.model.venue.LocationDict;
import com.instagram.model.venue.LocationDictIntf;

/* renamed from: X.55q, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1123855q extends C0T6 implements InterfaceC1123955r {
    public final StickerTraySurface A00;
    public final SubscriptionStickerDict A01;
    public final C1124055s A02;
    public final LocationDict A03;
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

    @Override // X.InterfaceC1123955r
    public final InterfaceC1123955r EBY(C1DY c1dy) {
        return this;
    }

    @Override // X.InterfaceC1123955r
    public final C1123855q F4w(C1DY c1dy) {
        return this;
    }

    @Override // X.InterfaceC1123955r
    public final C1123855q F4x(C1DV c1dv) {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C1123855q) {
                C1123855q c1123855q = (C1123855q) obj;
                if (!C14360o3.A0K(this.A0H, c1123855q.A0H) || !C14360o3.A0K(this.A0I, c1123855q.A0I) || !C14360o3.A0K(this.A0J, c1123855q.A0J) || !C14360o3.A0K(this.A0K, c1123855q.A0K) || !C14360o3.A0K(this.A04, c1123855q.A04) || !C14360o3.A0K(this.A02, c1123855q.A02) || !C14360o3.A0K(this.A05, c1123855q.A05) || !C14360o3.A0K(this.A0L, c1123855q.A0L) || !C14360o3.A0K(this.A0C, c1123855q.A0C) || !C14360o3.A0K(this.A0D, c1123855q.A0D) || !C14360o3.A0K(this.A0E, c1123855q.A0E) || !C14360o3.A0K(this.A0F, c1123855q.A0F) || !C14360o3.A0K(this.A03, c1123855q.A03) || !C14360o3.A0K(this.A0M, c1123855q.A0M) || !C14360o3.A0K(this.A06, c1123855q.A06) || !C14360o3.A0K(this.A07, c1123855q.A07) || !C14360o3.A0K(this.A0G, c1123855q.A0G) || !C14360o3.A0K(this.A01, c1123855q.A01) || this.A00 != c1123855q.A00 || !C14360o3.A0K(this.A08, c1123855q.A08) || !C14360o3.A0K(this.A09, c1123855q.A09) || !C14360o3.A0K(this.A0A, c1123855q.A0A) || !C14360o3.A0K(this.A0B, c1123855q.A0B)) {
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
        Float f = this.A04;
        int hashCode5 = (hashCode4 + (f == null ? 0 : f.hashCode())) * 31;
        C1124055s c1124055s = this.A02;
        int hashCode6 = (hashCode5 + (c1124055s == null ? 0 : c1124055s.hashCode())) * 31;
        Float f2 = this.A05;
        int hashCode7 = (hashCode6 + (f2 == null ? 0 : f2.hashCode())) * 31;
        String str5 = this.A0L;
        int hashCode8 = (hashCode7 + (str5 == null ? 0 : str5.hashCode())) * 31;
        Integer num = this.A0C;
        int hashCode9 = (hashCode8 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.A0D;
        int hashCode10 = (hashCode9 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.A0E;
        int hashCode11 = (hashCode10 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Integer num4 = this.A0F;
        int hashCode12 = (hashCode11 + (num4 == null ? 0 : num4.hashCode())) * 31;
        LocationDict locationDict = this.A03;
        int hashCode13 = (hashCode12 + (locationDict == null ? 0 : locationDict.hashCode())) * 31;
        String str6 = this.A0M;
        int hashCode14 = (hashCode13 + (str6 == null ? 0 : str6.hashCode())) * 31;
        Float f3 = this.A06;
        int hashCode15 = (hashCode14 + (f3 == null ? 0 : f3.hashCode())) * 31;
        Float f4 = this.A07;
        int hashCode16 = (hashCode15 + (f4 == null ? 0 : f4.hashCode())) * 31;
        Integer num5 = this.A0G;
        int hashCode17 = (hashCode16 + (num5 == null ? 0 : num5.hashCode())) * 31;
        SubscriptionStickerDict subscriptionStickerDict = this.A01;
        int hashCode18 = (hashCode17 + (subscriptionStickerDict == null ? 0 : subscriptionStickerDict.hashCode())) * 31;
        StickerTraySurface stickerTraySurface = this.A00;
        int hashCode19 = (hashCode18 + (stickerTraySurface == null ? 0 : stickerTraySurface.hashCode())) * 31;
        Float f5 = this.A08;
        int hashCode20 = (hashCode19 + (f5 == null ? 0 : f5.hashCode())) * 31;
        Float f6 = this.A09;
        int hashCode21 = (hashCode20 + (f6 == null ? 0 : f6.hashCode())) * 31;
        Float f7 = this.A0A;
        int hashCode22 = (hashCode21 + (f7 == null ? 0 : f7.hashCode())) * 31;
        Float f8 = this.A0B;
        return hashCode22 + (f8 != null ? f8.hashCode() : 0);
    }

    @Override // X.InterfaceC1123955r
    public final String AdC() {
        return this.A0H;
    }

    @Override // X.InterfaceC1123955r
    public final String AdO() {
        return this.A0I;
    }

    @Override // X.InterfaceC1123955r
    public final String AvN() {
        return this.A0J;
    }

    @Override // X.InterfaceC1123955r
    public final String Ayd() {
        return this.A0K;
    }

    @Override // X.InterfaceC1123955r
    public final Float B29() {
        return this.A04;
    }

    @Override // X.InterfaceC1123955r
    public final /* bridge */ /* synthetic */ InterfaceC1124155t BAp() {
        return this.A02;
    }

    @Override // X.InterfaceC1123955r
    public final Float BDR() {
        return this.A05;
    }

    @Override // X.InterfaceC1123955r
    public final /* bridge */ /* synthetic */ LocationDictIntf BOL() {
        return this.A03;
    }

    @Override // X.InterfaceC1123955r
    public final Float Bpa() {
        return this.A06;
    }

    @Override // X.InterfaceC1123955r
    public final Float Bzq() {
        return this.A07;
    }

    @Override // X.InterfaceC1123955r
    public final Integer C0i() {
        return this.A0G;
    }

    @Override // X.InterfaceC1123955r
    public final /* bridge */ /* synthetic */ SubscriptionStickerDictIntf C3Y() {
        return this.A01;
    }

    @Override // X.InterfaceC1123955r
    public final StickerTraySurface C4I() {
        return this.A00;
    }

    @Override // X.InterfaceC1123955r
    public final Float CHf() {
        return this.A08;
    }

    @Override // X.InterfaceC1123955r
    public final Float CI1() {
        return this.A09;
    }

    @Override // X.InterfaceC1123955r
    public final Float CIa() {
        return this.A0A;
    }

    @Override // X.InterfaceC1123955r
    public final Float CIh() {
        return this.A0B;
    }

    @Override // X.InterfaceC1123955r
    public final Integer CUY() {
        return this.A0C;
    }

    @Override // X.InterfaceC1123955r
    public final Integer CVk() {
        return this.A0D;
    }

    @Override // X.InterfaceC1123955r
    public final Integer CaJ() {
        return this.A0E;
    }

    @Override // X.InterfaceC1123955r
    public final Integer Cdh() {
        return this.A0F;
    }

    @Override // X.InterfaceC1123955r
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return new TreeUpdaterJNI("XDTStoryLocationTappableObject", I0N.A00(this));
    }

    @Override // X.InterfaceC1123955r
    public final String getId() {
        return this.A0L;
    }

    @Override // X.InterfaceC1123955r
    public final String getMediaType() {
        return this.A0M;
    }

    public C1123855q(StickerTraySurface stickerTraySurface, SubscriptionStickerDict subscriptionStickerDict, C1124055s c1124055s, LocationDict locationDict, Float f, Float f2, Float f3, Float f4, Float f5, Float f6, Float f7, Float f8, Integer num, Integer num2, Integer num3, Integer num4, Integer num5, String str, String str2, String str3, String str4, String str5, String str6) {
        this.A0H = str;
        this.A0I = str2;
        this.A0J = str3;
        this.A0K = str4;
        this.A04 = f;
        this.A02 = c1124055s;
        this.A05 = f2;
        this.A0L = str5;
        this.A0C = num;
        this.A0D = num2;
        this.A0E = num3;
        this.A0F = num4;
        this.A03 = locationDict;
        this.A0M = str6;
        this.A06 = f3;
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
