package X;

import com.google.gson.annotations.SerializedName;
import java.util.List;

/* renamed from: X.SOe, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C62738SOe {

    @SerializedName("num_required_groups")
    public final int A00;

    @SerializedName("auth_factors_groups")
    public final List<SP0> A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C62738SOe) {
                C62738SOe c62738SOe = (C62738SOe) obj;
                if (!C14360o3.A0K(this.A01, c62738SOe.A01) || this.A00 != c62738SOe.A00) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AbstractC166987dD.A0G(this.A01) + this.A00;
    }

    public C62738SOe(List list, int i) {
        this.A01 = list;
        this.A00 = i;
    }

    public final String toString() {
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("AuthFactorRequirement(authFactorsGroups=");
        A1C.append(this.A01);
        A1C.append(", numRequiredGroups=");
        return AbstractC25236BEt.A0Z(A1C, this.A00);
    }
}
