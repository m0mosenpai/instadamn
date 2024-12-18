package X;

import android.content.res.Resources;
import android.text.SpannableString;
import android.view.View;
import android.widget.TextView;
import com.facebook.R;

/* renamed from: X.Gwm, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38526Gwm extends C3OO implements JGF {
    public InterfaceC63932vE A00;
    public C41222IMn A01;
    public final View A02;
    public final View A03;
    public final View A04;
    public final View A05;
    public final TextView A06;
    public final TextView A07;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C38526Gwm(View view) {
        super(view);
        C14360o3.A0B(view, 1);
        this.A05 = AbstractC166997dE.A0S(view, R.id.question_text_container);
        this.A07 = AbstractC31178DnM.A0C(view);
        this.A06 = AbstractC167007dF.A0N(view, R.id.question_indicator);
        this.A04 = AbstractC166997dE.A0S(view, R.id.forward_arrow);
        this.A02 = AbstractC166997dE.A0S(view, R.id.back_arrow);
        this.A03 = AbstractC166997dE.A0S(view, R.id.dismiss_button);
    }

    public final void A00(C41232IMx c41232IMx, IMQ imq) {
        View view;
        C14360o3.A0B(c41232IMx, 1);
        boolean z = c41232IMx.A01;
        int i = 8;
        View view2 = this.A02;
        if (!z) {
            view2.setVisibility(AbstractC167007dF.A05(imq.A01));
            view = this.A04;
            if (imq.A00 > imq.A01 && !c41232IMx.A01 && c41232IMx.A01()) {
                i = 0;
            }
        } else {
            view2.setVisibility(8);
            view = this.A04;
        }
        view.setVisibility(i);
    }

    public final void A01(C41232IMx c41232IMx, IMQ imq) {
        int A00;
        if (!c41232IMx.A01 && this.A01 != null) {
            TextView textView = this.A06;
            textView.setVisibility(0);
            Resources A0M = AbstractC25228BEl.A0M(textView);
            Integer valueOf = Integer.valueOf(imq.A01 + 1);
            C41222IMn c41222IMn = this.A01;
            if (c41222IMn != null) {
                if (c41222IMn.A01 != null) {
                    A00 = c41222IMn.A00() - 1;
                } else {
                    A00 = c41222IMn.A00();
                }
                String string = A0M.getString(2131971224, AbstractC25228BEl.A1Z(valueOf, A00));
                C14360o3.A07(string);
                textView.setText(AbstractC166997dE.A10(C1Q2.A02(), string));
                return;
            }
            throw AbstractC166987dD.A14("Required value was null.");
        }
        this.A06.setVisibility(4);
    }

    @Override // X.JGF
    public final void Dcl(IMQ imq, int i) {
        C41222IMn c41222IMn = this.A01;
        if (c41222IMn != null && this.A00 != null) {
            C41232IMx A01 = c41222IMn.A01(imq.A01);
            if (1 == i) {
                TextView textView = this.A07;
                H6V h6v = A01.A03;
                String str = h6v.A07;
                if (str != null) {
                    SpannableString spannableString = new SpannableString(str);
                    spannableString.setSpan(new C77373dN(), 0, spannableString.length(), 0);
                    textView.setText(spannableString);
                    C41222IMn c41222IMn2 = this.A01;
                    if (c41222IMn2 != null) {
                        Boolean bool = c41222IMn2.A00.A01;
                        if (bool != null && bool.booleanValue()) {
                            A01(A01, imq);
                        }
                        C41222IMn c41222IMn3 = this.A01;
                        if (c41222IMn3 != null) {
                            Boolean bool2 = c41222IMn3.A00.A02;
                            if (bool2 != null && bool2.booleanValue()) {
                                A00(A01, imq);
                            }
                            InterfaceC63932vE interfaceC63932vE = this.A00;
                            if (interfaceC63932vE != null) {
                                String str2 = h6v.A03;
                                if (str2 != null) {
                                    interfaceC63932vE.Dce(str2, imq.A01);
                                    return;
                                }
                                throw AbstractC166987dD.A14("Required value was null.");
                            }
                            throw AbstractC166987dD.A14("Required value was null.");
                        }
                        throw AbstractC166987dD.A14("Required value was null.");
                    }
                    throw AbstractC166987dD.A14("Required value was null.");
                }
                throw AbstractC166987dD.A14("Required value was null.");
            }
            C41222IMn c41222IMn4 = this.A01;
            if (c41222IMn4 != null) {
                Boolean bool3 = c41222IMn4.A00.A02;
                if (bool3 == null || !bool3.booleanValue()) {
                    return;
                }
                A00(A01, imq);
                return;
            }
            throw AbstractC166987dD.A14("Required value was null.");
        }
    }
}
