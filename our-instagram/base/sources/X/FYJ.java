package X;

import android.content.Context;
import com.instagram.common.session.UserSession;

/* loaded from: classes6.dex */
public abstract class FYJ {
    public static final int A00(MU9 mu9) {
        Object obj = mu9.A01;
        if (obj instanceof C115095Ie) {
            return -1;
        }
        if (obj instanceof C115115Ig) {
            C14360o3.A0C(obj, "null cannot be cast to non-null type com.instagram.common.api.base.ApiError.Response<Error of com.instagram.util.lifecycle.HttpErrorUtilKt.statusCodeOrNegative1>");
            Object obj2 = ((C115115Ig) obj).A00;
            if (!(obj2 instanceof InterfaceC40821up)) {
                return -1;
            }
            return ((InterfaceC40801un) obj2).getStatusCode();
        }
        throw B4Z.A00();
    }

    public static final String A01(Context context, MU9 mu9, UserSession userSession) {
        StringBuilder A1C;
        Object obj = mu9.A01;
        if (obj instanceof C115095Ie) {
            A1C = AbstractC166987dD.A1C();
            AbstractC31172DnG.A1D(context, A1C, 2131968581);
            if (C1C0.A00(userSession)) {
                A1C.append('\n');
                C14360o3.A0C(obj, MSV.A00(238));
                A1C.append(((C115095Ie) obj).A00);
            }
        } else if (obj instanceof C115115Ig) {
            A1C = AbstractC166987dD.A1C();
            AbstractC31172DnG.A1D(context, A1C, 2131974297);
            C14360o3.A0C(obj, "null cannot be cast to non-null type com.instagram.common.api.base.ApiError.Response<Error of com.instagram.util.lifecycle.HttpErrorUtilKt.buildErrorMessage$lambda$1>");
            InterfaceC40801un interfaceC40801un = (InterfaceC40801un) ((C115115Ig) obj).A00;
            if (C1C0.A00(userSession)) {
                A1C.append(AnonymousClass001.A00(' ', interfaceC40801un.getStatusCode()));
                if (interfaceC40801un instanceof InterfaceC40821up) {
                    A1C.append(AnonymousClass001.A0D(((InterfaceC40821up) interfaceC40801un).getErrorMessage(), ' '));
                }
            }
        } else {
            throw B4Z.A00();
        }
        return AbstractC166987dD.A19(A1C);
    }
}
