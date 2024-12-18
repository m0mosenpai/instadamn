package X;

import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import com.facebook.R;
import com.facebookpay.form.view.FormLayout;
import com.fbpay.hub.form.params.FormDialogParams;
import com.fbpay.hub.form.params.FormLogEvents;
import com.fbpay.hub.form.params.FormParams;
import com.google.common.collect.ImmutableList;

/* renamed from: X.Q7z, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C58769Q7z extends Fragment implements InterfaceC65382TjF, InterfaceC65387TjK {
    public Dialog A00;
    public View A01;
    public View A02;
    public View A03;
    public TextView A04;
    public FormLayout A05;
    public UFM A06;
    public FormParams A07;
    public Q8b A08;
    public C62436SBp A09;
    public WEV A0A;
    public final View.OnClickListener A0C = ViewOnClickListenerC63508Sob.A00(this, 42);
    public final View.OnClickListener A0B = ViewOnClickListenerC63508Sob.A00(this, 43);
    public final InterfaceC71901X9l A0D = new T35(this);

    @Override // X.InterfaceC65387TjK
    public final SOB C8u() {
        boolean z = true;
        FormParams formParams = this.A08.A01;
        String str = formParams.A0A;
        if (str == null) {
            str = getString(formParams.A06);
        }
        if (this.A08.A05.A02() == null || !AbstractC166987dD.A1a(this.A08.A05.A02())) {
            z = false;
        }
        boolean z2 = this.A08.A01.A0B;
        return new SOB(null, this.A0C, getString(2131962347), str, 0, 1, z, z2, true);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onActivityResult(int i, int i2, Intent intent) {
        if (i2 == -1 && i == 0 && intent != null) {
            if (this.A09 == null) {
                this.A09 = new C62436SBp();
            }
            C2FP.A0I();
            throw new C141786av(AnonymousClass001.A0R("An operation is not implemented: ", "add ig implementation"));
        }
    }

    @Override // X.InterfaceC65382TjF
    public final boolean onBackPressed() {
        FormLogEvents formLogEvents;
        Q8b q8b = this.A08;
        FormParams formParams = q8b.A01;
        if (formParams.A00 != null && (formLogEvents = formParams.A02) != null) {
            AbstractC58323PtF.A1J(q8b, formLogEvents.A00);
            return false;
        }
        return false;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        FormLogEvents formLogEvents;
        this.mArguments.getClass();
        WEV wev = new WEV(this, false);
        this.A0A = wev;
        InterfaceC71901X9l interfaceC71901X9l = this.A0D;
        C14360o3.A0B(interfaceC71901X9l, 0);
        wev.A08.add(interfaceC71901X9l);
        Parcelable parcelable = this.mArguments.getParcelable("form_params");
        parcelable.getClass();
        this.A07 = (FormParams) parcelable;
        this.A08 = (Q8b) C63307ShD.A00(this).A00(Q8b.class);
        UFM ufm = (UFM) new C52942bb(this).A00(UFM.class);
        this.A06 = ufm;
        Q8b q8b = this.A08;
        FormParams formParams = this.A07;
        q8b.A01 = formParams;
        q8b.A00 = ufm;
        ImmutableList immutableList = formParams.A07;
        C14360o3.A0B(immutableList, 0);
        C63198Sf0 c63198Sf0 = null;
        ufm.A03(null, immutableList);
        FormDialogParams formDialogParams = q8b.A01.A01;
        if (formDialogParams != null) {
            String str = formDialogParams.A05;
            int i = formDialogParams.A03;
            String str2 = formDialogParams.A04;
            int i2 = formDialogParams.A00;
            int i3 = formDialogParams.A02;
            c63198Sf0 = new C63198Sf0(new DialogInterfaceOnClickListenerC63420Sjy(q8b, 9), null, new DialogInterfaceOnClickListenerC63420Sjy(q8b, 10), null, str2, null, null, str, i2, formDialogParams.A01, 0, 0, 1, i3, i, true);
        }
        q8b.A02 = c63198Sf0;
        C58252li c58252li = q8b.A00.A03;
        C58252li c58252li2 = q8b.A05;
        c58252li2.A0D(c58252li);
        C63627SqZ.A02(c58252li, c58252li2, q8b, 6);
        C58252li c58252li3 = q8b.A04;
        c58252li2.A0D(c58252li3);
        C63627SqZ.A02(c58252li3, c58252li2, q8b, 7);
        C63307ShD.A01().markerEnd(110173292, (short) 2);
        C63307ShD.A01().markerEnd(110175975, (short) 2);
        FormParams formParams2 = q8b.A01;
        if (formParams2.A00 != null && (formLogEvents = formParams2.A02) != null) {
            AbstractC58323PtF.A1J(q8b, formLogEvents.A03);
        }
        if (this.A09 == null) {
            this.A09 = new C62436SBp();
        }
        FormLayout formLayout = (FormLayout) view.requireViewById(R.id.form_container);
        this.A05 = formLayout;
        formLayout.A00(this.A06);
        if (this.A08.A01.A05 != 0) {
            TextView A0T = AbstractC166997dE.A0T(view, R.id.remove_button);
            this.A04 = A0T;
            A0T.setVisibility(0);
            C0fQ.A00(this.A0B, this.A04);
            this.A04.setText(this.A08.A01.A05);
        }
        this.A02 = view.requireViewById(R.id.content_view);
        this.A03 = view.requireViewById(R.id.progress_bar);
        this.A01 = view.requireViewById(R.id.container);
        C63628Sqa.A02(this, this.A06.A02, 69);
        C63628Sqa.A02(this, this.A08.A05, 70);
        C63627SqZ.A00(this, this.A08.A03, 0);
        C63627SqZ.A00(this, this.A08.A07, 1);
        C63627SqZ.A00(this, this.A08.A04, 2);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(-494316168);
        Context context = getContext();
        C2FP.A0E();
        View A0A = AbstractC31172DnG.A0A(AbstractC43593JPy.A0C(context, layoutInflater, R.style.Ig4aFbPay), viewGroup, R.layout.fragment_base_form);
        C0f9.A09(-567236217, A02);
        return A0A;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        int A02 = C0f9.A02(-140598966);
        super.onDestroyView();
        Dialog dialog = this.A00;
        if (dialog != null) {
            dialog.dismiss();
        }
        C0f9.A09(-951795388, A02);
    }
}
