package X;

import java.io.IOException;

/* renamed from: X.KrX, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public abstract class AbstractC47076KrX {
    public static MUD parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            String str = null;
            String str2 = null;
            EnumC46250KdR enumC46250KdR = null;
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("text".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str = null;
                    } else {
                        str = c16l.A1P();
                    }
                } else if ("dest".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str2 = null;
                    } else {
                        str2 = c16l.A1P();
                    }
                } else if ("style".equals(A0s)) {
                    enumC46250KdR = EnumC46250KdR.parseFromJson(c16l);
                }
                c16l.A0z();
            }
            return new MUD(enumC46250KdR, str2, str, 28);
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
