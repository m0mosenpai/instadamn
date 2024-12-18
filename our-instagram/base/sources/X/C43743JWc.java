package X;

import android.os.SystemClock;

/* renamed from: X.JWc, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C43743JWc implements InterfaceC55932he {
    public static final C55942hf A03 = C55942hf.A04(4.0d, 4.0d);
    public static final C55942hf A04 = C55942hf.A04(4.0d, 4.0d);
    public C44360Jiz A00;
    public C43742JWb A01;
    public final C55982hj A02;

    @Override // X.InterfaceC55932he
    public final void Dnj(C55982hj c55982hj) {
    }

    @Override // X.InterfaceC55932he
    public final void Dnk(C55982hj c55982hj) {
        C14360o3.A0B(c55982hj, 0);
        if (C14360o3.A0K(c55982hj.A05, A03) && c55982hj.A09.A00 == 1.0d) {
            C44360Jiz c44360Jiz = this.A00;
            if (c44360Jiz == null) {
                C14360o3.A0F("gifDrawable");
                throw C00O.createAndThrow();
            }
            c44360Jiz.A03 = new C50157MDk(this, 39);
            if (c44360Jiz.A04) {
                c44360Jiz.A04 = false;
                c44360Jiz.A02 = SystemClock.uptimeMillis() - c44360Jiz.A00;
                c44360Jiz.invalidateSelf();
            }
        }
    }

    @Override // X.InterfaceC55932he
    public final void Dnl(C55982hj c55982hj) {
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0024, code lost:
    
        if (r6.A0E(0.0d) == false) goto L10;
     */
    @Override // X.InterfaceC55932he
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void Dnm(X.C55982hj r6) {
        /*
            r5 = this;
            r0 = 0
            X.C14360o3.A0B(r6, r0)
            X.JWb r4 = r5.A01
            if (r4 == 0) goto L3e
            X.2hk r0 = r6.A09
            double r0 = r0.A00
            float r3 = (float) r0
            X.2hf r1 = r6.A05
            X.2hf r0 = X.C43743JWc.A04
            boolean r0 = X.C14360o3.A0K(r1, r0)
            if (r0 == 0) goto L26
            boolean r0 = r6.A0C()
            if (r0 == 0) goto L26
            r0 = 0
            boolean r0 = r6.A0E(r0)
            r2 = 1
            if (r0 != 0) goto L27
        L26:
            r2 = 0
        L27:
            X.2XI r0 = r4.A01
            java.lang.Float r1 = java.lang.Float.valueOf(r3)
            r0.A00(r1)
            X.2XI r0 = r4.A02
            r0.A00(r1)
            if (r2 == 0) goto L3e
            X.MPP r0 = r4.A00
            if (r0 == 0) goto L3e
            r0.CwX()
        L3e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C43743JWc.Dnm(X.2hj):void");
    }

    public C43743JWc() {
        C55982hj A0R = AbstractC167007dF.A0R();
        A0R.A0A(this);
        this.A02 = A0R;
    }
}
