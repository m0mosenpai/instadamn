package X;

import com.facebook.react.modules.dialog.DialogModule;
import java.io.IOException;
import java.util.ArrayList;

/* loaded from: classes11.dex */
public abstract class VXZ {
    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, X.VlL] */
    public static C69313VlL parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            ?? obj = new Object();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                ArrayList arrayList = null;
                if ("tag_type".equals(A0s)) {
                    obj.A02 = AbstractC167017dG.A0m(c16l);
                } else if (DialogModule.KEY_TITLE.equals(A0s)) {
                    obj.A01 = IAW.parseFromJson(c16l);
                } else if ("subtitle".equals(A0s)) {
                    obj.A00 = IAW.parseFromJson(c16l);
                } else if ("subtags".equals(A0s)) {
                    if (c16l.A11() == C16R.A0C) {
                        arrayList = new ArrayList();
                        while (c16l.A1J() != C16R.A08) {
                            C69313VlL parseFromJson = parseFromJson(c16l);
                            if (parseFromJson != null) {
                                arrayList.add(parseFromJson);
                            }
                        }
                    }
                    obj.A03 = arrayList;
                } else if ("show_auto_report".equals(A0s)) {
                    c16l.A0d();
                }
                c16l.A0z();
            }
            return obj;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
