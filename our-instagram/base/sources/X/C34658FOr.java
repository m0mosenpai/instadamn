package X;

import com.instagram.model.direct.DirectShareTarget;
import com.instagram.pendingmedia.model.recipients.PendingRecipient;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.FOr, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C34658FOr {
    /* JADX WARN: Type inference failed for: r1v0, types: [com.instagram.model.direct.DirectShareTarget, java.lang.Object] */
    public final /* bridge */ /* synthetic */ ArrayList A00(Object obj) {
        DirectShareTarget directShareTarget;
        List<InterfaceC37096GWf> list = (List) obj;
        C14360o3.A0B(list, 0);
        BigInteger bigInteger = AbstractC31677Dvi.A00;
        ArrayList A1E = AbstractC166987dD.A1E();
        for (InterfaceC37096GWf interfaceC37096GWf : list) {
            if (interfaceC37096GWf instanceof E9N) {
                E9N e9n = (E9N) interfaceC37096GWf;
                ArrayList A1E2 = AbstractC166987dD.A1E();
                Iterator it = e9n.A03.iterator();
                while (it.hasNext()) {
                    A1E2.add(new PendingRecipient(AbstractC25226BEj.A15(it)));
                }
                String str = e9n.A02;
                String str2 = e9n.A00;
                List list2 = e9n.A04;
                String str3 = e9n.A01;
                ?? obj2 = new Object();
                obj2.A00 = Integer.MIN_VALUE;
                obj2.A01 = 0;
                obj2.A0E = 0;
                obj2.A0K = "";
                obj2.A0Q = A1E2;
                obj2.A0H = str2;
                obj2.A0I = str;
                obj2.A0J = str;
                obj2.A0B = true;
                obj2.A0L = str3;
                obj2.A0P = list2;
                obj2.A0D();
                directShareTarget = obj2;
            } else if (interfaceC37096GWf instanceof C32215EDo) {
                Iterator it2 = ((C32215EDo) interfaceC37096GWf).A01.iterator();
                while (it2.hasNext()) {
                    A1E.add(new DirectShareTarget(AbstractC25226BEj.A15(it2), false));
                }
            } else if (interfaceC37096GWf instanceof E9M) {
                directShareTarget = new DirectShareTarget(((E9M) interfaceC37096GWf).A00, false);
            }
            A1E.add(directShareTarget);
        }
        return A1E;
    }
}
