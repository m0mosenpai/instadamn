package X;

import com.facebook.react.modules.appstate.AppStateModule;
import java.io.IOException;
import java.util.ArrayList;

/* renamed from: X.VOo, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public abstract class AbstractC68380VOo {
    public static URA parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            UR9 ur9 = null;
            UR4 ur4 = null;
            UR3 ur3 = null;
            ArrayList arrayList = null;
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("animation".equals(A0s)) {
                    ur9 = AbstractC68378VOm.parseFromJson(c16l);
                } else if (AppStateModule.APP_STATE_BACKGROUND.equals(A0s)) {
                    ur4 = AbstractC69870Vwv.parseFromJson(c16l);
                } else if ("badge".equals(A0s)) {
                    ur3 = AbstractC68370VOe.parseFromJson(c16l);
                } else if ("photos".equals(A0s)) {
                    if (c16l.A11() == C16R.A0C) {
                        arrayList = new ArrayList();
                        while (c16l.A1J() != C16R.A08) {
                            UR8 parseFromJson = AbstractC68381VOp.parseFromJson(c16l);
                            if (parseFromJson != null) {
                                arrayList.add(parseFromJson);
                            }
                        }
                    } else {
                        arrayList = null;
                    }
                }
                c16l.A0z();
            }
            return new URA(ur3, ur4, ur9, arrayList);
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
