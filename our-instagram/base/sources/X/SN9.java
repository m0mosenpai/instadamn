package X;

/* loaded from: classes10.dex */
public abstract class SN9 {
    public final String A02(RBK rbk, String str) {
        RBE rbe = (RBE) this;
        String str2 = rbe.A00;
        if (str2 != null) {
            Class<?> returnType = rbk.A01.getReturnType();
            if ((returnType == Boolean.class || returnType == Boolean.TYPE) && str.startsWith(str2)) {
                if (rbe.A02) {
                    return RBE.A01(str, 2);
                }
                return RBE.A00(str, 2);
            }
            return null;
        }
        return null;
    }

    public abstract String A03(RBK rbk, String str);
}
