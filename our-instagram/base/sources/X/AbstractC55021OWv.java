package X;

/* renamed from: X.OWv, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public abstract class AbstractC55021OWv {
    public final int A00;
    public final int A01;
    public final int A02;
    public final int A03;

    public final int A01(EnumC53109NeM enumC53109NeM) {
        int A05 = AbstractC25227BEk.A05(enumC53109NeM, 0);
        if (A05 != 0) {
            if (A05 != 1) {
                if (A05 == 2) {
                    return this.A02;
                }
                throw B4Z.A00();
            }
            return this.A03;
        }
        throw AbstractC166987dD.A12("Cannot get presentedItems for loadType: REFRESH");
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AbstractC55021OWv)) {
            return false;
        }
        AbstractC55021OWv abstractC55021OWv = (AbstractC55021OWv) obj;
        return this.A03 == abstractC55021OWv.A03 && this.A02 == abstractC55021OWv.A02 && this.A00 == abstractC55021OWv.A00 && this.A01 == abstractC55021OWv.A01;
    }

    public int hashCode() {
        return this.A03 + this.A02 + this.A00 + this.A01;
    }

    public AbstractC55021OWv(int i, int i2, int i3, int i4) {
        this.A03 = i;
        this.A02 = i2;
        this.A00 = i3;
        this.A01 = i4;
    }

    public static void A00(AbstractC55021OWv abstractC55021OWv, String str, StringBuilder sb) {
        sb.append(str);
        sb.append(abstractC55021OWv.A03);
        sb.append(",\n            |    presentedItemsAfter=");
        sb.append(abstractC55021OWv.A02);
        sb.append(",\n            |    originalPageOffsetFirst=");
        sb.append(abstractC55021OWv.A00);
        sb.append(",\n            |    originalPageOffsetLast=");
        sb.append(abstractC55021OWv.A01);
    }
}
