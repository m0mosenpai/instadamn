package X;

import android.app.Activity;
import com.instagram.common.session.UserSession;
import com.instagram.foa.session.IgMetaSessionImpl;

/* renamed from: X.Cbv, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C28198Cbv {
    public static final C28198Cbv A00 = new Object();

    /* JADX WARN: Type inference failed for: r10v0, types: [X.CUu, java.lang.Object] */
    public final void A00(Activity activity, UserSession userSession, Integer num, String str, String str2, String str3, String str4, InterfaceC16820sZ interfaceC16820sZ, InterfaceC16620sF interfaceC16620sF, boolean z, boolean z2) {
        String str5 = str4;
        C14360o3.A0B(userSession, 0);
        String str6 = str2;
        if (str4 == null) {
            str5 = "";
        }
        if (str2 == null) {
            str6 = "";
        }
        CW8 cw8 = new CW8(new C29533Czl(str5, str6), C05F.A00, str2, str3, "");
        C28265CdA c28265CdA = new C28265CdA(true, false, true);
        String A0o = AbstractC166997dE.A0o();
        C28280CdP c28280CdP = new C28280CdP(new CVW(A0o, str), cw8, new Object(), c28265CdA, num, str, null, null, A0o, null, C16930sl.A00, 3, z2, true, false, false, z);
        IgMetaSessionImpl igMetaSessionImpl = new IgMetaSessionImpl(userSession);
        C30181DRm A01 = C30181DRm.A01(new C56829PJz(1, interfaceC16820sZ, interfaceC16620sF), 23);
        CLB clb = C27331C4m.A0C;
        C27978CVa c27978CVa = new C27978CVa(igMetaSessionImpl, c28280CdP);
        synchronized (clb) {
            if (!C27331C4m.A0B) {
                new C27331C4m(activity, c27978CVa.A00, c27978CVa, A01).A0F();
                C27331C4m.A0B = true;
            }
        }
    }
}
