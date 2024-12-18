package X;

import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.api.schemas.FeedItemType;
import java.util.List;

/* renamed from: X.1qx, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C38661qx extends C0T6 implements InterfaceC38671qy {
    public final int A00;
    public final long A01;
    public final FeedItemType A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final String A06;
    public final List A07;
    public final boolean A08;
    public final boolean A09;
    public final boolean A0A;
    public final boolean A0B;
    public final boolean A0C;
    public final boolean A0D;
    public final boolean A0E;
    public final boolean A0F;
    public final boolean A0G;

    public C38661qx(FeedItemType feedItemType, String str, String str2, String str3, String str4, List list, int i, long j, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9) {
        C14360o3.A0B(str, 1);
        C14360o3.A0B(feedItemType, 10);
        C14360o3.A0B(str2, 12);
        C14360o3.A0B(list, 15);
        C14360o3.A0B(str3, 16);
        C14360o3.A0B(str4, 17);
        this.A03 = str;
        this.A00 = i;
        this.A08 = z;
        this.A09 = z2;
        this.A01 = j;
        this.A0A = z3;
        this.A0B = z4;
        this.A0C = z5;
        this.A0D = z6;
        this.A02 = feedItemType;
        this.A0E = z7;
        this.A04 = str2;
        this.A0F = z8;
        this.A0G = z9;
        this.A07 = list;
        this.A05 = str3;
        this.A06 = str4;
    }

    @Override // X.InterfaceC38671qy
    public final C38661qx F5U(C1DY c1dy) {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C38661qx) {
                C38661qx c38661qx = (C38661qx) obj;
                if (!C14360o3.A0K(this.A03, c38661qx.A03) || this.A00 != c38661qx.A00 || this.A08 != c38661qx.A08 || this.A09 != c38661qx.A09 || this.A01 != c38661qx.A01 || this.A0A != c38661qx.A0A || this.A0B != c38661qx.A0B || this.A0C != c38661qx.A0C || this.A0D != c38661qx.A0D || this.A02 != c38661qx.A02 || this.A0E != c38661qx.A0E || !C14360o3.A0K(this.A04, c38661qx.A04) || this.A0F != c38661qx.A0F || this.A0G != c38661qx.A0G || !C14360o3.A0K(this.A07, c38661qx.A07) || !C14360o3.A0K(this.A05, c38661qx.A05) || !C14360o3.A0K(this.A06, c38661qx.A06)) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // X.InterfaceC38671qy
    public final String AYe() {
        return this.A03;
    }

    @Override // X.InterfaceC38671qy
    public final boolean B05() {
        return this.A08;
    }

    @Override // X.InterfaceC38671qy
    public final boolean BAE() {
        return this.A09;
    }

    @Override // X.InterfaceC38671qy
    public final long BF4() {
        return this.A01;
    }

    @Override // X.InterfaceC38671qy
    public final boolean BL8() {
        return this.A0B;
    }

    @Override // X.InterfaceC38671qy
    public final boolean BOA() {
        return this.A0C;
    }

    @Override // X.InterfaceC38671qy
    public final boolean BVQ() {
        return this.A0D;
    }

    @Override // X.InterfaceC38671qy
    public final FeedItemType BWc() {
        return this.A02;
    }

    @Override // X.InterfaceC38671qy
    public final boolean BXA() {
        return this.A0E;
    }

    @Override // X.InterfaceC38671qy
    public final String BkC() {
        return this.A04;
    }

    @Override // X.InterfaceC38671qy
    public final boolean Bx9() {
        return this.A0F;
    }

    @Override // X.InterfaceC38671qy
    public final boolean Bxq() {
        return this.A0G;
    }

    @Override // X.InterfaceC38671qy
    public final List C3x() {
        return this.A07;
    }

    @Override // X.InterfaceC38671qy
    public final String CAR() {
        return this.A06;
    }

    @Override // X.InterfaceC38671qy
    public final boolean Cf1() {
        return this.A0A;
    }

    @Override // X.InterfaceC38671qy
    public final InterfaceC38671qy EBe(C1DY c1dy) {
        return this;
    }

    @Override // X.InterfaceC38671qy
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return new TreeUpdaterJNI("XDTSuggestedUsersDict", AbstractC40706I2m.A00(this));
    }

    @Override // X.InterfaceC38671qy
    public final int getDuration() {
        return this.A00;
    }

    @Override // X.InterfaceC38671qy
    public final String getTitle() {
        return this.A05;
    }

    public final int hashCode() {
        int hashCode = ((this.A03.hashCode() * 31) + this.A00) * 31;
        int i = 1237;
        if (this.A08) {
            i = 1231;
        }
        int i2 = (hashCode + i) * 31;
        int i3 = 1237;
        if (this.A09) {
            i3 = 1231;
        }
        int i4 = (i2 + i3) * 31;
        long j = this.A01;
        int i5 = (i4 + ((int) (j ^ (j >>> 32)))) * 31;
        int i6 = 1237;
        if (this.A0A) {
            i6 = 1231;
        }
        int i7 = (i5 + i6) * 31;
        int i8 = 1237;
        if (this.A0B) {
            i8 = 1231;
        }
        int i9 = (i7 + i8) * 31;
        int i10 = 1237;
        if (this.A0C) {
            i10 = 1231;
        }
        int i11 = (i9 + i10) * 31;
        int i12 = 1237;
        if (this.A0D) {
            i12 = 1231;
        }
        int hashCode2 = (((i11 + i12) * 31) + this.A02.hashCode()) * 31;
        int i13 = 1237;
        if (this.A0E) {
            i13 = 1231;
        }
        int hashCode3 = (((hashCode2 + i13) * 31) + this.A04.hashCode()) * 31;
        int i14 = 1237;
        if (this.A0F) {
            i14 = 1231;
        }
        int i15 = (hashCode3 + i14) * 31;
        int i16 = 1237;
        if (this.A0G) {
            i16 = 1231;
        }
        return ((((((i15 + i16) * 31) + this.A07.hashCode()) * 31) + this.A05.hashCode()) * 31) + this.A06.hashCode();
    }
}
