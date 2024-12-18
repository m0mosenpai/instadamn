package X;

import com.facebook.react.modules.dialog.DialogModule;
import java.io.IOException;
import java.util.ArrayList;

/* renamed from: X.VUa, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public abstract class AbstractC68521VUa {
    public static C68995VfX parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            C68995VfX c68995VfX = new C68995VfX();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                ArrayList arrayList = null;
                if ("header".equals(A0s)) {
                    c68995VfX.A00 = AbstractC167017dG.A0m(c16l);
                } else if (DialogModule.KEY_ITEMS.equals(A0s)) {
                    if (c16l.A11() == C16R.A0C) {
                        arrayList = new ArrayList();
                        while (c16l.A1J() != C16R.A08) {
                            ViC parseFromJson = VUZ.parseFromJson(c16l);
                            if (parseFromJson != null) {
                                arrayList.add(parseFromJson);
                            }
                        }
                    }
                    c68995VfX.A01 = arrayList;
                }
                c16l.A0z();
            }
            return c68995VfX;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
