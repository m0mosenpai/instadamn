package X;

import androidx.fragment.app.FragmentActivity;
import com.instagram.bloks.hosting.IgBloksScreenConfig;
import java.util.HashMap;

/* renamed from: X.Nqz, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public abstract class AbstractC53809Nqz {
    public static final Object A00(C6FQ c6fq, C6FW c6fw) {
        Object A01 = c6fw.A01();
        AbstractC25225BEi.A1S(A01);
        FragmentActivity A04 = C6BQ.A04(c6fq);
        AbstractC12990ll A0B = C6BQ.A0B(c6fq);
        HashMap A1G = AbstractC166987dD.A1G();
        A1G.put(AbstractC111324zv.A00(4214), A01);
        C66277U6x A012 = C66277U6x.A01(AbstractC111324zv.A00(4141), A1G);
        IgBloksScreenConfig A0C = AbstractC31171DnF.A0C(A0B);
        A0C.A0i = true;
        A0C.A0U = "";
        C72743Nv A02 = W6d.A02(A0C, A012);
        C193328hC A0H = AbstractC31171DnF.A0H(A04);
        A0H.A05 = "In-App Purchase";
        A0H.A0r("Purchase successful?");
        A0H.A0d(new DialogInterfaceOnClickListenerC35450Fk7(2, A04, A0B, A02), "Yes");
        A0H.A0c(new DialogInterfaceOnClickListenerC35452Fk9(A04, 13), "No");
        AbstractC166987dD.A1W(A0H);
        return null;
    }
}
