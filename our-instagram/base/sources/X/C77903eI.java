package X;

import com.instagram.user.model.User;

/* renamed from: X.3eI, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C77903eI extends C0T6 {
    public final C38321qM A00;
    public final InterfaceC60442pS A01;
    public final C75113Zb A02;
    public final EnumC76383bi A03;
    public final User A04;
    public final String A05;
    public final boolean A06;
    public final boolean A07;
    public final boolean A08;
    public final boolean A09;
    public final String A0A;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C77903eI) {
                C77903eI c77903eI = (C77903eI) obj;
                if (!C14360o3.A0K(this.A00, c77903eI.A00) || !C14360o3.A0K(this.A02, c77903eI.A02) || !C14360o3.A0K(this.A05, c77903eI.A05) || !C14360o3.A0K(this.A01, c77903eI.A01) || this.A07 != c77903eI.A07 || this.A08 != c77903eI.A08 || this.A09 != c77903eI.A09 || !C14360o3.A0K(this.A0A, c77903eI.A0A) || !C14360o3.A0K(this.A04, c77903eI.A04) || this.A03 != c77903eI.A03 || this.A06 != c77903eI.A06) {
                }
            }
            return false;
        }
        return true;
    }

    public C77903eI(C38321qM c38321qM, InterfaceC60442pS interfaceC60442pS, C75113Zb c75113Zb, EnumC76383bi enumC76383bi, User user, String str, String str2, boolean z, boolean z2, boolean z3, boolean z4) {
        C14360o3.A0B(enumC76383bi, 10);
        this.A00 = c38321qM;
        this.A02 = c75113Zb;
        this.A05 = str;
        this.A01 = interfaceC60442pS;
        this.A07 = z;
        this.A08 = z2;
        this.A09 = z3;
        this.A0A = str2;
        this.A04 = user;
        this.A03 = enumC76383bi;
        this.A06 = z4;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = ((this.A00.hashCode() * 31) + this.A02.hashCode()) * 31;
        String str = this.A05;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int hashCode3 = (((hashCode2 + hashCode) * 31) + this.A01.hashCode()) * 31;
        int i = 1237;
        if (this.A07) {
            i = 1231;
        }
        int i2 = (hashCode3 + i) * 31;
        int i3 = 1237;
        if (this.A08) {
            i3 = 1231;
        }
        int i4 = (i2 + i3) * 31;
        int i5 = 1237;
        if (this.A09) {
            i5 = 1231;
        }
        int hashCode4 = (((((((i4 + i5) * 31) + this.A0A.hashCode()) * 31) + this.A04.hashCode()) * 31) + this.A03.hashCode()) * 31;
        int i6 = 1237;
        if (this.A06) {
            i6 = 1231;
        }
        return hashCode4 + i6;
    }
}
