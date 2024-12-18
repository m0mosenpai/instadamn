package X;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.6te, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C152516te {
    /* JADX WARN: Type inference failed for: r2v0, types: [X.6td, X.1um, X.1ul] */
    public static C152506td parseFromJson(C16L c16l) {
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
                String str2 = null;
                String str3 = null;
                ArrayList arrayList = null;
                String str4 = null;
                if ("avatar_id".equals(A0q)) {
                    if (c16l.A11() != C16R.A0G) {
                        str2 = c16l.A1P();
                    }
                    c40791um.A05 = str2;
                } else if ("avatar_revision_id".equals(A0q)) {
                    if (c16l.A11() != C16R.A0G) {
                        str3 = c16l.A1P();
                    }
                    c40791um.A06 = str3;
                } else if ("avatar_sticker_profiles".equals(A0q)) {
                    if (c16l.A11() == C16R.A0C) {
                        arrayList = new ArrayList();
                        while (c16l.A1J() != C16R.A08) {
                            C151486rs parseFromJson = AbstractC151476rq.parseFromJson(c16l);
                            if (parseFromJson != null) {
                                arrayList.add(parseFromJson);
                            }
                        }
                    }
                    c40791um.A09 = arrayList;
                } else if ("avatar_style".equals(A0q)) {
                    if (c16l.A11() != C16R.A0G) {
                        str4 = c16l.A1P();
                    }
                    c40791um.A07 = str4;
                } else if ("background_choice".equals(A0q)) {
                    c40791um.A00 = JZ2.parseFromJson(c16l);
                } else if ("coin_flip_enabled".equals(A0q)) {
                    c40791um.A02 = Boolean.valueOf(c16l.A0d());
                } else if ("has_deprecated_pose".equals(A0q)) {
                    c40791um.A03 = Boolean.valueOf(c16l.A0d());
                } else if ("is_coin_flip_tied_to_avatar".equals(A0q)) {
                    c40791um.A04 = Boolean.valueOf(c16l.A0d());
                } else if ("sticker_pack_id".equals(A0q)) {
                    if (c16l.A11() != C16R.A0G) {
                        str = c16l.A1P();
                    }
                    c40791um.A08 = str;
                } else {
                    C55702hA.A01(c16l, c40791um, A0q);
                }
                c16l.A0z();
            }
            String str5 = c40791um.A05;
            String str6 = c40791um.A06;
            List list = c40791um.A09;
            C14360o3.A0A(list);
            c40791um.A01 = new C152556ti(c40791um.A00, c40791um.A02, c40791um.A03, c40791um.A04, str5, str6, c40791um.A07, c40791um.A08, list);
            return c40791um;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
