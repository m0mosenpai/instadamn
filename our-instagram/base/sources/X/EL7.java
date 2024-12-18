package X;

import android.graphics.Typeface;
import android.os.Bundle;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.igds.components.headline.IgdsHeadline;
import com.instagram.ui.widget.progressbutton.ProgressButton;
import java.util.regex.Pattern;

/* loaded from: classes6.dex */
public final class EL7 extends AbstractC59962oe implements InterfaceC60072op, InterfaceC60122ou {
    public static final String __redex_internal_original_name = "AccountLinkingIGPCPasswordCreationScreen";
    public UserSession A00;
    public ProgressButton A01;
    public boolean A02;
    public boolean A03;
    public int A04;
    public EditText A05;
    public final TextWatcher A06 = new C35469Fl4(this, 0);
    public volatile boolean A07;

    @Override // X.InterfaceC60122ou
    public final void configureActionBar(InterfaceC56362iU interfaceC56362iU) {
        String string;
        interfaceC56362iU.EkF(true);
        interfaceC56362iU.EkS(true);
        if (this.A02) {
            string = "";
        } else {
            string = requireActivity().getString(2131952070);
        }
        interfaceC56362iU.setTitle(string);
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "account_linking_igpc_password_creation";
    }

    public static void A00(EL7 el7) {
        EnumC72430Xda enumC72430Xda;
        boolean z = el7.A02;
        UserSession userSession = el7.A00;
        if (z) {
            enumC72430Xda = EnumC72430Xda.A02;
        } else {
            enumC72430Xda = EnumC72430Xda.A03;
        }
        String obj = enumC72430Xda.toString();
        AbstractC167017dG.A1N(userSession, obj);
        C35191Ffj.A00(userSession, "create_password_screen_save_button_click", obj);
        C1ON A0G = AbstractC35276FhB.A0G(el7.A00, AbstractC13880nE.A0J(el7.A05));
        C32548EUy.A01(A0G, el7, 0);
        el7.schedule(A0G);
    }

    public static void A01(EL7 el7) {
        boolean z = true;
        el7.A05.setEnabled(!el7.A07);
        el7.A01.setShowProgressBar(el7.A07);
        String A0J = AbstractC13880nE.A0J(el7.A05);
        Pattern pattern = AbstractC13670mt.A01;
        int A0A = AbstractC167007dF.A0A(A0J);
        ProgressButton progressButton = el7.A01;
        if (A0A < 6) {
            z = false;
        }
        progressButton.setEnabled(z);
    }

    @Override // X.InterfaceC60072op
    public final boolean onBackPressed() {
        if (this.A02) {
            return false;
        }
        UserSession userSession = this.A00;
        String obj = EnumC72430Xda.A03.toString();
        AbstractC167017dG.A1N(userSession, obj);
        C35191Ffj.A00(userSession, "create_password_screen_back_button_click", obj);
        AbstractC25226BEj.A1P(this);
        return true;
    }

    @Override // X.AbstractC59962oe
    public final AbstractC18680vv getSession() {
        return this.A00;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        int A02 = C0f9.A02(94403162);
        super.onCreate(bundle);
        Bundle requireArguments = requireArguments();
        this.A03 = requireArguments.getBoolean("is_parent_account");
        this.A02 = requireArguments.getBoolean("is_interstitial");
        this.A00 = AbstractC31176DnK.A0S(this);
        C0f9.A09(-194358046, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        EnumC72430Xda enumC72430Xda;
        int A02 = C0f9.A02(-790842623);
        View inflate = layoutInflater.inflate(R.layout.account_linking_setup_igpc_password_creation_fragment, viewGroup, false);
        IgdsHeadline A0Q = AbstractC31179DnN.A0Q(inflate, R.id.igpc_password_creation_headline);
        UserSession userSession = this.A00;
        C08730cb c08730cb = C17060sy.A01;
        A0Q.setCircularImageUrl(AbstractC31174DnI.A0T(userSession, c08730cb));
        ProgressButton progressButton = (ProgressButton) inflate.requireViewById(R.id.create_button);
        this.A01 = progressButton;
        if (this.A02) {
            progressButton.setText(getString(2131952076));
            A0Q.setHeadline(AbstractC31174DnI.A0w(this, AbstractC31173DnH.A0n(this.A00, c08730cb), 2131952073));
            A0Q.setBody(AbstractC31174DnI.A0w(this, AbstractC31173DnH.A0n(this.A00, c08730cb), 2131952072));
        } else {
            A0Q.setHeadline(AbstractC31174DnI.A0w(this, AbstractC31173DnH.A0n(this.A00, c08730cb), 2131952075));
        }
        Fp1.A00(this.A01, 2, this);
        EditText A0H = AbstractC31173DnH.A0H(inflate, R.id.password_edittext);
        this.A05 = A0H;
        A0H.setTypeface(Typeface.DEFAULT);
        AbstractC31179DnN.A0s(this.A05);
        this.A05.setImeOptions(6);
        this.A05.setInputType(524416);
        C35754Fqr.A00(this.A05, this, 0);
        if (AbstractC31174DnI.A0H(this) != null) {
            this.A04 = AbstractC31174DnI.A0H(this).getAttributes().softInputMode;
            AbstractC31180DnO.A1B(this);
        }
        boolean z = this.A02;
        UserSession userSession2 = this.A00;
        if (z) {
            enumC72430Xda = EnumC72430Xda.A02;
        } else {
            enumC72430Xda = EnumC72430Xda.A03;
        }
        String obj = enumC72430Xda.toString();
        C14360o3.A0B(userSession2, 0);
        C14360o3.A0B(obj, 1);
        C35191Ffj.A00(userSession2, "create_password_screen_shown", obj);
        C0f9.A09(-1943599193, A02);
        return inflate;
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        int A02 = C0f9.A02(677025228);
        super.onDestroyView();
        if (AbstractC31174DnI.A0H(this) != null) {
            AbstractC31174DnI.A0H(this).setSoftInputMode(this.A04);
        }
        this.A05 = null;
        this.A01 = null;
        C0f9.A09(1107148209, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onPause() {
        int A02 = C0f9.A02(985305727);
        super.onPause();
        this.A05.removeTextChangedListener(this.A06);
        if (AbstractC31174DnI.A0H(this) != null) {
            AbstractC31174DnI.A0H(this).setSoftInputMode(this.A04);
        }
        C0f9.A09(-1644344458, A02);
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onResume() {
        int A02 = C0f9.A02(-667830237);
        super.onResume();
        this.A05.addTextChangedListener(this.A06);
        if (AbstractC31174DnI.A0H(this) != null) {
            AbstractC31180DnO.A1B(this);
        }
        C0f9.A09(-964958910, A02);
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        A01(this);
    }
}
