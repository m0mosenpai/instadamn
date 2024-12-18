package X;

import com.facebook.react.modules.intent.IntentModule;
import java.io.IOException;
import java.util.ArrayList;

/* renamed from: X.VUi, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public abstract class AbstractC68529VUi {
    public static C69124ViF parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            C69124ViF c69124ViF = new C69124ViF();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                ArrayList arrayList = null;
                if ("customized_token".equals(A0s)) {
                    c69124ViF.A00 = AbstractC167017dG.A0m(c16l);
                } else if (IntentModule.EXTRA_MAP_KEY_FOR_VALUE.equals(A0s)) {
                    c69124ViF.A01 = AbstractC167017dG.A0m(c16l);
                } else if ("next_question_choices".equals(A0s)) {
                    if (c16l.A11() == C16R.A0C) {
                        arrayList = new ArrayList();
                        while (c16l.A1J() != C16R.A08) {
                            C69123ViE parseFromJson = AbstractC68528VUh.parseFromJson(c16l);
                            if (parseFromJson != null) {
                                arrayList.add(parseFromJson);
                            }
                        }
                    }
                    c69124ViF.A02 = arrayList;
                }
                c16l.A0z();
            }
            return c69124ViF;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
