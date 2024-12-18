package X;

import java.io.IOException;

/* renamed from: X.91w, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC2042491w {
    public static AnonymousClass923 parseFromJson(C16L c16l) {
        String A00;
        String A002;
        C14360o3.A0B(c16l, 0);
        try {
            Boolean bool = null;
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            C2042591y c2042591y = null;
            AnonymousClass921 anonymousClass921 = null;
            while (true) {
                C16R A1J = c16l.A1J();
                C16R c16r = C16R.A09;
                A00 = AbstractC111324zv.A00(830);
                A002 = AbstractC111324zv.A00(180);
                if (A1J == c16r) {
                    break;
                }
                String A0q = c16l.A0q();
                c16l.A1J();
                if (A002.equals(A0q)) {
                    bool = Boolean.valueOf(c16l.A0d());
                } else if (A00.equals(A0q)) {
                    c2042591y = C91x.parseFromJson(c16l);
                } else if ("original_media".equals(A0q)) {
                    anonymousClass921 = AnonymousClass920.parseFromJson(c16l);
                }
                c16l.A0z();
            }
            if (bool == null && (c16l instanceof C07950bF)) {
                ((C07950bF) c16l).A03.A00(A002, "VisualRepliesInfo");
            } else if (c2042591y != null || !(c16l instanceof C07950bF)) {
                if (anonymousClass921 == null && (c16l instanceof C07950bF)) {
                    ((C07950bF) c16l).A03.A00("original_media", "VisualRepliesInfo");
                } else {
                    return new AnonymousClass923(c2042591y, anonymousClass921, bool.booleanValue());
                }
            } else {
                ((C07950bF) c16l).A03.A00(A00, "VisualRepliesInfo");
            }
            throw C00O.createAndThrow();
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
