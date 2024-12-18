package X;

/* renamed from: X.8eZ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C191778eZ extends C0T6 implements InterfaceC191788ea {
    public final AbstractC12990ll A00;
    public final boolean A01;
    public final boolean A02;
    public final boolean A03;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C191778eZ(AbstractC12990ll abstractC12990ll) {
        this(abstractC12990ll, false, false, false);
        C14360o3.A0B(abstractC12990ll, 1);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C191778eZ) {
                C191778eZ c191778eZ = (C191778eZ) obj;
                if (!C14360o3.A0K(this.A00, c191778eZ.A00) || this.A01 != c191778eZ.A01 || this.A03 != c191778eZ.A03 || this.A02 != c191778eZ.A02) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int hashCode = this.A00.hashCode() * 31;
        int i = 1237;
        if (this.A01) {
            i = 1231;
        }
        int i2 = (hashCode + i) * 31;
        int i3 = 1237;
        if (this.A03) {
            i3 = 1231;
        }
        int i4 = (i2 + i3) * 31;
        int i5 = 1237;
        if (this.A02) {
            i5 = 1231;
        }
        return i4 + i5;
    }

    public C191778eZ(AbstractC12990ll abstractC12990ll, boolean z, boolean z2, boolean z3) {
        C14360o3.A0B(abstractC12990ll, 1);
        this.A00 = abstractC12990ll;
        this.A01 = z;
        this.A03 = z2;
        this.A02 = z3;
    }
}
