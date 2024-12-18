package X;

/* renamed from: X.Bij, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26219Bij extends C0T6 implements InterfaceC30996Djv {
    public final boolean A00;

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof C26219Bij) && this.A00 == ((C26219Bij) obj).A00);
    }

    public final int hashCode() {
        if (!this.A00) {
            return 1237;
        }
        return 1231;
    }

    public C26219Bij(boolean z) {
        this.A00 = z;
    }

    @Override // X.InterfaceC30996Djv
    public final String BKd() {
        return "item_key_spam_request_header";
    }

    @Override // X.InterfaceC30996Djv
    public final String getContentType() {
        return "content_type_spam_request_header";
    }
}
