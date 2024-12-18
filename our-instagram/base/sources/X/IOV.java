package X;

import com.instagram.api.schemas.MediaKitVisibility;
import java.io.IOException;

/* loaded from: classes7.dex */
public final class IOV {
    /* JADX WARN: Type inference failed for: r3v0, types: [X.H94, X.1um, X.1ul] */
    public static H94 parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            ?? c40791um = new C40791um();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("share_link".equals(A0s)) {
                    c40791um.A02 = AbstractC167017dG.A0m(c16l);
                } else if ("visibility".equals(A0s)) {
                    MediaKitVisibility mediaKitVisibility = (MediaKitVisibility) MediaKitVisibility.A01.get(AbstractC167017dG.A0m(c16l));
                    if (mediaKitVisibility == null) {
                        mediaKitVisibility = MediaKitVisibility.A06;
                    }
                    c40791um.A01 = mediaKitVisibility;
                } else {
                    C55702hA.A01(c16l, c40791um, A0s);
                }
                c16l.A0z();
            }
            String str = c40791um.A02;
            MediaKitVisibility mediaKitVisibility2 = c40791um.A01;
            C14360o3.A0A(mediaKitVisibility2);
            c40791um.A00 = new C51790Muu(mediaKitVisibility2, str);
            return c40791um;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
