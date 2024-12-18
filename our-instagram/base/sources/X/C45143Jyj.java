package X;

import com.instagram.api.schemas.HzwPageInfoImpl;
import java.util.List;

/* renamed from: X.Jyj, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45143Jyj extends C0T6 implements InterfaceC50498MRb {
    public final HzwPageInfoImpl A00;
    public final List A01;
    public final C111034zF A02;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C45143Jyj) {
                C45143Jyj c45143Jyj = (C45143Jyj) obj;
                if (!C14360o3.A0K(this.A02, c45143Jyj.A02) || !C14360o3.A0K(this.A01, c45143Jyj.A01) || !C14360o3.A0K(this.A00, c45143Jyj.A00)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (((AbstractC167017dG.A0M(this.A02) * 31) + AbstractC167017dG.A0M(this.A01)) * 31) + AbstractC166997dE.A0I(this.A00);
    }

    public C45143Jyj(C111034zF c111034zF, HzwPageInfoImpl hzwPageInfoImpl, List list) {
        this.A02 = c111034zF;
        this.A01 = list;
        this.A00 = hzwPageInfoImpl;
    }
}
