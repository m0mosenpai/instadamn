package X;

import android.content.Context;
import com.instagram.common.gallery.Medium;
import com.instagram.common.session.UserSession;
import java.util.List;

/* loaded from: classes8.dex */
public abstract class LBX {
    public static final void A00(Context context, Medium medium, UserSession userSession, C8HF c8hf) {
        AbstractC167017dG.A1R(medium, c8hf);
        List A1J = AbstractC166987dD.A1J(medium);
        C48615Ler c48615Ler = new C48615Ler(c8hf);
        C121275eQ c121275eQ = new C121275eQ(new B1P(2, A1J, userSession, context), 465);
        C43922JbX.A01(c121275eQ, c48615Ler, 5);
        C1GJ.A03(c121275eQ);
    }

    public static final void A01(Context context, InterfaceC50449MPd interfaceC50449MPd, Integer num, int[] iArr) {
        C14120nc.A00().ATO(new KMK(context, interfaceC50449MPd, num, iArr));
    }
}
