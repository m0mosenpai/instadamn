package X;

import com.instagram.common.session.UserSession;
import java.lang.ref.WeakReference;

/* renamed from: X.N9r, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C52228N9r extends C1P1 {
    public final C1OL A00;
    public final UserSession A01;
    public final Integer A02;
    public final WeakReference A03;

    public C52228N9r(C1OL c1ol, UserSession userSession, InterfaceC58133Ppw interfaceC58133Ppw, Integer num) {
        this.A01 = userSession;
        this.A02 = num;
        this.A00 = c1ol;
        this.A03 = AbstractC25225BEi.A16(interfaceC58133Ppw);
    }

    @Override // X.C1P1
    public final void onFail(AbstractC115105If abstractC115105If) {
        int i;
        int A03 = C0f9.A03(-355324724);
        C14360o3.A0B(abstractC115105If, 0);
        super.onFail(abstractC115105If);
        C1OL c1ol = this.A00;
        if (c1ol != null && c1ol.A00) {
            i = 876250087;
        } else {
            InterfaceC58133Ppw interfaceC58133Ppw = (InterfaceC58133Ppw) this.A03.get();
            if (interfaceC58133Ppw != null) {
                interfaceC58133Ppw.D7c(false, null);
            }
            i = 2058202681;
        }
        C0f9.A0A(i, A03);
    }

    @Override // X.C1P1
    public final void onFinish() {
        InterfaceC58133Ppw interfaceC58133Ppw;
        int A03 = C0f9.A03(946592511);
        super.onFinish();
        C1OL c1ol = this.A00;
        if ((c1ol == null || !c1ol.A00) && (interfaceC58133Ppw = (InterfaceC58133Ppw) this.A03.get()) != null) {
            interfaceC58133Ppw.onFinish();
        }
        C0f9.A0A(1635945172, A03);
    }

    @Override // X.C1P1
    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        long A0t;
        InterfaceC19610xo A0e;
        String str;
        int i;
        int A03 = C0f9.A03(-1614585263);
        N38 n38 = (N38) obj;
        int A032 = C0f9.A03(-1602365554);
        C14360o3.A0B(n38, 0);
        super.onSuccess(n38);
        int intValue = this.A02.intValue();
        if (intValue != 1) {
            if (intValue == 0) {
                UserSession userSession = this.A01;
                A0t = AbstractC25232BEp.A0t(n38.A00);
                C14360o3.A0B(userSession, 0);
                A0e = AbstractC31176DnK.A0e(userSession);
                str = "comment_warning_earliest_next_request_time";
            } else {
                B4Z A00 = B4Z.A00();
                C0f9.A0A(1612382423, A032);
                throw A00;
            }
        } else {
            UserSession userSession2 = this.A01;
            A0t = AbstractC25232BEp.A0t(n38.A00);
            C14360o3.A0B(userSession2, 0);
            A0e = AbstractC31176DnK.A0e(userSession2);
            str = "caption_warning_earliest_next_request_time";
        }
        A0e.E7G(str, A0t);
        A0e.apply();
        C1OL c1ol = this.A00;
        if (c1ol != null && c1ol.A00) {
            i = 306150892;
        } else {
            InterfaceC58133Ppw interfaceC58133Ppw = (InterfaceC58133Ppw) this.A03.get();
            if (interfaceC58133Ppw == null) {
                i = 1905600030;
            } else {
                boolean z = n38.A02;
                String str2 = n38.A01;
                if (z) {
                    interfaceC58133Ppw.D7d(str2);
                } else {
                    interfaceC58133Ppw.D7c(true, str2);
                }
                i = 1766558532;
            }
        }
        C0f9.A0A(i, A032);
        C0f9.A0A(789086428, A03);
    }
}
