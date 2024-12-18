package X;

import com.facebook.react.modules.intent.IntentModule;
import java.io.IOException;
import java.util.ArrayList;

/* renamed from: X.VUj, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public abstract class AbstractC68530VUj {
    public static C69125ViG parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            C69125ViG c69125ViG = new C69125ViG();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                ArrayList arrayList = null;
                if ("customized_token".equals(A0s)) {
                    c69125ViG.A00 = AbstractC167017dG.A0m(c16l);
                } else if (IntentModule.EXTRA_MAP_KEY_FOR_VALUE.equals(A0s)) {
                    c69125ViG.A01 = AbstractC167017dG.A0m(c16l);
                } else if ("next_question_choices".equals(A0s)) {
                    if (c16l.A11() == C16R.A0C) {
                        arrayList = new ArrayList();
                        while (c16l.A1J() != C16R.A08) {
                            C69124ViF parseFromJson = AbstractC68529VUi.parseFromJson(c16l);
                            if (parseFromJson != null) {
                                arrayList.add(parseFromJson);
                            }
                        }
                    }
                    c69125ViG.A02 = arrayList;
                }
                c16l.A0z();
            }
            return c69125ViG;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
