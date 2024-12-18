package X;

import com.facebook.react.modules.dialog.DialogModule;
import java.io.IOException;
import java.util.ArrayList;

/* renamed from: X.FSt, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C34754FSt {
    public static C32206EDf parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            C32206EDf c32206EDf = new C32206EDf();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                ArrayList arrayList = null;
                if (DialogModule.KEY_ITEMS.equals(A0s)) {
                    if (c16l.A11() == C16R.A0C) {
                        arrayList = AbstractC166987dD.A1E();
                        while (c16l.A1J() != C16R.A08) {
                            AbstractC31180DnO.A1N(c16l, arrayList);
                        }
                    }
                    C14360o3.A0B(arrayList, 0);
                    c32206EDf.A01 = arrayList;
                } else if ("max_id".equals(A0s)) {
                    c32206EDf.A00 = AbstractC167017dG.A0m(c16l);
                } else if ("more_available".equals(A0s)) {
                    c16l.A0d();
                } else {
                    C55702hA.A01(c16l, c32206EDf, A0s);
                }
                c16l.A0z();
            }
            return c32206EDf;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
