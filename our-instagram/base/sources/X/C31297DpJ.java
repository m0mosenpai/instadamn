package X;

import android.content.Context;
import android.view.View;
import androidx.fragment.app.FragmentActivity;
import com.instagram.bloks.hosting.IgBloksScreenConfig;
import com.instagram.common.session.UserSession;
import com.instagram.direct.smartsuggestion.model.SmartSuggestion;
import com.instagram.model.direct.DirectThreadKey;
import java.util.HashMap;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.TimeZone;

/* renamed from: X.DpJ, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C31297DpJ extends AbstractC46524KiP implements GZA {
    public C2EC A00;
    public FKS A01;
    public final FragmentActivity A02;
    public final InterfaceC11380iw A03;
    public final UserSession A04;
    public final C2056398n A05;

    @Override // X.AbstractC46524KiP
    public final View A06(Context context) {
        C14360o3.A0B(context, 0);
        FKS fks = new FKS(context, this);
        this.A01 = fks;
        return fks.A00;
    }

    @Override // X.AbstractC46524KiP
    public final void A07(InterfaceC50428MOi interfaceC50428MOi, InterfaceC37159GYw interfaceC37159GYw, C2EC c2ec, String str, boolean z) {
        SmartSuggestion Bxt;
        C06090Tz c06090Tz;
        long j;
        C14360o3.A0B(interfaceC37159GYw, 1);
        if (c2ec != null && (Bxt = c2ec.Bxt()) != null && Bxt.A03 == C05F.A0j) {
            UserSession userSession = this.A04;
            if (C4K3.A01(userSession)) {
                c06090Tz = C06090Tz.A05;
                j = 36315911287738049L;
            } else if (AbstractC166987dD.A10(userSession).A1x()) {
                c06090Tz = C06090Tz.A05;
                j = 36315911287803586L;
            }
            if (C18U.A06(c06090Tz, userSession, j)) {
                this.A00 = c2ec;
                interfaceC37159GYw.Dpu(this);
                return;
            }
        }
        interfaceC37159GYw.onFailure();
    }

    @Override // X.AbstractC46524KiP
    public final void A04(boolean z) {
        C18920wW A01;
        C2EC c2ec = this.A00;
        if (c2ec != null) {
            UserSession userSession = this.A04;
            InterfaceC11380iw interfaceC11380iw = this.A03;
            long parseLong = Long.parseLong(A00(c2ec));
            String C7I = c2ec.C7I();
            if (C7I == null) {
                C7I = "";
            }
            C14360o3.A0B(userSession, 0);
            if (interfaceC11380iw == null) {
                A01 = AbstractC12220kQ.A02(userSession);
            } else {
                A01 = AbstractC12220kQ.A01(interfaceC11380iw, userSession);
            }
            InterfaceC02590Ai A0f = AbstractC166987dD.A0f(A01, "instagram_business_appointment_upsell_impression");
            if (A0f.isSampled()) {
                A0f.A9K("consumer_id", Long.valueOf(parseLong));
                AbstractC31171DnF.A1F(A0f, C7I);
                A0f.AAP("referrer_ui_component", "direct_thread_cts");
                A0f.AAP("referrer_ui_surface", "ig_direct");
                A0f.Cht();
            }
        }
    }

    @Override // X.GZA
    public final void onActionClicked() {
        String str;
        FKS fks = this.A01;
        if (fks != null) {
            fks.A00.setVisibility(8);
        }
        onBannerDismissed();
        C2056398n c2056398n = this.A05;
        InterfaceC16530ry interfaceC16530ry = c2056398n.A03;
        C0YR[] c0yrArr = C2056398n.A0d;
        if (AbstractC167017dG.A1b(c2056398n, interfaceC16530ry, c0yrArr, 2)) {
            C2EC c2ec = this.A00;
            if (c2ec != null) {
                C35157Fez c35157Fez = C35157Fez.A00;
                FragmentActivity fragmentActivity = this.A02;
                UserSession userSession = this.A04;
                c35157Fez.A02(fragmentActivity, this.A03, userSession, "com.bloks.www.services.ig.appointment.calendar", A00(c2ec), userSession.userId, "", "direct_thread_cts", "");
            }
        } else {
            AbstractC167007dF.A1L(c2056398n, interfaceC16530ry, c0yrArr, 2, true);
            C2EC c2ec2 = this.A00;
            if (c2ec2 != null) {
                FragmentActivity fragmentActivity2 = this.A02;
                UserSession userSession2 = this.A04;
                InterfaceC11380iw interfaceC11380iw = this.A03;
                C09530e4 A1L = AbstractC166987dD.A1L("merchant_id", userSession2.userId);
                C09530e4 A1L2 = AbstractC166987dD.A1L("customer_id", A00(c2ec2));
                C09530e4 A1L3 = AbstractC166987dD.A1L(AbstractC111324zv.A00(901), "appointment_creation");
                TimeZone timeZone = TimeZone.getDefault();
                if (timeZone == null || (str = timeZone.getID()) == null) {
                    str = "";
                }
                HashMap A02 = AbstractC06930Yk.A02(A1L, A1L2, A1L3, AbstractC166987dD.A1L("timezone", str), AbstractC166987dD.A1L("referrer_ui_component", "direct_thread_cts"));
                AbstractC25230BEn.A15(2, fragmentActivity2, interfaceC11380iw);
                C66277U6x A01 = C66277U6x.A01("com.bloks.www.services.ig.appointment.education", A02);
                IgBloksScreenConfig A0C = AbstractC31171DnF.A0C(userSession2);
                Integer num = C05F.A01;
                A0C.A0P = num;
                A0C.A0R = interfaceC11380iw.getModuleName();
                A0C.A00 = 32;
                A0C.A0P = num;
                A01.A04(fragmentActivity2, A0C);
            }
        }
        C2EC c2ec3 = this.A00;
        if (c2ec3 != null) {
            UserSession userSession3 = this.A04;
            InterfaceC11380iw interfaceC11380iw2 = this.A03;
            long parseLong = Long.parseLong(A00(c2ec3));
            String C7I = c2ec3.C7I();
            if (C7I == null) {
                C7I = "";
            }
            AbstractC167017dG.A1N(userSession3, interfaceC11380iw2);
            InterfaceC02590Ai A0f = AbstractC166987dD.A0f(AbstractC12220kQ.A01(interfaceC11380iw2, userSession3), "instagram_business_appointment_upsell_click");
            if (A0f.isSampled()) {
                A0f.A9K("consumer_id", Long.valueOf(parseLong));
                AbstractC31171DnF.A1F(A0f, C7I);
                A0f.AAP("referrer_ui_component", "direct_thread_cts");
                A0f.AAP("referrer_ui_surface", "ig_direct");
                A0f.Cht();
            }
        }
    }

    @Override // X.GZA
    public final void onBannerDismissed() {
        String str;
        C2EC c2ec = this.A00;
        if (c2ec != null) {
            UserSession userSession = this.A04;
            DirectThreadKey BKb = c2ec.BKb();
            SmartSuggestion Bxt = c2ec.Bxt();
            if (Bxt != null) {
                str = Bxt.A05;
            } else {
                str = null;
            }
            AbstractC34193F6r.A00(userSession, BKb, str);
        }
    }

    public C31297DpJ(FragmentActivity fragmentActivity, InterfaceC11380iw interfaceC11380iw, UserSession userSession) {
        this.A04 = userSession;
        this.A03 = interfaceC11380iw;
        this.A02 = fragmentActivity;
        this.A05 = AbstractC2056298m.A00(userSession);
    }

    private final String A00(C2EC c2ec) {
        List BSD = c2ec.BSD();
        C14360o3.A0A(BSD);
        for (Object obj : BSD) {
            String str = (String) obj;
            if (!AbstractC31172DnG.A1Z(this.A04, str)) {
                C14360o3.A07(obj);
                return str;
            }
        }
        throw new NoSuchElementException(MSV.A00(1));
    }
}
