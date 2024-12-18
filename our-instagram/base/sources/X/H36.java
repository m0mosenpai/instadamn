package X;

/* loaded from: classes7.dex */
public final class H36 extends C0T6 implements JIY {
    public final InterfaceC43478JIq A00;
    public final JIQ A01;
    public final InterfaceC43483JIv A02;
    public final Long A03;
    public final Long A04;
    public final String A05;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof H36) {
                H36 h36 = (H36) obj;
                if (!C14360o3.A0K(this.A05, h36.A05) || !C14360o3.A0K(this.A01, h36.A01) || !C14360o3.A0K(this.A03, h36.A03) || !C14360o3.A0K(this.A00, h36.A00) || !C14360o3.A0K(this.A02, h36.A02) || !C14360o3.A0K(this.A04, h36.A04)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (((((((((AbstractC167017dG.A0O(this.A05) * 31) + AbstractC167017dG.A0M(this.A01)) * 31) + AbstractC167017dG.A0M(this.A03)) * 31) + AbstractC167017dG.A0M(this.A00)) * 31) + AbstractC167017dG.A0M(this.A02)) * 31) + AbstractC166997dE.A0I(this.A04);
    }

    public H36(JIQ jiq, InterfaceC43478JIq interfaceC43478JIq, InterfaceC43483JIv interfaceC43483JIv, Long l, Long l2, String str) {
        this.A05 = str;
        this.A01 = jiq;
        this.A03 = l;
        this.A00 = interfaceC43478JIq;
        this.A02 = interfaceC43483JIv;
        this.A04 = l2;
    }
}
