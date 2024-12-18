package X;

import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import java.lang.ref.WeakReference;

/* renamed from: X.9IC, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C9IC {
    public final InterfaceC11380iw A00;
    public final UserSession A01;

    public C9IC(InterfaceC11380iw interfaceC11380iw, UserSession userSession) {
        C14360o3.A0B(userSession, 2);
        this.A00 = interfaceC11380iw;
        this.A01 = userSession;
    }

    public final void A00(EnumC85043qs enumC85043qs, C38321qM c38321qM, WeakReference weakReference, InterfaceC16660sJ interfaceC16660sJ) {
        FragmentActivity fragmentActivity;
        boolean A1a = AbstractC167017dG.A1a(weakReference, c38321qM);
        AbstractC167017dG.A1R(enumC85043qs, interfaceC16660sJ);
        Object obj = weakReference.get();
        if ((obj instanceof FragmentActivity) && (fragmentActivity = (FragmentActivity) obj) != null) {
            C23718Aer c23718Aer = new C23718Aer(enumC85043qs, this, interfaceC16660sJ);
            UserSession userSession = this.A01;
            if (AbstractC84973ql.A00(userSession).A06()) {
                c23718Aer.Dap();
                return;
            }
            CTS cts = C26867BtT.A08;
            String id = c38321qM.getId();
            if (id == null) {
                id = "";
            }
            cts.A00(fragmentActivity, EnumC25577BSp.NEW_TOOLTIP, userSession, c23718Aer, id, this.A00.getModuleName(), null, AbstractC167007dF.A1X(enumC85043qs, EnumC85043qs.A02), A1a);
        }
    }
}
