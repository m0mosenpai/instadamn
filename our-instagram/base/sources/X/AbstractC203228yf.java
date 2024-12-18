package X;

import java.io.IOException;
import java.io.StringWriter;

/* renamed from: X.8yf, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC203228yf {
    public static C203238yg parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            C203238yg c203238yg = new C203238yg();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0q = c16l.A0q();
                c16l.A1J();
                String str = null;
                if ("draft_id".equals(A0q)) {
                    if (c16l.A11() != C16R.A0G) {
                        str = c16l.A1P();
                    }
                    c203238yg.A07 = str;
                } else if ("revision_id".equals(A0q)) {
                    if (c16l.A11() != C16R.A0G) {
                        str = c16l.A1P();
                    }
                    C14360o3.A0B(str, 0);
                    c203238yg.A08 = str;
                } else if ("composition_id".equals(A0q)) {
                    if (c16l.A11() != C16R.A0G) {
                        str = c16l.A1P();
                    }
                    C14360o3.A0B(str, 0);
                    c203238yg.A05 = str;
                } else if ("date_created".equals(A0q)) {
                    c203238yg.A00 = c16l.A0y();
                } else if ("date_modified".equals(A0q)) {
                    c203238yg.A01 = c16l.A0y();
                } else if ("media_info".equals(A0q)) {
                    c203238yg.A02 = AbstractC196968nR.parseFromJson(c16l);
                } else if ("persisted_media_info".equals(A0q)) {
                    c203238yg.A03 = AbstractC196968nR.parseFromJson(c16l);
                } else if ("media_edits".equals(A0q)) {
                    c203238yg.A04 = AbstractC203258yi.parseFromJson(c16l);
                } else if ("cover_file_path".equals(A0q)) {
                    if (c16l.A11() != C16R.A0G) {
                        str = c16l.A1P();
                    }
                    c203238yg.A06 = str;
                } else if ("visible".equals(A0q)) {
                    c203238yg.A09 = c16l.A0d();
                }
                c16l.A0z();
            }
            return c203238yg;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }

    public static String A00(C203238yg c203238yg) {
        StringWriter stringWriter = new StringWriter();
        C17z A0A = AbstractC221915u.A00.A0A(stringWriter);
        A0A.A0d();
        String str = c203238yg.A07;
        if (str != null) {
            A0A.A0S("draft_id", str);
        }
        String str2 = c203238yg.A08;
        if (str2 != null) {
            A0A.A0S("revision_id", str2);
        }
        String str3 = c203238yg.A05;
        if (str3 != null) {
            A0A.A0S("composition_id", str3);
        }
        A0A.A0R("date_created", c203238yg.A00);
        A0A.A0R("date_modified", c203238yg.A01);
        if (c203238yg.A02 != null) {
            A0A.A0r("media_info");
            AbstractC196968nR.A00(A0A, c203238yg.A02);
        }
        if (c203238yg.A03 != null) {
            A0A.A0r("persisted_media_info");
            AbstractC196968nR.A00(A0A, c203238yg.A03);
        }
        if (c203238yg.A04 != null) {
            A0A.A0r("media_edits");
            AbstractC203258yi.A00(A0A, c203238yg.A04);
        }
        String str4 = c203238yg.A06;
        if (str4 != null) {
            A0A.A0S("cover_file_path", str4);
        }
        A0A.A0T("visible", c203238yg.A09);
        A0A.A0a();
        A0A.close();
        return stringWriter.toString();
    }
}
