package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import java.util.Iterator;
import java.util.LinkedHashMap;

/* renamed from: X.Rte, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public abstract class AbstractC61784Rte {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v11, types: [java.util.AbstractCollection, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v9, types: [X.0sl] */
    /* JADX WARN: Type inference failed for: r12v0, types: [X.0sJ] */
    public static final void A00(EnumC50702Ur enumC50702Ur, InterfaceC16660sJ interfaceC16660sJ) {
        String str;
        InterfaceC16820sZ interfaceC16820sZ = AbstractC62853SUa.A00;
        long currentTimeMillis = System.currentTimeMillis();
        if (enumC50702Ur.compareTo(AbstractC50692Uq.A00()) >= 0) {
            java.util.Set set = AbstractC50692Uq.A00;
            if (!set.isEmpty()) {
                ?? r0 = 0;
                Iterator it = set.iterator();
                while (true) {
                    str = "Litho.DebugInfo";
                    if (!it.hasNext()) {
                        break;
                    }
                    Object next = it.next();
                    String[] strArr = ((AbstractC50682Uo) next).A00;
                    if (AbstractC009903n.A0O("Litho.DebugInfo", strArr) || AbstractC009903n.A0O("*", strArr)) {
                        r0 = MSY.A0j(r0);
                        r0.add(next);
                    }
                }
                if (r0 == 0) {
                    r0 = C16930sl.A00;
                }
                if (AbstractC166987dD.A1b(r0)) {
                    LinkedHashMap A1I = AbstractC166987dD.A1I();
                    interfaceC16660sJ.invoke(A1I);
                    A1I.put(PublicKeyCredentialControllerUtility.JSON_KEY_NAME, "ZeroAlphaComponent");
                    C58571Pxp c58571Pxp = new C58571Pxp(currentTimeMillis, str, (String) interfaceC16820sZ.invoke(), A1I);
                    Iterator it2 = r0.iterator();
                    while (it2.hasNext()) {
                        ((AbstractC50682Uo) it2.next()).A00(c58571Pxp);
                    }
                }
            }
        }
    }
}
