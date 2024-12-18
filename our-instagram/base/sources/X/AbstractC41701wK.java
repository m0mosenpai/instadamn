package X;

import fxcache.model.FxCalAccount;
import fxcache.model.FxCalAccountLinkageInfo;
import java.io.IOException;
import java.util.ArrayList;

/* renamed from: X.1wK, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC41701wK {
    public static FxCalAccountLinkageInfo parseFromJson(C16L c16l) {
        String str;
        C14360o3.A0B(c16l, 0);
        try {
            FxCalAccountLinkageInfo fxCalAccountLinkageInfo = new FxCalAccountLinkageInfo();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0q = c16l.A0q();
                c16l.A1J();
                ArrayList arrayList = null;
                if ("accounts".equals(A0q)) {
                    if (c16l.A11() == C16R.A0C) {
                        arrayList = new ArrayList();
                        while (c16l.A1J() != C16R.A08) {
                            FxCalAccount parseFromJson = AbstractC906742c.parseFromJson(c16l);
                            if (parseFromJson != null) {
                                arrayList.add(parseFromJson);
                            }
                        }
                    }
                    C14360o3.A0B(arrayList, 0);
                    fxCalAccountLinkageInfo.A02 = arrayList;
                } else if ("last_update_time_ms".equals(A0q)) {
                    fxCalAccountLinkageInfo.A00 = c16l.A0y();
                } else if ("data_source".equals(A0q)) {
                    if (c16l.A11() == C16R.A0G || (str = c16l.A1P()) == null) {
                        str = "UNSET";
                    }
                    Integer A00 = AbstractC41441vt.A00(str);
                    C14360o3.A0B(A00, 0);
                    fxCalAccountLinkageInfo.A01 = A00;
                }
                c16l.A0z();
            }
            return fxCalAccountLinkageInfo;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
