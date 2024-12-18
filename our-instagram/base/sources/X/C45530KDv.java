package X;

import android.app.Activity;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;

/* renamed from: X.KDv, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45530KDv extends AbstractC193068gm {
    public final int A00;
    public final Object A01;

    public C45530KDv(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    @Override // X.AbstractC192848gQ
    public final void A03(AbstractC115105If abstractC115105If) {
        switch (this.A00) {
            case 0:
                C14360o3.A0B(abstractC115105If, 0);
                AbstractC25011Ke abstractC25011Ke = (AbstractC25011Ke) this.A01;
                Throwable A01 = abstractC115105If.A01();
                if (A01 == null) {
                    A01 = AbstractC166987dD.A18("Network error in InstagramConsentBloksActionLauncher");
                }
                abstractC25011Ke.setException(A01);
                return;
            case 1:
                return;
            case 2:
                C14360o3.A0B(abstractC115105If, 0);
                C47756L7c c47756L7c = (C47756L7c) this.A01;
                C9GR.A0B(c47756L7c.A00, "something_went_wrong");
                UserSession userSession = c47756L7c.A02;
                InterfaceC11380iw interfaceC11380iw = c47756L7c.A01;
                AbstractC47015KqY.A00(AbstractC12220kQ.A01(interfaceC11380iw, userSession), abstractC115105If, c47756L7c.A03);
                return;
            default:
                C9GR.A0F(((C49376LsA) this.A01).A00.requireActivity(), "add_yours_participation_screen_error_loading", 2131952446);
                return;
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0002. Please report as an issue. */
    @Override // X.AbstractC192848gQ
    public final /* bridge */ /* synthetic */ void A04(Object obj) {
        C66246U5q c66246U5q;
        UserSession userSession;
        FragmentActivity fragmentActivity;
        InterfaceC11380iw interfaceC11380iw;
        switch (this.A00) {
            case 0:
                C14360o3.A0B(obj, 0);
                ((AbstractC25011Ke) this.A01).set(obj);
                return;
            case 1:
                c66246U5q = (C66246U5q) obj;
                C14360o3.A0B(c66246U5q, 0);
                C48592LeU c48592LeU = (C48592LeU) this.A01;
                Activity activity = c48592LeU.A03;
                if (!(activity instanceof FragmentActivity)) {
                    return;
                }
                userSession = c48592LeU.A06;
                fragmentActivity = (FragmentActivity) activity;
                interfaceC11380iw = c48592LeU.A05;
                AbstractC33787EwD.A00(C62862tP.A04(fragmentActivity, interfaceC11380iw, userSession), c66246U5q);
                return;
            case 2:
                C66246U5q c66246U5q2 = (C66246U5q) obj;
                C14360o3.A0B(c66246U5q2, 0);
                C47756L7c c47756L7c = (C47756L7c) this.A01;
                UserSession userSession2 = c47756L7c.A02;
                FragmentActivity fragmentActivity2 = c47756L7c.A00;
                InterfaceC11380iw interfaceC11380iw2 = c47756L7c.A01;
                AbstractC33787EwD.A00(C62862tP.A04(fragmentActivity2, interfaceC11380iw2, userSession2), c66246U5q2);
                String str = c47756L7c.A03;
                C25531Mh A0A = AbstractC31171DnF.A0A(AbstractC166987dD.A0f(AbstractC12220kQ.A01(interfaceC11380iw2, userSession2), "hidden_words_opening_bottom_sheet"), 167);
                if (!AbstractC25226BEj.A1Z(A0A)) {
                    return;
                }
                A0A.A0R("surface_type", str);
                A0A.Cht();
                return;
            default:
                c66246U5q = (C66246U5q) obj;
                C14360o3.A0B(c66246U5q, 0);
                C49376LsA c49376LsA = (C49376LsA) this.A01;
                userSession = c49376LsA.A01;
                fragmentActivity = c49376LsA.A00.requireActivity();
                interfaceC11380iw = c49376LsA.A02;
                AbstractC33787EwD.A00(C62862tP.A04(fragmentActivity, interfaceC11380iw, userSession), c66246U5q);
                return;
        }
    }
}
