package X;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.google.common.collect.ImmutableList;
import com.instagram.api.schemas.ActionButtonPartnerType;
import com.instagram.api.schemas.SMBPartnerType;
import com.instagram.common.session.UserSession;
import com.instagram.discovery.mediamap.fragment.LocationDetailFragment;
import com.instagram.user.model.User;
import java.util.ArrayList;

/* loaded from: classes6.dex */
public final class GBW implements InterfaceC151446rm {
    public final /* synthetic */ GBF A00;

    @Override // X.InterfaceC151446rm
    public final C41749IeN Agf(InterfaceC60442pS interfaceC60442pS, User user, String str) {
        return null;
    }

    @Override // X.InterfaceC151446rm
    public final String Ayg() {
        return "";
    }

    @Override // X.InterfaceC151446rm
    public final void D0f(User user, String str) {
    }

    @Override // X.InterfaceC151446rm
    public final void D0i(Context context, User user, String str) {
    }

    @Override // X.InterfaceC151446rm
    public final void D0k(User user, String str) {
    }

    @Override // X.InterfaceC151446rm
    public final void D0n(Context context, User user, String str) {
    }

    @Override // X.InterfaceC151446rm
    public final void D0p(User user) {
    }

    @Override // X.InterfaceC151446rm
    public final void D0q(User user) {
    }

    @Override // X.InterfaceC151446rm
    public final void D0r(User user, String str) {
    }

    @Override // X.InterfaceC151446rm
    public final void D0s(User user, String str) {
    }

    @Override // X.InterfaceC151446rm
    public final void D0t(C193328hC c193328hC) {
    }

    @Override // X.InterfaceC151446rm
    public final void D0u() {
    }

    @Override // X.InterfaceC151446rm
    public final void D0v(User user, String str) {
    }

    @Override // X.InterfaceC151446rm
    public final void D0w(User user, String str) {
    }

    @Override // X.InterfaceC151446rm
    public final void D0x(String str) {
    }

    @Override // X.InterfaceC151446rm
    public final void D0y(User user, String str) {
    }

    @Override // X.InterfaceC151446rm
    public final void D0z(long j, String str) {
    }

    @Override // X.AnonymousClass742
    public final void DT3(boolean z) {
    }

    @Override // X.InterfaceC151446rm
    public final void EDh(View view, User user) {
    }

    @Override // X.InterfaceC151446rm
    public final void EkW(View view) {
    }

    @Override // X.InterfaceC151446rm
    public final void Ekp(View view) {
    }

    @Override // X.InterfaceC151446rm
    public final void Ekq(View view) {
    }

    @Override // X.InterfaceC151446rm
    public final void ElI(View view) {
    }

    @Override // X.InterfaceC151446rm
    public final void Elb(View view) {
    }

    @Override // X.InterfaceC151446rm
    public final void Eli(View view) {
    }

    @Override // X.InterfaceC151446rm
    public final void FAm(Class cls, String str) {
    }

    public GBW(GBF gbf) {
        this.A00 = gbf;
    }

    @Override // X.InterfaceC151446rm
    public final void D0j(User user, String str) {
        GBF gbf = this.A00;
        LocationDetailFragment locationDetailFragment = gbf.A03;
        AbstractC31173DnH.A1W(locationDetailFragment.A02, AbstractC31173DnH.A0V(locationDetailFragment), locationDetailFragment.A03, "instagram_map_location_detail_tap_email");
        Fragment fragment = gbf.A01;
        String A0R = AnonymousClass001.A0R("mailto:", user.A03.Bj6());
        Intent intent = new Intent("android.intent.action.SENDTO");
        intent.setType("text/plain");
        intent.addFlags(268435456);
        intent.setData(AbstractC08820cl.A01(AbstractC34904FZq.A00, A0R));
        C12260kU.A0I(intent, fragment);
    }

    @Override // X.InterfaceC151446rm
    public final void D0l(User user, String str) {
        GBF gbf = this.A00;
        LocationDetailFragment locationDetailFragment = gbf.A03;
        AbstractC31173DnH.A1W(locationDetailFragment.A02, AbstractC31173DnH.A0V(locationDetailFragment), locationDetailFragment.A03, "instagram_map_location_detail_tap_call");
        Fragment fragment = gbf.A01;
        String Aqd = user.A03.Aqd();
        Aqd.getClass();
        String A0R = AnonymousClass001.A0R("tel:", Aqd.trim());
        Intent A08 = AbstractC31177DnL.A08("android.intent.action.DIAL");
        A08.setData(AbstractC08820cl.A01(AbstractC34904FZq.A00, A0R));
        C12260kU.A0I(A08, fragment);
    }

