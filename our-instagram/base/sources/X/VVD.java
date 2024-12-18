package X;

import com.facebook.react.modules.dialog.DialogModule;
import java.io.IOException;
import java.util.HashMap;

/* loaded from: classes11.dex */
public abstract class VVD {
    /* JADX WARN: Type inference failed for: r1v1, types: [X.ViP, java.lang.Object] */
    public static C69134ViP parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            ?? obj = new Object();
            C16R A11 = c16l.A11();
            C16R c16r = C16R.A0D;
            if (A11 != c16r) {
                c16l.A0z();
                return null;
            }
            while (true) {
                C16R A1J = c16l.A1J();
                C16R c16r2 = C16R.A09;
                if (A1J != c16r2) {
                    String A0s = AbstractC166997dE.A0s(c16l);
                    HashMap hashMap = null;
                    if (DialogModule.KEY_TITLE.equals(A0s)) {
                        obj.A01 = AbstractC167017dG.A0m(c16l);
                    } else if (MSV.A00(395).equals(A0s)) {
                        obj.A00 = AbstractC167017dG.A0m(c16l);
                    } else if (AbstractC58317Pt9.A00(234).equals(A0s)) {
                        if (c16l.A11() == c16r) {
                            hashMap = new HashMap();
                            while (c16l.A1J() != c16r2) {
                                AbstractC31179DnN.A1F(c16l, hashMap);
                            }
                        }
                        obj.A02 = hashMap;
                    }
                    c16l.A0z();
                } else {
                    return obj;
                }
            }
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
