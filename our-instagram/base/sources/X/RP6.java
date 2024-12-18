package X;

import java.util.Map;

/* loaded from: classes10.dex */
public final class RP6 extends S7S {
    public final Integer A00;
    public final Map A01;

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof S7S) {
                Integer num = this.A00;
                RP6 rp6 = (RP6) ((S7S) obj);
                Integer num2 = rp6.A00;
                if (num != null ? num.equals(num2) : num2 == null) {
                    if (this.A01.equals(rp6.A01)) {
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return ((AbstractC167017dG.A0M(this.A00) ^ 1000003) * 1000003) ^ this.A01.hashCode();
    }

    public final String toString() {
        Integer num = this.A00;
        String valueOf = String.valueOf(this.A01);
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("LocalTestingConfig{defaultSplitInstallErrorCode=");
        A1C.append(num);
        A1C.append(", splitInstallErrorCodeByModule=");
        return AbstractC50523MSb.A0W(valueOf, A1C);
    }

    public /* synthetic */ RP6(Integer num, Map map) {
        this.A00 = num;
        this.A01 = map;
    }
}
