package X;

import android.content.Context;
import android.view.Window;
import android.view.autofill.AutofillManager;
import android.widget.CheckBox;
import android.widget.EditText;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.nux.aymh.viewmodel.AymhViewModel;
import com.instagram.nux.aymh.viewmodel.AymhViewModel$login$2;
import com.instagram.ui.widget.progressbutton.ProgressButton;

/* loaded from: classes6.dex */
public final class EL3 extends AbstractC59962oe implements InterfaceC60072op, InterfaceC60122ou {
    public static final String __redex_internal_original_name = "AymhPasswordInputFragment";
    public CheckBox A00;
    public EditText A01;
    public ImageUrl A02;
    public IgTextView A03;
    public C34669FPe A04;
    public ProgressButton A05;
    public String A06;
    public String A07;
    public boolean A08;
    public int A09;
    public AymhViewModel A0A;
    public Integer A0B;
    public final InterfaceC09390do A0C = AbstractC25235BEs.A0t(this, 39);
    public final Runnable A0D = new RunnableC36848GLv(this);

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "aymh_password_input";
    }

    public static final void A00(EL3 el3) {
        el3.A09++;
        String str = el3.A07;
        String A01 = AbstractC31189DnY.A01();
        if (str != null) {
            EditText editText = el3.A01;
            if (editText == null) {
                A01 = "password";
            } else {
                UQE uqe = new UQE(str, AbstractC167007dF.A0g(editText), 7);
                ImageUrl imageUrl = el3.A02;
                String str2 = el3.A07;
                if (str2 != null) {
                    E6N e6n = new E6N(imageUrl, C05F.A1I, uqe, str2, el3.A06);
                    AymhViewModel aymhViewModel = el3.A0A;
                    if (aymhViewModel == null) {
                        A01 = "aymhViewModel";
                    } else {
                        C07270a1 c07270a1 = (C07270a1) el3.A0C.getValue();
                        boolean z = el3.A08;
                        Integer num = el3.A0B;
                        int i = el3.A09;
                        C14360o3.A0B(c07270a1, 1);
                        AbstractC31172DnG.A0F(aymhViewModel.A0A).A0B(new FJP(2131974091, true));
                        AbstractC166987dD.A1Z(new AymhViewModel$login$2(c07270a1, e6n, aymhViewModel, num, null, i, z), AbstractC141776au.A00(aymhViewModel));
                        return;
                    }
                }
            }
        }
        C14360o3.A0F(A01);
        throw C00O.createAndThrow();
    }

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return AbstractC166987dD.A0n(this.A0C);
    }

    @Override // X.InterfaceC60072op
    public final boolean onBackPressed() {
        AutofillManager autofillManager;
        Context context = getContext();
        if (context != null && (autofillManager = (AutofillManager) context.getSystemService(AutofillManager.class)) != null) {
            autofillManager.cancel();
        }
        C35159Ff1.A00(AbstractC166987dD.A0o(this.A0C), null, null, null, "aymh_password_input");
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:66:0x0152  */
    @Override // androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.view.View onCreateView(android.view.LayoutInflater r9, android.view.ViewGroup r10, android.os.Bundle r11) {
        /*
            Method dump skipped, instructions count: 523
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.EL3.onCreateView(android.view.LayoutInflater, android.view.ViewGroup, android.os.Bundle):android.view.View");
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onResume() {
        Window window;
        int A02 = C0f9.A02(-1788136075);
        super.onResume();
        EditText editText = this.A01;
        if (editText == null) {
            C14360o3.A0F("password");
            throw C00O.createAndThrow();
        }
        editText.postDelayed(this.A0D, 200L);
        FragmentActivity activity = getActivity();
        if (activity != null && (window = activity.getWindow()) != null) {
            window.setFlags(8192, 8192);
        }
        C0f9.A09(2068392418, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStop() {
        Window window;
        int A02 = C0f9.A02(1658294903);
        super.onStop();
        FragmentActivity activity = getActivity();
        if (activity != null && (window = activity.getWindow()) != null) {
            window.clearFlags(8192);
        }
        C0f9.A09(-402301346, A02);
    }

    @Override // X.InterfaceC60122ou
    public final void configureActionBar(InterfaceC56362iU interfaceC56362iU) {
        AbstractC25235BEs.A1H(interfaceC56362iU);
    }
}
