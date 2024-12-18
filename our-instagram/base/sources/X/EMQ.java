package X;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.RectF;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.SpannableStringBuilder;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import com.facebook.R;
import com.facebook.fbreactmodules.datepicker.DatePickerDialogModule;
import com.instagram.react.modules.product.IgReactPurchaseExperienceBridgeModule;
import com.instagram.ui.widget.progressbutton.ProgressButton;
import com.instagram.ui.widget.searchedittext.SearchEditText;

/* loaded from: classes6.dex */
public abstract class EMQ extends AbstractC59962oe implements InterfaceC37221GaW {
    public static final String __redex_internal_original_name = "BaseEmailVerifyFragment";
    public long A00;
    public TextView A01;
    public AbstractC18680vv A02;
    public EVN A03;
    public ProgressButton A04;
    public SearchEditText A05;
    public String A06;

    @Override // X.InterfaceC37221GaW
    public final void Dbn(boolean z) {
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "email_verify";
    }

    public final String A00() {
        SearchEditText searchEditText = this.A05;
        if (searchEditText != null) {
            RectF rectF = AbstractC13880nE.A01;
            return AbstractC31174DnI.A0v(searchEditText);
        }
        return null;
    }

    public final void A01() {
        C1ON A07;
        C1P1 c32977Efj;
        if (this instanceof C32985Efr) {
            if (!requireActivity().isFinishing() && A00() != null && getContext() != null) {
                C31702Dw7.A00(this, AbstractC152476ta.A01(getContext(), this.A02, this.A06, A00()), 3);
                return;
            }
            return;
        }
        if (this instanceof C32984Efq) {
            C35031Fc4.A00.A02(this.A02, "sign_up_email_code_confirmation");
            if (requireActivity().isFinishing() || A00() == null) {
                return;
            }
            Context context = getContext();
            AbstractC18680vv abstractC18680vv = this.A02;
            String str = this.A06;
            String A00 = A00();
            C25621Ms A0M = AbstractC31173DnH.A0M(abstractC18680vv);
            A0M.A0B("accounts/check_confirmation_code/");
            AbstractC31177DnL.A0t(context, A0M);
            A0M.A9s("email", str);
            AbstractC31178DnM.A1K(A0M, IgReactPurchaseExperienceBridgeModule.RN_SHOP_PAY_CODE, A00);
            EV0.A01(this, AbstractC31178DnM.A0I(A0M, C32163EBk.class, FW9.class), 38);
            return;
        }
        C32983Efp c32983Efp = (C32983Efp) this;
        if (c32983Efp.A01) {
            C006802i.A0p.markerStart(725095506);
            C006802i.A0p.markerAnnotate(725095506, "flow", "prod");
            C006802i.A0p.markerAnnotate(725095506, DatePickerDialogModule.ARG_MODE, "email");
            FragmentActivity activity = c32983Efp.getActivity();
            if (activity != null && !activity.isFinishing() && c32983Efp.A00() != null && c32983Efp.getContext() != null) {
                A07 = AbstractC35276FhB.A06(c32983Efp.getContext(), (C07270a1) ((EMQ) c32983Efp).A02, c32983Efp.A00(), c32983Efp.A06, "email", IgReactPurchaseExperienceBridgeModule.RN_SHOP_PAY_CODE);
                c32977Efj = new C32994Egh(c32983Efp.getActivity(), (C07270a1) ((EMQ) c32983Efp).A02, c32983Efp);
                A07.A00 = c32977Efj;
                c32983Efp.schedule(A07);
            }
            C35031Fc4.A00.A02(((EMQ) c32983Efp).A02, "recovery_email_code_confirmation");
        }
        FragmentActivity activity2 = c32983Efp.getActivity();
        if (activity2 != null && !activity2.isFinishing() && c32983Efp.A00() != null && c32983Efp.getContext() != null) {
            A07 = AbstractC35276FhB.A07(c32983Efp.getContext(), (C07270a1) ((EMQ) c32983Efp).A02, c32983Efp.A00, c32983Efp.A00(), null, null, null, null);
            C07270a1 c07270a1 = (C07270a1) ((EMQ) c32983Efp).A02;
            FragmentActivity activity3 = c32983Efp.getActivity();
            c32977Efj = new C32977Efj(activity3, c32983Efp, c07270a1, new G9Q(activity3), c32983Efp, EnumC31713DwI.A1I, C05F.A01, c32983Efp.A06);
            A07.A00 = c32977Efj;
            c32983Efp.schedule(A07);
        }
        C35031Fc4.A00.A02(((EMQ) c32983Efp).A02, "recovery_email_code_confirmation");
    }

