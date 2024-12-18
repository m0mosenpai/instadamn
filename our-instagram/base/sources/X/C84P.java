package X;

import java.util.LinkedHashMap;

/* renamed from: X.84P, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C84P extends C0T6 {
    public final LinkedHashMap A00;
    public final LinkedHashMap A01;
    public final InterfaceC09390do A02 = AbstractC09440dt.A01(new C9ES(this, 31));
    public final InterfaceC09390do A03 = AbstractC09440dt.A01(new C9ES(this, 32));

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C84P) {
                C84P c84p = (C84P) obj;
                if (!C14360o3.A0K(this.A00, c84p.A00) || !C14360o3.A0K(this.A01, c84p.A01)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (this.A00.hashCode() * 31) + this.A01.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("BleepData(segmentBleepData=");
        sb.append(this.A00);
        sb.append(", voiceOverBleepData=");
        sb.append(this.A01);
        sb.append(')');
        return sb.toString();
    }

    public C84P(LinkedHashMap linkedHashMap, LinkedHashMap linkedHashMap2) {
        this.A00 = linkedHashMap;
        this.A01 = linkedHashMap2;
    }
}
