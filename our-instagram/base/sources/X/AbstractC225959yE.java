package X;

import com.instagram.common.gallery.metadata.ImmersiveMediaFields;
import java.io.IOException;

/* renamed from: X.9yE, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC225959yE {
    public static ImmersiveMediaFields parseFromJson(C16L c16l) {
        String A1P;
        C14360o3.A0B(c16l, 0);
        try {
            ImmersiveMediaFields immersiveMediaFields = new ImmersiveMediaFields();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("glbUrl".equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        A1P = null;
                    } else {
                        A1P = c16l.A1P();
                    }
                    immersiveMediaFields.A00 = A1P;
                } else if (AbstractC111324zv.A00(2588).equals(A0s)) {
                    immersiveMediaFields.A01 = c16l.A0d();
                }
                c16l.A0z();
            }
            return immersiveMediaFields;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
