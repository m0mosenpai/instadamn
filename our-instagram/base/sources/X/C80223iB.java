package X;

import com.instagram.user.model.User;

/* renamed from: X.3iB, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C80223iB extends C0T6 {
    public final C51750MtZ A00;
    public final C38321qM A01;
    public final C76733cL A02;
    public final User A03;
    public final String A04;
    public final boolean A05;
    public final boolean A06;
    public final boolean A07;
    public final boolean A08;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C80223iB) {
                C80223iB c80223iB = (C80223iB) obj;
                if (!C14360o3.A0K(this.A01, c80223iB.A01) || this.A05 != c80223iB.A05 || !C14360o3.A0K(this.A03, c80223iB.A03) || !C14360o3.A0K(this.A02, c80223iB.A02) || !C14360o3.A0K(this.A00, c80223iB.A00) || !C14360o3.A0K(this.A04, c80223iB.A04) || this.A07 != c80223iB.A07 || this.A08 != c80223iB.A08 || this.A06 != c80223iB.A06) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        C38321qM c38321qM = this.A01;
        int i = 0;
        if (c38321qM == null) {
            hashCode = 0;
        } else {
            hashCode = c38321qM.hashCode();
        }
        int i2 = hashCode * 31;
        int i3 = 1237;
        if (this.A05) {
            i3 = 1231;
        }
        int i4 = (i2 + i3) * 31;
        User user = this.A03;
        if (user == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = user.hashCode();
        }
        int i5 = (i4 + hashCode2) * 31;
        C76733cL c76733cL = this.A02;
        if (c76733cL == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = c76733cL.hashCode();
        }
        int hashCode4 = (((i5 + hashCode3) * 31) + this.A00.hashCode()) * 31;
        String str = this.A04;
        if (str != null) {
            i = str.hashCode();
        }
        int i6 = (hashCode4 + i) * 31;
        int i7 = 1237;
        if (this.A07) {
            i7 = 1231;
        }
        int i8 = (i6 + i7) * 31;
        int i9 = 1237;
        if (this.A08) {
            i9 = 1231;
        }
        int i10 = (i8 + i9) * 31;
        int i11 = 1237;
        if (this.A06) {
            i11 = 1231;
        }
        return i10 + i11;
    }

    public C80223iB(C51750MtZ c51750MtZ, C38321qM c38321qM, C76733cL c76733cL, User user, String str, boolean z, boolean z2, boolean z3, boolean z4) {
        this.A01 = c38321qM;
        this.A05 = z;
        this.A03 = user;
        this.A02 = c76733cL;
        this.A00 = c51750MtZ;
        this.A04 = str;
        this.A07 = z2;
        this.A08 = z3;
        this.A06 = z4;
    }
}
