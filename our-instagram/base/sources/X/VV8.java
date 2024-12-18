package X;

import com.facebook.common.dextricks.DexStore;
import java.io.IOException;

/* loaded from: classes11.dex */
public abstract class VV8 {
    public static C69129ViK parseFromJson(C16L c16l) {
        C14360o3.A0B(c16l, 0);
        try {
            C69129ViK c69129ViK = new C69129ViK();
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            while (c16l.A1J() != C16R.A09) {
                String A0s = AbstractC166997dE.A0s(c16l);
                if ("registered_event_data_json".equals(A0s)) {
                    AbstractC31178DnM.A1I(c16l);
                } else if ("session_blob".equals(A0s)) {
                    c69129ViK.A02 = AbstractC167017dG.A0m(c16l);
                } else if ("survey".equals(A0s)) {
                    c69129ViK.A00 = VV5.parseFromJson(c16l);
                } else if (DexStore.CONFIG_FILENAME.equals(A0s)) {
                    c69129ViK.A01 = VV9.parseFromJson(c16l);
                }
                c16l.A0z();
            }
            return c69129ViK;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
