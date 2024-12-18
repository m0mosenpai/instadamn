package X;

import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.api.schemas.StickerTraySurface;
import com.instagram.api.schemas.SubscriptionStickerDict;
import com.instagram.api.schemas.SubscriptionStickerDictIntf;

/* renamed from: X.5KO, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C5KO extends C0T6 implements C5KP {
    public final StickerTraySurface A00;
    public final C5KN A01;
    public final SubscriptionStickerDict A02;
    public final Float A03;
    public final Float A04;
    public final Float A05;
    public final Float A06;
    public final Float A07;
    public final Float A08;
    public final Float A09;
    public final Float A0A;
    public final Integer A0B;
    public final Integer A0C;
    public final Integer A0D;
    public final Integer A0E;
    public final Integer A0F;
    public final String A0G;
    public final String A0H;
    public final String A0I;
    public final String A0J;
    public final String A0K;
    public final String A0L;
    public final String A0M;
    public final String A0N;

    @Override // X.C5KP
    public final C5KP EAH(C1DY c1dy) {
        return this;
    }

    @Override // X.C5KP
    public final C5KO F0j(C1DY c1dy) {
        return this;
    }

    @Override // X.C5KP
    public final C5KO F0k(C1DV c1dv) {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C5KO) {
                C5KO c5ko = (C5KO) obj;
                if (!C14360o3.A0K(this.A0G, c5ko.A0G) || !C14360o3.A0K(this.A0H, c5ko.A0H) || !C14360o3.A0K(this.A0I, c5ko.A0I) || !C14360o3.A0K(this.A0J, c5ko.A0J) || !C14360o3.A0K(this.A0K, c5ko.A0K) || !C14360o3.A0K(this.A03, c5ko.A03) || !C14360o3.A0K(this.A01, c5ko.A01) || !C14360o3.A0K(this.A04, c5ko.A04) || !C14360o3.A0K(this.A0L, c5ko.A0L) || !C14360o3.A0K(this.A0B, c5ko.A0B) || !C14360o3.A0K(this.A0C, c5ko.A0C) || !C14360o3.A0K(this.A0D, c5ko.A0D) || !C14360o3.A0K(this.A0E, c5ko.A0E) || !C14360o3.A0K(this.A0M, c5ko.A0M) || !C14360o3.A0K(this.A05, c5ko.A05) || !C14360o3.A0K(this.A06, c5ko.A06) || !C14360o3.A0K(this.A0F, c5ko.A0F) || !C14360o3.A0K(this.A02, c5ko.A02) || this.A00 != c5ko.A00 || !C14360o3.A0K(this.A0N, c5ko.A0N) || !C14360o3.A0K(this.A07, c5ko.A07) || !C14360o3.A0K(this.A08, c5ko.A08) || !C14360o3.A0K(this.A09, c5ko.A09) || !C14360o3.A0K(this.A0A, c5ko.A0A)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        String str = this.A0G;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.A0H;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.A0I;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.A0J;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.A0K;
        int hashCode5 = (hashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        Float f = this.A03;
        int hashCode6 = (hashCode5 + (f == null ? 0 : f.hashCode())) * 31;
        C5KN c5kn = this.A01;
        int hashCode7 = (hashCode6 + (c5kn == null ? 0 : c5kn.hashCode())) * 31;
        Float f2 = this.A04;
        int hashCode8 = (hashCode7 + (f2 == null ? 0 : f2.hashCode())) * 31;
        String str6 = this.A0L;
        int hashCode9 = (hashCode8 + (str6 == null ? 0 : str6.hashCode())) * 31;
        Integer num = this.A0B;
        int hashCode10 = (hashCode9 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.A0C;
        int hashCode11 = (hashCode10 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.A0D;
        int hashCode12 = (hashCode11 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Integer num4 = this.A0E;
        int hashCode13 = (hashCode12 + (num4 == null ? 0 : num4.hashCode())) * 31;
        String str7 = this.A0M;
        int hashCode14 = (hashCode13 + (str7 == null ? 0 : str7.hashCode())) * 31;
        Float f3 = this.A05;
        int hashCode15 = (hashCode14 + (f3 == null ? 0 : f3.hashCode())) * 31;
        Float f4 = this.A06;
        int hashCode16 = (hashCode15 + (f4 == null ? 0 : f4.hashCode())) * 31;
        Integer num5 = this.A0F;
        int hashCode17 = (hashCode16 + (num5 == null ? 0 : num5.hashCode())) * 31;
        SubscriptionStickerDict subscriptionStickerDict = this.A02;
        int hashCode18 = (hashCode17 + (subscriptionStickerDict == null ? 0 : subscriptionStickerDict.hashCode())) * 31;
        StickerTraySurface stickerTraySurface = this.A00;
        int hashCode19 = (hashCode18 + (stickerTraySurface == null ? 0 : stickerTraySurface.hashCode())) * 31;
        String str8 = this.A0N;
        int hashCode20 = (hashCode19 + (str8 == null ? 0 : str8.hashCode())) * 31;
        Float f5 = this.A07;
        int hashCode21 = (hashCode20 + (f5 == null ? 0 : f5.hashCode())) * 31;
        Float f6 = this.A08;
        int hashCode22 = (hashCode21 + (f6 == null ? 0 : f6.hashCode())) * 31;
        Float f7 = this.A09;
        int hashCode23 = (hashCode22 + (f7 == null ? 0 : f7.hashCode())) * 31;
        Float f8 = this.A0A;
        return hashCode23 + (f8 != null ? f8.hashCode() : 0);
    }

    @Override // X.C5KP
    public final String AdC() {
        return this.A0G;
    }

    @Override // X.C5KP
    public final String AdO() {
        return this.A0H;
    }

    @Override // X.C5KP
    public final String AvN() {
        return this.A0I;
    }

    @Override // X.C5KP
    public final String AvP() {
        return this.A0J;
    }

    @Override // X.C5KP
    public final String Ayd() {
        return this.A0K;
    }

    @Override // X.C5KP
    public final Float B29() {
        return this.A03;
    }

    @Override // X.C5KP
    public final C5KN BD3() {
        return this.A01;
    }

    @Override // X.C5KP
    public final Float BDR() {
        return this.A04;
    }

    @Override // X.C5KP
    public final Float Bpa() {
        return this.A05;
    }

    @Override // X.C5KP
    public final Float Bzq() {
        return this.A06;
    }

    @Override // X.C5KP
    public final Integer C0i() {
        return this.A0F;
    }

    @Override // X.C5KP
    public final /* bridge */ /* synthetic */ SubscriptionStickerDictIntf C3Y() {
        return this.A02;
    }

    @Override // X.C5KP
    public final StickerTraySurface C4I() {
        return this.A00;
    }

    @Override // X.C5KP
    public final String C50() {
        return this.A0N;
    }

    @Override // X.C5KP
    public final Float CHf() {
        return this.A07;
    }

    @Override // X.C5KP
    public final Float CI1() {
        return this.A08;
    }

    @Override // X.C5KP
    public final Float CIa() {
        return this.A09;
    }

    @Override // X.C5KP
    public final Float CIh() {
        return this.A0A;
    }

    @Override // X.C5KP
    public final Integer CUY() {
        return this.A0B;
    }

    @Override // X.C5KP
    public final Integer CVk() {
        return this.A0C;
    }

    @Override // X.C5KP
    public final Integer CaJ() {
        return this.A0D;
    }

    @Override // X.C5KP
    public final Integer Cdh() {
        return this.A0E;
    }

    @Override // X.C5KP
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return new TreeUpdaterJNI("XDTStoryHashtagTappableObject", AbstractC40291Htv.A00(this));
    }

    @Override // X.C5KP
    public final String getId() {
        return this.A0L;
    }

    @Override // X.C5KP
    public final String getMediaType() {
        return this.A0M;
    }

    public C5KO(StickerTraySurface stickerTraySurface, C5KN c5kn, SubscriptionStickerDict subscriptionStickerDict, Float f, Float f2, Float f3, Float f4, Float f5, Float f6, Float f7, Float f8, Integer num, Integer num2, Integer num3, Integer num4, Integer num5, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8) {
        this.A0G = str;
        this.A0H = str2;
        this.A0I = str3;
        this.A0J = str4;
        this.A0K = str5;
        this.A03 = f;
        this.A01 = c5kn;
        this.A04 = f2;
        this.A0L = str6;
        this.A0B = num;
        this.A0C = num2;
        this.A0D = num3;
        this.A0E = num4;
        this.A0M = str7;
        this.A05 = f3;
        this.A06 = f4;
        this.A0F = num5;
        this.A02 = subscriptionStickerDict;
        this.A00 = stickerTraySurface;
        this.A0N = str8;
        this.A07 = f5;
        this.A08 = f6;
        this.A09 = f7;
        this.A0A = f8;
    }
}
