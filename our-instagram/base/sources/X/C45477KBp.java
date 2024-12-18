package X;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.KBp, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45477KBp extends AbstractC59962oe implements InterfaceC60122ou {
    public static final String __redex_internal_original_name = "CampaignMessagesFragment";
    public LE1 A00;
    public C49511LuQ A01;
    public String A02;
    public InterfaceC16820sZ A03 = new C37013GSs(this, 41);
    public final InterfaceC09390do A04;
    public final InterfaceC09390do A05;

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "campaign_messages_fragment";
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0130  */
    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onViewCreated(android.view.View r22, android.os.Bundle r23) {
        /*
            Method dump skipped, instructions count: 414
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C45477KBp.onViewCreated(android.view.View, android.os.Bundle):void");
    }

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return AbstractC166987dD.A0n(this.A04);
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onActivityResult(int i, int i2, Intent intent) {
        String str;
        super.onActivityResult(i, i2, intent);
        if (intent != null) {
            str = intent.getStringExtra("DirectFragment.DIRECT_FRAGMENT_ARGUMENT_CAMPAIGN_MESSAGE_KEY");
        } else {
            str = null;
        }
        if (i == 92887 && i2 == -1 && str != null) {
            KZQ kzq = ((C44489Jlv) this.A05.getValue()).A00;
            C81663kb A0h = AbstractC31172DnG.A0h(kzq.A04, str);
            if (A0h != null) {
                C05A c05a = kzq.A05;
                AbstractC46431Kgr abstractC46431Kgr = (AbstractC46431Kgr) c05a.getValue();
                UserSession userSession = kzq.A02;
                C83403nh A06 = A0h.A06();
                Context context = kzq.A00;
                String str2 = JSK.A00;
                String obj = JSK.A00(context, userSession, A06, A0h, C4GQ.A04(userSession, A06, A0h)).toString();
                if (abstractC46431Kgr instanceof KQR) {
                    ArrayList A1E = AbstractC166987dD.A1E();
                    C45127Jxw c45127Jxw = (C45127Jxw) ((KQR) abstractC46431Kgr).A00;
                    List list = (List) c45127Jxw.A00;
                    ArrayList A1E2 = AbstractC166987dD.A1E();
                    for (Object obj2 : list) {
                        AbstractC25232BEp.A1Q(((C44998Jvo) obj2).A07, str, obj2, A1E2);
                    }
                    A1E.addAll(A1E2);
                    C44998Jvo c44998Jvo = new C44998Jvo(A0h.A06(), (User) A0h.BSH().get(0), str, obj, 0, A0h.BLF(), A0h.Cf8(userSession));
                    KZQ.A00(kzq, c44998Jvo);
                    A1E.add(c44998Jvo);
                    c05a.Egh(new KQR(new C45127Jxw(A1E, 38, c45127Jxw.A01)));
                }
            }
        }
    }

    public C45477KBp() {
        C37013GSs c37013GSs = new C37013GSs(this, 40);
        InterfaceC09390do A00 = AbstractC09440dt.A00(EnumC09460dv.A02, new C37013GSs(new C37013GSs(this, 37), 38));
        this.A05 = AbstractC25225BEi.A0a(new C37013GSs(A00, 39), c37013GSs, new C50170MDx(20, null, A00), AbstractC25225BEi.A1D(C44489Jlv.class));
        this.A04 = AbstractC60492pY.A02(this);
    }

    @Override // X.InterfaceC60122ou
    public final void configureActionBar(InterfaceC56362iU interfaceC56362iU) {
        AbstractC25235BEs.A1H(interfaceC56362iU);
        interfaceC56362iU.setTitle(requireContext().getString(2131964407));
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(-154602574);
        C14360o3.A0B(layoutInflater, 0);
        super.onCreateView(layoutInflater, viewGroup, bundle);
        View A0R = AbstractC25226BEj.A0R(layoutInflater, viewGroup, R.layout.direct_inbox_campaign_messages_layout, false);
        C0f9.A09(1105526944, A02);
        return A0R;
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onResume() {
        int A02 = C0f9.A02(1977324393);
        super.onResume();
        if (AbstractC72723Nt.A00(requireContext())) {
            AbstractC145016gM.A05(requireActivity(), AbstractC166987dD.A0r(this.A04), !AbstractC13440mV.A07());
        }
        C0f9.A09(-1703088985, A02);
    }
}
