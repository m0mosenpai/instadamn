package X;

import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.quickpromotion.intf.QPTooltipAnchor;
import com.instagram.quickpromotion.intf.QuickPromotionSlot;
import java.io.File;
import java.util.HashMap;

/* renamed from: X.ElR, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C33232ElR extends AbstractC33235ElU implements InterfaceC69913Ca, InterfaceC60122ou {
    public static final String __redex_internal_original_name = "BusinessOptionsFragment";
    public C64842wi A00;
    public C64742wY A01;
    public C35791FrT A02;
    public final InterfaceC09390do A03 = AbstractC60492pY.A02(this);
    public final InterfaceC09390do A04;
    public final InterfaceC41501vz A05;

    @Override // X.InterfaceC69913Ca
    public final void CKE(Intent intent) {
        C14360o3.A0B(intent, 0);
        ComponentCallbacks2 rootActivity = getRootActivity();
        C14360o3.A0C(rootActivity, AbstractC111324zv.A00(4989));
        ((InterfaceC53722dB) rootActivity).BQV().CKE(intent);
    }

    @Override // X.InterfaceC69913Ca
    public final /* synthetic */ void Cv3(int i, int i2) {
    }

    @Override // X.InterfaceC69913Ca
    public final /* synthetic */ void Cv4(int i, int i2) {
    }

    @Override // X.InterfaceC69913Ca
    public final void En7(File file, int i) {
        C14360o3.A0B(file, 0);
        FragmentActivity activity = getActivity();
        if (activity != null) {
            LJR.A02(activity, file, i);
        }
    }

    @Override // X.InterfaceC69913Ca
    public final void EnX(Intent intent, int i) {
        C14360o3.A0B(intent, 0);
        C12260kU.A06(this, intent, i);
    }

    @Override // X.InterfaceC60122ou
    public final void configureActionBar(InterfaceC56362iU interfaceC56362iU) {
        C14360o3.A0B(interfaceC56362iU, 0);
        int i = 2131954425;
        if (C2E7.A01(AbstractC31176DnK.A0g(C17060sy.A01, this.A03))) {
            i = 2131957228;
        }
        interfaceC56362iU.Efu(i);
        interfaceC56362iU.EkS(true);
        interfaceC56362iU.Ehg(new C114795Gm(null, AbstractC31174DnI.A09(requireContext(), AbstractC31174DnI.A05(this)), null, null, null, null, C05F.A00, -2, -2, -2, -2, -2, -2, -2, true));
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "settings_business_options";
    }

    @Override // X.AbstractC33235ElU, X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        C14360o3.A0B(view, 0);
        super.onViewCreated(view, bundle);
        C64842wi c64842wi = this.A00;
        if (c64842wi != null) {
            c64842wi.DiZ();
        }
        C07S c07s = C07S.STARTED;
        C07X viewLifecycleOwner = getViewLifecycleOwner();
        AbstractC166987dD.A1Z(new C57166PZk(c07s, this, viewLifecycleOwner, null, 7), C07Y.A00(viewLifecycleOwner));
    }

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return AbstractC166987dD.A0n(this.A03);
    }

    public C33232ElR() {
        X2z x2z = new X2z(this, 48);
        InterfaceC09390do A00 = AbstractC09440dt.A00(EnumC09460dv.A02, new X2z(new X2z(this, 45), 46));
        this.A04 = AbstractC25225BEi.A0a(new X2z(A00, 47), x2z, new C57252Pba(16, null, A00), AbstractC25225BEi.A1D(C50915Mek.class));
        this.A05 = new C36155FxU(this, 18);
    }

    /* JADX WARN: Code restructure failed: missing block: B:118:0x0222, code lost:
    
        if (X.C18U.A06(r7, r2, 36316173280743515L) == false) goto L81;
     */
    /* JADX WARN: Code restructure failed: missing block: B:270:0x0764, code lost:
    
        if (r6.A2H() == false) goto L282;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0039, code lost:
    
        if (X.C27S.A00().A03().A03(r3.A02, X.C05F.A01, true) == false) goto L8;
     */
    /* JADX WARN: Type inference failed for: r0v187, types: [X.ElV, java.lang.Object, X.GHY] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void A00(X.C33232ElR r25) {
        /*
            Method dump skipped, instructions count: 1930
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C33232ElR.A00(X.ElR):void");
    }

    @Override // X.AbstractC33235ElU, X.AbstractC60672pq, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        int A02 = C0f9.A02(-915856484);
        super.onCreate(bundle);
        C27961Xa A00 = AbstractC54912fq.A00();
        InterfaceC09390do interfaceC09390do = this.A03;
        UserSession A0r = AbstractC166987dD.A0r(interfaceC09390do);
        HashMap A1G = AbstractC166987dD.A1G();
        A1G.put(QPTooltipAnchor.A18, new Object());
        this.A01 = A00.A05(A0r, A1G);
        C27961Xa A002 = AbstractC54912fq.A00();
        UserSession A0r2 = AbstractC166987dD.A0r(interfaceC09390do);
        QuickPromotionSlot quickPromotionSlot = QuickPromotionSlot.A0m;
        C54922fr A0S = AbstractC31175DnJ.A0S();
        A0S.A01(new C31450Dru(this, 4), this.A01);
        this.A00 = AbstractC31175DnJ.A0T(this, A0r2, A0S, A002, quickPromotionSlot);
        String str = C35791FrT.A09;
        C35791FrT c35791FrT = new C35791FrT(this, AbstractC166987dD.A0r(interfaceC09390do), this, this);
        this.A02 = c35791FrT;
        if (c35791FrT.A01()) {
            AbstractC31176DnK.A0Q(interfaceC09390do).A01(this.A05, C36063Fvz.class);
        }
        registerLifecycleListener(this.A01);
        C0f9.A09(-60227208, A02);
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onDestroy() {
        int A02 = C0f9.A02(601381266);
        super.onDestroy();
        AbstractC31176DnK.A0Q(this.A03).A02(this.A05, C36063Fvz.class);
        unregisterLifecycleListener(this.A01);
        C0f9.A09(1835511153, A02);
    }

    @Override // X.AbstractC60672pq, X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onResume() {
        int A02 = C0f9.A02(-2099526735);
        super.onResume();
        A00(this);
        Context requireContext = requireContext();
        C08790ch A00 = AbstractC018607g.A00(this);
        UserSession A0r = AbstractC166987dD.A0r(this.A03);
        GG7 gg7 = new GG7(this, 0);
        C14360o3.A0B(A0r, 2);
        C1GJ.A00(requireContext, A00, FA5.A00(A0r, new FHT(gg7)));
        C0f9.A09(1071916398, A02);
    }
}
