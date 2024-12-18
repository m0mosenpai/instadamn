package X;

import java.io.IOException;

/* loaded from: classes7.dex */
public abstract class IAZ {
    /* JADX WARN: Type inference failed for: r0v3, types: [X.IDn, java.lang.Object] */
    public static C40992IDn parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            ?? obj = new Object();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                if ("ig_supervised_user_quiet_time_settings_subscribe".equals(AbstractC166997dE.A0s(c16l))) {
                    C41056IFz parseFromJson = IAY.parseFromJson(c16l);
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
