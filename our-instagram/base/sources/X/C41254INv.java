package X;

import com.facebook.react.modules.dialog.DialogModule;
import java.io.IOException;

/* renamed from: X.INv, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C41254INv {
    /* JADX WARN: Type inference failed for: r1v0, types: [X.H9T, X.1um, X.1ul] */
    public static H9T parseFromJson(C16L c16l) {
        String A1P;
        C14360o3.A0B(c16l, 0);
        try {
            ?? c40791um = new C40791um();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("boosted_component_async_request_id".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        A1P = null;
                    } else {
                        A1P = c16l.A1P();
                    }
                    c40791um.A05 = A1P;
                } else if ("creation_request_accepted".equals(A0s)) {
                    c40791um.A03 = AbstractC166997dE.A0d(c16l);
                } else if ("error".equals(A0s)) {
                    c40791um.A02 = AbstractC40190HsA.parseFromJson(c16l);
                } else if (AbstractC111324zv.A00(972).equals(A0s)) {
                    c40791um.A04 = AbstractC166997dE.A0d(c16l);
                } else if (DialogModule.KEY_MESSAGE.equals(A0s)) {
                    c40791um.A00 = AbstractC39858Hm7.parseFromJson(c16l);
                } else {
                    C55702hA.A01(c16l, c40791um, A0s);
                }
                c16l.A0z();
            }
            String str = c40791um.A05;
            boolean A1b = AbstractC31172DnG.A1b(c40791um.A03);
            c40791um.A01 = new UQk(c40791um.A00, c40791um.A02, c40791um.A04, str, A1b);
            return c40791um;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
