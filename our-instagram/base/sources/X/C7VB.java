package X;

/* renamed from: X.7VB, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C7VB extends C0T6 implements InterfaceC66482zP, C7VC {
    public final boolean A00;
    public final boolean A01;
    public final boolean A02;
    public final boolean A03;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C7VB) {
                C7VB c7vb = (C7VB) obj;
                if (this.A02 != c7vb.A02 || this.A03 != c7vb.A03 || this.A01 != c7vb.A01 || this.A00 != c7vb.A00) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // X.C7VC
    public final long C8f() {
        return 0L;
    }

    @Override // X.InterfaceC66482zP
    public final /* bridge */ /* synthetic */ Object getKey() {
        return "javaClass";
    }

    @Override // X.C7VC
    public final int getType() {
        return 15;
    }

    public final int hashCode() {
        int i = 1237;
        if (this.A02) {
            i = 1231;
        }
        int i2 = i * 31;
        int i3 = 1237;
        if (this.A03) {
            i3 = 1231;
        }
        int i4 = (i2 + i3) * 31;
        int i5 = 1237;
        if (this.A01) {
            i5 = 1231;
        }
        int i6 = (i4 + i5) * 31;
        int i7 = 1237;
        if (this.A00) {
            i7 = 1231;
        }
        return i6 + i7;
    }

    public C7VB(boolean z, boolean z2, boolean z3, boolean z4) {
        this.A02 = z;
        this.A03 = z2;
        this.A01 = z3;
        this.A00 = z4;
    }

    @Override // X.InterfaceC66492zQ
    public final /* bridge */ /* synthetic */ boolean isContentSame(Object obj) {
        return equals(obj);
    }
}
