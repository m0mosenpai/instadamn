package X;

/* renamed from: X.Bik, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26220Bik extends C0T6 implements InterfaceC30996Djv {
    public final int A00;
    public final int A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C26220Bik) {
                C26220Bik c26220Bik = (C26220Bik) obj;
                if (this.A01 != c26220Bik.A01 || this.A00 != c26220Bik.A00) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (this.A01 * 31) + this.A00;
    }

    public C26220Bik(int i, int i2) {
        this.A01 = i;
        this.A00 = i2;
    }

    @Override // X.InterfaceC30996Djv
    public final String BKd() {
        return "item_key_follow_requests_empty";
    }

    @Override // X.InterfaceC30996Djv
    public final String getContentType() {
        return "content_type_follow_requests_empty";
    }
}
