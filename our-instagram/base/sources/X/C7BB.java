package X;

import com.facebook.react.modules.dialog.DialogModule;
import java.io.IOException;
import java.util.ArrayList;

/* renamed from: X.7BB, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C7BB {
    /* JADX WARN: Type inference failed for: r0v2, types: [X.7BA, X.1um, X.1ul] */
    public static C7BA parseFromJson(C16L c16l) {
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
                if (DialogModule.KEY_ITEMS.equals(A0q)) {
                    ArrayList arrayList = null;
                    if (c16l.A11() == C16R.A0C) {
                        arrayList = new ArrayList();
                        while (c16l.A1J() != C16R.A08) {
                            C83403nh A00 = C83403nh.A00(c16l, null, false);
                            if (A00 != null) {
                                arrayList.add(A00);
                            }
                        }
                    }
                    c40791um.A00 = arrayList;
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
