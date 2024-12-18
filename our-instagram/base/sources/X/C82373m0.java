package X;

/* renamed from: X.3m0, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C82373m0 extends C0T6 {
    public final C9CB A00;
    public final C3XG A01;
    public final EnumC73363Qm A02;
    public final C671831j A03;

    public C82373m0(C9CB c9cb, C3XG c3xg, EnumC73363Qm enumC73363Qm, C671831j c671831j) {
        C14360o3.A0B(c671831j, 3);
        C14360o3.A0B(c9cb, 4);
        this.A01 = c3xg;
        this.A02 = enumC73363Qm;
        this.A03 = c671831j;
        this.A00 = c9cb;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C82373m0) {
                C82373m0 c82373m0 = (C82373m0) obj;
                if (!C14360o3.A0K(this.A01, c82373m0.A01) || this.A02 != c82373m0.A02 || !C14360o3.A0K(this.A03, c82373m0.A03) || !C14360o3.A0K(this.A00, c82373m0.A00)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (((((this.A01.hashCode() * 31) + this.A02.hashCode()) * 31) + this.A03.hashCode()) * 31) + this.A00.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("SponsoredFeedItem(feedItem=");
        sb.append(this.A01);
        sb.append(", deliveryDataType=");
        sb.append(this.A02);
        sb.append(AbstractC111324zv.A00(1416));
        sb.append(this.A03);
        sb.append(", requestData=");
        sb.append(this.A00);
        sb.append(')');
        return sb.toString();
    }
}
