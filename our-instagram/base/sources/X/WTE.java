package X;

import android.graphics.Rect;

/* loaded from: classes11.dex */
public final class WTE implements C4PZ {
    public final W4D A00;
    public final W4E A01;
    public final C52872bT A02;

    public final boolean equals(Object obj) {
        Class<?> cls;
        if (this != obj) {
            Class<?> cls2 = getClass();
            if (obj != null) {
                cls = obj.getClass();
            } else {
                cls = null;
            }
            if (C14360o3.A0K(cls2, cls)) {
                C14360o3.A0C(obj, "null cannot be cast to non-null type androidx.window.layout.HardwareFoldingFeature");
                WTE wte = (WTE) obj;
                if (!C14360o3.A0K(this.A02, wte.A02) || !C14360o3.A0K(this.A01, wte.A01) || !C14360o3.A0K(this.A00, wte.A00)) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // X.InterfaceC94944Pa
    public final Rect Ahk() {
        C52872bT c52872bT = this.A02;
        return new Rect(c52872bT.A01, c52872bT.A03, c52872bT.A02, c52872bT.A00);
    }

    @Override // X.C4PZ
    public final C23099AGl BZe() {
        C52872bT c52872bT = this.A02;
        if (c52872bT.A02 - c52872bT.A01 > c52872bT.A00 - c52872bT.A03) {
            return C23099AGl.A01;
        }
        return C23099AGl.A02;
    }

    public final int hashCode() {
        return AbstractC166997dE.A0J(this.A01, this.A02.hashCode() * 31) + this.A00.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("HardwareFoldingFeature");
        sb.append(" { ");
        sb.append(this.A02);
        sb.append(", type=");
        sb.append(this.A01);
        sb.append(MSV.A00(134));
        sb.append(this.A00);
        return AbstractC166997dE.A0x(" }", sb);
    }

    public WTE(C52872bT c52872bT, W4D w4d, W4E w4e) {
        AbstractC167017dG.A1R(w4e, w4d);
        this.A02 = c52872bT;
        this.A01 = w4e;
        this.A00 = w4d;
        int i = c52872bT.A02;
        int i2 = c52872bT.A01;
        if (i - i2 == 0 && c52872bT.A00 - c52872bT.A03 == 0) {
            throw new IllegalArgumentException("Bounds must be non zero");
        }
        if (i2 != 0 && c52872bT.A03 != 0) {
            throw new IllegalArgumentException("Bounding rectangle must start at the top or left window edge for folding features");
        }
    }
}
