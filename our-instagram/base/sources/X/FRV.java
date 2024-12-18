package X;

import android.app.Activity;
import android.content.DialogInterface;
import android.content.res.Resources;
import androidx.fragment.app.Fragment;
import com.instagram.common.session.UserSession;

/* loaded from: classes6.dex */
public final class FRV {
    public final Activity A00;
    public final InterfaceC684536i A01;
    public final UserSession A02;

    public FRV(Activity activity, InterfaceC684536i interfaceC684536i, UserSession userSession) {
        C14360o3.A0B(userSession, 2);
        this.A00 = activity;
        this.A02 = userSession;
        this.A01 = interfaceC684536i;
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x002d, code lost:
    
        if (r14 != false) goto L6;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A00(android.content.DialogInterface.OnCancelListener r26, android.content.DialogInterface.OnDismissListener r27, androidx.fragment.app.Fragment r28, X.EnumC33409Epg r29, X.InterfaceC37226Gab r30, X.InterfaceC145346gt r31, X.InterfaceC11380iw r32, X.O9C r33) {
        /*
            Method dump skipped, instructions count: 426
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.FRV.A00(android.content.DialogInterface$OnCancelListener, android.content.DialogInterface$OnDismissListener, androidx.fragment.app.Fragment, X.Epg, X.Gab, X.6gt, X.0iw, X.O9C):void");
    }

    public final void A02(DialogInterface.OnDismissListener onDismissListener, Fragment fragment, EnumC33409Epg enumC33409Epg, InterfaceC37226Gab interfaceC37226Gab, InterfaceC145346gt interfaceC145346gt, InterfaceC11380iw interfaceC11380iw) {
        C14360o3.A0B(interfaceC145346gt, 3);
        A00(null, onDismissListener, fragment, enumC33409Epg, interfaceC37226Gab, interfaceC145346gt, interfaceC11380iw, null);
    }

    public final void A01(DialogInterface.OnDismissListener onDismissListener, DialogInterface.OnShowListener onShowListener) {
        Activity activity = this.A00;
        Resources resources = activity.getResources();
        C193328hC A0H = AbstractC31171DnF.A0H(activity);
        A0H.A0r(resources.getString(2131968583));
        A0H.A0I(null, 2131960994);
        AbstractC31175DnJ.A1O(A0H);
        A0H.A0h(onShowListener);
        A0H.A0g(onDismissListener);
        AbstractC166987dD.A1W(A0H);
    }
}
