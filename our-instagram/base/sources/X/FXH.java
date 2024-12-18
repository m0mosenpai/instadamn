package X;

import com.facebook.react.modules.dialog.DialogModule;
import com.instagram.save.model.SavedCollection;
import java.io.IOException;
import java.util.ArrayList;

/* loaded from: classes6.dex */
public final class FXH {
    public static C32205EDe parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            C32205EDe c32205EDe = new C32205EDe();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if (AbstractC111324zv.A00(45).equals(A0s)) {
                    c32205EDe.A02 = c16l.A0d();
                } else if ("more_available".equals(A0s)) {
                    c32205EDe.A03 = c16l.A0d();
                } else {
                    ArrayList arrayList = null;
                    if ("next_max_id".equals(A0s)) {
                        c32205EDe.A00 = AbstractC167017dG.A0m(c16l);
                    } else if (DialogModule.KEY_ITEMS.equals(A0s)) {
                        if (c16l.A11() == C16R.A0C) {
                            arrayList = AbstractC166987dD.A1E();
                            while (c16l.A1J() != C16R.A08) {
                                SavedCollection parseFromJson = C70139W6r.parseFromJson(c16l);
                                if (parseFromJson != null) {
                                    arrayList.add(parseFromJson);
                                }
                            }
                        }
                        C14360o3.A0B(arrayList, 0);
                        c32205EDe.A01 = arrayList;
                    } else {
                        C55702hA.A01(c16l, c32205EDe, A0s);
                    }
                }
                c16l.A0z();
            }
            return c32205EDe;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
