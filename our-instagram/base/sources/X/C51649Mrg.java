package X;

import android.graphics.RectF;
import com.instagram.igtv.uploadflow.metadata.shopping.model.IGTVShoppingMetadata;

/* renamed from: X.Mrg, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C51649Mrg extends C0T6 {
    public final int A00;
    public final long A01;
    public final RectF A02;
    public final RectF A03;
    public final C51737MtK A04;
    public final C51661Mrs A05;
    public final C51715Msk A06;
    public final C51669Ms0 A07;
    public final C51667Mry A08;
    public final IGTVShoppingMetadata A09;
    public final String A0A;
    public final String A0B;
    public final String A0C;
    public final String A0D;
    public final boolean A0E;
    public final boolean A0F;
    public final boolean A0G;
    public final boolean A0H;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C51649Mrg) {
                C51649Mrg c51649Mrg = (C51649Mrg) obj;
                if (this.A00 != c51649Mrg.A00 || this.A01 != c51649Mrg.A01 || !C14360o3.A0K(this.A08, c51649Mrg.A08) || !C14360o3.A0K(this.A0D, c51649Mrg.A0D) || !C14360o3.A0K(this.A0A, c51649Mrg.A0A) || !C14360o3.A0K(this.A04, c51649Mrg.A04) || !C14360o3.A0K(this.A05, c51649Mrg.A05) || !C14360o3.A0K(this.A07, c51649Mrg.A07) || this.A0F != c51649Mrg.A0F || !C14360o3.A0K(this.A02, c51649Mrg.A02) || !C14360o3.A0K(this.A03, c51649Mrg.A03) || this.A0E != c51649Mrg.A0E || !C14360o3.A0K(this.A0B, c51649Mrg.A0B) || this.A0H != c51649Mrg.A0H || !C14360o3.A0K(this.A06, c51649Mrg.A06) || !C14360o3.A0K(this.A0C, c51649Mrg.A0C) || !C14360o3.A0K(this.A09, c51649Mrg.A09) || this.A0G != c51649Mrg.A0G) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AbstractC166987dD.A0K(this.A0G, (((AbstractC166997dE.A0J(this.A06, AbstractC167007dF.A0D(this.A0H, (AbstractC167007dF.A0D(this.A0E, (((AbstractC167007dF.A0D(this.A0F, AbstractC166997dE.A0J(this.A07, AbstractC166997dE.A0J(this.A05, AbstractC166997dE.A0J(this.A04, AbstractC166997dE.A0K(this.A0A, AbstractC166997dE.A0K(this.A0D, AbstractC166997dE.A0J(this.A08, AbstractC25236BEt.A01(this.A01, this.A00 * 31)))))))) + AbstractC167017dG.A0M(this.A02)) * 31) + AbstractC167017dG.A0M(this.A03)) * 31) + AbstractC167017dG.A0O(this.A0B)) * 31)) + AbstractC167017dG.A0O(this.A0C)) * 31) + AbstractC166997dE.A0I(this.A09)) * 31);
    }

    public C51649Mrg(RectF rectF, RectF rectF2, C51737MtK c51737MtK, C51661Mrs c51661Mrs, C51715Msk c51715Msk, C51669Ms0 c51669Ms0, C51667Mry c51667Mry, IGTVShoppingMetadata iGTVShoppingMetadata, String str, String str2, String str3, String str4, int i, long j, boolean z, boolean z2, boolean z3, boolean z4) {
        AbstractC167017dG.A1S(str, str2);
        this.A00 = i;
        this.A01 = j;
        this.A08 = c51667Mry;
        this.A0D = str;
        this.A0A = str2;
        this.A04 = c51737MtK;
        this.A05 = c51661Mrs;
        this.A07 = c51669Ms0;
        this.A0F = z;
        this.A02 = rectF;
        this.A03 = rectF2;
        this.A0E = z2;
        this.A0B = str3;
        this.A0H = z3;
        this.A06 = c51715Msk;
        this.A0C = str4;
        this.A09 = iGTVShoppingMetadata;
        this.A0G = z4;
    }
}
