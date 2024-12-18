package X;

/* renamed from: X.TIc, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C64526TIc implements Comparable {
    public final int A00;
    public final int A01;
    public final String A02;
    public final String A03;

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        C64526TIc c64526TIc = (C64526TIc) obj;
        C14360o3.A0B(c64526TIc, 0);
        int i = this.A00 - c64526TIc.A00;
        if (i == 0) {
            return this.A01 - c64526TIc.A01;
        }
        return i;
    }

    public C64526TIc(int i, int i2, String str, String str2) {
        this.A00 = i;
        this.A01 = i2;
        this.A02 = str;
        this.A03 = str2;
    }
}
