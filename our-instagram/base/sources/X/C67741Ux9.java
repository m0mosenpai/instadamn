package X;

/* renamed from: X.Ux9, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C67741Ux9 extends C126715oB implements Comparable {
    public long A00;

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        C67741Ux9 c67741Ux9 = (C67741Ux9) obj;
        boolean z = false;
        if ((((AbstractC96104Tt) this).A00 & 4) == 4) {
            z = true;
        }
        boolean z2 = false;
        if ((((AbstractC96104Tt) c67741Ux9).A00 & 4) == 4) {
            z2 = true;
        }
        if (z != z2) {
            if (z) {
                return 1;
            }
            return -1;
        }
        long j = this.A01 - c67741Ux9.A01;
        if (j == 0) {
            j = this.A00 - c67741Ux9.A00;
            if (j == 0) {
                return 0;
            }
        }
        if (j > 0) {
            return 1;
        }
        return -1;
    }
}
