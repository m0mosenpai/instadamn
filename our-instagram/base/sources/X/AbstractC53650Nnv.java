package X;

/* renamed from: X.Nnv, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public abstract class AbstractC53650Nnv {
    public static final boolean A00(EnumC53109NeM enumC53109NeM, AbstractC55021OWv abstractC55021OWv, AbstractC55021OWv abstractC55021OWv2) {
        C14360o3.A0B(abstractC55021OWv, 0);
        if (abstractC55021OWv2 != null) {
            if ((abstractC55021OWv2 instanceof C51081Mhg) && (abstractC55021OWv instanceof C51082Mhh)) {
                return true;
            }
            if ((abstractC55021OWv instanceof C51081Mhg) && (abstractC55021OWv2 instanceof C51082Mhh)) {
                return false;
            }
            if (abstractC55021OWv.A00 == abstractC55021OWv2.A00 && abstractC55021OWv.A01 == abstractC55021OWv2.A01 && abstractC55021OWv2.A01(enumC53109NeM) <= abstractC55021OWv.A01(enumC53109NeM)) {
                return false;
            }
            return true;
        }
        return true;
    }
}
