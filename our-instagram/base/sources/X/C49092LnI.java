package X;

import android.app.Activity;
import com.instagram.common.session.UserSession;
import com.instagram.model.direct.DirectThreadKey;
import com.instagram.model.direct.messageid.MessageIdentifier;
import java.util.ArrayList;

/* renamed from: X.LnI, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C49092LnI implements InterfaceC164967Zl {
    public final Activity A00;
    public final AbstractC59962oe A01;
    public final InterfaceC11380iw A02;
    public final C41761wQ A03;
    public final UserSession A04;
    public final C7X1 A05;
    public final FPB A06;
    public final InterfaceC164997Zo A07;
    public final InterfaceC08830cm A08;
    public final InterfaceC08830cm A09;
    public final LEK A0A;
    public final InterfaceC08830cm A0B;

    public C49092LnI(Activity activity, AbstractC59962oe abstractC59962oe, InterfaceC11380iw interfaceC11380iw, UserSession userSession, C7X1 c7x1, FPB fpb, LEK lek, InterfaceC164997Zo interfaceC164997Zo, InterfaceC08830cm interfaceC08830cm, InterfaceC08830cm interfaceC08830cm2, InterfaceC08830cm interfaceC08830cm3) {
        AbstractC25234BEr.A0k(3, abstractC59962oe, interfaceC164997Zo, c7x1, interfaceC08830cm);
        AbstractC25234BEr.A0l(8, lek, interfaceC08830cm2, fpb, interfaceC08830cm3);
        this.A04 = userSession;
        this.A00 = activity;
        this.A01 = abstractC59962oe;
        this.A02 = interfaceC11380iw;
        this.A07 = interfaceC164997Zo;
        this.A05 = c7x1;
        this.A09 = interfaceC08830cm;
        this.A0A = lek;
        this.A08 = interfaceC08830cm2;
        this.A06 = fpb;
        this.A0B = interfaceC08830cm3;
        this.A03 = AbstractC31173DnH.A0S();
        abstractC59962oe.registerLifecycleListener(new JXH(this));
    }

    @Override // X.InterfaceC164967Zl
    public final void Eku(MessageIdentifier messageIdentifier) {
        C193328hC A0H;
        boolean z;
        String str;
        String str2;
        C14360o3.A0B(messageIdentifier, 0);
        if (!AbstractC166987dD.A1a(this.A0B.get())) {
            LEK lek = this.A0A;
            UserSession userSession = this.A04;
            z = true;
            C83403nh A00 = LEK.A00(lek, messageIdentifier.A01, "FailedMessageDialogManager", true);
            if (A00 != null) {
                C114675Fx c114675Fx = A00.A0r;
                String str3 = null;
                if (c114675Fx != null) {
                    str = c114675Fx.A03;
                } else {
                    str = null;
                }
                if (C14360o3.A0K(str, "800")) {
                    DirectThreadKey A02 = JRE.A02((C3o9) this.A09.get());
                    if (A02 != null) {
                        str3 = A02.A01;
                    }
                    String A0g = A00.A0g();
                    if (str3 != null && A0g != null) {
                        AbstractC25651Mw.A00(userSession).E4s(new C7ME(str3, A0g));
                        return;
                    }
                }
                ArrayList A17 = AbstractC25225BEi.A17(2);
                Activity activity = this.A00;
                A17.add(AbstractC166997dE.A0p(activity, 2131960785));
                if (A00.A1F != C05F.A0Y) {
                    A17.add(AbstractC166997dE.A0p(activity, 2131960385));
                }
                A17.add(AbstractC166997dE.A0p(activity, 2131971483));
                A0H = AbstractC31171DnF.A0H(activity);
                C114675Fx c114675Fx2 = A00.A0r;
                if (c114675Fx2 != null && !c114675Fx2.A0B && (str2 = c114675Fx2.A02) != null && str2.length() != 0) {
                    A0H.A0r(str2);
                }
                A0H.A0m(this.A01, userSession);
                A0H.A0f(new DialogInterfaceOnClickListenerC48022LMr(3, A00, this, A17), (CharSequence[]) A17.toArray(new String[0]));
            } else {
                return;
            }
        } else {
            String str4 = messageIdentifier.A01;
            ArrayList A172 = AbstractC25225BEi.A17(2);
            Activity activity2 = this.A00;
            A172.add(AbstractC166997dE.A0p(activity2, 2131960785));
            if (AbstractC43593JPy.A0Z(this.A08).Cc4(str4)) {
                A172.add(AbstractC166997dE.A0p(activity2, 2131960385));
            }
            A172.add(AbstractC166997dE.A0p(activity2, 2131971483));
            A0H = AbstractC31171DnF.A0H(activity2);
            A0H.A0m(this.A01, this.A04);
            A0H.A0f(new LMH(A172, this, str4, 2), (CharSequence[]) A172.toArray(new String[0]));
            z = true;
        }
        AbstractC31178DnM.A1R(A0H, z);
    }
}
