package X;

import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.api.schemas.StickerTraySurface;
import com.instagram.api.schemas.SubscriptionStickerDict;
import com.instagram.api.schemas.SubscriptionStickerDictIntf;

/* loaded from: classes7.dex */
public final class H5W extends C0T6 implements InterfaceC73616YQe {
    public final StickerTraySurface A00;
    public final SubscriptionStickerDict A01;
    public final H7X A02;
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

    @Override // X.InterfaceC73616YQe
    public final H5W F0J(C1DY c1dy) {
        return this;
    }

    @Override // X.InterfaceC73616YQe
    public final H5W F0K(C1DV c1dv) {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof H5W) {
                H5W h5w = (H5W) obj;
                if (!C14360o3.A0K(this.A0G, h5w.A0G) || !C14360o3.A0K(this.A0H, h5w.A0H) || !C14360o3.A0K(this.A0I, h5w.A0I) || !C14360o3.A0K(this.A0J, h5w.A0J) || !C14360o3.A0K(this.A02, h5w.A02) || !C14360o3.A0K(this.A03, h5w.A03) || !C14360o3.A0K(this.A04, h5w.A04) || !C14360o3.A0K(this.A0K, h5w.A0K) || !C14360o3.A0K(this.A0B, h5w.A0B) || !C14360o3.A0K(this.A0C, h5w.A0C) || !C14360o3.A0K(this.A0D, h5w.A0D) || !C14360o3.A0K(this.A0E, h5w.A0E) || !C14360o3.A0K(this.A0L, h5w.A0L) || !C14360o3.A0K(this.A05, h5w.A05) || !C14360o3.A0K(this.A06, h5w.A06) || !C14360o3.A0K(this.A0F, h5w.A0F) || !C14360o3.A0K(this.A01, h5w.A01) || this.A00 != h5w.A00 || !C14360o3.A0K(this.A07, h5w.A07) || !C14360o3.A0K(this.A08, h5w.A08) || !C14360o3.A0K(this.A09, h5w.A09) || !C14360o3.A0K(this.A0A, h5w.A0A)) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // X.InterfaceC73616YQe
    public final String AdC() {
        return this.A0G;
    }

    @Override // X.InterfaceC73616YQe
    public final String AdO() {
        return this.A0H;
    }

    @Override // X.InterfaceC73616YQe
    public final String AvN() {
        return this.A0I;
    }

    @Override // X.InterfaceC73616YQe
    public final String Ayd() {
        return this.A0J;
    }

    @Override // X.InterfaceC73616YQe
    public final /* bridge */ /* synthetic */ InterfaceC43525JKl B0o() {
        return this.A02;
    }

    @Override // X.InterfaceC73616YQe
    public final Float B29() {
        return this.A03;
    }

    @Override // X.InterfaceC73616YQe
    public final Float BDR() {
        return this.A04;
    }

    @Override // X.InterfaceC73616YQe
    public final Float Bpa() {
        return this.A05;
    }

    @Override // X.InterfaceC73616YQe
    public final Float Bzq() {
        return this.A06;
    }

    @Override // X.InterfaceC73616YQe
    public final Integer C0i() {
        return this.A0F;
    }

    @Override // X.InterfaceC73616YQe
    public final /* bridge */ /* synthetic */ SubscriptionStickerDictIntf C3Y() {
        return this.A01;
    }

    @Override // X.InterfaceC73616YQe
    public final StickerTraySurface C4I() {
        return this.A00;
    }

    @Override // X.InterfaceC73616YQe
    public final Float CHf() {
        return this.A07;
    }

    @Override // X.InterfaceC73616YQe
    public final Float CI1() {
        return this.A08;
    }

    @Override // X.InterfaceC73616YQe
    public final Float CIa() {
        return this.A09;
    }

    @Override // X.InterfaceC73616YQe
    public final Float CIh() {
        return this.A0A;
    }

    @Override // X.InterfaceC73616YQe
    public final Integer CUY() {
        return this.A0B;
    }

    @Override // X.InterfaceC73616YQe
    public final Integer CVk() {
        return this.A0C;
    }

    @Override // X.InterfaceC73616YQe
    public final Integer CaJ() {
        return this.A0D;
    }

    @Override // X.InterfaceC73616YQe
    public final Integer Cdh() {
        return this.A0E;
    }

    @Override // X.InterfaceC73616YQe
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return AbstractC37300Gc1.A05("XDTStoryElectionTappableObject", AbstractC72595Xhb.A00(this));
    }

    @Override // X.InterfaceC73616YQe
    public final String getId() {
        return this.A0K;
    }

    @Override // X.InterfaceC73616YQe
    public final String getMediaType() {
        return this.A0L;
    }

    public final int hashCode() {
        return (((((((((((((((((((((((((((((((((((((((((AbstractC167017dG.A0O(this.A0G) * 31) + AbstractC167017dG.A0O(this.A0H)) * 31) + AbstractC167017dG.A0O(this.A0I)) * 31) + AbstractC167017dG.A0O(this.A0J)) * 31) + AbstractC167017dG.A0M(this.A02)) * 31) + AbstractC167017dG.A0M(this.A03)) * 31) + AbstractC167017dG.A0M(this.A04)) * 31) + AbstractC167017dG.A0O(this.A0K)) * 31) + AbstractC167017dG.A0M(this.A0B)) * 31) + AbstractC167017dG.A0M(this.A0C)) * 31) + AbstractC167017dG.A0M(this.A0D)) * 31) + AbstractC167017dG.A0M(this.A0E)) * 31) + AbstractC167017dG.A0O(this.A0L)) * 31) + AbstractC167017dG.A0M(this.A05)) * 31) + AbstractC167017dG.A0M(this.A06)) * 31) + AbstractC167017dG.A0M(this.A0F)) * 31) + AbstractC167017dG.A0M(this.A01)) * 31) + AbstractC167017dG.A0M(this.A00)) * 31) + AbstractC167017dG.A0M(this.A07)) * 31) + AbstractC167017dG.A0M(this.A08)) * 31) + AbstractC167017dG.A0M(this.A09)) * 31) + AbstractC166997dE.A0I(this.A0A);
    }

    public H5W(StickerTraySurface stickerTraySurface, SubscriptionStickerDict subscriptionStickerDict, H7X h7x, Float f, Float f2, Float f3, Float f4, Float f5, Float f6, Float f7, Float f8, Integer num, Integer num2, Integer num3, Integer num4, Integer num5, String str, String str2, String str3, String str4, String str5, String str6) {
        this.A0G = str;
        this.A0H = str2;
        this.A0I = str3;
        this.A0J = str4;
        this.A02 = h7x;
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
        this.A07 = f5;
        this.A08 = f6;
        this.A09 = f7;
        this.A0A = f8;
    }

    @Override // X.InterfaceC73616YQe
    public final InterfaceC73616YQe EA6(C1DY c1dy) {
        return this;
    }
}
