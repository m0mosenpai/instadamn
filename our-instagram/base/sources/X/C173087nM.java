package X;

import java.io.IOException;

/* renamed from: X.7nM, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C173087nM {
    /* JADX WARN: Type inference failed for: r0v2, types: [X.7nL, X.1um, X.1ul] */
    public static C173077nL parseFromJson(C16L c16l) {
        String A1P;
        C14360o3.A0B(c16l, 0);
        try {
            ?? c40791um = new C40791um();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0q = c16l.A0q();
                c16l.A1J();
                if ("message_prefs".equals(A0q)) {
                    if (c16l.A11() == C16R.A0G) {
                        A1P = null;
                    } else {
                        A1P = c16l.A1P();
                    }
                    c40791um.A03 = A1P;
                } else if ("save_to_camera_roll".equals(A0q)) {
                    c40791um.A02 = Boolean.valueOf(c16l.A0d());
                } else if ("blocked_reels".equals(A0q)) {
                    c40791um.A00 = AbstractC173887og.parseFromJson(c16l);
                } else if ("besties".equals(A0q)) {
                    c40791um.A01 = AbstractC173907oi.parseFromJson(c16l);
                } else if ("persist_stories_to_private_profile".equals(A0q)) {
                    c16l.A0d();
                } else if ("allow_story_reshare".equals(A0q)) {
                    c40791um.A04 = c16l.A0d();
                } else {
                    C55702hA.A01(c16l, c40791um, A0q);
                }
                c16l.A0z();
            }
            return c40791um;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
