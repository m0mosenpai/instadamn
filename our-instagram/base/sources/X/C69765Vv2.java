package X;

/* renamed from: X.Vv2, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C69765Vv2 {
    public final int A00;
    public final InterfaceC72013XFb A01;
    public final String A02;
    public final InterfaceC16820sZ A03;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C69765Vv2) {
                C69765Vv2 c69765Vv2 = (C69765Vv2) obj;
                if (this.A00 != c69765Vv2.A00 || !C14360o3.A0K(this.A03, c69765Vv2.A03) || !C14360o3.A0K(this.A01, c69765Vv2.A01) || !C14360o3.A0K(this.A02, c69765Vv2.A02)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AbstractC166997dE.A0J(this.A01, AbstractC166997dE.A0J(this.A03, this.A00 * 31)) + this.A02.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("TitleBarAction(iconType=");
        sb.append(this.A00);
        sb.append(", clickListener=");
        sb.append(this.A03);
        sb.append(MSV.A00(129));
        sb.append(this.A01);
        sb.append(", testKey=");
        return AbstractC25236BEt.A0Y(this.A02, sb);
    }

    public C69765Vv2(InterfaceC72013XFb interfaceC72013XFb, String str, InterfaceC16820sZ interfaceC16820sZ, int i) {
        this.A00 = i;
        this.A03 = interfaceC16820sZ;
        this.A01 = interfaceC72013XFb;
        this.A02 = str;
    }
}
