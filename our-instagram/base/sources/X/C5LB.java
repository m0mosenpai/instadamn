package X;

import com.facebook.react.modules.dialog.DialogModule;
import java.io.IOException;

/* renamed from: X.5LB, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C5LB {
    /* JADX WARN: Type inference failed for: r0v3, types: [X.5LA, X.1um, X.1ul] */
    public static C5LA parseFromJson(C16L c16l) {
        String A1P;
        Integer num;
        C14360o3.A0B(c16l, 0);
        try {
            ?? c40791um = new C40791um();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0q = c16l.A0q();
                c16l.A1J();
                if ("version".equals(A0q)) {
                    c40791um.A00 = c16l.A1D();
                } else if ("actions".equals(A0q)) {
                    c40791um.A01 = C5LE.parseFromJson(c16l);
                } else if ("handler".equals(A0q)) {
                    int A0i = c16l.A0i();
                    if (A0i != 0) {
                        if (A0i != 1) {
                            if (A0i == 2) {
                                num = C05F.A0C;
                            } else {
                                C0w9.A03(C5LA.class.getSimpleName(), AnonymousClass001.A0O("Unrecognized emergency push handler type received from backend: ", A0i));
                                num = C05F.A00;
                            }
                        } else {
                            num = C05F.A01;
                        }
                    } else {
                        num = C05F.A00;
                    }
                    c40791um.A03 = num;
                } else if ("try_crash_on_bg_for_x_mins_else_crash_now".equals(A0q)) {
                    c40791um.A02 = Integer.valueOf(c16l.A1D());
                } else if (DialogModule.KEY_MESSAGE.equals(A0q)) {
                    if (c16l.A11() == C16R.A0G) {
                        A1P = null;
                    } else {
                        A1P = c16l.A1P();
                    }
                    c40791um.A04 = A1P;
                } else {
                    C55702hA.A01(c16l, c40791um, A0q);
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
