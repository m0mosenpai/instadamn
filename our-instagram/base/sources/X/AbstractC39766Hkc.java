package X;

import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.Hkc, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract /* synthetic */ class AbstractC39766Hkc {
    public static Map A00(InterfaceC43551JLl interfaceC43551JLl) {
        LinkedHashMap A1I = AbstractC166987dD.A1I();
        if (interfaceC43551JLl.getAccessToken() != null) {
            A1I.put("access_token", interfaceC43551JLl.getAccessToken());
        }
        User BzF = interfaceC43551JLl.BzF();
        if (BzF != null) {
            A1I.put("sponsor", BzF.A07());
        }
        List BzM = interfaceC43551JLl.BzM();
        if (BzM != null) {
            ArrayList A0q = AbstractC167017dG.A0q(BzM);
            Iterator it = BzM.iterator();
            while (it.hasNext()) {
                AbstractC31178DnM.A1U(A0q, it);
            }
            A1I.put("sponsors", A0q);
        }
        return AbstractC06930Yk.A0B(A1I);
    }
}
