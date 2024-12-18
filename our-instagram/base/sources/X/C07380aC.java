package X;

import java.util.ArrayList;

/* renamed from: X.0aC, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C07380aC {
    public final int A00;
    public final int A01;
    public final ArrayList A02;
    public final InterfaceC09390do A03 = AbstractC09440dt.A01(new C0R0(this));
    public final InterfaceC09390do A04 = AbstractC09440dt.A01(new C05490Qy(this));

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C07380aC) {
                C07380aC c07380aC = (C07380aC) obj;
                if (this.A00 != c07380aC.A00 || this.A01 != c07380aC.A01 || !C14360o3.A0K(this.A02, c07380aC.A02)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int i = ((this.A00 * 31) + this.A01) * 31;
        ArrayList arrayList = this.A02;
        return i + (arrayList == null ? 0 : arrayList.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("CrashResilientEventSchema(markerId=");
        sb.append(this.A00);
        sb.append(", maxConcurrentEvents=");
        sb.append(this.A01);
        sb.append(", annotationFields=");
        sb.append(this.A02);
        sb.append(')');
        return sb.toString();
    }

    public C07380aC(ArrayList arrayList, int i, int i2) {
        this.A00 = i;
        this.A01 = i2;
        this.A02 = arrayList;
    }
}
