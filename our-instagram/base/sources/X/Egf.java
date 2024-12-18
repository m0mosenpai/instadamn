package X;

import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.widget.TextView;
import com.facebook.R;

/* loaded from: classes6.dex */
public final class Egf extends C32527EUd {
    public final /* synthetic */ ELA A00;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Egf(ELA ela) {
        super(ela.requireContext());
        this.A00 = ela;
    }

    @Override // X.C32527EUd
    public final void A00(EDD edd) {
        int A03 = C0f9.A03(90913056);
        super.A00(edd);
        if (edd.A05) {
            Bundle A0b = AbstractC166987dD.A0b();
            ELA ela = this.A00;
            A0b.putString("lookup_user_input", ela.A08);
            A0b.putString("lookup_email", edd.A01);
            C140966Yy A0N = AbstractC31177DnL.A0N(ela.requireActivity(), ela.A05);
            AbstractC31173DnH.A1B(A0b);
            AbstractC31176DnK.A1A(A0b, new AbstractC59962oe(), A0N);
        } else {
            ELA ela2 = this.A00;
            if (ela2.mView != null) {
                TextView textView = ela2.A04;
                if (textView != null) {
                    textView.setText(ela2.A00);
                }
                AbstractC31176DnK.A1D(ela2.mView, R.id.fragment_user_password_recovery_dont_have_access);
                String string = ela2.getString(2131964532);
                android.net.Uri A032 = AbstractC08820cl.A03(AbstractC63260SgI.A01(ela2.requireActivity(), "http://help.instagram.com/374546259294234/?ref=learn_more"));
                String str = ela2.A09;
                str.getClass();
                SpannableStringBuilder A00 = AnonymousClass773.A00(A032, string, str);
                TextView A0T = AbstractC166997dE.A0T(ela2.mView, R.id.fragment_user_password_recovery_textview_request_sent);
                A0T.setMovementMethod(new LinkMovementMethod());
                A0T.setVisibility(0);
                A0T.setText(A00);
                ELA.A02(ela2, "email");
            }
        }
        C0f9.A0A(-411039545, A03);
    }

    @Override // X.C32527EUd, X.C1P1
    public final void onFail(AbstractC115105If abstractC115105If) {
        int A03 = C0f9.A03(1847689378);
        super.onFail(abstractC115105If);
        ELA ela = this.A00;
        if (ela.mView != null) {
            AbstractC31180DnO.A18(ela.A01);
        }
        C0f9.A0A(719702441, A03);
    }

    @Override // X.C32527EUd, X.C1P1
    public final void onFinish() {
        int A03 = C0f9.A03(21258344);
        ELA ela = this.A00;
        if (ela.mView != null) {
            AbstractC167007dF.A0x(ela.A03);
        }
        C0f9.A0A(2113192307, A03);
    }

    @Override // X.C32527EUd, X.C1P1
    public final void onStart() {
        int A03 = C0f9.A03(1195258352);
        ELA ela = this.A00;
        ela.A00 = 2131961722;
        ela.A03 = ela.requireView().findViewById(R.id.email_spinner);
        ela.A09 = AbstractC13670mt.A06(AbstractC166997dE.A0N(ela).getString(2131961721), ela.getString(2131964532));
        ela.A04 = AbstractC166987dD.A0e(ela.requireView(), R.id.fragment_user_password_recovery_button_email_reset);
        View findViewById = ela.requireView().findViewById(R.id.fragment_user_password_recovery_button_email_reset_container);
        ela.A01 = findViewById;
        if (findViewById != null) {
            findViewById.setEnabled(false);
        }
        View view = ela.A03;
        if (view != null) {
            view.setVisibility(0);
        }
        super.onStart();
        C0f9.A0A(-261932279, A03);
    }

    @Override // X.C32527EUd, X.C1P1
    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        int A03 = C0f9.A03(-1120319958);
        A00((EDD) obj);
        C0f9.A0A(1730331283, A03);
    }
}
