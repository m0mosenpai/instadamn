package X;

/* renamed from: X.Ap4, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C24237Ap4 implements Comparable {
    public final int A00;
    public final byte[] A01;

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        C24237Ap4 c24237Ap4 = (C24237Ap4) obj;
        C14360o3.A0B(c24237Ap4, 0);
        return this.A00 - c24237Ap4.A00;
    }

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof C24237Ap4) && this.A00 == ((C24237Ap4) obj).A00) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.A00;
    }

    public C24237Ap4(byte[] bArr, long j) {
        this.A01 = bArr;
        this.A00 = (int) j;
    }
}
