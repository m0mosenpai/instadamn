package X;

import com.facebook.react.modules.dialog.DialogModule;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;

/* loaded from: classes11.dex */
public abstract class VXX {
    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, X.VkK] */
    public static C69251VkK parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            ?? obj = new Object();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if (DialogModule.KEY_TITLE.equals(A0s)) {
                    obj.A01 = IAW.parseFromJson(c16l);
                } else if ("first_paragraph".equals(A0s)) {
                    obj.A00 = IAW.parseFromJson(c16l);
                } else if ("policies".equals(A0s)) {
                    ArrayList arrayList = null;
                    if (c16l.A11() == C16R.A0C) {
                        arrayList = new ArrayList();
                        while (c16l.A1J() != C16R.A08) {
                            VJ3 parseFromJson = VXY.parseFromJson(c16l);
                            if (parseFromJson != null) {
                                arrayList.add(parseFromJson);
                            }
                        }
                    }
                    obj.A02 = arrayList;
                }
                c16l.A0z();
            }
            if (obj.A02 == null) {
                obj.A02 = Collections.emptyList();
                return obj;
            }
            return obj;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
