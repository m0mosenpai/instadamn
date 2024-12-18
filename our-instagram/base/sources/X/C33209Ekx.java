package X;

import android.content.Context;
import android.os.Bundle;
import android.provider.Telephony;
import android.widget.CompoundButton;
import androidx.fragment.app.Fragment;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import java.util.ArrayList;

/* renamed from: X.Ekx, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C33209Ekx extends AbstractC33235ElU implements InterfaceC60122ou {
    public static final String __redex_internal_original_name = "FollowAndInviteOptionsFragment";
    public C35121FeO A00;
    public C35042FcF A01;
    public boolean A02;
    public final String A03 = "settings_follow_and_invite_options";
    public final InterfaceC09390do A04 = AbstractC60492pY.A02(this);
    public final String A05 = "settings_follow_and_invite_options";

    @Override // X.InterfaceC60122ou
    public final void configureActionBar(InterfaceC56362iU interfaceC56362iU) {
        C14360o3.A0B(interfaceC56362iU, 0);
        AbstractC33235ElU.A08(this, interfaceC56362iU, 2131962682);
    }

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return AbstractC166987dD.A0n(this.A04);
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return this.A05;
    }

    @Override // X.AbstractC33235ElU, X.AbstractC60672pq, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        int A02 = C0f9.A02(1514449706);
        super.onCreate(bundle);
        C0f9.A09(754060516, A02);
    }

    /* JADX WARN: Type inference failed for: r10v2, types: [X.0oO, java.lang.Object] */
    @Override // X.AbstractC60672pq, X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onResume() {
        C36731GHa c36731GHa;
        int A02 = C0f9.A02(-947963742);
        super.onResume();
        ArrayList A1E = AbstractC166987dD.A1E();
        InterfaceC09390do interfaceC09390do = this.A04;
        C35042FcF c35042FcF = new C35042FcF(this, this, AbstractC166987dD.A0r(interfaceC09390do), this);
        this.A01 = c35042FcF;
        UserSession userSession = c35042FcF.A04;
        C08730cb c08730cb = C17060sy.A01;
        if (AbstractC31171DnF.A0T(userSession, c08730cb).Byy() != null || C35266Fh1.A05(userSession)) {
            Fragment fragment = c35042FcF.A02;
            C31335Dq0 c31335Dq0 = new C31335Dq0(AbstractC166997dE.A0N(fragment).getString(2131974310));
            c31335Dq0.A0I = false;
            c31335Dq0.A0M = true;
            A1E.add(c31335Dq0);
            if (C35266Fh1.A05(userSession)) {
                String A0q = AbstractC166997dE.A0q(AbstractC166997dE.A0N(fragment), 2131953374);
                ?? obj = new Object();
                obj.A00 = true;
                C36731GHa c36731GHa2 = new C36731GHa((CompoundButton.OnCheckedChangeListener) new C35730FqD(14, c35042FcF, obj), (CharSequence) A0q, false);
                c35042FcF.A01 = c36731GHa2;
                A1E.add(c36731GHa2);
                c36731GHa2.A0D = AbstractC167007dF.A1T(AbstractC31171DnF.A0T(userSession, c08730cb).CQD());
                C35246Fgf c35246Fgf = new C35246Fgf(AbstractC166997dE.A0N(fragment).getString(2131953373));
                c35246Fgf.A01 = R.style.PrivacyTextStyle;
                A1E.add(c35246Fgf);
            }
            Boolean Byy = AbstractC31171DnF.A0T(userSession, c08730cb).Byy();
            if (Byy != null) {
                android.net.Uri A03 = AbstractC08820cl.A03(AbstractC63260SgI.A01(AbstractC31173DnH.A07(fragment, new C36731GHa(new C35745Fqd(c35042FcF, 42), AbstractC166997dE.A0q(AbstractC166997dE.A0N(fragment), 2131974312), Byy.booleanValue()), A1E), MSV.A00(1236)));
                String string = AbstractC31180DnO.A02(fragment, A03).getString(2131965052);
                C35246Fgf c35246Fgf2 = new C35246Fgf(AnonymousClass773.A00(A03, string, AbstractC166997dE.A0r(AbstractC31180DnO.A02(fragment, string), string, 2131974311)));
                c35246Fgf2.A01 = R.style.PrivacyTextStyle;
                A1E.add(c35246Fgf2);
            }
            C31335Dq0 c31335Dq02 = new C31335Dq0(AbstractC166997dE.A0N(fragment).getString(2131956685));
            c31335Dq02.A0I = true;
            A1E.add(c31335Dq02);
        }
        Fragment fragment2 = c35042FcF.A02;
        Context context = fragment2.getContext();
        if (context != null) {
            if (!C54P.A01(context, userSession)) {
                c35042FcF.A02(A1E, AbstractC166997dE.A0q(AbstractC166997dE.A0N(fragment2), 2131962686));
            }
            if (AbstractC14490oL.A0H(fragment2.requireContext(), "com.whatsapp") && C18U.A06(C06090Tz.A05, userSession, 36312445249127543L)) {
                c35042FcF.A05(A1E, AbstractC166997dE.A0q(AbstractC166997dE.A0N(fragment2), 2131964673));
            }
            c35042FcF.A01(A1E, AbstractC166997dE.A0N(fragment2).getString(2131964651));
            if (Telephony.Sms.getDefaultSmsPackage(fragment2.getContext()) != null) {
                c35042FcF.A04(A1E, AbstractC166997dE.A0q(AbstractC166997dE.A0N(fragment2), 2131964652));
            }
            c35042FcF.A03(A1E, AbstractC166997dE.A0N(fragment2).getString(2131964650));
            setItems(A1E);
            C35042FcF c35042FcF2 = this.A01;
            if (c35042FcF2 != null && (c36731GHa = c35042FcF2.A01) != null) {
                this.A02 = c36731GHa.A0D;
                C35121FeO c35121FeO = new C35121FeO(new C35989Fun(this), AbstractC166987dD.A0r(interfaceC09390do));
                this.A00 = c35121FeO;
                InterfaceC02590Ai A00 = C35121FeO.A00(c35121FeO);
                AbstractC31178DnM.A12(EnumC33496ErV.SYSTEM_SETTING, A00);
                C35121FeO.A01(A00, c35121FeO);
            }
            C0f9.A09(-2025366424, A02);
            return;
        }
        throw AbstractC166997dE.A0g();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStop() {
        C36731GHa c36731GHa;
        InterfaceC02590Ai A00;
        EnumC33497ErW enumC33497ErW;
        int A02 = C0f9.A02(660560238);
        super.onStop();
        C35042FcF c35042FcF = this.A01;
        if (c35042FcF != null && (c36731GHa = c35042FcF.A01) != null) {
            boolean z = c36731GHa.A0D;
            boolean z2 = this.A02;
            C35121FeO c35121FeO = this.A00;
            if (z) {
                if (z2) {
                    if (c35121FeO != null) {
                        A00 = C35121FeO.A00(c35121FeO);
                        A00.A8R(EnumC33496ErV.SYSTEM_SETTING, "format");
                        enumC33497ErW = EnumC33497ErW.TOGGLE_UNCHANGED_ON;
                        A00.A8R(enumC33497ErW, "action");
                        AbstractC31171DnF.A1D(A00, c35121FeO.A01);
                        A00.Cht();
                    }
                } else if (c35121FeO != null) {
                    InterfaceC02590Ai A002 = C35121FeO.A00(c35121FeO);
                    A002.A8R(EnumC33496ErV.SYSTEM_SETTING, "format");
                    A002.A8R(EnumC33497ErW.TOGGLE_ON, "action");
                    C35121FeO.A01(A002, c35121FeO);
                }
            } else if (!z2) {
                if (c35121FeO != null) {
                    A00 = C35121FeO.A00(c35121FeO);
                    A00.A8R(EnumC33496ErV.SYSTEM_SETTING, "format");
                    enumC33497ErW = EnumC33497ErW.TOGGLE_UNCHANGED_OFF;
                    A00.A8R(enumC33497ErW, "action");
                    AbstractC31171DnF.A1D(A00, c35121FeO.A01);
                    A00.Cht();
                }
            } else if (c35121FeO != null) {
                InterfaceC02590Ai A003 = C35121FeO.A00(c35121FeO);
                A003.A8R(EnumC33496ErV.SYSTEM_SETTING, "format");
                A003.A8R(EnumC33497ErW.TOGGLE_OFF, "action");
                C35121FeO.A01(A003, c35121FeO);
            }
        }
        C0f9.A09(-425993702, A02);
    }
}
