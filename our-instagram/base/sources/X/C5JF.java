package X;

import java.io.IOException;

/* renamed from: X.5JF, reason: invalid class name */
/* loaded from: classes3.dex */
public abstract class C5JF {
    public static C9ZE parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            C9ZE c9ze = new C9ZE();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0q = c16l.A0q();
                c16l.A1J();
                String str = null;
                if ("source_media_collection_id".equals(A0q)) {
                    if (c16l.A11() != C16R.A0G) {
                        str = c16l.A1P();
                    }
                    c9ze.A03 = str;
                } else if ("source_media_id".equals(A0q)) {
                    c9ze.A01 = Long.valueOf(c16l.A0y());
                } else if ("source_medium_id".equals(A0q)) {
                    c9ze.A02 = Long.valueOf(c16l.A0y());
                } else if ("acr_type".equals(A0q)) {
                    if (c16l.A11() != C16R.A0G) {
                        str = c16l.A1P();
                    }
                    c9ze.A00 = C9JF.A00(str);
                } else if ("template_clips_media_id".equals(A0q)) {
                    if (c16l.A11() != C16R.A0G) {
                        str = c16l.A1P();
                    }
                    c9ze.A04 = str;
                }
                c16l.A0z();
            }
            return c9ze;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
