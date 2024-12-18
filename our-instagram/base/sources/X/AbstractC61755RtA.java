package X;

import java.io.IOException;

/* renamed from: X.RtA, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public abstract class AbstractC61755RtA {
    /* JADX WARN: Type inference failed for: r0v3, types: [X.SID, java.lang.Object] */
    public static SID parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            ?? obj = new Object();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("download_url".equals(A0s)) {
                    obj.A04 = AbstractC167017dG.A0m(c16l);
                } else if ("uncompressed_file_sha256_checksum".equals(A0s)) {
                    obj.A03 = AbstractC167017dG.A0m(c16l);
                } else if ("uncompressed_file_size".equals(A0s)) {
                    obj.A00 = c16l.A1D();
                } else if ("dod_version_number".equals(A0s)) {
                    obj.A01 = c16l.A1D();
                } else if ("compression_format".equals(A0s)) {
                    obj.A02 = AbstractC167017dG.A0m(c16l);
                }
                c16l.A0z();
            }
            return obj;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
