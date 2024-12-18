package X;

import android.content.Context;
import androidx.fragment.app.Fragment;
import com.instagram.common.session.UserSession;

/* renamed from: X.GpL, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC38092GpL {
    public static C66392zG A00(Context context, Fragment fragment, UserSession userSession, InterfaceC65702y7 interfaceC65702y7, C37835Gkp c37835Gkp, AbstractC42425IqS abstractC42425IqS, JPS jps, InterfaceC43406JFw interfaceC43406JFw, JIG jig, InterfaceC60442pS interfaceC60442pS, IM0 im0, String str, boolean z, boolean z2) {
        C38093GpM c38093GpM = new C38093GpM(interfaceC60442pS, userSession, jps, interfaceC43406JFw, z, false);
        C66392zG A00 = C66362zD.A00(context);
        A00.A01(new C38094GpN(interfaceC60442pS, userSession, abstractC42425IqS, jps, interfaceC43406JFw, jig, z));
        A00.A01(new C38095GpO(interfaceC60442pS, userSession, abstractC42425IqS, jps, interfaceC43406JFw, jig, z));
        A00.A01(new C38096GpP(interfaceC60442pS, c37835Gkp, abstractC42425IqS, jps, interfaceC43406JFw, z));
        A00.A01(new C38097GpQ(context, interfaceC60442pS, userSession, interfaceC65702y7, abstractC42425IqS, jps, interfaceC43406JFw, jig, z, z2));
        A00.A01(new C38098GpR(context, fragment, userSession, abstractC42425IqS, jps, interfaceC43406JFw, interfaceC60442pS, im0, str, z));
        A00.A01(new C38099GpS(context, fragment, userSession, abstractC42425IqS, jps, interfaceC43406JFw, jig, interfaceC60442pS, im0, str, z));
        A00.A01(new C38100GpT(context, fragment, userSession, abstractC42425IqS, jps, interfaceC43406JFw, jig, interfaceC60442pS, im0, str, z));
        A00.A01(new C38101GpU(context, fragment, userSession, abstractC42425IqS, jps, interfaceC43406JFw, interfaceC60442pS, im0, str, z));
        A00.A01(new MZ3());
        A00.A01(new C38102GpV(userSession, abstractC42425IqS, jps, interfaceC43406JFw, interfaceC60442pS, z));
        A00.A01(new C38104GpX(abstractC42425IqS, c38093GpM));
        A00.A01(new C38105GpY(new C38093GpM(interfaceC60442pS, userSession, jps, interfaceC43406JFw, z, true), abstractC42425IqS));
        return A00;
    }
}
