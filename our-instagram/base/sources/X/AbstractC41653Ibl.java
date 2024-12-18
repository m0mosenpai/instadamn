package X;

import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.avatars.ImmersiveAvatarViewerDebugFragment;
import java.util.HashMap;

/* renamed from: X.Ibl, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC41653Ibl {
    public static final HashMap A00(C38321qM c38321qM, String str) {
        String BuU;
        C14360o3.A0B(str, 1);
        HashMap A1G = AbstractC166987dD.A1G();
        A1G.put(ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY, VEB.A06.A00);
        if (c38321qM != null) {
            String A2u = c38321qM.A2u();
            if (A2u != null) {
                A1G.put("media_id", A2u);
            }
            String id = c38321qM.getId();
            if (id != null) {
                A1G.put("media_id", C38801rC.A04(id));
            }
            InterfaceC39681sr BuT = c38321qM.A0C.BuT();
            if (BuT != null && (BuU = BuT.BuU()) != null && BuU.length() != 0) {
                A1G.put("sharing_friction_payload", BuU);
            }
        }
        A1G.put("module", str);
        return A1G;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, X.6cT, X.1vN] */
    public static final void A01(InterfaceC38401qU interfaceC38401qU, UserSession userSession) {
        AbstractC167017dG.A1N(userSession, interfaceC38401qU);
        interfaceC38401qU.AHs();
        C25671My A00 = AbstractC25651Mw.A00(userSession);
        ?? obj = new Object();
        obj.A00 = interfaceC38401qU;
        A00.E4s(obj);
    }

    public static final boolean A02(InterfaceC38401qU interfaceC38401qU) {
        String str;
        if (interfaceC38401qU.BRN() != null) {
            InterfaceC109094vY BRN = interfaceC38401qU.BRN();
            if (BRN != null) {
                str = BRN.getOverlayType();
            } else {
                str = null;
            }
            if ("MISINFORMATION".equals(str)) {
                return true;
            }
        }
        return false;
    }
}
