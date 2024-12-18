package X;

/* renamed from: X.VLc, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public abstract class AbstractC68290VLc {
    public static final Object A00(C6FW c6fw) {
        int A0D = AbstractC65702TsY.A0D(c6fw);
        Object A02 = c6fw.A02();
        C14360o3.A0C(A02, "null cannot be cast to non-null type kotlin.String");
        String str = (String) A02;
        Object A00 = c6fw.A00();
        C14360o3.A0C(A00, AbstractC111324zv.A00(10));
        long longValue = ((Number) A00).longValue();
        InterfaceC103274l2 interfaceC103274l2 = C1LZ.A00().A01;
        if (str != null) {
            try {
                interfaceC103274l2.Eo0(null, A0D, Integer.parseInt(str), longValue);
                return null;
            } catch (NumberFormatException e) {
                AbstractC25241Le.A03("BloksTTRCFunctionsUtil", e);
                return null;
            }
        }
        return null;
    }
}
