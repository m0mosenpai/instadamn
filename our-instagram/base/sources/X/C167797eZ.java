package X;

import java.util.List;

/* renamed from: X.7eZ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C167797eZ extends C0T6 implements InterfaceC166387c7 {
    public final int A00;
    public final List A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C167797eZ) {
                C167797eZ c167797eZ = (C167797eZ) obj;
                if (this.A00 != c167797eZ.A00 || !C14360o3.A0K(this.A01, c167797eZ.A01)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (this.A00 * 31) + this.A01.hashCode();
    }

    public C167797eZ(int i, List list) {
        this.A00 = i;
        this.A01 = list;
    }
}
