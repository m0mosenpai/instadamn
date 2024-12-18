package X;

/* loaded from: classes11.dex */
public abstract class VLU {
    public static final Object A00(C6FQ c6fq, C6FW c6fw) {
        String A00;
        String A0E;
        String A0g = AnonymousClass001.A0g(AbstractC31177DnL.A0d(c6fw), "\tBKScriptExecutionId:", c6fq.A0A);
        C102884kP A0F = AbstractC31175DnJ.A0F(c6fw, 1);
        if (A0F == null || (A00 = A0F.A0G()) == null) {
            A00 = AbstractC111324zv.A00(753);
        }
        String str = "debug";
        if (A0F != null && (A0E = A0F.A0E()) != null) {
            str = A0E;
        }
        switch (str.hashCode()) {
            case 3641990:
                if (!str.equals("warn")) {
                    return null;
                }
                C0K8.A0D(A00, A0g);
                return null;
            case 96784904:
                if (!str.equals("error")) {
                    return null;
                }
                C0K8.A0C(A00, A0g);
                return null;
            default:
                return null;
        }
    }
}
