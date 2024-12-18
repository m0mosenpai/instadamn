package X;

/* renamed from: X.4so, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C107434so {
    public final C51272Xa A00;
    public final InterfaceC79483gv A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            C107434so c107434so = (C107434so) obj;
            if (!this.A00.equals(c107434so.A00) || !this.A01.equals(c107434so.A01)) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        return (this.A00.hashCode() * 31) + this.A01.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("PropertyHandle{ mTransitionId='");
        sb.append(this.A00);
        sb.append("', mProperty=");
        sb.append(this.A01);
        sb.append("}");
        return sb.toString();
    }

    public C107434so(C51272Xa c51272Xa, InterfaceC79483gv interfaceC79483gv) {
        this.A00 = c51272Xa;
        this.A01 = interfaceC79483gv;
    }
}
