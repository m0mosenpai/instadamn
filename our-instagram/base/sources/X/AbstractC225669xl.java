package X;

/* renamed from: X.9xl, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC225669xl {
    public static final Object A00(C6FQ c6fq, C6FW c6fw) {
        Object A02 = c6fw.A02();
        C14360o3.A0C(A02, "null cannot be cast to non-null type kotlin.String");
        Object A00 = c6fw.A00();
        C14360o3.A0C(A00, "null cannot be cast to non-null type kotlin.String");
        String str = (String) A00;
        EnumC222919sW enumC222919sW = (EnumC222919sW) EnumC222919sW.A01.get(A02);
        if (enumC222919sW == null) {
            enumC222919sW = EnumC222919sW.A07;
        }
        AbstractC12990ll A0B = C6BQ.A0B(c6fq);
        C14360o3.A0C(A0B, AbstractC111324zv.A00(6));
        AbstractC25651Mw.A00(A0B).E4s(new C191418ds(enumC222919sW, str));
        return null;
    }
}
