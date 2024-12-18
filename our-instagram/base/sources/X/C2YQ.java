package X;

import com.facebook.common.dextricks.StringTreeSet;

/* renamed from: X.2YQ, reason: invalid class name */
/* loaded from: classes.dex */
public final class C2YQ extends C2WC {
    public final boolean A00;
    public final /* synthetic */ C2YP A01;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C2YQ(X.C2YP r2, java.lang.Integer r3, java.util.List r4, boolean r5) {
        /*
            r1 = this;
            r1.A01 = r2
            r0 = 1
            X.C14360o3.A0B(r3, r0)
            r0 = 2
            X.C14360o3.A0B(r4, r0)
            X.0sl r0 = X.C16930sl.A00
            r1.<init>(r3, r4, r0, r0)
            r1.A00 = r5
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2YQ.<init>(X.2YP, java.lang.Integer, java.util.List, boolean):void");
    }

    @Override // X.C2WC
    public final String A04() {
        String obj;
        C2YP c2yp = this.A01;
        InterfaceC16820sZ interfaceC16820sZ = c2yp.A03;
        if (interfaceC16820sZ == null || (obj = (String) interfaceC16820sZ.invoke()) == null) {
            Object BeR = c2yp.A01.BeR();
            C14360o3.A0B(BeR, 0);
            StringBuilder sb = new StringBuilder();
            sb.append("poolKey:");
            sb.append(BeR);
            obj = sb.toString();
        }
        return C00Q.A03(obj, StringTreeSet.MAX_SYMBOL_COUNT);
    }

    @Override // X.C2WC
    public final boolean A0E() {
        return this.A00;
    }

    @Override // X.C2WC
    public final long A0H() {
        return this.A01.A00;
    }

    @Override // X.C2WC
    public final InterfaceC50822Vd A0I() {
        return this.A01.A01;
    }
}
