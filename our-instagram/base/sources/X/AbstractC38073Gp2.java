package X;

import java.io.IOException;

/* renamed from: X.Gp2, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC38073Gp2 {
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, X.Goo] */
    public static C38061Goo parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            ?? obj = new Object();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0q = c16l.A0q();
                c16l.A1J();
                if ("track".equals(A0q)) {
                    obj.A08 = AbstractC84383pX.parseFromJson(c16l);
                } else if ("metadata".equals(A0q)) {
                    obj.A0A = AbstractC38068Gox.parseFromJson(c16l);
                } else if ("original_sound".equals(A0q)) {
                    obj.A05 = C3XP.parseFromJson(c16l);
                } else if ("original_sound_schema".equals(A0q)) {
                    obj.A06 = C3XP.parseFromJson(c16l);
                } else if ("mood".equals(A0q)) {
                    obj.A01 = AbstractC40091HqI.parseFromJson(c16l);
                } else if ("genre".equals(A0q)) {
                    obj.A00 = AbstractC39942HnX.parseFromJson(c16l);
                } else if ("playlist".equals(A0q)) {
                    obj.A07 = AbstractC40144HrD.parseFromJson(c16l);
                } else if ("category".equals(A0q)) {
                    obj.A04 = AbstractC39804HlE.parseFromJson(c16l);
                } else if ("collection".equals(A0q)) {
                    obj.A03 = AbstractC39752HkO.parseFromJson(c16l);
                } else if ("artist".equals(A0q)) {
                    obj.A02 = AbstractC39747HkJ.parseFromJson(c16l);
                }
                c16l.A0z();
            }
            obj.A02();
            return obj;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
