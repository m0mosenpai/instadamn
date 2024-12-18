package X;

import java.io.IOException;

/* loaded from: classes6.dex */
public abstract class F8U {
    /* JADX WARN: Type inference failed for: r0v4, types: [X.FM6, java.lang.Object] */
    public static FM6 parseFromJson(C16L c16l) {
        EnumC33368Ep1 enumC33368Ep1;
        C14360o3.A0B(c16l, 0);
        try {
            ?? obj = new Object();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if (AbstractC31171DnF.A1a(A0s)) {
                    obj.A01 = AbstractC167017dG.A0m(c16l);
                } else if ("action".equals(A0s)) {
                    String A1Q = c16l.A1Q();
                    EnumC33368Ep1[] values = EnumC33368Ep1.values();
                    int length = values.length;
                    int i = 0;
                    while (true) {
                        if (i < length) {
                            enumC33368Ep1 = values[i];
                            if (A1Q.equalsIgnoreCase(enumC33368Ep1.name())) {
                                break;
                            }
                            i++;
                        } else {
                            C0w9.A03("LoginFailureButton.parseActionStringError", String.format("Error parsing action string %s", A1Q));
                            enumC33368Ep1 = EnumC33368Ep1.DEFAULT;
                            break;
                        }
                    }
                    obj.A00 = enumC33368Ep1;
                } else if ("helper_url".equals(A0s)) {
                    obj.A02 = AbstractC167017dG.A0m(c16l);
                } else if ("stop_deletion_token".equals(A0s)) {
                    obj.A03 = AbstractC167017dG.A0m(c16l);
                }
                c16l.A0z();
            }
            return obj;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
