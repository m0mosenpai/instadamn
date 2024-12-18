package X;

/* renamed from: X.7BT, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C7BT extends C0T6 implements InterfaceC129555tK {
    public final int A00;
    public final int A01;
    public final Integer A02;
    public final String A03;
    public final String A04;
    public final String A05;

    public C7BT(Integer num, String str, String str2, String str3, int i, int i2) {
        C14360o3.A0B(str2, 5);
        C14360o3.A0B(str3, 6);
        this.A00 = i;
        this.A01 = i2;
        this.A02 = num;
        this.A03 = str;
        this.A05 = str2;
        this.A04 = str3;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C7BT) {
                C7BT c7bt = (C7BT) obj;
                if (this.A00 != c7bt.A00 || this.A01 != c7bt.A01 || this.A02 != c7bt.A02 || !C14360o3.A0K(this.A03, c7bt.A03) || !C14360o3.A0K(this.A05, c7bt.A05) || !C14360o3.A0K(this.A04, c7bt.A04)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        String str;
        int hashCode;
        int i = ((this.A00 * 31) + this.A01) * 31;
        int intValue = this.A02.intValue();
        switch (intValue) {
            case 1:
                str = "OPEN_EPHEMERAL_MESSAGE_WARNING";
                break;
            case 2:
                str = "URL_RESHARE";
                break;
            case 3:
                str = "OPEN_PERMANENT_MESSAGE_WARNING";
                break;
            default:
                str = "INSTAMADILLO_EPHEMERAL_EXCEPTION_WARNING";
                break;
        }
        int hashCode2 = (i + str.hashCode() + intValue) * 31;
        String str2 = this.A03;
        if (str2 == null) {
            hashCode = 0;
        } else {
            hashCode = str2.hashCode();
        }
        return ((((hashCode2 + hashCode) * 31) + this.A05.hashCode()) * 31) + this.A04.hashCode();
    }

    @Override // X.InterfaceC66492zQ
    public final /* bridge */ /* synthetic */ boolean isContentSame(Object obj) {
        return equals(obj);
    }
}
