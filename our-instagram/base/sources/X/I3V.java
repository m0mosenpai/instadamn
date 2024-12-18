package X;

import com.instagram.model.shopping.drops.DropsLaunchAnimation;
import java.io.IOException;

/* loaded from: classes7.dex */
public abstract class I3V {
    public static DropsLaunchAnimation parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            Boolean bool = null;
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                if ("show_animation".equals(AbstractC166997dE.A0s(c16l))) {
                    bool = AbstractC166997dE.A0d(c16l);
                }
                c16l.A0z();
            }
            return new DropsLaunchAnimation(bool);
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
