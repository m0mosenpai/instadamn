package X;

import android.content.Intent;
import android.os.Bundle;
import android.view.Window;
import androidx.fragment.app.FragmentActivity;
import com.facebook.common.callercontext.CallerContext;
import com.facebook.common.callercontext.CallerContextable;

/* renamed from: X.ElJ, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C33227ElJ extends AbstractC33235ElU implements InterfaceC60122ou, CallerContextable {
    public static final String __redex_internal_original_name = "LinkedAccountsFragment";
    public int A00;
    public C31590DuI A01;
    public GZR A02;
    public C196188m9 A03;
    public boolean A04;
    public final CallerContext A05 = CallerContext.A01(__redex_internal_original_name);
    public final InterfaceC41501vz A07 = new C36155FxU(this, 19);
    public final InterfaceC09390do A06 = AbstractC60492pY.A02(this);

    @Override // X.InterfaceC60122ou
    public final void configureActionBar(InterfaceC56362iU interfaceC56362iU) {
        C14360o3.A0B(interfaceC56362iU, 0);
        AbstractC25229BEm.A1G(interfaceC56362iU, 2131963041);
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "sharing_settings";
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onActivityResult(int i, int i2, Intent intent) {
        if (i2 == -1) {
            super.onActivityResult(i, i2, intent);
        }
    }

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return AbstractC166987dD.A0n(this.A06);
    }

    /* JADX WARN: Code restructure failed: missing block: B:49:0x00f7, code lost:
    
        if (r8.A09(X.AbstractC31175DnJ.A0K(r2, 0)) != false) goto L46;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.util.ArrayList A00(X.C33227ElJ r16) {
        /*
            Method dump skipped, instructions count: 311
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C33227ElJ.A00(X.ElJ):java.util.ArrayList");
    }

    public static final void A01(C33227ElJ c33227ElJ, boolean z) {
        FragmentActivity requireActivity = c33227ElJ.requireActivity();
        C913045j c913045j = C913045j.A00;
        C54s c54s = new C54s(c913045j);
        c54s.A0F("entrypoint", "ig_cross_posting_settings");
        InterfaceC09390do interfaceC09390do = c33227ElJ.A06;
        c54s.A0F("account_id", AbstractC31173DnH.A0t(interfaceC09390do));
        c54s.A0F("newly_linked", String.valueOf(z));
        c54s.A0D("platform", 1);
        C54s c54s2 = new C54s(c913045j);
        c54s2.A0F("entrypoint", "ig_cross_posting_settings");
        c54s2.A0F("deeplink_destination", "cross_posting_skip_profiles_screen");
        c54s2.A0C(c54s, "deeplink_params");
        C25020B4x c25020B4x = new C25020B4x(AbstractC31177DnL.A0K(c54s2, c913045j), 3);
        if (!c33227ElJ.A04) {
            c33227ElJ.A04 = true;
            Window window = requireActivity.getWindow();
            AbstractC34209F7h.A00().A00(requireActivity, window, true, true);
            C62862tP A03 = C62862tP.A03(c33227ElJ, AbstractC166987dD.A0o(interfaceC09390do), null);
            AbstractC192798gL A02 = C192108fB.A02(null, AbstractC166987dD.A0o(interfaceC09390do), "com.bloks.www.fxcal.settings.async", c25020B4x);
            C32393EOu.A00(A02, A03, window, c33227ElJ, 13);
            c33227ElJ.A00 = c33227ElJ.scheduleAndGetLoaderId(A02);
        }
    }

    @Override // X.AbstractC33235ElU, X.AbstractC60672pq, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        int A02 = C0f9.A02(1858894094);
        super.onCreate(bundle);
        this.A02 = new C56725PFt(this, 3);
        C196188m9 c196188m9 = this.A03;
        if (c196188m9 == null) {
            c196188m9 = new C196188m9(AbstractC166987dD.A0r(this.A06));
            this.A03 = c196188m9;
        }
        String A00 = MSV.A00(891);
        c196188m9.A06(A00, false);
        InterfaceC09390do interfaceC09390do = this.A06;
        C196058lv A002 = C196068lw.A00(AbstractC166987dD.A0r(interfaceC09390do));
        CallerContext callerContext = this.A05;
        C14360o3.A06(callerContext);
        A002.A01(callerContext, null, A00);
        AbstractC31176DnK.A0Q(interfaceC09390do).A01(this.A07, C23613Ad8.class);
        C0f9.A09(670378823, A02);
    }

    @Override // X.AbstractC60672pq, X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        int A02 = C0f9.A02(1526637368);
        super.onDestroyView();
        if (this.A04) {
            stopLoader(this.A00);
            this.A04 = false;
            Window A0H = AbstractC31174DnI.A0H(this);
            if (A0H != null) {
                AbstractC34209F7h.A00().A01(A0H);
            }
        }
        C0f9.A09(-1532174352, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onPause() {
        int A02 = C0f9.A02(-1136405093);
        super.onPause();
        AbstractC31176DnK.A0Q(this.A06).A02(this.A07, C23613Ad8.class);
        C0f9.A09(-1090428883, A02);
    }

    @Override // X.AbstractC60672pq, X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onResume() {
        int A02 = C0f9.A02(-752304063);
        super.onResume();
        InterfaceC09390do interfaceC09390do = this.A06;
        AbstractC31176DnK.A0Q(interfaceC09390do).A01(this.A07, C23613Ad8.class);
        C97N.A00(C97M.A00(AbstractC166987dD.A0r(interfaceC09390do))).AV3(new C9CN(CallerContext.A00(C33227ElJ.class), "ig_android_ig_business_asset_ig_to_fb_crossposting", "ig_to_fb_crossposting", "crossposting", "loading"), C97J.A00, new C35918Ftc(this, 1));
        setItems(A00(this));
        C0f9.A09(1162239188, A02);
    }
}
