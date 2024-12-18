package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import instagram.features.stories.fragment.ReelViewerFragment;
import java.util.List;

/* renamed from: X.1P7, reason: invalid class name */
/* loaded from: classes.dex */
public abstract class C1P7 {
    public static final InterfaceC147086jk A00(Context context, AbstractC018607g abstractC018607g, UserSession userSession, InterfaceC60442pS interfaceC60442pS, C3G2 c3g2, C145806hd c145806hd, C145816he c145816he, InterfaceC114805Gn interfaceC114805Gn, C32O c32o, InterfaceC61432r6 interfaceC61432r6, InterfaceC61522rF interfaceC61522rF, C1M1 c1m1, ReelViewerFragment reelViewerFragment, String str, List list, int i, boolean z) {
        C14360o3.A0B(c3g2, 0);
        C14360o3.A0B(str, 2);
        C14360o3.A0B(userSession, 4);
        C14360o3.A0B(interfaceC114805Gn, 5);
        C14360o3.A0B(c32o, 12);
        C14360o3.A0B(interfaceC61432r6, 14);
        if (C1P8.A00(userSession)) {
            return C103964mH.A00.A05(context, abstractC018607g, userSession, interfaceC60442pS, c3g2, c145806hd, c145816he, interfaceC114805Gn, c32o, interfaceC61432r6, interfaceC61522rF, c1m1, reelViewerFragment, str, list, i, z);
        }
        C6YX A00 = C1PA.A00(context, abstractC018607g, userSession, interfaceC60442pS, c3g2, c145806hd, c145816he, interfaceC114805Gn, c32o, interfaceC61432r6, interfaceC61522rF, c1m1, reelViewerFragment, str, list, i, z);
        C14360o3.A0A(A00);
        return A00;
    }

    public static final C32S A01(Context context, AbstractC018607g abstractC018607g, UserSession userSession, InterfaceC60442pS interfaceC60442pS, C3G2 c3g2, C32O c32o, String str) {
        C14360o3.A0B(context, 0);
        C14360o3.A0B(abstractC018607g, 3);
        C14360o3.A0B(str, 5);
        if (C1P8.A00(userSession)) {
            return C103964mH.A03(context, abstractC018607g, userSession, interfaceC60442pS, c3g2, c32o, str);
        }
        C32S A05 = C1PA.A05(context, abstractC018607g, userSession, interfaceC60442pS, c3g2, c32o, str);
        C14360o3.A0A(A05);
        return A05;
    }

    public static final void A02(UserSession userSession) {
        C14360o3.A0B(userSession, 0);
        if (C1P8.A00(userSession)) {
            C103964mH.A04(userSession);
        } else {
            C1PA.A06(userSession);
        }
    }
}
