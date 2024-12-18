package X;

import android.os.Bundle;
import android.os.Handler;
import com.instagram.urlhandlers.twofacsettingsexternal.TwoFacSettingsExternalUrlHandlerActivity;
import java.util.ArrayList;

/* renamed from: X.ElN, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C33230ElN extends AbstractC33235ElU implements InterfaceC60072op, InterfaceC60122ou {
    public static final String __redex_internal_original_name = "TwoFacChooseSecurityMethodFragment";
    public Bundle A00;
    public boolean A01;
    public boolean A02;
    public boolean A03;
    public final InterfaceC09390do A04 = AbstractC09440dt.A01(GU9.A00);
    public final InterfaceC09390do A06 = AbstractC31180DnO.A0v(this, 34);
    public final InterfaceC09390do A07 = AbstractC31180DnO.A0v(this, 35);
    public final InterfaceC09390do A05 = AbstractC60492pY.A02(this);

    @Override // X.InterfaceC60122ou
    public final void configureActionBar(InterfaceC56362iU interfaceC56362iU) {
        C14360o3.A0B(interfaceC56362iU, 0);
        interfaceC56362iU.Efu(2131975912);
        AbstractC31176DnK.A1C(new ViewOnClickListenerC35677FpC(this, 53), AbstractC31174DnI.A0K(), interfaceC56362iU);
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return AbstractC31182DnR.A02();
    }

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return AbstractC166987dD.A0n(this.A05);
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0020, code lost:
    
        if (r5 != false) goto L10;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v8, types: [X.Ffs] */
    /* JADX WARN: Type inference failed for: r21v0, types: [X.2pq, X.ElU, androidx.fragment.app.Fragment, java.lang.Object, X.ElN] */
    /* JADX WARN: Type inference failed for: r8v7, types: [X.Ffs] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void A00(X.C33230ElN r21) {
        /*
            Method dump skipped, instructions count: 755
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C33230ElN.A00(X.ElN):void");
    }

    @Override // X.InterfaceC60072op
    public final boolean onBackPressed() {
        boolean z = false;
        if (requireActivity() instanceof TwoFacSettingsExternalUrlHandlerActivity) {
            AbstractC25227BEk.A1B(this);
            return false;
        }
        Bundle bundle = this.A00;
        if (bundle != null) {
            boolean z2 = bundle.getBoolean("is_two_factor_enabled");
            Bundle bundle2 = this.A00;
            if (bundle2 != null) {
                boolean z3 = bundle2.getBoolean("is_totp_two_factor_enabled");
                if (z2 || z3) {
                    z = true;
                }
                Bundle A0b = AbstractC166987dD.A0b();
                A0b.putBoolean(AbstractC31182DnR.A05(326, 15, 114), z);
                AbstractC31174DnI.A0I(this).A0y(AbstractC31182DnR.A05(413, 26, 3), A0b);
                getParentFragmentManager().A0x(AbstractC31182DnR.A05(525, 24, 10), 1);
                return true;
            }
        }
        C14360o3.A0F("twoFacResponseBundle");
        throw C00O.createAndThrow();
    }

    @Override // X.AbstractC33235ElU, X.AbstractC60672pq, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        int A02 = C0f9.A02(-377397070);
        super.onCreate(bundle);
        this.A00 = requireArguments();
        EVO.A01(this);
        AbstractC12990ll A0o = AbstractC166987dD.A0o(this.A05);
        Bundle bundle2 = this.A00;
        if (bundle2 != null) {
            boolean z = bundle2.getBoolean("is_two_factor_enabled");
            Bundle bundle3 = this.A00;
            if (bundle3 != null) {
                boolean z2 = bundle3.getBoolean("is_totp_two_factor_enabled");
                C14360o3.A0B(A0o, 0);
                InterfaceC02590Ai A0f = AbstractC166987dD.A0f(AbstractC12220kQ.A01(C34918Fa4.A01, A0o), "instagram_two_fac_setup_view");
                AbstractC31181DnP.A0c(A0f);
                A0f.A7v("totp", AbstractC31173DnH.A0d(A0f, AbstractC31173DnH.A0e(A0f, "view", "choose_method", z), "sms", z2));
                A0f.Cht();
                C0f9.A09(1463857758, A02);
                return;
            }
        }
        C14360o3.A0F("twoFacResponseBundle");
        throw C00O.createAndThrow();
    }

    @Override // X.AbstractC60672pq, X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onResume() {
        int A02 = C0f9.A02(-574363441);
        super.onResume();
        A00(this);
        C0f9.A09(562378047, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStart() {
        ArrayList<String> stringArrayList;
        int A02 = C0f9.A02(-393352943);
        super.onStart();
        Bundle bundle = this.A00;
        if (bundle == null) {
            C14360o3.A0F("twoFacResponseBundle");
            throw C00O.createAndThrow();
        }
        boolean z = false;
        if (bundle.getBoolean("direct_launch_backup_codes") && !this.A02 && (stringArrayList = bundle.getStringArrayList("backup_codes")) != null && !stringArrayList.isEmpty()) {
            this.A02 = true;
            this.A01 = true;
            ((Handler) this.A04.getValue()).post((Runnable) this.A06.getValue());
        }
        ArrayList parcelableArrayList = bundle.getParcelableArrayList("trusted_devices");
        if (parcelableArrayList == null || parcelableArrayList.isEmpty()) {
            z = true;
        }
        this.A03 = !z;
        C0f9.A09(-1644764771, A02);
    }
}
