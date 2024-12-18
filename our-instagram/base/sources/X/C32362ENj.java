package X;

import android.view.View;
import android.widget.RadioButton;
import com.facebook.R;
import com.instagram.ui.widget.progressbutton.ProgressButton;
import com.instagram.user.model.User;

/* renamed from: X.ENj, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32362ENj extends C53Z {
    public static final String __redex_internal_original_name = "ChangeAccountPrivacyFragment";
    public RadioButton A00;
    public RadioButton A01;
    public ProgressButton A02;
    public C35782FrK A03;

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "account_privacy_nux";
    }

    public static final void A02(C32362ENj c32362ENj) {
        Integer num;
        InterfaceC37264GbH interfaceC37264GbH;
        User A01 = C17060sy.A01.A01(c32362ENj.getSession());
        RadioButton radioButton = c32362ENj.A00;
        if (radioButton != null && radioButton.isChecked()) {
            num = C05F.A0C;
        } else {
            num = C05F.A01;
        }
        A01.A0n(num);
        C1UC activity = c32362ENj.getActivity();
        if ((activity instanceof InterfaceC37264GbH) && (interfaceC37264GbH = (InterfaceC37264GbH) activity) != null) {
            interfaceC37264GbH.CnE(1);
            return;
        }
        C35782FrK c35782FrK = c32362ENj.A03;
        if (c35782FrK == null) {
            return;
        }
        c35782FrK.A01();
    }

    private final void A00(View view) {
        AbstractC166997dE.A19(requireContext(), AbstractC31176DnK.A0D(view, R.id.icon), R.drawable.instagram_unlock_pano_outline_24);
        AbstractC167007dF.A0N(view, R.id.title_view).setText(2131952097);
        AbstractC167007dF.A0N(view, R.id.content_view).setText(2131952098);
        this.A01 = (RadioButton) view.requireViewById(R.id.radio_button);
        ViewOnClickListenerC35667Fp2.A00(view, 52, this);
    }

    private final void A01(View view, boolean z) {
        AbstractC166997dE.A19(requireContext(), AbstractC31176DnK.A0D(view, R.id.icon), R.drawable.instagram_lock_pano_outline_24);
        AbstractC167007dF.A0N(view, R.id.title_view).setText(2131952095);
        AbstractC167007dF.A0N(view, R.id.content_view).setText(2131952096);
        RadioButton radioButton = (RadioButton) view.requireViewById(R.id.radio_button);
        this.A00 = radioButton;
        if (radioButton != null) {
            radioButton.setChecked(z);
        }
        ViewOnClickListenerC35667Fp2.A00(view, 51, this);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0084  */
    @Override // androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.view.View onCreateView(android.view.LayoutInflater r9, android.view.ViewGroup r10, android.os.Bundle r11) {
        /*
            r8 = this;
            r0 = 167319104(0x9f91640, float:5.9965493E-33)
            int r2 = X.C0f9.A02(r0)
            r4 = 0
            X.C14360o3.A0B(r9, r4)
            r0 = 2131628958(0x7f0e139e, float:1.8885223E38)
            android.view.View r3 = X.AbstractC31172DnG.A0A(r9, r10, r0)
            X.C14360o3.A07(r3)
            r5 = 2131628064(0x7f0e1020, float:1.888341E38)
            android.view.ViewGroup r0 = X.AbstractC31180DnO.A05(r3)
            r1 = 1
            r9.inflate(r5, r0, r1)
            com.instagram.common.session.UserSession r0 = r8.getSession()
            com.instagram.user.model.User r5 = X.AbstractC166997dE.A0Y(r0)
            java.lang.Integer r6 = r5.A0M()
            java.lang.Integer r0 = X.C05F.A01
            r7 = 0
            if (r6 != r0) goto Laa
            r1 = 0
            X.17P r0 = r5.A03
            java.lang.Boolean r0 = r0.Bj7()
            if (r0 == 0) goto Laa
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto Laa
            r0 = 2131443157(0x7f0b3dd5, float:1.8508374E38)
            android.view.View r0 = X.AbstractC166997dE.A0S(r3, r0)
            r8.A00(r0)
            r0 = 2131428950(0x7f0b0656, float:1.8479559E38)
            android.view.View r0 = X.AbstractC166997dE.A0S(r3, r0)
            r8.A01(r0, r4)
        L54:
            r0 = 2131438644(0x7f0b2c34, float:1.849922E38)
            android.view.View r0 = r3.requireViewById(r0)
            com.instagram.ui.widget.progressbutton.ProgressButton r0 = (com.instagram.ui.widget.progressbutton.ProgressButton) r0
            r8.A02 = r0
            if (r0 == 0) goto L64
            r0.setEnabled(r1)
        L64:
            com.instagram.ui.widget.progressbutton.ProgressButton r4 = r8.A02
            if (r4 == 0) goto L6d
            r0 = 70
            X.ViewOnClickListenerC31591DuJ.A00(r4, r0, r8, r5)
        L6d:
            com.instagram.common.session.UserSession r4 = r8.getSession()
            java.lang.String r0 = "nux_account_privacy"
            X.C35203Ffv.A01(r4, r0)
            com.instagram.common.session.UserSession r6 = r8.getSession()
            com.instagram.common.session.UserSession r0 = r8.getSession()
            java.lang.String r5 = r0.userId
            android.widget.RadioButton r0 = r8.A00
            if (r0 == 0) goto L88
            boolean r7 = r0.isChecked()
        L88:
            X.AbstractC167007dF.A1K(r6, r5)
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r7)
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            java.lang.String r0 = "android_pbd_nux_impression"
            X.AbstractC34357FCz.A00(r6, r4, r1, r5, r0)
            com.instagram.common.session.UserSession r1 = r8.getSession()
            X.FrK r0 = new X.FrK
            r0.<init>(r8, r8, r1)
            r8.A03 = r0
            r0 = 753774414(0x2cedaf4e, float:6.755408E-12)
            X.C0f9.A09(r0, r2)
            return r3
        Laa:
            r0 = 2131443157(0x7f0b3dd5, float:1.8508374E38)
            android.view.View r0 = X.AbstractC166997dE.A0S(r3, r0)
            r8.A01(r0, r1)
            r0 = 2131428950(0x7f0b0656, float:1.8479559E38)
            android.view.View r0 = X.AbstractC166997dE.A0S(r3, r0)
            r8.A00(r0)
            goto L54
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C32362ENj.onCreateView(android.view.LayoutInflater, android.view.ViewGroup, android.os.Bundle):android.view.View");
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        int A02 = C0f9.A02(1662567347);
        super.onDestroyView();
        this.A00 = null;
        this.A01 = null;
        this.A02 = null;
        C0f9.A09(-1538899994, A02);
    }
}
