package X;

import android.content.Context;
import android.content.DialogInterface;
import androidx.fragment.app.Fragment;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;

/* renamed from: X.Dp2, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C31280Dp2 {
    public final Context A00;
    public final Fragment A01;
    public final InterfaceC11380iw A02;
    public final UserSession A03;
    public final C31313DpZ A04;

    public C31280Dp2(Context context, Fragment fragment, InterfaceC11380iw interfaceC11380iw, UserSession userSession) {
        AbstractC167007dF.A1F(userSession, 2, interfaceC11380iw);
        C31313DpZ c31313DpZ = new C31313DpZ(context);
        this.A00 = context;
        this.A03 = userSession;
        this.A01 = fragment;
        this.A02 = interfaceC11380iw;
        this.A04 = c31313DpZ;
    }

    private final void A00(DialogInterface.OnClickListener onClickListener, InterfaceC37152GYp interfaceC37152GYp, C2EC c2ec, User user, String str, String str2, String str3, boolean z) {
        C31313DpZ c31313DpZ = this.A04;
        Context context = this.A00;
        String A0p = AbstractC166997dE.A0p(context, 2131960349);
        int i = 2131960348;
        if (user.CYY()) {
            i = 2131960358;
        }
        String A0b = AbstractC31177DnL.A0b(context, str, i);
        DialogInterfaceOnClickListenerC35358FiZ dialogInterfaceOnClickListenerC35358FiZ = new DialogInterfaceOnClickListenerC35358FiZ(0, interfaceC37152GYp, c2ec, this, user, z);
        String A0p2 = AbstractC166997dE.A0p(context, 2131954754);
        DialogInterfaceOnClickListenerC35452Fk9 A00 = DialogInterfaceOnClickListenerC35452Fk9.A00(interfaceC37152GYp, 40);
        C193328hC A0a = AbstractC31176DnK.A0a(c31313DpZ.A00, str3, str2);
        A0a.A0t(false);
        A0a.A0s(true);
        A0a.A0X(dialogInterfaceOnClickListenerC35358FiZ, EnumC193348hE.A06, A0b, true);
        A0a.A0c(A00, A0p2);
        if (onClickListener != null) {
            A0a.A0Z(onClickListener, EnumC193348hE.A03, A0p, true);
        }
        AbstractC166987dD.A1W(A0a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x00a2, code lost:
    
        if (X.C14360o3.A0K(r1, "UNKNOWN") != false) goto L40;
     */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00cc  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean A01(X.InterfaceC37152GYp r20, X.C2EC r21) {
        /*
            Method dump skipped, instructions count: 331
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C31280Dp2.A01(X.GYp, X.2EC):boolean");
    }
}
