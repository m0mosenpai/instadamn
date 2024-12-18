package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.Ev7, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract /* synthetic */ class AbstractC33719Ev7 {
    public static Map A00(InterfaceC115885Me interfaceC115885Me) {
        LinkedHashMap A1I = AbstractC166987dD.A1I();
        List BfB = interfaceC115885Me.BfB();
        if (BfB != null) {
            ArrayList A0q = AbstractC167017dG.A0q(BfB);
            Iterator it = BfB.iterator();
            while (it.hasNext()) {
                A0q.add(AbstractC31172DnG.A0i(it).A1D());
            }
            A1I.put("posts", A0q);
        }
        User CDj = interfaceC115885Me.CDj();
        if (CDj != null) {
            A1I.put(PublicKeyCredentialControllerUtility.JSON_KEY_USER, CDj.A07());
        }
        return AbstractC06930Yk.A0B(A1I);
    }
}
