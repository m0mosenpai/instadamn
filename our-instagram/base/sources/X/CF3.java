package X;

/* loaded from: classes5.dex */
public abstract class CF3 {
    public static final Boolean A00(C6FQ c6fq, C6FW c6fw) {
        Object A03 = c6fw.A03(0);
        AbstractC25225BEi.A1S(A03);
        AbstractC12990ll A0B = C6BQ.A0B(c6fq);
        C14360o3.A0C(A0B, "null cannot be cast to non-null type com.instagram.common.session.UserSession");
        C14360o3.A0B(A0B, 1);
        InterfaceC16660sJ interfaceC16660sJ = (InterfaceC16660sJ) CMD.A00.get(A03);
        if (interfaceC16660sJ != null) {
            return (Boolean) interfaceC16660sJ.invoke(A0B);
        }
        return null;
    }
}
