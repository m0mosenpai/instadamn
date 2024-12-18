package X;

import java.io.IOException;

/* loaded from: classes7.dex */
public final class IT7 {
    /* JADX WARN: Type inference failed for: r2v0, types: [X.HKr, X.3Vk] */
    public static C39138HKr parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            ?? c74293Vk = new C74293Vk();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0q = c16l.A0q();
                if (AbstractC37304Gc5.A1Z(c16l, A0q)) {
                    AbstractC31178DnM.A1I(c16l);
                } else if ("media_count".equals(A0q)) {
                    c16l.A1D();
                } else {
                    C74313Vm.A00(c16l, c74293Vk, A0q);
                }
                c16l.A0z();
            }
            return c74293Vk;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
