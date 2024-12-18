package X;

/* renamed from: X.4lj, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C103654lj extends AbstractC88103wI {
    public final C117275Sm A00;
    public final String A01;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C103654lj(X.C117275Sm r2, java.lang.String r3) {
        /*
            r1 = this;
            r0 = 1
            X.C14360o3.A0B(r3, r0)
            java.lang.String r0 = r2.A02
            X.C14360o3.A06(r0)
            r1.<init>(r0)
            r1.A01 = r3
            r1.A00 = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C103654lj.<init>(X.5Sm, java.lang.String):void");
    }

    @Override // X.AbstractC88103wI
    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("video(");
        sb.append(this.A01);
        sb.append(") had a playback error: ");
        C117275Sm c117275Sm = this.A00;
        sb.append(c117275Sm.A01);
        sb.append(':');
        sb.append(c117275Sm.A00);
        sb.append(':');
        sb.append(c117275Sm.A02);
        sb.append(':');
        sb.append(c117275Sm.A03);
        sb.append(' ');
        return sb.toString();
    }
}
