package X;

import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.text.Editable;
import android.text.Spanned;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import com.facebook.R;
import com.facebook.common.callercontext.CallerContext;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.widget.imageview.IgImageView;
import com.instagram.igds.components.button.IgdsButton;

/* loaded from: classes9.dex */
public final class NVm extends N7F {
    public final InterfaceC09390do A00;
    public static final OGZ A02 = new Object();
    public static final String __redex_internal_original_name = "CrosspostingUnifiedOnboardingFragment";
    public static final CallerContext A01 = CallerContext.A01(__redex_internal_original_name);

    public static Spanned A04(Context context) {
        Spanned A00 = AbstractC07900bA.A00(context.getResources(), new Object[0], 2131976126);
        C14360o3.A07(A00);
        return A00;
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "crossposting_unified_onboarding_fragment";
    }

    /* JADX WARN: Code restructure failed: missing block: B:211:0x07b1, code lost:
    
        if (r13 != 2) goto L237;
     */
    /* JADX WARN: Code restructure failed: missing block: B:231:0x088a, code lost:
    
        if (r11.length() != 0) goto L271;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00ee, code lost:
    
        if (X.AbstractC002300n.A0g(r5, r8.getString(2131957276), false) == false) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:263:0x097e, code lost:
    
        if (r11.length() != 0) goto L363;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x010a, code lost:
    
        if (X.AbstractC002300n.A0g(r5, r8.getString(2131957274), false) == false) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:313:0x0a7f, code lost:
    
        if (r16 != 2) goto L343;
     */
    /* JADX WARN: Code restructure failed: missing block: B:336:0x0b0d, code lost:
    
        if (r15 != 2) goto L366;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:165:0x06c1. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:230:0x0886  */
    /* JADX WARN: Removed duplicated region for block: B:262:0x097a  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0190  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x01da  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x027e  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x02d7  */
    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onViewCreated(android.view.View r40, android.os.Bundle r41) {
        /*
            Method dump skipped, instructions count: 2928
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.NVm.onViewCreated(android.view.View, android.os.Bundle):void");
    }

    public static Resources A02(Context context, NVm nVm, String str) {
        A06(EnumC201098ur.SUPPRESS, nVm, str);
        return context.getResources();
    }

    public static final Editable A03(Py8 py8, String str) {
        if (str == null) {
            return null;
        }
        Editable newEditable = Editable.Factory.getInstance().newEditable(str);
        C14360o3.A0A(newEditable);
        py8.A01(newEditable, true);
        return newEditable;
    }

    private final void A07(IgImageView igImageView, BSV bsv, String str, String str2) {
        BSU bsu;
        Integer A04;
        int intValue;
        if (str != null && str2 != null) {
            XNQ A03 = AbstractC65877Tvg.A03(str);
            if (str2.equals("outline")) {
                bsu = BSU.OUTLINE;
            } else {
                bsu = BSU.FILLED;
            }
            if (A03 != null && (A04 = AbstractC65877Tvg.A04(A03, bsv, bsu)) != null && (intValue = A04.intValue()) != 0) {
                AbstractC166997dE.A19(requireContext(), igImageView, intValue);
            }
        }
    }

    /* JADX WARN: Type inference failed for: r0v28, types: [java.lang.Object, X.OFa] */
    public NVm(Bundle bundle, UserSession userSession) {
        this.A04 = userSession;
        C82G valueOf = C82G.valueOf(AbstractC153636vY.A01(bundle, "args_entrypoint"));
        C14360o3.A0B(valueOf, 0);
        this.A02 = valueOf;
        super.A00 = bundle.getInt("args_num_of_views", -1);
        this.A09 = bundle.getBoolean("args_is_after_fbc", false);
        AbstractC50523MSb.A0i(bundle, this);
        this.A01 = bundle.getInt("arg_nux_attempt_qpl_instance_key", 0);
        CallerContext callerContext = NVk.A02;
        NVk A00 = C55088Oal.A00(getSession());
        InterfaceC58075Pp0 interfaceC58075Pp0 = A00.A05;
        if (interfaceC58075Pp0 == null) {
            interfaceC58075Pp0 = new PG5(A00);
            A00.A05 = interfaceC58075Pp0;
        }
        this.A05 = interfaceC58075Pp0;
        C82H valueOf2 = C82H.valueOf(AbstractC31173DnH.A0k(bundle, "args_upsell_variant"));
        C14360o3.A0B(valueOf2, 0);
        this.A03 = valueOf2;
        String string = bundle.getString("args_title");
        String string2 = bundle.getString("args_body_icon_name_1");
        String string3 = bundle.getString("args_body_icon_variant_1");
        String string4 = bundle.getString("args_body_markdown_text_1");
        String string5 = bundle.getString("args_body_icon_name_2");
        String string6 = bundle.getString("args_body_icon_variant_2");
        String string7 = bundle.getString("args_body_markdown_text_2");
        String string8 = bundle.getString("args_body_icon_name_3");
        String string9 = bundle.getString("args_body_icon_variant_3");
        String string10 = bundle.getString("args_body_markdown_text_3");
        String string11 = bundle.getString("args_primary_button_text");
        String string12 = bundle.getString("args_secondary_button_text");
        ?? obj = new Object();
        obj.A0B = string;
        obj.A00 = string2;
        obj.A03 = string3;
        obj.A06 = string4;
        obj.A01 = string5;
        obj.A04 = string6;
        obj.A07 = string7;
        obj.A02 = string8;
        obj.A05 = string9;
        obj.A08 = string10;
        obj.A09 = string11;
        obj.A0A = string12;
        this.A06 = obj;
        this.A00 = AbstractC09440dt.A00(EnumC09460dv.A02, new C43205J8c(this, 14));
    }

    public static int A01(N7F n7f) {
        if (!AbstractC54215Nxt.A00(n7f.getSession()).booleanValue()) {
            return R.id.crossposting_unified_onboarding_first_icon;
        }
        return R.id.crossposting_unified_onboarding_first_icon_v2;
    }

    public static void A05(Fragment fragment, IgdsButton igdsButton, int i) {
        igdsButton.setText(fragment.getString(i));
    }

    public static final void A06(EnumC201098ur enumC201098ur, NVm nVm, String str) {
        UserSession session = nVm.getSession();
        C82G c82g = nVm.A02;
        if (c82g != null) {
            C82H A0A = nVm.A0A();
            C82I A0H = MSW.A0H();
            A0H.A0A(Boolean.valueOf(nVm.A09));
            MSX.A1I(A0H, C196058lv.A08.A04(A01, nVm.getSession()));
            AbstractC50523MSb.A18(A0H, ((N7F) nVm).A00);
            A0H.A06("ig_media_id", nVm.A07);
            AbstractC50523MSb.A19(A0H, "waterfall_id", nVm.A08, str);
            AbstractC201108us.A00(c82g, enumC201098ur, A0A, A0H, session);
            return;
        }
        C14360o3.A0F("entrypoint");
        throw C00O.createAndThrow();
    }

    public static boolean A08(N7F n7f) {
        return AbstractC54216Nxu.A00(n7f.getSession()).booleanValue();
    }

    public static boolean A09(N7F n7f) {
        return AnonymousClass252.A00(n7f.getSession()).A01;
    }

    @Override // X.N7F, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        int A022 = C0f9.A02(-1323778769);
        super.onCreate(bundle);
        CallerContext callerContext = NVk.A02;
        NVk A00 = C55088Oal.A00(getSession());
        InterfaceC58075Pp0 interfaceC58075Pp0 = A00.A05;
        if (interfaceC58075Pp0 == null) {
            interfaceC58075Pp0 = new PG5(A00);
            A00.A05 = interfaceC58075Pp0;
        }
        this.A05 = interfaceC58075Pp0;
        C0f9.A09(449555493, A022);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = C0f9.A02(-1810035335);
        C14360o3.A0B(layoutInflater, 0);
        boolean A08 = A08(this);
        int i = R.layout.crossposting_unified_onboarding_bottom_sheet_upsell;
        if (A08) {
            i = R.layout.crossposting_unified_onboarding_bottom_sheet_upsell_igds;
        }
        View inflate = layoutInflater.inflate(i, viewGroup, false);
        C0f9.A09(-643051839, A022);
        return inflate;
    }
}
