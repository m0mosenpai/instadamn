package X;

import com.instagram.business.promote.model.PromoteWhatsAppAccountType;
import java.io.IOException;

/* renamed from: X.VxX, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C69906VxX {
    /* JADX WARN: Type inference failed for: r1v1, types: [X.Uz8, X.1um, X.1ul] */
    public static C67835Uz8 parseFromJson(C16L c16l) {
        PromoteWhatsAppAccountType promoteWhatsAppAccountType;
        C14360o3.A0B(c16l, 0);
        try {
            ?? c40791um = new C40791um();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("account_type".equals(A0s)) {
                    String A1Q = c16l.A1Q();
                    C14360o3.A0B(A1Q, 0);
                    try {
                        promoteWhatsAppAccountType = PromoteWhatsAppAccountType.valueOf(AbstractC65702TsY.A0f(A1Q));
                    } catch (IllegalArgumentException unused) {
                        promoteWhatsAppAccountType = PromoteWhatsAppAccountType.A02;
                    }
                    C14360o3.A0B(promoteWhatsAppAccountType, 0);
                    c40791um.A00 = promoteWhatsAppAccountType;
                } else if (AbstractC111324zv.A00(1034).equals(A0s)) {
                    c40791um.A01 = c16l.A0d();
                } else if (AbstractC111324zv.A00(1061).equals(A0s)) {
                    c40791um.A02 = c16l.A0d();
                } else if ("is_whatsapp_number_banned".equals(A0s)) {
                    c40791um.A03 = c16l.A0d();
                } else {
                    C55702hA.A01(c16l, c40791um, A0s);
                }
                c16l.A0z();
            }
            return c40791um;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
