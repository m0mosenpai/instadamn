package X;

import com.instagram.api.schemas.DirectAudioFallbackUrlImpl;
import java.io.IOException;

/* renamed from: X.4G4, reason: invalid class name */
/* loaded from: classes2.dex */
public abstract class C4G4 {
    public static DirectAudioFallbackUrlImpl parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            String str = null;
            while (c16l.A1J() != C16R.A09) {
                String A0q = c16l.A0q();
                c16l.A1J();
                if ("audio_src".equals(A0q)) {
                    if (c16l.A11() == C16R.A0G) {
                        str = null;
                    } else {
                        str = c16l.A1P();
                    }
                }
                c16l.A0z();
            }
            if (str == null && (c16l instanceof C07950bF)) {
                ((C07950bF) c16l).A03.A00("audio_src", "DirectAudioFallbackUrlImpl");
                throw C00O.createAndThrow();
            }
            return new DirectAudioFallbackUrlImpl(str);
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}