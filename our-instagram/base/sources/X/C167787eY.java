package X;

/* renamed from: X.7eY, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C167787eY extends C0T6 implements InterfaceC166387c7 {
    public final C38321qM A00;
    public final boolean A01;
    public final boolean A02;
    public final boolean A03;
    public final Integer A04;
    public final boolean A05;

    public C167787eY(C38321qM c38321qM, Integer num, boolean z, boolean z2, boolean z3, boolean z4) {
        C14360o3.A0B(num, 1);
        this.A04 = num;
        this.A02 = z;
        this.A05 = z2;
        this.A03 = z3;
        this.A01 = z4;
        this.A00 = c38321qM;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C167787eY) {
                C167787eY c167787eY = (C167787eY) obj;
                if (this.A04 != c167787eY.A04 || this.A02 != c167787eY.A02 || this.A05 != c167787eY.A05 || this.A03 != c167787eY.A03 || this.A01 != c167787eY.A01 || !C14360o3.A0K(this.A00, c167787eY.A00)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        String str;
        int hashCode;
        int intValue = this.A04.intValue();
        switch (intValue) {
            case 1:
                str = "SPONSORED";
                break;
            case 2:
                str = "DEFAULT_COMMENTS";
                break;
            case 3:
                str = "CAROUSEL_CHILD_MEDIA_COMMENTS";
                break;
            case 4:
                str = "PHOTO";
                break;
            case 5:
                str = "VIDEO";
                break;
            case 6:
                str = "POST";
                break;
            default:
                str = "EMPTY";
                break;
        }
        int hashCode2 = (str.hashCode() + intValue) * 31;
        int i = 1237;
        if (this.A02) {
            i = 1231;
        }
        int i2 = (hashCode2 + i) * 31;
        int i3 = 1237;
        if (this.A05) {
            i3 = 1231;
        }
        int i4 = (i2 + i3) * 31;
        int i5 = 1237;
        if (this.A03) {
            i5 = 1231;
        }
        int i6 = (i4 + i5) * 31;
        int i7 = 1237;
        if (this.A01) {
            i7 = 1231;
        }
        int i8 = (i6 + i7) * 31;
        C38321qM c38321qM = this.A00;
        if (c38321qM == null) {
            hashCode = 0;
        } else {
            hashCode = c38321qM.hashCode();
        }
        return i8 + hashCode;
    }
}
