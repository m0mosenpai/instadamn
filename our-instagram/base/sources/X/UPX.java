package X;

import com.instagram.api.schemas.BoostedActionStatus;
import com.instagram.api.schemas.InstagramMediaProductType;

/* loaded from: classes11.dex */
public final class UPX extends C0T6 {
    public final int A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final int A04;
    public final int A05;
    public final int A06;
    public final int A07;
    public final long A08;
    public final BoostedActionStatus A09;
    public final InstagramMediaProductType A0A;
    public final String A0B;
    public final String A0C;
    public final String A0D;
    public final String A0E;
    public final boolean A0F;
    public final boolean A0G;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof UPX) {
                UPX upx = (UPX) obj;
                if (!C14360o3.A0K(this.A0C, upx.A0C) || !C14360o3.A0K(this.A0B, upx.A0B) || !C14360o3.A0K(this.A0D, upx.A0D) || !C14360o3.A0K(this.A0E, upx.A0E) || this.A07 != upx.A07 || this.A03 != upx.A03 || this.A04 != upx.A04 || this.A02 != upx.A02 || this.A00 != upx.A00 || this.A05 != upx.A05 || this.A06 != upx.A06 || this.A01 != upx.A01 || this.A0G != upx.A0G || this.A0A != upx.A0A || this.A0F != upx.A0F || this.A09 != upx.A09 || this.A08 != upx.A08) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return ((AbstractC167007dF.A0D(this.A0F, AbstractC166997dE.A0J(this.A0A, AbstractC167007dF.A0D(this.A0G, (((((((((((((((AbstractC166997dE.A0K(this.A0E, AbstractC166997dE.A0K(this.A0D, AbstractC166997dE.A0K(this.A0B, this.A0C.hashCode() * 31))) + this.A07) * 31) + this.A03) * 31) + this.A04) * 31) + this.A02) * 31) + this.A00) * 31) + this.A05) * 31) + this.A06) * 31) + this.A01) * 31))) + AbstractC167017dG.A0M(this.A09)) * 31) + AbstractC25228BEl.A03(this.A08);
    }

    public UPX(BoostedActionStatus boostedActionStatus, InstagramMediaProductType instagramMediaProductType, String str, String str2, String str3, String str4, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, long j, boolean z, boolean z2) {
        this.A0C = str;
        this.A0B = str2;
        this.A0D = str3;
        this.A0E = str4;
        this.A07 = i;
        this.A03 = i2;
        this.A04 = i3;
        this.A02 = i4;
        this.A00 = i5;
        this.A05 = i6;
        this.A06 = i7;
        this.A01 = i8;
        this.A0G = z;
        this.A0A = instagramMediaProductType;
        this.A0F = z2;
        this.A09 = boostedActionStatus;
        this.A08 = j;
    }
}
