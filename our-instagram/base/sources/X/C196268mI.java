package X;

import java.io.IOException;

/* renamed from: X.8mI, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C196268mI {
    /* JADX WARN: Type inference failed for: r1v1, types: [X.8mH, X.1um, X.1ul] */
    public static C196258mH parseFromJson(C16L c16l) {
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
                if ("default_share_to_fb_enabled".equals(A0q)) {
                    c40791um.A01 = Boolean.valueOf(c16l.A0d());
                } else if ("oa_reuse_on_fb_enabled".equals(A0q)) {
                    c40791um.A02 = Boolean.valueOf(c16l.A0d());
                } else if ("share_to_fb_unavailable".equals(A0q)) {
                    c40791um.A03 = Boolean.valueOf(c16l.A0d());
                } else if ("show_bonus_prompt_in_creation".equals(A0q)) {
                    c40791um.A04 = Boolean.valueOf(c16l.A0d());
                } else if ("show_share_to_fb_prompt_in_creation_flow".equals(A0q)) {
                    c40791um.A05 = Boolean.valueOf(c16l.A0d());
                } else if ("show_share_to_fb_prompt_in_media_viewer".equals(A0q)) {
                    c40791um.A06 = Boolean.valueOf(c16l.A0d());
                } else {
                    C55702hA.A01(c16l, c40791um, A0q);
                }
                c16l.A0z();
            }
            Boolean bool = c40791um.A01;
            C14360o3.A0A(bool);
            boolean booleanValue = bool.booleanValue();
            Boolean bool2 = c40791um.A02;
            C14360o3.A0A(bool2);
            boolean booleanValue2 = bool2.booleanValue();
            Boolean bool3 = c40791um.A03;
            C14360o3.A0A(bool3);
            boolean booleanValue3 = bool3.booleanValue();
            Boolean bool4 = c40791um.A04;
            C14360o3.A0A(bool4);
            boolean booleanValue4 = bool4.booleanValue();
            Boolean bool5 = c40791um.A05;
            C14360o3.A0A(bool5);
            boolean booleanValue5 = bool5.booleanValue();
            Boolean bool6 = c40791um.A06;
            C14360o3.A0A(bool6);
            c40791um.A00 = new C126015mt(booleanValue, booleanValue2, booleanValue3, booleanValue4, booleanValue5, bool6.booleanValue());
            return c40791um;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
