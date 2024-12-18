package X;

/* renamed from: X.Buo, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26947Buo extends AbstractC166097bd {
    public final int A00;
    public final EnumC166067ba A01;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C26947Buo(EnumC166067ba enumC166067ba, int i) {
        super(AnonymousClass001.A0c("sort_order_and_filter_selector_row", enumC166067ba.A00, i));
        C14360o3.A0B(enumC166067ba, 2);
        this.A00 = i;
        this.A01 = enumC166067ba;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C26947Buo) {
                C26947Buo c26947Buo = (C26947Buo) obj;
                if (this.A00 != c26947Buo.A00 || this.A01 != c26947Buo.A01) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AbstractC166987dD.A0I(this.A01, this.A00 * 31);
    }
}
