package X;

import java.util.Collection;

/* renamed from: X.4hA, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C101484hA extends C0T6 {
    public final Collection A00;
    public final Collection A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C101484hA) {
                C101484hA c101484hA = (C101484hA) obj;
                if (!C14360o3.A0K(this.A01, c101484hA.A01) || !C14360o3.A0K(this.A00, c101484hA.A00)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (this.A01.hashCode() * 31) + this.A00.hashCode();
    }

    public C101484hA(Collection collection, Collection collection2) {
        this.A01 = collection;
        this.A00 = collection2;
    }
}
