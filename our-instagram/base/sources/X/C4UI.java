package X;

import com.google.android.exoplayer2.util.Util;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* renamed from: X.4UI, reason: invalid class name */
/* loaded from: classes2.dex */
public abstract class C4UI implements C4UE {
    public C4UJ A00;
    public ByteBuffer A01;
    public C4UJ A02;
    public C4UJ A03;
    public ByteBuffer A04;
    public boolean A05;
    public C4UJ A06;

    @Override // X.C4UE
    public final void E7Y() {
        this.A05 = true;
        if (this instanceof C4UU) {
            C4UU c4uu = (C4UU) this;
            if (c4uu.A05) {
                if (c4uu.A00 > 0) {
                    c4uu.A04 += r1 / ((C4UI) c4uu).A00.A00;
                }
                c4uu.A00 = 0;
                return;
            }
            return;
        }
        if (!(this instanceof C4UH)) {
            return;
        }
        C4UH c4uh = (C4UH) this;
        int i = c4uh.A01;
        if (i > 0) {
            C4UH.A00(c4uh, c4uh.A07, i);
        }
        if (c4uh.A06) {
            return;
        }
        c4uh.A04 += c4uh.A02 / c4uh.A00;
    }

    public final ByteBuffer A02(int i) {
        if (this.A04.capacity() < i) {
            this.A04 = ByteBuffer.allocateDirect(i).order(ByteOrder.nativeOrder());
        } else {
            this.A04.clear();
        }
        ByteBuffer byteBuffer = this.A04;
        this.A01 = byteBuffer;
        return byteBuffer;
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0017, code lost:
    
        if (r0 == false) goto L46;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:15:? A[RETURN, SYNTHETIC] */
    @Override // X.C4UE
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.C4UJ AJ5(X.C4UJ r4) {
        /*
            r3 = this;
            r3.A02 = r4
            r2 = r3
            boolean r0 = r3 instanceof X.C4UU
            if (r0 == 0) goto L24
            X.4UU r2 = (X.C4UU) r2
            int r1 = r4.A02
            r0 = 2
            if (r1 != r0) goto L78
            r0 = 1
            r2.A05 = r0
            int r0 = r2.A03
            if (r0 != 0) goto L19
            int r0 = r2.A02
        L17:
            if (r0 == 0) goto L75
        L19:
            r3.A03 = r4
            boolean r0 = r3.isActive()
            if (r0 != 0) goto L23
            X.4UJ r4 = X.C4UJ.A04
        L23:
            return r4
        L24:
            boolean r0 = r3 instanceof X.C4UH
            if (r0 == 0) goto L32
            X.4UH r2 = (X.C4UH) r2
            int r1 = r4.A02
            r0 = 2
            if (r1 != r0) goto L7e
            boolean r0 = r2.A05
            goto L17
        L32:
            boolean r0 = r3 instanceof X.C4UV
            if (r0 == 0) goto L53
            int r1 = r4.A02
            r2 = 2
            r0 = 3
            if (r1 == r0) goto L6b
            if (r1 == r2) goto L75
            r0 = 268435456(0x10000000, float:2.524355E-29)
            if (r1 == r0) goto L6b
            r0 = 536870912(0x20000000, float:1.0842022E-19)
            if (r1 == r0) goto L6b
            r0 = 805306368(0x30000000, float:4.656613E-10)
            if (r1 == r0) goto L6b
            r0 = 4
            if (r1 == r0) goto L6b
            X.4Y9 r0 = new X.4Y9
            r0.<init>(r4)
            throw r0
        L53:
            boolean r0 = r3 instanceof X.C4UT
            if (r0 != 0) goto L75
            int r1 = r4.A02
            r0 = 536870912(0x20000000, float:1.0842022E-19)
            if (r1 == r0) goto L6a
            r0 = 805306368(0x30000000, float:4.656613E-10)
            if (r1 == r0) goto L6a
            r0 = 4
            if (r1 == r0) goto L75
            X.4Y9 r0 = new X.4Y9
            r0.<init>(r4)
            throw r0
        L6a:
            r2 = 4
        L6b:
            int r1 = r4.A03
            int r0 = r4.A01
            X.4UJ r4 = new X.4UJ
            r4.<init>(r1, r0, r2)
            goto L19
        L75:
            X.4UJ r4 = X.C4UJ.A04
            goto L19
        L78:
            X.4Y9 r0 = new X.4Y9
            r0.<init>(r4)
            throw r0
        L7e:
            X.4Y9 r0 = new X.4Y9
            r0.<init>(r4)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C4UI.AJ5(X.4UJ):X.4UJ");
    }

    @Override // X.C4UE
    public ByteBuffer BaE() {
        ByteBuffer byteBuffer = this.A01;
        this.A01 = C4UE.A00;
        return byteBuffer;
    }

    @Override // X.C4UE
    public boolean CTt() {
        if (this.A05 && this.A01 == C4UE.A00) {
            return true;
        }
        return false;
    }

    @Override // X.C4UE
    public final void flush() {
        this.A01 = C4UE.A00;
        this.A05 = false;
        this.A00 = this.A02;
        this.A06 = this.A03;
        if (this instanceof C4UH) {
            C4UH c4uh = (C4UH) this;
            if (c4uh.A05) {
                C4UJ c4uj = ((C4UI) c4uh).A00;
                int i = c4uj.A00;
                c4uh.A00 = i;
                long j = c4uj.A03;
                int i2 = ((int) ((150000 * j) / 1000000)) * i;
                if (c4uh.A07.length != i2) {
                    c4uh.A07 = new byte[i2];
                }
                int i3 = ((int) ((20000 * j) / 1000000)) * i;
                c4uh.A02 = i3;
                if (c4uh.A08.length != i3) {
                    c4uh.A08 = new byte[i3];
                }
            }
            c4uh.A03 = 0;
            c4uh.A04 = 0L;
            c4uh.A01 = 0;
            c4uh.A06 = false;
            return;
        }
        if (!(this instanceof C4UU)) {
            return;
        }
        C4UU c4uu = (C4UU) this;
        if (c4uu.A05) {
            c4uu.A05 = false;
            int i4 = c4uu.A02;
            int i5 = ((C4UI) c4uu).A00.A00;
            c4uu.A06 = new byte[i4 * i5];
            c4uu.A01 = c4uu.A03 * i5;
        }
        c4uu.A00 = 0;
    }

    @Override // X.C4UE
    public final boolean isActive() {
        if (this instanceof C4UH) {
            return ((C4UH) this).A05;
        }
        if (this.A03 == C4UJ.A04) {
            return false;
        }
        return true;
    }

    public C4UI() {
        ByteBuffer byteBuffer = C4UE.A00;
        this.A04 = byteBuffer;
        this.A01 = byteBuffer;
        C4UJ c4uj = C4UJ.A04;
        this.A02 = c4uj;
        this.A03 = c4uj;
        this.A00 = c4uj;
        this.A06 = c4uj;
    }

    @Override // X.C4UE
    public final void reset() {
        flush();
        this.A04 = C4UE.A00;
        C4UJ c4uj = C4UJ.A04;
        this.A02 = c4uj;
        this.A03 = c4uj;
        this.A00 = c4uj;
        this.A06 = c4uj;
        if (this instanceof C4UU) {
            ((C4UU) this).A06 = Util.A06;
        } else {
            if (!(this instanceof C4UH)) {
                return;
            }
            C4UH c4uh = (C4UH) this;
            c4uh.A05 = false;
            c4uh.A02 = 0;
            byte[] bArr = Util.A06;
            c4uh.A07 = bArr;
            c4uh.A08 = bArr;
        }
    }
}
