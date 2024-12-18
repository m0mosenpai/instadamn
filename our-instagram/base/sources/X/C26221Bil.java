package X;

/* renamed from: X.Bil, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26221Bil extends C0T6 implements InterfaceC30996Djv {
    public final int A00;
    public final int A01;

    public C26221Bil(int i, int i2) {
        this.A00 = i2;
        this.A01 = i;
    }

    public static boolean A00(Object obj, int i) {
        if ((obj instanceof C26221Bil) && ((C26221Bil) obj).A00 == i) {
            return true;
        }
        return false;
    }

    @Override // X.InterfaceC30996Djv
    public final String BKd() {
        switch (this.A00) {
            case 0:
                return "item_key_spam_request_entrypoint";
            case 1:
                return "item_key_spam_request_header_button";
            default:
                return "item_key_spam_request_subheader";
        }
    }

    public final boolean equals(Object obj) {
        int i;
        switch (this.A00) {
            case 0:
                if (this != obj) {
                    i = 0;
                    break;
                } else {
                    return true;
                }
            case 1:
                if (this != obj) {
                    i = 1;
                    break;
                } else {
                    return true;
                }
            default:
                if (this != obj) {
                    i = 2;
                    break;
                } else {
                    return true;
                }
        }
        if (!A00(obj, i) || this.A01 != ((C26221Bil) obj).A01) {
            return false;
        }
        return true;
    }

    @Override // X.InterfaceC30996Djv
    public final String getContentType() {
        switch (this.A00) {
            case 0:
                return "content_type_spam_request_entrypoint";
            case 1:
                return "content_type_spam_request_header_button";
            default:
                return "content_type_spam_request_subheader";
        }
    }

    public final int hashCode() {
        return this.A01;
    }
}
