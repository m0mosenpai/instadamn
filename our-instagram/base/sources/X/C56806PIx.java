package X;

import android.content.Context;
import android.os.Bundle;
import android.view.Window;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.realtimeclient.GraphQLSubscriptionID;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: X.PIx, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C56806PIx implements InterfaceC71994XEi, InterfaceC147726kx, InterfaceC58002Pnm, InterfaceC58003Pnn {
    public C54801OJv A00;
    public Integer A01;
    public String A02;
    public java.util.Set A03;
    public final Context A04;
    public final AbstractC59962oe A05;
    public final UserSession A06;
    public final C55852Or2 A07;
    public final InterfaceC147626kn A08;
    public final OL4 A09;
    public final C3PO A0A;
    public final C147896lL A0B;
    public final PJC A0C;
    public final OW8 A0D;
    public final C56179Owm A0E;
    public final OMc A0F;
    public final InterfaceC16820sZ A0G;
    public final InterfaceC16820sZ A0H;
    public final InterfaceC16620sF A0I;
    public final InterfaceC16620sF A0J;

    @Override // X.InterfaceC147726kx
    public final boolean CPQ() {
        return false;
    }

    @Override // X.InterfaceC71994XEi
    public final void CuK(User user) {
        C14360o3.A0B(user, 0);
        C57157PZb.A01(user, this, AbstractC25235BEs.A0S(this.A05), 11);
    }

    @Override // X.InterfaceC71994XEi
    public final void D1s(User user) {
        C14360o3.A0B(user, 0);
        C57157PZb.A01(user, this, AbstractC25235BEs.A0S(this.A05), 12);
    }

    @Override // X.InterfaceC71994XEi
    public final /* synthetic */ void DHz(String str) {
    }

    @Override // X.InterfaceC71994XEi
    public final void DN5(User user, Integer num) {
        AbstractC167017dG.A1N(user, num);
        AbstractC166987dD.A1Z(new C57168PZm(user, this, num, (InterfaceC23621Ds) null, 29), AbstractC25235BEs.A0S(this.A05));
    }

    @Override // X.InterfaceC71994XEi
    public final /* synthetic */ void DOl() {
    }

    @Override // X.InterfaceC71994XEi
    public final /* synthetic */ void DTp(GZU gzu, User user) {
    }

    @Override // X.InterfaceC71994XEi
    public final void Df6(User user) {
        C14360o3.A0B(user, 0);
        C57157PZb.A01(user, this, AbstractC25235BEs.A0S(this.A05), 13);
    }

    @Override // X.InterfaceC71994XEi
    public final /* synthetic */ void Dxl(String str) {
    }

    @Override // X.InterfaceC71994XEi
    public final /* synthetic */ void E1r(C1P1 c1p1, AbstractC53633Nne abstractC53633Nne, User user, Integer num) {
    }

    public static final void A00(C56806PIx c56806PIx, Integer num) {
        String str;
        String str2;
        c56806PIx.A0F.A00();
        PJC pjc = c56806PIx.A0C;
        String str3 = pjc.A09;
        if (str3 != null) {
            Bundle A0b = AbstractC166987dD.A0b();
            A0b.putString("IgLiveWithInviteFragment.ARGUMENTS_KEY_EXTRA_BROADCAST_ID", str3);
            int intValue = num.intValue();
            if (1 != intValue) {
                str = GraphQLSubscriptionID.INAPP_NOTIFICATION_TYPE_COMMENT;
            } else {
                str = "footer";
            }
            A0b.putString("IgLiveWithInviteFragment.ARGUMENTS_KEY_EXTRA_OPENED_METHOD", str);
            AbstractC31173DnH.A1C(A0b, c56806PIx.A06);
            C56805PIw c56805PIw = pjc.A0T;
            C25531Mh A02 = C56805PIw.A02(c56805PIw, C05F.A0i);
            if (1 - intValue != 0) {
                str2 = GraphQLSubscriptionID.INAPP_NOTIFICATION_TYPE_COMMENT;
            } else {
                str2 = "footer";
            }
            A02.A0R("method", str2);
            ConcurrentHashMap concurrentHashMap = c56805PIw.A0U;
            ArrayList A0o = AbstractC50522MSa.A0o(A02, concurrentHashMap);
            Iterator A14 = AbstractC166997dE.A14(concurrentHashMap);
            while (A14.hasNext()) {
                AbstractC31177DnL.A1R((String) MSZ.A0m(A14), A0o);
            }
            C56805PIw.A08(A02, c56805PIw, A0o);
            A02.Cht();
        }
    }

    public static final void A01(C56806PIx c56806PIx, boolean z) {
        Window window;
        FragmentActivity activity = c56806PIx.A05.getActivity();
        if (activity != null && (window = activity.getWindow()) != null) {
            if (z) {
                window.addFlags(128);
            } else {
                window.clearFlags(128);
            }
        }
    }

    public final void A02(boolean z, boolean z2) {
        this.A0C.A0T.A0L(z, z2);
        this.A0I.invoke(AbstractC166997dE.A0b(), null);
    }

    @Override // X.InterfaceC147726kx
    public final boolean CPP() {
        return this.A0C.A05.A00();
    }

    @Override // X.InterfaceC147726kx
    public final void Ch6() {
        this.A0C.A02(C05F.A01, null, true);
    }

    @Override // X.InterfaceC71994XEi
    public final void CvT(User user, String str) {
        this.A0F.A00();
    }

    @Override // X.InterfaceC58003Pnn
    public final void DOK(int i, boolean z) {
        InterfaceC58278PsW interfaceC58278PsW = this.A07.A00;
        if (i == 0) {
            interfaceC58278PsW.CgY();
        } else {
            interfaceC58278PsW.CgZ();
        }
    }

    @Override // X.InterfaceC58002Pnm
    public final void DOe(boolean z, boolean z2) {
        this.A0F.A04(z2);
    }

    @Override // X.InterfaceC147726kx
    public final boolean Ejd(String str) {
        String str2 = this.A02;
        if (str2 != null && !str2.equals(str)) {
            return true;
        }
        return false;
    }

    public C56806PIx(Context context, AbstractC59962oe abstractC59962oe, UserSession userSession, C55852Or2 c55852Or2, InterfaceC147626kn interfaceC147626kn, OL4 ol4, C3PO c3po, C147896lL c147896lL, PJC pjc, OW8 ow8, C56179Owm c56179Owm, OMc oMc, C54801OJv c54801OJv, InterfaceC16820sZ interfaceC16820sZ, InterfaceC16820sZ interfaceC16820sZ2, InterfaceC16620sF interfaceC16620sF, InterfaceC16620sF interfaceC16620sF2, boolean z) {
        Integer num;
        AbstractC43594JPz.A1P(userSession, c3po);
        this.A04 = context;
        this.A06 = userSession;
        this.A0A = c3po;
        this.A09 = ol4;
        this.A0C = pjc;
        this.A0I = interfaceC16620sF;
        this.A0F = oMc;
        this.A0E = c56179Owm;
        this.A0D = ow8;
        this.A07 = c55852Or2;
        this.A00 = c54801OJv;
        this.A05 = abstractC59962oe;
        this.A0B = c147896lL;
        this.A08 = interfaceC147626kn;
        this.A0J = interfaceC16620sF2;
        this.A0H = interfaceC16820sZ;
        this.A0G = interfaceC16820sZ2;
        pjc.A06 = this;
        pjc.A07 = this;
        pjc.A08 = this;
        ow8.A06 = this;
        c56179Owm.A00 = this;
        if (c3po == C3PO.A0A) {
            num = C05F.A01;
        } else if (c3po == C3PO.A07) {
            num = C05F.A0N;
        } else if (z) {
            num = C05F.A0C;
        } else {
            num = C05F.A00;
        }
        this.A01 = num;
        this.A03 = C16910sj.A00;
    }

    @Override // X.InterfaceC147726kx
    public final Integer BeW(String str) {
        if (Ejd(str)) {
            return C05F.A0N;
        }
        return null;
    }
}
