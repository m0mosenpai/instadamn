package X;

import com.instagram.model.venue.LocationDict;
import java.io.IOException;

/* loaded from: classes11.dex */
public abstract class VSV {
    /* JADX WARN: Type inference failed for: r0v2, types: [X.6RO, java.lang.Object, X.9kJ] */
    public static C217869kJ parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            ?? obj = new Object();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("venue".equals(A0s)) {
                    LocationDict parseFromJson = AbstractC84373pU.parseFromJson(c16l);
                    C14360o3.A0B(parseFromJson, 0);
                    obj.A00 = parseFromJson;
                } else if ("themed_color".equals(A0s)) {
                    obj.A01 = AbstractC166997dE.A0h(c16l);
                } else {
                    ADU.A01(c16l, obj, A0s);
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
