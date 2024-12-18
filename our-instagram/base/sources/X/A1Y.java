package X;

import java.io.IOException;

/* loaded from: classes4.dex */
public abstract class A1Y {
    /* JADX WARN: Type inference failed for: r0v3, types: [X.A67, java.lang.Object] */
    public static A67 parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            ?? obj = new Object();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                if ("presence_event".equals(AbstractC166997dE.A0s(c16l))) {
                    C130725vK parseFromJson = AbstractC130715vJ.parseFromJson(c16l);
                    C14360o3.A0B(parseFromJson, 0);
                    obj.A00 = parseFromJson;
                }
                c16l.A0z();
            }
            return obj;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
