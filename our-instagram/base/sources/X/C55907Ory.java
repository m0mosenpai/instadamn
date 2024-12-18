package X;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager.widget.ViewPager;
import com.facebook.R;
import com.facebook.common.stringformat.StringFormatUtil;
import com.instagram.common.session.UserSession;
import com.instagram.creation.capture.quickcapture.effectinfobottomsheet.EffectInfoBottomSheetConfiguration;
import com.instagram.modal.ModalActivity;
import java.util.Locale;
import java.util.Map;

/* renamed from: X.Ory, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C55907Ory implements InterfaceC11380iw {
    public static final String __redex_internal_original_name = "EffectInfoBottomSheetController";
    public C55U A00;
    public C50881MeC A01;
    public C1821585z A02;
    public final int A04;
    public final Activity A05;
    public final View A06;
    public final View A07;
    public final ViewPager A08;
    public final C22P A09;
    public final InterfaceC11380iw A0A;
    public final UserSession A0B;
    public final EffectInfoBottomSheetConfiguration A0C;
    public final N75 A0D;
    public final InterfaceC149856oe A0E;
    public final InterfaceC60442pS A0F;
    public final String A0G;
    public final View A0H;
    public final boolean A0J;
    public final Map A0I = AbstractC166987dD.A1G();
    public boolean A03 = false;

    public C55907Ory(Bundle bundle, View view, EffectInfoBottomSheetConfiguration effectInfoBottomSheetConfiguration, N75 n75, InterfaceC149856oe interfaceC149856oe, C50881MeC c50881MeC) {
        InterfaceC11380iw interfaceC11380iw;
        P2T p2t = new P2T(this);
        this.A0F = p2t;
        this.A0D = n75;
        this.A05 = n75.getRootActivity();
        this.A0H = view;
        this.A0C = effectInfoBottomSheetConfiguration;
        this.A0J = effectInfoBottomSheetConfiguration.A06;
        this.A01 = c50881MeC;
        UserSession A0G = AbstractC31171DnF.A0G(bundle);
        this.A0B = A0G;
        this.A0E = interfaceC149856oe;
        int i = effectInfoBottomSheetConfiguration.A00;
        this.A04 = i;
        this.A09 = effectInfoBottomSheetConfiguration.A01;
        this.A0G = effectInfoBottomSheetConfiguration.A03;
        if (bundle.getString("camera_destination") != null) {
            this.A00 = AbstractC171987lT.A00(bundle.getString("camera_destination"));
        }
        if (i != 0) {
            if (i != 1) {
                if (i != 5) {
                    if (i != 8) {
                        if (i != 11) {
                            interfaceC11380iw = XkZ.A0H;
                        } else {
                            interfaceC11380iw = XkZ.A0B;
                        }
                    } else {
                        interfaceC11380iw = XkZ.A08;
                    }
                } else {
                    interfaceC11380iw = XkZ.A0G;
                }
            } else {
                interfaceC11380iw = XkZ.A0D;
            }
        } else {
            interfaceC11380iw = XkZ.A0E;
        }
        this.A0A = interfaceC11380iw;
        O22 o22 = new O22(this);
        ViewPager viewPager = (ViewPager) view.requireViewById(R.id.effect_info_view_pager);
        this.A08 = viewPager;
        viewPager.setAdapter(new C51390Mmv(effectInfoBottomSheetConfiguration.A02, p2t, this.A00, new OUH(A0G, effectInfoBottomSheetConfiguration, o22, this, this, p2t.A00.A0D.A05)));
        this.A07 = view.requireViewById(R.id.left_arrow);
        this.A06 = view.requireViewById(R.id.right_arrow);
        int size = this.A0C.A02.size();
        View view2 = this.A07;
        if (size == 1) {
            view2.setVisibility(8);
            this.A06.setVisibility(8);
        } else {
            ViewOnClickListenerC55457OkB.A01(view2, 14, this);
            ViewOnClickListenerC55457OkB.A01(this.A06, 15, this);
            this.A08.A0J(new WTB(this, 2));
            A02(this);
        }
    }

    public final void A04(String str, String str2, String str3) {
        String str4;
        if (str2 != null) {
            str4 = str2.toUpperCase(Locale.ROOT);
        } else {
            str4 = null;
        }
        String upperCase = str3 != null ? AbstractC166997dE.A0r(this.A05.getResources(), AnonymousClass001.A0R("@", str3), 2131971180).toUpperCase(Locale.ROOT) : null;
        Activity activity = this.A05;
        new LLI(activity, this.A0D, this.A0B, null, StringFormatUtil.formatStrLocaleSafe("https://www.instagram.com/ar/%s&utm_source=qr", str), str, activity.getResources().getString(2131971183), str4, upperCase, this.A0C.A04).A05();
    }

    public final void A05(String str, String str2, boolean z) {
        Activity activity = this.A05;
        C3DN A0r = AbstractC31172DnG.A0r(activity);
        if (A0r != null && ((C3DP) A0r).A0h) {
            A0r.A0R(new C56773PHq(this, A0r, str, str2, z));
            A0r.A0B();
        } else {
            A01(activity, this, str, z);
        }
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return __redex_internal_original_name;
    }

    public static void A00(Activity activity, C55907Ory c55907Ory, String str) {
        UserSession userSession = c55907Ory.A0B;
        C28431Ze A02 = AbstractC31364DqT.A02();
        C31368DqX A01 = AbstractC31402Dr6.A01(userSession, str, "camera_effect_info_sheet_attribution", __redex_internal_original_name);
        A01.A0O = "profile_ar_effects";
        C6XJ A0L = AbstractC31171DnF.A0L(activity, AbstractC37301Gc2.A04(userSession, A02, A01), userSession, ModalActivity.class, "profile");
        A0L.A0J = new int[]{R.anim.right_in, R.anim.left_out, R.anim.left_in, R.anim.right_out};
        A0L.A0C(activity.getApplicationContext());
    }

    public static void A01(Activity activity, C55907Ory c55907Ory, String str, boolean z) {
        EnumC65855TvH enumC65855TvH;
        UserSession userSession = c55907Ory.A0B;
        InterfaceC60442pS interfaceC60442pS = c55907Ory.A0F;
        int i = c55907Ory.A04;
        switch (i) {
            case 0:
            case 1:
            case 4:
                enumC65855TvH = EnumC65855TvH.A03;
                break;
            case 2:
                enumC65855TvH = EnumC65855TvH.A06;
                break;
            case 3:
            case 7:
                enumC65855TvH = EnumC65855TvH.A04;
                break;
            case 5:
                enumC65855TvH = EnumC65855TvH.A07;
                break;
            case 6:
            default:
                AbstractC12120kG.A01("EffectInfoBottomSheetUtil", AnonymousClass001.A0O("Unsupported entry point for reporting: ", i));
                enumC65855TvH = EnumC65855TvH.A03;
                break;
            case 8:
                enumC65855TvH = EnumC65855TvH.A05;
                break;
            case 9:
                enumC65855TvH = EnumC65855TvH.A08;
                break;
        }
        VG2 vg2 = VG2.A04;
        boolean z2 = c55907Ory.A0C.A04;
        C14360o3.A0B(userSession, 0);
        AbstractC167027dH.A13(activity, interfaceC60442pS, str);
        WEz wEz = new WEz(activity, interfaceC60442pS, userSession, enumC65855TvH, vg2, str, z2);
        wEz.A07(EnumC39619HeT.A06);
        wEz.A03 = new C53025Ncx(c55907Ory, str, z);
        WEz.A00(null, wEz);
    }

    public static void A02(C55907Ory c55907Ory) {
        int currentItem = c55907Ory.A08.getCurrentItem();
        boolean z = false;
        boolean A1O = AbstractC167007dF.A1O(currentItem);
        if (currentItem < c55907Ory.A0C.A02.size() - 1) {
            z = true;
        }
        c55907Ory.A07.setEnabled(A1O);
        c55907Ory.A06.setEnabled(z);
    }

    public final void A03() {
        if (!this.A03) {
            this.A03 = true;
            if (this.A0J) {
                FragmentActivity activity = this.A0D.getActivity();
                if (activity != null) {
                    activity.setResult(60572);
                    activity.finish();
                } else {
                    return;
                }
            }
            this.A03 = false;
        }
    }
}
