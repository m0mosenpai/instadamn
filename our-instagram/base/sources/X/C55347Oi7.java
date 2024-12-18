package X;

import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;

/* renamed from: X.Oi7, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C55347Oi7 implements TextWatcher {
    public CharSequence A00 = "";
    public final /* synthetic */ C139706Tz A01;

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        String str;
        C14360o3.A0B(editable, 0);
        C139706Tz c139706Tz = this.A01;
        if (c139706Tz.A02().getLineCount() > 3) {
            editable.replace(0, editable.length(), this.A00);
        } else {
            this.A00 = AbstractC25225BEi.A0H(editable);
        }
        boolean z = true;
        boolean z2 = !AbstractC001900j.A0T(AbstractC25228BEl.A1A(AbstractC167007dF.A0g(c139706Tz.A02())));
        if (c139706Tz.A01().getVisibility() == 0) {
            z = false;
        }
        if (z2) {
            c139706Tz.A01().setVisibility(0);
            ConstraintLayout constraintLayout = c139706Tz.A06;
            if (constraintLayout != null) {
                constraintLayout.setVisibility(0);
                if (z) {
                    View A00 = c139706Tz.A00();
                    ConstraintLayout constraintLayout2 = c139706Tz.A05;
                    if (constraintLayout2 != null) {
                        ConstraintLayout constraintLayout3 = c139706Tz.A06;
                        if (constraintLayout3 != null) {
                            C41715Idl.A01(A00, c139706Tz.A01(), constraintLayout2, constraintLayout3);
                        }
                    } else {
                        str = "cardViewWithoutCta";
                        C14360o3.A0F(str);
                        throw C00O.createAndThrow();
                    }
                }
                TextView textView = c139706Tz.A02;
                if (textView != null) {
                    textView.setVisibility(0);
                    return;
                } else {
                    str = "disclaimerTextView";
                    C14360o3.A0F(str);
                    throw C00O.createAndThrow();
                }
            }
            str = "ctaButtonLayout";
            C14360o3.A0F(str);
            throw C00O.createAndThrow();
        }
        c139706Tz.A03();
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public C55347Oi7(C139706Tz c139706Tz) {
        this.A01 = c139706Tz;
    }
}
