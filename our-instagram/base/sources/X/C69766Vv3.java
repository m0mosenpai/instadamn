package X;

/* renamed from: X.Vv3, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C69766Vv3 {
    public final int A00;
    public final int A01;
    public final int A02;
    public final String A03;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C69766Vv3) {
                C69766Vv3 c69766Vv3 = (C69766Vv3) obj;
                if (this.A01 != c69766Vv3.A01 || !C14360o3.A0K(this.A03, c69766Vv3.A03) || this.A00 != c69766Vv3.A00 || this.A02 != c69766Vv3.A02) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return ((AbstractC166997dE.A0K(this.A03, this.A01 * 31) + this.A00) * 31) + this.A02;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("BSCHomeTab(tabTitleRes=");
        sb.append(this.A01);
        sb.append(", fragmentId=");
        sb.append(this.A03);
        sb.append(", tabHintRes=");
        sb.append(this.A00);
        sb.append(", viewModelId=");
        return AbstractC25236BEt.A0Z(sb, this.A02);
    }

    public C69766Vv3(int i, String str, int i2, int i3) {
        this.A01 = i;
        this.A03 = str;
        this.A00 = i2;
        this.A02 = i3;
    }
}
