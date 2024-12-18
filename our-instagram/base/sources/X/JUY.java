package X;

/* loaded from: classes8.dex */
public final class JUY extends C4F4 {
    public final int A00;
    public final long A01;
    public final String A02;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof JUY) {
                JUY juy = (JUY) obj;
                if (!C14360o3.A0K(this.A02, juy.A02) || this.A01 != juy.A01 || this.A00 != juy.A00) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AbstractC25236BEt.A01(this.A01, AbstractC167017dG.A0O(this.A02) * 31) + this.A00;
    }

    public JUY(int i, String str, long j) {
        this.A02 = str;
        this.A01 = j;
        this.A00 = i;
    }

    @Override // X.InterfaceC66492zQ
    public final /* bridge */ /* synthetic */ boolean isContentSame(Object obj) {
        return equals(obj);
    }
}
