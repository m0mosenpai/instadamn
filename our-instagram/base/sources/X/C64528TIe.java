package X;

/* renamed from: X.TIe, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C64528TIe implements Comparable {
    public int A00;
    public final float[] A01;

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        C64528TIe c64528TIe = (C64528TIe) obj;
        C14360o3.A0B(c64528TIe, 0);
        return this.A00 - c64528TIe.A00;
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof C64528TIe) && ((C64528TIe) obj).A00 == this.A00) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.A00;
    }

    public final String toString() {
        int i = this.A00;
        float[] fArr = this.A01;
        StringBuilder A0x = AbstractC43594JPz.A0x(fArr);
        A0x.append((CharSequence) "");
        int i2 = 0;
        int i3 = 0;
        do {
            float f = fArr[i2];
            i3++;
            if (i3 > 1) {
                A0x.append((CharSequence) " ");
            }
            A0x.append((CharSequence) String.valueOf(f));
            i2++;
        } while (i2 < 4);
        A0x.append((CharSequence) "");
        return AnonymousClass001.A0H(AbstractC166987dD.A19(A0x), '_', i);
    }

    public C64528TIe(int i, float[] fArr) {
        this.A00 = i;
        this.A01 = fArr;
    }
}
