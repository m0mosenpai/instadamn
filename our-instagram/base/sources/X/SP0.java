package X;

import com.google.gson.annotations.SerializedName;
import java.util.List;

/* loaded from: classes10.dex */
public final class SP0 {

    @SerializedName("factors")
    public final List<SPN> A00;

    @SerializedName("num_required_factors")
    public final int A01;

    @SerializedName("allow_user_select")
    public final boolean A02;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof SP0) {
                SP0 sp0 = (SP0) obj;
                if (!C14360o3.A0K(this.A00, sp0.A00) || this.A02 != sp0.A02 || this.A01 != sp0.A01) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AbstractC167007dF.A0D(this.A02, AbstractC166987dD.A0G(this.A00)) + this.A01;
    }

    public SP0(int i, boolean z, List list) {
        this.A00 = list;
        this.A02 = z;
        this.A01 = i;
    }

    public final String toString() {
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("AuthFactorGroup(authFactors=");
        A1C.append(this.A00);
        A1C.append(", allowUserSelect=");
        A1C.append(this.A02);
        A1C.append(", numRequiredFactors=");
        return AbstractC25236BEt.A0Z(A1C, this.A01);
    }
}
