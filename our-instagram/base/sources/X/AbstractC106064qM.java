package X;

import java.io.IOException;

/* renamed from: X.4qM, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC106064qM {
    public static C106074qN parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            String str = null;
            Boolean bool = null;
            while (c16l.A1J() != C16R.A09) {
                String A0q = c16l.A0q();
                c16l.A1J();
                if ("emoji".equals(A0q)) {
                    if (c16l.A11() == C16R.A0G) {
                        str = null;
                    } else {
                        str = c16l.A1P();
                    }
                } else if ("viewer_has_reacted".equals(A0q)) {
                    bool = Boolean.valueOf(c16l.A0d());
                }
                c16l.A0z();
            }
            if (str == null && (c16l instanceof C07950bF)) {
                ((C07950bF) c16l).A03.A00("emoji", "ReactionStickerModel");
            } else if (bool == null && (c16l instanceof C07950bF)) {
                ((C07950bF) c16l).A03.A00("viewer_has_reacted", "ReactionStickerModel");
            } else {
                return new C106074qN(str, bool.booleanValue());
            }
            throw C00O.createAndThrow();
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }

    public static void A00(AnonymousClass182 anonymousClass182, C106074qN c106074qN) {
        anonymousClass182.A0d();
        String str = c106074qN.A00;
        if (str != null) {
            anonymousClass182.A0S("emoji", str);
        }
        anonymousClass182.A0T("viewer_has_reacted", c106074qN.A01);
        anonymousClass182.A0a();
    }
}
