package X;

import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.api.schemas.StickerTraySurface;
import com.instagram.api.schemas.StoryPromptTappableData;
import com.instagram.api.schemas.StoryPromptTappableDataIntf;
import com.instagram.api.schemas.SubscriptionStickerDict;
import com.instagram.api.schemas.SubscriptionStickerDictIntf;

/* renamed from: X.4wK, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C109354wK extends C0T6 implements InterfaceC109364wL {
    public final StickerTraySurface A00;
    public final StoryPromptTappableData A01;
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

    @Override // X.InterfaceC109364wL
    public final InterfaceC109364wL EAZ(C1DY c1dy) {
        return this;
    }

    @Override // X.InterfaceC109364wL
    public final C109354wK F1N(C1DY c1dy) {
        return this;
    }

    @Override // X.InterfaceC109364wL
    public final C109354wK F1O(C1DV c1dv) {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C109354wK) {
                C109354wK c109354wK = (C109354wK) obj;
                if (!C14360o3.A0K(this.A0G, c109354wK.A0G) || !C14360o3.A0K(this.A0H, c109354wK.A0H) || !C14360o3.A0K(this.A0I, c109354wK.A0I) || !C14360o3.A0K(this.A0J, c109354wK.A0J) || !C14360o3.A0K(this.A03, c109354wK.A03) || !C14360o3.A0K(this.A04, c109354wK.A04) || !C14360o3.A0K(this.A0K, c109354wK.A0K) || !C14360o3.A0K(this.A0B, c109354wK.A0B) || !C14360o3.A0K(this.A0C, c109354wK.A0C) || !C14360o3.A0K(this.A0D, c109354wK.A0D) || !C14360o3.A0K(this.A0E, c109354wK.A0E) || !C14360o3.A0K(this.A0L, c109354wK.A0L) || !C14360o3.A0K(this.A01, c109354wK.A01) || !C14360o3.A0K(this.A05, c109354wK.A05) || !C14360o3.A0K(this.A06, c109354wK.A06) || !C14360o3.A0K(this.A0F, c109354wK.A0F) || !C14360o3.A0K(this.A02, c109354wK.A02) || this.A00 != c109354wK.A00 || !C14360o3.A0K(this.A07, c109354wK.A07) || !C14360o3.A0K(this.A08, c109354wK.A08) || !C14360o3.A0K(this.A09, c109354wK.A09) || !C14360o3.A0K(this.A0A, c109354wK.A0A)) {
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
        StoryPromptTappableData storyPromptTappableData = this.A01;
        int hashCode13 = (hashCode12 + (storyPromptTappableData == null ? 0 : storyPromptTappableData.hashCode())) * 31;
        Float f3 = this.A05;
        int hashCode14 = (hashCode13 + (f3 == null ? 0 : f3.hashCode())) * 31;
        Float f4 = this.A06;
        int hashCode15 = (hashCode14 + (f4 == null ? 0 : f4.hashCode())) * 31;
        Integer num5 = this.A0F;
        int hashCode16 = (hashCode15 + (num5 == null ? 0 : num5.hashCode())) * 31;
        SubscriptionStickerDict subscriptionStickerDict = this.A02;
        int hashCode17 = (hashCode16 + (subscriptionStickerDict == null ? 0 : subscriptionStickerDict.hashCode())) * 31;
        StickerTraySurface stickerTraySurface = this.A00;
        int hashCode18 = (hashCode17 + (stickerTraySurface == null ? 0 : stickerTraySurface.hashCode())) * 31;
        Float f5 = this.A07;
        int hashCode19 = (hashCode18 + (f5 == null ? 0 : f5.hashCode())) * 31;
        Float f6 = this.A08;
        int hashCode20 = (hashCode19 + (f6 == null ? 0 : f6.hashCode())) * 31;
        Float f7 = this.A09;
        int hashCode21 = (hashCode20 + (f7 == null ? 0 : f7.hashCode())) * 31;
        Float f8 = this.A0A;
        return hashCode21 + (f8 != null ? f8.hashCode() : 0);
    }

    @Override // X.InterfaceC109364wL
    public final /* bridge */ /* synthetic */ C69488VoB AKa() {
        return new C69488VoB(this);
    }

    @Override // X.InterfaceC109364wL
    public final String AdC() {
        return this.A0G;
    }

    @Override // X.InterfaceC109364wL
    public final String AdO() {
        return this.A0H;
    }

    @Override // X.InterfaceC109364wL
    public final String AvN() {
        return this.A0I;
    }

    @Override // X.InterfaceC109364wL
    public final String Ayd() {
        return this.A0J;
    }

    @Override // X.InterfaceC109364wL
    public final Float B29() {
        return this.A03;
    }

    @Override // X.InterfaceC109364wL
    public final Float BDR() {
        return this.A04;
    }

    @Override // X.InterfaceC109364wL
    public final /* bridge */ /* synthetic */ StoryPromptTappableDataIntf Bii() {
        return this.A01;
    }

    @Override // X.InterfaceC109364wL
    public final Float Bpa() {
        return this.A05;
    }

    @Override // X.InterfaceC109364wL
    public final Float Bzq() {
        return this.A06;
    }

    @Override // X.InterfaceC109364wL
    public final Integer C0i() {
        return this.A0F;
    }

    @Override // X.InterfaceC109364wL
    public final /* bridge */ /* synthetic */ SubscriptionStickerDictIntf C3Y() {
        return this.A02;
    }

    @Override // X.InterfaceC109364wL
    public final StickerTraySurface C4I() {
        return this.A00;
    }

    @Override // X.InterfaceC109364wL
    public final Float CHf() {
        return this.A07;
    }

    @Override // X.InterfaceC109364wL
    public final Float CI1() {
        return this.A08;
    }

    @Override // X.InterfaceC109364wL
    public final Float CIa() {
        return this.A09;
    }

    @Override // X.InterfaceC109364wL
    public final Float CIh() {
        return this.A0A;
    }

    @Override // X.InterfaceC109364wL
    public final Integer CUY() {
        return this.A0B;
    }

    @Override // X.InterfaceC109364wL
    public final Integer CVk() {
        return this.A0C;
    }

    @Override // X.InterfaceC109364wL
    public final Integer CaJ() {
        return this.A0D;
    }

    @Override // X.InterfaceC109364wL
    public final Integer Cdh() {
        return this.A0E;
    }

    @Override // X.InterfaceC109364wL
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return new TreeUpdaterJNI("XDTStoryPromptTappableObject", VP6.A00(this));
    }

    @Override // X.InterfaceC109364wL
    public final String getId() {
        return this.A0K;
    }

    @Override // X.InterfaceC109364wL
    public final String getMediaType() {
        return this.A0L;
    }

    public C109354wK(StickerTraySurface stickerTraySurface, StoryPromptTappableData storyPromptTappableData, SubscriptionStickerDict subscriptionStickerDict, Float f, Float f2, Float f3, Float f4, Float f5, Float f6, Float f7, Float f8, Integer num, Integer num2, Integer num3, Integer num4, Integer num5, String str, String str2, String str3, String str4, String str5, String str6) {
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
        this.A01 = storyPromptTappableData;
        this.A05 = f3;
        this.A06 = f4;
        this.A0F = num5;
        this.A02 = subscriptionStickerDict;
        this.A00 = stickerTraySurface;
        this.A07 = f5;
        this.A08 = f6;
        this.A09 = f7;
        this.A0A = f8;
    }
}