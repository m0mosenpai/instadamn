package X;

import java.util.List;

/* renamed from: X.JfP, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C44160JfP extends C0T6 {
    public final EnumC44170JfZ A00;
    public final List A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C44160JfP) {
                C44160JfP c44160JfP = (C44160JfP) obj;
                if (this.A00 != c44160JfP.A00 || !C14360o3.A0K(this.A01, c44160JfP.A01)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (this.A00.hashCode() * 31) + this.A01.hashCode();
    }

    public C44160JfP(EnumC44170JfZ enumC44170JfZ, List list) {
        this.A00 = enumC44170JfZ;
        this.A01 = list;
    }
}
