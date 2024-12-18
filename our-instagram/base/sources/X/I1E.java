package X;

import java.io.IOException;

/* loaded from: classes7.dex */
public abstract class I1E {
    /* JADX WARN: Type inference failed for: r0v3, types: [X.5z5, java.lang.Object] */
    public static C132825z5 parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            ?? obj = new Object();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0q = c16l.A0q();
                if (AbstractC37301Gc2.A1V(c16l, A0q)) {
                    obj.A07 = AbstractC167017dG.A0m(c16l);
                } else if (AbstractC37300Gc1.A1E(A0q)) {
                    obj.A02 = I1B.A00(c16l.A1Q());
                } else if ("owner".equals(A0q)) {
                    obj.A03 = AbstractC31171DnF.A0S(c16l, false);
                } else if (AbstractC31171DnF.A1a(A0q)) {
                    obj.A08 = AbstractC167017dG.A0m(c16l);
                } else if (AbstractC37300Gc1.A1Q(A0q)) {
                    obj.A06 = AbstractC167017dG.A0m(c16l);
                } else if ("feedback_item".equals(A0q)) {
                    obj.A01 = C38321qM.A00(c16l);
                } else if ("mixed_cover_media".equals(A0q)) {
                    obj.A00 = IQS.parseFromJson(c16l);
                } else if ("num_items".equals(A0q)) {
                    obj.A04 = AbstractC166997dE.A0h(c16l);
                } else if ("can_viewer_reshare".equals(A0q)) {
                    obj.A09 = c16l.A0d();
                } else if ("updated_timestamp".equals(A0q)) {
                    obj.A05 = AbstractC31173DnH.A0h(c16l);
                } else if ("is_draft".equals(A0q)) {
                    obj.A0A = c16l.A0d();
                } else if ("feedback_enabled".equals(A0q)) {
                    obj.A0B = c16l.A0d();
                } else if ("show_map".equals(A0q)) {
                    c16l.A0d();
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
