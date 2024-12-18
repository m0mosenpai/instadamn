package X;

import java.util.HashMap;

/* renamed from: X.7tF, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C176577tF {
    public final int A00;
    public final int A01;
    public final InterfaceC175497rP A02;
    public final HashMap A03;

    public C176577tF(InterfaceC175497rP interfaceC175497rP, HashMap hashMap, int i, int i2) {
        this.A01 = i2;
        this.A00 = i;
        this.A02 = interfaceC175497rP;
        this.A03 = hashMap;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C176577tF c176577tF = (C176577tF) obj;
        if (this.A01 == c176577tF.A01 && this.A00 == c176577tF.A00 && this.A02 == c176577tF.A02) {
            HashMap hashMap = this.A03;
            HashMap hashMap2 = c176577tF.A03;
            if (hashMap == null) {
                if (hashMap2 == null) {
                    return true;
                }
            } else if (hashMap.equals(hashMap2)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.A01 * 31) + this.A00;
    }
}
