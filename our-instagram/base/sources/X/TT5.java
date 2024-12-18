package X;

import java.util.Iterator;

/* loaded from: classes10.dex */
public final class TT5 implements Iterator {
    public final int A02;
    public final Object A03;
    public final int A01 = 0;
    public int A00 = 0;

    public TT5(final AbstractC58536Px4 this$0) {
        this.A03 = this$0;
        this.A02 = this$0.A02();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return AbstractC167007dF.A1Q(this.A00, this.A02);
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0006. Please report as an issue. */
    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        byte[] bArr;
        byte[] bArr2;
        int i;
        byte b;
        int i2 = this.A01;
        int i3 = this.A00;
        int i4 = this.A02;
        switch (i2) {
            case 0:
                if (i3 < i4) {
                    this.A00 = i3 + 1;
                    C58386PuQ c58386PuQ = (C58386PuQ) ((AbstractC58387PuR) this.A03);
                    if (c58386PuQ instanceof Q7M) {
                        Q7M q7m = (Q7M) c58386PuQ;
                        bArr2 = ((C58386PuQ) q7m).A00;
                        i = q7m.A01;
                        b = bArr2[i + i3];
                        return Byte.valueOf(b);
                    }
                    bArr = c58386PuQ.A00;
                    b = bArr[i3];
                    return Byte.valueOf(b);
                }
                throw AbstractC58318PtA.A13();
            case 1:
                if (i3 < i4) {
                    this.A00 = i3 + 1;
                    C58535Px3 c58535Px3 = (C58535Px3) ((AbstractC58536Px4) this.A03);
                    if (c58535Px3 instanceof C60803RTo) {
                        C60803RTo c60803RTo = (C60803RTo) c58535Px3;
                        bArr2 = ((C58535Px3) c60803RTo).A00;
                        i = c60803RTo.A01;
                        b = bArr2[i + i3];
                        return Byte.valueOf(b);
                    }
                    bArr = c58535Px3.A00;
                    b = bArr[i3];
                    return Byte.valueOf(b);
                }
                throw AbstractC58318PtA.A13();
            case 2:
                if (i3 < i4) {
                    this.A00 = i3 + 1;
                    RWI rwi = (RWI) ((AbstractC64538TIu) this.A03);
                    if (rwi instanceof RWH) {
                        RWH rwh = (RWH) rwi;
                        bArr2 = ((RWI) rwh).A00;
                        i = rwh.A01;
                        b = bArr2[i + i3];
                        return Byte.valueOf(b);
                    }
                    bArr = rwi.A00;
                    b = bArr[i3];
                    return Byte.valueOf(b);
                }
                throw AbstractC58318PtA.A13();
            default:
                if (i3 < i4) {
                    this.A00 = i3 + 1;
                    RZ1 rz1 = (RZ1) ((AbstractC64535TIr) this.A03);
                    if (rz1 instanceof RZ0) {
                        RZ0 rz0 = (RZ0) rz1;
                        bArr2 = ((RZ1) rz0).A00;
                        i = rz0.A01;
                        b = bArr2[i + i3];
                        return Byte.valueOf(b);
                    }
                    bArr = rz1.A00;
                    b = bArr[i3];
                    return Byte.valueOf(b);
                }
                throw AbstractC58318PtA.A13();
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        int i = this.A01;
        throw AbstractC43592JPx.A11();
    }

    public TT5(AbstractC64535TIr abstractC64535TIr) {
        this.A03 = abstractC64535TIr;
        this.A02 = abstractC64535TIr.A00();
    }

    public TT5(AbstractC64538TIu abstractC64538TIu) {
        this.A03 = abstractC64538TIu;
        this.A02 = abstractC64538TIu.A02();
    }

    public TT5(AbstractC58387PuR abstractC58387PuR) {
        this.A03 = abstractC58387PuR;
        this.A02 = abstractC58387PuR.A01();
    }
}
