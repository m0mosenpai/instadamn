package X;

import android.content.Context;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.model.direct.DirectThreadKey;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes6.dex */
public final class G3M implements InterfaceC37156GYt {
    public final Context A00;
    public final FragmentActivity A01;
    public final UserSession A02;
    public final C4KT A03;
    public final FPF A04;
    public final C2DS A05;
    public final E70 A06;
    public final InterfaceC190658cN A07;
    public final InterfaceC190658cN A08;
    public final InterfaceC09390do A09;
    public final InterfaceC09390do A0A;
    public final InterfaceC09390do A0B;
    public final InterfaceC09390do A0C;
    public final InterfaceC09390do A0D;
    public final InterfaceC16620sF A0E;
    public final C47142Eg A0F;

    public G3M(Context context, FragmentActivity fragmentActivity, UserSession userSession, FPF fpf, E70 e70) {
        C14360o3.A0B(userSession, 3);
        this.A01 = fragmentActivity;
        this.A00 = context;
        this.A02 = userSession;
        this.A06 = e70;
        this.A04 = fpf;
        this.A05 = AbstractC28761aE.A00(userSession);
        this.A0F = AbstractC47132Ef.A00(userSession);
        this.A03 = C4KS.A00(userSession);
        this.A07 = new G9H(this, 16);
        this.A08 = new G9H(this, 17);
        EnumC09460dv enumC09460dv = EnumC09460dv.A02;
        this.A09 = AbstractC09440dt.A00(enumC09460dv, new C37052GUi(this, 45));
        this.A0E = new C30190DRv(this, 43);
        this.A0C = AbstractC09440dt.A00(enumC09460dv, new C37052GUi(this, 48));
        this.A0D = AbstractC09440dt.A00(enumC09460dv, new C37052GUi(this, 49));
        this.A0B = AbstractC09440dt.A00(enumC09460dv, new C37052GUi(this, 47));
        this.A0A = AbstractC09440dt.A00(enumC09460dv, new C37052GUi(this, 46));
    }

    public static final void A00(G3M g3m, String str, String str2, boolean z) {
        if (str2 == null) {
            if (z) {
                str2 = "Failed to toggle TTLC";
            } else {
                str2 = "Cannot cutover this thread";
            }
        }
        C193328hC A0a = AbstractC31176DnK.A0a(g3m.A00, str, str2);
        A0a.A0S(DialogInterfaceOnClickListenerC35404FjN.A00, EnumC193348hE.A02, 2131968948);
        AbstractC166987dD.A1W(A0a);
    }

    public static final boolean A01(G3M g3m, boolean z) {
        User user;
        String str;
        User A01 = C17060sy.A01.A01(g3m.A02);
        InterfaceC09390do interfaceC09390do = g3m.A06.A0c;
        if (AbstractC31171DnF.A0n(interfaceC09390do).isEmpty()) {
            user = A01;
        } else {
            C32107E9f c32107E9f = (C32107E9f) AbstractC001800i.A0O(AbstractC31171DnF.A0n(interfaceC09390do), 0);
            if (c32107E9f != null) {
                user = c32107E9f.A00;
            }
            A00(g3m, "No target user found", null, z);
            return false;
        }
        if (user != null) {
            Long BTC = user.BTC();
            int A0N = (int) AbstractC166987dD.A0N(g3m.A0F.A1J.getValue());
            if (BTC != null && BTC.longValue() > 0) {
                if (user.BJ8() == 0 && !C2E7.A03(user)) {
                    if (!user.A1Z()) {
                        str = "Target user is not eligible for WA infra (waAddressable = false)";
                    } else if (!A01.A1Z()) {
                        str = "Current user is not eligible for WA infra (waAddressable = false)";
                    } else if (A0N > 0 || (str = AnonymousClass001.A0O("Current user is not e2ee eligible, eligibility level: ", A0N)) == null) {
                        return true;
                    }
                } else {
                    str = "Target is not a normal IG account (could be a fb/professional/creator/business account)";
                }
            } else {
                str = "Target user has no eimu id";
            }
            A00(g3m, str, null, z);
            return false;
        }
        A00(g3m, "No target user found", null, z);
        return false;
    }

    @Override // X.InterfaceC37156GYt
    public final boolean isEnabled() {
        UserSession userSession = this.A02;
        if (AbstractC453326q.A01(userSession) || AbstractC453326q.A00(userSession) || C18U.A06(C06090Tz.A05, userSession, 36329852751725103L)) {
            E70 e70 = this.A06;
            if ((e70.A08() instanceof DirectThreadKey) && !E70.A04(e70)) {
                return true;
            }
        }
        return false;
    }

    @Override // X.InterfaceC37156GYt
    public final List getItems() {
        ArrayList A1E = AbstractC166987dD.A1E();
        UserSession userSession = this.A02;
        if (AbstractC453326q.A01(userSession)) {
            A1E.add(this.A09.getValue());
        }
        if (AbstractC453326q.A00(userSession)) {
            A1E.add(this.A0C.getValue());
            A1E.add(this.A0D.getValue());
        }
        if (C18U.A06(C06090Tz.A05, userSession, 36329852751725103L)) {
            A1E.add(this.A0B.getValue());
        }
        if (AbstractC453326q.A01(userSession) || AbstractC453326q.A00(userSession)) {
            A1E.add(this.A0A.getValue());
        }
        return A1E;
    }
}
