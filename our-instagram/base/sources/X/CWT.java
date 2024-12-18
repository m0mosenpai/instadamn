package X;

/* loaded from: classes5.dex */
public abstract class CWT {
    public static final CWT A00 = new BZP(new C28271CdG(null, null, null, null, AbstractC06930Yk.A0E(), false));
    public static final CWT A01 = new BZP(new C28271CdG(null, null, null, null, AbstractC06930Yk.A0E(), true));

    public final int hashCode() {
        return ((BZP) this).A00.hashCode();
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x003c, code lost:
    
        if (((X.BZP) r9).A00.A05 != false) goto L18;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.BZP A00(X.CWT r10) {
        /*
            r9 = this;
            X.BZP r10 = (X.BZP) r10
            X.CdG r2 = r10.A00
            X.CVC r4 = r2.A01
            if (r4 != 0) goto Lf
            r0 = r9
            X.BZP r0 = (X.BZP) r0
            X.CdG r0 = r0.A00
            X.CVC r4 = r0.A01
        Lf:
            X.CVD r6 = r2.A03
            if (r6 != 0) goto L1a
            r0 = r9
            X.BZP r0 = (X.BZP) r0
            X.CdG r0 = r0.A00
            X.CVD r6 = r0.A03
        L1a:
            X.CVs r3 = r2.A00
            if (r3 != 0) goto L25
            r0 = r9
            X.BZP r0 = (X.BZP) r0
            X.CdG r0 = r0.A00
            X.CVs r3 = r0.A00
        L25:
            X.CVd r5 = r2.A02
            if (r5 != 0) goto L30
            r0 = r9
            X.BZP r0 = (X.BZP) r0
            X.CdG r0 = r0.A00
            X.CVd r5 = r0.A02
        L30:
            boolean r0 = r2.A05
            if (r0 != 0) goto L3e
            r0 = r9
            X.BZP r0 = (X.BZP) r0
            X.CdG r0 = r0.A00
            boolean r0 = r0.A05
            r8 = 0
            if (r0 == 0) goto L3f
        L3e:
            r8 = 1
        L3f:
            r0 = r9
            X.BZP r0 = (X.BZP) r0
            X.CdG r0 = r0.A00
            java.util.Map r1 = r0.A04
            java.util.Map r0 = r2.A04
            java.util.LinkedHashMap r7 = X.AbstractC06930Yk.A04(r1, r0)
            X.CdG r2 = new X.CdG
            r2.<init>(r3, r4, r5, r6, r7, r8)
            X.BZP r0 = new X.BZP
            r0.<init>(r2)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.CWT.A00(X.CWT):X.BZP");
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof CWT) && C14360o3.A0K(((BZP) ((CWT) obj)).A00, ((BZP) this).A00)) {
            return true;
        }
        return false;
    }

    public final String toString() {
        String str;
        String str2;
        String str3;
        if (equals(A00)) {
            return "ExitTransition.None";
        }
        if (equals(A01)) {
            return "ExitTransition.KeepUntilTransitionsFinished";
        }
        C28271CdG c28271CdG = ((BZP) this).A00;
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("ExitTransition: \nFade - ");
        CVC cvc = c28271CdG.A01;
        String str4 = null;
        if (cvc != null) {
            str = cvc.toString();
        } else {
            str = null;
        }
        A1C.append(str);
        A1C.append(",\nSlide - ");
        CVD cvd = c28271CdG.A03;
        if (cvd != null) {
            str2 = cvd.toString();
        } else {
            str2 = null;
        }
        A1C.append(str2);
        A1C.append(",\nShrink - ");
        C27995CVs c27995CVs = c28271CdG.A00;
        if (c27995CVs != null) {
            str3 = c27995CVs.toString();
        } else {
            str3 = null;
        }
        A1C.append(str3);
        A1C.append(",\nScale - ");
        C27981CVd c27981CVd = c28271CdG.A02;
        if (c27981CVd != null) {
            str4 = c27981CVd.toString();
        }
        A1C.append(str4);
        A1C.append(",\nKeepUntilTransitionsFinished - ");
        A1C.append(c28271CdG.A05);
        return A1C.toString();
    }
}
