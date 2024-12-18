package X;

import com.instagram.common.typedurl.ImageUrl;
import java.util.List;

/* renamed from: X.K2l, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45283K2l extends C0T6 implements MNQ {
    public final int A00 = 1;
    public final Object A01;
    public final Object A02;

    public C45283K2l(EnumC46179KcH enumC46179KcH) {
        this(AbstractC166987dD.A1J(enumC46179KcH), C16930sl.A00);
    }

    public static boolean A00(Object obj, int i) {
        if ((obj instanceof C45283K2l) && ((C45283K2l) obj).A00 == i) {
            return true;
        }
        return false;
    }

    public final boolean equals(Object obj) {
        if (this.A00 != 0) {
            if (this != obj) {
                if (A00(obj, 1)) {
                    C45283K2l c45283K2l = (C45283K2l) obj;
                    if (this.A01 != c45283K2l.A01 || this.A02 != c45283K2l.A02) {
                        return false;
                    }
                    return true;
                }
                return false;
            }
            return true;
        }
        if (this != obj) {
            if (!A00(obj, 0)) {
                return false;
            }
            C45283K2l c45283K2l2 = (C45283K2l) obj;
            if (!C14360o3.A0K(this.A01, c45283K2l2.A01) || !C14360o3.A0K(this.A02, c45283K2l2.A02)) {
                return false;
            }
            return true;
        }
        return true;
    }

    public final int hashCode() {
        return AbstractC166987dD.A0I(this.A02, AbstractC166987dD.A0G(this.A01));
    }

    public C45283K2l(List list, List list2) {
        this.A01 = list;
        this.A02 = list2;
    }

    public C45283K2l(ImageUrl imageUrl, EnumC46179KcH enumC46179KcH) {
        this(AbstractC166987dD.A1J(enumC46179KcH), AbstractC166987dD.A1J(imageUrl));
    }

    public C45283K2l(EnumC101664hb enumC101664hb, EnumC40111tc enumC40111tc) {
        C14360o3.A0B(enumC101664hb, 1);
        this.A01 = enumC101664hb;
        this.A02 = enumC40111tc;
    }

    public C45283K2l(List list) {
        this(list, C16930sl.A00);
    }
}
