package X;

import java.util.List;

/* renamed from: X.ACd, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C23004ACd {
    public final EnumC173547o6 A00;
    public final List A01;
    public final EnumC173517o3 A02;

    public C23004ACd(EnumC173517o3 enumC173517o3, EnumC173547o6 enumC173547o6, List list) {
        C14360o3.A0B(enumC173517o3, 1);
        this.A02 = enumC173517o3;
        this.A00 = enumC173547o6;
        this.A01 = list;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C23004ACd) {
                C23004ACd c23004ACd = (C23004ACd) obj;
                if (this.A02 != c23004ACd.A02 || this.A00 != c23004ACd.A00 || !C14360o3.A0K(this.A01, c23004ACd.A01)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AbstractC166987dD.A0I(this.A01, AbstractC166997dE.A0J(this.A00, AbstractC166987dD.A0G(this.A02)));
    }

    public final String toString() {
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("FeatureValidationResult(featureId=");
        A1C.append(this.A02);
        A1C.append(", behavior=");
        A1C.append(this.A00);
        A1C.append(", failedRules=");
        return AbstractC167017dG.A0o(this.A01, A1C);
    }
}
