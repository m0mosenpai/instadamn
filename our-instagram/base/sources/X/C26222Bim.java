package X;

/* renamed from: X.Bim, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26222Bim extends C0T6 implements InterfaceC30996Djv {
    public final int A00;
    public final Object A01;
    public final String A02;

    public C26222Bim(C26020Bf9 c26020Bf9) {
        this.A00 = 3;
        this.A01 = c26020Bf9;
        this.A02 = AbstractC13670mt.A06("item_key_suggested_user_%s", c26020Bf9.A01.CDj().getId());
    }

    public static boolean A00(Object obj, int i) {
        if ((obj instanceof C26222Bim) && ((C26222Bim) obj).A00 == i) {
            return true;
        }
        return false;
    }

    @Override // X.InterfaceC30996Djv
    public final String BKd() {
        switch (this.A00) {
            case 1:
                return "item_key_follow_requests_view_all_cta";
            case 2:
                return "item_key_megaphone";
            default:
                return this.A02;
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
            case 2:
                if (this != obj) {
                    i = 2;
                    break;
                } else {
                    return true;
                }
            default:
                if (this != obj) {
                    i = 3;
                    break;
                } else {
                    return true;
                }
        }
        if (!A00(obj, i) || !C14360o3.A0K(this.A01, ((C26222Bim) obj).A01)) {
            return false;
        }
        return true;
    }

    @Override // X.InterfaceC30996Djv
    public final String getContentType() {
        switch (this.A00) {
            case 0:
                return "content_type_follow_request";
            case 1:
                return "content_type_follow_requests_view_all_cta";
            case 2:
                return "content_type_megaphone";
            default:
                return "content_type_suggested_user";
        }
    }

    public final int hashCode() {
        Object obj;
        if (1 - this.A00 != 0) {
            obj = this.A01;
        } else {
            obj = this.A01;
            if (obj == null) {
                return 0;
            }
        }
        return obj.hashCode();
    }

    public C26222Bim(C26023BfC c26023BfC) {
        this.A00 = 0;
        this.A01 = c26023BfC;
        this.A02 = AbstractC13670mt.A06("item_key_follow_request_%s", c26023BfC.A01.getId());
    }

    public C26222Bim(C4NJ c4nj) {
        this.A00 = 2;
        this.A01 = c4nj;
        this.A02 = "item_key_megaphone";
    }

    public C26222Bim(Integer num) {
        this.A00 = 1;
        this.A01 = num;
        this.A02 = "item_key_follow_requests_view_all_cta";
    }
}
