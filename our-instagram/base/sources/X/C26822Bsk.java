package X;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.platform.ComposeView;
import androidx.fragment.app.FragmentActivity;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.model.reels.Reel;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;

/* renamed from: X.Bsk, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26822Bsk extends AbstractC59962oe implements InterfaceC60072op, InterfaceC60122ou {
    public static final String __redex_internal_original_name = "UpdatesHubFragment";
    public View A00;
    public boolean A01;
    public final String A02 = AbstractC167017dG.A0j();
    public final java.util.Set A03;
    public final InterfaceC09390do A04;
    public final InterfaceC09390do A05;
    public final InterfaceC09390do A06;

    @Override // X.InterfaceC60122ou
    public final void configureActionBar(InterfaceC56362iU interfaceC56362iU) {
        C14360o3.A0B(interfaceC56362iU, 0);
        interfaceC56362iU.setTitle(requireActivity().getString(2131963604));
        interfaceC56362iU.Efw(new ViewOnClickListenerC28667ClF(this, 15));
        interfaceC56362iU.ETp(true);
        interfaceC56362iU.EkS(true);
        if (C18U.A06(C06090Tz.A05, AbstractC166987dD.A0o(this.A05), 36322233480325193L)) {
            C3LO c3lo = new C3LO();
            c3lo.A06 = R.drawable.instagram_settings_pano_outline_24;
            c3lo.A05 = 2131973348;
            this.A00 = interfaceC56362iU.AA9(ViewOnClickListenerC28667ClF.A00(c3lo, this, 16));
        }
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "reel_highlights_updates_hub";
    }

    @Override // X.InterfaceC60072op
    public final boolean onBackPressed() {
        return false;
    }

    /* JADX WARN: Type inference failed for: r11v0, types: [X.0pQ, java.lang.Object] */
    public static final void A00(C114205Dh c114205Dh, C26822Bsk c26822Bsk, String str, List list) {
        InterfaceC09390do interfaceC09390do = c26822Bsk.A05;
        Reel A0M = C1OU.A04(AbstractC166987dD.A0r(interfaceC09390do)).A0M(str);
        if (A0M != null) {
            ((C25877Bcc) c26822Bsk.A06.getValue()).A05(A0M.getId());
            C1571673v.A05(c26822Bsk, AbstractC166987dD.A0r(interfaceC09390do), EnumC1571773w.A03, MSV.A00(590), C17060sy.A01.A01(AbstractC166987dD.A0r(interfaceC09390do)).getId());
            String A03 = C41661wG.A00(AbstractC166987dD.A0r(interfaceC09390do)).A03(A0M);
            C14360o3.A07(A03);
            ?? obj = new Object();
            List A0K = A0M.A0K();
            C14360o3.A07(A0K);
            Iterator it = A0K.iterator();
            int i = 0;
            while (true) {
                if (it.hasNext()) {
                    if (C14360o3.A0K(it.next(), A03)) {
                        break;
                    } else {
                        i++;
                    }
                } else {
                    i = -1;
                    break;
                }
            }
            obj.A00 = i;
            if (i == -1) {
                obj.A00 = 0;
            }
            C50162MDp c50162MDp = new C50162MDp(c26822Bsk, 9);
            Context requireContext = c26822Bsk.requireContext();
            UserSession A0r = AbstractC166987dD.A0r(interfaceC09390do);
            C14360o3.A0B(A0r, 0);
            C140626Xq A032 = C1OU.A03(requireContext, AbstractC166987dD.A0r(interfaceC09390do), A0M, new C29359Cws(c114205Dh, c26822Bsk, A0M, list, c50162MDp, obj), AbstractC82003lM.A00(A0r), "reel_highlights_updates_hub", -1);
            java.util.Set set = c26822Bsk.A03;
            A032.A06 = !set.contains(A0M.getId());
            A032.A04();
            String id = A0M.getId();
            C14360o3.A07(id);
            set.add(id);
        }
    }

    public static final void A01(C22P c22p, C26822Bsk c26822Bsk) {
        AbstractC35094Fd5.A01(c26822Bsk.requireActivity(), c22p, AbstractC166987dD.A0r(c26822Bsk.A05), C81K.A07, null, null);
    }

    public static final void A02(C26822Bsk c26822Bsk) {
        C189448aO A0g = AbstractC25231BEo.A0g(c26822Bsk.A05);
        String str = null;
        A0g.A0T = null;
        C189478aR A00 = A0g.A00();
        FragmentActivity requireActivity = c26822Bsk.requireActivity();
        C26009Bex c26009Bex = ((C26057Bfk) ((C25877Bcc) c26822Bsk.A06.getValue()).A0F.getValue()).A01;
        if (c26009Bex != null) {
            str = c26009Bex.A05;
        }
        KBC kbc = new KBC();
        Bundle A0b = AbstractC166987dD.A0b();
        A0b.putString(AbstractC111324zv.A00(1214), str);
        kbc.setArguments(A0b);
        A00.A02(requireActivity, kbc);
        C3DN A0m = AbstractC25230BEn.A0m(c26822Bsk);
        if (A0m != null) {
            ((C3DP) A0m).A0H = new C29389CxM(c26822Bsk, 0);
        }
    }

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return AbstractC166987dD.A0n(this.A05);
    }

    public C26822Bsk() {
        C50162MDp c50162MDp = new C50162MDp(this, 14);
        InterfaceC09390do A00 = AbstractC09440dt.A00(EnumC09460dv.A02, new C50162MDp(new C50162MDp(this, 11), 12));
        this.A06 = AbstractC25225BEi.A0a(new C50162MDp(A00, 13), c50162MDp, new MHV(7, (Object) null, A00), AbstractC25225BEi.A1D(C25877Bcc.class));
        this.A04 = C1XM.A00(new C50162MDp(this, 10));
        this.A01 = true;
        this.A05 = AbstractC60492pY.A02(this);
        this.A03 = new LinkedHashSet();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        int A02 = C0f9.A02(-1231959380);
        super.onCreate(bundle);
        C0f9.A09(574832368, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(-1256516128);
        ComposeView A00 = AbstractC25319BIo.A00(this, C30480DbP.A00(this, 20), -430707070);
        C0f9.A09(620568213, A02);
        return A00;
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onResume() {
        int A02 = C0f9.A02(-529643576);
        super.onResume();
        if (!this.A01) {
            ((C25877Bcc) this.A06.getValue()).A06(false);
        }
        this.A01 = false;
        C0f9.A09(-56645241, A02);
    }
}