    @Override // X.InterfaceC37221GaW
    public final void APP() {
        this.A05.setEnabled(false);
        this.A05.setClearButtonEnabled(false);
    }

    @Override // X.InterfaceC37221GaW
    public final void ARU() {
        this.A05.setEnabled(true);
        this.A05.setClearButtonEnabled(true);
    }

    @Override // X.InterfaceC37221GaW
    public final boolean CbE() {
        SearchEditText searchEditText = this.A05;
        RectF rectF = AbstractC13880nE.A01;
        C14360o3.A0B(searchEditText, 0);
        if (searchEditText.getText().length() >= 6) {
            SearchEditText searchEditText2 = this.A05;
            C14360o3.A0B(searchEditText2, 0);
            if (searchEditText2.getText().length() <= 8) {
                return true;
            }
        }
        return false;
    }

    @Override // X.InterfaceC37221GaW
    public final void DVq() {
        ProgressButton progressButton = this.A04;
        if (progressButton != null && progressButton.isEnabled()) {
            A01();
        }
    }

    public final void A02(int i) {
        C193328hC A0c = AbstractC31176DnK.A0c(this);
        A0c.A0A(i);
        AbstractC31176DnK.A1W(A0c);
    }

    @Override // X.AbstractC59962oe
    public final AbstractC18680vv getSession() {
        return this.A02;
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        int A02 = C0f9.A02(-1939319964);
        super.onCreate(bundle);
        this.A00 = SystemClock.elapsedRealtime();
        C0f9.A09(830269372, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        String obj;
        int A02 = C0f9.A02(-2117284847);
        super.onCreateView(layoutInflater, viewGroup, bundle);
        View inflate = layoutInflater.inflate(R.layout.fragment_verify_new, viewGroup, false);
        SearchEditText searchEditText = (SearchEditText) inflate.requireViewById(R.id.confirmation_code);
        this.A05 = searchEditText;
        searchEditText.setAllowTextSelection(true);
        C35754Fqr.A00(this.A05, this, 6);
        C35251Fgk.A04(this.A05);
        ProgressButton progressButton = (ProgressButton) inflate.findViewById(R.id.next_button);
        this.A04 = progressButton;
        EVN evn = new EVN(this.A05, this.A02, this, progressButton);
        this.A03 = evn;
        registerLifecycleListener(evn);
        this.A01 = AbstractC166997dE.A0T(inflate, R.id.code_verification_instruction);
        String string = getString(2131976594);
        if (this instanceof C32985Efr) {
            obj = AbstractC31173DnH.A0B(AbstractC166997dE.A0N(this), this.A06, 2131972453).toString();
        } else if (this instanceof C32984Efq) {
            obj = AbstractC31173DnH.A0B(AbstractC166997dE.A0N(this), this.A06, 2131972453).toString();
        } else {
            C32983Efp c32983Efp = (C32983Efp) this;
            Resources A0N = AbstractC166997dE.A0N(c32983Efp);
            int i = 2131972455;
            if (c32983Efp.A01) {
                i = 2131974113;
            }
            obj = AbstractC31173DnH.A0B(A0N, c32983Efp.A06, i).toString();
        }
        SpannableStringBuilder A0H = AbstractC25225BEi.A0H(obj);
        AnonymousClass773.A05(A0H, new Em1(AbstractC31174DnI.A0q(getContext(), AbstractC53242c7.A0C(getContext())), this, 19), string);
        AbstractC25227BEk.A11(this.A01);
        this.A01.setHighlightColor(0);
        this.A01.setText(A0H);
        C0f9.A09(-1500013617, A02);
        return inflate;
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        int A02 = C0f9.A02(-164657260);
        super.onDestroyView();
        unregisterLifecycleListener(this.A03);
        this.A03 = null;
        this.A04 = null;
        this.A05 = null;
        this.A01 = null;
        C0f9.A09(1261105545, A02);
    }
}
