package X;

import com.facebook.react.modules.dialog.DialogModule;
import java.io.IOException;
import java.util.ArrayList;

/* loaded from: classes7.dex */
public final class IOL {
    /* JADX WARN: Type inference failed for: r4v0, types: [X.1um, X.H9H, X.1ul] */
    public static H9H parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            ?? c40791um = new C40791um();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("double_height_reel_media".equals(A0s)) {
                    c40791um.A00 = AbstractC111024zE.parseFromJson(c16l);
                } else if (DialogModule.KEY_ITEMS.equals(A0s)) {
                    ArrayList arrayList = null;
                    if (c16l.A11() == C16R.A0C) {
                        arrayList = AbstractC166987dD.A1E();
                        while (c16l.A1J() != C16R.A08) {
                            AbstractC37302Gc3.A1K(c16l, arrayList);
                        }
                    }
                    c40791um.A03 = arrayList;
                } else if ("page_info".equals(A0s)) {
                    c40791um.A02 = AbstractC39965Hnu.parseFromJson(c16l);
                } else {
                    C55702hA.A01(c16l, c40791um, A0s);
                }
                c16l.A0z();
            }
            c40791um.A01 = new C45143Jyj(c40791um.A00, c40791um.A02, c40791um.A03);
            return c40791um;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
