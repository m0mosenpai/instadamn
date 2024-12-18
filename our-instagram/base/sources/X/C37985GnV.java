package X;

import com.facebook.react.modules.dialog.DialogModule;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.GnV, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C37985GnV {
    /* JADX WARN: Type inference failed for: r2v0, types: [X.Gnh, X.1um, X.1ul] */
    public static C37996Gnh parseFromJson(C16L c16l) {
        String A1P;
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
                String str = null;
                ArrayList arrayList = null;
                String str2 = null;
                if ("badging_source".equals(A0q)) {
                    if (c16l.A11() == C16R.A0C) {
                        arrayList = new ArrayList();
                        while (c16l.A1J() != C16R.A08) {
                            if (c16l.A11() != C16R.A0G && (A1P = c16l.A1P()) != null) {
                                arrayList.add(A1P);
                            }
                        }
                    }
                    c40791um.A05 = arrayList;
                } else if ("is_user_eligible".equals(A0q)) {
                    c40791um.A01 = Boolean.valueOf(c16l.A0d());
                } else if ("should_badge".equals(A0q)) {
                    c40791um.A02 = Boolean.valueOf(c16l.A0d());
                } else if ("subtitle".equals(A0q)) {
                    if (c16l.A11() != C16R.A0G) {
                        str2 = c16l.A1P();
                    }
                    c40791um.A03 = str2;
                } else if (DialogModule.KEY_TITLE.equals(A0q)) {
                    if (c16l.A11() != C16R.A0G) {
                        str = c16l.A1P();
                    }
                    c40791um.A04 = str;
                } else {
                    C55702hA.A01(c16l, c40791um, A0q);
                }
                c16l.A0z();
            }
            List list = c40791um.A05;
            C14360o3.A0A(list);
            boolean A1b = AbstractC31172DnG.A1b(c40791um.A01);
            boolean A1b2 = AbstractC31172DnG.A1b(c40791um.A02);
            String str3 = c40791um.A03;
            C14360o3.A0A(str3);
            String str4 = c40791um.A04;
            C14360o3.A0A(str4);
            c40791um.A00 = new C25598BTl(str3, str4, list, A1b, A1b2);
            return c40791um;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
