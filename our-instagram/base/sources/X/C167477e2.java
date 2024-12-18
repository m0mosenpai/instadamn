package X;

/* renamed from: X.7e2, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C167477e2 extends C0T6 implements InterfaceC166407c9 {
    public final int A00;
    public final String A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C167477e2) {
                C167477e2 c167477e2 = (C167477e2) obj;
                if (this.A00 != c167477e2.A00 || !C14360o3.A0K(this.A01, c167477e2.A01)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (this.A00 * 31) + this.A01.hashCode();
    }

    public C167477e2(int i, String str) {
        this.A00 = i;
        this.A01 = str;
    }
}
