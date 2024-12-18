package X;

import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.api.schemas.StickerTraySurface;
import com.instagram.api.schemas.SubscriptionStickerDict;
import com.instagram.api.schemas.SubscriptionStickerDictIntf;
import com.instagram.user.model.User;

/* renamed from: X.446, reason: invalid class name */
/* loaded from: classes2.dex */
public final class AnonymousClass446 extends C0T6 implements AnonymousClass447 {
    public final StickerTraySurface A00;
    public final SubscriptionStickerDict A01;
    public final User A02;
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

    @Override // X.AnonymousClass447
    public final AnonymousClass447 E9H(C1DY c1dy) {
        return this;
    }

    @Override // X.AnonymousClass447
    public final AnonymousClass446 Ewb(C1DY c1dy) {
        return this;
    }

    @Override // X.AnonymousClass447
    public final AnonymousClass446 Ewc(C1DV c1dv) {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass446) {
                AnonymousClass446 anonymousClass446 = (AnonymousClass446) obj;
                if (!C14360o3.A0K(this.A0G, anonymousClass446.A0G) || !C14360o3.A0K(this.A0H, anonymousClass446.A0H) || !C14360o3.A0K(this.A0I, anonymousClass446.A0I) || !C14360o3.A0K(this.A0J, anonymousClass446.A0J) || !C14360o3.A0K(this.A03, anonymousClass446.A03) || !C14360o3.A0K(this.A04, anonymousClass446.A04) || !C14360o3.A0K(this.A0K, anonymousClass446.A0K) || !C14360o3.A0K(this.A0B, anonymousClass446.A0B) || !C14360o3.A0K(this.A0C, anonymousClass446.A0C) || !C14360o3.A0K(this.A0D, anonymousClass446.A0D) || !C14360o3.A0K(this.A0E, anonymousClass446.A0E) || !C14360o3.A0K(this.A0L, anonymousClass446.A0L) || !C14360o3.A0K(this.A05, anonymousClass446.A05) || !C14360o3.A0K(this.A06, anonymousClass446.A06) || !C14360o3.A0K(this.A0F, anonymousClass446.A0F) || !C14360o3.A0K(this.A01, anonymousClass446.A01) || this.A00 != anonymousClass446.A00 || !C14360o3.A0K(this.A02, anonymousClass446.A02) || !C14360o3.A0K(this.A0M, anonymousClass446.A0M) || !C14360o3.A0K(this.A07, anonymousClass446.A07) || !C14360o3.A0K(this.A08, anonymousClass446.A08) || !C14360o3.A0K(this.A09, anonymousClass446.A09) || !C14360o3.A0K(this.A0A, anonymousClass446.A0A)) {
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
        Float f = this.A03;
        int hashCode5 = (hashCode4 + (f == null ? 0 : f.hashCode())) * 31;
        Float f2 = this.A04;
        int hashCode6 = (hashCode5 + (f2 == null ? 0 : f2.hashCode())) * 31;
        String str5 = this.A0K;
        int hashCode7 = (hashCode6 + (str5 == null ? 0 : str5.hashCode())) * 31;
        Integer num = this.A0B;
        int hashCode8 = (hashCode7 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.A0C;
        int hashCode9 = (hashCode8 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.A0D;
        int hashCode10 = (hashCode9 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Integer num4 = this.A0E;
        int hashCode11 = (hashCode10 + (num4 == null ? 0 : num4.hashCode())) * 31;
        String str6 = this.A0L;
        int hashCode12 = (hashCode11 + (str6 == null ? 0 : str6.hashCode())) * 31;
        Float f3 = this.A05;
        int hashCode13 = (hashCode12 + (f3 == null ? 0 : f3.hashCode())) * 31;
        Float f4 = this.A06;
        int hashCode14 = (hashCode13 + (f4 == null ? 0 : f4.hashCode())) * 31;
        Integer num5 = this.A0F;
        int hashCode15 = (hashCode14 + (num5 == null ? 0 : num5.hashCode())) * 31;
        SubscriptionStickerDict subscriptionStickerDict = this.A01;
        int hashCode16 = (hashCode15 + (subscriptionStickerDict == null ? 0 : subscriptionStickerDict.hashCode())) * 31;
        StickerTraySurface stickerTraySurface = this.A00;
        int hashCode17 = (hashCode16 + (stickerTraySurface == null ? 0 : stickerTraySurface.hashCode())) * 31;
        User user = this.A02;
        int hashCode18 = (hashCode17 + (user == null ? 0 : user.hashCode())) * 31;
        String str7 = this.A0M;
        int hashCode19 = (hashCode18 + (str7 == null ? 0 : str7.hashCode())) * 31;
        Float f5 = this.A07;
        int hashCode20 = (hashCode19 + (f5 == null ? 0 : f5.hashCode())) * 31;
        Float f6 = this.A08;
        int hashCode21 = (hashCode20 + (f6 == null ? 0 : f6.hashCode())) * 31;
        Float f7 = this.A09;
        int hashCode22 = (hashCode21 + (f7 == null ? 0 : f7.hashCode())) * 31;
        Float f8 = this.A0A;
        return hashCode22 + (f8 != null ? f8.hashCode() : 0);
    }

    @Override // X.AnonymousClass447
    public final String AdC() {
        return this.A0G;
    }

    @Override // X.AnonymousClass447
    public final String AdO() {
        return this.A0H;
    }

    @Override // X.AnonymousClass447
    public final String AvN() {
        return this.A0I;
    }

    @Override // X.AnonymousClass447
    public final String Ayd() {
        return this.A0J;
    }

    @Override // X.AnonymousClass447
    public final Float B29() {
        return this.A03;
    }

    @Override // X.AnonymousClass447
    public final Float BDR() {
        return this.A04;
    }

    @Override // X.AnonymousClass447
    public final Float Bpa() {
        return this.A05;
    }

    @Override // X.AnonymousClass447
    public final Float Bzq() {
        return this.A06;
    }

    @Override // X.AnonymousClass447
    public final Integer C0i() {
        return this.A0F;
    }

    @Override // X.AnonymousClass447
    public final /* bridge */ /* synthetic */ SubscriptionStickerDictIntf C3Y() {
        return this.A01;
    }

    @Override // X.AnonymousClass447
    public final StickerTraySurface C4I() {
        return this.A00;
    }

    @Override // X.AnonymousClass447
    public final User CDj() {
        return this.A02;
    }

    @Override // X.AnonymousClass447
    public final Float CHf() {
        return this.A07;
    }

    @Override // X.AnonymousClass447
    public final Float CI1() {
        return this.A08;
    }

    @Override // X.AnonymousClass447
    public final Float CIa() {
        return this.A09;
    }

    @Override // X.AnonymousClass447
    public final Float CIh() {
        return this.A0A;
    }

    @Override // X.AnonymousClass447
    public final Integer CUY() {
        return this.A0B;
    }

    @Override // X.AnonymousClass447
    public final Integer CVk() {
        return this.A0C;
    }

    @Override // X.AnonymousClass447
    public final Integer CaJ() {
        return this.A0D;
    }

    @Override // X.AnonymousClass447
    public final Integer Cdh() {
        return this.A0E;
    }

    @Override // X.AnonymousClass447
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return new TreeUpdaterJNI("XDTMentionTappableObject", AbstractC37373GdF.A00(this));
    }

    @Override // X.AnonymousClass447
    public final String getId() {
        return this.A0K;
    }

    @Override // X.AnonymousClass447
    public final String getMediaType() {
        return this.A0L;
    }

    @Override // X.AnonymousClass447
    public final String getUserId() {
        return this.A0M;
    }

    public AnonymousClass446(StickerTraySurface stickerTraySurface, SubscriptionStickerDict subscriptionStickerDict, User user, Float f, Float f2, Float f3, Float f4, Float f5, Float f6, Float f7, Float f8, Integer num, Integer num2, Integer num3, Integer num4, Integer num5, String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        this.A0G = str;
        this.A0H = str2;
        this.A0I = str3;
        this.A0J = str4;
        this.A03 = f;
        this.A04 = f2;
        this.A0K = str5;
        this.A0B = num;
        this.A0C = num2;
        this.A0D = num3;
        this.A0E = num4;
        this.A0L = str6;
        this.A05 = f3;
        this.A06 = f4;
        this.A0F = num5;
        this.A01 = subscriptionStickerDict;
        this.A00 = stickerTraySurface;
        this.A02 = user;
        this.A0M = str7;
        this.A07 = f5;
        this.A08 = f6;
        this.A09 = f7;
        this.A0A = f8;
    }
}
