package X;

import java.lang.ref.WeakReference;

/* renamed from: X.RqS, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public abstract class AbstractC61603RqS {
    public final void A00() {
        WeakReference weakReference = ((Q5e) this).A00;
        if (weakReference.get() != null && ((C58772Q8e) weakReference.get()).A0I) {
            C58772Q8e c58772Q8e = (C58772Q8e) weakReference.get();
            C2GS c2gs = c58772Q8e.A0D;
            if (c2gs == null) {
                c2gs = AbstractC58318PtA.A0J();
                c58772Q8e.A0D = c2gs;
            }
            C58772Q8e.A00(c2gs, true);
        }
    }

    public final void A01(int i, CharSequence charSequence) {
        WeakReference weakReference = ((Q5e) this).A00;
        if (weakReference.get() != null && !((C58772Q8e) weakReference.get()).A0J && ((C58772Q8e) weakReference.get()).A0I) {
            C58772Q8e c58772Q8e = (C58772Q8e) weakReference.get();
            SNT snt = new SNT(i, charSequence);
            C2GS c2gs = c58772Q8e.A08;
            if (c2gs == null) {
                c2gs = AbstractC58318PtA.A0J();
                c58772Q8e.A08 = c2gs;
            }
            C58772Q8e.A00(c2gs, snt);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x002f, code lost:
    
        if ((r1 & com.facebook.common.dextricks.Constants.LOAD_RESULT_PGO) != 0) goto L12;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A02(X.C62468SCv r5) {
        /*
            r4 = this;
            r0 = r4
            X.Q5e r0 = (X.Q5e) r0
            java.lang.ref.WeakReference r3 = r0.A00
            java.lang.Object r0 = r3.get()
            if (r0 == 0) goto L4a
            java.lang.Object r0 = r3.get()
            X.Q8e r0 = (X.C58772Q8e) r0
            boolean r0 = r0.A0I
            if (r0 == 0) goto L4a
            int r1 = r5.A00
            r0 = -1
            if (r1 != r0) goto L37
            X.Sgr r2 = r5.A01
            java.lang.Object r0 = r3.get()
            X.Q8e r0 = (X.C58772Q8e) r0
            int r1 = r0.A01()
            r0 = r1 & 32767(0x7fff, float:4.5916E-41)
            if (r0 == 0) goto L31
            r0 = 32768(0x8000, float:4.5918E-41)
            r1 = r1 & r0
            r0 = 2
            if (r1 == 0) goto L32
        L31:
            r0 = -1
        L32:
            X.SCv r5 = new X.SCv
            r5.<init>(r2, r0)
        L37:
            java.lang.Object r1 = r3.get()
            X.Q8e r1 = (X.C58772Q8e) r1
            X.2GS r0 = r1.A0A
            if (r0 != 0) goto L47
            X.2GS r0 = X.AbstractC58318PtA.A0J()
            r1.A0A = r0
        L47:
            X.C58772Q8e.A00(r0, r5)
        L4a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC61603RqS.A02(X.SCv):void");
    }
}
