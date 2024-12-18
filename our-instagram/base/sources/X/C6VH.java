package X;

/* renamed from: X.6VH, reason: invalid class name */
/* loaded from: classes3.dex */
public abstract class C6VH {
    public final boolean A00() {
        long j;
        boolean z = ((C6VG) this) instanceof C6VF;
        C0JK A01 = C0JK.A01();
        if (z) {
            j = 52428800;
        } else {
            j = 10485760;
        }
        C0JK.A03(A01);
        long A05 = A01.A05();
        boolean z2 = true;
        if (A05 > 0 && A05 >= j) {
            z2 = false;
        }
        return !z2;
    }
}
