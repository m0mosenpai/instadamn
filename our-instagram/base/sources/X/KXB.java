package X;

import android.content.Context;
import android.view.View;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;

/* loaded from: classes8.dex */
public final class KXB extends AbstractC33630Etg {
    public final Context A00;
    public final Integer A01;
    public final /* synthetic */ C164517Xq A02;

    @Override // X.AbstractC33630Etg
    public final void A00(C32071E6x c32071E6x, InterfaceC40821up interfaceC40821up, UserSession userSession) {
        C14360o3.A0B(c32071E6x, 2);
        int intValue = this.A01.intValue();
        if (intValue != 0) {
            if (intValue == 1) {
                AbstractC59962oe abstractC59962oe = this.A02.A00;
                if (abstractC59962oe.isResumed()) {
                    FragmentActivity requireActivity = abstractC59962oe.requireActivity();
                    C3DN A0r = AbstractC31172DnG.A0r(requireActivity);
                    if (A0r == null || !((C3DP) A0r).A0h) {
                        requireActivity.onBackPressed();
                        return;
                    }
                    return;
                }
                return;
            }
            throw new IndexOutOfBoundsException("Unhandled pending request response");
        }
        C164517Xq c164517Xq = this.A02;
        c164517Xq.A07.invoke();
        FUF.A01(this.A00, c32071E6x, userSession, null, 1, false);
        KXC kxc = (KXC) userSession.A01(KXC.class, new C50159MDm(userSession, 12));
        if (kxc.A00) {
            AbstractC44190Jft.A00(kxc, new C50159MDm(kxc, 15));
        }
        boolean z = c164517Xq.A0B;
        InterfaceC163857Uz Avk = ((C7U0) c164517Xq.A08.invoke()).Avk();
        if (z) {
            Avk.Chf();
        } else {
            Avk.EK6(true);
        }
    }

    public KXB(Context context, C164517Xq c164517Xq, Integer num) {
        this.A02 = c164517Xq;
        this.A01 = num;
        this.A00 = context;
    }

    @Override // X.AbstractC33630Etg
    public final void A02(UserSession userSession) {
        View view = this.A02.A00.mView;
        if (view != null) {
            AbstractC31557Dth.A00(view, false);
        }
    }

    @Override // X.AbstractC33630Etg
    public final void A03(UserSession userSession) {
        View view = this.A02.A00.mView;
        if (view != null) {
            AbstractC31557Dth.A00(view, true);
        }
    }

    @Override // X.AbstractC33630Etg
    public final void A01(AbstractC115105If abstractC115105If, UserSession userSession) {
        String obj = AbstractC35240FgZ.A00(abstractC115105If).toString();
        C9GR.A0E(this.A00, "request_error");
        KXC kxc = (KXC) userSession.A01(KXC.class, new C50159MDm(userSession, 12));
        if (kxc.A00) {
            if (obj != null) {
                kxc.A03("error_message", obj);
            }
            AbstractC44190Jft.A00(kxc, new DH5((AbstractC44190Jft) kxc, "fetch_threads_fail", (String) null, 26));
        }
    }
}