    @Override // X.InterfaceC151446rm
    public final void D0m(User user, String str) {
        GBF gbf = this.A00;
        LocationDetailFragment locationDetailFragment = gbf.A03;
        AbstractC31173DnH.A1W(locationDetailFragment.A02, AbstractC31173DnH.A0V(locationDetailFragment), locationDetailFragment.A03, "instagram_map_location_detail_tap_text");
        Fragment fragment = gbf.A01;
        String Aqd = user.A03.Aqd();
        Aqd.getClass();
        C14360o3.A0B(fragment, 1);
        C12260kU.A03(AbstractC35101FdC.A00(Aqd, null), fragment);
    }

    @Override // X.InterfaceC151446rm
    public final void D0o(ArrayList arrayList) {
        GBF gbf = this.A00;
        LocationDetailFragment locationDetailFragment = gbf.A03;
        AbstractC31173DnH.A1W(locationDetailFragment.A02, AbstractC31173DnH.A0V(locationDetailFragment), locationDetailFragment.A03, "instagram_map_location_detail_tap_contact");
        User user = gbf.A04;
        UserSession userSession = gbf.A02;
        Context context = gbf.A01.getContext();
        context.getClass();
        boolean A0C = AbstractC1567472a.A0C(user);
        AnonymousClass189.A00(userSession).A04(user, true);
        String id = user.getId();
        ImmutableList immutableList = C32363ENk.A02;
        C32363ENk A00 = FAB.A00(userSession, this, id, arrayList, A0C);
        C189448aO A0y = AbstractC25225BEi.A0y(userSession);
        AbstractC31172DnG.A1G(context.getResources(), A0y, 2131956642);
        A0y.A00().A03(context, A00);
    }

    @Override // X.InterfaceC151446rm
    public final void D10(User user, String str) {
        SMBPartnerType sMBPartnerType;
        String url;
        InterfaceC111194zh Ayj;
        GBF gbf = this.A00;
        LocationDetailFragment locationDetailFragment = gbf.A03;
        AbstractC31173DnH.A1W(locationDetailFragment.A02, AbstractC31173DnH.A0V(locationDetailFragment), locationDetailFragment.A03, "instagram_map_location_detail_tap_business_support");
        UserSession userSession = gbf.A02;
        User user2 = gbf.A04;
        AbstractC59962oe abstractC59962oe = (AbstractC59962oe) gbf.A01;
        FragmentActivity activity = abstractC59962oe.getActivity();
        activity.getClass();
        C154866xb c154866xb = new C154866xb(abstractC59962oe, userSession, AbstractC166997dE.A0n());
        ActionButtonPartnerType actionButtonPartnerType = null;
        try {
            InterfaceC111194zh Ayj2 = user.A03.Ayj();
            Ayj2.getClass();
            sMBPartnerType = AbstractC81793ku.A00(Ayj2.Amd());
        } catch (IllegalArgumentException unused) {
            sMBPartnerType = null;
        }
        if (sMBPartnerType == SMBPartnerType.A07) {
            C35226FgJ.A01(activity, userSession, EnumC53251Ngp.A05, user);
            return;
        }
        InterfaceC111194zh Ayj3 = user.A03.Ayj();
        if (Ayj3 == null) {
            url = "";
        } else {
            url = Ayj3.getUrl();
        }
        if (TextUtils.isEmpty(url)) {
            return;
        }
        if (user.A03.Ayj() != null) {
            actionButtonPartnerType = user.A03.Ayj().Bbb();
        }
        if (!AbstractC1566171j.A04(activity, actionButtonPartnerType, sMBPartnerType, url)) {
            C63397SjR c63397SjR = new C63397SjR(activity, userSession, C2Fb.A3V, url);
            c63397SjR.A0E(userSession.userId);
            AbstractC31175DnJ.A1M(abstractC59962oe, c63397SjR);
        } else {
            if (!AbstractC1566171j.A05(user2) || (Ayj = user2.A03.Ayj()) == null) {
                return;
            }
            String AcH = Ayj.AcH();
            String Bba = Ayj.Bba();
            String url2 = Ayj.getUrl();
            String id = user2.getId();
            String Amd = Ayj.Amd();
            Amd.getClass();
            c154866xb.A00(AcH, Bba, url2, id, Amd);
        }
    }

    @Override // X.AnonymousClass742
    public final void DSz(String str, boolean z) {
        GBF gbf = this.A00;
        LocationDetailFragment locationDetailFragment = gbf.A03;
        AbstractC31173DnH.A1W(locationDetailFragment.A02, AbstractC31173DnH.A0V(locationDetailFragment), locationDetailFragment.A03, "instagram_map_location_detail_tap_message");
        UserSession userSession = gbf.A02;
        User user = gbf.A04;
        AbstractC34904FZq.A00(gbf.A00, gbf.A01, userSession, user, str);
    }
}
