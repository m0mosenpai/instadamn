package X;

/* renamed from: X.CVu, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C27997CVu {
    public final long A00;
    public final EnumC27356C5l A01;
    public final Integer A02;
    public final boolean A03;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C27997CVu) {
                C27997CVu c27997CVu = (C27997CVu) obj;
                if (this.A01 != c27997CVu.A01 || this.A00 != c27997CVu.A00 || this.A02 != c27997CVu.A02 || this.A03 != c27997CVu.A03) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        String str;
        int A01 = AbstractC25236BEt.A01(this.A00, AbstractC166987dD.A0G(this.A01));
        int intValue = this.A02.intValue();
        switch (intValue) {
            case 0:
                str = "Left";
                break;
            case 1:
                str = "Middle";
                break;
            default:
                str = "Right";
                break;
        }
        return AbstractC166987dD.A0K(this.A03, AbstractC25231BEo.A0H(str, intValue, A01));
    }

    public C27997CVu(EnumC27356C5l enumC27356C5l, Integer num, long j, boolean z) {
        this.A01 = enumC27356C5l;
        this.A00 = j;
        this.A02 = num;
        this.A03 = z;
    }

    public final String toString() {
        String str;
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("SelectionHandleInfo(handle=");
        A1C.append(this.A01);
        A1C.append(", position=");
        AbstractC25235BEs.A1B(this.A00, A1C);
        A1C.append(", anchor=");
        switch (this.A02.intValue()) {
            case 0:
                str = "Left";
                break;
            case 1:
                str = "Middle";
                break;
            default:
                str = "Right";
                break;
        }
        A1C.append(str);
        A1C.append(AbstractC111324zv.A00(1467));
        return AbstractC25236BEt.A0a(A1C, this.A03);
    }
}
