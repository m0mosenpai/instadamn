package X;

/* renamed from: X.UPn, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C66625UPn extends C0T6 {
    public float A00;
    public float A01;
    public float A02;
    public final int A03;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C66625UPn(int r3) {
        /*
            r2 = this;
            r2.A03 = r3
            r1 = 0
            if (r3 == 0) goto La
            r0 = 1
        L6:
            r2.<init>(r1, r1, r1, r0)
            return
        La:
            r0 = 0
            goto L6
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C66625UPn.<init>(int):void");
    }

    public final boolean equals(Object obj) {
        int i;
        if (this.A03 != 0) {
            if (this != obj) {
                i = 1;
            } else {
                return true;
            }
        } else if (this != obj) {
            i = 0;
        } else {
            return true;
        }
        if (obj instanceof C66625UPn) {
            C66625UPn c66625UPn = (C66625UPn) obj;
            if (c66625UPn.A03 != i || Float.compare(this.A01, c66625UPn.A01) != 0 || Float.compare(this.A02, c66625UPn.A02) != 0 || Float.compare(this.A00, c66625UPn.A00) != 0) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return AbstractC166997dE.A00(Float.floatToIntBits(this.A01) * 31, this.A02) + Float.floatToIntBits(this.A00);
    }

    public C66625UPn(float f, float f2, float f3, int i) {
        this.A03 = i;
        this.A01 = f;
        this.A02 = f2;
        this.A00 = f3;
    }
}
