package X;

/* loaded from: classes11.dex */
public abstract class VLZ {
    public static final Object A00(C6FW c6fw) {
        boolean z = false;
        int A0D = AbstractC25230BEn.A0D(c6fw.A03(0), "null cannot be cast to non-null type kotlin.Number");
        Object A02 = c6fw.A02();
        C14360o3.A0C(A02, "null cannot be cast to non-null type kotlin.String");
        String str = (String) A02;
        Object A00 = c6fw.A00();
        C14360o3.A0C(A00, "null cannot be cast to non-null type kotlin.String");
        String str2 = (String) A00;
        Object A03 = c6fw.A03(3);
        C14360o3.A0C(A03, AbstractC111324zv.A00(10));
        long longValue = ((Number) A03).longValue();
        C102884kP A0F = AbstractC31175DnJ.A0F(c6fw, 4);
        long now = C1LZ.A00().A01.C4l().now();
        if (A0F != null) {
            z = A0F.A0S(35, false);
        }
        C14360o3.A0B(str2, 2);
        InterfaceC72008XEw A002 = U4N.A00(str, A0D);
        if (A002 != null) {
            A002.AF2(longValue, str2, z, now);
            return null;
        }
        return null;
    }
}
