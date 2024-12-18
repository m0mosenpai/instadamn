package X;

/* loaded from: classes8.dex */
public final class L7F {
    public String A00;
    public String A01;
    public String A02;

    public final int hashCode() {
        int i = 0;
        int A04 = ((AbstractC31177DnL.A04(this.A00) * 31) + AbstractC31177DnL.A04(this.A01)) * 31;
        String str = this.A02;
        if (str != null) {
            i = str.hashCode();
        }
        return A04 + i;
    }
}
