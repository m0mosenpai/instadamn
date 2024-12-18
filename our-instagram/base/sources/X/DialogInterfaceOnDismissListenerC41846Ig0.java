package X;

import android.content.DialogInterface;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.OnLifecycleEvent;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;

/* renamed from: X.Ig0, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class DialogInterfaceOnDismissListenerC41846Ig0 implements DialogInterface.OnDismissListener, DialogInterface.OnShowListener, C07W {
    public DialogInterface A00;
    public final AbstractC59962oe A01;
    public final UserSession A02;
    public final InterfaceC60442pS A03;
    public final String A04;

    public DialogInterfaceOnDismissListenerC41846Ig0(AbstractC59962oe abstractC59962oe, UserSession userSession, InterfaceC60442pS interfaceC60442pS, String str) {
        C14360o3.A0B(userSession, 3);
        this.A01 = abstractC59962oe;
        this.A03 = interfaceC60442pS;
        this.A02 = userSession;
        this.A04 = str;
    }

    @Override // android.content.DialogInterface.OnShowListener
    public final void onShow(DialogInterface dialogInterface) {
        C14360o3.A0B(dialogInterface, 0);
        this.A00 = dialogInterface;
    }

    public final void A00(JPd jPd) {
        EnumC65855TvH enumC65855TvH;
        UserSession userSession = this.A02;
        AbstractC59962oe abstractC59962oe = this.A01;
        User CDj = jPd.CDj();
        C14360o3.A07(CDj);
        String id = jPd.getId();
        if (id != null) {
            C105824pt AiE = jPd.AiE();
            C53024Ncw c53024Ncw = new C53024Ncw(3, new C43050J1q(0, jPd, this), this);
            FragmentActivity requireActivity = abstractC59962oe.requireActivity();
            if (AiE != null) {
                id = AiE.A0e;
                id.getClass();
                enumC65855TvH = EnumC65855TvH.A15;
            } else {
                enumC65855TvH = EnumC65855TvH.A18;
            }
            WEz A01 = AbstractC69993VzD.A01(requireActivity, abstractC59962oe, userSession, enumC65855TvH, VG2.A0d, id);
            A01.A01 = CDj;
            AbstractC37301Gc2.A1R(A01, c53024Ncw);
            return;
        }
        throw AbstractC166997dE.A0g();
    }

    @OnLifecycleEvent(C07R.ON_DESTROY)
    public final void destroyDialog() {
        DialogInterface dialogInterface = this.A00;
        if (dialogInterface != null) {
            dialogInterface.dismiss();
        }
        this.A00 = null;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        if (C14360o3.A0K(this.A00, dialogInterface)) {
            this.A00 = null;
        }
    }
}
