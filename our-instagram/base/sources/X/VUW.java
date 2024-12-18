package X;

import com.facebook.react.modules.dialog.DialogModule;
import java.io.IOException;
import java.util.ArrayList;

/* loaded from: classes11.dex */
public abstract class VUW {
    public static C68994VfW parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            C68994VfW c68994VfW = new C68994VfW();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                ArrayList arrayList = null;
                if ("header".equals(A0s)) {
                    c68994VfW.A00 = AbstractC167017dG.A0m(c16l);
                } else if (DialogModule.KEY_ITEMS.equals(A0s)) {
                    if (c16l.A11() == C16R.A0C) {
                        arrayList = new ArrayList();
                        while (c16l.A1J() != C16R.A08) {
                            C69234Vk2 parseFromJson = VUV.parseFromJson(c16l);
                            if (parseFromJson != null) {
                                arrayList.add(parseFromJson);
                            }
                        }
                    }
                    c68994VfW.A01 = arrayList;
                }
                c16l.A0z();
            }
            return c68994VfW;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
