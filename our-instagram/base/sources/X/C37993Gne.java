package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.instagram.common.session.UserSession;

/* renamed from: X.Gne, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public class C37993Gne {
    public static final C37990Gnb A04 = new Object();
    public InterfaceC41501vz A00;
    public final Context A01;
    public final UserSession A02;
    public final InterfaceC60442pS A03;

    /* JADX WARN: Removed duplicated region for block: B:36:0x015b  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0166  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A00(X.C45125Jxu r21, X.C37991Gnc r22) {
        /*
            Method dump skipped, instructions count: 480
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C37993Gne.A00(X.Jxu, X.Gnc):void");
    }

    public final void A01(C37991Gnc c37991Gnc) {
        View view = c37991Gnc.A01;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams != null) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            Context context = this.A01;
            marginLayoutParams.bottomMargin = AbstractC69815Vw1.A00(context, 0.0f);
            marginLayoutParams.leftMargin = AbstractC69815Vw1.A00(context, 0.0f);
            marginLayoutParams.rightMargin = AbstractC69815Vw1.A00(context, 0.0f);
            view.setLayoutParams(marginLayoutParams);
            return;
        }
        throw AbstractC166987dD.A15(AbstractC111324zv.A00(20));
    }

    public C37993Gne(Context context, UserSession userSession, InterfaceC60442pS interfaceC60442pS) {
        AbstractC167017dG.A1R(userSession, interfaceC60442pS);
        this.A01 = context;
        this.A02 = userSession;
        this.A03 = interfaceC60442pS;
    }
}
