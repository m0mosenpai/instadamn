package X;

import android.app.Activity;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes6.dex */
public final class EK2 extends AbstractC59962oe implements InterfaceC60122ou, InterfaceC65458TkU {
    public static final String __redex_internal_original_name = "ChangeEmailFragment";
    public EditText A00;
    public UserSession A01;
    public C35016Fbp A02;
    public String A03;
    public List A04;
    public boolean A05;
    public int A06;
    public View A07;
    public boolean A08;
    public final Handler A09 = AbstractC167007dF.A0J();

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return AbstractC111324zv.A00(795);
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [X.Ffp, java.lang.Object] */
    @Override // X.InterfaceC60122ou
    public final void configureActionBar(InterfaceC56362iU interfaceC56362iU) {
        ?? obj = new Object();
        C35197Ffp.A02(AbstractC166997dE.A0N(this), obj, 2131955004);
        this.A07 = C31722DwR.A00(new ViewOnClickListenerC31724DwT(this, 51), interfaceC56362iU, obj);
        interfaceC56362iU.setIsLoading(this.A05);
    }

    @Override // X.AbstractC59962oe
    public final AbstractC18680vv getSession() {
        return this.A01;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        int A02 = C0f9.A02(-1024733903);
        super.onCreate(bundle);
        Bundle bundle2 = this.mArguments;
        C18C.A07(bundle2, "Arguments in ChangeEmailFragment cannot be null.");
        this.A01 = AbstractC31176DnK.A0S(this);
        this.A03 = bundle2.getString("send_source");
        this.A02 = new C35016Fbp(this.A01);
        if (TextUtils.isEmpty(bundle2.getString("email"))) {
            registerLifecycleListener(new C60927Rbh(getContext(), this.A01, this));
        }
        C0f9.A09(1752801861, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(-1069353872);
        View inflate = layoutInflater.inflate(R.layout.fragment_change_email, viewGroup, false);
        EditText A0H = AbstractC31173DnH.A0H(inflate, R.id.current_email);
        this.A00 = A0H;
        A0H.setText(requireArguments().getString("email"));
        AbstractC85953sP.A04(this.A00);
        if (TextUtils.isEmpty(this.A00.getText())) {
            ArrayList A01 = AbstractC35100FdB.A01(requireActivity(), this.A01);
            if (!A01.isEmpty()) {
                EditText editText = this.A00;
                editText.getClass();
                AbstractC31171DnF.A15(editText, A01.get(0));
            }
        }
        this.A02.A00.markerEnd(857808781, (short) 2);
        C0f9.A09(815239980, A02);
        return inflate;
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        int A02 = C0f9.A02(-529917209);
        super.onDestroyView();
        this.A00 = null;
        this.A07 = null;
        C0f9.A09(1491523526, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onPause() {
        int A02 = C0f9.A02(-1703926235);
        super.onPause();
        AbstractC917648y.A00(getActivity(), this.A06);
        AbstractC31181DnP.A0r(this);
        AbstractC31171DnF.A16(this);
        C0f9.A09(-533306762, A02);
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onResume() {
        int A02 = C0f9.A02(-1224815508);
        super.onResume();
        this.A06 = requireActivity().getRequestedOrientation();
        AbstractC917648y.A00(getActivity(), -1);
        Activity rootActivity = getRootActivity();
        rootActivity.getClass();
        AbstractC31180DnO.A0x(rootActivity);
        if (!this.A08) {
            EditText editText = this.A00;
            editText.getClass();
            editText.requestFocus();
            AbstractC13880nE.A0R(this.A00);
            this.A08 = true;
        }
        C0f9.A09(-838147777, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStart() {
        int A02 = C0f9.A02(510164754);
        super.onStart();
        AbstractC31179DnN.A1K(this, 8);
        C0f9.A09(-640597981, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStop() {
        int A02 = C0f9.A02(2026017545);
        super.onStop();
        AbstractC31179DnN.A1K(this, 0);
        C0f9.A09(620226136, A02);
    }

    @Override // X.InterfaceC65458TkU
    public final void Dtf(List list) {
        this.A04 = list;
    }
}
