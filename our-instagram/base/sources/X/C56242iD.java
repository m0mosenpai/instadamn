package X;

/* renamed from: X.2iD, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C56242iD {
    public C56212iA A00;
    public C56152i4 A01;
    public final /* synthetic */ C56212iA A02;

    public C56242iD(C56212iA c56212iA, C56212iA c56212iA2) {
        this.A02 = c56212iA;
        this.A00 = c56212iA2;
    }

    public final String toString() {
        String str = "[ ";
        if (this.A01 != null) {
            int i = 0;
            do {
                str = AnonymousClass001.A0Z(str, " ", this.A01.A09[i]);
                i++;
            } while (i < 9);
        }
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append("] ");
        sb.append(this.A01);
        return sb.toString();
    }
}
