package X;

import android.graphics.Bitmap;

/* renamed from: X.6If, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C137026If extends C2DC {
    public int A00;
    public float A01;
    public C5YV A02;
    public final InterfaceC137546La A03;
    public final long A04;
    public final long A05;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public /* synthetic */ C137026If(X.InterfaceC137546La r3) {
        /*
            r2 = this;
            r0 = r3
            X.6LZ r0 = (X.C6LZ) r0
            android.graphics.Bitmap r0 = r0.A00
            int r1 = r0.getWidth()
            int r0 = r0.getHeight()
            long r0 = X.AbstractC119215ad.A00(r1, r0)
            r2.<init>(r3, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C137026If.<init>(X.6La):void");
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C137026If) {
                C137026If c137026If = (C137026If) obj;
                if (!C14360o3.A0K(this.A03, c137026If.A03) || this.A05 != c137026If.A05 || this.A00 != c137026If.A00) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // X.C2DC
    public final long A03() {
        return AbstractC119215ad.A01(this.A04);
    }

    @Override // X.C2DC
    public final void A04(InterfaceC1128857w interfaceC1128857w) {
        InterfaceC137546La interfaceC137546La = this.A03;
        long j = this.A05;
        long Bxc = interfaceC1128857w.Bxc();
        long A00 = AbstractC119215ad.A00(Math.round(C5YC.A02(Bxc)), Math.round(C5YC.A00(Bxc)));
        float f = this.A01;
        interfaceC1128857w.AQk(this.A02, interfaceC137546La, C119815bf.A00, f, 3, this.A00, 0L, j, 0L, A00);
    }

    @Override // X.C2DC
    public final boolean A05(float f) {
        this.A01 = f;
        return true;
    }

    @Override // X.C2DC
    public final boolean A06(C5YV c5yv) {
        this.A02 = c5yv;
        return true;
    }

    public final int hashCode() {
        int hashCode = ((this.A03.hashCode() * 31) + ((int) (0 >>> 32))) * 31;
        long j = this.A05;
        return ((hashCode + ((int) (j ^ (j >>> 32)))) * 31) + this.A00;
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append("BitmapPainter(image=");
        sb.append(this.A03);
        sb.append(", srcOffset=");
        StringBuilder sb2 = new StringBuilder();
        sb2.append('(');
        sb2.append((int) (0 >> 32));
        sb2.append(", ");
        sb2.append(0);
        sb2.append(')');
        sb.append((Object) sb2.toString());
        sb.append(", srcSize=");
        long j = this.A05;
        sb.append((Object) AnonymousClass001.A0P(" x ", (int) (j >> 32), C119055aN.A00(j)));
        sb.append(", filterQuality=");
        if (this.A00 == 0) {
            str = "None";
        } else {
            str = "Low";
        }
        sb.append((Object) str);
        sb.append(')');
        return sb.toString();
    }

    public C137026If(InterfaceC137546La interfaceC137546La, long j) {
        int i;
        int A00;
        this.A03 = interfaceC137546La;
        this.A05 = j;
        this.A00 = 1;
        if (((int) (0 >> 32)) >= 0 && (i = (int) (j >> 32)) >= 0 && (A00 = C119055aN.A00(j)) >= 0) {
            Bitmap bitmap = ((C6LZ) interfaceC137546La).A00;
            if (i <= bitmap.getWidth() && A00 <= bitmap.getHeight()) {
                this.A04 = j;
                this.A01 = 1.0f;
                return;
            }
        }
        throw new IllegalArgumentException("Failed requirement.");
    }
}
