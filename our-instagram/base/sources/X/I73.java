package X;

import java.io.IOException;

/* loaded from: classes7.dex */
public abstract class I73 {
    /* JADX WARN: Type inference failed for: r0v4, types: [X.IJm, java.lang.Object] */
    public static C41147IJm parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            ?? obj = new Object();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("layout_type".equals(A0s)) {
                    obj.A03 = I89.A00(AbstractC167017dG.A0m(c16l));
                } else if (AbstractC31171DnF.A1a(A0s)) {
                    obj.A04 = AbstractC167017dG.A0m(c16l);
                } else if (AbstractC37300Gc1.A1F(A0s)) {
                    obj.A00 = C74313Vm.parseFromJson(c16l);
                } else if ("pivot_items".equals(A0s)) {
                    obj.A02 = I7F.parseFromJson(c16l);
                } else if ("cta".equals(A0s)) {
                    obj.A01 = I72.parseFromJson(c16l);
                } else if ("show_attribution".equals(A0s)) {
                    obj.A05 = c16l.A0d();
                }
                c16l.A0z();
            }
            return obj;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
