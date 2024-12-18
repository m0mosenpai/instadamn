package X;

import java.io.IOException;

/* renamed from: X.ONn, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C54862ONn {
    public static N39 parseFromJson(C16L c16l) {
        String A1P;
        C14360o3.A0B(c16l, 0);
        try {
            N39 n39 = new N39();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("live_archive_setting".equals(A0s)) {
                    String A1Q = c16l.A1Q();
                    C14360o3.A0B(A1Q, 0);
                    EnumC53221NgJ enumC53221NgJ = (EnumC53221NgJ) EnumC53221NgJ.A01.get(A1Q);
                    if (enumC53221NgJ == null) {
                        enumC53221NgJ = EnumC53221NgJ.A06;
                    }
                    n39.A01 = enumC53221NgJ;
                } else if ("live_badge_setting".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        A1P = null;
                    } else {
                        A1P = c16l.A1P();
                    }
                    n39.A00 = AbstractC109824x9.A00(A1P);
                } else if ("passes_live_badge_mes".equals(A0s)) {
                    c16l.A0d();
                } else if ("passed_live_badge_onboarding".equals(A0s)) {
                    n39.A03 = c16l.A0d();
                } else if ("live_auto_save_setting".equals(A0s)) {
                    String A1Q2 = c16l.A1Q();
                    C14360o3.A0B(A1Q2, 0);
                    EnumC53212NgA.A01.get(A1Q2);
                } else if ("blocked_lives".equals(A0s)) {
                    C173897oh parseFromJson = AbstractC173887og.parseFromJson(c16l);
                    C14360o3.A0B(parseFromJson, 0);
                    n39.A02 = parseFromJson;
                } else {
                    C55702hA.A01(c16l, n39, A0s);
                }
                c16l.A0z();
            }
            return n39;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
