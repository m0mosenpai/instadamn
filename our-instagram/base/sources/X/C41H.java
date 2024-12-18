package X;

import android.util.Size;
import com.instagram.model.mediasize.ExtendedImageUrl;

/* renamed from: X.41H, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C41H extends C0T6 {
    public final int A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final int A04;
    public final Size A05;
    public final C9BB A06;
    public final C9BH A07;
    public final C9BS A08;
    public final C9C3 A09;
    public final EnumC74213Va A0A;
    public final C86493tM A0B;
    public final C38321qM A0C;
    public final C41F A0D;
    public final C75113Zb A0E;
    public final ExtendedImageUrl A0F;
    public final Integer A0G;
    public final String A0H;
    public final boolean A0I;
    public final boolean A0J;
    public final boolean A0K;
    public final boolean A0L;
    public final C206199Bc A0M;
    public final C85083qw A0N;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C41H) {
                C41H c41h = (C41H) obj;
                if (!C14360o3.A0K(this.A0C, c41h.A0C) || !C14360o3.A0K(this.A0E, c41h.A0E) || this.A03 != c41h.A03 || !C14360o3.A0K(this.A05, c41h.A05) || this.A04 != c41h.A04 || this.A00 != c41h.A00 || this.A0I != c41h.A0I || !C14360o3.A0K(this.A0F, c41h.A0F) || !C14360o3.A0K(this.A0G, c41h.A0G) || !C14360o3.A0K(this.A08, c41h.A08) || !C14360o3.A0K(this.A07, c41h.A07) || !C14360o3.A0K(this.A06, c41h.A06) || !C14360o3.A0K(this.A09, c41h.A09) || !C14360o3.A0K(this.A0D, c41h.A0D) || !C14360o3.A0K(this.A0N, c41h.A0N) || this.A01 != c41h.A01 || this.A0L != c41h.A0L || !C14360o3.A0K(this.A0H, c41h.A0H) || this.A0J != c41h.A0J || this.A0K != c41h.A0K || !C14360o3.A0K(this.A0B, c41h.A0B) || this.A02 != c41h.A02 || !C14360o3.A0K(this.A0M, c41h.A0M) || this.A0A != c41h.A0A) {
                }
            }
            return false;
        }
        return true;
    }

    public C41H(Size size, C9BB c9bb, C9BH c9bh, C9BS c9bs, C206199Bc c206199Bc, C9C3 c9c3, EnumC74213Va enumC74213Va, C86493tM c86493tM, C85083qw c85083qw, C38321qM c38321qM, C41F c41f, C75113Zb c75113Zb, ExtendedImageUrl extendedImageUrl, Integer num, String str, int i, int i2, int i3, int i4, int i5, boolean z, boolean z2, boolean z3, boolean z4) {
        C14360o3.A0B(enumC74213Va, 24);
        this.A0C = c38321qM;
        this.A0E = c75113Zb;
        this.A03 = i;
        this.A05 = size;
        this.A04 = i2;
        this.A00 = i3;
        this.A0I = z;
        this.A0F = extendedImageUrl;
        this.A0G = num;
        this.A08 = c9bs;
        this.A07 = c9bh;
        this.A06 = c9bb;
        this.A09 = c9c3;
        this.A0D = c41f;
        this.A0N = c85083qw;
        this.A01 = i4;
        this.A0L = z2;
        this.A0H = str;
        this.A0J = z3;
        this.A0K = z4;
        this.A0B = c86493tM;
        this.A02 = i5;
        this.A0M = c206199Bc;
        this.A0A = enumC74213Va;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4 = ((((this.A0C.hashCode() * 31) + this.A0E.hashCode()) * 31) + this.A03) * 31;
        Size size = this.A05;
        int i = 0;
        if (size == null) {
            hashCode = 0;
        } else {
            hashCode = size.hashCode();
        }
        int i2 = (((((hashCode4 + hashCode) * 31) + this.A04) * 31) + this.A00) * 31;
        int i3 = 1237;
        if (this.A0I) {
            i3 = 1231;
        }
        int i4 = (i2 + i3) * 31;
        ExtendedImageUrl extendedImageUrl = this.A0F;
        if (extendedImageUrl == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = extendedImageUrl.hashCode();
        }
        int i5 = (i4 + hashCode2) * 31;
        Integer num = this.A0G;
        if (num == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = num.hashCode();
        }
        int hashCode5 = (((((((((((((((i5 + hashCode3) * 31) + this.A08.hashCode()) * 31) + this.A07.hashCode()) * 31) + this.A06.hashCode()) * 31) + this.A09.hashCode()) * 31) + this.A0D.hashCode()) * 31) + this.A0N.hashCode()) * 31) + this.A01) * 31;
        int i6 = 1237;
        if (this.A0L) {
            i6 = 1231;
        }
        int hashCode6 = (((hashCode5 + i6) * 31) + this.A0H.hashCode()) * 31;
        int i7 = 1237;
        if (this.A0J) {
            i7 = 1231;
        }
        int i8 = (hashCode6 + i7) * 31;
        int i9 = 1237;
        if (this.A0K) {
            i9 = 1231;
        }
        int i10 = (i8 + i9) * 31;
        C86493tM c86493tM = this.A0B;
        if (c86493tM != null) {
            i = c86493tM.hashCode();
        }
        return ((((((i10 + i) * 31) + this.A02) * 31) + this.A0M.hashCode()) * 31) + this.A0A.hashCode();
    }
}
