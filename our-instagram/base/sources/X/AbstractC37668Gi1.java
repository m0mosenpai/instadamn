package X;

import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.Gi1, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC37668Gi1 {
    public static final void A00(C38321qM c38321qM, String str, boolean z) {
        ArrayList arrayList;
        C14360o3.A0B(str, 1);
        List<InterfaceC1118152j> AvS = c38321qM.A0C.AvS();
        if (AvS != null) {
            arrayList = AbstractC167017dG.A0q(AvS);
            for (InterfaceC1118152j interfaceC1118152j : AvS) {
                if (C14360o3.A0K(interfaceC1118152j.getId(), str)) {
                    C41211IMa AKI = interfaceC1118152j.AKI();
                    AKI.A02 = Boolean.valueOf(z);
                    interfaceC1118152j = AKI.A00();
                }
                arrayList.add(interfaceC1118152j);
            }
        } else {
            arrayList = null;
        }
        c38321qM.A0C.ESq(arrayList);
    }

    public static final boolean A01(UserSession userSession, C38321qM c38321qM) {
        List AvS;
        List AvR;
        C3x9 clipsMetadata = c38321qM.A0C.getClipsMetadata();
        if ((clipsMetadata == null || (AvR = clipsMetadata.AvR()) == null || !(!AvR.isEmpty())) && ((AvS = c38321qM.A0C.AvS()) == null || !(!AvS.isEmpty()) || !C18U.A06(C06090Tz.A05, userSession, 36323019458620266L))) {
            return false;
        }
        return true;
    }
}
