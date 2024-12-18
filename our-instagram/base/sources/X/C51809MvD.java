package X;

/* renamed from: X.MvD, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C51809MvD extends C0T6 implements InterfaceC41141vN {
    public final Integer A00;
    public final String A01;
    public final String A02;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C51809MvD) {
                C51809MvD c51809MvD = (C51809MvD) obj;
                if (this.A00 != c51809MvD.A00 || !C14360o3.A0K(this.A02, c51809MvD.A02) || !C14360o3.A0K(this.A01, c51809MvD.A01)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        String str;
        int A02;
        Integer num = this.A00;
        if (num == null) {
            A02 = 0;
        } else {
            int intValue = num.intValue();
            if (1 != intValue) {
                str = "DISMISS";
            } else {
                str = "VIEW";
            }
            A02 = AbstractC25226BEj.A02(str, intValue);
        }
        return (((A02 * 31) + AbstractC167017dG.A0O(this.A02)) * 31) + AbstractC25227BEk.A07(this.A01);
    }

    public final String toString() {
        String str;
        Integer num = this.A00;
        if (num != null) {
            if (1 - num.intValue() != 0) {
                str = "DISMISS";
            } else {
                str = "VIEW";
            }
        } else {
            str = "null";
        }
        return AnonymousClass001.A14("CXPNoticeEvent(eventType=", str, ", noticeVariant=", this.A02, ", entrypoint=", this.A01, ')');
    }

    public C51809MvD(String str, Integer num, String str2) {
        this.A00 = num;
        this.A02 = str;
        this.A01 = str2;
    }
}
