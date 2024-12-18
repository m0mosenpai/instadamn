package X;

import com.instagram.common.typedurl.ImageUrl;
import com.instagram.user.model.FollowStatus;

/* renamed from: X.6HF, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C6HF extends C0T6 implements InterfaceC132245y2 {
    public final int A00;
    public final C132175xv A01;
    public final C26036BfP A02;
    public final ImageUrl A03;
    public final FollowStatus A04;
    public final String A05;
    public final String A06;
    public final String A07;
    public final String A08;
    public final boolean A09;
    public final boolean A0A;
    public final boolean A0B;
    public final boolean A0C;

    @Override // X.InterfaceC132245y2
    public final /* synthetic */ C51758Mth CGR() {
        return AbstractC132295y8.A00();
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C6HF) {
                C6HF c6hf = (C6HF) obj;
                if (!C14360o3.A0K(this.A01, c6hf.A01) || !C14360o3.A0K(this.A02, c6hf.A02) || this.A0B != c6hf.A0B || !C14360o3.A0K(this.A03, c6hf.A03) || !C14360o3.A0K(this.A06, c6hf.A06) || !C14360o3.A0K(this.A08, c6hf.A08) || this.A04 != c6hf.A04 || this.A0C != c6hf.A0C || !C14360o3.A0K(this.A07, c6hf.A07) || !C14360o3.A0K(this.A05, c6hf.A05) || this.A00 != c6hf.A00 || this.A0A != c6hf.A0A || this.A09 != c6hf.A09) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // X.InterfaceC132245y2
    public final String BKd() {
        return AbstractC132295y8.A01(this, "collapsed_post", this.A01.A03);
    }

    @Override // X.InterfaceC132245y2
    public final C132175xv Bet() {
        return this.A01;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = ((this.A01.hashCode() * 31) + this.A02.hashCode()) * 31;
        int i = 1237;
        if (this.A0B) {
            i = 1231;
        }
        int i2 = (hashCode2 + i) * 31;
        ImageUrl imageUrl = this.A03;
        int i3 = 0;
        if (imageUrl == null) {
            hashCode = 0;
        } else {
            hashCode = imageUrl.hashCode();
        }
        int hashCode3 = (((((((i2 + hashCode) * 31) + this.A06.hashCode()) * 31) + this.A08.hashCode()) * 31) + this.A04.hashCode()) * 31;
        int i4 = 1237;
        if (this.A0C) {
            i4 = 1231;
        }
        int hashCode4 = (((hashCode3 + i4) * 31) + this.A07.hashCode()) * 31;
        String str = this.A05;
        if (str != null) {
            i3 = str.hashCode();
        }
        int i5 = (((hashCode4 + i3) * 31) + this.A00) * 31;
        int i6 = 1237;
        if (this.A0A) {
            i6 = 1231;
        }
        int i7 = (i5 + i6) * 31;
        int i8 = 1237;
        if (this.A09) {
            i8 = 1231;
        }
        return i7 + i8;
    }

    public C6HF(C132175xv c132175xv, C26036BfP c26036BfP, ImageUrl imageUrl, FollowStatus followStatus, String str, String str2, String str3, String str4, int i, boolean z, boolean z2, boolean z3, boolean z4) {
        this.A01 = c132175xv;
        this.A02 = c26036BfP;
        this.A0B = z;
        this.A03 = imageUrl;
        this.A06 = str;
        this.A08 = str2;
        this.A04 = followStatus;
        this.A0C = z2;
        this.A07 = str3;
        this.A05 = str4;
        this.A00 = i;
        this.A0A = z3;
        this.A09 = z4;
    }
}
