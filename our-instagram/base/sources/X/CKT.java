package X;

import android.app.Activity;
import com.instagram.wonderwall.model.WallMenuConfig;
import com.instagram.wonderwall.model.WallText;

/* loaded from: classes5.dex */
public abstract class CKT {
    public static final C189478aR A00(Activity activity, C189448aO c189448aO, WallMenuConfig wallMenuConfig) {
        WallText wallText = wallMenuConfig.A00;
        if (wallText != null) {
            c189448aO.A0d = CKS.A00(activity, wallText);
        }
        C189478aR A00 = c189448aO.A00();
        C26710Bqr c26710Bqr = new C26710Bqr();
        AbstractC25233BEq.A15(c26710Bqr, MSV.A00(1718), wallMenuConfig);
        return A00.A02(activity, c26710Bqr);
    }
}
