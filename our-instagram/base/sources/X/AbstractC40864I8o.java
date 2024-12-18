package X;

import com.facebook.react.modules.dialog.DialogModule;
import java.io.IOException;

/* renamed from: X.I8o, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC40864I8o {
    public static C51757Mtg parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            C51757Mtg c51757Mtg = new C51757Mtg(29);
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("selection_limit_type".equals(A0s)) {
                    EnumC39575Hdl enumC39575Hdl = (EnumC39575Hdl) EnumC39575Hdl.A01.get(AbstractC167017dG.A0m(c16l));
                    if (enumC39575Hdl == null) {
                        enumC39575Hdl = EnumC39575Hdl.A08;
                    }
                    c51757Mtg.A00 = enumC39575Hdl;
                } else if ("selection_limit_value".equals(A0s)) {
                    c51757Mtg.A01 = AbstractC166997dE.A0h(c16l);
                } else if (DialogModule.KEY_MESSAGE.equals(A0s)) {
                    c51757Mtg.A02 = AbstractC167017dG.A0m(c16l);
                }
                c16l.A0z();
            }
            return c51757Mtg;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
