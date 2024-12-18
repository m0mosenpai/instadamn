package X;

import java.util.HashMap;
import java.util.List;

/* renamed from: X.5uZ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C130295uZ {
    public long A00;
    public String A01;
    public HashMap A02;
    public List A03;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C130295uZ) {
                C130295uZ c130295uZ = (C130295uZ) obj;
                if (!C14360o3.A0K(this.A01, c130295uZ.A01) || !C14360o3.A0K(this.A03, c130295uZ.A03) || !C14360o3.A0K(this.A02, c130295uZ.A02) || this.A00 != c130295uZ.A00) {
                }
            }
            return false;
        }
        return true;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("FxService(status=");
        sb.append(this.A01);
        sb.append(", identityMapping=");
        sb.append(this.A03);
        sb.append(", customData=");
        sb.append(this.A02);
        sb.append(", lastUpdateTimeMs=");
        sb.append(this.A00);
        sb.append(')');
        return sb.toString();
    }

    public C130295uZ() {
        C16930sl c16930sl = C16930sl.A00;
        HashMap hashMap = new HashMap();
        long currentTimeMillis = System.currentTimeMillis();
        C14360o3.A0B("", 1);
        C14360o3.A0B(hashMap, 3);
        this.A01 = "";
        this.A03 = c16930sl;
        this.A02 = hashMap;
        this.A00 = currentTimeMillis;
    }

    public final int hashCode() {
        int hashCode = ((((this.A01.hashCode() * 31) + this.A03.hashCode()) * 31) + this.A02.hashCode()) * 31;
        long j = this.A00;
        return hashCode + ((int) (j ^ (j >>> 32)));
    }
}
