package X;

/* renamed from: X.5IF, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C5IF extends C0T6 implements InterfaceC42381xS {
    public final C82373m0 A00;
    public final int A01;
    public final Integer A02;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C5IF) {
                C5IF c5if = (C5IF) obj;
                if (!C14360o3.A0K(this.A00, c5if.A00) || this.A02 != c5if.A02 || this.A01 != c5if.A01) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // X.InterfaceC42381xS
    public final long Ask() {
        throw new UnsupportedOperationException("Creation time retrieval is not supported for this object.");
    }

    @Override // X.InterfaceC42381xS
    public final long B3I() {
        throw new UnsupportedOperationException("Explicit expiration time retrieval is not supported for this object.");
    }

    @Override // X.InterfaceC42381xS
    public final /* synthetic */ int BA4() {
        throw new UnsupportedOperationException("Not supported");
    }

    @Override // X.InterfaceC42381xS
    public final /* bridge */ /* synthetic */ Object BUM() {
        return this.A00;
    }

    @Override // X.InterfaceC42381xS
    public final /* synthetic */ Integer BeP() {
        return C05F.A00;
    }

    @Override // X.InterfaceC42381xS
    public final /* synthetic */ String Bo9() {
        return "";
    }

    @Override // X.InterfaceC42381xS
    public final int BoB() {
        return this.A01;
    }

    @Override // X.InterfaceC42381xS
    public final /* synthetic */ String BoF() {
        return "";
    }

    @Override // X.InterfaceC42381xS
    public final /* synthetic */ boolean Boz() {
        return false;
    }

    @Override // X.InterfaceC42381xS
    public final Integer Byg() {
        return this.A02;
    }

    @Override // X.InterfaceC42381xS
    public final /* synthetic */ boolean CVy() {
        return false;
    }

    @Override // X.InterfaceC42381xS
    public final /* synthetic */ void Ecr(boolean z) {
        throw new UnsupportedOperationException("Not supported");
    }

    public final int hashCode() {
        int hashCode = this.A00.hashCode() * 31;
        Integer num = this.A02;
        return ((hashCode + C5SF.A01(num).hashCode() + num.intValue()) * 31) + this.A01;
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append("FeedSponsoredPoolItem(sponsoredFeedItem=");
        sb.append(this.A00);
        sb.append(", deliverySource=");
        Integer num = this.A02;
        if (num != null) {
            str = C5SF.A01(num);
        } else {
            str = "null";
        }
        sb.append(str);
        sb.append(", requestPosition=");
        sb.append(this.A01);
        sb.append(')');
        return sb.toString();
    }

    public C5IF(C82373m0 c82373m0, Integer num, int i) {
        this.A00 = c82373m0;
        this.A02 = num;
        this.A01 = i;
    }
}
