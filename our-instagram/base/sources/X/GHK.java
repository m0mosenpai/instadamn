package X;

import android.content.Context;
import android.os.Handler;
import android.util.Pair;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.facebook.common.dextricks.JITProfilePQR;
import com.instagram.common.session.UserSession;
import com.instagram.react.modules.base.IgReactQEModule;
import com.instagram.realtimeclient.RealtimeSubscription;
import com.instagram.user.model.User;

/* loaded from: classes6.dex */
public final class GHK implements C7XU {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public GHK(AbstractC59962oe abstractC59962oe, C3DN c3dn, int i) {
        this.A00 = i;
        if (2 - i != 0) {
            this.A02 = c3dn;
            this.A01 = abstractC59962oe;
        } else {
            this.A01 = c3dn;
            this.A02 = abstractC59962oe;
        }
    }

    public static void A00(C3DN c3dn, Object obj, Object obj2, int i) {
        ((C3DP) c3dn).A0H = new GHK(i, obj, obj2);
        c3dn.A0B();
    }

    @Override // X.C7XU
    public final void DAy() {
        String str;
        switch (this.A00) {
            case 1:
                EKN ekn = (EKN) this.A02;
                InterfaceC09390do interfaceC09390do = ekn.A01;
                UserSession A0r = AbstractC166987dD.A0r(interfaceC09390do);
                AbstractC201108us.A00(C82G.A04, EnumC201098ur.ACCEPT, C82H.A0b, null, A0r);
                UserSession A0r2 = AbstractC166987dD.A0r(interfaceC09390do);
                String str2 = ekn.A00;
                if (str2 == null) {
                    str = "threadId";
                    break;
                } else {
                    C32328ELw A00 = AbstractC34088F2q.A00(A0r2, AbstractC31171DnF.A0N(str2), "xposting_nux");
                    C140966Yy A0j = AbstractC25233BEq.A0j(ekn, interfaceC09390do);
                    A0j.A0B(null, A00);
                    AbstractC31174DnI.A1M(A0j, "broadcast_channel_xposting_education_bottomsheet");
                    return;
                }
            case 2:
                ((C3DN) this.A01).A0K((Fragment) this.A02);
                return;
            case 3:
                ((C7XU) this.A02).DAy();
                AnonymousClass983 anonymousClass983 = ((C163997Vo) this.A01).A00;
                C159457Dg c159457Dg = (C159457Dg) anonymousClass983.A1Z.getValue();
                AbstractC59962oe abstractC59962oe = anonymousClass983.A0u;
                FragmentActivity requireActivity = abstractC59962oe.requireActivity();
                UserSession userSession = anonymousClass983.A10;
                InterfaceC83713oG interfaceC83713oG = anonymousClass983.A1S;
                if (!c159457Dg.A04 || c159457Dg.A05) {
                    return;
                }
                C36881nl.A01(requireActivity, abstractC59962oe, userSession, "follow_button").A08(requireActivity, interfaceC83713oG, -1.0f);
                return;
            case 4:
                C3DN A002 = C3DN.A00.A00(((C34677FPm) this.A02).A00);
                if (A002 != null) {
                    A002.A0Q(null);
                }
                AbstractC166987dD.A1Y(this.A01);
                return;
            case 5:
                new Handler().post(new RunnableC36910GOf((GIQ) this.A02, (User) this.A01));
                return;
            case 6:
                ((C3DN) this.A01).A0Q(null);
                ((Runnable) this.A02).run();
                return;
            case 7:
                C36006Fv4 c36006Fv4 = (C36006Fv4) this.A02;
                Object obj = ((Pair) this.A01).first;
                C14360o3.A06(obj);
                c36006Fv4.A04((EnumC33417Epo) obj);
                return;
            case 8:
            default:
                ((View.OnClickListener) this.A01).onClick((View) this.A02);
                return;
            case 9:
                C33226ElG c33226ElG = (C33226ElG) this.A02;
                FXR.A01(c33226ElG, AbstractC166987dD.A0r(c33226ElG.A0E), "account_privacy", RealtimeSubscription.GRAPHQL_MQTT_VERSION, "0", new X2z(c33226ElG, 32), new C57252Pba(13, this.A01, c33226ElG));
                return;
            case 10:
                C33226ElG c33226ElG2 = (C33226ElG) this.A02;
                C33226ElG.A04(c33226ElG2, true);
                C33226ElG.A03(c33226ElG2, (User) this.A01, C05F.A0C, false);
                return;
            case 11:
                new Handler().postDelayed(new RunnableC36926GOv((AbstractC59962oe) this.A01, (C3DN) this.A02), 400L);
                return;
            case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
                new C31727DwY((C50674MYs) this.A01).A07((Context) this.A02);
                return;
            case JITProfilePQR.HEADER_COMPRESSED_SIZE_OFFSET /* 13 */:
                ((InterfaceC16660sJ) this.A01).invoke(this.A02);
                return;
            case 14:
                ((C3DN) this.A01).A0Q(null);
                C32345EMr c32345EMr = (C32345EMr) this.A02;
                InterfaceC37142GYd interfaceC37142GYd = c32345EMr.A03;
                if (interfaceC37142GYd == null) {
                    return;
                }
                String str3 = c32345EMr.A05;
                if (str3 == null) {
                    str = "targetUserId";
                    break;
                } else {
                    interfaceC37142GYd.Dy6(str3);
                    return;
                }
        }
        C14360o3.A0F(str);
        throw C00O.createAndThrow();
    }

    @Override // X.C7XU
    public final void DB3() {
        if (3 - this.A00 == 0) {
            ((C7XU) this.A02).DB3();
        }
    }

    public GHK(int i, Object obj, Object obj2) {
        this.A00 = i;
        this.A01 = obj2;
        this.A02 = obj;
    }
}
