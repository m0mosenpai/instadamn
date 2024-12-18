package X;

import java.io.IOException;

/* renamed from: X.VXf, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public abstract class AbstractC68604VXf {
    /* JADX WARN: Type inference failed for: r0v2, types: [X.VdJ, java.lang.Object] */
    public static C68863VdJ parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            ?? obj = new Object();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                if ("ig_supervised_user_screen_time_settings_subscribe".equals(AbstractC166997dE.A0s(c16l))) {
                    C69252VkL parseFromJson = AbstractC68605VXg.parseFromJson(c16l);
                    C14360o3.A0B(parseFromJson, 0);
                    obj.A00 = parseFromJson;
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
