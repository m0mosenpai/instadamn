package X;

import java.io.IOException;

/* renamed from: X.8uG, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C200738uG {
    /* JADX WARN: Type inference failed for: r2v0, types: [X.1um, X.8uF, X.1ul] */
    public static C200728uF parseFromJson(C16L c16l) {
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
                String str = null;
                if ("avatar_revision_id".equals(A0q)) {
                    if (c16l.A11() != C16R.A0G) {
                        str = c16l.A1P();
                    }
                    c40791um.A03 = str;
                } else if ("avatar_version_info".equals(A0q)) {
                    c40791um.A00 = AbstractC201008uh.parseFromJson(c16l);
                } else if ("config_hash".equals(A0q)) {
                    if (c16l.A11() != C16R.A0G) {
                        str = c16l.A1P();
                    }
                    c40791um.A04 = str;
                } else if ("requested_sticker_refresh".equals(A0q)) {
                    c40791um.A02 = Boolean.valueOf(c16l.A0d());
                } else if ("sticker_pack_id".equals(A0q)) {
                    if (c16l.A11() != C16R.A0G) {
                        str = c16l.A1P();
                    }
                    c40791um.A05 = str;
                } else {
                    C55702hA.A01(c16l, c40791um, A0q);
                }
                c16l.A0z();
            }
            String str2 = c40791um.A03;
            C201018ui c201018ui = c40791um.A00;
            C14360o3.A0A(c201018ui);
            String str3 = c40791um.A04;
            Boolean bool = c40791um.A02;
            C14360o3.A0A(bool);
            boolean booleanValue = bool.booleanValue();
            String str4 = c40791um.A05;
            C14360o3.A0A(str4);
            c40791um.A01 = new C201028uj(c201018ui, str2, str3, str4, booleanValue);
            return c40791um;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
