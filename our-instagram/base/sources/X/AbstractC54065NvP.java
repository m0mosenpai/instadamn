package X;

/* renamed from: X.NvP, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public abstract class AbstractC54065NvP {
    public static final C109504wc A00(C5HW c5hw, String str) {
        Object A1D;
        long currentTimeMillis;
        AbstractC167007dF.A1K(c5hw, str);
        try {
            String A00 = C5HV.A00(c5hw);
            C14360o3.A07(A00);
            A1D = MSY.A1a(A00);
        } catch (Throwable th) {
            A1D = MSW.A1D(th);
        }
        if (A1D instanceof C09540e5) {
            A1D = null;
        }
        byte[] bArr = (byte[]) A1D;
        if (bArr != null) {
            String str2 = c5hw.A09;
            C14360o3.A07(str2);
            int i = c5hw.A00;
            Double A05 = c5hw.A05();
            if (A05 != null) {
                currentTimeMillis = (long) A05.doubleValue();
            } else {
                currentTimeMillis = System.currentTimeMillis();
            }
            return new C109504wc(null, str2, str, bArr, i, 0, 0, currentTimeMillis, C14360o3.A0K(c5hw.A0D, AbstractC111324zv.A00(2904)));
        }
        return null;
    }
}
