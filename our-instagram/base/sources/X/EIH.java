package X;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.R;

/* loaded from: classes6.dex */
public final class EIH extends AbstractC59962oe {
    public static final String __redex_internal_original_name = "HallPassDisclosureFragment";
    public EOS A00;
    public String A01;
    public final String A03 = "hall_pass_disclosure";
    public final InterfaceC09390do A02 = AbstractC60492pY.A02(this);

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0017, code lost:
    
        if (r4.A00 == null) goto L6;
     */
    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onViewCreated(android.view.View r5, android.os.Bundle r6) {
        /*
            r4 = this;
            r0 = 0
            X.C14360o3.A0B(r5, r0)
            super.onViewCreated(r5, r6)
            r0 = 2131438222(0x7f0b2a8e, float:1.8498365E38)
            android.view.View r2 = X.AbstractC166997dE.A0R(r5, r0)
            X.64P r2 = (X.C64P) r2
            java.lang.String r0 = r4.A01
            if (r0 == 0) goto L19
            X.EOS r1 = r4.A00
            r0 = 0
            if (r1 != 0) goto L1b
        L19:
            r0 = 8
        L1b:
            r2.setVisibility(r0)
            java.lang.String r3 = r4.A01
            if (r3 == 0) goto L2c
            r1 = 10
            X.Fp6 r0 = new X.Fp6
            r0.<init>(r3, r4, r1)
            r2.setPrimaryActionOnClickListener(r0)
        L2c:
            r0 = 2131428532(0x7f0b04b4, float:1.8478711E38)
            android.view.View r1 = X.AbstractC166997dE.A0S(r5, r0)
            r0 = 49
            X.ViewOnClickListenerC35685FpK.A01(r1, r0, r4)
            X.0do r0 = r4.A02
            com.instagram.user.model.User r0 = X.AbstractC31178DnM.A0U(r0)
            java.lang.Boolean r0 = r0.A0J()
            boolean r3 = X.AbstractC31177DnL.A1b(r0)
            r0 = 2131429233(0x7f0b0771, float:1.8480133E38)
            android.widget.TextView r1 = X.AbstractC167007dF.A0N(r5, r0)
            r0 = 2131954733(0x7f130c2d, float:1.9545974E38)
            r1.setText(r0)
            r0 = 2131429234(0x7f0b0772, float:1.8480135E38)
            android.widget.TextView r1 = X.AbstractC167007dF.A0N(r5, r0)
            r0 = 2131954726(0x7f130c26, float:1.954596E38)
            r1.setText(r0)
            r0 = 2131429235(0x7f0b0773, float:1.8480137E38)
            android.widget.TextView r1 = X.AbstractC167007dF.A0N(r5, r0)
            r0 = 2131954728(0x7f130c28, float:1.9545963E38)
            r1.setText(r0)
            r0 = 2131442084(0x7f0b39a4, float:1.8506198E38)
            android.widget.TextView r1 = X.AbstractC167007dF.A0N(r5, r0)
            r0 = 2131954729(0x7f130c29, float:1.9545965E38)
            if (r3 == 0) goto L7c
            r0 = 2131954730(0x7f130c2a, float:1.9545967E38)
        L7c:
            r1.setText(r0)
            r0 = 2131442085(0x7f0b39a5, float:1.85062E38)
            android.widget.TextView r1 = X.AbstractC167007dF.A0N(r5, r0)
            r0 = 2131954725(0x7f130c25, float:1.9545957E38)
            r1.setText(r0)
            r0 = 2131442086(0x7f0b39a6, float:1.8506202E38)
            android.widget.TextView r1 = X.AbstractC167007dF.A0N(r5, r0)
            r0 = 2131954727(0x7f130c27, float:1.9545961E38)
            r1.setText(r0)
            android.widget.TextView r1 = X.AbstractC31178DnM.A0C(r5)
            r0 = 2131954734(0x7f130c2e, float:1.9545976E38)
            if (r3 == 0) goto La5
            r0 = 2131954731(0x7f130c2b, float:1.954597E38)
        La5:
            r1.setText(r0)
            r0 = 0
            android.content.Context r1 = r4.getContext()
            if (r3 == 0) goto Lbc
            if (r1 == 0) goto Lb8
            r0 = 2131973639(0x7f135607, float:1.958432E38)
        Lb4:
            java.lang.String r0 = r1.getString(r0)
        Lb8:
            r2.setPrimaryActionText(r0)
            return
        Lbc:
            if (r1 == 0) goto Lb8
            r0 = 2131954144(0x7f1309e0, float:1.9544779E38)
            goto Lb4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.EIH.onViewCreated(android.view.View, android.os.Bundle):void");
    }

    @Override // X.AbstractC59962oe
    public final /* bridge */ /* synthetic */ AbstractC18680vv getSession() {
        return AbstractC166987dD.A0n(this.A02);
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return this.A03;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        Context context;
        int A02 = C0f9.A02(256967918);
        super.onCreate(bundle);
        Bundle requireArguments = requireArguments();
        this.A01 = requireArguments.getString("hall_pass_id");
        if (requireArguments.getString("hall_pass_primary_button_text") == null && (context = getContext()) != null) {
            context.getString(2131963440);
        }
        C0f9.A09(1987600819, A02);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(-1564605967);
        C14360o3.A0B(layoutInflater, 0);
        View A0R = AbstractC25226BEj.A0R(layoutInflater, viewGroup, R.layout.layout_hall_pass_disclosure, false);
        C0f9.A09(-1360286757, A02);
        return A0R;
    }
}
