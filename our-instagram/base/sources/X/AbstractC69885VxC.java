package X;

import com.instagram.bloks.hosting.IgBloksScreenConfig;
import com.instagram.common.session.UserSession;
import java.io.IOException;
import java.util.HashMap;

/* renamed from: X.VxC, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public abstract class AbstractC69885VxC {
    public static C34397FEn A00(UserSession userSession, String str) {
        C68236VIw c68236VIw;
        C69212Vjf c69212Vjf;
        C34397FEn c34397FEn = new C34397FEn(userSession);
        if (str != null) {
            try {
                C68235VIv c68235VIv = VR6.parseFromJson(C07950bF.A04.A01(userSession, str)).A00;
                if (c68235VIv != null && (c68236VIw = c68235VIv.A00) != null && (c69212Vjf = c68236VIw.A00) != null) {
                    String str2 = c69212Vjf.A00;
                    if (str2 != null) {
                        c34397FEn.A00.A0R = str2;
                    }
                    String str3 = c69212Vjf.A01;
                    if (str3 != null) {
                        c34397FEn.A00.A0U = str3;
                    }
                    boolean z = c69212Vjf.A02;
                    IgBloksScreenConfig igBloksScreenConfig = c34397FEn.A00;
                    igBloksScreenConfig.A0j = z;
                    igBloksScreenConfig.A0k = AbstractC167007dF.A1N(c69212Vjf.A03 ? 1 : 0);
                    return c34397FEn;
                }
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
        return c34397FEn;
    }

    public static HashMap A01(UserSession userSession, String str) {
        if (str != null) {
            try {
                HashMap A00 = FTf.A00(C07950bF.A04.A01(userSession, str));
                if (A00 != null) {
                    return A00;
                }
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
        return new HashMap();
    }
}
