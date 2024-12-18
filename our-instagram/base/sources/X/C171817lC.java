package X;

/* renamed from: X.7lC, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C171817lC extends C0T6 implements InterfaceC171827lD {
    public final InterfaceC171837lE A00;
    public final String A01;

    public C171817lC(InterfaceC171837lE interfaceC171837lE, String str) {
        C14360o3.A0B(str, 2);
        this.A00 = interfaceC171837lE;
        this.A01 = str;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C171817lC) {
                C171817lC c171817lC = (C171817lC) obj;
                if (!C14360o3.A0K(this.A00, c171817lC.A00) || !C14360o3.A0K(this.A01, c171817lC.A01)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        InterfaceC171837lE interfaceC171837lE = this.A00;
        return ((interfaceC171837lE == null ? 0 : interfaceC171837lE.hashCode()) * 31) + this.A01.hashCode();
    }
}
