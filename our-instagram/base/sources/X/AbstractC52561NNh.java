package X;

import android.app.Activity;
import android.graphics.Typeface;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.common.ui.text.CustomTypefaceSpan;
import com.instagram.common.ui.widget.imageview.IgImageView;
import com.instagram.igds.components.bottombutton.IgdsBottomButtonLayout;
import java.util.List;

/* renamed from: X.NNh, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public abstract class AbstractC52561NNh extends N4B implements InterfaceC60072op, InterfaceC60122ou {
    public static final String __redex_internal_original_name = "LeadGenThankYouScreenBaseFragment";
    public IgTextView A00;
    public IgTextView A01;
    public IgImageView A02;
    public C57112jm A03;
    public IgdsBottomButtonLayout A04;

    public final CharSequence A07(MWT mwt) {
        int i;
        CharSequence A02 = BHX.A02(this, (C5QE) mwt.A00);
        CharSequence charSequence = A02;
        if (((NOX) A05()).A01) {
            SpannableStringBuilder A0H = AbstractC25225BEi.A0H(A02);
            String str = mwt.A03;
            int A08 = AbstractC001900j.A08(A0H, str, 0, false);
            Typeface A0R = AbstractC167017dG.A0R(requireContext());
            charSequence = A0H;
            charSequence = A0H;
            if (A08 >= 0 && A0R != null) {
                CustomTypefaceSpan customTypefaceSpan = new CustomTypefaceSpan(A0R);
                if (str != null) {
                    i = str.length();
                } else {
                    i = 0;
                }
                A0H.setSpan(customTypefaceSpan, A08, i + A08, 17);
                charSequence = A0H;
            }
        }
        return charSequence;
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        String str;
        C14360o3.A0B(view, 0);
        super.onViewCreated(view, bundle);
        C57112jm c57112jm = this.A03;
        if (c57112jm != null) {
            AbstractC37301Gc2.A0v(view, c57112jm, this);
            this.A02 = AbstractC31172DnG.A0Z(view, R.id.thank_you_screen_icon);
            this.A01 = AbstractC31172DnG.A0X(view, R.id.thank_you_screen_title);
            this.A00 = AbstractC31172DnG.A0X(view, R.id.thank_you_screen_subtitle);
            this.A04 = AbstractC31172DnG.A0j(view, R.id.bottom_button_layout);
            AbstractC31174DnI.A1E(getViewLifecycleOwner(), ((NOX) A05()).A03, new C57743PjW(this, 29), 46);
            OAT oat = ((NOX) A05()).A06;
            boolean z = ((NOX) A05()).A00;
            InterfaceC58268PsC interfaceC58268PsC = oat.A00;
            String str2 = oat.A01;
            if (z) {
                str = "lead_gen_thank_you_screen_with_call_button";
            } else {
                str = "lead_gen_thank_you_screen";
            }
            String str3 = oat.A02;
            Bundle A0b = AbstractC166987dD.A0b();
            if (str3 != null) {
                A0b.putString("form_id", str3);
            }
            InterfaceC58268PsC.A01(A0b, interfaceC58268PsC, str2, str, "consumer_thank_you_screen_impression");
            return;
        }
        C14360o3.A0F("viewpointManager");
        throw C00O.createAndThrow();
    }

    public final void A08() {
        UserSession A00;
        Activity A002;
        if (this instanceof C52577NNx) {
            C52577NNx c52577NNx = (C52577NNx) this;
            A00 = AbstractC51040Mgq.A00(c52577NNx.A09);
            A002 = AbstractC31172DnG.A04(c52577NNx);
        } else {
            C52576NNw c52576NNw = (C52576NNw) this;
            InterfaceC09390do interfaceC09390do = c52576NNw.A00;
            if (((NOX) interfaceC09390do.getValue()).A0E) {
                A00 = AbstractC51040Mgq.A00(interfaceC09390do);
                A002 = AbstractC13110lx.A00(c52576NNw.requireActivity());
            } else {
                C55137Oc5.A01(c52576NNw.requireActivity(), AbstractC51040Mgq.A00(interfaceC09390do), null, ((NOX) interfaceC09390do.getValue()).A0D);
                return;
            }
        }
        AbstractC167017dG.A1N(A00, A002);
        C55772hI.A00(A00).A09(A002, null);
        A002.finish();
    }

    public static String A00(List list, int i) {
        return ((P2Q) list.get(i)).A04;
    }

    @Override // X.InterfaceC60122ou
    public final void configureActionBar(InterfaceC56362iU interfaceC56362iU) {
        AbstractC31180DnO.A1Q(interfaceC56362iU);
        AbstractC31176DnK.A1C(new ViewOnClickListenerC55461OkG(this, 34), AbstractC31176DnK.A0I(), interfaceC56362iU);
    }

    @Override // X.AbstractC59962oe
    public final AbstractC18680vv getSession() {
        return ((NOX) A05()).A04;
    }

    @Override // X.InterfaceC60072op
    public final boolean onBackPressed() {
        A08();
        return true;
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(-565498187);
        C14360o3.A0B(layoutInflater, 0);
        this.A03 = AbstractC31180DnO.A0N();
        View inflate = layoutInflater.inflate(R.layout.lead_gen_fragment_thank_you_screen, viewGroup, false);
        C0f9.A09(844148863, A02);
        return inflate;
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public void onDestroyView() {
        int A02 = C0f9.A02(1072239862);
        super.onDestroyView();
        this.A02 = null;
        this.A01 = null;
        this.A00 = null;
        this.A04 = null;
        C0f9.A09(54005786, A02);
    }
}
