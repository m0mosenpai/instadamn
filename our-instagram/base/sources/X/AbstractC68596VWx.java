package X;

import java.io.IOException;
import java.util.ArrayList;

/* renamed from: X.VWx, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public abstract class AbstractC68596VWx {
    /* JADX WARN: Type inference failed for: r0v3, types: [X.Wia, java.lang.Object] */
    public static C70869Wia parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            ?? obj = new Object();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("background_color".equals(A0s)) {
                    obj.A00 = c16l.A1D();
                } else {
                    ArrayList arrayList = null;
                    if ("serializable_paths".equals(A0s)) {
                        if (c16l.A11() == C16R.A0C) {
                            arrayList = new ArrayList();
                            while (c16l.A1J() != C16R.A08) {
                                C139136Ru parseFromJson = AbstractC69984Vz3.parseFromJson(c16l);
                                if (parseFromJson != null) {
                                    arrayList.add(parseFromJson);
                                }
                            }
                        }
                        obj.A02 = arrayList;
                    } else if ("text_emphasis_mode".equals(A0s)) {
                        obj.A01 = A2Y.A00(AbstractC167017dG.A0m(c16l));
                    }
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
