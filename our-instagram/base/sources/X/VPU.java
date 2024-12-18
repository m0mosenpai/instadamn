package X;

import com.instagram.debug.devoptions.sandboxselector.DevServerEntity;
import java.io.IOException;

/* loaded from: classes11.dex */
public abstract class VPU {
    /* JADX WARN: Type inference failed for: r1v2, types: [X.VJQ, java.lang.Object] */
    public static VJQ parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            String str = null;
            C68935VeZ c68935VeZ = null;
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if (DevServerEntity.COLUMN_DESCRIPTION.equals(A0s)) {
                    if (c16l.A11() == C16R.A0G) {
                        str = null;
                    } else {
                        str = c16l.A1P();
                    }
                } else if ("effect".equals(A0s)) {
                    c68935VeZ = VPT.parseFromJson(c16l);
                }
                c16l.A0z();
            }
            ?? obj = new Object();
            obj.A00 = -1;
            obj.A02 = str;
            obj.A01 = c68935VeZ;
            return obj;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
