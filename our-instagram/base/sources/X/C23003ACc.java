package X;

import java.util.List;

/* renamed from: X.ACc, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C23003ACc {
    public final EnumC173517o3 A00;
    public final List A01;
    public final List A02;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C23003ACc) {
                C23003ACc c23003ACc = (C23003ACc) obj;
                if (this.A00 != c23003ACc.A00 || !C14360o3.A0K(this.A02, c23003ACc.A02) || !C14360o3.A0K(this.A01, c23003ACc.A01)) {
                }
            }
            return false;
        }
        return true;
    }

    public /* synthetic */ C23003ACc(EnumC173517o3 enumC173517o3) {
        C16930sl c16930sl = C16930sl.A00;
        C14360o3.A0B(c16930sl, 2);
        this.A00 = enumC173517o3;
        this.A02 = c16930sl;
        this.A01 = c16930sl;
    }

    public final int hashCode() {
        return AbstractC166987dD.A0I(this.A01, AbstractC166997dE.A0J(this.A02, AbstractC166987dD.A0G(this.A00)));
    }

    public final String toString() {
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("FeatureValidationParam(featureId=");
        A1C.append(this.A00);
        A1C.append(", sourceRuleValidationParams=");
        A1C.append(this.A02);
        A1C.append(", destinationRuleValidationParams=");
        return AbstractC167017dG.A0o(this.A01, A1C);
    }
}
