package X;

import com.instagram.model.mediatype.ProductType;

/* renamed from: X.Bho, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26163Bho extends C0T6 implements InterfaceC30799Dga {
    public final int A00 = 0;
    public final Object A01;

    public C26163Bho(Integer num) {
        C14360o3.A0B(num, 1);
        this.A01 = num;
    }

    public static boolean A00(Object obj, int i) {
        if ((obj instanceof C26163Bho) && ((C26163Bho) obj).A00 == i) {
            return true;
        }
        return false;
    }

    public final boolean equals(Object obj) {
        int i;
        if (this.A00 != 0) {
            if (this != obj) {
                i = 1;
            } else {
                return true;
            }
        } else if (this != obj) {
            i = 0;
        } else {
            return true;
        }
        if (!A00(obj, i) || this.A01 != ((C26163Bho) obj).A01) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        String str;
        if (this.A00 != 0) {
            int A0H = AbstractC166987dD.A0H(this.A01);
            if (1 != A0H) {
                str = "MESSAGE_ALLOWED";
            } else {
                str = "UNSUPPORTED_COMMENT_TYPE";
            }
            return AbstractC25226BEj.A02(str, A0H);
        }
        return this.A01.hashCode();
    }

    public C26163Bho(ProductType productType) {
        this.A01 = productType;
    }
}
