package X;

import java.util.List;

/* loaded from: classes11.dex */
public final class U5X {
    public final int A00;
    public final String A01;
    public final List A02;

    public U5X(List list, int i, String str) {
        C14360o3.A0B(str, 1);
        this.A01 = str;
        this.A00 = i;
        this.A02 = list;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof U5X) {
                U5X u5x = (U5X) obj;
                if (!C14360o3.A0K(this.A01, u5x.A01) || this.A00 != u5x.A00 || !C14360o3.A0K(this.A02, u5x.A02)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (((this.A01.hashCode() * 31) + this.A00) * 31) + this.A02.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("AsyncComponentContainerTargetInfo(serverId=");
        sb.append(this.A01);
        sb.append(", clientId=");
        sb.append(this.A00);
        sb.append(", keyPath=");
        return AbstractC167017dG.A0o(this.A02, sb);
    }
}
