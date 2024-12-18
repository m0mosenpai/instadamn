package X;

/* renamed from: X.Eeo, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32957Eeo extends AbstractC33588Et0 {
    public String A00;
    public String A01;
    public String A02;

    public final int hashCode() {
        int i = 0;
        int A04 = ((AbstractC31177DnL.A04(this.A02) * 31) + AbstractC31177DnL.A04(this.A01)) * 31;
        String str = this.A00;
        if (str != null) {
            i = str.hashCode();
        }
        return A04 + i;
    }
}
