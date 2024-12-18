package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import com.instagram.model.androidlink.AndroidLink;
import com.instagram.model.reels.Reel;
import java.util.List;

/* renamed from: X.6Og, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC138256Og {
    public static final boolean A00(Context context, UserSession userSession, C41181vS c41181vS, C41551w4 c41551w4) {
        AndroidLink A04;
        InterfaceC39541sb injected;
        InterfaceC39391sK BEV;
        InterfaceC39371sI AiT;
        Boolean Bux;
        C14360o3.A0B(userSession, 0);
        C14360o3.A0B(context, 2);
        C06090Tz c06090Tz = C06090Tz.A05;
        if (C18U.A06(c06090Tz, userSession, 36324827641295364L) && C18U.A06(c06090Tz, userSession, 36324827639919092L) && c41181vS.CdW() && C143726eF.A0B(context) && c41181vS.A0s() && (A04 = AbstractC84863qa.A04(context, userSession, c41181vS)) != null && AbstractC114965Hm.A01(A04) == EnumC906041v.AD_DESTINATION_WEB) {
            Reel reel = c41551w4.A0H;
            List A0J = reel.A0J();
            if (A0J != null && !A0J.isEmpty() && reel.A0J().size() > 1) {
                return false;
            }
            C38321qM c38321qM = c41181vS.A0b;
            if (c38321qM != null && (injected = c38321qM.A0C.getInjected()) != null && (BEV = injected.BEV()) != null && (AiT = BEV.AiT()) != null && (Bux = AiT.Bux()) != null && Bux.booleanValue()) {
                return false;
            }
            if (C18U.A06(c06090Tz, userSession, 36324827640705532L) && C04100Kb.A00(context) < 2016) {
                return false;
            }
            return true;
        }
        return false;
    }
}
