package X;

/* renamed from: X.Nr9, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public abstract class AbstractC53819Nr9 {
    public static final Object A00(C6FW c6fw) {
        Exception exc;
        Object A01 = c6fw.A01();
        C14360o3.A0C(A01, "null cannot be cast to non-null type kotlin.String");
        String str = (String) A01;
        Object A02 = c6fw.A02();
        C14360o3.A0C(A02, "null cannot be cast to non-null type kotlin.String");
        String str2 = (String) A02;
        String A0o = AbstractC31176DnK.A0o(c6fw, "null cannot be cast to non-null type kotlin.String", 2);
        AbstractC167017dG.A1N(str, str2);
        C14360o3.A0B(A0o, 2);
        int i = 0;
        while (true) {
            if (i < str2.length()) {
                if (!Character.isDigit(str2.charAt(i))) {
                    if (str2.equals("ERROR_OUTCOME")) {
                        exc = new Exception(A0o);
                    } else {
                        exc = new Exception(A0o, null);
                    }
                } else {
                    i++;
                }
            } else {
                Integer.parseInt(str2);
                exc = new Exception(A0o);
                break;
            }
        }
        OVR.A00.A00(str, exc);
        return null;
    }
}
