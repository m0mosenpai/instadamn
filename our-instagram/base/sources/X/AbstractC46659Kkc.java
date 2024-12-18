package X;

import com.facebook.react.modules.dialog.DialogModule;
import java.io.IOException;
import java.util.ArrayList;

/* renamed from: X.Kkc, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public abstract class AbstractC46659Kkc {
    public static C47758L7e parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            C47758L7e c47758L7e = new C47758L7e();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("section_type".equals(A0s)) {
                    c47758L7e.A00 = AbstractC40538HyK.A00(c16l.A1Q());
                } else {
                    ArrayList arrayList = null;
                    if (DialogModule.KEY_ITEMS.equals(A0s)) {
                        if (c16l.A11() == C16R.A0C) {
                            arrayList = AbstractC166987dD.A1E();
                            while (c16l.A1J() != C16R.A08) {
                                C38321qM A00 = C38321qM.A00(c16l);
                                if (A00 != null) {
                                    arrayList.add(A00);
                                }
                            }
                        }
                        C14360o3.A0B(arrayList, 0);
                        c47758L7e.A04 = arrayList;
                    } else if ("display_cta_button_text".equals(A0s)) {
                        c47758L7e.A01 = AbstractC167017dG.A0m(c16l);
                    } else if ("display_subtitle".equals(A0s)) {
                        c47758L7e.A02 = AbstractC167017dG.A0m(c16l);
                    } else if (AbstractC111324zv.A00(4334).equals(A0s)) {
                        c47758L7e.A03 = AbstractC167017dG.A0m(c16l);
                    }
                }
                c16l.A0z();
            }
            return c47758L7e;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
